package com.shakeel.controller;

import com.shakeel.readFile;
import com.shakeel.model.MarCompoundMolT;
import com.shakeel.repository.MarCompoundMolRepository;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by shakeelosmani on 24/12/16.
 */

@Controller
public class ProductsController {
    
    @Autowired
    MarCompoundMolRepository marcomprepo;


    @RequestMapping("/")
    public String index(){    	
    	return "index";
    }

 /*   @RequestMapping("/load")
    @ResponseBody
    public String load() throws FileNotFoundException{
    	MarCompoundMolT mocha = new MarCompoundMolT();
        
        readFile rf = new readFile();
        
		String compound = rf.getFileWithNewLine("src/main/resources/static/mol/pippoA.sdf");
	    
        mocha.setStrId(2);
		mocha.setCompound(compound);
		mocha.setMolformula("C10H20");
		
		marcomprepo.save(mocha);

		String compound1 = rf.getFileWithNewLine("src/main/resources/static/mol/pippoR.sdf");
	    
        mocha.setStrId(3);
		mocha.setCompound(compound1);
		mocha.setMolformula("C10Br20");		
		marcomprepo.save(mocha);

    	
    	return "Done";
    }*/

    @RequestMapping("/molfile/{id}")
    @ResponseBody
    public String molfile(@PathVariable Long id) {
    	MarCompoundMolT mm = marcomprepo.findById(id).get();
    	String mol = mm.getCompound().replaceAll("(\n)", "\\\r\\\n");
    	return mol;
    }

    @RequestMapping("/molfileJsmol/{id}")
    @ResponseBody
    public String molfileJsmol(@PathVariable Long id) {
    	MarCompoundMolT mm = marcomprepo.findById(id).get();
    	String mol = mm.getCompound();
    	return mol;
    }

    @RequestMapping("/molecule")
    public String molecule(){
        return "molecule";
    }

    @RequestMapping("/jsmol")
    public String molJsmol(){
        return "mar";
    }

    @RequestMapping("/molecules/{id}")
    public String molecules(@PathVariable Long id, Model model) throws IOException{
    	MarCompoundMolT mm = marcomprepo.findById(id).get();
	    String str = mm.getCompound();
//	    String fileLocation = new File("").getAbsolutePath() + "\\" + "pippo.sdf";
	    try{
	        File file = new File("src/main/resources/static/mol/pippo.sdf");


	        if (!file.exists()) {
	            file.createNewFile();
	        }

	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);

	        bw.write(str);
	        bw.flush();     //  ORIGINAL
	        bw.close();
	        }
	        catch(Exception e){
	            System.out.println("Exception occured in molecules()");
	            e.printStackTrace();
	        }

	    
	    
	    
/*	    String fileLocation = new File("src/main/resources/static/mol/pippo.sdf");
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
	    
	    		
	    // in produzione scrive in D:\gdeci\eclipse-workspace\springMarOracle\target
	    	// se non c'è la directory si arrabbia
	    // in eclipse scrive in D:\gdeci\eclipse-workspace\springMarOracle
	    writer.write(str);
	     
	    writer.close();
	  */  
	    
	    model.addAttribute("molecules", mm);
        return "molecules";
    }

}

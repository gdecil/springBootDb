package com.shakeel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
	public String getFileWithNewLine(String filePath) throws FileNotFoundException {
		String compound = "";
	    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
	    
	    StringBuffer stringBuffer = new StringBuffer();
	    String line = null;
	   
	    try {
			while((line =bufferedReader.readLine())!=null){
   
			 stringBuffer.append(line).append("\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    compound =stringBuffer.toString();			
	    System.out.println(compound);
		return compound;
	}

}

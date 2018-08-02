package com.shakeel.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.time.LocalTime;


/**
 * The persistent class for the MAR_COMPOUND_MOL_T database table.
 * 
 */
/**
 * @author gdeci
 *
 */
@Entity
@Table(name="MAR_COMPOUND_MOL_T")
@NamedQuery(name="MarCompoundMolT.findAll", query="SELECT m FROM MarCompoundMolT m")
public class MarCompoundMolT implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STR_ID")
	private long strId;

	@Lob
	private String compound;

	@Column(name="INSERT_BY")
	private String insertBy;

	@Column(name="INSERT_BY_MACHINE")
	private String insertByMachine;

	@Column(name="INSERT_BY_OS")
	private String insertByOs;

//	@Type(type = "org.hibernate.Date")
	//	@Column(name="INSERT_DATE")
	//private LocalTime insertDate;

	@Column(name="MODIFY_BY")
	private String modifyBy;

	@Column(name="MODIFY_BY_MACHINE")
	private String modifyByMachine;

	@Column(name="MODIFY_BY_OS")
	private String modifyByOs;

	//@Column(name="MODIFY_DATE")
	//private LocalTime modifyDate;

	private String molformula;

	private BigDecimal molweight;

	@Column(name="MW_MONOISOTOPIC")
	private BigDecimal mwMonoisotopic;

	@Column(name="MW_MONOISOTOPIC_NOSALT")
	private BigDecimal mwMonoisotopicNosalt;

	@Column(name="NUM_NITROGEN")
	private BigDecimal numNitrogen;

	@Column(name="TEC_NOSALT")
	private String tecNosalt;

	@Column(name="TEC_SALT")
	private String tecSalt;

	public MarCompoundMolT() {
	}

	public long getStrId() {
		return this.strId;
	}

	public void setStrId(long strId) {
		this.strId = strId;
	}

	public String getCompound() {
		return this.compound;
	}

	public void setCompound(String compound) {
		this.compound = compound;
	}

	public String getInsertBy() {
		return this.insertBy;
	}

	public void setInsertBy(String insertBy) {
		this.insertBy = insertBy;
	}

	public String getInsertByMachine() {
		return this.insertByMachine;
	}

	public void setInsertByMachine(String insertByMachine) {
		this.insertByMachine = insertByMachine;
	}

	public String getInsertByOs() {
		return this.insertByOs;
	}

	public void setInsertByOs(String insertByOs) {
		this.insertByOs = insertByOs;
	}

//	public Object getInsertDate() {
//		return this.insertDate;
//	}
//
//	public void setInsertDate(LocalTime insertDate) {
//		this.insertDate = insertDate;
//	}

	public String getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getModifyByMachine() {
		return this.modifyByMachine;
	}

	public void setModifyByMachine(String modifyByMachine) {
		this.modifyByMachine = modifyByMachine;
	}

	public String getModifyByOs() {
		return this.modifyByOs;
	}

	public void setModifyByOs(String modifyByOs) {
		this.modifyByOs = modifyByOs;
	}

//	public Object getModifyDate() {
//		return this.modifyDate;
//	}
//
//	public void setModifyDate(LocalTime modifyDate) {
//		this.modifyDate = modifyDate;
//	}

	public String getMolformula() {
		return this.molformula;
	}

	public void setMolformula(String molformula) {
		this.molformula = molformula;
	}

	public BigDecimal getMolweight() {
		return this.molweight;
	}

	public void setMolweight(BigDecimal molweight) {
		this.molweight = molweight;
	}

	public BigDecimal getMwMonoisotopic() {
		return this.mwMonoisotopic;
	}

	public void setMwMonoisotopic(BigDecimal mwMonoisotopic) {
		this.mwMonoisotopic = mwMonoisotopic;
	}

	public BigDecimal getMwMonoisotopicNosalt() {
		return this.mwMonoisotopicNosalt;
	}

	public void setMwMonoisotopicNosalt(BigDecimal mwMonoisotopicNosalt) {
		this.mwMonoisotopicNosalt = mwMonoisotopicNosalt;
	}

	public BigDecimal getNumNitrogen() {
		return this.numNitrogen;
	}

	public void setNumNitrogen(BigDecimal numNitrogen) {
		this.numNitrogen = numNitrogen;
	}

	public String getTecNosalt() {
		return this.tecNosalt;
	}

	public void setTecNosalt(String tecNosalt) {
		this.tecNosalt = tecNosalt;
	}

	public String getTecSalt() {
		return this.tecSalt;
	}

	public void setTecSalt(String tecSalt) {
		this.tecSalt = tecSalt;
	}

}
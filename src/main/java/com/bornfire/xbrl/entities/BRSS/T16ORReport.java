package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T16_OR_GRIVANCE_RELATED_TABLE")
public class T16ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_GRIEVANCES_BY_BANK;
	private BigDecimal	A1_GRIEVANCES_BY_CLIENTS;
	private String	A2_PRODUCT;
	private BigDecimal	A2_GRIEVANCES_BY_BANK;
	private BigDecimal	A2_GRIEVANCES_BY_CLIENTS;
	private String	A3_PRODUCT;
	private BigDecimal	A3_GRIEVANCES_BY_BANK;
	private BigDecimal	A3_GRIEVANCES_BY_CLIENTS;
	private String	A4_PRODUCT;
	private BigDecimal	A4_GRIEVANCES_BY_BANK;
	private BigDecimal	A4_GRIEVANCES_BY_CLIENTS;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	private String	ENTITY_FLG;
	private String	DEL_FLG;
	private String	MODIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_TIME;
	private String	QTR_FLG;
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_GRIEVANCES_BY_BANK() {
		return A1_GRIEVANCES_BY_BANK;
	}
	public void setA1_GRIEVANCES_BY_BANK(BigDecimal a1_GRIEVANCES_BY_BANK) {
		A1_GRIEVANCES_BY_BANK = a1_GRIEVANCES_BY_BANK;
	}
	public BigDecimal getA1_GRIEVANCES_BY_CLIENTS() {
		return A1_GRIEVANCES_BY_CLIENTS;
	}
	public void setA1_GRIEVANCES_BY_CLIENTS(BigDecimal a1_GRIEVANCES_BY_CLIENTS) {
		A1_GRIEVANCES_BY_CLIENTS = a1_GRIEVANCES_BY_CLIENTS;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public BigDecimal getA2_GRIEVANCES_BY_BANK() {
		return A2_GRIEVANCES_BY_BANK;
	}
	public void setA2_GRIEVANCES_BY_BANK(BigDecimal a2_GRIEVANCES_BY_BANK) {
		A2_GRIEVANCES_BY_BANK = a2_GRIEVANCES_BY_BANK;
	}
	public BigDecimal getA2_GRIEVANCES_BY_CLIENTS() {
		return A2_GRIEVANCES_BY_CLIENTS;
	}
	public void setA2_GRIEVANCES_BY_CLIENTS(BigDecimal a2_GRIEVANCES_BY_CLIENTS) {
		A2_GRIEVANCES_BY_CLIENTS = a2_GRIEVANCES_BY_CLIENTS;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_GRIEVANCES_BY_BANK() {
		return A3_GRIEVANCES_BY_BANK;
	}
	public void setA3_GRIEVANCES_BY_BANK(BigDecimal a3_GRIEVANCES_BY_BANK) {
		A3_GRIEVANCES_BY_BANK = a3_GRIEVANCES_BY_BANK;
	}
	public BigDecimal getA3_GRIEVANCES_BY_CLIENTS() {
		return A3_GRIEVANCES_BY_CLIENTS;
	}
	public void setA3_GRIEVANCES_BY_CLIENTS(BigDecimal a3_GRIEVANCES_BY_CLIENTS) {
		A3_GRIEVANCES_BY_CLIENTS = a3_GRIEVANCES_BY_CLIENTS;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_GRIEVANCES_BY_BANK() {
		return A4_GRIEVANCES_BY_BANK;
	}
	public void setA4_GRIEVANCES_BY_BANK(BigDecimal a4_GRIEVANCES_BY_BANK) {
		A4_GRIEVANCES_BY_BANK = a4_GRIEVANCES_BY_BANK;
	}
	public BigDecimal getA4_GRIEVANCES_BY_CLIENTS() {
		return A4_GRIEVANCES_BY_CLIENTS;
	}
	public void setA4_GRIEVANCES_BY_CLIENTS(BigDecimal a4_GRIEVANCES_BY_CLIENTS) {
		A4_GRIEVANCES_BY_CLIENTS = a4_GRIEVANCES_BY_CLIENTS;
	}
	public String getREPORT_CODE() {
		return REPORT_CODE;
	}
	public void setREPORT_CODE(String rEPORT_CODE) {
		REPORT_CODE = rEPORT_CODE;
	}
	public String getREPORT_NAME() {
		return REPORT_NAME;
	}
	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public Date getREPORT_DUE_DATE() {
		return REPORT_DUE_DATE;
	}
	public void setREPORT_DUE_DATE(Date rEPORT_DUE_DATE) {
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
	}
	public Date getREP_SUBMIT_DATE() {
		return REP_SUBMIT_DATE;
	}
	public void setREP_SUBMIT_DATE(Date rEP_SUBMIT_DATE) {
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
	}
	public Date getREP_PERIOD_FROM() {
		return REP_PERIOD_FROM;
	}
	public void setREP_PERIOD_FROM(Date rEP_PERIOD_FROM) {
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
	}
	public Date getREP_PERIOD_TO() {
		return REP_PERIOD_TO;
	}
	public void setREP_PERIOD_TO(Date rEP_PERIOD_TO) {
		REP_PERIOD_TO = rEP_PERIOD_TO;
	}
	public String getREP_FREQ() {
		return REP_FREQ;
	}
	public void setREP_FREQ(String rEP_FREQ) {
		REP_FREQ = rEP_FREQ;
	}
	public String getNIL_REPORT_FLG() {
		return NIL_REPORT_FLG;
	}
	public void setNIL_REPORT_FLG(String nIL_REPORT_FLG) {
		NIL_REPORT_FLG = nIL_REPORT_FLG;
	}
	public String getARCH_FLG() {
		return ARCH_FLG;
	}
	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
	}
	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}
	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}
	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}
	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Date getVERIFY_TIME() {
		return VERIFY_TIME;
	}
	public void setVERIFY_TIME(Date vERIFY_TIME) {
		VERIFY_TIME = vERIFY_TIME;
	}
	public String getQTR_FLG() {
		return QTR_FLG;
	}
	public void setQTR_FLG(String qTR_FLG) {
		QTR_FLG = qTR_FLG;
	}
	public T16ORReport(String a1_PRODUCT, BigDecimal a1_GRIEVANCES_BY_BANK, BigDecimal a1_GRIEVANCES_BY_CLIENTS,
			String a2_PRODUCT, BigDecimal a2_GRIEVANCES_BY_BANK, BigDecimal a2_GRIEVANCES_BY_CLIENTS, String a3_PRODUCT,
			BigDecimal a3_GRIEVANCES_BY_BANK, BigDecimal a3_GRIEVANCES_BY_CLIENTS, String a4_PRODUCT,
			BigDecimal a4_GRIEVANCES_BY_BANK, BigDecimal a4_GRIEVANCES_BY_CLIENTS, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG,
			String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER,
			Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_GRIEVANCES_BY_BANK = a1_GRIEVANCES_BY_BANK;
		A1_GRIEVANCES_BY_CLIENTS = a1_GRIEVANCES_BY_CLIENTS;
		A2_PRODUCT = a2_PRODUCT;
		A2_GRIEVANCES_BY_BANK = a2_GRIEVANCES_BY_BANK;
		A2_GRIEVANCES_BY_CLIENTS = a2_GRIEVANCES_BY_CLIENTS;
		A3_PRODUCT = a3_PRODUCT;
		A3_GRIEVANCES_BY_BANK = a3_GRIEVANCES_BY_BANK;
		A3_GRIEVANCES_BY_CLIENTS = a3_GRIEVANCES_BY_CLIENTS;
		A4_PRODUCT = a4_PRODUCT;
		A4_GRIEVANCES_BY_BANK = a4_GRIEVANCES_BY_BANK;
		A4_GRIEVANCES_BY_CLIENTS = a4_GRIEVANCES_BY_CLIENTS;
		REPORT_CODE = rEPORT_CODE;
		REPORT_NAME = rEPORT_NAME;
		REPORT_DATE = rEPORT_DATE;
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
		REP_PERIOD_TO = rEP_PERIOD_TO;
		REP_FREQ = rEP_FREQ;
		NIL_REPORT_FLG = nIL_REPORT_FLG;
		ARCH_FLG = aRCH_FLG;
		ENTITY_FLG = eNTITY_FLG;
		DEL_FLG = dEL_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
		QTR_FLG = qTR_FLG;
	}
	public T16ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}

  
}

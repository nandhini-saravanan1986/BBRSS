package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T26_OR_OUTSOURCING_ARRANGEMENT_TABLE")
public class T26ORReport {
	private String	A1_PRODUCT;
	private String	A1A_DESCRPTION_OF_OUTSO_ACTIV;
	private String	A1B_CLASSIFICATION_OF_OUT;
	private String	A1C_DATA_OF_APPROVAL;
	private String	A1D_COMMENCEMENT_DATA_;
	private String	A1E_NAME_OF_SERVICE;
	private String	A1F_NO_OF_SERVICE_LEVEL;
	private String	A1G_ADDRESS_OF_SERVICE;
	private String	A1H_COUNTRY_OF_LOCATION;
	private String	A1I_COUNTRY_OF_ACTIV;
	private String	A1J_CLOUD_BASED_ACTIV;
	private String	A1K_CATEGORY_OF_ACTIV;
	private String	A1L_LOCATION_OF_PRIMARY;
	private String	A1M_LOCATION_OF_SECONDARY;
	private String	A1N_LOCATION_OF_DATA_CENTRE;
	private String	A1O_NO_OF_SLA_NOT_LAST_36_MONTHS;
	private String	A1P_NO_OF_SLA_LAST_36_MONTHS;
	private String	A1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	private String	A1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
	private String	A2_PRODUCT;
	private String	A2A_DESCRPTION_OF_OUTSO_ACTIV;
	private String	A2B_CLASSIFICATION_OF_OUT;
	private String	A2C_DATA_OF_APPROVAL;
	private String	A2D_COMMENCEMENT_DATA_;
	private String	A2E_NAME_OF_SERVICE;
	private String	A2F_NO_OF_SERVICE_LEVEL;
	private String	A2G_ADDRESS_OF_SERVICE;
	private String	A2H_COUNTRY_OF_LOCATION;
	private String	A2I_COUNTRY_OF_ACTIV;
	private String	A2J_CLOUD_BASED_ACTIV;
	private String	A2K_CATEGORY_OF_ACTIV;
	private String	A2L_LOCATION_OF_PRIMARY;
	private String	A2M_LOCATION_OF_SECONDARY;
	private String	A2N_LOCATION_OF_DATA_CENTRE;
	private String	A2O_NO_OF_SLA_NOT_LAST_36_MONTHS;
	private String	A2P_NO_OF_SLA_LAST_36_MONTHS;
	private String	A2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	private String	A2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
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
	public String getA1A_DESCRPTION_OF_OUTSO_ACTIV() {
		return A1A_DESCRPTION_OF_OUTSO_ACTIV;
	}
	public void setA1A_DESCRPTION_OF_OUTSO_ACTIV(String a1a_DESCRPTION_OF_OUTSO_ACTIV) {
		A1A_DESCRPTION_OF_OUTSO_ACTIV = a1a_DESCRPTION_OF_OUTSO_ACTIV;
	}
	public String getA1B_CLASSIFICATION_OF_OUT() {
		return A1B_CLASSIFICATION_OF_OUT;
	}
	public void setA1B_CLASSIFICATION_OF_OUT(String a1b_CLASSIFICATION_OF_OUT) {
		A1B_CLASSIFICATION_OF_OUT = a1b_CLASSIFICATION_OF_OUT;
	}
	public String getA1C_DATA_OF_APPROVAL() {
		return A1C_DATA_OF_APPROVAL;
	}
	public void setA1C_DATA_OF_APPROVAL(String a1c_DATA_OF_APPROVAL) {
		A1C_DATA_OF_APPROVAL = a1c_DATA_OF_APPROVAL;
	}
	public String getA1D_COMMENCEMENT_DATA_() {
		return A1D_COMMENCEMENT_DATA_;
	}
	public void setA1D_COMMENCEMENT_DATA_(String a1d_COMMENCEMENT_DATA_) {
		A1D_COMMENCEMENT_DATA_ = a1d_COMMENCEMENT_DATA_;
	}
	public String getA1E_NAME_OF_SERVICE() {
		return A1E_NAME_OF_SERVICE;
	}
	public void setA1E_NAME_OF_SERVICE(String a1e_NAME_OF_SERVICE) {
		A1E_NAME_OF_SERVICE = a1e_NAME_OF_SERVICE;
	}
	public String getA1F_NO_OF_SERVICE_LEVEL() {
		return A1F_NO_OF_SERVICE_LEVEL;
	}
	public void setA1F_NO_OF_SERVICE_LEVEL(String a1f_NO_OF_SERVICE_LEVEL) {
		A1F_NO_OF_SERVICE_LEVEL = a1f_NO_OF_SERVICE_LEVEL;
	}
	public String getA1G_ADDRESS_OF_SERVICE() {
		return A1G_ADDRESS_OF_SERVICE;
	}
	public void setA1G_ADDRESS_OF_SERVICE(String a1g_ADDRESS_OF_SERVICE) {
		A1G_ADDRESS_OF_SERVICE = a1g_ADDRESS_OF_SERVICE;
	}
	public String getA1H_COUNTRY_OF_LOCATION() {
		return A1H_COUNTRY_OF_LOCATION;
	}
	public void setA1H_COUNTRY_OF_LOCATION(String a1h_COUNTRY_OF_LOCATION) {
		A1H_COUNTRY_OF_LOCATION = a1h_COUNTRY_OF_LOCATION;
	}
	public String getA1I_COUNTRY_OF_ACTIV() {
		return A1I_COUNTRY_OF_ACTIV;
	}
	public void setA1I_COUNTRY_OF_ACTIV(String a1i_COUNTRY_OF_ACTIV) {
		A1I_COUNTRY_OF_ACTIV = a1i_COUNTRY_OF_ACTIV;
	}
	public String getA1J_CLOUD_BASED_ACTIV() {
		return A1J_CLOUD_BASED_ACTIV;
	}
	public void setA1J_CLOUD_BASED_ACTIV(String a1j_CLOUD_BASED_ACTIV) {
		A1J_CLOUD_BASED_ACTIV = a1j_CLOUD_BASED_ACTIV;
	}
	public String getA1K_CATEGORY_OF_ACTIV() {
		return A1K_CATEGORY_OF_ACTIV;
	}
	public void setA1K_CATEGORY_OF_ACTIV(String a1k_CATEGORY_OF_ACTIV) {
		A1K_CATEGORY_OF_ACTIV = a1k_CATEGORY_OF_ACTIV;
	}
	public String getA1L_LOCATION_OF_PRIMARY() {
		return A1L_LOCATION_OF_PRIMARY;
	}
	public void setA1L_LOCATION_OF_PRIMARY(String a1l_LOCATION_OF_PRIMARY) {
		A1L_LOCATION_OF_PRIMARY = a1l_LOCATION_OF_PRIMARY;
	}
	public String getA1M_LOCATION_OF_SECONDARY() {
		return A1M_LOCATION_OF_SECONDARY;
	}
	public void setA1M_LOCATION_OF_SECONDARY(String a1m_LOCATION_OF_SECONDARY) {
		A1M_LOCATION_OF_SECONDARY = a1m_LOCATION_OF_SECONDARY;
	}
	public String getA1N_LOCATION_OF_DATA_CENTRE() {
		return A1N_LOCATION_OF_DATA_CENTRE;
	}
	public void setA1N_LOCATION_OF_DATA_CENTRE(String a1n_LOCATION_OF_DATA_CENTRE) {
		A1N_LOCATION_OF_DATA_CENTRE = a1n_LOCATION_OF_DATA_CENTRE;
	}
	public String getA1O_NO_OF_SLA_NOT_LAST_36_MONTHS() {
		return A1O_NO_OF_SLA_NOT_LAST_36_MONTHS;
	}
	public void setA1O_NO_OF_SLA_NOT_LAST_36_MONTHS(String a1o_NO_OF_SLA_NOT_LAST_36_MONTHS) {
		A1O_NO_OF_SLA_NOT_LAST_36_MONTHS = a1o_NO_OF_SLA_NOT_LAST_36_MONTHS;
	}
	public String getA1P_NO_OF_SLA_LAST_36_MONTHS() {
		return A1P_NO_OF_SLA_LAST_36_MONTHS;
	}
	public void setA1P_NO_OF_SLA_LAST_36_MONTHS(String a1p_NO_OF_SLA_LAST_36_MONTHS) {
		A1P_NO_OF_SLA_LAST_36_MONTHS = a1p_NO_OF_SLA_LAST_36_MONTHS;
	}
	public String getA1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT() {
		return A1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	}
	public void setA1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT(String a1q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT) {
		A1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT = a1q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	}
	public String getA1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER() {
		return A1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
	}
	public void setA1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER(String a1r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER) {
		A1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER = a1r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA2A_DESCRPTION_OF_OUTSO_ACTIV() {
		return A2A_DESCRPTION_OF_OUTSO_ACTIV;
	}
	public void setA2A_DESCRPTION_OF_OUTSO_ACTIV(String a2a_DESCRPTION_OF_OUTSO_ACTIV) {
		A2A_DESCRPTION_OF_OUTSO_ACTIV = a2a_DESCRPTION_OF_OUTSO_ACTIV;
	}
	public String getA2B_CLASSIFICATION_OF_OUT() {
		return A2B_CLASSIFICATION_OF_OUT;
	}
	public void setA2B_CLASSIFICATION_OF_OUT(String a2b_CLASSIFICATION_OF_OUT) {
		A2B_CLASSIFICATION_OF_OUT = a2b_CLASSIFICATION_OF_OUT;
	}
	public String getA2C_DATA_OF_APPROVAL() {
		return A2C_DATA_OF_APPROVAL;
	}
	public void setA2C_DATA_OF_APPROVAL(String a2c_DATA_OF_APPROVAL) {
		A2C_DATA_OF_APPROVAL = a2c_DATA_OF_APPROVAL;
	}
	public String getA2D_COMMENCEMENT_DATA_() {
		return A2D_COMMENCEMENT_DATA_;
	}
	public void setA2D_COMMENCEMENT_DATA_(String a2d_COMMENCEMENT_DATA_) {
		A2D_COMMENCEMENT_DATA_ = a2d_COMMENCEMENT_DATA_;
	}
	public String getA2E_NAME_OF_SERVICE() {
		return A2E_NAME_OF_SERVICE;
	}
	public void setA2E_NAME_OF_SERVICE(String a2e_NAME_OF_SERVICE) {
		A2E_NAME_OF_SERVICE = a2e_NAME_OF_SERVICE;
	}
	public String getA2F_NO_OF_SERVICE_LEVEL() {
		return A2F_NO_OF_SERVICE_LEVEL;
	}
	public void setA2F_NO_OF_SERVICE_LEVEL(String a2f_NO_OF_SERVICE_LEVEL) {
		A2F_NO_OF_SERVICE_LEVEL = a2f_NO_OF_SERVICE_LEVEL;
	}
	public String getA2G_ADDRESS_OF_SERVICE() {
		return A2G_ADDRESS_OF_SERVICE;
	}
	public void setA2G_ADDRESS_OF_SERVICE(String a2g_ADDRESS_OF_SERVICE) {
		A2G_ADDRESS_OF_SERVICE = a2g_ADDRESS_OF_SERVICE;
	}
	public String getA2H_COUNTRY_OF_LOCATION() {
		return A2H_COUNTRY_OF_LOCATION;
	}
	public void setA2H_COUNTRY_OF_LOCATION(String a2h_COUNTRY_OF_LOCATION) {
		A2H_COUNTRY_OF_LOCATION = a2h_COUNTRY_OF_LOCATION;
	}
	public String getA2I_COUNTRY_OF_ACTIV() {
		return A2I_COUNTRY_OF_ACTIV;
	}
	public void setA2I_COUNTRY_OF_ACTIV(String a2i_COUNTRY_OF_ACTIV) {
		A2I_COUNTRY_OF_ACTIV = a2i_COUNTRY_OF_ACTIV;
	}
	public String getA2J_CLOUD_BASED_ACTIV() {
		return A2J_CLOUD_BASED_ACTIV;
	}
	public void setA2J_CLOUD_BASED_ACTIV(String a2j_CLOUD_BASED_ACTIV) {
		A2J_CLOUD_BASED_ACTIV = a2j_CLOUD_BASED_ACTIV;
	}
	public String getA2K_CATEGORY_OF_ACTIV() {
		return A2K_CATEGORY_OF_ACTIV;
	}
	public void setA2K_CATEGORY_OF_ACTIV(String a2k_CATEGORY_OF_ACTIV) {
		A2K_CATEGORY_OF_ACTIV = a2k_CATEGORY_OF_ACTIV;
	}
	public String getA2L_LOCATION_OF_PRIMARY() {
		return A2L_LOCATION_OF_PRIMARY;
	}
	public void setA2L_LOCATION_OF_PRIMARY(String a2l_LOCATION_OF_PRIMARY) {
		A2L_LOCATION_OF_PRIMARY = a2l_LOCATION_OF_PRIMARY;
	}
	public String getA2M_LOCATION_OF_SECONDARY() {
		return A2M_LOCATION_OF_SECONDARY;
	}
	public void setA2M_LOCATION_OF_SECONDARY(String a2m_LOCATION_OF_SECONDARY) {
		A2M_LOCATION_OF_SECONDARY = a2m_LOCATION_OF_SECONDARY;
	}
	public String getA2N_LOCATION_OF_DATA_CENTRE() {
		return A2N_LOCATION_OF_DATA_CENTRE;
	}
	public void setA2N_LOCATION_OF_DATA_CENTRE(String a2n_LOCATION_OF_DATA_CENTRE) {
		A2N_LOCATION_OF_DATA_CENTRE = a2n_LOCATION_OF_DATA_CENTRE;
	}
	public String getA2O_NO_OF_SLA_NOT_LAST_36_MONTHS() {
		return A2O_NO_OF_SLA_NOT_LAST_36_MONTHS;
	}
	public void setA2O_NO_OF_SLA_NOT_LAST_36_MONTHS(String a2o_NO_OF_SLA_NOT_LAST_36_MONTHS) {
		A2O_NO_OF_SLA_NOT_LAST_36_MONTHS = a2o_NO_OF_SLA_NOT_LAST_36_MONTHS;
	}
	public String getA2P_NO_OF_SLA_LAST_36_MONTHS() {
		return A2P_NO_OF_SLA_LAST_36_MONTHS;
	}
	public void setA2P_NO_OF_SLA_LAST_36_MONTHS(String a2p_NO_OF_SLA_LAST_36_MONTHS) {
		A2P_NO_OF_SLA_LAST_36_MONTHS = a2p_NO_OF_SLA_LAST_36_MONTHS;
	}
	public String getA2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT() {
		return A2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	}
	public void setA2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT(String a2q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT) {
		A2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT = a2q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
	}
	public String getA2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER() {
		return A2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
	}
	public void setA2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER(String a2r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER) {
		A2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER = a2r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
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
	public T26ORReport(String a1_PRODUCT, String a1a_DESCRPTION_OF_OUTSO_ACTIV, String a1b_CLASSIFICATION_OF_OUT,
			String a1c_DATA_OF_APPROVAL, String a1d_COMMENCEMENT_DATA_, String a1e_NAME_OF_SERVICE,
			String a1f_NO_OF_SERVICE_LEVEL, String a1g_ADDRESS_OF_SERVICE, String a1h_COUNTRY_OF_LOCATION,
			String a1i_COUNTRY_OF_ACTIV, String a1j_CLOUD_BASED_ACTIV, String a1k_CATEGORY_OF_ACTIV,
			String a1l_LOCATION_OF_PRIMARY, String a1m_LOCATION_OF_SECONDARY, String a1n_LOCATION_OF_DATA_CENTRE,
			String a1o_NO_OF_SLA_NOT_LAST_36_MONTHS, String a1p_NO_OF_SLA_LAST_36_MONTHS,
			String a1q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT, String a1r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER,
			String a2_PRODUCT, String a2a_DESCRPTION_OF_OUTSO_ACTIV, String a2b_CLASSIFICATION_OF_OUT,
			String a2c_DATA_OF_APPROVAL, String a2d_COMMENCEMENT_DATA_, String a2e_NAME_OF_SERVICE,
			String a2f_NO_OF_SERVICE_LEVEL, String a2g_ADDRESS_OF_SERVICE, String a2h_COUNTRY_OF_LOCATION,
			String a2i_COUNTRY_OF_ACTIV, String a2j_CLOUD_BASED_ACTIV, String a2k_CATEGORY_OF_ACTIV,
			String a2l_LOCATION_OF_PRIMARY, String a2m_LOCATION_OF_SECONDARY, String a2n_LOCATION_OF_DATA_CENTRE,
			String a2o_NO_OF_SLA_NOT_LAST_36_MONTHS, String a2p_NO_OF_SLA_LAST_36_MONTHS,
			String a2q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT, String a2r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG,
			String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER,
			String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1A_DESCRPTION_OF_OUTSO_ACTIV = a1a_DESCRPTION_OF_OUTSO_ACTIV;
		A1B_CLASSIFICATION_OF_OUT = a1b_CLASSIFICATION_OF_OUT;
		A1C_DATA_OF_APPROVAL = a1c_DATA_OF_APPROVAL;
		A1D_COMMENCEMENT_DATA_ = a1d_COMMENCEMENT_DATA_;
		A1E_NAME_OF_SERVICE = a1e_NAME_OF_SERVICE;
		A1F_NO_OF_SERVICE_LEVEL = a1f_NO_OF_SERVICE_LEVEL;
		A1G_ADDRESS_OF_SERVICE = a1g_ADDRESS_OF_SERVICE;
		A1H_COUNTRY_OF_LOCATION = a1h_COUNTRY_OF_LOCATION;
		A1I_COUNTRY_OF_ACTIV = a1i_COUNTRY_OF_ACTIV;
		A1J_CLOUD_BASED_ACTIV = a1j_CLOUD_BASED_ACTIV;
		A1K_CATEGORY_OF_ACTIV = a1k_CATEGORY_OF_ACTIV;
		A1L_LOCATION_OF_PRIMARY = a1l_LOCATION_OF_PRIMARY;
		A1M_LOCATION_OF_SECONDARY = a1m_LOCATION_OF_SECONDARY;
		A1N_LOCATION_OF_DATA_CENTRE = a1n_LOCATION_OF_DATA_CENTRE;
		A1O_NO_OF_SLA_NOT_LAST_36_MONTHS = a1o_NO_OF_SLA_NOT_LAST_36_MONTHS;
		A1P_NO_OF_SLA_LAST_36_MONTHS = a1p_NO_OF_SLA_LAST_36_MONTHS;
		A1Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT = a1q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
		A1R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER = a1r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
		A2_PRODUCT = a2_PRODUCT;
		A2A_DESCRPTION_OF_OUTSO_ACTIV = a2a_DESCRPTION_OF_OUTSO_ACTIV;
		A2B_CLASSIFICATION_OF_OUT = a2b_CLASSIFICATION_OF_OUT;
		A2C_DATA_OF_APPROVAL = a2c_DATA_OF_APPROVAL;
		A2D_COMMENCEMENT_DATA_ = a2d_COMMENCEMENT_DATA_;
		A2E_NAME_OF_SERVICE = a2e_NAME_OF_SERVICE;
		A2F_NO_OF_SERVICE_LEVEL = a2f_NO_OF_SERVICE_LEVEL;
		A2G_ADDRESS_OF_SERVICE = a2g_ADDRESS_OF_SERVICE;
		A2H_COUNTRY_OF_LOCATION = a2h_COUNTRY_OF_LOCATION;
		A2I_COUNTRY_OF_ACTIV = a2i_COUNTRY_OF_ACTIV;
		A2J_CLOUD_BASED_ACTIV = a2j_CLOUD_BASED_ACTIV;
		A2K_CATEGORY_OF_ACTIV = a2k_CATEGORY_OF_ACTIV;
		A2L_LOCATION_OF_PRIMARY = a2l_LOCATION_OF_PRIMARY;
		A2M_LOCATION_OF_SECONDARY = a2m_LOCATION_OF_SECONDARY;
		A2N_LOCATION_OF_DATA_CENTRE = a2n_LOCATION_OF_DATA_CENTRE;
		A2O_NO_OF_SLA_NOT_LAST_36_MONTHS = a2o_NO_OF_SLA_NOT_LAST_36_MONTHS;
		A2P_NO_OF_SLA_LAST_36_MONTHS = a2p_NO_OF_SLA_LAST_36_MONTHS;
		A2Q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT = a2q_NO_OF_SKILLED_OUTSOURCING_ARRANGEMENT;
		A2R_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER = a2r_NO_OF_SKILLED_OUTSOURCING_SERVICE_PROVIDER;
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
	public T26ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
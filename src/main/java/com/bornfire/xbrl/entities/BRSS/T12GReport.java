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
@Table(name = "T12G_DOMESTIC_INWARD_REMITTANCE")
public class T12GReport {

	private String	C1A_CUR_BMUR30K_PRODUCT;
	private BigDecimal	C1A_CUR_BMUR30K_LOW_TRAN_COUNT;
	private BigDecimal	C1A_CUR_BMUR30K_LOW_TRAN_AMT;
	private BigDecimal	C1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C1A_CUR_BMUR30K_MEDUM_TRAN_AMT;
	private BigDecimal	C1A_CUR_BMUR30K_HIGH_TRAN_COUNT;
	private BigDecimal	C1A_CUR_BMUR30K_HIGH_TRAN_AMT;
	private String	C2A_CUR_MUR30_60K_PRODUCT;
	private BigDecimal	C2A_CUR_MUR30_60K_LOW_TRAN_COUNT;
	private BigDecimal	C2A_CUR_MUR30_60K_LOW_TRAN_AMT;
	private BigDecimal	C2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C2A_CUR_MUR30_60K_MEDUM_TRAN_AMT;
	private BigDecimal	C2A_CUR_MUR30_60K_HIGH_TRAN_COUNT;
	private BigDecimal	C2A_CUR_MUR30_60K_HIGH_TRAN_AMT;
	private String	C3A_CUR_MUR60_150K_PRODUCT;
	private BigDecimal	C3A_CUR_MUR60_150K_LOW_TRAN_COUNT;
	private BigDecimal	C3A_CUR_MUR60_150K_LOW_TRAN_AMT;
	private BigDecimal	C3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C3A_CUR_MUR60_150K_MEDUM_TRAN_AMT;
	private BigDecimal	C3A_CUR_MUR60_150K_HIGH_TRAN_COUNT;
	private BigDecimal	C3A_CUR_MUR60_150K_HIGH_TRAN_AMT;
	private String	C4A_CUR_MUR150_300K_PRODUCT;
	private BigDecimal	C4A_CUR_MUR150_300K_LOW_TRAN_COUNT;
	private BigDecimal	C4A_CUR_MUR150_300K_LOW_TRAN_AMT;
	private BigDecimal	C4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C4A_CUR_MUR150_300K_MEDUM_TRAN_AMT;
	private BigDecimal	C4A_CUR_MUR150_300K_HIGH_TRAN_COUNT;
	private BigDecimal	C4A_CUR_MUR150_300K_HIGH_TRAN_AMT;
	private String	C5A_CUR_MUR300_500K_PRODUCT;
	private BigDecimal	C5A_CUR_MUR300_500K_LOW_TRAN_COUNT;
	private BigDecimal	C5A_CUR_MUR300_500K_LOW_TRAN_AMT;
	private BigDecimal	C5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C5A_CUR_MUR300_500K_MEDUM_TRAN_AMT;
	private BigDecimal	C5A_CUR_MUR300_500K_HIGH_TRAN_COUNT;
	private BigDecimal	C5A_CUR_MUR300_500K_HIGH_TRAN_AMT;
	private String	C6A_CUR_MUR500_1000K_PRODUCT;
	private BigDecimal	C6A_CUR_MUR500_1000K_LOW_TRAN_COUNT;
	private BigDecimal	C6A_CUR_MUR500_1000K_LOW_TRAN_AMT;
	private BigDecimal	C6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT;
	private BigDecimal	C6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT;
	private BigDecimal	C6A_CUR_MUR500_1000K_HIGH_TRAN_AMT;
	private String	C7A_CUR_MUR1000_1500K_PRODUCT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_LOW_TRAN_AMT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT;
	private BigDecimal	C7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT;
	private String	C8A_CUR_MUR1500_3000K_PRODUCT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_LOW_TRAN_AMT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT;
	private BigDecimal	C8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT;
	private String	C9A_CUR_MURMORE3000K_PRODUCT;
	private BigDecimal	C9A_CUR_MURMORE3000K_LOW_TRAN_COUNT;
	private BigDecimal	C9A_CUR_MURMORE3000K_LOW_TRAN_AMT;
	private BigDecimal	C9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT;
	private BigDecimal	C9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT;
	private BigDecimal	C9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT;
	private BigDecimal	C9A_CUR_MURMORE3000K_HIGH_TRAN_AMT;
	private String	C10_TOTAL_PRODUCT;
	private BigDecimal	C10_TOTAL_LOW_TRAN_COUNT;
	private BigDecimal	C10_TOTAL_LOW_TRAN_AMT;
	private BigDecimal	C10_TOTAL_MEDIUM_TRAN_COUNT;
	private BigDecimal	C10_TOTAL_MEDUM_TRAN_AMT;
	private BigDecimal	C10_TOTAL_HIGH_TRAN_COUNT;
	private BigDecimal	C10_TOTAL_HIGH_TRAN_AMT;
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
	public String getC1A_CUR_BMUR30K_PRODUCT() {
		return C1A_CUR_BMUR30K_PRODUCT;
	}
	public void setC1A_CUR_BMUR30K_PRODUCT(String c1a_CUR_BMUR30K_PRODUCT) {
		C1A_CUR_BMUR30K_PRODUCT = c1a_CUR_BMUR30K_PRODUCT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_LOW_TRAN_COUNT() {
		return C1A_CUR_BMUR30K_LOW_TRAN_COUNT;
	}
	public void setC1A_CUR_BMUR30K_LOW_TRAN_COUNT(BigDecimal c1a_CUR_BMUR30K_LOW_TRAN_COUNT) {
		C1A_CUR_BMUR30K_LOW_TRAN_COUNT = c1a_CUR_BMUR30K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_LOW_TRAN_AMT() {
		return C1A_CUR_BMUR30K_LOW_TRAN_AMT;
	}
	public void setC1A_CUR_BMUR30K_LOW_TRAN_AMT(BigDecimal c1a_CUR_BMUR30K_LOW_TRAN_AMT) {
		C1A_CUR_BMUR30K_LOW_TRAN_AMT = c1a_CUR_BMUR30K_LOW_TRAN_AMT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT() {
		return C1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT;
	}
	public void setC1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT(BigDecimal c1a_CUR_BMUR30K_MEDIUM_TRAN_COUNT) {
		C1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT = c1a_CUR_BMUR30K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_MEDUM_TRAN_AMT() {
		return C1A_CUR_BMUR30K_MEDUM_TRAN_AMT;
	}
	public void setC1A_CUR_BMUR30K_MEDUM_TRAN_AMT(BigDecimal c1a_CUR_BMUR30K_MEDUM_TRAN_AMT) {
		C1A_CUR_BMUR30K_MEDUM_TRAN_AMT = c1a_CUR_BMUR30K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_HIGH_TRAN_COUNT() {
		return C1A_CUR_BMUR30K_HIGH_TRAN_COUNT;
	}
	public void setC1A_CUR_BMUR30K_HIGH_TRAN_COUNT(BigDecimal c1a_CUR_BMUR30K_HIGH_TRAN_COUNT) {
		C1A_CUR_BMUR30K_HIGH_TRAN_COUNT = c1a_CUR_BMUR30K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC1A_CUR_BMUR30K_HIGH_TRAN_AMT() {
		return C1A_CUR_BMUR30K_HIGH_TRAN_AMT;
	}
	public void setC1A_CUR_BMUR30K_HIGH_TRAN_AMT(BigDecimal c1a_CUR_BMUR30K_HIGH_TRAN_AMT) {
		C1A_CUR_BMUR30K_HIGH_TRAN_AMT = c1a_CUR_BMUR30K_HIGH_TRAN_AMT;
	}
	public String getC2A_CUR_MUR30_60K_PRODUCT() {
		return C2A_CUR_MUR30_60K_PRODUCT;
	}
	public void setC2A_CUR_MUR30_60K_PRODUCT(String c2a_CUR_MUR30_60K_PRODUCT) {
		C2A_CUR_MUR30_60K_PRODUCT = c2a_CUR_MUR30_60K_PRODUCT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_LOW_TRAN_COUNT() {
		return C2A_CUR_MUR30_60K_LOW_TRAN_COUNT;
	}
	public void setC2A_CUR_MUR30_60K_LOW_TRAN_COUNT(BigDecimal c2a_CUR_MUR30_60K_LOW_TRAN_COUNT) {
		C2A_CUR_MUR30_60K_LOW_TRAN_COUNT = c2a_CUR_MUR30_60K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_LOW_TRAN_AMT() {
		return C2A_CUR_MUR30_60K_LOW_TRAN_AMT;
	}
	public void setC2A_CUR_MUR30_60K_LOW_TRAN_AMT(BigDecimal c2a_CUR_MUR30_60K_LOW_TRAN_AMT) {
		C2A_CUR_MUR30_60K_LOW_TRAN_AMT = c2a_CUR_MUR30_60K_LOW_TRAN_AMT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT() {
		return C2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT;
	}
	public void setC2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT(BigDecimal c2a_CUR_MUR30_60K_MEDIUM_TRAN_COUNT) {
		C2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT = c2a_CUR_MUR30_60K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_MEDUM_TRAN_AMT() {
		return C2A_CUR_MUR30_60K_MEDUM_TRAN_AMT;
	}
	public void setC2A_CUR_MUR30_60K_MEDUM_TRAN_AMT(BigDecimal c2a_CUR_MUR30_60K_MEDUM_TRAN_AMT) {
		C2A_CUR_MUR30_60K_MEDUM_TRAN_AMT = c2a_CUR_MUR30_60K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_HIGH_TRAN_COUNT() {
		return C2A_CUR_MUR30_60K_HIGH_TRAN_COUNT;
	}
	public void setC2A_CUR_MUR30_60K_HIGH_TRAN_COUNT(BigDecimal c2a_CUR_MUR30_60K_HIGH_TRAN_COUNT) {
		C2A_CUR_MUR30_60K_HIGH_TRAN_COUNT = c2a_CUR_MUR30_60K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC2A_CUR_MUR30_60K_HIGH_TRAN_AMT() {
		return C2A_CUR_MUR30_60K_HIGH_TRAN_AMT;
	}
	public void setC2A_CUR_MUR30_60K_HIGH_TRAN_AMT(BigDecimal c2a_CUR_MUR30_60K_HIGH_TRAN_AMT) {
		C2A_CUR_MUR30_60K_HIGH_TRAN_AMT = c2a_CUR_MUR30_60K_HIGH_TRAN_AMT;
	}
	public String getC3A_CUR_MUR60_150K_PRODUCT() {
		return C3A_CUR_MUR60_150K_PRODUCT;
	}
	public void setC3A_CUR_MUR60_150K_PRODUCT(String c3a_CUR_MUR60_150K_PRODUCT) {
		C3A_CUR_MUR60_150K_PRODUCT = c3a_CUR_MUR60_150K_PRODUCT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_LOW_TRAN_COUNT() {
		return C3A_CUR_MUR60_150K_LOW_TRAN_COUNT;
	}
	public void setC3A_CUR_MUR60_150K_LOW_TRAN_COUNT(BigDecimal c3a_CUR_MUR60_150K_LOW_TRAN_COUNT) {
		C3A_CUR_MUR60_150K_LOW_TRAN_COUNT = c3a_CUR_MUR60_150K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_LOW_TRAN_AMT() {
		return C3A_CUR_MUR60_150K_LOW_TRAN_AMT;
	}
	public void setC3A_CUR_MUR60_150K_LOW_TRAN_AMT(BigDecimal c3a_CUR_MUR60_150K_LOW_TRAN_AMT) {
		C3A_CUR_MUR60_150K_LOW_TRAN_AMT = c3a_CUR_MUR60_150K_LOW_TRAN_AMT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT() {
		return C3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT;
	}
	public void setC3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT(BigDecimal c3a_CUR_MUR60_150K_MEDIUM_TRAN_COUNT) {
		C3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT = c3a_CUR_MUR60_150K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_MEDUM_TRAN_AMT() {
		return C3A_CUR_MUR60_150K_MEDUM_TRAN_AMT;
	}
	public void setC3A_CUR_MUR60_150K_MEDUM_TRAN_AMT(BigDecimal c3a_CUR_MUR60_150K_MEDUM_TRAN_AMT) {
		C3A_CUR_MUR60_150K_MEDUM_TRAN_AMT = c3a_CUR_MUR60_150K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_HIGH_TRAN_COUNT() {
		return C3A_CUR_MUR60_150K_HIGH_TRAN_COUNT;
	}
	public void setC3A_CUR_MUR60_150K_HIGH_TRAN_COUNT(BigDecimal c3a_CUR_MUR60_150K_HIGH_TRAN_COUNT) {
		C3A_CUR_MUR60_150K_HIGH_TRAN_COUNT = c3a_CUR_MUR60_150K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC3A_CUR_MUR60_150K_HIGH_TRAN_AMT() {
		return C3A_CUR_MUR60_150K_HIGH_TRAN_AMT;
	}
	public void setC3A_CUR_MUR60_150K_HIGH_TRAN_AMT(BigDecimal c3a_CUR_MUR60_150K_HIGH_TRAN_AMT) {
		C3A_CUR_MUR60_150K_HIGH_TRAN_AMT = c3a_CUR_MUR60_150K_HIGH_TRAN_AMT;
	}
	public String getC4A_CUR_MUR150_300K_PRODUCT() {
		return C4A_CUR_MUR150_300K_PRODUCT;
	}
	public void setC4A_CUR_MUR150_300K_PRODUCT(String c4a_CUR_MUR150_300K_PRODUCT) {
		C4A_CUR_MUR150_300K_PRODUCT = c4a_CUR_MUR150_300K_PRODUCT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_LOW_TRAN_COUNT() {
		return C4A_CUR_MUR150_300K_LOW_TRAN_COUNT;
	}
	public void setC4A_CUR_MUR150_300K_LOW_TRAN_COUNT(BigDecimal c4a_CUR_MUR150_300K_LOW_TRAN_COUNT) {
		C4A_CUR_MUR150_300K_LOW_TRAN_COUNT = c4a_CUR_MUR150_300K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_LOW_TRAN_AMT() {
		return C4A_CUR_MUR150_300K_LOW_TRAN_AMT;
	}
	public void setC4A_CUR_MUR150_300K_LOW_TRAN_AMT(BigDecimal c4a_CUR_MUR150_300K_LOW_TRAN_AMT) {
		C4A_CUR_MUR150_300K_LOW_TRAN_AMT = c4a_CUR_MUR150_300K_LOW_TRAN_AMT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT() {
		return C4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT;
	}
	public void setC4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT(BigDecimal c4a_CUR_MUR150_300K_MEDIUM_TRAN_COUNT) {
		C4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT = c4a_CUR_MUR150_300K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_MEDUM_TRAN_AMT() {
		return C4A_CUR_MUR150_300K_MEDUM_TRAN_AMT;
	}
	public void setC4A_CUR_MUR150_300K_MEDUM_TRAN_AMT(BigDecimal c4a_CUR_MUR150_300K_MEDUM_TRAN_AMT) {
		C4A_CUR_MUR150_300K_MEDUM_TRAN_AMT = c4a_CUR_MUR150_300K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_HIGH_TRAN_COUNT() {
		return C4A_CUR_MUR150_300K_HIGH_TRAN_COUNT;
	}
	public void setC4A_CUR_MUR150_300K_HIGH_TRAN_COUNT(BigDecimal c4a_CUR_MUR150_300K_HIGH_TRAN_COUNT) {
		C4A_CUR_MUR150_300K_HIGH_TRAN_COUNT = c4a_CUR_MUR150_300K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC4A_CUR_MUR150_300K_HIGH_TRAN_AMT() {
		return C4A_CUR_MUR150_300K_HIGH_TRAN_AMT;
	}
	public void setC4A_CUR_MUR150_300K_HIGH_TRAN_AMT(BigDecimal c4a_CUR_MUR150_300K_HIGH_TRAN_AMT) {
		C4A_CUR_MUR150_300K_HIGH_TRAN_AMT = c4a_CUR_MUR150_300K_HIGH_TRAN_AMT;
	}
	public String getC5A_CUR_MUR300_500K_PRODUCT() {
		return C5A_CUR_MUR300_500K_PRODUCT;
	}
	public void setC5A_CUR_MUR300_500K_PRODUCT(String c5a_CUR_MUR300_500K_PRODUCT) {
		C5A_CUR_MUR300_500K_PRODUCT = c5a_CUR_MUR300_500K_PRODUCT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_LOW_TRAN_COUNT() {
		return C5A_CUR_MUR300_500K_LOW_TRAN_COUNT;
	}
	public void setC5A_CUR_MUR300_500K_LOW_TRAN_COUNT(BigDecimal c5a_CUR_MUR300_500K_LOW_TRAN_COUNT) {
		C5A_CUR_MUR300_500K_LOW_TRAN_COUNT = c5a_CUR_MUR300_500K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_LOW_TRAN_AMT() {
		return C5A_CUR_MUR300_500K_LOW_TRAN_AMT;
	}
	public void setC5A_CUR_MUR300_500K_LOW_TRAN_AMT(BigDecimal c5a_CUR_MUR300_500K_LOW_TRAN_AMT) {
		C5A_CUR_MUR300_500K_LOW_TRAN_AMT = c5a_CUR_MUR300_500K_LOW_TRAN_AMT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT() {
		return C5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT;
	}
	public void setC5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT(BigDecimal c5a_CUR_MUR300_500K_MEDIUM_TRAN_COUNT) {
		C5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT = c5a_CUR_MUR300_500K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_MEDUM_TRAN_AMT() {
		return C5A_CUR_MUR300_500K_MEDUM_TRAN_AMT;
	}
	public void setC5A_CUR_MUR300_500K_MEDUM_TRAN_AMT(BigDecimal c5a_CUR_MUR300_500K_MEDUM_TRAN_AMT) {
		C5A_CUR_MUR300_500K_MEDUM_TRAN_AMT = c5a_CUR_MUR300_500K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_HIGH_TRAN_COUNT() {
		return C5A_CUR_MUR300_500K_HIGH_TRAN_COUNT;
	}
	public void setC5A_CUR_MUR300_500K_HIGH_TRAN_COUNT(BigDecimal c5a_CUR_MUR300_500K_HIGH_TRAN_COUNT) {
		C5A_CUR_MUR300_500K_HIGH_TRAN_COUNT = c5a_CUR_MUR300_500K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC5A_CUR_MUR300_500K_HIGH_TRAN_AMT() {
		return C5A_CUR_MUR300_500K_HIGH_TRAN_AMT;
	}
	public void setC5A_CUR_MUR300_500K_HIGH_TRAN_AMT(BigDecimal c5a_CUR_MUR300_500K_HIGH_TRAN_AMT) {
		C5A_CUR_MUR300_500K_HIGH_TRAN_AMT = c5a_CUR_MUR300_500K_HIGH_TRAN_AMT;
	}
	public String getC6A_CUR_MUR500_1000K_PRODUCT() {
		return C6A_CUR_MUR500_1000K_PRODUCT;
	}
	public void setC6A_CUR_MUR500_1000K_PRODUCT(String c6a_CUR_MUR500_1000K_PRODUCT) {
		C6A_CUR_MUR500_1000K_PRODUCT = c6a_CUR_MUR500_1000K_PRODUCT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_LOW_TRAN_COUNT() {
		return C6A_CUR_MUR500_1000K_LOW_TRAN_COUNT;
	}
	public void setC6A_CUR_MUR500_1000K_LOW_TRAN_COUNT(BigDecimal c6a_CUR_MUR500_1000K_LOW_TRAN_COUNT) {
		C6A_CUR_MUR500_1000K_LOW_TRAN_COUNT = c6a_CUR_MUR500_1000K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_LOW_TRAN_AMT() {
		return C6A_CUR_MUR500_1000K_LOW_TRAN_AMT;
	}
	public void setC6A_CUR_MUR500_1000K_LOW_TRAN_AMT(BigDecimal c6a_CUR_MUR500_1000K_LOW_TRAN_AMT) {
		C6A_CUR_MUR500_1000K_LOW_TRAN_AMT = c6a_CUR_MUR500_1000K_LOW_TRAN_AMT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT() {
		return C6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT;
	}
	public void setC6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT(BigDecimal c6a_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT) {
		C6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT = c6a_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT() {
		return C6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT;
	}
	public void setC6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT(BigDecimal c6a_CUR_MUR500_1000K_MEDUM_TRAN_AMT) {
		C6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT = c6a_CUR_MUR500_1000K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT() {
		return C6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT;
	}
	public void setC6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT(BigDecimal c6a_CUR_MUR500_1000K_HIGH_TRAN_COUNT) {
		C6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT = c6a_CUR_MUR500_1000K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC6A_CUR_MUR500_1000K_HIGH_TRAN_AMT() {
		return C6A_CUR_MUR500_1000K_HIGH_TRAN_AMT;
	}
	public void setC6A_CUR_MUR500_1000K_HIGH_TRAN_AMT(BigDecimal c6a_CUR_MUR500_1000K_HIGH_TRAN_AMT) {
		C6A_CUR_MUR500_1000K_HIGH_TRAN_AMT = c6a_CUR_MUR500_1000K_HIGH_TRAN_AMT;
	}
	public String getC7A_CUR_MUR1000_1500K_PRODUCT() {
		return C7A_CUR_MUR1000_1500K_PRODUCT;
	}
	public void setC7A_CUR_MUR1000_1500K_PRODUCT(String c7a_CUR_MUR1000_1500K_PRODUCT) {
		C7A_CUR_MUR1000_1500K_PRODUCT = c7a_CUR_MUR1000_1500K_PRODUCT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT() {
		return C7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT;
	}
	public void setC7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT(BigDecimal c7a_CUR_MUR1000_1500K_LOW_TRAN_COUNT) {
		C7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT = c7a_CUR_MUR1000_1500K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_LOW_TRAN_AMT() {
		return C7A_CUR_MUR1000_1500K_LOW_TRAN_AMT;
	}
	public void setC7A_CUR_MUR1000_1500K_LOW_TRAN_AMT(BigDecimal c7a_CUR_MUR1000_1500K_LOW_TRAN_AMT) {
		C7A_CUR_MUR1000_1500K_LOW_TRAN_AMT = c7a_CUR_MUR1000_1500K_LOW_TRAN_AMT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT() {
		return C7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT;
	}
	public void setC7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT(BigDecimal c7a_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT) {
		C7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT = c7a_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT() {
		return C7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT;
	}
	public void setC7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT(BigDecimal c7a_CUR_MUR1000_1500K_MEDUM_TRAN_AMT) {
		C7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT = c7a_CUR_MUR1000_1500K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT() {
		return C7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT;
	}
	public void setC7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT(BigDecimal c7a_CUR_MUR1000_1500K_HIGH_TRAN_COUNT) {
		C7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT = c7a_CUR_MUR1000_1500K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT() {
		return C7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT;
	}
	public void setC7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT(BigDecimal c7a_CUR_MUR1000_1500K_HIGH_TRAN_AMT) {
		C7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT = c7a_CUR_MUR1000_1500K_HIGH_TRAN_AMT;
	}
	public String getC8A_CUR_MUR1500_3000K_PRODUCT() {
		return C8A_CUR_MUR1500_3000K_PRODUCT;
	}
	public void setC8A_CUR_MUR1500_3000K_PRODUCT(String c8a_CUR_MUR1500_3000K_PRODUCT) {
		C8A_CUR_MUR1500_3000K_PRODUCT = c8a_CUR_MUR1500_3000K_PRODUCT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT() {
		return C8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT;
	}
	public void setC8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT(BigDecimal c8a_CUR_MUR1500_3000K_LOW_TRAN_COUNT) {
		C8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT = c8a_CUR_MUR1500_3000K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_LOW_TRAN_AMT() {
		return C8A_CUR_MUR1500_3000K_LOW_TRAN_AMT;
	}
	public void setC8A_CUR_MUR1500_3000K_LOW_TRAN_AMT(BigDecimal c8a_CUR_MUR1500_3000K_LOW_TRAN_AMT) {
		C8A_CUR_MUR1500_3000K_LOW_TRAN_AMT = c8a_CUR_MUR1500_3000K_LOW_TRAN_AMT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT() {
		return C8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT;
	}
	public void setC8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT(BigDecimal c8a_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT) {
		C8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT = c8a_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT() {
		return C8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT;
	}
	public void setC8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT(BigDecimal c8a_CUR_MUR1500_3000K_MEDUM_TRAN_AMT) {
		C8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT = c8a_CUR_MUR1500_3000K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT() {
		return C8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT;
	}
	public void setC8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT(BigDecimal c8a_CUR_MUR1500_3000K_HIGH_TRAN_COUNT) {
		C8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT = c8a_CUR_MUR1500_3000K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT() {
		return C8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT;
	}
	public void setC8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT(BigDecimal c8a_CUR_MUR1500_3000K_HIGH_TRAN_AMT) {
		C8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT = c8a_CUR_MUR1500_3000K_HIGH_TRAN_AMT;
	}
	public String getC9A_CUR_MURMORE3000K_PRODUCT() {
		return C9A_CUR_MURMORE3000K_PRODUCT;
	}
	public void setC9A_CUR_MURMORE3000K_PRODUCT(String c9a_CUR_MURMORE3000K_PRODUCT) {
		C9A_CUR_MURMORE3000K_PRODUCT = c9a_CUR_MURMORE3000K_PRODUCT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_LOW_TRAN_COUNT() {
		return C9A_CUR_MURMORE3000K_LOW_TRAN_COUNT;
	}
	public void setC9A_CUR_MURMORE3000K_LOW_TRAN_COUNT(BigDecimal c9a_CUR_MURMORE3000K_LOW_TRAN_COUNT) {
		C9A_CUR_MURMORE3000K_LOW_TRAN_COUNT = c9a_CUR_MURMORE3000K_LOW_TRAN_COUNT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_LOW_TRAN_AMT() {
		return C9A_CUR_MURMORE3000K_LOW_TRAN_AMT;
	}
	public void setC9A_CUR_MURMORE3000K_LOW_TRAN_AMT(BigDecimal c9a_CUR_MURMORE3000K_LOW_TRAN_AMT) {
		C9A_CUR_MURMORE3000K_LOW_TRAN_AMT = c9a_CUR_MURMORE3000K_LOW_TRAN_AMT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT() {
		return C9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT;
	}
	public void setC9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT(BigDecimal c9a_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT) {
		C9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT = c9a_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT() {
		return C9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT;
	}
	public void setC9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT(BigDecimal c9a_CUR_MURMORE3000K_MEDUM_TRAN_AMT) {
		C9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT = c9a_CUR_MURMORE3000K_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT() {
		return C9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT;
	}
	public void setC9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT(BigDecimal c9a_CUR_MURMORE3000K_HIGH_TRAN_COUNT) {
		C9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT = c9a_CUR_MURMORE3000K_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC9A_CUR_MURMORE3000K_HIGH_TRAN_AMT() {
		return C9A_CUR_MURMORE3000K_HIGH_TRAN_AMT;
	}
	public void setC9A_CUR_MURMORE3000K_HIGH_TRAN_AMT(BigDecimal c9a_CUR_MURMORE3000K_HIGH_TRAN_AMT) {
		C9A_CUR_MURMORE3000K_HIGH_TRAN_AMT = c9a_CUR_MURMORE3000K_HIGH_TRAN_AMT;
	}
	public String getC10_TOTAL_PRODUCT() {
		return C10_TOTAL_PRODUCT;
	}
	public void setC10_TOTAL_PRODUCT(String c10_TOTAL_PRODUCT) {
		C10_TOTAL_PRODUCT = c10_TOTAL_PRODUCT;
	}
	public BigDecimal getC10_TOTAL_LOW_TRAN_COUNT() {
		return C10_TOTAL_LOW_TRAN_COUNT;
	}
	public void setC10_TOTAL_LOW_TRAN_COUNT(BigDecimal c10_TOTAL_LOW_TRAN_COUNT) {
		C10_TOTAL_LOW_TRAN_COUNT = c10_TOTAL_LOW_TRAN_COUNT;
	}
	public BigDecimal getC10_TOTAL_LOW_TRAN_AMT() {
		return C10_TOTAL_LOW_TRAN_AMT;
	}
	public void setC10_TOTAL_LOW_TRAN_AMT(BigDecimal c10_TOTAL_LOW_TRAN_AMT) {
		C10_TOTAL_LOW_TRAN_AMT = c10_TOTAL_LOW_TRAN_AMT;
	}
	public BigDecimal getC10_TOTAL_MEDIUM_TRAN_COUNT() {
		return C10_TOTAL_MEDIUM_TRAN_COUNT;
	}
	public void setC10_TOTAL_MEDIUM_TRAN_COUNT(BigDecimal c10_TOTAL_MEDIUM_TRAN_COUNT) {
		C10_TOTAL_MEDIUM_TRAN_COUNT = c10_TOTAL_MEDIUM_TRAN_COUNT;
	}
	public BigDecimal getC10_TOTAL_MEDUM_TRAN_AMT() {
		return C10_TOTAL_MEDUM_TRAN_AMT;
	}
	public void setC10_TOTAL_MEDUM_TRAN_AMT(BigDecimal c10_TOTAL_MEDUM_TRAN_AMT) {
		C10_TOTAL_MEDUM_TRAN_AMT = c10_TOTAL_MEDUM_TRAN_AMT;
	}
	public BigDecimal getC10_TOTAL_HIGH_TRAN_COUNT() {
		return C10_TOTAL_HIGH_TRAN_COUNT;
	}
	public void setC10_TOTAL_HIGH_TRAN_COUNT(BigDecimal c10_TOTAL_HIGH_TRAN_COUNT) {
		C10_TOTAL_HIGH_TRAN_COUNT = c10_TOTAL_HIGH_TRAN_COUNT;
	}
	public BigDecimal getC10_TOTAL_HIGH_TRAN_AMT() {
		return C10_TOTAL_HIGH_TRAN_AMT;
	}
	public void setC10_TOTAL_HIGH_TRAN_AMT(BigDecimal c10_TOTAL_HIGH_TRAN_AMT) {
		C10_TOTAL_HIGH_TRAN_AMT = c10_TOTAL_HIGH_TRAN_AMT;
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
	public T12GReport(String c1a_CUR_BMUR30K_PRODUCT, BigDecimal c1a_CUR_BMUR30K_LOW_TRAN_COUNT,
			BigDecimal c1a_CUR_BMUR30K_LOW_TRAN_AMT, BigDecimal c1a_CUR_BMUR30K_MEDIUM_TRAN_COUNT,
			BigDecimal c1a_CUR_BMUR30K_MEDUM_TRAN_AMT, BigDecimal c1a_CUR_BMUR30K_HIGH_TRAN_COUNT,
			BigDecimal c1a_CUR_BMUR30K_HIGH_TRAN_AMT, String c2a_CUR_MUR30_60K_PRODUCT,
			BigDecimal c2a_CUR_MUR30_60K_LOW_TRAN_COUNT, BigDecimal c2a_CUR_MUR30_60K_LOW_TRAN_AMT,
			BigDecimal c2a_CUR_MUR30_60K_MEDIUM_TRAN_COUNT, BigDecimal c2a_CUR_MUR30_60K_MEDUM_TRAN_AMT,
			BigDecimal c2a_CUR_MUR30_60K_HIGH_TRAN_COUNT, BigDecimal c2a_CUR_MUR30_60K_HIGH_TRAN_AMT,
			String c3a_CUR_MUR60_150K_PRODUCT, BigDecimal c3a_CUR_MUR60_150K_LOW_TRAN_COUNT,
			BigDecimal c3a_CUR_MUR60_150K_LOW_TRAN_AMT, BigDecimal c3a_CUR_MUR60_150K_MEDIUM_TRAN_COUNT,
			BigDecimal c3a_CUR_MUR60_150K_MEDUM_TRAN_AMT, BigDecimal c3a_CUR_MUR60_150K_HIGH_TRAN_COUNT,
			BigDecimal c3a_CUR_MUR60_150K_HIGH_TRAN_AMT, String c4a_CUR_MUR150_300K_PRODUCT,
			BigDecimal c4a_CUR_MUR150_300K_LOW_TRAN_COUNT, BigDecimal c4a_CUR_MUR150_300K_LOW_TRAN_AMT,
			BigDecimal c4a_CUR_MUR150_300K_MEDIUM_TRAN_COUNT, BigDecimal c4a_CUR_MUR150_300K_MEDUM_TRAN_AMT,
			BigDecimal c4a_CUR_MUR150_300K_HIGH_TRAN_COUNT, BigDecimal c4a_CUR_MUR150_300K_HIGH_TRAN_AMT,
			String c5a_CUR_MUR300_500K_PRODUCT, BigDecimal c5a_CUR_MUR300_500K_LOW_TRAN_COUNT,
			BigDecimal c5a_CUR_MUR300_500K_LOW_TRAN_AMT, BigDecimal c5a_CUR_MUR300_500K_MEDIUM_TRAN_COUNT,
			BigDecimal c5a_CUR_MUR300_500K_MEDUM_TRAN_AMT, BigDecimal c5a_CUR_MUR300_500K_HIGH_TRAN_COUNT,
			BigDecimal c5a_CUR_MUR300_500K_HIGH_TRAN_AMT, String c6a_CUR_MUR500_1000K_PRODUCT,
			BigDecimal c6a_CUR_MUR500_1000K_LOW_TRAN_COUNT, BigDecimal c6a_CUR_MUR500_1000K_LOW_TRAN_AMT,
			BigDecimal c6a_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT, BigDecimal c6a_CUR_MUR500_1000K_MEDUM_TRAN_AMT,
			BigDecimal c6a_CUR_MUR500_1000K_HIGH_TRAN_COUNT, BigDecimal c6a_CUR_MUR500_1000K_HIGH_TRAN_AMT,
			String c7a_CUR_MUR1000_1500K_PRODUCT, BigDecimal c7a_CUR_MUR1000_1500K_LOW_TRAN_COUNT,
			BigDecimal c7a_CUR_MUR1000_1500K_LOW_TRAN_AMT, BigDecimal c7a_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT,
			BigDecimal c7a_CUR_MUR1000_1500K_MEDUM_TRAN_AMT, BigDecimal c7a_CUR_MUR1000_1500K_HIGH_TRAN_COUNT,
			BigDecimal c7a_CUR_MUR1000_1500K_HIGH_TRAN_AMT, String c8a_CUR_MUR1500_3000K_PRODUCT,
			BigDecimal c8a_CUR_MUR1500_3000K_LOW_TRAN_COUNT, BigDecimal c8a_CUR_MUR1500_3000K_LOW_TRAN_AMT,
			BigDecimal c8a_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT, BigDecimal c8a_CUR_MUR1500_3000K_MEDUM_TRAN_AMT,
			BigDecimal c8a_CUR_MUR1500_3000K_HIGH_TRAN_COUNT, BigDecimal c8a_CUR_MUR1500_3000K_HIGH_TRAN_AMT,
			String c9a_CUR_MURMORE3000K_PRODUCT, BigDecimal c9a_CUR_MURMORE3000K_LOW_TRAN_COUNT,
			BigDecimal c9a_CUR_MURMORE3000K_LOW_TRAN_AMT, BigDecimal c9a_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT,
			BigDecimal c9a_CUR_MURMORE3000K_MEDUM_TRAN_AMT, BigDecimal c9a_CUR_MURMORE3000K_HIGH_TRAN_COUNT,
			BigDecimal c9a_CUR_MURMORE3000K_HIGH_TRAN_AMT, String c10_TOTAL_PRODUCT,
			BigDecimal c10_TOTAL_LOW_TRAN_COUNT, BigDecimal c10_TOTAL_LOW_TRAN_AMT,
			BigDecimal c10_TOTAL_MEDIUM_TRAN_COUNT, BigDecimal c10_TOTAL_MEDUM_TRAN_AMT,
			BigDecimal c10_TOTAL_HIGH_TRAN_COUNT, BigDecimal c10_TOTAL_HIGH_TRAN_AMT, String rEPORT_CODE,
			String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM,
			Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG) {
		super();
		C1A_CUR_BMUR30K_PRODUCT = c1a_CUR_BMUR30K_PRODUCT;
		C1A_CUR_BMUR30K_LOW_TRAN_COUNT = c1a_CUR_BMUR30K_LOW_TRAN_COUNT;
		C1A_CUR_BMUR30K_LOW_TRAN_AMT = c1a_CUR_BMUR30K_LOW_TRAN_AMT;
		C1A_CUR_BMUR30K_MEDIUM_TRAN_COUNT = c1a_CUR_BMUR30K_MEDIUM_TRAN_COUNT;
		C1A_CUR_BMUR30K_MEDUM_TRAN_AMT = c1a_CUR_BMUR30K_MEDUM_TRAN_AMT;
		C1A_CUR_BMUR30K_HIGH_TRAN_COUNT = c1a_CUR_BMUR30K_HIGH_TRAN_COUNT;
		C1A_CUR_BMUR30K_HIGH_TRAN_AMT = c1a_CUR_BMUR30K_HIGH_TRAN_AMT;
		C2A_CUR_MUR30_60K_PRODUCT = c2a_CUR_MUR30_60K_PRODUCT;
		C2A_CUR_MUR30_60K_LOW_TRAN_COUNT = c2a_CUR_MUR30_60K_LOW_TRAN_COUNT;
		C2A_CUR_MUR30_60K_LOW_TRAN_AMT = c2a_CUR_MUR30_60K_LOW_TRAN_AMT;
		C2A_CUR_MUR30_60K_MEDIUM_TRAN_COUNT = c2a_CUR_MUR30_60K_MEDIUM_TRAN_COUNT;
		C2A_CUR_MUR30_60K_MEDUM_TRAN_AMT = c2a_CUR_MUR30_60K_MEDUM_TRAN_AMT;
		C2A_CUR_MUR30_60K_HIGH_TRAN_COUNT = c2a_CUR_MUR30_60K_HIGH_TRAN_COUNT;
		C2A_CUR_MUR30_60K_HIGH_TRAN_AMT = c2a_CUR_MUR30_60K_HIGH_TRAN_AMT;
		C3A_CUR_MUR60_150K_PRODUCT = c3a_CUR_MUR60_150K_PRODUCT;
		C3A_CUR_MUR60_150K_LOW_TRAN_COUNT = c3a_CUR_MUR60_150K_LOW_TRAN_COUNT;
		C3A_CUR_MUR60_150K_LOW_TRAN_AMT = c3a_CUR_MUR60_150K_LOW_TRAN_AMT;
		C3A_CUR_MUR60_150K_MEDIUM_TRAN_COUNT = c3a_CUR_MUR60_150K_MEDIUM_TRAN_COUNT;
		C3A_CUR_MUR60_150K_MEDUM_TRAN_AMT = c3a_CUR_MUR60_150K_MEDUM_TRAN_AMT;
		C3A_CUR_MUR60_150K_HIGH_TRAN_COUNT = c3a_CUR_MUR60_150K_HIGH_TRAN_COUNT;
		C3A_CUR_MUR60_150K_HIGH_TRAN_AMT = c3a_CUR_MUR60_150K_HIGH_TRAN_AMT;
		C4A_CUR_MUR150_300K_PRODUCT = c4a_CUR_MUR150_300K_PRODUCT;
		C4A_CUR_MUR150_300K_LOW_TRAN_COUNT = c4a_CUR_MUR150_300K_LOW_TRAN_COUNT;
		C4A_CUR_MUR150_300K_LOW_TRAN_AMT = c4a_CUR_MUR150_300K_LOW_TRAN_AMT;
		C4A_CUR_MUR150_300K_MEDIUM_TRAN_COUNT = c4a_CUR_MUR150_300K_MEDIUM_TRAN_COUNT;
		C4A_CUR_MUR150_300K_MEDUM_TRAN_AMT = c4a_CUR_MUR150_300K_MEDUM_TRAN_AMT;
		C4A_CUR_MUR150_300K_HIGH_TRAN_COUNT = c4a_CUR_MUR150_300K_HIGH_TRAN_COUNT;
		C4A_CUR_MUR150_300K_HIGH_TRAN_AMT = c4a_CUR_MUR150_300K_HIGH_TRAN_AMT;
		C5A_CUR_MUR300_500K_PRODUCT = c5a_CUR_MUR300_500K_PRODUCT;
		C5A_CUR_MUR300_500K_LOW_TRAN_COUNT = c5a_CUR_MUR300_500K_LOW_TRAN_COUNT;
		C5A_CUR_MUR300_500K_LOW_TRAN_AMT = c5a_CUR_MUR300_500K_LOW_TRAN_AMT;
		C5A_CUR_MUR300_500K_MEDIUM_TRAN_COUNT = c5a_CUR_MUR300_500K_MEDIUM_TRAN_COUNT;
		C5A_CUR_MUR300_500K_MEDUM_TRAN_AMT = c5a_CUR_MUR300_500K_MEDUM_TRAN_AMT;
		C5A_CUR_MUR300_500K_HIGH_TRAN_COUNT = c5a_CUR_MUR300_500K_HIGH_TRAN_COUNT;
		C5A_CUR_MUR300_500K_HIGH_TRAN_AMT = c5a_CUR_MUR300_500K_HIGH_TRAN_AMT;
		C6A_CUR_MUR500_1000K_PRODUCT = c6a_CUR_MUR500_1000K_PRODUCT;
		C6A_CUR_MUR500_1000K_LOW_TRAN_COUNT = c6a_CUR_MUR500_1000K_LOW_TRAN_COUNT;
		C6A_CUR_MUR500_1000K_LOW_TRAN_AMT = c6a_CUR_MUR500_1000K_LOW_TRAN_AMT;
		C6A_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT = c6a_CUR_MUR500_1000K_MEDIUM_TRAN_COUNT;
		C6A_CUR_MUR500_1000K_MEDUM_TRAN_AMT = c6a_CUR_MUR500_1000K_MEDUM_TRAN_AMT;
		C6A_CUR_MUR500_1000K_HIGH_TRAN_COUNT = c6a_CUR_MUR500_1000K_HIGH_TRAN_COUNT;
		C6A_CUR_MUR500_1000K_HIGH_TRAN_AMT = c6a_CUR_MUR500_1000K_HIGH_TRAN_AMT;
		C7A_CUR_MUR1000_1500K_PRODUCT = c7a_CUR_MUR1000_1500K_PRODUCT;
		C7A_CUR_MUR1000_1500K_LOW_TRAN_COUNT = c7a_CUR_MUR1000_1500K_LOW_TRAN_COUNT;
		C7A_CUR_MUR1000_1500K_LOW_TRAN_AMT = c7a_CUR_MUR1000_1500K_LOW_TRAN_AMT;
		C7A_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT = c7a_CUR_MUR1000_1500K_MEDIUM_TRAN_COUNT;
		C7A_CUR_MUR1000_1500K_MEDUM_TRAN_AMT = c7a_CUR_MUR1000_1500K_MEDUM_TRAN_AMT;
		C7A_CUR_MUR1000_1500K_HIGH_TRAN_COUNT = c7a_CUR_MUR1000_1500K_HIGH_TRAN_COUNT;
		C7A_CUR_MUR1000_1500K_HIGH_TRAN_AMT = c7a_CUR_MUR1000_1500K_HIGH_TRAN_AMT;
		C8A_CUR_MUR1500_3000K_PRODUCT = c8a_CUR_MUR1500_3000K_PRODUCT;
		C8A_CUR_MUR1500_3000K_LOW_TRAN_COUNT = c8a_CUR_MUR1500_3000K_LOW_TRAN_COUNT;
		C8A_CUR_MUR1500_3000K_LOW_TRAN_AMT = c8a_CUR_MUR1500_3000K_LOW_TRAN_AMT;
		C8A_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT = c8a_CUR_MUR1500_3000K_MEDIUM_TRAN_COUNT;
		C8A_CUR_MUR1500_3000K_MEDUM_TRAN_AMT = c8a_CUR_MUR1500_3000K_MEDUM_TRAN_AMT;
		C8A_CUR_MUR1500_3000K_HIGH_TRAN_COUNT = c8a_CUR_MUR1500_3000K_HIGH_TRAN_COUNT;
		C8A_CUR_MUR1500_3000K_HIGH_TRAN_AMT = c8a_CUR_MUR1500_3000K_HIGH_TRAN_AMT;
		C9A_CUR_MURMORE3000K_PRODUCT = c9a_CUR_MURMORE3000K_PRODUCT;
		C9A_CUR_MURMORE3000K_LOW_TRAN_COUNT = c9a_CUR_MURMORE3000K_LOW_TRAN_COUNT;
		C9A_CUR_MURMORE3000K_LOW_TRAN_AMT = c9a_CUR_MURMORE3000K_LOW_TRAN_AMT;
		C9A_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT = c9a_CUR_MURMORE3000K_MEDIUM_TRAN_COUNT;
		C9A_CUR_MURMORE3000K_MEDUM_TRAN_AMT = c9a_CUR_MURMORE3000K_MEDUM_TRAN_AMT;
		C9A_CUR_MURMORE3000K_HIGH_TRAN_COUNT = c9a_CUR_MURMORE3000K_HIGH_TRAN_COUNT;
		C9A_CUR_MURMORE3000K_HIGH_TRAN_AMT = c9a_CUR_MURMORE3000K_HIGH_TRAN_AMT;
		C10_TOTAL_PRODUCT = c10_TOTAL_PRODUCT;
		C10_TOTAL_LOW_TRAN_COUNT = c10_TOTAL_LOW_TRAN_COUNT;
		C10_TOTAL_LOW_TRAN_AMT = c10_TOTAL_LOW_TRAN_AMT;
		C10_TOTAL_MEDIUM_TRAN_COUNT = c10_TOTAL_MEDIUM_TRAN_COUNT;
		C10_TOTAL_MEDUM_TRAN_AMT = c10_TOTAL_MEDUM_TRAN_AMT;
		C10_TOTAL_HIGH_TRAN_COUNT = c10_TOTAL_HIGH_TRAN_COUNT;
		C10_TOTAL_HIGH_TRAN_AMT = c10_TOTAL_HIGH_TRAN_AMT;
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
	}
	public T12GReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

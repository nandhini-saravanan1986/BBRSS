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
@Table(name = "BRS13")
public class BRS13_ENTITY {
	private BigDecimal	r12_cal_year;
	private BigDecimal	r12_cap_per;
	private BigDecimal	r13_cal_year;
	private BigDecimal	r13_cap_per;
	private BigDecimal	r14_cal_year;
	private BigDecimal	r14_cap_per;
	private BigDecimal	r15_cal_year;
	private BigDecimal	r15_cap_per;
	private String	r16_cal_year;
	private BigDecimal	r16_cap_per;
	private BigDecimal	r20_cal_year;
	private BigDecimal	r20_cap_per;
	private BigDecimal	r21_cal_year;
	private BigDecimal	r21_cap_per;
	private BigDecimal	r22_cal_year;
	private BigDecimal	r22_cap_per;
	private BigDecimal	r23_cal_year;
	private BigDecimal	r23_cap_per;
	private String	r24_cal_year;
	private BigDecimal	r24_cap_per;
	private BigDecimal	r28_amt;
	private BigDecimal	r29_amt;
	private BigDecimal	r30_amt;
	private BigDecimal	r31_amt;
	private BigDecimal	r32_amt;
	private BigDecimal	r33_amt;
	private BigDecimal	r34_amt;
	private BigDecimal	r35_amt;
	private BigDecimal	r40_amt;
	private BigDecimal	r41_amt;
	private BigDecimal	r42_amt;
	private BigDecimal	r43_amt;
	private BigDecimal	r44_amt;
	private BigDecimal	r45_amt;
	private BigDecimal	r46_amt;
	private BigDecimal	r47_amt;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date ;
	private Date	report_from_date;
	private Date	report_to_date ;
	private String	entity_flg ;
	private String	modify_flg ;
	private String	del_flg ;
	private String	report_code ;
	private Date	report_submit_date ;
	public BigDecimal getR12_cal_year() {
		return r12_cal_year;
	}
	public void setR12_cal_year(BigDecimal r12_cal_year) {
		this.r12_cal_year = r12_cal_year;
	}
	public BigDecimal getR12_cap_per() {
		return r12_cap_per;
	}
	public void setR12_cap_per(BigDecimal r12_cap_per) {
		this.r12_cap_per = r12_cap_per;
	}
	public BigDecimal getR13_cal_year() {
		return r13_cal_year;
	}
	public void setR13_cal_year(BigDecimal r13_cal_year) {
		this.r13_cal_year = r13_cal_year;
	}
	public BigDecimal getR13_cap_per() {
		return r13_cap_per;
	}
	public void setR13_cap_per(BigDecimal r13_cap_per) {
		this.r13_cap_per = r13_cap_per;
	}
	public BigDecimal getR14_cal_year() {
		return r14_cal_year;
	}
	public void setR14_cal_year(BigDecimal r14_cal_year) {
		this.r14_cal_year = r14_cal_year;
	}
	public BigDecimal getR14_cap_per() {
		return r14_cap_per;
	}
	public void setR14_cap_per(BigDecimal r14_cap_per) {
		this.r14_cap_per = r14_cap_per;
	}
	public BigDecimal getR15_cal_year() {
		return r15_cal_year;
	}
	public void setR15_cal_year(BigDecimal r15_cal_year) {
		this.r15_cal_year = r15_cal_year;
	}
	public BigDecimal getR15_cap_per() {
		return r15_cap_per;
	}
	public void setR15_cap_per(BigDecimal r15_cap_per) {
		this.r15_cap_per = r15_cap_per;
	}
	public String getR16_cal_year() {
		return r16_cal_year;
	}
	public void setR16_cal_year(String r16_cal_year) {
		this.r16_cal_year = r16_cal_year;
	}
	public BigDecimal getR16_cap_per() {
		return r16_cap_per;
	}
	public void setR16_cap_per(BigDecimal r16_cap_per) {
		this.r16_cap_per = r16_cap_per;
	}
	public BigDecimal getR20_cal_year() {
		return r20_cal_year;
	}
	public void setR20_cal_year(BigDecimal r20_cal_year) {
		this.r20_cal_year = r20_cal_year;
	}
	public BigDecimal getR20_cap_per() {
		return r20_cap_per;
	}
	public void setR20_cap_per(BigDecimal r20_cap_per) {
		this.r20_cap_per = r20_cap_per;
	}
	public BigDecimal getR21_cal_year() {
		return r21_cal_year;
	}
	public void setR21_cal_year(BigDecimal r21_cal_year) {
		this.r21_cal_year = r21_cal_year;
	}
	public BigDecimal getR21_cap_per() {
		return r21_cap_per;
	}
	public void setR21_cap_per(BigDecimal r21_cap_per) {
		this.r21_cap_per = r21_cap_per;
	}
	public BigDecimal getR22_cal_year() {
		return r22_cal_year;
	}
	public void setR22_cal_year(BigDecimal r22_cal_year) {
		this.r22_cal_year = r22_cal_year;
	}
	public BigDecimal getR22_cap_per() {
		return r22_cap_per;
	}
	public void setR22_cap_per(BigDecimal r22_cap_per) {
		this.r22_cap_per = r22_cap_per;
	}
	public BigDecimal getR23_cal_year() {
		return r23_cal_year;
	}
	public void setR23_cal_year(BigDecimal r23_cal_year) {
		this.r23_cal_year = r23_cal_year;
	}
	public BigDecimal getR23_cap_per() {
		return r23_cap_per;
	}
	public void setR23_cap_per(BigDecimal r23_cap_per) {
		this.r23_cap_per = r23_cap_per;
	}
	public String getR24_cal_year() {
		return r24_cal_year;
	}
	public void setR24_cal_year(String r24_cal_year) {
		this.r24_cal_year = r24_cal_year;
	}
	public BigDecimal getR24_cap_per() {
		return r24_cap_per;
	}
	public void setR24_cap_per(BigDecimal r24_cap_per) {
		this.r24_cap_per = r24_cap_per;
	}
	public BigDecimal getR28_amt() {
		return r28_amt;
	}
	public void setR28_amt(BigDecimal r28_amt) {
		this.r28_amt = r28_amt;
	}
	public BigDecimal getR29_amt() {
		return r29_amt;
	}
	public void setR29_amt(BigDecimal r29_amt) {
		this.r29_amt = r29_amt;
	}
	public BigDecimal getR30_amt() {
		return r30_amt;
	}
	public void setR30_amt(BigDecimal r30_amt) {
		this.r30_amt = r30_amt;
	}
	public BigDecimal getR31_amt() {
		return r31_amt;
	}
	public void setR31_amt(BigDecimal r31_amt) {
		this.r31_amt = r31_amt;
	}
	public BigDecimal getR32_amt() {
		return r32_amt;
	}
	public void setR32_amt(BigDecimal r32_amt) {
		this.r32_amt = r32_amt;
	}
	public BigDecimal getR33_amt() {
		return r33_amt;
	}
	public void setR33_amt(BigDecimal r33_amt) {
		this.r33_amt = r33_amt;
	}
	public BigDecimal getR34_amt() {
		return r34_amt;
	}
	public void setR34_amt(BigDecimal r34_amt) {
		this.r34_amt = r34_amt;
	}
	public BigDecimal getR35_amt() {
		return r35_amt;
	}
	public void setR35_amt(BigDecimal r35_amt) {
		this.r35_amt = r35_amt;
	}
	public BigDecimal getR40_amt() {
		return r40_amt;
	}
	public void setR40_amt(BigDecimal r40_amt) {
		this.r40_amt = r40_amt;
	}
	public BigDecimal getR41_amt() {
		return r41_amt;
	}
	public void setR41_amt(BigDecimal r41_amt) {
		this.r41_amt = r41_amt;
	}
	public BigDecimal getR42_amt() {
		return r42_amt;
	}
	public void setR42_amt(BigDecimal r42_amt) {
		this.r42_amt = r42_amt;
	}
	public BigDecimal getR43_amt() {
		return r43_amt;
	}
	public void setR43_amt(BigDecimal r43_amt) {
		this.r43_amt = r43_amt;
	}
	public BigDecimal getR44_amt() {
		return r44_amt;
	}
	public void setR44_amt(BigDecimal r44_amt) {
		this.r44_amt = r44_amt;
	}
	public BigDecimal getR45_amt() {
		return r45_amt;
	}
	public void setR45_amt(BigDecimal r45_amt) {
		this.r45_amt = r45_amt;
	}
	public BigDecimal getR46_amt() {
		return r46_amt;
	}
	public void setR46_amt(BigDecimal r46_amt) {
		this.r46_amt = r46_amt;
	}
	public BigDecimal getR47_amt() {
		return r47_amt;
	}
	public void setR47_amt(BigDecimal r47_amt) {
		this.r47_amt = r47_amt;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public Date getReport_from_date() {
		return report_from_date;
	}
	public void setReport_from_date(Date report_from_date) {
		this.report_from_date = report_from_date;
	}
	public Date getReport_to_date() {
		return report_to_date;
	}
	public void setReport_to_date(Date report_to_date) {
		this.report_to_date = report_to_date;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public String getReport_code() {
		return report_code;
	}
	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}
	public Date getReport_submit_date() {
		return report_submit_date;
	}
	public void setReport_submit_date(Date report_submit_date) {
		this.report_submit_date = report_submit_date;
	}
	public BRS13_ENTITY(BigDecimal r12_cal_year, BigDecimal r12_cap_per, BigDecimal r13_cal_year,
			BigDecimal r13_cap_per, BigDecimal r14_cal_year, BigDecimal r14_cap_per, BigDecimal r15_cal_year,
			BigDecimal r15_cap_per, String r16_cal_year, BigDecimal r16_cap_per, BigDecimal r20_cal_year,
			BigDecimal r20_cap_per, BigDecimal r21_cal_year, BigDecimal r21_cap_per, BigDecimal r22_cal_year,
			BigDecimal r22_cap_per, BigDecimal r23_cal_year, BigDecimal r23_cap_per, String r24_cal_year,
			BigDecimal r24_cap_per, BigDecimal r28_amt, BigDecimal r29_amt, BigDecimal r30_amt, BigDecimal r31_amt,
			BigDecimal r32_amt, BigDecimal r33_amt, BigDecimal r34_amt, BigDecimal r35_amt, BigDecimal r40_amt,
			BigDecimal r41_amt, BigDecimal r42_amt, BigDecimal r43_amt, BigDecimal r44_amt, BigDecimal r45_amt,
			BigDecimal r46_amt, BigDecimal r47_amt, Date report_date, Date report_from_date, Date report_to_date,
			String entity_flg, String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r12_cal_year = r12_cal_year;
		this.r12_cap_per = r12_cap_per;
		this.r13_cal_year = r13_cal_year;
		this.r13_cap_per = r13_cap_per;
		this.r14_cal_year = r14_cal_year;
		this.r14_cap_per = r14_cap_per;
		this.r15_cal_year = r15_cal_year;
		this.r15_cap_per = r15_cap_per;
		this.r16_cal_year = r16_cal_year;
		this.r16_cap_per = r16_cap_per;
		this.r20_cal_year = r20_cal_year;
		this.r20_cap_per = r20_cap_per;
		this.r21_cal_year = r21_cal_year;
		this.r21_cap_per = r21_cap_per;
		this.r22_cal_year = r22_cal_year;
		this.r22_cap_per = r22_cap_per;
		this.r23_cal_year = r23_cal_year;
		this.r23_cap_per = r23_cap_per;
		this.r24_cal_year = r24_cal_year;
		this.r24_cap_per = r24_cap_per;
		this.r28_amt = r28_amt;
		this.r29_amt = r29_amt;
		this.r30_amt = r30_amt;
		this.r31_amt = r31_amt;
		this.r32_amt = r32_amt;
		this.r33_amt = r33_amt;
		this.r34_amt = r34_amt;
		this.r35_amt = r35_amt;
		this.r40_amt = r40_amt;
		this.r41_amt = r41_amt;
		this.r42_amt = r42_amt;
		this.r43_amt = r43_amt;
		this.r44_amt = r44_amt;
		this.r45_amt = r45_amt;
		this.r46_amt = r46_amt;
		this.r47_amt = r47_amt;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS13_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}

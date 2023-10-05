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
@Table(name="M_LA2")
public class BRS36_ENTITY {
	private String	r1_product;
	private BigDecimal	r1_total;
	private String	r2_product;
	private BigDecimal	r2_total;
	private String	r3_product;
	private BigDecimal	r3_total;
	private String	r4_product;
	private BigDecimal	r4_total;
	private String	r5_product;
	private BigDecimal	r5_total;
	private String	r6_product;
	private String	r6_total;
	private String	r7_product;
	private String	r7_total;
	private String	r8_product;
	private BigDecimal	r8_total;
	private String	r9_product;
	private BigDecimal	r9_total;
	private String	r10_product;
	private BigDecimal	r10_total;
	private String	r11_product;
	private BigDecimal	r11_total;
	private String	r12_product;
	private BigDecimal	r12_total;
	private String	r13_product;
	private BigDecimal	r13_total;
	private String	r14_product;
	private BigDecimal	r14_total;
	private String	r15_product;
	private BigDecimal	r15_total;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date;
	private Date	report_from_date;
	private Date	report_to_date;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	private String	report_code;
	private Date	report_submit_date;
	public String getR1_product() {
		return r1_product;
	}
	public void setR1_product(String r1_product) {
		this.r1_product = r1_product;
	}
	public BigDecimal getR1_total() {
		return r1_total;
	}
	public void setR1_total(BigDecimal r1_total) {
		this.r1_total = r1_total;
	}
	public String getR2_product() {
		return r2_product;
	}
	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}
	public BigDecimal getR2_total() {
		return r2_total;
	}
	public void setR2_total(BigDecimal r2_total) {
		this.r2_total = r2_total;
	}
	public String getR3_product() {
		return r3_product;
	}
	public void setR3_product(String r3_product) {
		this.r3_product = r3_product;
	}
	public BigDecimal getR3_total() {
		return r3_total;
	}
	public void setR3_total(BigDecimal r3_total) {
		this.r3_total = r3_total;
	}
	public String getR4_product() {
		return r4_product;
	}
	public void setR4_product(String r4_product) {
		this.r4_product = r4_product;
	}
	public BigDecimal getR4_total() {
		return r4_total;
	}
	public void setR4_total(BigDecimal r4_total) {
		this.r4_total = r4_total;
	}
	public String getR5_product() {
		return r5_product;
	}
	public void setR5_product(String r5_product) {
		this.r5_product = r5_product;
	}
	public BigDecimal getR5_total() {
		return r5_total;
	}
	public void setR5_total(BigDecimal r5_total) {
		this.r5_total = r5_total;
	}
	public String getR6_product() {
		return r6_product;
	}
	public void setR6_product(String r6_product) {
		this.r6_product = r6_product;
	}
	public String getR6_total() {
		return r6_total;
	}
	public void setR6_total(String r6_total) {
		this.r6_total = r6_total;
	}
	public String getR7_product() {
		return r7_product;
	}
	public void setR7_product(String r7_product) {
		this.r7_product = r7_product;
	}
	public String getR7_total() {
		return r7_total;
	}
	public void setR7_total(String r7_total) {
		this.r7_total = r7_total;
	}
	public String getR8_product() {
		return r8_product;
	}
	public void setR8_product(String r8_product) {
		this.r8_product = r8_product;
	}
	public BigDecimal getR8_total() {
		return r8_total;
	}
	public void setR8_total(BigDecimal r8_total) {
		this.r8_total = r8_total;
	}
	public String getR9_product() {
		return r9_product;
	}
	public void setR9_product(String r9_product) {
		this.r9_product = r9_product;
	}
	public BigDecimal getR9_total() {
		return r9_total;
	}
	public void setR9_total(BigDecimal r9_total) {
		this.r9_total = r9_total;
	}
	public String getR10_product() {
		return r10_product;
	}
	public void setR10_product(String r10_product) {
		this.r10_product = r10_product;
	}
	public BigDecimal getR10_total() {
		return r10_total;
	}
	public void setR10_total(BigDecimal r10_total) {
		this.r10_total = r10_total;
	}
	public String getR11_product() {
		return r11_product;
	}
	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}
	public BigDecimal getR11_total() {
		return r11_total;
	}
	public void setR11_total(BigDecimal r11_total) {
		this.r11_total = r11_total;
	}
	public String getR12_product() {
		return r12_product;
	}
	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}
	public BigDecimal getR12_total() {
		return r12_total;
	}
	public void setR12_total(BigDecimal r12_total) {
		this.r12_total = r12_total;
	}
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public BigDecimal getR13_total() {
		return r13_total;
	}
	public void setR13_total(BigDecimal r13_total) {
		this.r13_total = r13_total;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public BigDecimal getR14_total() {
		return r14_total;
	}
	public void setR14_total(BigDecimal r14_total) {
		this.r14_total = r14_total;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public BigDecimal getR15_total() {
		return r15_total;
	}
	public void setR15_total(BigDecimal r15_total) {
		this.r15_total = r15_total;
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
	@Override
	public String toString() {
		return "M_LA2_ENTITY [r1_product=" + r1_product + ", r1_total=" + r1_total + ", r2_product=" + r2_product
				+ ", r2_total=" + r2_total + ", r3_product=" + r3_product + ", r3_total=" + r3_total + ", r4_product="
				+ r4_product + ", r4_total=" + r4_total + ", r5_product=" + r5_product + ", r5_total=" + r5_total
				+ ", r6_product=" + r6_product + ", r6_total=" + r6_total + ", r7_product=" + r7_product + ", r7_total="
				+ r7_total + ", r8_product=" + r8_product + ", r8_total=" + r8_total + ", r9_product=" + r9_product
				+ ", r9_total=" + r9_total + ", r10_product=" + r10_product + ", r10_total=" + r10_total
				+ ", r11_product=" + r11_product + ", r11_total=" + r11_total + ", r12_product=" + r12_product
				+ ", r12_total=" + r12_total + ", r13_product=" + r13_product + ", r13_total=" + r13_total
				+ ", r14_product=" + r14_product + ", r14_total=" + r14_total + ", r15_product=" + r15_product
				+ ", r15_total=" + r15_total + ", report_date=" + report_date + ", report_from_date=" + report_from_date
				+ ", report_to_date=" + report_to_date + ", entity_flg=" + entity_flg + ", modify_flg=" + modify_flg
				+ ", del_flg=" + del_flg + ", report_code=" + report_code + ", report_submit_date=" + report_submit_date
				+ ", getR1_product()=" + getR1_product() + ", getR1_total()=" + getR1_total() + ", getR2_product()="
				+ getR2_product() + ", getR2_total()=" + getR2_total() + ", getR3_product()=" + getR3_product()
				+ ", getR3_total()=" + getR3_total() + ", getR4_product()=" + getR4_product() + ", getR4_total()="
				+ getR4_total() + ", getR5_product()=" + getR5_product() + ", getR5_total()=" + getR5_total()
				+ ", getR6_product()=" + getR6_product() + ", getR6_total()=" + getR6_total() + ", getR7_product()="
				+ getR7_product() + ", getR7_total()=" + getR7_total() + ", getR8_product()=" + getR8_product()
				+ ", getR8_total()=" + getR8_total() + ", getR9_product()=" + getR9_product() + ", getR9_total()="
				+ getR9_total() + ", getR10_product()=" + getR10_product() + ", getR10_total()=" + getR10_total()
				+ ", getR11_product()=" + getR11_product() + ", getR11_total()=" + getR11_total()
				+ ", getR12_product()=" + getR12_product() + ", getR12_total()=" + getR12_total()
				+ ", getR13_product()=" + getR13_product() + ", getR13_total()=" + getR13_total()
				+ ", getR14_product()=" + getR14_product() + ", getR14_total()=" + getR14_total()
				+ ", getR15_product()=" + getR15_product() + ", getR15_total()=" + getR15_total()
				+ ", getReport_date()=" + getReport_date() + ", getReport_from_date()=" + getReport_from_date()
				+ ", getReport_to_date()=" + getReport_to_date() + ", getEntity_flg()=" + getEntity_flg()
				+ ", getModify_flg()=" + getModify_flg() + ", getDel_flg()=" + getDel_flg() + ", getReport_code()="
				+ getReport_code() + ", getReport_submit_date()=" + getReport_submit_date() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS36_ENTITY(String r1_product, BigDecimal r1_total, String r2_product, BigDecimal r2_total,
			String r3_product, BigDecimal r3_total, String r4_product, BigDecimal r4_total, String r5_product,
			BigDecimal r5_total, String r6_product, String r6_total, String r7_product, String r7_total,
			String r8_product, BigDecimal r8_total, String r9_product, BigDecimal r9_total, String r10_product,
			BigDecimal r10_total, String r11_product, BigDecimal r11_total, String r12_product, BigDecimal r12_total,
			String r13_product, BigDecimal r13_total, String r14_product, BigDecimal r14_total, String r15_product,
			BigDecimal r15_total, Date report_date, Date report_from_date, Date report_to_date, String entity_flg,
			String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r1_product = r1_product;
		this.r1_total = r1_total;
		this.r2_product = r2_product;
		this.r2_total = r2_total;
		this.r3_product = r3_product;
		this.r3_total = r3_total;
		this.r4_product = r4_product;
		this.r4_total = r4_total;
		this.r5_product = r5_product;
		this.r5_total = r5_total;
		this.r6_product = r6_product;
		this.r6_total = r6_total;
		this.r7_product = r7_product;
		this.r7_total = r7_total;
		this.r8_product = r8_product;
		this.r8_total = r8_total;
		this.r9_product = r9_product;
		this.r9_total = r9_total;
		this.r10_product = r10_product;
		this.r10_total = r10_total;
		this.r11_product = r11_product;
		this.r11_total = r11_total;
		this.r12_product = r12_product;
		this.r12_total = r12_total;
		this.r13_product = r13_product;
		this.r13_total = r13_total;
		this.r14_product = r14_product;
		this.r14_total = r14_total;
		this.r15_product = r15_product;
		this.r15_total = r15_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS36_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


}

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
@Table(name="BRS5")
public class BRS5_ENTITY{
	
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
	private String	r16_product;
	private BigDecimal	r16_total;
	private String	r17_product;
	private BigDecimal	r17_total;
	private String	r18_product;
	private BigDecimal	r18_total;
	private String	r19_product;
	private BigDecimal	r19_total;
	private String	r20_product;
	private BigDecimal	r20_total;
	private String	r21_product;
	private BigDecimal	r21_total;
	private String	r22_product;
	private BigDecimal	r22_total;
	private String	r23_product;
	private BigDecimal	r23_total;
	private String	r24_product;
	private BigDecimal	r24_total;
	private String	r25_product;
	private BigDecimal	r25_total;
	private String	r26_product;
	private BigDecimal	r26_total;
	private String	r27_product;
	private BigDecimal	r27_total;
	private String	r28_product;
	private BigDecimal	r28_total;
	private String	r29_product;
	private BigDecimal	r29_total;
	private String	r30_product;
	private BigDecimal	r30_total;
	private String	r31_product;
	private BigDecimal	r31_total;
	private String	r32_product;
	private BigDecimal	r32_total;
	private String	r33_product;
	private BigDecimal	r33_total;
	private String	r34_product;
	private BigDecimal	r34_total;
	private String	r35_product;
	private BigDecimal	r35_total;
	private String	r36_product;
	private BigDecimal	r36_total;
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
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public BigDecimal getR16_total() {
		return r16_total;
	}
	public void setR16_total(BigDecimal r16_total) {
		this.r16_total = r16_total;
	}
	public String getR17_product() {
		return r17_product;
	}
	public void setR17_product(String r17_product) {
		this.r17_product = r17_product;
	}
	public BigDecimal getR17_total() {
		return r17_total;
	}
	public void setR17_total(BigDecimal r17_total) {
		this.r17_total = r17_total;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public BigDecimal getR18_total() {
		return r18_total;
	}
	public void setR18_total(BigDecimal r18_total) {
		this.r18_total = r18_total;
	}
	public String getR19_product() {
		return r19_product;
	}
	public void setR19_product(String r19_product) {
		this.r19_product = r19_product;
	}
	public BigDecimal getR19_total() {
		return r19_total;
	}
	public void setR19_total(BigDecimal r19_total) {
		this.r19_total = r19_total;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public BigDecimal getR20_total() {
		return r20_total;
	}
	public void setR20_total(BigDecimal r20_total) {
		this.r20_total = r20_total;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public BigDecimal getR21_total() {
		return r21_total;
	}
	public void setR21_total(BigDecimal r21_total) {
		this.r21_total = r21_total;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public BigDecimal getR22_total() {
		return r22_total;
	}
	public void setR22_total(BigDecimal r22_total) {
		this.r22_total = r22_total;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public BigDecimal getR23_total() {
		return r23_total;
	}
	public void setR23_total(BigDecimal r23_total) {
		this.r23_total = r23_total;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_total() {
		return r24_total;
	}
	public void setR24_total(BigDecimal r24_total) {
		this.r24_total = r24_total;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_total() {
		return r25_total;
	}
	public void setR25_total(BigDecimal r25_total) {
		this.r25_total = r25_total;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public BigDecimal getR26_total() {
		return r26_total;
	}
	public void setR26_total(BigDecimal r26_total) {
		this.r26_total = r26_total;
	}
	public String getR27_product() {
		return r27_product;
	}
	public void setR27_product(String r27_product) {
		this.r27_product = r27_product;
	}
	public BigDecimal getR27_total() {
		return r27_total;
	}
	public void setR27_total(BigDecimal r27_total) {
		this.r27_total = r27_total;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_total() {
		return r28_total;
	}
	public void setR28_total(BigDecimal r28_total) {
		this.r28_total = r28_total;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_total() {
		return r29_total;
	}
	public void setR29_total(BigDecimal r29_total) {
		this.r29_total = r29_total;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_total() {
		return r30_total;
	}
	public void setR30_total(BigDecimal r30_total) {
		this.r30_total = r30_total;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public BigDecimal getR31_total() {
		return r31_total;
	}
	public void setR31_total(BigDecimal r31_total) {
		this.r31_total = r31_total;
	}
	public String getR32_product() {
		return r32_product;
	}
	public void setR32_product(String r32_product) {
		this.r32_product = r32_product;
	}
	public BigDecimal getR32_total() {
		return r32_total;
	}
	public void setR32_total(BigDecimal r32_total) {
		this.r32_total = r32_total;
	}
	public String getR33_product() {
		return r33_product;
	}
	public void setR33_product(String r33_product) {
		this.r33_product = r33_product;
	}
	public BigDecimal getR33_total() {
		return r33_total;
	}
	public void setR33_total(BigDecimal r33_total) {
		this.r33_total = r33_total;
	}
	public String getR34_product() {
		return r34_product;
	}
	public void setR34_product(String r34_product) {
		this.r34_product = r34_product;
	}
	public BigDecimal getR34_total() {
		return r34_total;
	}
	public void setR34_total(BigDecimal r34_total) {
		this.r34_total = r34_total;
	}
	public String getR35_product() {
		return r35_product;
	}
	public void setR35_product(String r35_product) {
		this.r35_product = r35_product;
	}
	public BigDecimal getR35_total() {
		return r35_total;
	}
	public void setR35_total(BigDecimal r35_total) {
		this.r35_total = r35_total;
	}
	public String getR36_product() {
		return r36_product;
	}
	public void setR36_product(String r36_product) {
		this.r36_product = r36_product;
	}
	public BigDecimal getR36_total() {
		return r36_total;
	}
	public void setR36_total(BigDecimal r36_total) {
		this.r36_total = r36_total;
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
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public BRS5_ENTITY() {
		super();
	}
	
	


}

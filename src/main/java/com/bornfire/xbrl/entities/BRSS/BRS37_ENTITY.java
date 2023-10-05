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
@Table(name="M_LA3")
public class BRS37_ENTITY {
	
	private String	r10_product;
	private BigDecimal	r10_no_of_acs;
	private BigDecimal	r10_original_amount;
	private BigDecimal	r10_amount_outstanding;
	private String	r11_product;
	private BigDecimal	r11_no_of_acs;
	private BigDecimal	r11_original_amount;
	private BigDecimal	r11_amount_outstanding;
	private String	r12_product;
	private BigDecimal	r12_no_of_acs;
	private BigDecimal	r12_original_amount;
	private BigDecimal	r12_amount_outstanding;
	private String	r13_product;
	private BigDecimal	r13_no_of_acs;
	private BigDecimal	r13_original_amount;
	private BigDecimal	r13_amount_outstanding;
	private String	r14_product;
	private BigDecimal	r14_no_of_acs;
	private BigDecimal	r14_original_amount;
	private BigDecimal	r14_amount_outstanding;
	private String	r15_product;
	private BigDecimal	r15_no_of_acs;
	private BigDecimal	r15_original_amount;
	private BigDecimal	r15_amount_outstanding;
	private String	r16_product;
	private BigDecimal	r16_no_of_acs;
	private BigDecimal	r16_original_amount;
	private BigDecimal	r16_amount_outstanding;
	private String	r21_product;
	private BigDecimal	r21_no_of_acs;
	private BigDecimal	r21_original_amount;
	private BigDecimal	r21_amount_outstanding;
	private String	r22_product;
	private BigDecimal	r22_no_of_acs;
	private BigDecimal	r22_original_amount;
	private BigDecimal	r22_amount_outstanding;
	private String	r23_product;
	private BigDecimal	r23_no_of_acs;
	private BigDecimal	r23_original_amount;
	private BigDecimal	r23_amount_outstanding;
	private String	r24_product;
	private BigDecimal	r24_no_of_acs;
	private BigDecimal	r24_original_amount;
	private BigDecimal	r24_amount_outstanding;
	private String	r25_product;
	private BigDecimal	r25_no_of_acs;
	private BigDecimal	r25_original_amount;
	private BigDecimal	r25_amount_outstanding;
	private String	r26_product;
	private BigDecimal	r26_no_of_acs;
	private BigDecimal	r26_original_amount;
	private BigDecimal	r26_amount_outstanding;
	private String	r27_product;
	private BigDecimal	r27_no_of_acs;
	private BigDecimal	r27_original_amount;
	private BigDecimal	r27_amount_outstanding;
	private String	r28_product;
	private BigDecimal	r28_no_of_acs;
	private BigDecimal	r28_original_amount;
	private BigDecimal	r28_amount_outstanding;
	private String	r29_product;
	private BigDecimal	r29_no_of_acs;
	private BigDecimal	r29_original_amount;
	private BigDecimal	r29_amount_outstanding;
	private String	r30_product;
	private BigDecimal	r30_no_of_acs;
	private BigDecimal	r30_original_amount;
	private BigDecimal	r30_amount_outstanding;
	private String	r31_product;
	private BigDecimal	r31_no_of_acs;
	private BigDecimal	r31_original_amount;
	private BigDecimal	r31_amount_outstanding;
	private String	r32_product;
	private BigDecimal	r32_no_of_acs;
	private BigDecimal	r32_original_amount;
	private BigDecimal	r32_amount_outstanding;
	private String	r37_product;
	private BigDecimal	r37_no_of_acs;
	private BigDecimal	r37_original_amount;
	private BigDecimal	r37_amount_outstanding;
	private String	r38_product;
	private BigDecimal	r38_no_of_acs;
	private BigDecimal	r38_original_amount;
	private BigDecimal	r38_amount_outstanding;
	private String	r39_product;
	private BigDecimal	r39_no_of_acs;
	private BigDecimal	r39_original_amount;
	private BigDecimal	r39_amount_outstanding;
	private String	r40_product;
	private BigDecimal	r40_no_of_acs;
	private BigDecimal	r40_original_amount;
	private BigDecimal	r40_amount_outstanding;
	private String	r41_product;
	private BigDecimal	r41_no_of_acs;
	private BigDecimal	r41_original_amount;
	private BigDecimal	r41_amount_outstanding;
	private String	r42_product;
	private BigDecimal	r42_no_of_acs;
	private BigDecimal	r42_original_amount;
	private BigDecimal	r42_amount_outstanding;
	private String	r43_product;
	private BigDecimal	r43_no_of_acs;
	private BigDecimal	r43_original_amount;
	private BigDecimal	r43_amount_outstanding;
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
	public String getR10_product() {
		return r10_product;
	}
	public void setR10_product(String r10_product) {
		this.r10_product = r10_product;
	}
	public BigDecimal getR10_no_of_acs() {
		return r10_no_of_acs;
	}
	public void setR10_no_of_acs(BigDecimal r10_no_of_acs) {
		this.r10_no_of_acs = r10_no_of_acs;
	}
	public BigDecimal getR10_original_amount() {
		return r10_original_amount;
	}
	public void setR10_original_amount(BigDecimal r10_original_amount) {
		this.r10_original_amount = r10_original_amount;
	}
	public BigDecimal getR10_amount_outstanding() {
		return r10_amount_outstanding;
	}
	public void setR10_amount_outstanding(BigDecimal r10_amount_outstanding) {
		this.r10_amount_outstanding = r10_amount_outstanding;
	}
	public String getR11_product() {
		return r11_product;
	}
	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}
	public BigDecimal getR11_no_of_acs() {
		return r11_no_of_acs;
	}
	public void setR11_no_of_acs(BigDecimal r11_no_of_acs) {
		this.r11_no_of_acs = r11_no_of_acs;
	}
	public BigDecimal getR11_original_amount() {
		return r11_original_amount;
	}
	public void setR11_original_amount(BigDecimal r11_original_amount) {
		this.r11_original_amount = r11_original_amount;
	}
	public BigDecimal getR11_amount_outstanding() {
		return r11_amount_outstanding;
	}
	public void setR11_amount_outstanding(BigDecimal r11_amount_outstanding) {
		this.r11_amount_outstanding = r11_amount_outstanding;
	}
	public String getR12_product() {
		return r12_product;
	}
	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}
	public BigDecimal getR12_no_of_acs() {
		return r12_no_of_acs;
	}
	public void setR12_no_of_acs(BigDecimal r12_no_of_acs) {
		this.r12_no_of_acs = r12_no_of_acs;
	}
	public BigDecimal getR12_original_amount() {
		return r12_original_amount;
	}
	public void setR12_original_amount(BigDecimal r12_original_amount) {
		this.r12_original_amount = r12_original_amount;
	}
	public BigDecimal getR12_amount_outstanding() {
		return r12_amount_outstanding;
	}
	public void setR12_amount_outstanding(BigDecimal r12_amount_outstanding) {
		this.r12_amount_outstanding = r12_amount_outstanding;
	}
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public BigDecimal getR13_no_of_acs() {
		return r13_no_of_acs;
	}
	public void setR13_no_of_acs(BigDecimal r13_no_of_acs) {
		this.r13_no_of_acs = r13_no_of_acs;
	}
	public BigDecimal getR13_original_amount() {
		return r13_original_amount;
	}
	public void setR13_original_amount(BigDecimal r13_original_amount) {
		this.r13_original_amount = r13_original_amount;
	}
	public BigDecimal getR13_amount_outstanding() {
		return r13_amount_outstanding;
	}
	public void setR13_amount_outstanding(BigDecimal r13_amount_outstanding) {
		this.r13_amount_outstanding = r13_amount_outstanding;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public BigDecimal getR14_no_of_acs() {
		return r14_no_of_acs;
	}
	public void setR14_no_of_acs(BigDecimal r14_no_of_acs) {
		this.r14_no_of_acs = r14_no_of_acs;
	}
	public BigDecimal getR14_original_amount() {
		return r14_original_amount;
	}
	public void setR14_original_amount(BigDecimal r14_original_amount) {
		this.r14_original_amount = r14_original_amount;
	}
	public BigDecimal getR14_amount_outstanding() {
		return r14_amount_outstanding;
	}
	public void setR14_amount_outstanding(BigDecimal r14_amount_outstanding) {
		this.r14_amount_outstanding = r14_amount_outstanding;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public BigDecimal getR15_no_of_acs() {
		return r15_no_of_acs;
	}
	public void setR15_no_of_acs(BigDecimal r15_no_of_acs) {
		this.r15_no_of_acs = r15_no_of_acs;
	}
	public BigDecimal getR15_original_amount() {
		return r15_original_amount;
	}
	public void setR15_original_amount(BigDecimal r15_original_amount) {
		this.r15_original_amount = r15_original_amount;
	}
	public BigDecimal getR15_amount_outstanding() {
		return r15_amount_outstanding;
	}
	public void setR15_amount_outstanding(BigDecimal r15_amount_outstanding) {
		this.r15_amount_outstanding = r15_amount_outstanding;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public BigDecimal getR16_no_of_acs() {
		return r16_no_of_acs;
	}
	public void setR16_no_of_acs(BigDecimal r16_no_of_acs) {
		this.r16_no_of_acs = r16_no_of_acs;
	}
	public BigDecimal getR16_original_amount() {
		return r16_original_amount;
	}
	public void setR16_original_amount(BigDecimal r16_original_amount) {
		this.r16_original_amount = r16_original_amount;
	}
	public BigDecimal getR16_amount_outstanding() {
		return r16_amount_outstanding;
	}
	public void setR16_amount_outstanding(BigDecimal r16_amount_outstanding) {
		this.r16_amount_outstanding = r16_amount_outstanding;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public BigDecimal getR21_no_of_acs() {
		return r21_no_of_acs;
	}
	public void setR21_no_of_acs(BigDecimal r21_no_of_acs) {
		this.r21_no_of_acs = r21_no_of_acs;
	}
	public BigDecimal getR21_original_amount() {
		return r21_original_amount;
	}
	public void setR21_original_amount(BigDecimal r21_original_amount) {
		this.r21_original_amount = r21_original_amount;
	}
	public BigDecimal getR21_amount_outstanding() {
		return r21_amount_outstanding;
	}
	public void setR21_amount_outstanding(BigDecimal r21_amount_outstanding) {
		this.r21_amount_outstanding = r21_amount_outstanding;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public BigDecimal getR22_no_of_acs() {
		return r22_no_of_acs;
	}
	public void setR22_no_of_acs(BigDecimal r22_no_of_acs) {
		this.r22_no_of_acs = r22_no_of_acs;
	}
	public BigDecimal getR22_original_amount() {
		return r22_original_amount;
	}
	public void setR22_original_amount(BigDecimal r22_original_amount) {
		this.r22_original_amount = r22_original_amount;
	}
	public BigDecimal getR22_amount_outstanding() {
		return r22_amount_outstanding;
	}
	public void setR22_amount_outstanding(BigDecimal r22_amount_outstanding) {
		this.r22_amount_outstanding = r22_amount_outstanding;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public BigDecimal getR23_no_of_acs() {
		return r23_no_of_acs;
	}
	public void setR23_no_of_acs(BigDecimal r23_no_of_acs) {
		this.r23_no_of_acs = r23_no_of_acs;
	}
	public BigDecimal getR23_original_amount() {
		return r23_original_amount;
	}
	public void setR23_original_amount(BigDecimal r23_original_amount) {
		this.r23_original_amount = r23_original_amount;
	}
	public BigDecimal getR23_amount_outstanding() {
		return r23_amount_outstanding;
	}
	public void setR23_amount_outstanding(BigDecimal r23_amount_outstanding) {
		this.r23_amount_outstanding = r23_amount_outstanding;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_no_of_acs() {
		return r24_no_of_acs;
	}
	public void setR24_no_of_acs(BigDecimal r24_no_of_acs) {
		this.r24_no_of_acs = r24_no_of_acs;
	}
	public BigDecimal getR24_original_amount() {
		return r24_original_amount;
	}
	public void setR24_original_amount(BigDecimal r24_original_amount) {
		this.r24_original_amount = r24_original_amount;
	}
	public BigDecimal getR24_amount_outstanding() {
		return r24_amount_outstanding;
	}
	public void setR24_amount_outstanding(BigDecimal r24_amount_outstanding) {
		this.r24_amount_outstanding = r24_amount_outstanding;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_no_of_acs() {
		return r25_no_of_acs;
	}
	public void setR25_no_of_acs(BigDecimal r25_no_of_acs) {
		this.r25_no_of_acs = r25_no_of_acs;
	}
	public BigDecimal getR25_original_amount() {
		return r25_original_amount;
	}
	public void setR25_original_amount(BigDecimal r25_original_amount) {
		this.r25_original_amount = r25_original_amount;
	}
	public BigDecimal getR25_amount_outstanding() {
		return r25_amount_outstanding;
	}
	public void setR25_amount_outstanding(BigDecimal r25_amount_outstanding) {
		this.r25_amount_outstanding = r25_amount_outstanding;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public BigDecimal getR26_no_of_acs() {
		return r26_no_of_acs;
	}
	public void setR26_no_of_acs(BigDecimal r26_no_of_acs) {
		this.r26_no_of_acs = r26_no_of_acs;
	}
	public BigDecimal getR26_original_amount() {
		return r26_original_amount;
	}
	public void setR26_original_amount(BigDecimal r26_original_amount) {
		this.r26_original_amount = r26_original_amount;
	}
	public BigDecimal getR26_amount_outstanding() {
		return r26_amount_outstanding;
	}
	public void setR26_amount_outstanding(BigDecimal r26_amount_outstanding) {
		this.r26_amount_outstanding = r26_amount_outstanding;
	}
	public String getR27_product() {
		return r27_product;
	}
	public void setR27_product(String r27_product) {
		this.r27_product = r27_product;
	}
	public BigDecimal getR27_no_of_acs() {
		return r27_no_of_acs;
	}
	public void setR27_no_of_acs(BigDecimal r27_no_of_acs) {
		this.r27_no_of_acs = r27_no_of_acs;
	}
	public BigDecimal getR27_original_amount() {
		return r27_original_amount;
	}
	public void setR27_original_amount(BigDecimal r27_original_amount) {
		this.r27_original_amount = r27_original_amount;
	}
	public BigDecimal getR27_amount_outstanding() {
		return r27_amount_outstanding;
	}
	public void setR27_amount_outstanding(BigDecimal r27_amount_outstanding) {
		this.r27_amount_outstanding = r27_amount_outstanding;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_no_of_acs() {
		return r28_no_of_acs;
	}
	public void setR28_no_of_acs(BigDecimal r28_no_of_acs) {
		this.r28_no_of_acs = r28_no_of_acs;
	}
	public BigDecimal getR28_original_amount() {
		return r28_original_amount;
	}
	public void setR28_original_amount(BigDecimal r28_original_amount) {
		this.r28_original_amount = r28_original_amount;
	}
	public BigDecimal getR28_amount_outstanding() {
		return r28_amount_outstanding;
	}
	public void setR28_amount_outstanding(BigDecimal r28_amount_outstanding) {
		this.r28_amount_outstanding = r28_amount_outstanding;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_no_of_acs() {
		return r29_no_of_acs;
	}
	public void setR29_no_of_acs(BigDecimal r29_no_of_acs) {
		this.r29_no_of_acs = r29_no_of_acs;
	}
	public BigDecimal getR29_original_amount() {
		return r29_original_amount;
	}
	public void setR29_original_amount(BigDecimal r29_original_amount) {
		this.r29_original_amount = r29_original_amount;
	}
	public BigDecimal getR29_amount_outstanding() {
		return r29_amount_outstanding;
	}
	public void setR29_amount_outstanding(BigDecimal r29_amount_outstanding) {
		this.r29_amount_outstanding = r29_amount_outstanding;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_no_of_acs() {
		return r30_no_of_acs;
	}
	public void setR30_no_of_acs(BigDecimal r30_no_of_acs) {
		this.r30_no_of_acs = r30_no_of_acs;
	}
	public BigDecimal getR30_original_amount() {
		return r30_original_amount;
	}
	public void setR30_original_amount(BigDecimal r30_original_amount) {
		this.r30_original_amount = r30_original_amount;
	}
	public BigDecimal getR30_amount_outstanding() {
		return r30_amount_outstanding;
	}
	public void setR30_amount_outstanding(BigDecimal r30_amount_outstanding) {
		this.r30_amount_outstanding = r30_amount_outstanding;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public BigDecimal getR31_no_of_acs() {
		return r31_no_of_acs;
	}
	public void setR31_no_of_acs(BigDecimal r31_no_of_acs) {
		this.r31_no_of_acs = r31_no_of_acs;
	}
	public BigDecimal getR31_original_amount() {
		return r31_original_amount;
	}
	public void setR31_original_amount(BigDecimal r31_original_amount) {
		this.r31_original_amount = r31_original_amount;
	}
	public BigDecimal getR31_amount_outstanding() {
		return r31_amount_outstanding;
	}
	public void setR31_amount_outstanding(BigDecimal r31_amount_outstanding) {
		this.r31_amount_outstanding = r31_amount_outstanding;
	}
	public String getR32_product() {
		return r32_product;
	}
	public void setR32_product(String r32_product) {
		this.r32_product = r32_product;
	}
	public BigDecimal getR32_no_of_acs() {
		return r32_no_of_acs;
	}
	public void setR32_no_of_acs(BigDecimal r32_no_of_acs) {
		this.r32_no_of_acs = r32_no_of_acs;
	}
	public BigDecimal getR32_original_amount() {
		return r32_original_amount;
	}
	public void setR32_original_amount(BigDecimal r32_original_amount) {
		this.r32_original_amount = r32_original_amount;
	}
	public BigDecimal getR32_amount_outstanding() {
		return r32_amount_outstanding;
	}
	public void setR32_amount_outstanding(BigDecimal r32_amount_outstanding) {
		this.r32_amount_outstanding = r32_amount_outstanding;
	}
	public String getR37_product() {
		return r37_product;
	}
	public void setR37_product(String r37_product) {
		this.r37_product = r37_product;
	}
	public BigDecimal getR37_no_of_acs() {
		return r37_no_of_acs;
	}
	public void setR37_no_of_acs(BigDecimal r37_no_of_acs) {
		this.r37_no_of_acs = r37_no_of_acs;
	}
	public BigDecimal getR37_original_amount() {
		return r37_original_amount;
	}
	public void setR37_original_amount(BigDecimal r37_original_amount) {
		this.r37_original_amount = r37_original_amount;
	}
	public BigDecimal getR37_amount_outstanding() {
		return r37_amount_outstanding;
	}
	public void setR37_amount_outstanding(BigDecimal r37_amount_outstanding) {
		this.r37_amount_outstanding = r37_amount_outstanding;
	}
	public String getR38_product() {
		return r38_product;
	}
	public void setR38_product(String r38_product) {
		this.r38_product = r38_product;
	}
	public BigDecimal getR38_no_of_acs() {
		return r38_no_of_acs;
	}
	public void setR38_no_of_acs(BigDecimal r38_no_of_acs) {
		this.r38_no_of_acs = r38_no_of_acs;
	}
	public BigDecimal getR38_original_amount() {
		return r38_original_amount;
	}
	public void setR38_original_amount(BigDecimal r38_original_amount) {
		this.r38_original_amount = r38_original_amount;
	}
	public BigDecimal getR38_amount_outstanding() {
		return r38_amount_outstanding;
	}
	public void setR38_amount_outstanding(BigDecimal r38_amount_outstanding) {
		this.r38_amount_outstanding = r38_amount_outstanding;
	}
	public String getR39_product() {
		return r39_product;
	}
	public void setR39_product(String r39_product) {
		this.r39_product = r39_product;
	}
	public BigDecimal getR39_no_of_acs() {
		return r39_no_of_acs;
	}
	public void setR39_no_of_acs(BigDecimal r39_no_of_acs) {
		this.r39_no_of_acs = r39_no_of_acs;
	}
	public BigDecimal getR39_original_amount() {
		return r39_original_amount;
	}
	public void setR39_original_amount(BigDecimal r39_original_amount) {
		this.r39_original_amount = r39_original_amount;
	}
	public BigDecimal getR39_amount_outstanding() {
		return r39_amount_outstanding;
	}
	public void setR39_amount_outstanding(BigDecimal r39_amount_outstanding) {
		this.r39_amount_outstanding = r39_amount_outstanding;
	}
	public String getR40_product() {
		return r40_product;
	}
	public void setR40_product(String r40_product) {
		this.r40_product = r40_product;
	}
	public BigDecimal getR40_no_of_acs() {
		return r40_no_of_acs;
	}
	public void setR40_no_of_acs(BigDecimal r40_no_of_acs) {
		this.r40_no_of_acs = r40_no_of_acs;
	}
	public BigDecimal getR40_original_amount() {
		return r40_original_amount;
	}
	public void setR40_original_amount(BigDecimal r40_original_amount) {
		this.r40_original_amount = r40_original_amount;
	}
	public BigDecimal getR40_amount_outstanding() {
		return r40_amount_outstanding;
	}
	public void setR40_amount_outstanding(BigDecimal r40_amount_outstanding) {
		this.r40_amount_outstanding = r40_amount_outstanding;
	}
	public String getR41_product() {
		return r41_product;
	}
	public void setR41_product(String r41_product) {
		this.r41_product = r41_product;
	}
	public BigDecimal getR41_no_of_acs() {
		return r41_no_of_acs;
	}
	public void setR41_no_of_acs(BigDecimal r41_no_of_acs) {
		this.r41_no_of_acs = r41_no_of_acs;
	}
	public BigDecimal getR41_original_amount() {
		return r41_original_amount;
	}
	public void setR41_original_amount(BigDecimal r41_original_amount) {
		this.r41_original_amount = r41_original_amount;
	}
	public BigDecimal getR41_amount_outstanding() {
		return r41_amount_outstanding;
	}
	public void setR41_amount_outstanding(BigDecimal r41_amount_outstanding) {
		this.r41_amount_outstanding = r41_amount_outstanding;
	}
	public String getR42_product() {
		return r42_product;
	}
	public void setR42_product(String r42_product) {
		this.r42_product = r42_product;
	}
	public BigDecimal getR42_no_of_acs() {
		return r42_no_of_acs;
	}
	public void setR42_no_of_acs(BigDecimal r42_no_of_acs) {
		this.r42_no_of_acs = r42_no_of_acs;
	}
	public BigDecimal getR42_original_amount() {
		return r42_original_amount;
	}
	public void setR42_original_amount(BigDecimal r42_original_amount) {
		this.r42_original_amount = r42_original_amount;
	}
	public BigDecimal getR42_amount_outstanding() {
		return r42_amount_outstanding;
	}
	public void setR42_amount_outstanding(BigDecimal r42_amount_outstanding) {
		this.r42_amount_outstanding = r42_amount_outstanding;
	}
	public String getR43_product() {
		return r43_product;
	}
	public void setR43_product(String r43_product) {
		this.r43_product = r43_product;
	}
	public BigDecimal getR43_no_of_acs() {
		return r43_no_of_acs;
	}
	public void setR43_no_of_acs(BigDecimal r43_no_of_acs) {
		this.r43_no_of_acs = r43_no_of_acs;
	}
	public BigDecimal getR43_original_amount() {
		return r43_original_amount;
	}
	public void setR43_original_amount(BigDecimal r43_original_amount) {
		this.r43_original_amount = r43_original_amount;
	}
	public BigDecimal getR43_amount_outstanding() {
		return r43_amount_outstanding;
	}
	public void setR43_amount_outstanding(BigDecimal r43_amount_outstanding) {
		this.r43_amount_outstanding = r43_amount_outstanding;
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
	@Override
	public String toString() {
		return "BRS37_ENTITY [r10_product=" + r10_product + ", r10_no_of_acs=" + r10_no_of_acs
				+ ", r10_original_amount=" + r10_original_amount + ", r10_amount_outstanding=" + r10_amount_outstanding
				+ ", r11_product=" + r11_product + ", r11_no_of_acs=" + r11_no_of_acs + ", r11_original_amount="
				+ r11_original_amount + ", r11_amount_outstanding=" + r11_amount_outstanding + ", r12_product="
				+ r12_product + ", r12_no_of_acs=" + r12_no_of_acs + ", r12_original_amount=" + r12_original_amount
				+ ", r12_amount_outstanding=" + r12_amount_outstanding + ", r13_product=" + r13_product
				+ ", r13_no_of_acs=" + r13_no_of_acs + ", r13_original_amount=" + r13_original_amount
				+ ", r13_amount_outstanding=" + r13_amount_outstanding + ", r14_product=" + r14_product
				+ ", r14_no_of_acs=" + r14_no_of_acs + ", r14_original_amount=" + r14_original_amount
				+ ", r14_amount_outstanding=" + r14_amount_outstanding + ", r15_product=" + r15_product
				+ ", r15_no_of_acs=" + r15_no_of_acs + ", r15_original_amount=" + r15_original_amount
				+ ", r15_amount_outstanding=" + r15_amount_outstanding + ", r16_product=" + r16_product
				+ ", r16_no_of_acs=" + r16_no_of_acs + ", r16_original_amount=" + r16_original_amount
				+ ", r16_amount_outstanding=" + r16_amount_outstanding + ", r21_product=" + r21_product
				+ ", r21_no_of_acs=" + r21_no_of_acs + ", r21_original_amount=" + r21_original_amount
				+ ", r21_amount_outstanding=" + r21_amount_outstanding + ", r22_product=" + r22_product
				+ ", r22_no_of_acs=" + r22_no_of_acs + ", r22_original_amount=" + r22_original_amount
				+ ", r22_amount_outstanding=" + r22_amount_outstanding + ", r23_product=" + r23_product
				+ ", r23_no_of_acs=" + r23_no_of_acs + ", r23_original_amount=" + r23_original_amount
				+ ", r23_amount_outstanding=" + r23_amount_outstanding + ", r24_product=" + r24_product
				+ ", r24_no_of_acs=" + r24_no_of_acs + ", r24_original_amount=" + r24_original_amount
				+ ", r24_amount_outstanding=" + r24_amount_outstanding + ", r25_product=" + r25_product
				+ ", r25_no_of_acs=" + r25_no_of_acs + ", r25_original_amount=" + r25_original_amount
				+ ", r25_amount_outstanding=" + r25_amount_outstanding + ", r26_product=" + r26_product
				+ ", r26_no_of_acs=" + r26_no_of_acs + ", r26_original_amount=" + r26_original_amount
				+ ", r26_amount_outstanding=" + r26_amount_outstanding + ", r27_product=" + r27_product
				+ ", r27_no_of_acs=" + r27_no_of_acs + ", r27_original_amount=" + r27_original_amount
				+ ", r27_amount_outstanding=" + r27_amount_outstanding + ", r28_product=" + r28_product
				+ ", r28_no_of_acs=" + r28_no_of_acs + ", r28_original_amount=" + r28_original_amount
				+ ", r28_amount_outstanding=" + r28_amount_outstanding + ", r29_product=" + r29_product
				+ ", r29_no_of_acs=" + r29_no_of_acs + ", r29_original_amount=" + r29_original_amount
				+ ", r29_amount_outstanding=" + r29_amount_outstanding + ", r30_product=" + r30_product
				+ ", r30_no_of_acs=" + r30_no_of_acs + ", r30_original_amount=" + r30_original_amount
				+ ", r30_amount_outstanding=" + r30_amount_outstanding + ", r31_product=" + r31_product
				+ ", r31_no_of_acs=" + r31_no_of_acs + ", r31_original_amount=" + r31_original_amount
				+ ", r31_amount_outstanding=" + r31_amount_outstanding + ", r32_product=" + r32_product
				+ ", r32_no_of_acs=" + r32_no_of_acs + ", r32_original_amount=" + r32_original_amount
				+ ", r32_amount_outstanding=" + r32_amount_outstanding + ", r37_product=" + r37_product
				+ ", r37_no_of_acs=" + r37_no_of_acs + ", r37_original_amount=" + r37_original_amount
				+ ", r37_amount_outstanding=" + r37_amount_outstanding + ", r38_product=" + r38_product
				+ ", r38_no_of_acs=" + r38_no_of_acs + ", r38_original_amount=" + r38_original_amount
				+ ", r38_amount_outstanding=" + r38_amount_outstanding + ", r39_product=" + r39_product
				+ ", r39_no_of_acs=" + r39_no_of_acs + ", r39_original_amount=" + r39_original_amount
				+ ", r39_amount_outstanding=" + r39_amount_outstanding + ", r40_product=" + r40_product
				+ ", r40_no_of_acs=" + r40_no_of_acs + ", r40_original_amount=" + r40_original_amount
				+ ", r40_amount_outstanding=" + r40_amount_outstanding + ", r41_product=" + r41_product
				+ ", r41_no_of_acs=" + r41_no_of_acs + ", r41_original_amount=" + r41_original_amount
				+ ", r41_amount_outstanding=" + r41_amount_outstanding + ", r42_product=" + r42_product
				+ ", r42_no_of_acs=" + r42_no_of_acs + ", r42_original_amount=" + r42_original_amount
				+ ", r42_amount_outstanding=" + r42_amount_outstanding + ", r43_product=" + r43_product
				+ ", r43_no_of_acs=" + r43_no_of_acs + ", r43_original_amount=" + r43_original_amount
				+ ", r43_amount_outstanding=" + r43_amount_outstanding + ", report_date=" + report_date
				+ ", report_from_date=" + report_from_date + ", report_to_date=" + report_to_date + ", entity_flg="
				+ entity_flg + ", modify_flg=" + modify_flg + ", del_flg=" + del_flg + ", report_code=" + report_code
				+ ", getR10_product()=" + getR10_product() + ", getR10_no_of_acs()=" + getR10_no_of_acs()
				+ ", getR10_original_amount()=" + getR10_original_amount() + ", getR10_amount_outstanding()="
				+ getR10_amount_outstanding() + ", getR11_product()=" + getR11_product() + ", getR11_no_of_acs()="
				+ getR11_no_of_acs() + ", getR11_original_amount()=" + getR11_original_amount()
				+ ", getR11_amount_outstanding()=" + getR11_amount_outstanding() + ", getR12_product()="
				+ getR12_product() + ", getR12_no_of_acs()=" + getR12_no_of_acs() + ", getR12_original_amount()="
				+ getR12_original_amount() + ", getR12_amount_outstanding()=" + getR12_amount_outstanding()
				+ ", getR13_product()=" + getR13_product() + ", getR13_no_of_acs()=" + getR13_no_of_acs()
				+ ", getR13_original_amount()=" + getR13_original_amount() + ", getR13_amount_outstanding()="
				+ getR13_amount_outstanding() + ", getR14_product()=" + getR14_product() + ", getR14_no_of_acs()="
				+ getR14_no_of_acs() + ", getR14_original_amount()=" + getR14_original_amount()
				+ ", getR14_amount_outstanding()=" + getR14_amount_outstanding() + ", getR15_product()="
				+ getR15_product() + ", getR15_no_of_acs()=" + getR15_no_of_acs() + ", getR15_original_amount()="
				+ getR15_original_amount() + ", getR15_amount_outstanding()=" + getR15_amount_outstanding()
				+ ", getR16_product()=" + getR16_product() + ", getR16_no_of_acs()=" + getR16_no_of_acs()
				+ ", getR16_original_amount()=" + getR16_original_amount() + ", getR16_amount_outstanding()="
				+ getR16_amount_outstanding() + ", getR21_product()=" + getR21_product() + ", getR21_no_of_acs()="
				+ getR21_no_of_acs() + ", getR21_original_amount()=" + getR21_original_amount()
				+ ", getR21_amount_outstanding()=" + getR21_amount_outstanding() + ", getR22_product()="
				+ getR22_product() + ", getR22_no_of_acs()=" + getR22_no_of_acs() + ", getR22_original_amount()="
				+ getR22_original_amount() + ", getR22_amount_outstanding()=" + getR22_amount_outstanding()
				+ ", getR23_product()=" + getR23_product() + ", getR23_no_of_acs()=" + getR23_no_of_acs()
				+ ", getR23_original_amount()=" + getR23_original_amount() + ", getR23_amount_outstanding()="
				+ getR23_amount_outstanding() + ", getR24_product()=" + getR24_product() + ", getR24_no_of_acs()="
				+ getR24_no_of_acs() + ", getR24_original_amount()=" + getR24_original_amount()
				+ ", getR24_amount_outstanding()=" + getR24_amount_outstanding() + ", getR25_product()="
				+ getR25_product() + ", getR25_no_of_acs()=" + getR25_no_of_acs() + ", getR25_original_amount()="
				+ getR25_original_amount() + ", getR25_amount_outstanding()=" + getR25_amount_outstanding()
				+ ", getR26_product()=" + getR26_product() + ", getR26_no_of_acs()=" + getR26_no_of_acs()
				+ ", getR26_original_amount()=" + getR26_original_amount() + ", getR26_amount_outstanding()="
				+ getR26_amount_outstanding() + ", getR27_product()=" + getR27_product() + ", getR27_no_of_acs()="
				+ getR27_no_of_acs() + ", getR27_original_amount()=" + getR27_original_amount()
				+ ", getR27_amount_outstanding()=" + getR27_amount_outstanding() + ", getR28_product()="
				+ getR28_product() + ", getR28_no_of_acs()=" + getR28_no_of_acs() + ", getR28_original_amount()="
				+ getR28_original_amount() + ", getR28_amount_outstanding()=" + getR28_amount_outstanding()
				+ ", getR29_product()=" + getR29_product() + ", getR29_no_of_acs()=" + getR29_no_of_acs()
				+ ", getR29_original_amount()=" + getR29_original_amount() + ", getR29_amount_outstanding()="
				+ getR29_amount_outstanding() + ", getR30_product()=" + getR30_product() + ", getR30_no_of_acs()="
				+ getR30_no_of_acs() + ", getR30_original_amount()=" + getR30_original_amount()
				+ ", getR30_amount_outstanding()=" + getR30_amount_outstanding() + ", getR31_product()="
				+ getR31_product() + ", getR31_no_of_acs()=" + getR31_no_of_acs() + ", getR31_original_amount()="
				+ getR31_original_amount() + ", getR31_amount_outstanding()=" + getR31_amount_outstanding()
				+ ", getR32_product()=" + getR32_product() + ", getR32_no_of_acs()=" + getR32_no_of_acs()
				+ ", getR32_original_amount()=" + getR32_original_amount() + ", getR32_amount_outstanding()="
				+ getR32_amount_outstanding() + ", getR37_product()=" + getR37_product() + ", getR37_no_of_acs()="
				+ getR37_no_of_acs() + ", getR37_original_amount()=" + getR37_original_amount()
				+ ", getR37_amount_outstanding()=" + getR37_amount_outstanding() + ", getR38_product()="
				+ getR38_product() + ", getR38_no_of_acs()=" + getR38_no_of_acs() + ", getR38_original_amount()="
				+ getR38_original_amount() + ", getR38_amount_outstanding()=" + getR38_amount_outstanding()
				+ ", getR39_product()=" + getR39_product() + ", getR39_no_of_acs()=" + getR39_no_of_acs()
				+ ", getR39_original_amount()=" + getR39_original_amount() + ", getR39_amount_outstanding()="
				+ getR39_amount_outstanding() + ", getR40_product()=" + getR40_product() + ", getR40_no_of_acs()="
				+ getR40_no_of_acs() + ", getR40_original_amount()=" + getR40_original_amount()
				+ ", getR40_amount_outstanding()=" + getR40_amount_outstanding() + ", getR41_product()="
				+ getR41_product() + ", getR41_no_of_acs()=" + getR41_no_of_acs() + ", getR41_original_amount()="
				+ getR41_original_amount() + ", getR41_amount_outstanding()=" + getR41_amount_outstanding()
				+ ", getR42_product()=" + getR42_product() + ", getR42_no_of_acs()=" + getR42_no_of_acs()
				+ ", getR42_original_amount()=" + getR42_original_amount() + ", getR42_amount_outstanding()="
				+ getR42_amount_outstanding() + ", getR43_product()=" + getR43_product() + ", getR43_no_of_acs()="
				+ getR43_no_of_acs() + ", getR43_original_amount()=" + getR43_original_amount()
				+ ", getR43_amount_outstanding()=" + getR43_amount_outstanding() + ", getReport_date()="
				+ getReport_date() + ", getReport_from_date()=" + getReport_from_date() + ", getReport_to_date()="
				+ getReport_to_date() + ", getEntity_flg()=" + getEntity_flg() + ", getModify_flg()=" + getModify_flg()
				+ ", getDel_flg()=" + getDel_flg() + ", getReport_code()=" + getReport_code() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS37_ENTITY(String r10_product, BigDecimal r10_no_of_acs, BigDecimal r10_original_amount,
			BigDecimal r10_amount_outstanding, String r11_product, BigDecimal r11_no_of_acs,
			BigDecimal r11_original_amount, BigDecimal r11_amount_outstanding, String r12_product,
			BigDecimal r12_no_of_acs, BigDecimal r12_original_amount, BigDecimal r12_amount_outstanding,
			String r13_product, BigDecimal r13_no_of_acs, BigDecimal r13_original_amount,
			BigDecimal r13_amount_outstanding, String r14_product, BigDecimal r14_no_of_acs,
			BigDecimal r14_original_amount, BigDecimal r14_amount_outstanding, String r15_product,
			BigDecimal r15_no_of_acs, BigDecimal r15_original_amount, BigDecimal r15_amount_outstanding,
			String r16_product, BigDecimal r16_no_of_acs, BigDecimal r16_original_amount,
			BigDecimal r16_amount_outstanding, String r21_product, BigDecimal r21_no_of_acs,
			BigDecimal r21_original_amount, BigDecimal r21_amount_outstanding, String r22_product,
			BigDecimal r22_no_of_acs, BigDecimal r22_original_amount, BigDecimal r22_amount_outstanding,
			String r23_product, BigDecimal r23_no_of_acs, BigDecimal r23_original_amount,
			BigDecimal r23_amount_outstanding, String r24_product, BigDecimal r24_no_of_acs,
			BigDecimal r24_original_amount, BigDecimal r24_amount_outstanding, String r25_product,
			BigDecimal r25_no_of_acs, BigDecimal r25_original_amount, BigDecimal r25_amount_outstanding,
			String r26_product, BigDecimal r26_no_of_acs, BigDecimal r26_original_amount,
			BigDecimal r26_amount_outstanding, String r27_product, BigDecimal r27_no_of_acs,
			BigDecimal r27_original_amount, BigDecimal r27_amount_outstanding, String r28_product,
			BigDecimal r28_no_of_acs, BigDecimal r28_original_amount, BigDecimal r28_amount_outstanding,
			String r29_product, BigDecimal r29_no_of_acs, BigDecimal r29_original_amount,
			BigDecimal r29_amount_outstanding, String r30_product, BigDecimal r30_no_of_acs,
			BigDecimal r30_original_amount, BigDecimal r30_amount_outstanding, String r31_product,
			BigDecimal r31_no_of_acs, BigDecimal r31_original_amount, BigDecimal r31_amount_outstanding,
			String r32_product, BigDecimal r32_no_of_acs, BigDecimal r32_original_amount,
			BigDecimal r32_amount_outstanding, String r37_product, BigDecimal r37_no_of_acs,
			BigDecimal r37_original_amount, BigDecimal r37_amount_outstanding, String r38_product,
			BigDecimal r38_no_of_acs, BigDecimal r38_original_amount, BigDecimal r38_amount_outstanding,
			String r39_product, BigDecimal r39_no_of_acs, BigDecimal r39_original_amount,
			BigDecimal r39_amount_outstanding, String r40_product, BigDecimal r40_no_of_acs,
			BigDecimal r40_original_amount, BigDecimal r40_amount_outstanding, String r41_product,
			BigDecimal r41_no_of_acs, BigDecimal r41_original_amount, BigDecimal r41_amount_outstanding,
			String r42_product, BigDecimal r42_no_of_acs, BigDecimal r42_original_amount,
			BigDecimal r42_amount_outstanding, String r43_product, BigDecimal r43_no_of_acs,
			BigDecimal r43_original_amount, BigDecimal r43_amount_outstanding, Date report_date, Date report_from_date,
			Date report_to_date, String entity_flg, String modify_flg, String del_flg, String report_code) {
		super();
		this.r10_product = r10_product;
		this.r10_no_of_acs = r10_no_of_acs;
		this.r10_original_amount = r10_original_amount;
		this.r10_amount_outstanding = r10_amount_outstanding;
		this.r11_product = r11_product;
		this.r11_no_of_acs = r11_no_of_acs;
		this.r11_original_amount = r11_original_amount;
		this.r11_amount_outstanding = r11_amount_outstanding;
		this.r12_product = r12_product;
		this.r12_no_of_acs = r12_no_of_acs;
		this.r12_original_amount = r12_original_amount;
		this.r12_amount_outstanding = r12_amount_outstanding;
		this.r13_product = r13_product;
		this.r13_no_of_acs = r13_no_of_acs;
		this.r13_original_amount = r13_original_amount;
		this.r13_amount_outstanding = r13_amount_outstanding;
		this.r14_product = r14_product;
		this.r14_no_of_acs = r14_no_of_acs;
		this.r14_original_amount = r14_original_amount;
		this.r14_amount_outstanding = r14_amount_outstanding;
		this.r15_product = r15_product;
		this.r15_no_of_acs = r15_no_of_acs;
		this.r15_original_amount = r15_original_amount;
		this.r15_amount_outstanding = r15_amount_outstanding;
		this.r16_product = r16_product;
		this.r16_no_of_acs = r16_no_of_acs;
		this.r16_original_amount = r16_original_amount;
		this.r16_amount_outstanding = r16_amount_outstanding;
		this.r21_product = r21_product;
		this.r21_no_of_acs = r21_no_of_acs;
		this.r21_original_amount = r21_original_amount;
		this.r21_amount_outstanding = r21_amount_outstanding;
		this.r22_product = r22_product;
		this.r22_no_of_acs = r22_no_of_acs;
		this.r22_original_amount = r22_original_amount;
		this.r22_amount_outstanding = r22_amount_outstanding;
		this.r23_product = r23_product;
		this.r23_no_of_acs = r23_no_of_acs;
		this.r23_original_amount = r23_original_amount;
		this.r23_amount_outstanding = r23_amount_outstanding;
		this.r24_product = r24_product;
		this.r24_no_of_acs = r24_no_of_acs;
		this.r24_original_amount = r24_original_amount;
		this.r24_amount_outstanding = r24_amount_outstanding;
		this.r25_product = r25_product;
		this.r25_no_of_acs = r25_no_of_acs;
		this.r25_original_amount = r25_original_amount;
		this.r25_amount_outstanding = r25_amount_outstanding;
		this.r26_product = r26_product;
		this.r26_no_of_acs = r26_no_of_acs;
		this.r26_original_amount = r26_original_amount;
		this.r26_amount_outstanding = r26_amount_outstanding;
		this.r27_product = r27_product;
		this.r27_no_of_acs = r27_no_of_acs;
		this.r27_original_amount = r27_original_amount;
		this.r27_amount_outstanding = r27_amount_outstanding;
		this.r28_product = r28_product;
		this.r28_no_of_acs = r28_no_of_acs;
		this.r28_original_amount = r28_original_amount;
		this.r28_amount_outstanding = r28_amount_outstanding;
		this.r29_product = r29_product;
		this.r29_no_of_acs = r29_no_of_acs;
		this.r29_original_amount = r29_original_amount;
		this.r29_amount_outstanding = r29_amount_outstanding;
		this.r30_product = r30_product;
		this.r30_no_of_acs = r30_no_of_acs;
		this.r30_original_amount = r30_original_amount;
		this.r30_amount_outstanding = r30_amount_outstanding;
		this.r31_product = r31_product;
		this.r31_no_of_acs = r31_no_of_acs;
		this.r31_original_amount = r31_original_amount;
		this.r31_amount_outstanding = r31_amount_outstanding;
		this.r32_product = r32_product;
		this.r32_no_of_acs = r32_no_of_acs;
		this.r32_original_amount = r32_original_amount;
		this.r32_amount_outstanding = r32_amount_outstanding;
		this.r37_product = r37_product;
		this.r37_no_of_acs = r37_no_of_acs;
		this.r37_original_amount = r37_original_amount;
		this.r37_amount_outstanding = r37_amount_outstanding;
		this.r38_product = r38_product;
		this.r38_no_of_acs = r38_no_of_acs;
		this.r38_original_amount = r38_original_amount;
		this.r38_amount_outstanding = r38_amount_outstanding;
		this.r39_product = r39_product;
		this.r39_no_of_acs = r39_no_of_acs;
		this.r39_original_amount = r39_original_amount;
		this.r39_amount_outstanding = r39_amount_outstanding;
		this.r40_product = r40_product;
		this.r40_no_of_acs = r40_no_of_acs;
		this.r40_original_amount = r40_original_amount;
		this.r40_amount_outstanding = r40_amount_outstanding;
		this.r41_product = r41_product;
		this.r41_no_of_acs = r41_no_of_acs;
		this.r41_original_amount = r41_original_amount;
		this.r41_amount_outstanding = r41_amount_outstanding;
		this.r42_product = r42_product;
		this.r42_no_of_acs = r42_no_of_acs;
		this.r42_original_amount = r42_original_amount;
		this.r42_amount_outstanding = r42_amount_outstanding;
		this.r43_product = r43_product;
		this.r43_no_of_acs = r43_no_of_acs;
		this.r43_original_amount = r43_original_amount;
		this.r43_amount_outstanding = r43_amount_outstanding;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
	}
	public BRS37_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}

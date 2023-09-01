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
@Table(name = "BRS17")
public class BRS17_ENTITY {
	private String	r11_set_date;
	private BigDecimal	r11_no_fail_trad;
	private BigDecimal	r11_pos_cur_expos;
	private BigDecimal	r11_risk_multip;
	private BigDecimal	r11_risk_weight_ass;
	private String	r12_set_date;
	private BigDecimal	r12_no_fail_trad;
	private BigDecimal	r12_pos_cur_expos;
	private BigDecimal	r12_risk_multip;
	private BigDecimal	r12_risk_weight_ass;
	private String	r13_set_date;
	private BigDecimal	r13_no_fail_trad;
	private BigDecimal	r13_pos_cur_expos;
	private BigDecimal	r13_risk_multip;
	private BigDecimal	r13_risk_weight_ass;
	private String	r14_set_date;
	private BigDecimal	r14_no_fail_trad;
	private BigDecimal	r14_pos_cur_expos;
	private BigDecimal	r14_risk_multip;
	private BigDecimal	r14_risk_weight_ass;
	private String	r15_set_date;
	private BigDecimal	r15_no_fail_trad;
	private BigDecimal	r15_pos_cur_expos;
	private BigDecimal	r15_risk_multip;
	private BigDecimal	r15_risk_weight_ass;
	private String	r16_set_date;
	private BigDecimal	r16_no_fail_trad;
	private BigDecimal	r16_pos_cur_expos;
	private BigDecimal	r16_risk_multip;
	private BigDecimal	r16_risk_weight_ass;
	private String	r19_set_date;
	private BigDecimal	r19_no_fail_trad;
	private BigDecimal	r19_pos_cur_expos;
	private BigDecimal	r19_risk_multip;
	private BigDecimal	r19_risk_weight_ass;
	private String	r20_set_date;
	private BigDecimal	r20_no_fail_trad;
	private BigDecimal	r20_pos_cur_expos;
	private BigDecimal	r20_risk_multip;
	private BigDecimal	r20_risk_weight_ass;
	private String	r21_set_date;
	private BigDecimal	r21_no_fail_trad;
	private BigDecimal	r21_pos_cur_expos;
	private BigDecimal	r21_risk_multip;
	private BigDecimal	r21_risk_weight_ass;
	private String	r22_set_date;
	private BigDecimal	r22_no_fail_trad;
	private BigDecimal	r22_pos_cur_expos;
	private BigDecimal	r22_risk_multip;
	private BigDecimal	r22_risk_weight_ass;
	private String	r23_set_date;
	private BigDecimal	r23_no_fail_trad;
	private BigDecimal	r23_pos_cur_expos;
	private BigDecimal	r23_risk_multip;
	private BigDecimal	r23_risk_weight_ass;
	private String	r24_set_date;
	private BigDecimal	r24_no_fail_trad;
	private BigDecimal	r24_pos_cur_expos;
	private BigDecimal	r24_risk_multip;
	private BigDecimal	r24_risk_weight_ass;
	private String	r25_set_date;
	private BigDecimal	r25_no_fail_trad;
	private BigDecimal	r25_pos_cur_expos;
	private BigDecimal	r25_risk_multip;
	private BigDecimal	r25_risk_weight_ass;
	private String	r26_set_date;
	private BigDecimal	r26_no_fail_trad;
	private BigDecimal	r26_pos_cur_expos;
	private BigDecimal	r26_risk_multip;
	private BigDecimal	r26_risk_weight_ass;
	private String	r27_set_date;
	private BigDecimal	r27_no_fail_trad;
	private BigDecimal	r27_pos_cur_expos;
	private BigDecimal	r27_risk_multip;
	private BigDecimal	r27_risk_weight_ass;
	private String	r28_set_date;
	private BigDecimal	r28_no_fail_trad;
	private BigDecimal	r28_pos_cur_expos;
	private BigDecimal	r28_risk_multip;
	private BigDecimal	r28_risk_weight_ass;
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	report_date;
	private Date	report_from_date ;
	private Date	report_to_date;
	private String	entity_flg ;
	private String	modify_flg ;
	private String	del_flg ;
	private String	report_code ;
	private Date	report_submit_date ;
	public String getR11_set_date() {
		return r11_set_date;
	}
	public void setR11_set_date(String r11_set_date) {
		this.r11_set_date = r11_set_date;
	}
	public BigDecimal getR11_no_fail_trad() {
		return r11_no_fail_trad;
	}
	public void setR11_no_fail_trad(BigDecimal r11_no_fail_trad) {
		this.r11_no_fail_trad = r11_no_fail_trad;
	}
	public BigDecimal getR11_pos_cur_expos() {
		return r11_pos_cur_expos;
	}
	public void setR11_pos_cur_expos(BigDecimal r11_pos_cur_expos) {
		this.r11_pos_cur_expos = r11_pos_cur_expos;
	}
	public BigDecimal getR11_risk_multip() {
		return r11_risk_multip;
	}
	public void setR11_risk_multip(BigDecimal r11_risk_multip) {
		this.r11_risk_multip = r11_risk_multip;
	}
	public BigDecimal getR11_risk_weight_ass() {
		return r11_risk_weight_ass;
	}
	public void setR11_risk_weight_ass(BigDecimal r11_risk_weight_ass) {
		this.r11_risk_weight_ass = r11_risk_weight_ass;
	}
	public String getR12_set_date() {
		return r12_set_date;
	}
	public void setR12_set_date(String r12_set_date) {
		this.r12_set_date = r12_set_date;
	}
	public BigDecimal getR12_no_fail_trad() {
		return r12_no_fail_trad;
	}
	public void setR12_no_fail_trad(BigDecimal r12_no_fail_trad) {
		this.r12_no_fail_trad = r12_no_fail_trad;
	}
	public BigDecimal getR12_pos_cur_expos() {
		return r12_pos_cur_expos;
	}
	public void setR12_pos_cur_expos(BigDecimal r12_pos_cur_expos) {
		this.r12_pos_cur_expos = r12_pos_cur_expos;
	}
	public BigDecimal getR12_risk_multip() {
		return r12_risk_multip;
	}
	public void setR12_risk_multip(BigDecimal r12_risk_multip) {
		this.r12_risk_multip = r12_risk_multip;
	}
	public BigDecimal getR12_risk_weight_ass() {
		return r12_risk_weight_ass;
	}
	public void setR12_risk_weight_ass(BigDecimal r12_risk_weight_ass) {
		this.r12_risk_weight_ass = r12_risk_weight_ass;
	}
	public String getR13_set_date() {
		return r13_set_date;
	}
	public void setR13_set_date(String r13_set_date) {
		this.r13_set_date = r13_set_date;
	}
	public BigDecimal getR13_no_fail_trad() {
		return r13_no_fail_trad;
	}
	public void setR13_no_fail_trad(BigDecimal r13_no_fail_trad) {
		this.r13_no_fail_trad = r13_no_fail_trad;
	}
	public BigDecimal getR13_pos_cur_expos() {
		return r13_pos_cur_expos;
	}
	public void setR13_pos_cur_expos(BigDecimal r13_pos_cur_expos) {
		this.r13_pos_cur_expos = r13_pos_cur_expos;
	}
	public BigDecimal getR13_risk_multip() {
		return r13_risk_multip;
	}
	public void setR13_risk_multip(BigDecimal r13_risk_multip) {
		this.r13_risk_multip = r13_risk_multip;
	}
	public BigDecimal getR13_risk_weight_ass() {
		return r13_risk_weight_ass;
	}
	public void setR13_risk_weight_ass(BigDecimal r13_risk_weight_ass) {
		this.r13_risk_weight_ass = r13_risk_weight_ass;
	}
	public String getR14_set_date() {
		return r14_set_date;
	}
	public void setR14_set_date(String r14_set_date) {
		this.r14_set_date = r14_set_date;
	}
	public BigDecimal getR14_no_fail_trad() {
		return r14_no_fail_trad;
	}
	public void setR14_no_fail_trad(BigDecimal r14_no_fail_trad) {
		this.r14_no_fail_trad = r14_no_fail_trad;
	}
	public BigDecimal getR14_pos_cur_expos() {
		return r14_pos_cur_expos;
	}
	public void setR14_pos_cur_expos(BigDecimal r14_pos_cur_expos) {
		this.r14_pos_cur_expos = r14_pos_cur_expos;
	}
	public BigDecimal getR14_risk_multip() {
		return r14_risk_multip;
	}
	public void setR14_risk_multip(BigDecimal r14_risk_multip) {
		this.r14_risk_multip = r14_risk_multip;
	}
	public BigDecimal getR14_risk_weight_ass() {
		return r14_risk_weight_ass;
	}
	public void setR14_risk_weight_ass(BigDecimal r14_risk_weight_ass) {
		this.r14_risk_weight_ass = r14_risk_weight_ass;
	}
	public String getR15_set_date() {
		return r15_set_date;
	}
	public void setR15_set_date(String r15_set_date) {
		this.r15_set_date = r15_set_date;
	}
	public BigDecimal getR15_no_fail_trad() {
		return r15_no_fail_trad;
	}
	public void setR15_no_fail_trad(BigDecimal r15_no_fail_trad) {
		this.r15_no_fail_trad = r15_no_fail_trad;
	}
	public BigDecimal getR15_pos_cur_expos() {
		return r15_pos_cur_expos;
	}
	public void setR15_pos_cur_expos(BigDecimal r15_pos_cur_expos) {
		this.r15_pos_cur_expos = r15_pos_cur_expos;
	}
	public BigDecimal getR15_risk_multip() {
		return r15_risk_multip;
	}
	public void setR15_risk_multip(BigDecimal r15_risk_multip) {
		this.r15_risk_multip = r15_risk_multip;
	}
	public BigDecimal getR15_risk_weight_ass() {
		return r15_risk_weight_ass;
	}
	public void setR15_risk_weight_ass(BigDecimal r15_risk_weight_ass) {
		this.r15_risk_weight_ass = r15_risk_weight_ass;
	}
	public String getR16_set_date() {
		return r16_set_date;
	}
	public void setR16_set_date(String r16_set_date) {
		this.r16_set_date = r16_set_date;
	}
	public BigDecimal getR16_no_fail_trad() {
		return r16_no_fail_trad;
	}
	public void setR16_no_fail_trad(BigDecimal r16_no_fail_trad) {
		this.r16_no_fail_trad = r16_no_fail_trad;
	}
	public BigDecimal getR16_pos_cur_expos() {
		return r16_pos_cur_expos;
	}
	public void setR16_pos_cur_expos(BigDecimal r16_pos_cur_expos) {
		this.r16_pos_cur_expos = r16_pos_cur_expos;
	}
	public BigDecimal getR16_risk_multip() {
		return r16_risk_multip;
	}
	public void setR16_risk_multip(BigDecimal r16_risk_multip) {
		this.r16_risk_multip = r16_risk_multip;
	}
	public BigDecimal getR16_risk_weight_ass() {
		return r16_risk_weight_ass;
	}
	public void setR16_risk_weight_ass(BigDecimal r16_risk_weight_ass) {
		this.r16_risk_weight_ass = r16_risk_weight_ass;
	}
	public String getR19_set_date() {
		return r19_set_date;
	}
	public void setR19_set_date(String r19_set_date) {
		this.r19_set_date = r19_set_date;
	}
	public BigDecimal getR19_no_fail_trad() {
		return r19_no_fail_trad;
	}
	public void setR19_no_fail_trad(BigDecimal r19_no_fail_trad) {
		this.r19_no_fail_trad = r19_no_fail_trad;
	}
	public BigDecimal getR19_pos_cur_expos() {
		return r19_pos_cur_expos;
	}
	public void setR19_pos_cur_expos(BigDecimal r19_pos_cur_expos) {
		this.r19_pos_cur_expos = r19_pos_cur_expos;
	}
	public BigDecimal getR19_risk_multip() {
		return r19_risk_multip;
	}
	public void setR19_risk_multip(BigDecimal r19_risk_multip) {
		this.r19_risk_multip = r19_risk_multip;
	}
	public BigDecimal getR19_risk_weight_ass() {
		return r19_risk_weight_ass;
	}
	public void setR19_risk_weight_ass(BigDecimal r19_risk_weight_ass) {
		this.r19_risk_weight_ass = r19_risk_weight_ass;
	}
	public String getR20_set_date() {
		return r20_set_date;
	}
	public void setR20_set_date(String r20_set_date) {
		this.r20_set_date = r20_set_date;
	}
	public BigDecimal getR20_no_fail_trad() {
		return r20_no_fail_trad;
	}
	public void setR20_no_fail_trad(BigDecimal r20_no_fail_trad) {
		this.r20_no_fail_trad = r20_no_fail_trad;
	}
	public BigDecimal getR20_pos_cur_expos() {
		return r20_pos_cur_expos;
	}
	public void setR20_pos_cur_expos(BigDecimal r20_pos_cur_expos) {
		this.r20_pos_cur_expos = r20_pos_cur_expos;
	}
	public BigDecimal getR20_risk_multip() {
		return r20_risk_multip;
	}
	public void setR20_risk_multip(BigDecimal r20_risk_multip) {
		this.r20_risk_multip = r20_risk_multip;
	}
	public BigDecimal getR20_risk_weight_ass() {
		return r20_risk_weight_ass;
	}
	public void setR20_risk_weight_ass(BigDecimal r20_risk_weight_ass) {
		this.r20_risk_weight_ass = r20_risk_weight_ass;
	}
	public String getR21_set_date() {
		return r21_set_date;
	}
	public void setR21_set_date(String r21_set_date) {
		this.r21_set_date = r21_set_date;
	}
	public BigDecimal getR21_no_fail_trad() {
		return r21_no_fail_trad;
	}
	public void setR21_no_fail_trad(BigDecimal r21_no_fail_trad) {
		this.r21_no_fail_trad = r21_no_fail_trad;
	}
	public BigDecimal getR21_pos_cur_expos() {
		return r21_pos_cur_expos;
	}
	public void setR21_pos_cur_expos(BigDecimal r21_pos_cur_expos) {
		this.r21_pos_cur_expos = r21_pos_cur_expos;
	}
	public BigDecimal getR21_risk_multip() {
		return r21_risk_multip;
	}
	public void setR21_risk_multip(BigDecimal r21_risk_multip) {
		this.r21_risk_multip = r21_risk_multip;
	}
	public BigDecimal getR21_risk_weight_ass() {
		return r21_risk_weight_ass;
	}
	public void setR21_risk_weight_ass(BigDecimal r21_risk_weight_ass) {
		this.r21_risk_weight_ass = r21_risk_weight_ass;
	}
	public String getR22_set_date() {
		return r22_set_date;
	}
	public void setR22_set_date(String r22_set_date) {
		this.r22_set_date = r22_set_date;
	}
	public BigDecimal getR22_no_fail_trad() {
		return r22_no_fail_trad;
	}
	public void setR22_no_fail_trad(BigDecimal r22_no_fail_trad) {
		this.r22_no_fail_trad = r22_no_fail_trad;
	}
	public BigDecimal getR22_pos_cur_expos() {
		return r22_pos_cur_expos;
	}
	public void setR22_pos_cur_expos(BigDecimal r22_pos_cur_expos) {
		this.r22_pos_cur_expos = r22_pos_cur_expos;
	}
	public BigDecimal getR22_risk_multip() {
		return r22_risk_multip;
	}
	public void setR22_risk_multip(BigDecimal r22_risk_multip) {
		this.r22_risk_multip = r22_risk_multip;
	}
	public BigDecimal getR22_risk_weight_ass() {
		return r22_risk_weight_ass;
	}
	public void setR22_risk_weight_ass(BigDecimal r22_risk_weight_ass) {
		this.r22_risk_weight_ass = r22_risk_weight_ass;
	}
	public String getR23_set_date() {
		return r23_set_date;
	}
	public void setR23_set_date(String r23_set_date) {
		this.r23_set_date = r23_set_date;
	}
	public BigDecimal getR23_no_fail_trad() {
		return r23_no_fail_trad;
	}
	public void setR23_no_fail_trad(BigDecimal r23_no_fail_trad) {
		this.r23_no_fail_trad = r23_no_fail_trad;
	}
	public BigDecimal getR23_pos_cur_expos() {
		return r23_pos_cur_expos;
	}
	public void setR23_pos_cur_expos(BigDecimal r23_pos_cur_expos) {
		this.r23_pos_cur_expos = r23_pos_cur_expos;
	}
	public BigDecimal getR23_risk_multip() {
		return r23_risk_multip;
	}
	public void setR23_risk_multip(BigDecimal r23_risk_multip) {
		this.r23_risk_multip = r23_risk_multip;
	}
	public BigDecimal getR23_risk_weight_ass() {
		return r23_risk_weight_ass;
	}
	public void setR23_risk_weight_ass(BigDecimal r23_risk_weight_ass) {
		this.r23_risk_weight_ass = r23_risk_weight_ass;
	}
	public String getR24_set_date() {
		return r24_set_date;
	}
	public void setR24_set_date(String r24_set_date) {
		this.r24_set_date = r24_set_date;
	}
	public BigDecimal getR24_no_fail_trad() {
		return r24_no_fail_trad;
	}
	public void setR24_no_fail_trad(BigDecimal r24_no_fail_trad) {
		this.r24_no_fail_trad = r24_no_fail_trad;
	}
	public BigDecimal getR24_pos_cur_expos() {
		return r24_pos_cur_expos;
	}
	public void setR24_pos_cur_expos(BigDecimal r24_pos_cur_expos) {
		this.r24_pos_cur_expos = r24_pos_cur_expos;
	}
	public BigDecimal getR24_risk_multip() {
		return r24_risk_multip;
	}
	public void setR24_risk_multip(BigDecimal r24_risk_multip) {
		this.r24_risk_multip = r24_risk_multip;
	}
	public BigDecimal getR24_risk_weight_ass() {
		return r24_risk_weight_ass;
	}
	public void setR24_risk_weight_ass(BigDecimal r24_risk_weight_ass) {
		this.r24_risk_weight_ass = r24_risk_weight_ass;
	}
	public String getR25_set_date() {
		return r25_set_date;
	}
	public void setR25_set_date(String r25_set_date) {
		this.r25_set_date = r25_set_date;
	}
	public BigDecimal getR25_no_fail_trad() {
		return r25_no_fail_trad;
	}
	public void setR25_no_fail_trad(BigDecimal r25_no_fail_trad) {
		this.r25_no_fail_trad = r25_no_fail_trad;
	}
	public BigDecimal getR25_pos_cur_expos() {
		return r25_pos_cur_expos;
	}
	public void setR25_pos_cur_expos(BigDecimal r25_pos_cur_expos) {
		this.r25_pos_cur_expos = r25_pos_cur_expos;
	}
	public BigDecimal getR25_risk_multip() {
		return r25_risk_multip;
	}
	public void setR25_risk_multip(BigDecimal r25_risk_multip) {
		this.r25_risk_multip = r25_risk_multip;
	}
	public BigDecimal getR25_risk_weight_ass() {
		return r25_risk_weight_ass;
	}
	public void setR25_risk_weight_ass(BigDecimal r25_risk_weight_ass) {
		this.r25_risk_weight_ass = r25_risk_weight_ass;
	}
	public String getR26_set_date() {
		return r26_set_date;
	}
	public void setR26_set_date(String r26_set_date) {
		this.r26_set_date = r26_set_date;
	}
	public BigDecimal getR26_no_fail_trad() {
		return r26_no_fail_trad;
	}
	public void setR26_no_fail_trad(BigDecimal r26_no_fail_trad) {
		this.r26_no_fail_trad = r26_no_fail_trad;
	}
	public BigDecimal getR26_pos_cur_expos() {
		return r26_pos_cur_expos;
	}
	public void setR26_pos_cur_expos(BigDecimal r26_pos_cur_expos) {
		this.r26_pos_cur_expos = r26_pos_cur_expos;
	}
	public BigDecimal getR26_risk_multip() {
		return r26_risk_multip;
	}
	public void setR26_risk_multip(BigDecimal r26_risk_multip) {
		this.r26_risk_multip = r26_risk_multip;
	}
	public BigDecimal getR26_risk_weight_ass() {
		return r26_risk_weight_ass;
	}
	public void setR26_risk_weight_ass(BigDecimal r26_risk_weight_ass) {
		this.r26_risk_weight_ass = r26_risk_weight_ass;
	}
	public String getR27_set_date() {
		return r27_set_date;
	}
	public void setR27_set_date(String r27_set_date) {
		this.r27_set_date = r27_set_date;
	}
	public BigDecimal getR27_no_fail_trad() {
		return r27_no_fail_trad;
	}
	public void setR27_no_fail_trad(BigDecimal r27_no_fail_trad) {
		this.r27_no_fail_trad = r27_no_fail_trad;
	}
	public BigDecimal getR27_pos_cur_expos() {
		return r27_pos_cur_expos;
	}
	public void setR27_pos_cur_expos(BigDecimal r27_pos_cur_expos) {
		this.r27_pos_cur_expos = r27_pos_cur_expos;
	}
	public BigDecimal getR27_risk_multip() {
		return r27_risk_multip;
	}
	public void setR27_risk_multip(BigDecimal r27_risk_multip) {
		this.r27_risk_multip = r27_risk_multip;
	}
	public BigDecimal getR27_risk_weight_ass() {
		return r27_risk_weight_ass;
	}
	public void setR27_risk_weight_ass(BigDecimal r27_risk_weight_ass) {
		this.r27_risk_weight_ass = r27_risk_weight_ass;
	}
	public String getR28_set_date() {
		return r28_set_date;
	}
	public void setR28_set_date(String r28_set_date) {
		this.r28_set_date = r28_set_date;
	}
	public BigDecimal getR28_no_fail_trad() {
		return r28_no_fail_trad;
	}
	public void setR28_no_fail_trad(BigDecimal r28_no_fail_trad) {
		this.r28_no_fail_trad = r28_no_fail_trad;
	}
	public BigDecimal getR28_pos_cur_expos() {
		return r28_pos_cur_expos;
	}
	public void setR28_pos_cur_expos(BigDecimal r28_pos_cur_expos) {
		this.r28_pos_cur_expos = r28_pos_cur_expos;
	}
	public BigDecimal getR28_risk_multip() {
		return r28_risk_multip;
	}
	public void setR28_risk_multip(BigDecimal r28_risk_multip) {
		this.r28_risk_multip = r28_risk_multip;
	}
	public BigDecimal getR28_risk_weight_ass() {
		return r28_risk_weight_ass;
	}
	public void setR28_risk_weight_ass(BigDecimal r28_risk_weight_ass) {
		this.r28_risk_weight_ass = r28_risk_weight_ass;
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
	public BRS17_ENTITY(String r11_set_date, BigDecimal r11_no_fail_trad, BigDecimal r11_pos_cur_expos,
			BigDecimal r11_risk_multip, BigDecimal r11_risk_weight_ass, String r12_set_date,
			BigDecimal r12_no_fail_trad, BigDecimal r12_pos_cur_expos, BigDecimal r12_risk_multip,
			BigDecimal r12_risk_weight_ass, String r13_set_date, BigDecimal r13_no_fail_trad,
			BigDecimal r13_pos_cur_expos, BigDecimal r13_risk_multip, BigDecimal r13_risk_weight_ass,
			String r14_set_date, BigDecimal r14_no_fail_trad, BigDecimal r14_pos_cur_expos, BigDecimal r14_risk_multip,
			BigDecimal r14_risk_weight_ass, String r15_set_date, BigDecimal r15_no_fail_trad,
			BigDecimal r15_pos_cur_expos, BigDecimal r15_risk_multip, BigDecimal r15_risk_weight_ass,
			String r16_set_date, BigDecimal r16_no_fail_trad, BigDecimal r16_pos_cur_expos, BigDecimal r16_risk_multip,
			BigDecimal r16_risk_weight_ass, String r19_set_date, BigDecimal r19_no_fail_trad,
			BigDecimal r19_pos_cur_expos, BigDecimal r19_risk_multip, BigDecimal r19_risk_weight_ass,
			String r20_set_date, BigDecimal r20_no_fail_trad, BigDecimal r20_pos_cur_expos, BigDecimal r20_risk_multip,
			BigDecimal r20_risk_weight_ass, String r21_set_date, BigDecimal r21_no_fail_trad,
			BigDecimal r21_pos_cur_expos, BigDecimal r21_risk_multip, BigDecimal r21_risk_weight_ass,
			String r22_set_date, BigDecimal r22_no_fail_trad, BigDecimal r22_pos_cur_expos, BigDecimal r22_risk_multip,
			BigDecimal r22_risk_weight_ass, String r23_set_date, BigDecimal r23_no_fail_trad,
			BigDecimal r23_pos_cur_expos, BigDecimal r23_risk_multip, BigDecimal r23_risk_weight_ass,
			String r24_set_date, BigDecimal r24_no_fail_trad, BigDecimal r24_pos_cur_expos, BigDecimal r24_risk_multip,
			BigDecimal r24_risk_weight_ass, String r25_set_date, BigDecimal r25_no_fail_trad,
			BigDecimal r25_pos_cur_expos, BigDecimal r25_risk_multip, BigDecimal r25_risk_weight_ass,
			String r26_set_date, BigDecimal r26_no_fail_trad, BigDecimal r26_pos_cur_expos, BigDecimal r26_risk_multip,
			BigDecimal r26_risk_weight_ass, String r27_set_date, BigDecimal r27_no_fail_trad,
			BigDecimal r27_pos_cur_expos, BigDecimal r27_risk_multip, BigDecimal r27_risk_weight_ass,
			String r28_set_date, BigDecimal r28_no_fail_trad, BigDecimal r28_pos_cur_expos, BigDecimal r28_risk_multip,
			BigDecimal r28_risk_weight_ass, Date report_date, Date report_from_date, Date report_to_date,
			String entity_flg, String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r11_set_date = r11_set_date;
		this.r11_no_fail_trad = r11_no_fail_trad;
		this.r11_pos_cur_expos = r11_pos_cur_expos;
		this.r11_risk_multip = r11_risk_multip;
		this.r11_risk_weight_ass = r11_risk_weight_ass;
		this.r12_set_date = r12_set_date;
		this.r12_no_fail_trad = r12_no_fail_trad;
		this.r12_pos_cur_expos = r12_pos_cur_expos;
		this.r12_risk_multip = r12_risk_multip;
		this.r12_risk_weight_ass = r12_risk_weight_ass;
		this.r13_set_date = r13_set_date;
		this.r13_no_fail_trad = r13_no_fail_trad;
		this.r13_pos_cur_expos = r13_pos_cur_expos;
		this.r13_risk_multip = r13_risk_multip;
		this.r13_risk_weight_ass = r13_risk_weight_ass;
		this.r14_set_date = r14_set_date;
		this.r14_no_fail_trad = r14_no_fail_trad;
		this.r14_pos_cur_expos = r14_pos_cur_expos;
		this.r14_risk_multip = r14_risk_multip;
		this.r14_risk_weight_ass = r14_risk_weight_ass;
		this.r15_set_date = r15_set_date;
		this.r15_no_fail_trad = r15_no_fail_trad;
		this.r15_pos_cur_expos = r15_pos_cur_expos;
		this.r15_risk_multip = r15_risk_multip;
		this.r15_risk_weight_ass = r15_risk_weight_ass;
		this.r16_set_date = r16_set_date;
		this.r16_no_fail_trad = r16_no_fail_trad;
		this.r16_pos_cur_expos = r16_pos_cur_expos;
		this.r16_risk_multip = r16_risk_multip;
		this.r16_risk_weight_ass = r16_risk_weight_ass;
		this.r19_set_date = r19_set_date;
		this.r19_no_fail_trad = r19_no_fail_trad;
		this.r19_pos_cur_expos = r19_pos_cur_expos;
		this.r19_risk_multip = r19_risk_multip;
		this.r19_risk_weight_ass = r19_risk_weight_ass;
		this.r20_set_date = r20_set_date;
		this.r20_no_fail_trad = r20_no_fail_trad;
		this.r20_pos_cur_expos = r20_pos_cur_expos;
		this.r20_risk_multip = r20_risk_multip;
		this.r20_risk_weight_ass = r20_risk_weight_ass;
		this.r21_set_date = r21_set_date;
		this.r21_no_fail_trad = r21_no_fail_trad;
		this.r21_pos_cur_expos = r21_pos_cur_expos;
		this.r21_risk_multip = r21_risk_multip;
		this.r21_risk_weight_ass = r21_risk_weight_ass;
		this.r22_set_date = r22_set_date;
		this.r22_no_fail_trad = r22_no_fail_trad;
		this.r22_pos_cur_expos = r22_pos_cur_expos;
		this.r22_risk_multip = r22_risk_multip;
		this.r22_risk_weight_ass = r22_risk_weight_ass;
		this.r23_set_date = r23_set_date;
		this.r23_no_fail_trad = r23_no_fail_trad;
		this.r23_pos_cur_expos = r23_pos_cur_expos;
		this.r23_risk_multip = r23_risk_multip;
		this.r23_risk_weight_ass = r23_risk_weight_ass;
		this.r24_set_date = r24_set_date;
		this.r24_no_fail_trad = r24_no_fail_trad;
		this.r24_pos_cur_expos = r24_pos_cur_expos;
		this.r24_risk_multip = r24_risk_multip;
		this.r24_risk_weight_ass = r24_risk_weight_ass;
		this.r25_set_date = r25_set_date;
		this.r25_no_fail_trad = r25_no_fail_trad;
		this.r25_pos_cur_expos = r25_pos_cur_expos;
		this.r25_risk_multip = r25_risk_multip;
		this.r25_risk_weight_ass = r25_risk_weight_ass;
		this.r26_set_date = r26_set_date;
		this.r26_no_fail_trad = r26_no_fail_trad;
		this.r26_pos_cur_expos = r26_pos_cur_expos;
		this.r26_risk_multip = r26_risk_multip;
		this.r26_risk_weight_ass = r26_risk_weight_ass;
		this.r27_set_date = r27_set_date;
		this.r27_no_fail_trad = r27_no_fail_trad;
		this.r27_pos_cur_expos = r27_pos_cur_expos;
		this.r27_risk_multip = r27_risk_multip;
		this.r27_risk_weight_ass = r27_risk_weight_ass;
		this.r28_set_date = r28_set_date;
		this.r28_no_fail_trad = r28_no_fail_trad;
		this.r28_pos_cur_expos = r28_pos_cur_expos;
		this.r28_risk_multip = r28_risk_multip;
		this.r28_risk_weight_ass = r28_risk_weight_ass;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS17_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

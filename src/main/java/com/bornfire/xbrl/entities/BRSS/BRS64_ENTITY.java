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
@Table(name="BRS64_TABLE")

public class BRS64_ENTITY {
	private String	r15_product;
	private BigDecimal	r15_resident;
	private BigDecimal	r15_non_resident;
	private String	r16_product;
	private BigDecimal	r16_resident;
	private BigDecimal	r16_non_resident;
	private String	r17_product;
	private BigDecimal	r17_resident;
	private BigDecimal	r17_non_resident;
	private String	r18_product;
	private BigDecimal	r18_resident;
	private BigDecimal	r18_non_resident;
	private String	r19_product;
	private BigDecimal	r19_resident;
	private BigDecimal	r19_non_resident;
	private String	r20_product;
	private BigDecimal	r20_resident;
	private BigDecimal	r20_non_resident;
	private String	r21_product;
	private BigDecimal	r21_resident;
	private BigDecimal	r21_non_resident;
	private String	r22_product;
	private BigDecimal	r22_resident;
	private BigDecimal	r22_non_resident;
	private String	r23_product;
	private BigDecimal	r23_resident;
	private BigDecimal	r23_non_resident;
	private String	r24_product;
	private BigDecimal	r24_resident;
	private BigDecimal	r24_non_resident;
	private String	r25_product;
	private BigDecimal	r25_resident;
	private BigDecimal	r25_non_resident;
	private String	r26_product;
	private BigDecimal	r26_resident;
	private BigDecimal	r26_non_resident;
	private String	r27_product;
	private BigDecimal	r27_resident;
	private BigDecimal	r27_non_resident;
	private String	r28_product;
	private BigDecimal	r28_resident;
	private BigDecimal	r28_non_resident;
	private String	r29_product;
	private BigDecimal	r29_resident;
	private BigDecimal	r29_non_resident;
	private String	r30_product;
	private BigDecimal	r30_resident;
	private BigDecimal	r30_non_resident;
	private String	r31_product;
	private BigDecimal	r31_resident;
	private BigDecimal	r31_non_resident;
	private String	r32_product;
	private BigDecimal	r32_resident;
	private BigDecimal	r32_non_resident;
	private String	r33_product;
	private BigDecimal	r33_resident;
	private BigDecimal	r33_non_resident;
	private String	r34_product;
	private BigDecimal	r34_resident;
	private BigDecimal	r34_non_resident;
	private String	r35_product;
	private BigDecimal	r35_resident;
	private BigDecimal	r35_non_resident;
	private String	r36_product;
	private BigDecimal	r36_resident;
	private BigDecimal	r36_non_resident;
	private String	r37_product;
	private BigDecimal	r37_resident;
	private BigDecimal	r37_non_resident;
	private String	r38_product;
	private BigDecimal	r38_resident;
	private BigDecimal	r38_non_resident;
	private String	r39_product;
	private BigDecimal	r39_resident;
	private BigDecimal	r39_non_resident;
	private String	r40_product;
	private BigDecimal	r40_resident;
	private BigDecimal	r40_non_resident;
	private String	r41_product;
	private BigDecimal	r41_resident;
	private BigDecimal	r41_non_resident;
	private String	r42_product;
	private BigDecimal	r42_resident;
	private BigDecimal	r42_non_resident;
	private String	r43_product;
	private BigDecimal	r43_resident;
	private BigDecimal	r43_non_resident;
	private String	r44_product;
	private BigDecimal	r44_resident;
	private BigDecimal	r44_non_resident;
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
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public BigDecimal getR15_resident() {
		return r15_resident;
	}
	public void setR15_resident(BigDecimal r15_resident) {
		this.r15_resident = r15_resident;
	}
	public BigDecimal getR15_non_resident() {
		return r15_non_resident;
	}
	public void setR15_non_resident(BigDecimal r15_non_resident) {
		this.r15_non_resident = r15_non_resident;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public BigDecimal getR16_resident() {
		return r16_resident;
	}
	public void setR16_resident(BigDecimal r16_resident) {
		this.r16_resident = r16_resident;
	}
	public BigDecimal getR16_non_resident() {
		return r16_non_resident;
	}
	public void setR16_non_resident(BigDecimal r16_non_resident) {
		this.r16_non_resident = r16_non_resident;
	}
	public String getR17_product() {
		return r17_product;
	}
	public void setR17_product(String r17_product) {
		this.r17_product = r17_product;
	}
	public BigDecimal getR17_resident() {
		return r17_resident;
	}
	public void setR17_resident(BigDecimal r17_resident) {
		this.r17_resident = r17_resident;
	}
	public BigDecimal getR17_non_resident() {
		return r17_non_resident;
	}
	public void setR17_non_resident(BigDecimal r17_non_resident) {
		this.r17_non_resident = r17_non_resident;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public BigDecimal getR18_resident() {
		return r18_resident;
	}
	public void setR18_resident(BigDecimal r18_resident) {
		this.r18_resident = r18_resident;
	}
	public BigDecimal getR18_non_resident() {
		return r18_non_resident;
	}
	public void setR18_non_resident(BigDecimal r18_non_resident) {
		this.r18_non_resident = r18_non_resident;
	}
	public String getR19_product() {
		return r19_product;
	}
	public void setR19_product(String r19_product) {
		this.r19_product = r19_product;
	}
	public BigDecimal getR19_resident() {
		return r19_resident;
	}
	public void setR19_resident(BigDecimal r19_resident) {
		this.r19_resident = r19_resident;
	}
	public BigDecimal getR19_non_resident() {
		return r19_non_resident;
	}
	public void setR19_non_resident(BigDecimal r19_non_resident) {
		this.r19_non_resident = r19_non_resident;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public BigDecimal getR20_resident() {
		return r20_resident;
	}
	public void setR20_resident(BigDecimal r20_resident) {
		this.r20_resident = r20_resident;
	}
	public BigDecimal getR20_non_resident() {
		return r20_non_resident;
	}
	public void setR20_non_resident(BigDecimal r20_non_resident) {
		this.r20_non_resident = r20_non_resident;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public BigDecimal getR21_resident() {
		return r21_resident;
	}
	public void setR21_resident(BigDecimal r21_resident) {
		this.r21_resident = r21_resident;
	}
	public BigDecimal getR21_non_resident() {
		return r21_non_resident;
	}
	public void setR21_non_resident(BigDecimal r21_non_resident) {
		this.r21_non_resident = r21_non_resident;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public BigDecimal getR22_resident() {
		return r22_resident;
	}
	public void setR22_resident(BigDecimal r22_resident) {
		this.r22_resident = r22_resident;
	}
	public BigDecimal getR22_non_resident() {
		return r22_non_resident;
	}
	public void setR22_non_resident(BigDecimal r22_non_resident) {
		this.r22_non_resident = r22_non_resident;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public BigDecimal getR23_resident() {
		return r23_resident;
	}
	public void setR23_resident(BigDecimal r23_resident) {
		this.r23_resident = r23_resident;
	}
	public BigDecimal getR23_non_resident() {
		return r23_non_resident;
	}
	public void setR23_non_resident(BigDecimal r23_non_resident) {
		this.r23_non_resident = r23_non_resident;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_resident() {
		return r24_resident;
	}
	public void setR24_resident(BigDecimal r24_resident) {
		this.r24_resident = r24_resident;
	}
	public BigDecimal getR24_non_resident() {
		return r24_non_resident;
	}
	public void setR24_non_resident(BigDecimal r24_non_resident) {
		this.r24_non_resident = r24_non_resident;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_resident() {
		return r25_resident;
	}
	public void setR25_resident(BigDecimal r25_resident) {
		this.r25_resident = r25_resident;
	}
	public BigDecimal getR25_non_resident() {
		return r25_non_resident;
	}
	public void setR25_non_resident(BigDecimal r25_non_resident) {
		this.r25_non_resident = r25_non_resident;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public BigDecimal getR26_resident() {
		return r26_resident;
	}
	public void setR26_resident(BigDecimal r26_resident) {
		this.r26_resident = r26_resident;
	}
	public BigDecimal getR26_non_resident() {
		return r26_non_resident;
	}
	public void setR26_non_resident(BigDecimal r26_non_resident) {
		this.r26_non_resident = r26_non_resident;
	}
	public String getR27_product() {
		return r27_product;
	}
	public void setR27_product(String r27_product) {
		this.r27_product = r27_product;
	}
	public BigDecimal getR27_resident() {
		return r27_resident;
	}
	public void setR27_resident(BigDecimal r27_resident) {
		this.r27_resident = r27_resident;
	}
	public BigDecimal getR27_non_resident() {
		return r27_non_resident;
	}
	public void setR27_non_resident(BigDecimal r27_non_resident) {
		this.r27_non_resident = r27_non_resident;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_resident() {
		return r28_resident;
	}
	public void setR28_resident(BigDecimal r28_resident) {
		this.r28_resident = r28_resident;
	}
	public BigDecimal getR28_non_resident() {
		return r28_non_resident;
	}
	public void setR28_non_resident(BigDecimal r28_non_resident) {
		this.r28_non_resident = r28_non_resident;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_resident() {
		return r29_resident;
	}
	public void setR29_resident(BigDecimal r29_resident) {
		this.r29_resident = r29_resident;
	}
	public BigDecimal getR29_non_resident() {
		return r29_non_resident;
	}
	public void setR29_non_resident(BigDecimal r29_non_resident) {
		this.r29_non_resident = r29_non_resident;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_resident() {
		return r30_resident;
	}
	public void setR30_resident(BigDecimal r30_resident) {
		this.r30_resident = r30_resident;
	}
	public BigDecimal getR30_non_resident() {
		return r30_non_resident;
	}
	public void setR30_non_resident(BigDecimal r30_non_resident) {
		this.r30_non_resident = r30_non_resident;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public BigDecimal getR31_resident() {
		return r31_resident;
	}
	public void setR31_resident(BigDecimal r31_resident) {
		this.r31_resident = r31_resident;
	}
	public BigDecimal getR31_non_resident() {
		return r31_non_resident;
	}
	public void setR31_non_resident(BigDecimal r31_non_resident) {
		this.r31_non_resident = r31_non_resident;
	}
	public String getR32_product() {
		return r32_product;
	}
	public void setR32_product(String r32_product) {
		this.r32_product = r32_product;
	}
	public BigDecimal getR32_resident() {
		return r32_resident;
	}
	public void setR32_resident(BigDecimal r32_resident) {
		this.r32_resident = r32_resident;
	}
	public BigDecimal getR32_non_resident() {
		return r32_non_resident;
	}
	public void setR32_non_resident(BigDecimal r32_non_resident) {
		this.r32_non_resident = r32_non_resident;
	}
	public String getR33_product() {
		return r33_product;
	}
	public void setR33_product(String r33_product) {
		this.r33_product = r33_product;
	}
	public BigDecimal getR33_resident() {
		return r33_resident;
	}
	public void setR33_resident(BigDecimal r33_resident) {
		this.r33_resident = r33_resident;
	}
	public BigDecimal getR33_non_resident() {
		return r33_non_resident;
	}
	public void setR33_non_resident(BigDecimal r33_non_resident) {
		this.r33_non_resident = r33_non_resident;
	}
	public String getR34_product() {
		return r34_product;
	}
	public void setR34_product(String r34_product) {
		this.r34_product = r34_product;
	}
	public BigDecimal getR34_resident() {
		return r34_resident;
	}
	public void setR34_resident(BigDecimal r34_resident) {
		this.r34_resident = r34_resident;
	}
	public BigDecimal getR34_non_resident() {
		return r34_non_resident;
	}
	public void setR34_non_resident(BigDecimal r34_non_resident) {
		this.r34_non_resident = r34_non_resident;
	}
	public String getR35_product() {
		return r35_product;
	}
	public void setR35_product(String r35_product) {
		this.r35_product = r35_product;
	}
	public BigDecimal getR35_resident() {
		return r35_resident;
	}
	public void setR35_resident(BigDecimal r35_resident) {
		this.r35_resident = r35_resident;
	}
	public BigDecimal getR35_non_resident() {
		return r35_non_resident;
	}
	public void setR35_non_resident(BigDecimal r35_non_resident) {
		this.r35_non_resident = r35_non_resident;
	}
	public String getR36_product() {
		return r36_product;
	}
	public void setR36_product(String r36_product) {
		this.r36_product = r36_product;
	}
	public BigDecimal getR36_resident() {
		return r36_resident;
	}
	public void setR36_resident(BigDecimal r36_resident) {
		this.r36_resident = r36_resident;
	}
	public BigDecimal getR36_non_resident() {
		return r36_non_resident;
	}
	public void setR36_non_resident(BigDecimal r36_non_resident) {
		this.r36_non_resident = r36_non_resident;
	}
	public String getR37_product() {
		return r37_product;
	}
	public void setR37_product(String r37_product) {
		this.r37_product = r37_product;
	}
	public BigDecimal getR37_resident() {
		return r37_resident;
	}
	public void setR37_resident(BigDecimal r37_resident) {
		this.r37_resident = r37_resident;
	}
	public BigDecimal getR37_non_resident() {
		return r37_non_resident;
	}
	public void setR37_non_resident(BigDecimal r37_non_resident) {
		this.r37_non_resident = r37_non_resident;
	}
	public String getR38_product() {
		return r38_product;
	}
	public void setR38_product(String r38_product) {
		this.r38_product = r38_product;
	}
	public BigDecimal getR38_resident() {
		return r38_resident;
	}
	public void setR38_resident(BigDecimal r38_resident) {
		this.r38_resident = r38_resident;
	}
	public BigDecimal getR38_non_resident() {
		return r38_non_resident;
	}
	public void setR38_non_resident(BigDecimal r38_non_resident) {
		this.r38_non_resident = r38_non_resident;
	}
	public String getR39_product() {
		return r39_product;
	}
	public void setR39_product(String r39_product) {
		this.r39_product = r39_product;
	}
	public BigDecimal getR39_resident() {
		return r39_resident;
	}
	public void setR39_resident(BigDecimal r39_resident) {
		this.r39_resident = r39_resident;
	}
	public BigDecimal getR39_non_resident() {
		return r39_non_resident;
	}
	public void setR39_non_resident(BigDecimal r39_non_resident) {
		this.r39_non_resident = r39_non_resident;
	}
	public String getR40_product() {
		return r40_product;
	}
	public void setR40_product(String r40_product) {
		this.r40_product = r40_product;
	}
	public BigDecimal getR40_resident() {
		return r40_resident;
	}
	public void setR40_resident(BigDecimal r40_resident) {
		this.r40_resident = r40_resident;
	}
	public BigDecimal getR40_non_resident() {
		return r40_non_resident;
	}
	public void setR40_non_resident(BigDecimal r40_non_resident) {
		this.r40_non_resident = r40_non_resident;
	}
	public String getR41_product() {
		return r41_product;
	}
	public void setR41_product(String r41_product) {
		this.r41_product = r41_product;
	}
	public BigDecimal getR41_resident() {
		return r41_resident;
	}
	public void setR41_resident(BigDecimal r41_resident) {
		this.r41_resident = r41_resident;
	}
	public BigDecimal getR41_non_resident() {
		return r41_non_resident;
	}
	public void setR41_non_resident(BigDecimal r41_non_resident) {
		this.r41_non_resident = r41_non_resident;
	}
	public String getR42_product() {
		return r42_product;
	}
	public void setR42_product(String r42_product) {
		this.r42_product = r42_product;
	}
	public BigDecimal getR42_resident() {
		return r42_resident;
	}
	public void setR42_resident(BigDecimal r42_resident) {
		this.r42_resident = r42_resident;
	}
	public BigDecimal getR42_non_resident() {
		return r42_non_resident;
	}
	public void setR42_non_resident(BigDecimal r42_non_resident) {
		this.r42_non_resident = r42_non_resident;
	}
	public String getR43_product() {
		return r43_product;
	}
	public void setR43_product(String r43_product) {
		this.r43_product = r43_product;
	}
	public BigDecimal getR43_resident() {
		return r43_resident;
	}
	public void setR43_resident(BigDecimal r43_resident) {
		this.r43_resident = r43_resident;
	}
	public BigDecimal getR43_non_resident() {
		return r43_non_resident;
	}
	public void setR43_non_resident(BigDecimal r43_non_resident) {
		this.r43_non_resident = r43_non_resident;
	}
	public String getR44_product() {
		return r44_product;
	}
	public void setR44_product(String r44_product) {
		this.r44_product = r44_product;
	}
	public BigDecimal getR44_resident() {
		return r44_resident;
	}
	public void setR44_resident(BigDecimal r44_resident) {
		this.r44_resident = r44_resident;
	}
	public BigDecimal getR44_non_resident() {
		return r44_non_resident;
	}
	public void setR44_non_resident(BigDecimal r44_non_resident) {
		this.r44_non_resident = r44_non_resident;
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
	public BRS64_ENTITY(String r15_product, BigDecimal r15_resident, BigDecimal r15_non_resident, String r16_product,
			BigDecimal r16_resident, BigDecimal r16_non_resident, String r17_product, BigDecimal r17_resident,
			BigDecimal r17_non_resident, String r18_product, BigDecimal r18_resident, BigDecimal r18_non_resident,
			String r19_product, BigDecimal r19_resident, BigDecimal r19_non_resident, String r20_product,
			BigDecimal r20_resident, BigDecimal r20_non_resident, String r21_product, BigDecimal r21_resident,
			BigDecimal r21_non_resident, String r22_product, BigDecimal r22_resident, BigDecimal r22_non_resident,
			String r23_product, BigDecimal r23_resident, BigDecimal r23_non_resident, String r24_product,
			BigDecimal r24_resident, BigDecimal r24_non_resident, String r25_product, BigDecimal r25_resident,
			BigDecimal r25_non_resident, String r26_product, BigDecimal r26_resident, BigDecimal r26_non_resident,
			String r27_product, BigDecimal r27_resident, BigDecimal r27_non_resident, String r28_product,
			BigDecimal r28_resident, BigDecimal r28_non_resident, String r29_product, BigDecimal r29_resident,
			BigDecimal r29_non_resident, String r30_product, BigDecimal r30_resident, BigDecimal r30_non_resident,
			String r31_product, BigDecimal r31_resident, BigDecimal r31_non_resident, String r32_product,
			BigDecimal r32_resident, BigDecimal r32_non_resident, String r33_product, BigDecimal r33_resident,
			BigDecimal r33_non_resident, String r34_product, BigDecimal r34_resident, BigDecimal r34_non_resident,
			String r35_product, BigDecimal r35_resident, BigDecimal r35_non_resident, String r36_product,
			BigDecimal r36_resident, BigDecimal r36_non_resident, String r37_product, BigDecimal r37_resident,
			BigDecimal r37_non_resident, String r38_product, BigDecimal r38_resident, BigDecimal r38_non_resident,
			String r39_product, BigDecimal r39_resident, BigDecimal r39_non_resident, String r40_product,
			BigDecimal r40_resident, BigDecimal r40_non_resident, String r41_product, BigDecimal r41_resident,
			BigDecimal r41_non_resident, String r42_product, BigDecimal r42_resident, BigDecimal r42_non_resident,
			String r43_product, BigDecimal r43_resident, BigDecimal r43_non_resident, String r44_product,
			BigDecimal r44_resident, BigDecimal r44_non_resident, Date report_date, Date report_from_date,
			Date report_to_date, String entity_flg, String modify_flg, String del_flg, String report_code,
			Date report_submit_date) {
		super();
		this.r15_product = r15_product;
		this.r15_resident = r15_resident;
		this.r15_non_resident = r15_non_resident;
		this.r16_product = r16_product;
		this.r16_resident = r16_resident;
		this.r16_non_resident = r16_non_resident;
		this.r17_product = r17_product;
		this.r17_resident = r17_resident;
		this.r17_non_resident = r17_non_resident;
		this.r18_product = r18_product;
		this.r18_resident = r18_resident;
		this.r18_non_resident = r18_non_resident;
		this.r19_product = r19_product;
		this.r19_resident = r19_resident;
		this.r19_non_resident = r19_non_resident;
		this.r20_product = r20_product;
		this.r20_resident = r20_resident;
		this.r20_non_resident = r20_non_resident;
		this.r21_product = r21_product;
		this.r21_resident = r21_resident;
		this.r21_non_resident = r21_non_resident;
		this.r22_product = r22_product;
		this.r22_resident = r22_resident;
		this.r22_non_resident = r22_non_resident;
		this.r23_product = r23_product;
		this.r23_resident = r23_resident;
		this.r23_non_resident = r23_non_resident;
		this.r24_product = r24_product;
		this.r24_resident = r24_resident;
		this.r24_non_resident = r24_non_resident;
		this.r25_product = r25_product;
		this.r25_resident = r25_resident;
		this.r25_non_resident = r25_non_resident;
		this.r26_product = r26_product;
		this.r26_resident = r26_resident;
		this.r26_non_resident = r26_non_resident;
		this.r27_product = r27_product;
		this.r27_resident = r27_resident;
		this.r27_non_resident = r27_non_resident;
		this.r28_product = r28_product;
		this.r28_resident = r28_resident;
		this.r28_non_resident = r28_non_resident;
		this.r29_product = r29_product;
		this.r29_resident = r29_resident;
		this.r29_non_resident = r29_non_resident;
		this.r30_product = r30_product;
		this.r30_resident = r30_resident;
		this.r30_non_resident = r30_non_resident;
		this.r31_product = r31_product;
		this.r31_resident = r31_resident;
		this.r31_non_resident = r31_non_resident;
		this.r32_product = r32_product;
		this.r32_resident = r32_resident;
		this.r32_non_resident = r32_non_resident;
		this.r33_product = r33_product;
		this.r33_resident = r33_resident;
		this.r33_non_resident = r33_non_resident;
		this.r34_product = r34_product;
		this.r34_resident = r34_resident;
		this.r34_non_resident = r34_non_resident;
		this.r35_product = r35_product;
		this.r35_resident = r35_resident;
		this.r35_non_resident = r35_non_resident;
		this.r36_product = r36_product;
		this.r36_resident = r36_resident;
		this.r36_non_resident = r36_non_resident;
		this.r37_product = r37_product;
		this.r37_resident = r37_resident;
		this.r37_non_resident = r37_non_resident;
		this.r38_product = r38_product;
		this.r38_resident = r38_resident;
		this.r38_non_resident = r38_non_resident;
		this.r39_product = r39_product;
		this.r39_resident = r39_resident;
		this.r39_non_resident = r39_non_resident;
		this.r40_product = r40_product;
		this.r40_resident = r40_resident;
		this.r40_non_resident = r40_non_resident;
		this.r41_product = r41_product;
		this.r41_resident = r41_resident;
		this.r41_non_resident = r41_non_resident;
		this.r42_product = r42_product;
		this.r42_resident = r42_resident;
		this.r42_non_resident = r42_non_resident;
		this.r43_product = r43_product;
		this.r43_resident = r43_resident;
		this.r43_non_resident = r43_non_resident;
		this.r44_product = r44_product;
		this.r44_resident = r44_resident;
		this.r44_non_resident = r44_non_resident;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
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
	public BRS64_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
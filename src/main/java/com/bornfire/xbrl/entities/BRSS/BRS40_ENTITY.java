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
@Table(name="M_PROVISION_FOF_LOAN")
public class BRS40_ENTITY {
	
	private String	r11_product;
	private BigDecimal	r11_provisions_for_loan_loss;
	private String	r12_product;
	private BigDecimal	r12_provisions_for_loan_loss;
	private String	r13_product;
	private BigDecimal	r13_provisions_for_loan_loss;
	private String	r14_product;
	private BigDecimal	r14_provisions_for_loan_loss;
	private String	r15_product;
	private BigDecimal	r15_provisions_for_loan_loss;
	private String	r16_product;
	private BigDecimal	r16_provisions_for_loan_loss;
	private String	r17_product;
	private BigDecimal	r17_provisions_for_loan_loss;
	private String	r18_product;
	private BigDecimal	r18_provisions_for_loan_loss;
	private String	r19_product;
	private BigDecimal	r19_provisions_for_loan_loss;
	private String	r20_product;
	private BigDecimal	r20_provisions_for_loan_loss;
	private String	r21_product;
	private BigDecimal	r21_provisions_for_loan_loss;
	private String	r22_product;
	private BigDecimal	r22_provisions_for_loan_loss;
	private String	r23_product;
	private BigDecimal	r23_provisions_for_loan_loss;
	private String	r24_product;
	private BigDecimal	r24_provisions_for_loan_loss;
	private String	r25_product;
	private BigDecimal	r25_provisions_for_loan_loss;
	private String	r26_product;
	private BigDecimal	r26_provisions_for_loan_loss;
	private String	r27_product;
	private BigDecimal	r27_provisions_for_loan_loss;
	private String	r28_product;
	private BigDecimal	r28_provisions_for_loan_loss;
	private String	r29_product;
	private BigDecimal	r29_provisions_for_loan_loss;
	private String	r30_product;
	private BigDecimal	r30_provisions_for_loan_loss;
	private String	r31_product;
	private BigDecimal	r31_provisions_for_loan_loss;
	private String	r32_product;
	private BigDecimal	r32_provisions_for_loan_loss;
	private String	r33_product;
	private BigDecimal	r33_provisions_for_loan_loss;
	private String	r34_product;
	private BigDecimal	r34_provisions_for_loan_loss;
	private String	r35_product;
	private BigDecimal	r35_provisions_for_loan_loss;
	private String	r36_product;
	private BigDecimal	r36_provisions_for_loan_loss;
	private String	r37_product;
	private BigDecimal	r37_provisions_for_loan_loss;
	private String	r38_product;
	private BigDecimal	r38_provisions_for_loan_loss;
	private String	r39_product;
	private BigDecimal	r39_provisions_for_loan_loss;
	private String	r40_product;
	private BigDecimal	r40_provisions_for_loan_loss;
	private String	r41_product;
	private BigDecimal	r41_provisions_for_loan_loss;
	private String	r42_product;
	private BigDecimal	r42_provisions_for_loan_loss;
	private String	r43_product;
	private BigDecimal	r43_provisions_for_loan_loss;
	private String	r44_product;
	private BigDecimal	r44_provisions_for_loan_loss;
	private String	r45_product;
	private BigDecimal	r45_provisions_for_loan_loss;
	private String	r46_product;
	private BigDecimal	r46_provisions_for_loan_loss;
	private String	r47_product;
	private BigDecimal	r47_provisions_for_loan_loss;
	private String	r48_product;
	private BigDecimal	r48_provisions_for_loan_loss;
	private String	r49_product;
	private BigDecimal	r49_provisions_for_loan_loss;
	private String	r50_product;
	private BigDecimal	r50_provisions_for_loan_loss;
	private String	r51_product;
	private BigDecimal	r51_provisions_for_loan_loss;
	private String	r52_product;
	private BigDecimal	r52_provisions_for_loan_loss;
	private String	r53_product;
	private BigDecimal	r53_provisions_for_loan_loss;
	private String	r54_product;
	private BigDecimal	r54_provisions_for_loan_loss;
	private String	r55_product;
	private BigDecimal	r55_provisions_for_loan_loss;
	private String	r56_product;
	private BigDecimal	r56_provisions_for_loan_loss;
	private String	r57_product;
	private BigDecimal	r57_provisions_for_loan_loss;
	private String	r58_product;
	private BigDecimal	r58_provisions_for_loan_loss;
	private String	r59_product;
	private BigDecimal	r59_provisions_for_loan_loss;
	private String	r60_product;
	private BigDecimal	r60_provisions_for_loan_loss;
	private String	r61_product;
	private BigDecimal	r61_provisions_for_loan_loss;
	private String	r62_product;
	private BigDecimal	r62_provisions_for_loan_loss;
	private String	r63_product;
	private BigDecimal	r63_provisions_for_loan_loss;
	private String	r64_product;
	private BigDecimal	r64_provisions_for_loan_loss;
	private String	r71_product;
	private BigDecimal	r71_provisions_for_loan_loss;
	private String	r73_product;
	private BigDecimal	r73_provisions_for_loan_loss;
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
	public String getR11_product() {
		return r11_product;
	}
	public void setR11_product(String r11_product) {
		this.r11_product = r11_product;
	}
	public BigDecimal getR11_provisions_for_loan_loss() {
		return r11_provisions_for_loan_loss;
	}
	public void setR11_provisions_for_loan_loss(BigDecimal r11_provisions_for_loan_loss) {
		this.r11_provisions_for_loan_loss = r11_provisions_for_loan_loss;
	}
	public String getR12_product() {
		return r12_product;
	}
	public void setR12_product(String r12_product) {
		this.r12_product = r12_product;
	}
	public BigDecimal getR12_provisions_for_loan_loss() {
		return r12_provisions_for_loan_loss;
	}
	public void setR12_provisions_for_loan_loss(BigDecimal r12_provisions_for_loan_loss) {
		this.r12_provisions_for_loan_loss = r12_provisions_for_loan_loss;
	}
	public String getR13_product() {
		return r13_product;
	}
	public void setR13_product(String r13_product) {
		this.r13_product = r13_product;
	}
	public BigDecimal getR13_provisions_for_loan_loss() {
		return r13_provisions_for_loan_loss;
	}
	public void setR13_provisions_for_loan_loss(BigDecimal r13_provisions_for_loan_loss) {
		this.r13_provisions_for_loan_loss = r13_provisions_for_loan_loss;
	}
	public String getR14_product() {
		return r14_product;
	}
	public void setR14_product(String r14_product) {
		this.r14_product = r14_product;
	}
	public BigDecimal getR14_provisions_for_loan_loss() {
		return r14_provisions_for_loan_loss;
	}
	public void setR14_provisions_for_loan_loss(BigDecimal r14_provisions_for_loan_loss) {
		this.r14_provisions_for_loan_loss = r14_provisions_for_loan_loss;
	}
	public String getR15_product() {
		return r15_product;
	}
	public void setR15_product(String r15_product) {
		this.r15_product = r15_product;
	}
	public BigDecimal getR15_provisions_for_loan_loss() {
		return r15_provisions_for_loan_loss;
	}
	public void setR15_provisions_for_loan_loss(BigDecimal r15_provisions_for_loan_loss) {
		this.r15_provisions_for_loan_loss = r15_provisions_for_loan_loss;
	}
	public String getR16_product() {
		return r16_product;
	}
	public void setR16_product(String r16_product) {
		this.r16_product = r16_product;
	}
	public BigDecimal getR16_provisions_for_loan_loss() {
		return r16_provisions_for_loan_loss;
	}
	public void setR16_provisions_for_loan_loss(BigDecimal r16_provisions_for_loan_loss) {
		this.r16_provisions_for_loan_loss = r16_provisions_for_loan_loss;
	}
	public String getR17_product() {
		return r17_product;
	}
	public void setR17_product(String r17_product) {
		this.r17_product = r17_product;
	}
	public BigDecimal getR17_provisions_for_loan_loss() {
		return r17_provisions_for_loan_loss;
	}
	public void setR17_provisions_for_loan_loss(BigDecimal r17_provisions_for_loan_loss) {
		this.r17_provisions_for_loan_loss = r17_provisions_for_loan_loss;
	}
	public String getR18_product() {
		return r18_product;
	}
	public void setR18_product(String r18_product) {
		this.r18_product = r18_product;
	}
	public BigDecimal getR18_provisions_for_loan_loss() {
		return r18_provisions_for_loan_loss;
	}
	public void setR18_provisions_for_loan_loss(BigDecimal r18_provisions_for_loan_loss) {
		this.r18_provisions_for_loan_loss = r18_provisions_for_loan_loss;
	}
	public String getR19_product() {
		return r19_product;
	}
	public void setR19_product(String r19_product) {
		this.r19_product = r19_product;
	}
	public BigDecimal getR19_provisions_for_loan_loss() {
		return r19_provisions_for_loan_loss;
	}
	public void setR19_provisions_for_loan_loss(BigDecimal r19_provisions_for_loan_loss) {
		this.r19_provisions_for_loan_loss = r19_provisions_for_loan_loss;
	}
	public String getR20_product() {
		return r20_product;
	}
	public void setR20_product(String r20_product) {
		this.r20_product = r20_product;
	}
	public BigDecimal getR20_provisions_for_loan_loss() {
		return r20_provisions_for_loan_loss;
	}
	public void setR20_provisions_for_loan_loss(BigDecimal r20_provisions_for_loan_loss) {
		this.r20_provisions_for_loan_loss = r20_provisions_for_loan_loss;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public BigDecimal getR21_provisions_for_loan_loss() {
		return r21_provisions_for_loan_loss;
	}
	public void setR21_provisions_for_loan_loss(BigDecimal r21_provisions_for_loan_loss) {
		this.r21_provisions_for_loan_loss = r21_provisions_for_loan_loss;
	}
	public String getR22_product() {
		return r22_product;
	}
	public void setR22_product(String r22_product) {
		this.r22_product = r22_product;
	}
	public BigDecimal getR22_provisions_for_loan_loss() {
		return r22_provisions_for_loan_loss;
	}
	public void setR22_provisions_for_loan_loss(BigDecimal r22_provisions_for_loan_loss) {
		this.r22_provisions_for_loan_loss = r22_provisions_for_loan_loss;
	}
	public String getR23_product() {
		return r23_product;
	}
	public void setR23_product(String r23_product) {
		this.r23_product = r23_product;
	}
	public BigDecimal getR23_provisions_for_loan_loss() {
		return r23_provisions_for_loan_loss;
	}
	public void setR23_provisions_for_loan_loss(BigDecimal r23_provisions_for_loan_loss) {
		this.r23_provisions_for_loan_loss = r23_provisions_for_loan_loss;
	}
	public String getR24_product() {
		return r24_product;
	}
	public void setR24_product(String r24_product) {
		this.r24_product = r24_product;
	}
	public BigDecimal getR24_provisions_for_loan_loss() {
		return r24_provisions_for_loan_loss;
	}
	public void setR24_provisions_for_loan_loss(BigDecimal r24_provisions_for_loan_loss) {
		this.r24_provisions_for_loan_loss = r24_provisions_for_loan_loss;
	}
	public String getR25_product() {
		return r25_product;
	}
	public void setR25_product(String r25_product) {
		this.r25_product = r25_product;
	}
	public BigDecimal getR25_provisions_for_loan_loss() {
		return r25_provisions_for_loan_loss;
	}
	public void setR25_provisions_for_loan_loss(BigDecimal r25_provisions_for_loan_loss) {
		this.r25_provisions_for_loan_loss = r25_provisions_for_loan_loss;
	}
	public String getR26_product() {
		return r26_product;
	}
	public void setR26_product(String r26_product) {
		this.r26_product = r26_product;
	}
	public BigDecimal getR26_provisions_for_loan_loss() {
		return r26_provisions_for_loan_loss;
	}
	public void setR26_provisions_for_loan_loss(BigDecimal r26_provisions_for_loan_loss) {
		this.r26_provisions_for_loan_loss = r26_provisions_for_loan_loss;
	}
	public String getR27_product() {
		return r27_product;
	}
	public void setR27_product(String r27_product) {
		this.r27_product = r27_product;
	}
	public BigDecimal getR27_provisions_for_loan_loss() {
		return r27_provisions_for_loan_loss;
	}
	public void setR27_provisions_for_loan_loss(BigDecimal r27_provisions_for_loan_loss) {
		this.r27_provisions_for_loan_loss = r27_provisions_for_loan_loss;
	}
	public String getR28_product() {
		return r28_product;
	}
	public void setR28_product(String r28_product) {
		this.r28_product = r28_product;
	}
	public BigDecimal getR28_provisions_for_loan_loss() {
		return r28_provisions_for_loan_loss;
	}
	public void setR28_provisions_for_loan_loss(BigDecimal r28_provisions_for_loan_loss) {
		this.r28_provisions_for_loan_loss = r28_provisions_for_loan_loss;
	}
	public String getR29_product() {
		return r29_product;
	}
	public void setR29_product(String r29_product) {
		this.r29_product = r29_product;
	}
	public BigDecimal getR29_provisions_for_loan_loss() {
		return r29_provisions_for_loan_loss;
	}
	public void setR29_provisions_for_loan_loss(BigDecimal r29_provisions_for_loan_loss) {
		this.r29_provisions_for_loan_loss = r29_provisions_for_loan_loss;
	}
	public String getR30_product() {
		return r30_product;
	}
	public void setR30_product(String r30_product) {
		this.r30_product = r30_product;
	}
	public BigDecimal getR30_provisions_for_loan_loss() {
		return r30_provisions_for_loan_loss;
	}
	public void setR30_provisions_for_loan_loss(BigDecimal r30_provisions_for_loan_loss) {
		this.r30_provisions_for_loan_loss = r30_provisions_for_loan_loss;
	}
	public String getR31_product() {
		return r31_product;
	}
	public void setR31_product(String r31_product) {
		this.r31_product = r31_product;
	}
	public BigDecimal getR31_provisions_for_loan_loss() {
		return r31_provisions_for_loan_loss;
	}
	public void setR31_provisions_for_loan_loss(BigDecimal r31_provisions_for_loan_loss) {
		this.r31_provisions_for_loan_loss = r31_provisions_for_loan_loss;
	}
	public String getR32_product() {
		return r32_product;
	}
	public void setR32_product(String r32_product) {
		this.r32_product = r32_product;
	}
	public BigDecimal getR32_provisions_for_loan_loss() {
		return r32_provisions_for_loan_loss;
	}
	public void setR32_provisions_for_loan_loss(BigDecimal r32_provisions_for_loan_loss) {
		this.r32_provisions_for_loan_loss = r32_provisions_for_loan_loss;
	}
	public String getR33_product() {
		return r33_product;
	}
	public void setR33_product(String r33_product) {
		this.r33_product = r33_product;
	}
	public BigDecimal getR33_provisions_for_loan_loss() {
		return r33_provisions_for_loan_loss;
	}
	public void setR33_provisions_for_loan_loss(BigDecimal r33_provisions_for_loan_loss) {
		this.r33_provisions_for_loan_loss = r33_provisions_for_loan_loss;
	}
	public String getR34_product() {
		return r34_product;
	}
	public void setR34_product(String r34_product) {
		this.r34_product = r34_product;
	}
	public BigDecimal getR34_provisions_for_loan_loss() {
		return r34_provisions_for_loan_loss;
	}
	public void setR34_provisions_for_loan_loss(BigDecimal r34_provisions_for_loan_loss) {
		this.r34_provisions_for_loan_loss = r34_provisions_for_loan_loss;
	}
	public String getR35_product() {
		return r35_product;
	}
	public void setR35_product(String r35_product) {
		this.r35_product = r35_product;
	}
	public BigDecimal getR35_provisions_for_loan_loss() {
		return r35_provisions_for_loan_loss;
	}
	public void setR35_provisions_for_loan_loss(BigDecimal r35_provisions_for_loan_loss) {
		this.r35_provisions_for_loan_loss = r35_provisions_for_loan_loss;
	}
	public String getR36_product() {
		return r36_product;
	}
	public void setR36_product(String r36_product) {
		this.r36_product = r36_product;
	}
	public BigDecimal getR36_provisions_for_loan_loss() {
		return r36_provisions_for_loan_loss;
	}
	public void setR36_provisions_for_loan_loss(BigDecimal r36_provisions_for_loan_loss) {
		this.r36_provisions_for_loan_loss = r36_provisions_for_loan_loss;
	}
	public String getR37_product() {
		return r37_product;
	}
	public void setR37_product(String r37_product) {
		this.r37_product = r37_product;
	}
	public BigDecimal getR37_provisions_for_loan_loss() {
		return r37_provisions_for_loan_loss;
	}
	public void setR37_provisions_for_loan_loss(BigDecimal r37_provisions_for_loan_loss) {
		this.r37_provisions_for_loan_loss = r37_provisions_for_loan_loss;
	}
	public String getR38_product() {
		return r38_product;
	}
	public void setR38_product(String r38_product) {
		this.r38_product = r38_product;
	}
	public BigDecimal getR38_provisions_for_loan_loss() {
		return r38_provisions_for_loan_loss;
	}
	public void setR38_provisions_for_loan_loss(BigDecimal r38_provisions_for_loan_loss) {
		this.r38_provisions_for_loan_loss = r38_provisions_for_loan_loss;
	}
	public String getR39_product() {
		return r39_product;
	}
	public void setR39_product(String r39_product) {
		this.r39_product = r39_product;
	}
	public BigDecimal getR39_provisions_for_loan_loss() {
		return r39_provisions_for_loan_loss;
	}
	public void setR39_provisions_for_loan_loss(BigDecimal r39_provisions_for_loan_loss) {
		this.r39_provisions_for_loan_loss = r39_provisions_for_loan_loss;
	}
	public String getR40_product() {
		return r40_product;
	}
	public void setR40_product(String r40_product) {
		this.r40_product = r40_product;
	}
	public BigDecimal getR40_provisions_for_loan_loss() {
		return r40_provisions_for_loan_loss;
	}
	public void setR40_provisions_for_loan_loss(BigDecimal r40_provisions_for_loan_loss) {
		this.r40_provisions_for_loan_loss = r40_provisions_for_loan_loss;
	}
	public String getR41_product() {
		return r41_product;
	}
	public void setR41_product(String r41_product) {
		this.r41_product = r41_product;
	}
	public BigDecimal getR41_provisions_for_loan_loss() {
		return r41_provisions_for_loan_loss;
	}
	public void setR41_provisions_for_loan_loss(BigDecimal r41_provisions_for_loan_loss) {
		this.r41_provisions_for_loan_loss = r41_provisions_for_loan_loss;
	}
	public String getR42_product() {
		return r42_product;
	}
	public void setR42_product(String r42_product) {
		this.r42_product = r42_product;
	}
	public BigDecimal getR42_provisions_for_loan_loss() {
		return r42_provisions_for_loan_loss;
	}
	public void setR42_provisions_for_loan_loss(BigDecimal r42_provisions_for_loan_loss) {
		this.r42_provisions_for_loan_loss = r42_provisions_for_loan_loss;
	}
	public String getR43_product() {
		return r43_product;
	}
	public void setR43_product(String r43_product) {
		this.r43_product = r43_product;
	}
	public BigDecimal getR43_provisions_for_loan_loss() {
		return r43_provisions_for_loan_loss;
	}
	public void setR43_provisions_for_loan_loss(BigDecimal r43_provisions_for_loan_loss) {
		this.r43_provisions_for_loan_loss = r43_provisions_for_loan_loss;
	}
	public String getR44_product() {
		return r44_product;
	}
	public void setR44_product(String r44_product) {
		this.r44_product = r44_product;
	}
	public BigDecimal getR44_provisions_for_loan_loss() {
		return r44_provisions_for_loan_loss;
	}
	public void setR44_provisions_for_loan_loss(BigDecimal r44_provisions_for_loan_loss) {
		this.r44_provisions_for_loan_loss = r44_provisions_for_loan_loss;
	}
	public String getR45_product() {
		return r45_product;
	}
	public void setR45_product(String r45_product) {
		this.r45_product = r45_product;
	}
	public BigDecimal getR45_provisions_for_loan_loss() {
		return r45_provisions_for_loan_loss;
	}
	public void setR45_provisions_for_loan_loss(BigDecimal r45_provisions_for_loan_loss) {
		this.r45_provisions_for_loan_loss = r45_provisions_for_loan_loss;
	}
	public String getR46_product() {
		return r46_product;
	}
	public void setR46_product(String r46_product) {
		this.r46_product = r46_product;
	}
	public BigDecimal getR46_provisions_for_loan_loss() {
		return r46_provisions_for_loan_loss;
	}
	public void setR46_provisions_for_loan_loss(BigDecimal r46_provisions_for_loan_loss) {
		this.r46_provisions_for_loan_loss = r46_provisions_for_loan_loss;
	}
	public String getR47_product() {
		return r47_product;
	}
	public void setR47_product(String r47_product) {
		this.r47_product = r47_product;
	}
	public BigDecimal getR47_provisions_for_loan_loss() {
		return r47_provisions_for_loan_loss;
	}
	public void setR47_provisions_for_loan_loss(BigDecimal r47_provisions_for_loan_loss) {
		this.r47_provisions_for_loan_loss = r47_provisions_for_loan_loss;
	}
	public String getR48_product() {
		return r48_product;
	}
	public void setR48_product(String r48_product) {
		this.r48_product = r48_product;
	}
	public BigDecimal getR48_provisions_for_loan_loss() {
		return r48_provisions_for_loan_loss;
	}
	public void setR48_provisions_for_loan_loss(BigDecimal r48_provisions_for_loan_loss) {
		this.r48_provisions_for_loan_loss = r48_provisions_for_loan_loss;
	}
	public String getR49_product() {
		return r49_product;
	}
	public void setR49_product(String r49_product) {
		this.r49_product = r49_product;
	}
	public BigDecimal getR49_provisions_for_loan_loss() {
		return r49_provisions_for_loan_loss;
	}
	public void setR49_provisions_for_loan_loss(BigDecimal r49_provisions_for_loan_loss) {
		this.r49_provisions_for_loan_loss = r49_provisions_for_loan_loss;
	}
	public String getR50_product() {
		return r50_product;
	}
	public void setR50_product(String r50_product) {
		this.r50_product = r50_product;
	}
	public BigDecimal getR50_provisions_for_loan_loss() {
		return r50_provisions_for_loan_loss;
	}
	public void setR50_provisions_for_loan_loss(BigDecimal r50_provisions_for_loan_loss) {
		this.r50_provisions_for_loan_loss = r50_provisions_for_loan_loss;
	}
	public String getR51_product() {
		return r51_product;
	}
	public void setR51_product(String r51_product) {
		this.r51_product = r51_product;
	}
	public BigDecimal getR51_provisions_for_loan_loss() {
		return r51_provisions_for_loan_loss;
	}
	public void setR51_provisions_for_loan_loss(BigDecimal r51_provisions_for_loan_loss) {
		this.r51_provisions_for_loan_loss = r51_provisions_for_loan_loss;
	}
	public String getR52_product() {
		return r52_product;
	}
	public void setR52_product(String r52_product) {
		this.r52_product = r52_product;
	}
	public BigDecimal getR52_provisions_for_loan_loss() {
		return r52_provisions_for_loan_loss;
	}
	public void setR52_provisions_for_loan_loss(BigDecimal r52_provisions_for_loan_loss) {
		this.r52_provisions_for_loan_loss = r52_provisions_for_loan_loss;
	}
	public String getR53_product() {
		return r53_product;
	}
	public void setR53_product(String r53_product) {
		this.r53_product = r53_product;
	}
	public BigDecimal getR53_provisions_for_loan_loss() {
		return r53_provisions_for_loan_loss;
	}
	public void setR53_provisions_for_loan_loss(BigDecimal r53_provisions_for_loan_loss) {
		this.r53_provisions_for_loan_loss = r53_provisions_for_loan_loss;
	}
	public String getR54_product() {
		return r54_product;
	}
	public void setR54_product(String r54_product) {
		this.r54_product = r54_product;
	}
	public BigDecimal getR54_provisions_for_loan_loss() {
		return r54_provisions_for_loan_loss;
	}
	public void setR54_provisions_for_loan_loss(BigDecimal r54_provisions_for_loan_loss) {
		this.r54_provisions_for_loan_loss = r54_provisions_for_loan_loss;
	}
	public String getR55_product() {
		return r55_product;
	}
	public void setR55_product(String r55_product) {
		this.r55_product = r55_product;
	}
	public BigDecimal getR55_provisions_for_loan_loss() {
		return r55_provisions_for_loan_loss;
	}
	public void setR55_provisions_for_loan_loss(BigDecimal r55_provisions_for_loan_loss) {
		this.r55_provisions_for_loan_loss = r55_provisions_for_loan_loss;
	}
	public String getR56_product() {
		return r56_product;
	}
	public void setR56_product(String r56_product) {
		this.r56_product = r56_product;
	}
	public BigDecimal getR56_provisions_for_loan_loss() {
		return r56_provisions_for_loan_loss;
	}
	public void setR56_provisions_for_loan_loss(BigDecimal r56_provisions_for_loan_loss) {
		this.r56_provisions_for_loan_loss = r56_provisions_for_loan_loss;
	}
	public String getR57_product() {
		return r57_product;
	}
	public void setR57_product(String r57_product) {
		this.r57_product = r57_product;
	}
	public BigDecimal getR57_provisions_for_loan_loss() {
		return r57_provisions_for_loan_loss;
	}
	public void setR57_provisions_for_loan_loss(BigDecimal r57_provisions_for_loan_loss) {
		this.r57_provisions_for_loan_loss = r57_provisions_for_loan_loss;
	}
	public String getR58_product() {
		return r58_product;
	}
	public void setR58_product(String r58_product) {
		this.r58_product = r58_product;
	}
	public BigDecimal getR58_provisions_for_loan_loss() {
		return r58_provisions_for_loan_loss;
	}
	public void setR58_provisions_for_loan_loss(BigDecimal r58_provisions_for_loan_loss) {
		this.r58_provisions_for_loan_loss = r58_provisions_for_loan_loss;
	}
	public String getR59_product() {
		return r59_product;
	}
	public void setR59_product(String r59_product) {
		this.r59_product = r59_product;
	}
	public BigDecimal getR59_provisions_for_loan_loss() {
		return r59_provisions_for_loan_loss;
	}
	public void setR59_provisions_for_loan_loss(BigDecimal r59_provisions_for_loan_loss) {
		this.r59_provisions_for_loan_loss = r59_provisions_for_loan_loss;
	}
	public String getR60_product() {
		return r60_product;
	}
	public void setR60_product(String r60_product) {
		this.r60_product = r60_product;
	}
	public BigDecimal getR60_provisions_for_loan_loss() {
		return r60_provisions_for_loan_loss;
	}
	public void setR60_provisions_for_loan_loss(BigDecimal r60_provisions_for_loan_loss) {
		this.r60_provisions_for_loan_loss = r60_provisions_for_loan_loss;
	}
	public String getR61_product() {
		return r61_product;
	}
	public void setR61_product(String r61_product) {
		this.r61_product = r61_product;
	}
	public BigDecimal getR61_provisions_for_loan_loss() {
		return r61_provisions_for_loan_loss;
	}
	public void setR61_provisions_for_loan_loss(BigDecimal r61_provisions_for_loan_loss) {
		this.r61_provisions_for_loan_loss = r61_provisions_for_loan_loss;
	}
	public String getR62_product() {
		return r62_product;
	}
	public void setR62_product(String r62_product) {
		this.r62_product = r62_product;
	}
	public BigDecimal getR62_provisions_for_loan_loss() {
		return r62_provisions_for_loan_loss;
	}
	public void setR62_provisions_for_loan_loss(BigDecimal r62_provisions_for_loan_loss) {
		this.r62_provisions_for_loan_loss = r62_provisions_for_loan_loss;
	}
	public String getR63_product() {
		return r63_product;
	}
	public void setR63_product(String r63_product) {
		this.r63_product = r63_product;
	}
	public BigDecimal getR63_provisions_for_loan_loss() {
		return r63_provisions_for_loan_loss;
	}
	public void setR63_provisions_for_loan_loss(BigDecimal r63_provisions_for_loan_loss) {
		this.r63_provisions_for_loan_loss = r63_provisions_for_loan_loss;
	}
	public String getR64_product() {
		return r64_product;
	}
	public void setR64_product(String r64_product) {
		this.r64_product = r64_product;
	}
	public BigDecimal getR64_provisions_for_loan_loss() {
		return r64_provisions_for_loan_loss;
	}
	public void setR64_provisions_for_loan_loss(BigDecimal r64_provisions_for_loan_loss) {
		this.r64_provisions_for_loan_loss = r64_provisions_for_loan_loss;
	}
	public String getR71_product() {
		return r71_product;
	}
	public void setR71_product(String r71_product) {
		this.r71_product = r71_product;
	}
	public BigDecimal getR71_provisions_for_loan_loss() {
		return r71_provisions_for_loan_loss;
	}
	public void setR71_provisions_for_loan_loss(BigDecimal r71_provisions_for_loan_loss) {
		this.r71_provisions_for_loan_loss = r71_provisions_for_loan_loss;
	}
	public String getR73_product() {
		return r73_product;
	}
	public void setR73_product(String r73_product) {
		this.r73_product = r73_product;
	}
	public BigDecimal getR73_provisions_for_loan_loss() {
		return r73_provisions_for_loan_loss;
	}
	public void setR73_provisions_for_loan_loss(BigDecimal r73_provisions_for_loan_loss) {
		this.r73_provisions_for_loan_loss = r73_provisions_for_loan_loss;
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
		return "BRS40_ENTITY [r11_product=" + r11_product + ", r11_provisions_for_loan_loss="
				+ r11_provisions_for_loan_loss + ", r12_product=" + r12_product + ", r12_provisions_for_loan_loss="
				+ r12_provisions_for_loan_loss + ", r13_product=" + r13_product + ", r13_provisions_for_loan_loss="
				+ r13_provisions_for_loan_loss + ", r14_product=" + r14_product + ", r14_provisions_for_loan_loss="
				+ r14_provisions_for_loan_loss + ", r15_product=" + r15_product + ", r15_provisions_for_loan_loss="
				+ r15_provisions_for_loan_loss + ", r16_product=" + r16_product + ", r16_provisions_for_loan_loss="
				+ r16_provisions_for_loan_loss + ", r17_product=" + r17_product + ", r17_provisions_for_loan_loss="
				+ r17_provisions_for_loan_loss + ", r18_product=" + r18_product + ", r18_provisions_for_loan_loss="
				+ r18_provisions_for_loan_loss + ", r19_product=" + r19_product + ", r19_provisions_for_loan_loss="
				+ r19_provisions_for_loan_loss + ", r20_product=" + r20_product + ", r20_provisions_for_loan_loss="
				+ r20_provisions_for_loan_loss + ", r21_product=" + r21_product + ", r21_provisions_for_loan_loss="
				+ r21_provisions_for_loan_loss + ", r22_product=" + r22_product + ", r22_provisions_for_loan_loss="
				+ r22_provisions_for_loan_loss + ", r23_product=" + r23_product + ", r23_provisions_for_loan_loss="
				+ r23_provisions_for_loan_loss + ", r24_product=" + r24_product + ", r24_provisions_for_loan_loss="
				+ r24_provisions_for_loan_loss + ", r25_product=" + r25_product + ", r25_provisions_for_loan_loss="
				+ r25_provisions_for_loan_loss + ", r26_product=" + r26_product + ", r26_provisions_for_loan_loss="
				+ r26_provisions_for_loan_loss + ", r27_product=" + r27_product + ", r27_provisions_for_loan_loss="
				+ r27_provisions_for_loan_loss + ", r28_product=" + r28_product + ", r28_provisions_for_loan_loss="
				+ r28_provisions_for_loan_loss + ", r29_product=" + r29_product + ", r29_provisions_for_loan_loss="
				+ r29_provisions_for_loan_loss + ", r30_product=" + r30_product + ", r30_provisions_for_loan_loss="
				+ r30_provisions_for_loan_loss + ", r31_product=" + r31_product + ", r31_provisions_for_loan_loss="
				+ r31_provisions_for_loan_loss + ", r32_product=" + r32_product + ", r32_provisions_for_loan_loss="
				+ r32_provisions_for_loan_loss + ", r33_product=" + r33_product + ", r33_provisions_for_loan_loss="
				+ r33_provisions_for_loan_loss + ", r34_product=" + r34_product + ", r34_provisions_for_loan_loss="
				+ r34_provisions_for_loan_loss + ", r35_product=" + r35_product + ", r35_provisions_for_loan_loss="
				+ r35_provisions_for_loan_loss + ", r36_product=" + r36_product + ", r36_provisions_for_loan_loss="
				+ r36_provisions_for_loan_loss + ", r37_product=" + r37_product + ", r37_provisions_for_loan_loss="
				+ r37_provisions_for_loan_loss + ", r38_product=" + r38_product + ", r38_provisions_for_loan_loss="
				+ r38_provisions_for_loan_loss + ", r39_product=" + r39_product + ", r39_provisions_for_loan_loss="
				+ r39_provisions_for_loan_loss + ", r40_product=" + r40_product + ", r40_provisions_for_loan_loss="
				+ r40_provisions_for_loan_loss + ", r41_product=" + r41_product + ", r41_provisions_for_loan_loss="
				+ r41_provisions_for_loan_loss + ", r42_product=" + r42_product + ", r42_provisions_for_loan_loss="
				+ r42_provisions_for_loan_loss + ", r43_product=" + r43_product + ", r43_provisions_for_loan_loss="
				+ r43_provisions_for_loan_loss + ", r44_product=" + r44_product + ", r44_provisions_for_loan_loss="
				+ r44_provisions_for_loan_loss + ", r45_product=" + r45_product + ", r45_provisions_for_loan_loss="
				+ r45_provisions_for_loan_loss + ", r46_product=" + r46_product + ", r46_provisions_for_loan_loss="
				+ r46_provisions_for_loan_loss + ", r47_product=" + r47_product + ", r47_provisions_for_loan_loss="
				+ r47_provisions_for_loan_loss + ", r48_product=" + r48_product + ", r48_provisions_for_loan_loss="
				+ r48_provisions_for_loan_loss + ", r49_product=" + r49_product + ", r49_provisions_for_loan_loss="
				+ r49_provisions_for_loan_loss + ", r50_product=" + r50_product + ", r50_provisions_for_loan_loss="
				+ r50_provisions_for_loan_loss + ", r51_product=" + r51_product + ", r51_provisions_for_loan_loss="
				+ r51_provisions_for_loan_loss + ", r52_product=" + r52_product + ", r52_provisions_for_loan_loss="
				+ r52_provisions_for_loan_loss + ", r53_product=" + r53_product + ", r53_provisions_for_loan_loss="
				+ r53_provisions_for_loan_loss + ", r54_product=" + r54_product + ", r54_provisions_for_loan_loss="
				+ r54_provisions_for_loan_loss + ", r55_product=" + r55_product + ", r55_provisions_for_loan_loss="
				+ r55_provisions_for_loan_loss + ", r56_product=" + r56_product + ", r56_provisions_for_loan_loss="
				+ r56_provisions_for_loan_loss + ", r57_product=" + r57_product + ", r57_provisions_for_loan_loss="
				+ r57_provisions_for_loan_loss + ", r58_product=" + r58_product + ", r58_provisions_for_loan_loss="
				+ r58_provisions_for_loan_loss + ", r59_product=" + r59_product + ", r59_provisions_for_loan_loss="
				+ r59_provisions_for_loan_loss + ", r60_product=" + r60_product + ", r60_provisions_for_loan_loss="
				+ r60_provisions_for_loan_loss + ", r61_product=" + r61_product + ", r61_provisions_for_loan_loss="
				+ r61_provisions_for_loan_loss + ", r62_product=" + r62_product + ", r62_provisions_for_loan_loss="
				+ r62_provisions_for_loan_loss + ", r63_product=" + r63_product + ", r63_provisions_for_loan_loss="
				+ r63_provisions_for_loan_loss + ", r64_product=" + r64_product + ", r64_provisions_for_loan_loss="
				+ r64_provisions_for_loan_loss + ", r71_product=" + r71_product + ", r71_provisions_for_loan_loss="
				+ r71_provisions_for_loan_loss + ", r73_product=" + r73_product + ", r73_provisions_for_loan_loss="
				+ r73_provisions_for_loan_loss + ", report_date=" + report_date + ", report_from_date="
				+ report_from_date + ", report_to_date=" + report_to_date + ", entity_flg=" + entity_flg
				+ ", modify_flg=" + modify_flg + ", del_flg=" + del_flg + ", report_code=" + report_code
				+ ", report_submit_date=" + report_submit_date + ", getR11_product()=" + getR11_product()
				+ ", getR11_provisions_for_loan_loss()=" + getR11_provisions_for_loan_loss() + ", getR12_product()="
				+ getR12_product() + ", getR12_provisions_for_loan_loss()=" + getR12_provisions_for_loan_loss()
				+ ", getR13_product()=" + getR13_product() + ", getR13_provisions_for_loan_loss()="
				+ getR13_provisions_for_loan_loss() + ", getR14_product()=" + getR14_product()
				+ ", getR14_provisions_for_loan_loss()=" + getR14_provisions_for_loan_loss() + ", getR15_product()="
				+ getR15_product() + ", getR15_provisions_for_loan_loss()=" + getR15_provisions_for_loan_loss()
				+ ", getR16_product()=" + getR16_product() + ", getR16_provisions_for_loan_loss()="
				+ getR16_provisions_for_loan_loss() + ", getR17_product()=" + getR17_product()
				+ ", getR17_provisions_for_loan_loss()=" + getR17_provisions_for_loan_loss() + ", getR18_product()="
				+ getR18_product() + ", getR18_provisions_for_loan_loss()=" + getR18_provisions_for_loan_loss()
				+ ", getR19_product()=" + getR19_product() + ", getR19_provisions_for_loan_loss()="
				+ getR19_provisions_for_loan_loss() + ", getR20_product()=" + getR20_product()
				+ ", getR20_provisions_for_loan_loss()=" + getR20_provisions_for_loan_loss() + ", getR21_product()="
				+ getR21_product() + ", getR21_provisions_for_loan_loss()=" + getR21_provisions_for_loan_loss()
				+ ", getR22_product()=" + getR22_product() + ", getR22_provisions_for_loan_loss()="
				+ getR22_provisions_for_loan_loss() + ", getR23_product()=" + getR23_product()
				+ ", getR23_provisions_for_loan_loss()=" + getR23_provisions_for_loan_loss() + ", getR24_product()="
				+ getR24_product() + ", getR24_provisions_for_loan_loss()=" + getR24_provisions_for_loan_loss()
				+ ", getR25_product()=" + getR25_product() + ", getR25_provisions_for_loan_loss()="
				+ getR25_provisions_for_loan_loss() + ", getR26_product()=" + getR26_product()
				+ ", getR26_provisions_for_loan_loss()=" + getR26_provisions_for_loan_loss() + ", getR27_product()="
				+ getR27_product() + ", getR27_provisions_for_loan_loss()=" + getR27_provisions_for_loan_loss()
				+ ", getR28_product()=" + getR28_product() + ", getR28_provisions_for_loan_loss()="
				+ getR28_provisions_for_loan_loss() + ", getR29_product()=" + getR29_product()
				+ ", getR29_provisions_for_loan_loss()=" + getR29_provisions_for_loan_loss() + ", getR30_product()="
				+ getR30_product() + ", getR30_provisions_for_loan_loss()=" + getR30_provisions_for_loan_loss()
				+ ", getR31_product()=" + getR31_product() + ", getR31_provisions_for_loan_loss()="
				+ getR31_provisions_for_loan_loss() + ", getR32_product()=" + getR32_product()
				+ ", getR32_provisions_for_loan_loss()=" + getR32_provisions_for_loan_loss() + ", getR33_product()="
				+ getR33_product() + ", getR33_provisions_for_loan_loss()=" + getR33_provisions_for_loan_loss()
				+ ", getR34_product()=" + getR34_product() + ", getR34_provisions_for_loan_loss()="
				+ getR34_provisions_for_loan_loss() + ", getR35_product()=" + getR35_product()
				+ ", getR35_provisions_for_loan_loss()=" + getR35_provisions_for_loan_loss() + ", getR36_product()="
				+ getR36_product() + ", getR36_provisions_for_loan_loss()=" + getR36_provisions_for_loan_loss()
				+ ", getR37_product()=" + getR37_product() + ", getR37_provisions_for_loan_loss()="
				+ getR37_provisions_for_loan_loss() + ", getR38_product()=" + getR38_product()
				+ ", getR38_provisions_for_loan_loss()=" + getR38_provisions_for_loan_loss() + ", getR39_product()="
				+ getR39_product() + ", getR39_provisions_for_loan_loss()=" + getR39_provisions_for_loan_loss()
				+ ", getR40_product()=" + getR40_product() + ", getR40_provisions_for_loan_loss()="
				+ getR40_provisions_for_loan_loss() + ", getR41_product()=" + getR41_product()
				+ ", getR41_provisions_for_loan_loss()=" + getR41_provisions_for_loan_loss() + ", getR42_product()="
				+ getR42_product() + ", getR42_provisions_for_loan_loss()=" + getR42_provisions_for_loan_loss()
				+ ", getR43_product()=" + getR43_product() + ", getR43_provisions_for_loan_loss()="
				+ getR43_provisions_for_loan_loss() + ", getR44_product()=" + getR44_product()
				+ ", getR44_provisions_for_loan_loss()=" + getR44_provisions_for_loan_loss() + ", getR45_product()="
				+ getR45_product() + ", getR45_provisions_for_loan_loss()=" + getR45_provisions_for_loan_loss()
				+ ", getR46_product()=" + getR46_product() + ", getR46_provisions_for_loan_loss()="
				+ getR46_provisions_for_loan_loss() + ", getR47_product()=" + getR47_product()
				+ ", getR47_provisions_for_loan_loss()=" + getR47_provisions_for_loan_loss() + ", getR48_product()="
				+ getR48_product() + ", getR48_provisions_for_loan_loss()=" + getR48_provisions_for_loan_loss()
				+ ", getR49_product()=" + getR49_product() + ", getR49_provisions_for_loan_loss()="
				+ getR49_provisions_for_loan_loss() + ", getR50_product()=" + getR50_product()
				+ ", getR50_provisions_for_loan_loss()=" + getR50_provisions_for_loan_loss() + ", getR51_product()="
				+ getR51_product() + ", getR51_provisions_for_loan_loss()=" + getR51_provisions_for_loan_loss()
				+ ", getR52_product()=" + getR52_product() + ", getR52_provisions_for_loan_loss()="
				+ getR52_provisions_for_loan_loss() + ", getR53_product()=" + getR53_product()
				+ ", getR53_provisions_for_loan_loss()=" + getR53_provisions_for_loan_loss() + ", getR54_product()="
				+ getR54_product() + ", getR54_provisions_for_loan_loss()=" + getR54_provisions_for_loan_loss()
				+ ", getR55_product()=" + getR55_product() + ", getR55_provisions_for_loan_loss()="
				+ getR55_provisions_for_loan_loss() + ", getR56_product()=" + getR56_product()
				+ ", getR56_provisions_for_loan_loss()=" + getR56_provisions_for_loan_loss() + ", getR57_product()="
				+ getR57_product() + ", getR57_provisions_for_loan_loss()=" + getR57_provisions_for_loan_loss()
				+ ", getR58_product()=" + getR58_product() + ", getR58_provisions_for_loan_loss()="
				+ getR58_provisions_for_loan_loss() + ", getR59_product()=" + getR59_product()
				+ ", getR59_provisions_for_loan_loss()=" + getR59_provisions_for_loan_loss() + ", getR60_product()="
				+ getR60_product() + ", getR60_provisions_for_loan_loss()=" + getR60_provisions_for_loan_loss()
				+ ", getR61_product()=" + getR61_product() + ", getR61_provisions_for_loan_loss()="
				+ getR61_provisions_for_loan_loss() + ", getR62_product()=" + getR62_product()
				+ ", getR62_provisions_for_loan_loss()=" + getR62_provisions_for_loan_loss() + ", getR63_product()="
				+ getR63_product() + ", getR63_provisions_for_loan_loss()=" + getR63_provisions_for_loan_loss()
				+ ", getR64_product()=" + getR64_product() + ", getR64_provisions_for_loan_loss()="
				+ getR64_provisions_for_loan_loss() + ", getR71_product()=" + getR71_product()
				+ ", getR71_provisions_for_loan_loss()=" + getR71_provisions_for_loan_loss() + ", getR73_product()="
				+ getR73_product() + ", getR73_provisions_for_loan_loss()=" + getR73_provisions_for_loan_loss()
				+ ", getReport_date()=" + getReport_date() + ", getReport_from_date()=" + getReport_from_date()
				+ ", getReport_to_date()=" + getReport_to_date() + ", getEntity_flg()=" + getEntity_flg()
				+ ", getModify_flg()=" + getModify_flg() + ", getDel_flg()=" + getDel_flg() + ", getReport_code()="
				+ getReport_code() + ", getReport_submit_date()=" + getReport_submit_date() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS40_ENTITY(String r11_product, BigDecimal r11_provisions_for_loan_loss, String r12_product,
			BigDecimal r12_provisions_for_loan_loss, String r13_product, BigDecimal r13_provisions_for_loan_loss,
			String r14_product, BigDecimal r14_provisions_for_loan_loss, String r15_product,
			BigDecimal r15_provisions_for_loan_loss, String r16_product, BigDecimal r16_provisions_for_loan_loss,
			String r17_product, BigDecimal r17_provisions_for_loan_loss, String r18_product,
			BigDecimal r18_provisions_for_loan_loss, String r19_product, BigDecimal r19_provisions_for_loan_loss,
			String r20_product, BigDecimal r20_provisions_for_loan_loss, String r21_product,
			BigDecimal r21_provisions_for_loan_loss, String r22_product, BigDecimal r22_provisions_for_loan_loss,
			String r23_product, BigDecimal r23_provisions_for_loan_loss, String r24_product,
			BigDecimal r24_provisions_for_loan_loss, String r25_product, BigDecimal r25_provisions_for_loan_loss,
			String r26_product, BigDecimal r26_provisions_for_loan_loss, String r27_product,
			BigDecimal r27_provisions_for_loan_loss, String r28_product, BigDecimal r28_provisions_for_loan_loss,
			String r29_product, BigDecimal r29_provisions_for_loan_loss, String r30_product,
			BigDecimal r30_provisions_for_loan_loss, String r31_product, BigDecimal r31_provisions_for_loan_loss,
			String r32_product, BigDecimal r32_provisions_for_loan_loss, String r33_product,
			BigDecimal r33_provisions_for_loan_loss, String r34_product, BigDecimal r34_provisions_for_loan_loss,
			String r35_product, BigDecimal r35_provisions_for_loan_loss, String r36_product,
			BigDecimal r36_provisions_for_loan_loss, String r37_product, BigDecimal r37_provisions_for_loan_loss,
			String r38_product, BigDecimal r38_provisions_for_loan_loss, String r39_product,
			BigDecimal r39_provisions_for_loan_loss, String r40_product, BigDecimal r40_provisions_for_loan_loss,
			String r41_product, BigDecimal r41_provisions_for_loan_loss, String r42_product,
			BigDecimal r42_provisions_for_loan_loss, String r43_product, BigDecimal r43_provisions_for_loan_loss,
			String r44_product, BigDecimal r44_provisions_for_loan_loss, String r45_product,
			BigDecimal r45_provisions_for_loan_loss, String r46_product, BigDecimal r46_provisions_for_loan_loss,
			String r47_product, BigDecimal r47_provisions_for_loan_loss, String r48_product,
			BigDecimal r48_provisions_for_loan_loss, String r49_product, BigDecimal r49_provisions_for_loan_loss,
			String r50_product, BigDecimal r50_provisions_for_loan_loss, String r51_product,
			BigDecimal r51_provisions_for_loan_loss, String r52_product, BigDecimal r52_provisions_for_loan_loss,
			String r53_product, BigDecimal r53_provisions_for_loan_loss, String r54_product,
			BigDecimal r54_provisions_for_loan_loss, String r55_product, BigDecimal r55_provisions_for_loan_loss,
			String r56_product, BigDecimal r56_provisions_for_loan_loss, String r57_product,
			BigDecimal r57_provisions_for_loan_loss, String r58_product, BigDecimal r58_provisions_for_loan_loss,
			String r59_product, BigDecimal r59_provisions_for_loan_loss, String r60_product,
			BigDecimal r60_provisions_for_loan_loss, String r61_product, BigDecimal r61_provisions_for_loan_loss,
			String r62_product, BigDecimal r62_provisions_for_loan_loss, String r63_product,
			BigDecimal r63_provisions_for_loan_loss, String r64_product, BigDecimal r64_provisions_for_loan_loss,
			String r71_product, BigDecimal r71_provisions_for_loan_loss, String r73_product,
			BigDecimal r73_provisions_for_loan_loss, Date report_date, Date report_from_date, Date report_to_date,
			String entity_flg, String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r11_product = r11_product;
		this.r11_provisions_for_loan_loss = r11_provisions_for_loan_loss;
		this.r12_product = r12_product;
		this.r12_provisions_for_loan_loss = r12_provisions_for_loan_loss;
		this.r13_product = r13_product;
		this.r13_provisions_for_loan_loss = r13_provisions_for_loan_loss;
		this.r14_product = r14_product;
		this.r14_provisions_for_loan_loss = r14_provisions_for_loan_loss;
		this.r15_product = r15_product;
		this.r15_provisions_for_loan_loss = r15_provisions_for_loan_loss;
		this.r16_product = r16_product;
		this.r16_provisions_for_loan_loss = r16_provisions_for_loan_loss;
		this.r17_product = r17_product;
		this.r17_provisions_for_loan_loss = r17_provisions_for_loan_loss;
		this.r18_product = r18_product;
		this.r18_provisions_for_loan_loss = r18_provisions_for_loan_loss;
		this.r19_product = r19_product;
		this.r19_provisions_for_loan_loss = r19_provisions_for_loan_loss;
		this.r20_product = r20_product;
		this.r20_provisions_for_loan_loss = r20_provisions_for_loan_loss;
		this.r21_product = r21_product;
		this.r21_provisions_for_loan_loss = r21_provisions_for_loan_loss;
		this.r22_product = r22_product;
		this.r22_provisions_for_loan_loss = r22_provisions_for_loan_loss;
		this.r23_product = r23_product;
		this.r23_provisions_for_loan_loss = r23_provisions_for_loan_loss;
		this.r24_product = r24_product;
		this.r24_provisions_for_loan_loss = r24_provisions_for_loan_loss;
		this.r25_product = r25_product;
		this.r25_provisions_for_loan_loss = r25_provisions_for_loan_loss;
		this.r26_product = r26_product;
		this.r26_provisions_for_loan_loss = r26_provisions_for_loan_loss;
		this.r27_product = r27_product;
		this.r27_provisions_for_loan_loss = r27_provisions_for_loan_loss;
		this.r28_product = r28_product;
		this.r28_provisions_for_loan_loss = r28_provisions_for_loan_loss;
		this.r29_product = r29_product;
		this.r29_provisions_for_loan_loss = r29_provisions_for_loan_loss;
		this.r30_product = r30_product;
		this.r30_provisions_for_loan_loss = r30_provisions_for_loan_loss;
		this.r31_product = r31_product;
		this.r31_provisions_for_loan_loss = r31_provisions_for_loan_loss;
		this.r32_product = r32_product;
		this.r32_provisions_for_loan_loss = r32_provisions_for_loan_loss;
		this.r33_product = r33_product;
		this.r33_provisions_for_loan_loss = r33_provisions_for_loan_loss;
		this.r34_product = r34_product;
		this.r34_provisions_for_loan_loss = r34_provisions_for_loan_loss;
		this.r35_product = r35_product;
		this.r35_provisions_for_loan_loss = r35_provisions_for_loan_loss;
		this.r36_product = r36_product;
		this.r36_provisions_for_loan_loss = r36_provisions_for_loan_loss;
		this.r37_product = r37_product;
		this.r37_provisions_for_loan_loss = r37_provisions_for_loan_loss;
		this.r38_product = r38_product;
		this.r38_provisions_for_loan_loss = r38_provisions_for_loan_loss;
		this.r39_product = r39_product;
		this.r39_provisions_for_loan_loss = r39_provisions_for_loan_loss;
		this.r40_product = r40_product;
		this.r40_provisions_for_loan_loss = r40_provisions_for_loan_loss;
		this.r41_product = r41_product;
		this.r41_provisions_for_loan_loss = r41_provisions_for_loan_loss;
		this.r42_product = r42_product;
		this.r42_provisions_for_loan_loss = r42_provisions_for_loan_loss;
		this.r43_product = r43_product;
		this.r43_provisions_for_loan_loss = r43_provisions_for_loan_loss;
		this.r44_product = r44_product;
		this.r44_provisions_for_loan_loss = r44_provisions_for_loan_loss;
		this.r45_product = r45_product;
		this.r45_provisions_for_loan_loss = r45_provisions_for_loan_loss;
		this.r46_product = r46_product;
		this.r46_provisions_for_loan_loss = r46_provisions_for_loan_loss;
		this.r47_product = r47_product;
		this.r47_provisions_for_loan_loss = r47_provisions_for_loan_loss;
		this.r48_product = r48_product;
		this.r48_provisions_for_loan_loss = r48_provisions_for_loan_loss;
		this.r49_product = r49_product;
		this.r49_provisions_for_loan_loss = r49_provisions_for_loan_loss;
		this.r50_product = r50_product;
		this.r50_provisions_for_loan_loss = r50_provisions_for_loan_loss;
		this.r51_product = r51_product;
		this.r51_provisions_for_loan_loss = r51_provisions_for_loan_loss;
		this.r52_product = r52_product;
		this.r52_provisions_for_loan_loss = r52_provisions_for_loan_loss;
		this.r53_product = r53_product;
		this.r53_provisions_for_loan_loss = r53_provisions_for_loan_loss;
		this.r54_product = r54_product;
		this.r54_provisions_for_loan_loss = r54_provisions_for_loan_loss;
		this.r55_product = r55_product;
		this.r55_provisions_for_loan_loss = r55_provisions_for_loan_loss;
		this.r56_product = r56_product;
		this.r56_provisions_for_loan_loss = r56_provisions_for_loan_loss;
		this.r57_product = r57_product;
		this.r57_provisions_for_loan_loss = r57_provisions_for_loan_loss;
		this.r58_product = r58_product;
		this.r58_provisions_for_loan_loss = r58_provisions_for_loan_loss;
		this.r59_product = r59_product;
		this.r59_provisions_for_loan_loss = r59_provisions_for_loan_loss;
		this.r60_product = r60_product;
		this.r60_provisions_for_loan_loss = r60_provisions_for_loan_loss;
		this.r61_product = r61_product;
		this.r61_provisions_for_loan_loss = r61_provisions_for_loan_loss;
		this.r62_product = r62_product;
		this.r62_provisions_for_loan_loss = r62_provisions_for_loan_loss;
		this.r63_product = r63_product;
		this.r63_provisions_for_loan_loss = r63_provisions_for_loan_loss;
		this.r64_product = r64_product;
		this.r64_provisions_for_loan_loss = r64_provisions_for_loan_loss;
		this.r71_product = r71_product;
		this.r71_provisions_for_loan_loss = r71_provisions_for_loan_loss;
		this.r73_product = r73_product;
		this.r73_provisions_for_loan_loss = r73_provisions_for_loan_loss;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS40_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}

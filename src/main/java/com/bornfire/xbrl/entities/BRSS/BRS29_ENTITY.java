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
@Table(name="BRS29_TABLE")

public class BRS29_ENTITY {
	
	private String	r1_market;
	private BigDecimal	r1_nominal_amount_8;
	private BigDecimal	r1_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r1_charge_8;
	private BigDecimal	r1_nominal_amount_4;
	private BigDecimal	r1_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r1_charge_4;
	private BigDecimal	r1_nominal_amount_2;
	private BigDecimal	r1_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r1_charge_2;
	private BigDecimal	r1_total_specific_risk_charge;
	private BigDecimal	r1_net_positions_for_general_market_risk;
	private BigDecimal	r1_general_market_risk_change_at_8percent;
	private BigDecimal	r1_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r1_total_general_market_risk_charge;
	private BigDecimal	r1_total_market_risk_change;
	private String	r2_market;
	private BigDecimal	r2_nominal_amount_8;
	private BigDecimal	r2_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r2_charge_8;
	private BigDecimal	r2_nominal_amount_4;
	private BigDecimal	r2_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r2_charge_4;
	private BigDecimal	r2_nominal_amount_2;
	private BigDecimal	r2_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r2_charge_2;
	private BigDecimal	r2_total_specific_risk_charge;
	private BigDecimal	r2_net_positions_for_general_market_risk;
	private BigDecimal	r2_general_market_risk_change_at_8percent;
	private BigDecimal	r2_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r2_total_general_market_risk_charge;
	private BigDecimal	r2_total_market_risk_change;
	private String	r3_market;
	private BigDecimal	r3_nominal_amount_8;
	private BigDecimal	r3_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r3_charge_8;
	private BigDecimal	r3_nominal_amount_4;
	private BigDecimal	r3_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r3_charge_4;
	private BigDecimal	r3_nominal_amount_2;
	private BigDecimal	r3_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r3_charge_2;
	private BigDecimal	r3_total_specific_risk_charge;
	private BigDecimal	r3_net_positions_for_general_market_risk;
	private BigDecimal	r3_general_market_risk_change_at_8percent;
	private BigDecimal	r3_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r3_total_general_market_risk_charge;
	private BigDecimal	r3_total_market_risk_change;
	private String	r4_market;
	private BigDecimal	r4_nominal_amount_8;
	private BigDecimal	r4_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r4_charge_8;
	private BigDecimal	r4_nominal_amount_4;
	private BigDecimal	r4_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r4_charge_4;
	private BigDecimal	r4_nominal_amount_2;
	private BigDecimal	r4_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r4_charge_2;
	private BigDecimal	r4_total_specific_risk_charge;
	private BigDecimal	r4_net_positions_for_general_market_risk;
	private BigDecimal	r4_general_market_risk_change_at_8percent;
	private BigDecimal	r4_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r4_total_general_market_risk_charge;
	private BigDecimal	r4_total_market_risk_change;
	private String	r5_market;
	private BigDecimal	r5_nominal_amount_8;
	private BigDecimal	r5_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r5_charge_8;
	private BigDecimal	r5_nominal_amount_4;
	private BigDecimal	r5_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r5_charge_4;
	private BigDecimal	r5_nominal_amount_2;
	private BigDecimal	r5_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r5_charge_2;
	private BigDecimal	r5_total_specific_risk_charge;
	private BigDecimal	r5_net_positions_for_general_market_risk;
	private BigDecimal	r5_general_market_risk_change_at_8percent;
	private BigDecimal	r5_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r5_total_general_market_risk_charge;
	private BigDecimal	r5_total_market_risk_change;
	private String	r6_market;
	private BigDecimal	r6_nominal_amount_8;
	private BigDecimal	r6_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r6_charge_8;
	private BigDecimal	r6_nominal_amount_4;
	private BigDecimal	r6_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r6_charge_4;
	private BigDecimal	r6_nominal_amount_2;
	private BigDecimal	r6_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r6_charge_2;
	private BigDecimal	r6_total_specific_risk_charge;
	private BigDecimal	r6_net_positions_for_general_market_risk;
	private BigDecimal	r6_general_market_risk_change_at_8percent;
	private BigDecimal	r6_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r6_total_general_market_risk_charge;
	private BigDecimal	r6_total_market_risk_change;
	private String	r7_market;
	private BigDecimal	r7_nominal_amount_8;
	private BigDecimal	r7_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r7_charge_8;
	private BigDecimal	r7_nominal_amount_4;
	private BigDecimal	r7_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r7_charge_4;
	private BigDecimal	r7_nominal_amount_2;
	private BigDecimal	r7_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r7_charge_2;
	private BigDecimal	r7_total_specific_risk_charge;
	private BigDecimal	r7_net_positions_for_general_market_risk;
	private BigDecimal	r7_general_market_risk_change_at_8percent;
	private BigDecimal	r7_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r7_total_general_market_risk_charge;
	private BigDecimal	r7_total_market_risk_change;
	private String	r8_market;
	private BigDecimal	r8_nominal_amount_8;
	private BigDecimal	r8_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r8_charge_8;
	private BigDecimal	r8_nominal_amount_4;
	private BigDecimal	r8_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r8_charge_4;
	private BigDecimal	r8_nominal_amount_2;
	private BigDecimal	r8_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r8_charge_2;
	private BigDecimal	r8_total_specific_risk_charge;
	private BigDecimal	r8_net_positions_for_general_market_risk;
	private BigDecimal	r8_general_market_risk_change_at_8percent;
	private BigDecimal	r8_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r8_total_general_market_risk_charge;
	private BigDecimal	r8_total_market_risk_change;
	private String	r9_market;
	private BigDecimal	r9_nominal_amount_8;
	private BigDecimal	r9_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r9_charge_8;
	private BigDecimal	r9_nominal_amount_4;
	private BigDecimal	r9_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r9_charge_4;
	private BigDecimal	r9_nominal_amount_2;
	private BigDecimal	r9_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r9_charge_2;
	private BigDecimal	r9_total_specific_risk_charge;
	private BigDecimal	r9_net_positions_for_general_market_risk;
	private BigDecimal	r9_general_market_risk_change_at_8percent;
	private BigDecimal	r9_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r9_total_general_market_risk_charge;
	private BigDecimal	r9_total_market_risk_change;
	private String	r10_market;
	private BigDecimal	r10_nominal_amount_8;
	private BigDecimal	r10_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r10_charge_8;
	private BigDecimal	r10_nominal_amount_4;
	private BigDecimal	r10_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r10_charge_4;
	private BigDecimal	r10_nominal_amount_2;
	private BigDecimal	r10_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r10_charge_2;
	private BigDecimal	r10_total_specific_risk_charge;
	private BigDecimal	r10_net_positions_for_general_market_risk;
	private BigDecimal	r10_general_market_risk_change_at_8percent;
	private BigDecimal	r10_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r10_total_general_market_risk_charge;
	private BigDecimal	r10_total_market_risk_change;
	private String	r11_market;
	private BigDecimal	r11_nominal_amount_8;
	private BigDecimal	r11_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r11_charge_8;
	private BigDecimal	r11_nominal_amount_4;
	private BigDecimal	r11_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r11_charge_4;
	private BigDecimal	r11_nominal_amount_2;
	private BigDecimal	r11_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r11_charge_2;
	private BigDecimal	r11_total_specific_risk_charge;
	private BigDecimal	r11_net_positions_for_general_market_risk;
	private BigDecimal	r11_general_market_risk_change_at_8percent;
	private BigDecimal	r11_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r11_total_general_market_risk_charge;
	private BigDecimal	r11_total_market_risk_change;
	private String	r12_market;
	private BigDecimal	r12_nominal_amount_8;
	private BigDecimal	r12_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r12_charge_8;
	private BigDecimal	r12_nominal_amount_4;
	private BigDecimal	r12_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r12_charge_4;
	private BigDecimal	r12_nominal_amount_2;
	private BigDecimal	r12_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r12_charge_2;
	private BigDecimal	r12_total_specific_risk_charge;
	private BigDecimal	r12_net_positions_for_general_market_risk;
	private BigDecimal	r12_general_market_risk_change_at_8percent;
	private BigDecimal	r12_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r12_total_general_market_risk_charge;
	private BigDecimal	r12_total_market_risk_change;
	private String	r13_market;
	private BigDecimal	r13_nominal_amount_8;
	private BigDecimal	r13_positions_attracting_8_percent_specific_risk;
	private BigDecimal	r13_charge_8;
	private BigDecimal	r13_nominal_amount_4;
	private BigDecimal	r13_positions_attracting_4_percent_specific_risk;
	private BigDecimal	r13_charge_4;
	private BigDecimal	r13_nominal_amount_2;
	private BigDecimal	r13_positions_attracting_2_percent_specific_risk;
	private BigDecimal	r13_charge_2;
	private BigDecimal	r13_total_specific_risk_charge;
	private BigDecimal	r13_net_positions_for_general_market_risk;
	private BigDecimal	r13_general_market_risk_change_at_8percent;
	private BigDecimal	r13_2percent_general_market_risk_change_for_welldiversified_portfolio;
	private BigDecimal	r13_total_general_market_risk_charge;
	private BigDecimal	r13_total_market_risk_change;
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
	public String getR1_market() {
		return r1_market;
	}
	public void setR1_market(String r1_market) {
		this.r1_market = r1_market;
	}
	public BigDecimal getR1_nominal_amount_8() {
		return r1_nominal_amount_8;
	}
	public void setR1_nominal_amount_8(BigDecimal r1_nominal_amount_8) {
		this.r1_nominal_amount_8 = r1_nominal_amount_8;
	}
	public BigDecimal getR1_positions_attracting_8_percent_specific_risk() {
		return r1_positions_attracting_8_percent_specific_risk;
	}
	public void setR1_positions_attracting_8_percent_specific_risk(
			BigDecimal r1_positions_attracting_8_percent_specific_risk) {
		this.r1_positions_attracting_8_percent_specific_risk = r1_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR1_charge_8() {
		return r1_charge_8;
	}
	public void setR1_charge_8(BigDecimal r1_charge_8) {
		this.r1_charge_8 = r1_charge_8;
	}
	public BigDecimal getR1_nominal_amount_4() {
		return r1_nominal_amount_4;
	}
	public void setR1_nominal_amount_4(BigDecimal r1_nominal_amount_4) {
		this.r1_nominal_amount_4 = r1_nominal_amount_4;
	}
	public BigDecimal getR1_positions_attracting_4_percent_specific_risk() {
		return r1_positions_attracting_4_percent_specific_risk;
	}
	public void setR1_positions_attracting_4_percent_specific_risk(
			BigDecimal r1_positions_attracting_4_percent_specific_risk) {
		this.r1_positions_attracting_4_percent_specific_risk = r1_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR1_charge_4() {
		return r1_charge_4;
	}
	public void setR1_charge_4(BigDecimal r1_charge_4) {
		this.r1_charge_4 = r1_charge_4;
	}
	public BigDecimal getR1_nominal_amount_2() {
		return r1_nominal_amount_2;
	}
	public void setR1_nominal_amount_2(BigDecimal r1_nominal_amount_2) {
		this.r1_nominal_amount_2 = r1_nominal_amount_2;
	}
	public BigDecimal getR1_positions_attracting_2_percent_specific_risk() {
		return r1_positions_attracting_2_percent_specific_risk;
	}
	public void setR1_positions_attracting_2_percent_specific_risk(
			BigDecimal r1_positions_attracting_2_percent_specific_risk) {
		this.r1_positions_attracting_2_percent_specific_risk = r1_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR1_charge_2() {
		return r1_charge_2;
	}
	public void setR1_charge_2(BigDecimal r1_charge_2) {
		this.r1_charge_2 = r1_charge_2;
	}
	public BigDecimal getR1_total_specific_risk_charge() {
		return r1_total_specific_risk_charge;
	}
	public void setR1_total_specific_risk_charge(BigDecimal r1_total_specific_risk_charge) {
		this.r1_total_specific_risk_charge = r1_total_specific_risk_charge;
	}
	public BigDecimal getR1_net_positions_for_general_market_risk() {
		return r1_net_positions_for_general_market_risk;
	}
	public void setR1_net_positions_for_general_market_risk(BigDecimal r1_net_positions_for_general_market_risk) {
		this.r1_net_positions_for_general_market_risk = r1_net_positions_for_general_market_risk;
	}
	public BigDecimal getR1_general_market_risk_change_at_8percent() {
		return r1_general_market_risk_change_at_8percent;
	}
	public void setR1_general_market_risk_change_at_8percent(BigDecimal r1_general_market_risk_change_at_8percent) {
		this.r1_general_market_risk_change_at_8percent = r1_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR1_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r1_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR1_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r1_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r1_2percent_general_market_risk_change_for_welldiversified_portfolio = r1_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR1_total_general_market_risk_charge() {
		return r1_total_general_market_risk_charge;
	}
	public void setR1_total_general_market_risk_charge(BigDecimal r1_total_general_market_risk_charge) {
		this.r1_total_general_market_risk_charge = r1_total_general_market_risk_charge;
	}
	public BigDecimal getR1_total_market_risk_change() {
		return r1_total_market_risk_change;
	}
	public void setR1_total_market_risk_change(BigDecimal r1_total_market_risk_change) {
		this.r1_total_market_risk_change = r1_total_market_risk_change;
	}
	public String getR2_market() {
		return r2_market;
	}
	public void setR2_market(String r2_market) {
		this.r2_market = r2_market;
	}
	public BigDecimal getR2_nominal_amount_8() {
		return r2_nominal_amount_8;
	}
	public void setR2_nominal_amount_8(BigDecimal r2_nominal_amount_8) {
		this.r2_nominal_amount_8 = r2_nominal_amount_8;
	}
	public BigDecimal getR2_positions_attracting_8_percent_specific_risk() {
		return r2_positions_attracting_8_percent_specific_risk;
	}
	public void setR2_positions_attracting_8_percent_specific_risk(
			BigDecimal r2_positions_attracting_8_percent_specific_risk) {
		this.r2_positions_attracting_8_percent_specific_risk = r2_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR2_charge_8() {
		return r2_charge_8;
	}
	public void setR2_charge_8(BigDecimal r2_charge_8) {
		this.r2_charge_8 = r2_charge_8;
	}
	public BigDecimal getR2_nominal_amount_4() {
		return r2_nominal_amount_4;
	}
	public void setR2_nominal_amount_4(BigDecimal r2_nominal_amount_4) {
		this.r2_nominal_amount_4 = r2_nominal_amount_4;
	}
	public BigDecimal getR2_positions_attracting_4_percent_specific_risk() {
		return r2_positions_attracting_4_percent_specific_risk;
	}
	public void setR2_positions_attracting_4_percent_specific_risk(
			BigDecimal r2_positions_attracting_4_percent_specific_risk) {
		this.r2_positions_attracting_4_percent_specific_risk = r2_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR2_charge_4() {
		return r2_charge_4;
	}
	public void setR2_charge_4(BigDecimal r2_charge_4) {
		this.r2_charge_4 = r2_charge_4;
	}
	public BigDecimal getR2_nominal_amount_2() {
		return r2_nominal_amount_2;
	}
	public void setR2_nominal_amount_2(BigDecimal r2_nominal_amount_2) {
		this.r2_nominal_amount_2 = r2_nominal_amount_2;
	}
	public BigDecimal getR2_positions_attracting_2_percent_specific_risk() {
		return r2_positions_attracting_2_percent_specific_risk;
	}
	public void setR2_positions_attracting_2_percent_specific_risk(
			BigDecimal r2_positions_attracting_2_percent_specific_risk) {
		this.r2_positions_attracting_2_percent_specific_risk = r2_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR2_charge_2() {
		return r2_charge_2;
	}
	public void setR2_charge_2(BigDecimal r2_charge_2) {
		this.r2_charge_2 = r2_charge_2;
	}
	public BigDecimal getR2_total_specific_risk_charge() {
		return r2_total_specific_risk_charge;
	}
	public void setR2_total_specific_risk_charge(BigDecimal r2_total_specific_risk_charge) {
		this.r2_total_specific_risk_charge = r2_total_specific_risk_charge;
	}
	public BigDecimal getR2_net_positions_for_general_market_risk() {
		return r2_net_positions_for_general_market_risk;
	}
	public void setR2_net_positions_for_general_market_risk(BigDecimal r2_net_positions_for_general_market_risk) {
		this.r2_net_positions_for_general_market_risk = r2_net_positions_for_general_market_risk;
	}
	public BigDecimal getR2_general_market_risk_change_at_8percent() {
		return r2_general_market_risk_change_at_8percent;
	}
	public void setR2_general_market_risk_change_at_8percent(BigDecimal r2_general_market_risk_change_at_8percent) {
		this.r2_general_market_risk_change_at_8percent = r2_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR2_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r2_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR2_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r2_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r2_2percent_general_market_risk_change_for_welldiversified_portfolio = r2_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR2_total_general_market_risk_charge() {
		return r2_total_general_market_risk_charge;
	}
	public void setR2_total_general_market_risk_charge(BigDecimal r2_total_general_market_risk_charge) {
		this.r2_total_general_market_risk_charge = r2_total_general_market_risk_charge;
	}
	public BigDecimal getR2_total_market_risk_change() {
		return r2_total_market_risk_change;
	}
	public void setR2_total_market_risk_change(BigDecimal r2_total_market_risk_change) {
		this.r2_total_market_risk_change = r2_total_market_risk_change;
	}
	public String getR3_market() {
		return r3_market;
	}
	public void setR3_market(String r3_market) {
		this.r3_market = r3_market;
	}
	public BigDecimal getR3_nominal_amount_8() {
		return r3_nominal_amount_8;
	}
	public void setR3_nominal_amount_8(BigDecimal r3_nominal_amount_8) {
		this.r3_nominal_amount_8 = r3_nominal_amount_8;
	}
	public BigDecimal getR3_positions_attracting_8_percent_specific_risk() {
		return r3_positions_attracting_8_percent_specific_risk;
	}
	public void setR3_positions_attracting_8_percent_specific_risk(
			BigDecimal r3_positions_attracting_8_percent_specific_risk) {
		this.r3_positions_attracting_8_percent_specific_risk = r3_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR3_charge_8() {
		return r3_charge_8;
	}
	public void setR3_charge_8(BigDecimal r3_charge_8) {
		this.r3_charge_8 = r3_charge_8;
	}
	public BigDecimal getR3_nominal_amount_4() {
		return r3_nominal_amount_4;
	}
	public void setR3_nominal_amount_4(BigDecimal r3_nominal_amount_4) {
		this.r3_nominal_amount_4 = r3_nominal_amount_4;
	}
	public BigDecimal getR3_positions_attracting_4_percent_specific_risk() {
		return r3_positions_attracting_4_percent_specific_risk;
	}
	public void setR3_positions_attracting_4_percent_specific_risk(
			BigDecimal r3_positions_attracting_4_percent_specific_risk) {
		this.r3_positions_attracting_4_percent_specific_risk = r3_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR3_charge_4() {
		return r3_charge_4;
	}
	public void setR3_charge_4(BigDecimal r3_charge_4) {
		this.r3_charge_4 = r3_charge_4;
	}
	public BigDecimal getR3_nominal_amount_2() {
		return r3_nominal_amount_2;
	}
	public void setR3_nominal_amount_2(BigDecimal r3_nominal_amount_2) {
		this.r3_nominal_amount_2 = r3_nominal_amount_2;
	}
	public BigDecimal getR3_positions_attracting_2_percent_specific_risk() {
		return r3_positions_attracting_2_percent_specific_risk;
	}
	public void setR3_positions_attracting_2_percent_specific_risk(
			BigDecimal r3_positions_attracting_2_percent_specific_risk) {
		this.r3_positions_attracting_2_percent_specific_risk = r3_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR3_charge_2() {
		return r3_charge_2;
	}
	public void setR3_charge_2(BigDecimal r3_charge_2) {
		this.r3_charge_2 = r3_charge_2;
	}
	public BigDecimal getR3_total_specific_risk_charge() {
		return r3_total_specific_risk_charge;
	}
	public void setR3_total_specific_risk_charge(BigDecimal r3_total_specific_risk_charge) {
		this.r3_total_specific_risk_charge = r3_total_specific_risk_charge;
	}
	public BigDecimal getR3_net_positions_for_general_market_risk() {
		return r3_net_positions_for_general_market_risk;
	}
	public void setR3_net_positions_for_general_market_risk(BigDecimal r3_net_positions_for_general_market_risk) {
		this.r3_net_positions_for_general_market_risk = r3_net_positions_for_general_market_risk;
	}
	public BigDecimal getR3_general_market_risk_change_at_8percent() {
		return r3_general_market_risk_change_at_8percent;
	}
	public void setR3_general_market_risk_change_at_8percent(BigDecimal r3_general_market_risk_change_at_8percent) {
		this.r3_general_market_risk_change_at_8percent = r3_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR3_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r3_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR3_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r3_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r3_2percent_general_market_risk_change_for_welldiversified_portfolio = r3_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR3_total_general_market_risk_charge() {
		return r3_total_general_market_risk_charge;
	}
	public void setR3_total_general_market_risk_charge(BigDecimal r3_total_general_market_risk_charge) {
		this.r3_total_general_market_risk_charge = r3_total_general_market_risk_charge;
	}
	public BigDecimal getR3_total_market_risk_change() {
		return r3_total_market_risk_change;
	}
	public void setR3_total_market_risk_change(BigDecimal r3_total_market_risk_change) {
		this.r3_total_market_risk_change = r3_total_market_risk_change;
	}
	public String getR4_market() {
		return r4_market;
	}
	public void setR4_market(String r4_market) {
		this.r4_market = r4_market;
	}
	public BigDecimal getR4_nominal_amount_8() {
		return r4_nominal_amount_8;
	}
	public void setR4_nominal_amount_8(BigDecimal r4_nominal_amount_8) {
		this.r4_nominal_amount_8 = r4_nominal_amount_8;
	}
	public BigDecimal getR4_positions_attracting_8_percent_specific_risk() {
		return r4_positions_attracting_8_percent_specific_risk;
	}
	public void setR4_positions_attracting_8_percent_specific_risk(
			BigDecimal r4_positions_attracting_8_percent_specific_risk) {
		this.r4_positions_attracting_8_percent_specific_risk = r4_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR4_charge_8() {
		return r4_charge_8;
	}
	public void setR4_charge_8(BigDecimal r4_charge_8) {
		this.r4_charge_8 = r4_charge_8;
	}
	public BigDecimal getR4_nominal_amount_4() {
		return r4_nominal_amount_4;
	}
	public void setR4_nominal_amount_4(BigDecimal r4_nominal_amount_4) {
		this.r4_nominal_amount_4 = r4_nominal_amount_4;
	}
	public BigDecimal getR4_positions_attracting_4_percent_specific_risk() {
		return r4_positions_attracting_4_percent_specific_risk;
	}
	public void setR4_positions_attracting_4_percent_specific_risk(
			BigDecimal r4_positions_attracting_4_percent_specific_risk) {
		this.r4_positions_attracting_4_percent_specific_risk = r4_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR4_charge_4() {
		return r4_charge_4;
	}
	public void setR4_charge_4(BigDecimal r4_charge_4) {
		this.r4_charge_4 = r4_charge_4;
	}
	public BigDecimal getR4_nominal_amount_2() {
		return r4_nominal_amount_2;
	}
	public void setR4_nominal_amount_2(BigDecimal r4_nominal_amount_2) {
		this.r4_nominal_amount_2 = r4_nominal_amount_2;
	}
	public BigDecimal getR4_positions_attracting_2_percent_specific_risk() {
		return r4_positions_attracting_2_percent_specific_risk;
	}
	public void setR4_positions_attracting_2_percent_specific_risk(
			BigDecimal r4_positions_attracting_2_percent_specific_risk) {
		this.r4_positions_attracting_2_percent_specific_risk = r4_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR4_charge_2() {
		return r4_charge_2;
	}
	public void setR4_charge_2(BigDecimal r4_charge_2) {
		this.r4_charge_2 = r4_charge_2;
	}
	public BigDecimal getR4_total_specific_risk_charge() {
		return r4_total_specific_risk_charge;
	}
	public void setR4_total_specific_risk_charge(BigDecimal r4_total_specific_risk_charge) {
		this.r4_total_specific_risk_charge = r4_total_specific_risk_charge;
	}
	public BigDecimal getR4_net_positions_for_general_market_risk() {
		return r4_net_positions_for_general_market_risk;
	}
	public void setR4_net_positions_for_general_market_risk(BigDecimal r4_net_positions_for_general_market_risk) {
		this.r4_net_positions_for_general_market_risk = r4_net_positions_for_general_market_risk;
	}
	public BigDecimal getR4_general_market_risk_change_at_8percent() {
		return r4_general_market_risk_change_at_8percent;
	}
	public void setR4_general_market_risk_change_at_8percent(BigDecimal r4_general_market_risk_change_at_8percent) {
		this.r4_general_market_risk_change_at_8percent = r4_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR4_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r4_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR4_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r4_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r4_2percent_general_market_risk_change_for_welldiversified_portfolio = r4_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR4_total_general_market_risk_charge() {
		return r4_total_general_market_risk_charge;
	}
	public void setR4_total_general_market_risk_charge(BigDecimal r4_total_general_market_risk_charge) {
		this.r4_total_general_market_risk_charge = r4_total_general_market_risk_charge;
	}
	public BigDecimal getR4_total_market_risk_change() {
		return r4_total_market_risk_change;
	}
	public void setR4_total_market_risk_change(BigDecimal r4_total_market_risk_change) {
		this.r4_total_market_risk_change = r4_total_market_risk_change;
	}
	public String getR5_market() {
		return r5_market;
	}
	public void setR5_market(String r5_market) {
		this.r5_market = r5_market;
	}
	public BigDecimal getR5_nominal_amount_8() {
		return r5_nominal_amount_8;
	}
	public void setR5_nominal_amount_8(BigDecimal r5_nominal_amount_8) {
		this.r5_nominal_amount_8 = r5_nominal_amount_8;
	}
	public BigDecimal getR5_positions_attracting_8_percent_specific_risk() {
		return r5_positions_attracting_8_percent_specific_risk;
	}
	public void setR5_positions_attracting_8_percent_specific_risk(
			BigDecimal r5_positions_attracting_8_percent_specific_risk) {
		this.r5_positions_attracting_8_percent_specific_risk = r5_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR5_charge_8() {
		return r5_charge_8;
	}
	public void setR5_charge_8(BigDecimal r5_charge_8) {
		this.r5_charge_8 = r5_charge_8;
	}
	public BigDecimal getR5_nominal_amount_4() {
		return r5_nominal_amount_4;
	}
	public void setR5_nominal_amount_4(BigDecimal r5_nominal_amount_4) {
		this.r5_nominal_amount_4 = r5_nominal_amount_4;
	}
	public BigDecimal getR5_positions_attracting_4_percent_specific_risk() {
		return r5_positions_attracting_4_percent_specific_risk;
	}
	public void setR5_positions_attracting_4_percent_specific_risk(
			BigDecimal r5_positions_attracting_4_percent_specific_risk) {
		this.r5_positions_attracting_4_percent_specific_risk = r5_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR5_charge_4() {
		return r5_charge_4;
	}
	public void setR5_charge_4(BigDecimal r5_charge_4) {
		this.r5_charge_4 = r5_charge_4;
	}
	public BigDecimal getR5_nominal_amount_2() {
		return r5_nominal_amount_2;
	}
	public void setR5_nominal_amount_2(BigDecimal r5_nominal_amount_2) {
		this.r5_nominal_amount_2 = r5_nominal_amount_2;
	}
	public BigDecimal getR5_positions_attracting_2_percent_specific_risk() {
		return r5_positions_attracting_2_percent_specific_risk;
	}
	public void setR5_positions_attracting_2_percent_specific_risk(
			BigDecimal r5_positions_attracting_2_percent_specific_risk) {
		this.r5_positions_attracting_2_percent_specific_risk = r5_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR5_charge_2() {
		return r5_charge_2;
	}
	public void setR5_charge_2(BigDecimal r5_charge_2) {
		this.r5_charge_2 = r5_charge_2;
	}
	public BigDecimal getR5_total_specific_risk_charge() {
		return r5_total_specific_risk_charge;
	}
	public void setR5_total_specific_risk_charge(BigDecimal r5_total_specific_risk_charge) {
		this.r5_total_specific_risk_charge = r5_total_specific_risk_charge;
	}
	public BigDecimal getR5_net_positions_for_general_market_risk() {
		return r5_net_positions_for_general_market_risk;
	}
	public void setR5_net_positions_for_general_market_risk(BigDecimal r5_net_positions_for_general_market_risk) {
		this.r5_net_positions_for_general_market_risk = r5_net_positions_for_general_market_risk;
	}
	public BigDecimal getR5_general_market_risk_change_at_8percent() {
		return r5_general_market_risk_change_at_8percent;
	}
	public void setR5_general_market_risk_change_at_8percent(BigDecimal r5_general_market_risk_change_at_8percent) {
		this.r5_general_market_risk_change_at_8percent = r5_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR5_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r5_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR5_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r5_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r5_2percent_general_market_risk_change_for_welldiversified_portfolio = r5_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR5_total_general_market_risk_charge() {
		return r5_total_general_market_risk_charge;
	}
	public void setR5_total_general_market_risk_charge(BigDecimal r5_total_general_market_risk_charge) {
		this.r5_total_general_market_risk_charge = r5_total_general_market_risk_charge;
	}
	public BigDecimal getR5_total_market_risk_change() {
		return r5_total_market_risk_change;
	}
	public void setR5_total_market_risk_change(BigDecimal r5_total_market_risk_change) {
		this.r5_total_market_risk_change = r5_total_market_risk_change;
	}
	public String getR6_market() {
		return r6_market;
	}
	public void setR6_market(String r6_market) {
		this.r6_market = r6_market;
	}
	public BigDecimal getR6_nominal_amount_8() {
		return r6_nominal_amount_8;
	}
	public void setR6_nominal_amount_8(BigDecimal r6_nominal_amount_8) {
		this.r6_nominal_amount_8 = r6_nominal_amount_8;
	}
	public BigDecimal getR6_positions_attracting_8_percent_specific_risk() {
		return r6_positions_attracting_8_percent_specific_risk;
	}
	public void setR6_positions_attracting_8_percent_specific_risk(
			BigDecimal r6_positions_attracting_8_percent_specific_risk) {
		this.r6_positions_attracting_8_percent_specific_risk = r6_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR6_charge_8() {
		return r6_charge_8;
	}
	public void setR6_charge_8(BigDecimal r6_charge_8) {
		this.r6_charge_8 = r6_charge_8;
	}
	public BigDecimal getR6_nominal_amount_4() {
		return r6_nominal_amount_4;
	}
	public void setR6_nominal_amount_4(BigDecimal r6_nominal_amount_4) {
		this.r6_nominal_amount_4 = r6_nominal_amount_4;
	}
	public BigDecimal getR6_positions_attracting_4_percent_specific_risk() {
		return r6_positions_attracting_4_percent_specific_risk;
	}
	public void setR6_positions_attracting_4_percent_specific_risk(
			BigDecimal r6_positions_attracting_4_percent_specific_risk) {
		this.r6_positions_attracting_4_percent_specific_risk = r6_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR6_charge_4() {
		return r6_charge_4;
	}
	public void setR6_charge_4(BigDecimal r6_charge_4) {
		this.r6_charge_4 = r6_charge_4;
	}
	public BigDecimal getR6_nominal_amount_2() {
		return r6_nominal_amount_2;
	}
	public void setR6_nominal_amount_2(BigDecimal r6_nominal_amount_2) {
		this.r6_nominal_amount_2 = r6_nominal_amount_2;
	}
	public BigDecimal getR6_positions_attracting_2_percent_specific_risk() {
		return r6_positions_attracting_2_percent_specific_risk;
	}
	public void setR6_positions_attracting_2_percent_specific_risk(
			BigDecimal r6_positions_attracting_2_percent_specific_risk) {
		this.r6_positions_attracting_2_percent_specific_risk = r6_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR6_charge_2() {
		return r6_charge_2;
	}
	public void setR6_charge_2(BigDecimal r6_charge_2) {
		this.r6_charge_2 = r6_charge_2;
	}
	public BigDecimal getR6_total_specific_risk_charge() {
		return r6_total_specific_risk_charge;
	}
	public void setR6_total_specific_risk_charge(BigDecimal r6_total_specific_risk_charge) {
		this.r6_total_specific_risk_charge = r6_total_specific_risk_charge;
	}
	public BigDecimal getR6_net_positions_for_general_market_risk() {
		return r6_net_positions_for_general_market_risk;
	}
	public void setR6_net_positions_for_general_market_risk(BigDecimal r6_net_positions_for_general_market_risk) {
		this.r6_net_positions_for_general_market_risk = r6_net_positions_for_general_market_risk;
	}
	public BigDecimal getR6_general_market_risk_change_at_8percent() {
		return r6_general_market_risk_change_at_8percent;
	}
	public void setR6_general_market_risk_change_at_8percent(BigDecimal r6_general_market_risk_change_at_8percent) {
		this.r6_general_market_risk_change_at_8percent = r6_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR6_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r6_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR6_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r6_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r6_2percent_general_market_risk_change_for_welldiversified_portfolio = r6_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR6_total_general_market_risk_charge() {
		return r6_total_general_market_risk_charge;
	}
	public void setR6_total_general_market_risk_charge(BigDecimal r6_total_general_market_risk_charge) {
		this.r6_total_general_market_risk_charge = r6_total_general_market_risk_charge;
	}
	public BigDecimal getR6_total_market_risk_change() {
		return r6_total_market_risk_change;
	}
	public void setR6_total_market_risk_change(BigDecimal r6_total_market_risk_change) {
		this.r6_total_market_risk_change = r6_total_market_risk_change;
	}
	public String getR7_market() {
		return r7_market;
	}
	public void setR7_market(String r7_market) {
		this.r7_market = r7_market;
	}
	public BigDecimal getR7_nominal_amount_8() {
		return r7_nominal_amount_8;
	}
	public void setR7_nominal_amount_8(BigDecimal r7_nominal_amount_8) {
		this.r7_nominal_amount_8 = r7_nominal_amount_8;
	}
	public BigDecimal getR7_positions_attracting_8_percent_specific_risk() {
		return r7_positions_attracting_8_percent_specific_risk;
	}
	public void setR7_positions_attracting_8_percent_specific_risk(
			BigDecimal r7_positions_attracting_8_percent_specific_risk) {
		this.r7_positions_attracting_8_percent_specific_risk = r7_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR7_charge_8() {
		return r7_charge_8;
	}
	public void setR7_charge_8(BigDecimal r7_charge_8) {
		this.r7_charge_8 = r7_charge_8;
	}
	public BigDecimal getR7_nominal_amount_4() {
		return r7_nominal_amount_4;
	}
	public void setR7_nominal_amount_4(BigDecimal r7_nominal_amount_4) {
		this.r7_nominal_amount_4 = r7_nominal_amount_4;
	}
	public BigDecimal getR7_positions_attracting_4_percent_specific_risk() {
		return r7_positions_attracting_4_percent_specific_risk;
	}
	public void setR7_positions_attracting_4_percent_specific_risk(
			BigDecimal r7_positions_attracting_4_percent_specific_risk) {
		this.r7_positions_attracting_4_percent_specific_risk = r7_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR7_charge_4() {
		return r7_charge_4;
	}
	public void setR7_charge_4(BigDecimal r7_charge_4) {
		this.r7_charge_4 = r7_charge_4;
	}
	public BigDecimal getR7_nominal_amount_2() {
		return r7_nominal_amount_2;
	}
	public void setR7_nominal_amount_2(BigDecimal r7_nominal_amount_2) {
		this.r7_nominal_amount_2 = r7_nominal_amount_2;
	}
	public BigDecimal getR7_positions_attracting_2_percent_specific_risk() {
		return r7_positions_attracting_2_percent_specific_risk;
	}
	public void setR7_positions_attracting_2_percent_specific_risk(
			BigDecimal r7_positions_attracting_2_percent_specific_risk) {
		this.r7_positions_attracting_2_percent_specific_risk = r7_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR7_charge_2() {
		return r7_charge_2;
	}
	public void setR7_charge_2(BigDecimal r7_charge_2) {
		this.r7_charge_2 = r7_charge_2;
	}
	public BigDecimal getR7_total_specific_risk_charge() {
		return r7_total_specific_risk_charge;
	}
	public void setR7_total_specific_risk_charge(BigDecimal r7_total_specific_risk_charge) {
		this.r7_total_specific_risk_charge = r7_total_specific_risk_charge;
	}
	public BigDecimal getR7_net_positions_for_general_market_risk() {
		return r7_net_positions_for_general_market_risk;
	}
	public void setR7_net_positions_for_general_market_risk(BigDecimal r7_net_positions_for_general_market_risk) {
		this.r7_net_positions_for_general_market_risk = r7_net_positions_for_general_market_risk;
	}
	public BigDecimal getR7_general_market_risk_change_at_8percent() {
		return r7_general_market_risk_change_at_8percent;
	}
	public void setR7_general_market_risk_change_at_8percent(BigDecimal r7_general_market_risk_change_at_8percent) {
		this.r7_general_market_risk_change_at_8percent = r7_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR7_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r7_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR7_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r7_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r7_2percent_general_market_risk_change_for_welldiversified_portfolio = r7_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR7_total_general_market_risk_charge() {
		return r7_total_general_market_risk_charge;
	}
	public void setR7_total_general_market_risk_charge(BigDecimal r7_total_general_market_risk_charge) {
		this.r7_total_general_market_risk_charge = r7_total_general_market_risk_charge;
	}
	public BigDecimal getR7_total_market_risk_change() {
		return r7_total_market_risk_change;
	}
	public void setR7_total_market_risk_change(BigDecimal r7_total_market_risk_change) {
		this.r7_total_market_risk_change = r7_total_market_risk_change;
	}
	public String getR8_market() {
		return r8_market;
	}
	public void setR8_market(String r8_market) {
		this.r8_market = r8_market;
	}
	public BigDecimal getR8_nominal_amount_8() {
		return r8_nominal_amount_8;
	}
	public void setR8_nominal_amount_8(BigDecimal r8_nominal_amount_8) {
		this.r8_nominal_amount_8 = r8_nominal_amount_8;
	}
	public BigDecimal getR8_positions_attracting_8_percent_specific_risk() {
		return r8_positions_attracting_8_percent_specific_risk;
	}
	public void setR8_positions_attracting_8_percent_specific_risk(
			BigDecimal r8_positions_attracting_8_percent_specific_risk) {
		this.r8_positions_attracting_8_percent_specific_risk = r8_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR8_charge_8() {
		return r8_charge_8;
	}
	public void setR8_charge_8(BigDecimal r8_charge_8) {
		this.r8_charge_8 = r8_charge_8;
	}
	public BigDecimal getR8_nominal_amount_4() {
		return r8_nominal_amount_4;
	}
	public void setR8_nominal_amount_4(BigDecimal r8_nominal_amount_4) {
		this.r8_nominal_amount_4 = r8_nominal_amount_4;
	}
	public BigDecimal getR8_positions_attracting_4_percent_specific_risk() {
		return r8_positions_attracting_4_percent_specific_risk;
	}
	public void setR8_positions_attracting_4_percent_specific_risk(
			BigDecimal r8_positions_attracting_4_percent_specific_risk) {
		this.r8_positions_attracting_4_percent_specific_risk = r8_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR8_charge_4() {
		return r8_charge_4;
	}
	public void setR8_charge_4(BigDecimal r8_charge_4) {
		this.r8_charge_4 = r8_charge_4;
	}
	public BigDecimal getR8_nominal_amount_2() {
		return r8_nominal_amount_2;
	}
	public void setR8_nominal_amount_2(BigDecimal r8_nominal_amount_2) {
		this.r8_nominal_amount_2 = r8_nominal_amount_2;
	}
	public BigDecimal getR8_positions_attracting_2_percent_specific_risk() {
		return r8_positions_attracting_2_percent_specific_risk;
	}
	public void setR8_positions_attracting_2_percent_specific_risk(
			BigDecimal r8_positions_attracting_2_percent_specific_risk) {
		this.r8_positions_attracting_2_percent_specific_risk = r8_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR8_charge_2() {
		return r8_charge_2;
	}
	public void setR8_charge_2(BigDecimal r8_charge_2) {
		this.r8_charge_2 = r8_charge_2;
	}
	public BigDecimal getR8_total_specific_risk_charge() {
		return r8_total_specific_risk_charge;
	}
	public void setR8_total_specific_risk_charge(BigDecimal r8_total_specific_risk_charge) {
		this.r8_total_specific_risk_charge = r8_total_specific_risk_charge;
	}
	public BigDecimal getR8_net_positions_for_general_market_risk() {
		return r8_net_positions_for_general_market_risk;
	}
	public void setR8_net_positions_for_general_market_risk(BigDecimal r8_net_positions_for_general_market_risk) {
		this.r8_net_positions_for_general_market_risk = r8_net_positions_for_general_market_risk;
	}
	public BigDecimal getR8_general_market_risk_change_at_8percent() {
		return r8_general_market_risk_change_at_8percent;
	}
	public void setR8_general_market_risk_change_at_8percent(BigDecimal r8_general_market_risk_change_at_8percent) {
		this.r8_general_market_risk_change_at_8percent = r8_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR8_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r8_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR8_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r8_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r8_2percent_general_market_risk_change_for_welldiversified_portfolio = r8_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR8_total_general_market_risk_charge() {
		return r8_total_general_market_risk_charge;
	}
	public void setR8_total_general_market_risk_charge(BigDecimal r8_total_general_market_risk_charge) {
		this.r8_total_general_market_risk_charge = r8_total_general_market_risk_charge;
	}
	public BigDecimal getR8_total_market_risk_change() {
		return r8_total_market_risk_change;
	}
	public void setR8_total_market_risk_change(BigDecimal r8_total_market_risk_change) {
		this.r8_total_market_risk_change = r8_total_market_risk_change;
	}
	public String getR9_market() {
		return r9_market;
	}
	public void setR9_market(String r9_market) {
		this.r9_market = r9_market;
	}
	public BigDecimal getR9_nominal_amount_8() {
		return r9_nominal_amount_8;
	}
	public void setR9_nominal_amount_8(BigDecimal r9_nominal_amount_8) {
		this.r9_nominal_amount_8 = r9_nominal_amount_8;
	}
	public BigDecimal getR9_positions_attracting_8_percent_specific_risk() {
		return r9_positions_attracting_8_percent_specific_risk;
	}
	public void setR9_positions_attracting_8_percent_specific_risk(
			BigDecimal r9_positions_attracting_8_percent_specific_risk) {
		this.r9_positions_attracting_8_percent_specific_risk = r9_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR9_charge_8() {
		return r9_charge_8;
	}
	public void setR9_charge_8(BigDecimal r9_charge_8) {
		this.r9_charge_8 = r9_charge_8;
	}
	public BigDecimal getR9_nominal_amount_4() {
		return r9_nominal_amount_4;
	}
	public void setR9_nominal_amount_4(BigDecimal r9_nominal_amount_4) {
		this.r9_nominal_amount_4 = r9_nominal_amount_4;
	}
	public BigDecimal getR9_positions_attracting_4_percent_specific_risk() {
		return r9_positions_attracting_4_percent_specific_risk;
	}
	public void setR9_positions_attracting_4_percent_specific_risk(
			BigDecimal r9_positions_attracting_4_percent_specific_risk) {
		this.r9_positions_attracting_4_percent_specific_risk = r9_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR9_charge_4() {
		return r9_charge_4;
	}
	public void setR9_charge_4(BigDecimal r9_charge_4) {
		this.r9_charge_4 = r9_charge_4;
	}
	public BigDecimal getR9_nominal_amount_2() {
		return r9_nominal_amount_2;
	}
	public void setR9_nominal_amount_2(BigDecimal r9_nominal_amount_2) {
		this.r9_nominal_amount_2 = r9_nominal_amount_2;
	}
	public BigDecimal getR9_positions_attracting_2_percent_specific_risk() {
		return r9_positions_attracting_2_percent_specific_risk;
	}
	public void setR9_positions_attracting_2_percent_specific_risk(
			BigDecimal r9_positions_attracting_2_percent_specific_risk) {
		this.r9_positions_attracting_2_percent_specific_risk = r9_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR9_charge_2() {
		return r9_charge_2;
	}
	public void setR9_charge_2(BigDecimal r9_charge_2) {
		this.r9_charge_2 = r9_charge_2;
	}
	public BigDecimal getR9_total_specific_risk_charge() {
		return r9_total_specific_risk_charge;
	}
	public void setR9_total_specific_risk_charge(BigDecimal r9_total_specific_risk_charge) {
		this.r9_total_specific_risk_charge = r9_total_specific_risk_charge;
	}
	public BigDecimal getR9_net_positions_for_general_market_risk() {
		return r9_net_positions_for_general_market_risk;
	}
	public void setR9_net_positions_for_general_market_risk(BigDecimal r9_net_positions_for_general_market_risk) {
		this.r9_net_positions_for_general_market_risk = r9_net_positions_for_general_market_risk;
	}
	public BigDecimal getR9_general_market_risk_change_at_8percent() {
		return r9_general_market_risk_change_at_8percent;
	}
	public void setR9_general_market_risk_change_at_8percent(BigDecimal r9_general_market_risk_change_at_8percent) {
		this.r9_general_market_risk_change_at_8percent = r9_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR9_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r9_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR9_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r9_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r9_2percent_general_market_risk_change_for_welldiversified_portfolio = r9_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR9_total_general_market_risk_charge() {
		return r9_total_general_market_risk_charge;
	}
	public void setR9_total_general_market_risk_charge(BigDecimal r9_total_general_market_risk_charge) {
		this.r9_total_general_market_risk_charge = r9_total_general_market_risk_charge;
	}
	public BigDecimal getR9_total_market_risk_change() {
		return r9_total_market_risk_change;
	}
	public void setR9_total_market_risk_change(BigDecimal r9_total_market_risk_change) {
		this.r9_total_market_risk_change = r9_total_market_risk_change;
	}
	public String getR10_market() {
		return r10_market;
	}
	public void setR10_market(String r10_market) {
		this.r10_market = r10_market;
	}
	public BigDecimal getR10_nominal_amount_8() {
		return r10_nominal_amount_8;
	}
	public void setR10_nominal_amount_8(BigDecimal r10_nominal_amount_8) {
		this.r10_nominal_amount_8 = r10_nominal_amount_8;
	}
	public BigDecimal getR10_positions_attracting_8_percent_specific_risk() {
		return r10_positions_attracting_8_percent_specific_risk;
	}
	public void setR10_positions_attracting_8_percent_specific_risk(
			BigDecimal r10_positions_attracting_8_percent_specific_risk) {
		this.r10_positions_attracting_8_percent_specific_risk = r10_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR10_charge_8() {
		return r10_charge_8;
	}
	public void setR10_charge_8(BigDecimal r10_charge_8) {
		this.r10_charge_8 = r10_charge_8;
	}
	public BigDecimal getR10_nominal_amount_4() {
		return r10_nominal_amount_4;
	}
	public void setR10_nominal_amount_4(BigDecimal r10_nominal_amount_4) {
		this.r10_nominal_amount_4 = r10_nominal_amount_4;
	}
	public BigDecimal getR10_positions_attracting_4_percent_specific_risk() {
		return r10_positions_attracting_4_percent_specific_risk;
	}
	public void setR10_positions_attracting_4_percent_specific_risk(
			BigDecimal r10_positions_attracting_4_percent_specific_risk) {
		this.r10_positions_attracting_4_percent_specific_risk = r10_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR10_charge_4() {
		return r10_charge_4;
	}
	public void setR10_charge_4(BigDecimal r10_charge_4) {
		this.r10_charge_4 = r10_charge_4;
	}
	public BigDecimal getR10_nominal_amount_2() {
		return r10_nominal_amount_2;
	}
	public void setR10_nominal_amount_2(BigDecimal r10_nominal_amount_2) {
		this.r10_nominal_amount_2 = r10_nominal_amount_2;
	}
	public BigDecimal getR10_positions_attracting_2_percent_specific_risk() {
		return r10_positions_attracting_2_percent_specific_risk;
	}
	public void setR10_positions_attracting_2_percent_specific_risk(
			BigDecimal r10_positions_attracting_2_percent_specific_risk) {
		this.r10_positions_attracting_2_percent_specific_risk = r10_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR10_charge_2() {
		return r10_charge_2;
	}
	public void setR10_charge_2(BigDecimal r10_charge_2) {
		this.r10_charge_2 = r10_charge_2;
	}
	public BigDecimal getR10_total_specific_risk_charge() {
		return r10_total_specific_risk_charge;
	}
	public void setR10_total_specific_risk_charge(BigDecimal r10_total_specific_risk_charge) {
		this.r10_total_specific_risk_charge = r10_total_specific_risk_charge;
	}
	public BigDecimal getR10_net_positions_for_general_market_risk() {
		return r10_net_positions_for_general_market_risk;
	}
	public void setR10_net_positions_for_general_market_risk(BigDecimal r10_net_positions_for_general_market_risk) {
		this.r10_net_positions_for_general_market_risk = r10_net_positions_for_general_market_risk;
	}
	public BigDecimal getR10_general_market_risk_change_at_8percent() {
		return r10_general_market_risk_change_at_8percent;
	}
	public void setR10_general_market_risk_change_at_8percent(BigDecimal r10_general_market_risk_change_at_8percent) {
		this.r10_general_market_risk_change_at_8percent = r10_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR10_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r10_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR10_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r10_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r10_2percent_general_market_risk_change_for_welldiversified_portfolio = r10_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR10_total_general_market_risk_charge() {
		return r10_total_general_market_risk_charge;
	}
	public void setR10_total_general_market_risk_charge(BigDecimal r10_total_general_market_risk_charge) {
		this.r10_total_general_market_risk_charge = r10_total_general_market_risk_charge;
	}
	public BigDecimal getR10_total_market_risk_change() {
		return r10_total_market_risk_change;
	}
	public void setR10_total_market_risk_change(BigDecimal r10_total_market_risk_change) {
		this.r10_total_market_risk_change = r10_total_market_risk_change;
	}
	public String getR11_market() {
		return r11_market;
	}
	public void setR11_market(String r11_market) {
		this.r11_market = r11_market;
	}
	public BigDecimal getR11_nominal_amount_8() {
		return r11_nominal_amount_8;
	}
	public void setR11_nominal_amount_8(BigDecimal r11_nominal_amount_8) {
		this.r11_nominal_amount_8 = r11_nominal_amount_8;
	}
	public BigDecimal getR11_positions_attracting_8_percent_specific_risk() {
		return r11_positions_attracting_8_percent_specific_risk;
	}
	public void setR11_positions_attracting_8_percent_specific_risk(
			BigDecimal r11_positions_attracting_8_percent_specific_risk) {
		this.r11_positions_attracting_8_percent_specific_risk = r11_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR11_charge_8() {
		return r11_charge_8;
	}
	public void setR11_charge_8(BigDecimal r11_charge_8) {
		this.r11_charge_8 = r11_charge_8;
	}
	public BigDecimal getR11_nominal_amount_4() {
		return r11_nominal_amount_4;
	}
	public void setR11_nominal_amount_4(BigDecimal r11_nominal_amount_4) {
		this.r11_nominal_amount_4 = r11_nominal_amount_4;
	}
	public BigDecimal getR11_positions_attracting_4_percent_specific_risk() {
		return r11_positions_attracting_4_percent_specific_risk;
	}
	public void setR11_positions_attracting_4_percent_specific_risk(
			BigDecimal r11_positions_attracting_4_percent_specific_risk) {
		this.r11_positions_attracting_4_percent_specific_risk = r11_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR11_charge_4() {
		return r11_charge_4;
	}
	public void setR11_charge_4(BigDecimal r11_charge_4) {
		this.r11_charge_4 = r11_charge_4;
	}
	public BigDecimal getR11_nominal_amount_2() {
		return r11_nominal_amount_2;
	}
	public void setR11_nominal_amount_2(BigDecimal r11_nominal_amount_2) {
		this.r11_nominal_amount_2 = r11_nominal_amount_2;
	}
	public BigDecimal getR11_positions_attracting_2_percent_specific_risk() {
		return r11_positions_attracting_2_percent_specific_risk;
	}
	public void setR11_positions_attracting_2_percent_specific_risk(
			BigDecimal r11_positions_attracting_2_percent_specific_risk) {
		this.r11_positions_attracting_2_percent_specific_risk = r11_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR11_charge_2() {
		return r11_charge_2;
	}
	public void setR11_charge_2(BigDecimal r11_charge_2) {
		this.r11_charge_2 = r11_charge_2;
	}
	public BigDecimal getR11_total_specific_risk_charge() {
		return r11_total_specific_risk_charge;
	}
	public void setR11_total_specific_risk_charge(BigDecimal r11_total_specific_risk_charge) {
		this.r11_total_specific_risk_charge = r11_total_specific_risk_charge;
	}
	public BigDecimal getR11_net_positions_for_general_market_risk() {
		return r11_net_positions_for_general_market_risk;
	}
	public void setR11_net_positions_for_general_market_risk(BigDecimal r11_net_positions_for_general_market_risk) {
		this.r11_net_positions_for_general_market_risk = r11_net_positions_for_general_market_risk;
	}
	public BigDecimal getR11_general_market_risk_change_at_8percent() {
		return r11_general_market_risk_change_at_8percent;
	}
	public void setR11_general_market_risk_change_at_8percent(BigDecimal r11_general_market_risk_change_at_8percent) {
		this.r11_general_market_risk_change_at_8percent = r11_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR11_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r11_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR11_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r11_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r11_2percent_general_market_risk_change_for_welldiversified_portfolio = r11_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR11_total_general_market_risk_charge() {
		return r11_total_general_market_risk_charge;
	}
	public void setR11_total_general_market_risk_charge(BigDecimal r11_total_general_market_risk_charge) {
		this.r11_total_general_market_risk_charge = r11_total_general_market_risk_charge;
	}
	public BigDecimal getR11_total_market_risk_change() {
		return r11_total_market_risk_change;
	}
	public void setR11_total_market_risk_change(BigDecimal r11_total_market_risk_change) {
		this.r11_total_market_risk_change = r11_total_market_risk_change;
	}
	public String getR12_market() {
		return r12_market;
	}
	public void setR12_market(String r12_market) {
		this.r12_market = r12_market;
	}
	public BigDecimal getR12_nominal_amount_8() {
		return r12_nominal_amount_8;
	}
	public void setR12_nominal_amount_8(BigDecimal r12_nominal_amount_8) {
		this.r12_nominal_amount_8 = r12_nominal_amount_8;
	}
	public BigDecimal getR12_positions_attracting_8_percent_specific_risk() {
		return r12_positions_attracting_8_percent_specific_risk;
	}
	public void setR12_positions_attracting_8_percent_specific_risk(
			BigDecimal r12_positions_attracting_8_percent_specific_risk) {
		this.r12_positions_attracting_8_percent_specific_risk = r12_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR12_charge_8() {
		return r12_charge_8;
	}
	public void setR12_charge_8(BigDecimal r12_charge_8) {
		this.r12_charge_8 = r12_charge_8;
	}
	public BigDecimal getR12_nominal_amount_4() {
		return r12_nominal_amount_4;
	}
	public void setR12_nominal_amount_4(BigDecimal r12_nominal_amount_4) {
		this.r12_nominal_amount_4 = r12_nominal_amount_4;
	}
	public BigDecimal getR12_positions_attracting_4_percent_specific_risk() {
		return r12_positions_attracting_4_percent_specific_risk;
	}
	public void setR12_positions_attracting_4_percent_specific_risk(
			BigDecimal r12_positions_attracting_4_percent_specific_risk) {
		this.r12_positions_attracting_4_percent_specific_risk = r12_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR12_charge_4() {
		return r12_charge_4;
	}
	public void setR12_charge_4(BigDecimal r12_charge_4) {
		this.r12_charge_4 = r12_charge_4;
	}
	public BigDecimal getR12_nominal_amount_2() {
		return r12_nominal_amount_2;
	}
	public void setR12_nominal_amount_2(BigDecimal r12_nominal_amount_2) {
		this.r12_nominal_amount_2 = r12_nominal_amount_2;
	}
	public BigDecimal getR12_positions_attracting_2_percent_specific_risk() {
		return r12_positions_attracting_2_percent_specific_risk;
	}
	public void setR12_positions_attracting_2_percent_specific_risk(
			BigDecimal r12_positions_attracting_2_percent_specific_risk) {
		this.r12_positions_attracting_2_percent_specific_risk = r12_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR12_charge_2() {
		return r12_charge_2;
	}
	public void setR12_charge_2(BigDecimal r12_charge_2) {
		this.r12_charge_2 = r12_charge_2;
	}
	public BigDecimal getR12_total_specific_risk_charge() {
		return r12_total_specific_risk_charge;
	}
	public void setR12_total_specific_risk_charge(BigDecimal r12_total_specific_risk_charge) {
		this.r12_total_specific_risk_charge = r12_total_specific_risk_charge;
	}
	public BigDecimal getR12_net_positions_for_general_market_risk() {
		return r12_net_positions_for_general_market_risk;
	}
	public void setR12_net_positions_for_general_market_risk(BigDecimal r12_net_positions_for_general_market_risk) {
		this.r12_net_positions_for_general_market_risk = r12_net_positions_for_general_market_risk;
	}
	public BigDecimal getR12_general_market_risk_change_at_8percent() {
		return r12_general_market_risk_change_at_8percent;
	}
	public void setR12_general_market_risk_change_at_8percent(BigDecimal r12_general_market_risk_change_at_8percent) {
		this.r12_general_market_risk_change_at_8percent = r12_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR12_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r12_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR12_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r12_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r12_2percent_general_market_risk_change_for_welldiversified_portfolio = r12_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR12_total_general_market_risk_charge() {
		return r12_total_general_market_risk_charge;
	}
	public void setR12_total_general_market_risk_charge(BigDecimal r12_total_general_market_risk_charge) {
		this.r12_total_general_market_risk_charge = r12_total_general_market_risk_charge;
	}
	public BigDecimal getR12_total_market_risk_change() {
		return r12_total_market_risk_change;
	}
	public void setR12_total_market_risk_change(BigDecimal r12_total_market_risk_change) {
		this.r12_total_market_risk_change = r12_total_market_risk_change;
	}
	public String getR13_market() {
		return r13_market;
	}
	public void setR13_market(String r13_market) {
		this.r13_market = r13_market;
	}
	public BigDecimal getR13_nominal_amount_8() {
		return r13_nominal_amount_8;
	}
	public void setR13_nominal_amount_8(BigDecimal r13_nominal_amount_8) {
		this.r13_nominal_amount_8 = r13_nominal_amount_8;
	}
	public BigDecimal getR13_positions_attracting_8_percent_specific_risk() {
		return r13_positions_attracting_8_percent_specific_risk;
	}
	public void setR13_positions_attracting_8_percent_specific_risk(
			BigDecimal r13_positions_attracting_8_percent_specific_risk) {
		this.r13_positions_attracting_8_percent_specific_risk = r13_positions_attracting_8_percent_specific_risk;
	}
	public BigDecimal getR13_charge_8() {
		return r13_charge_8;
	}
	public void setR13_charge_8(BigDecimal r13_charge_8) {
		this.r13_charge_8 = r13_charge_8;
	}
	public BigDecimal getR13_nominal_amount_4() {
		return r13_nominal_amount_4;
	}
	public void setR13_nominal_amount_4(BigDecimal r13_nominal_amount_4) {
		this.r13_nominal_amount_4 = r13_nominal_amount_4;
	}
	public BigDecimal getR13_positions_attracting_4_percent_specific_risk() {
		return r13_positions_attracting_4_percent_specific_risk;
	}
	public void setR13_positions_attracting_4_percent_specific_risk(
			BigDecimal r13_positions_attracting_4_percent_specific_risk) {
		this.r13_positions_attracting_4_percent_specific_risk = r13_positions_attracting_4_percent_specific_risk;
	}
	public BigDecimal getR13_charge_4() {
		return r13_charge_4;
	}
	public void setR13_charge_4(BigDecimal r13_charge_4) {
		this.r13_charge_4 = r13_charge_4;
	}
	public BigDecimal getR13_nominal_amount_2() {
		return r13_nominal_amount_2;
	}
	public void setR13_nominal_amount_2(BigDecimal r13_nominal_amount_2) {
		this.r13_nominal_amount_2 = r13_nominal_amount_2;
	}
	public BigDecimal getR13_positions_attracting_2_percent_specific_risk() {
		return r13_positions_attracting_2_percent_specific_risk;
	}
	public void setR13_positions_attracting_2_percent_specific_risk(
			BigDecimal r13_positions_attracting_2_percent_specific_risk) {
		this.r13_positions_attracting_2_percent_specific_risk = r13_positions_attracting_2_percent_specific_risk;
	}
	public BigDecimal getR13_charge_2() {
		return r13_charge_2;
	}
	public void setR13_charge_2(BigDecimal r13_charge_2) {
		this.r13_charge_2 = r13_charge_2;
	}
	public BigDecimal getR13_total_specific_risk_charge() {
		return r13_total_specific_risk_charge;
	}
	public void setR13_total_specific_risk_charge(BigDecimal r13_total_specific_risk_charge) {
		this.r13_total_specific_risk_charge = r13_total_specific_risk_charge;
	}
	public BigDecimal getR13_net_positions_for_general_market_risk() {
		return r13_net_positions_for_general_market_risk;
	}
	public void setR13_net_positions_for_general_market_risk(BigDecimal r13_net_positions_for_general_market_risk) {
		this.r13_net_positions_for_general_market_risk = r13_net_positions_for_general_market_risk;
	}
	public BigDecimal getR13_general_market_risk_change_at_8percent() {
		return r13_general_market_risk_change_at_8percent;
	}
	public void setR13_general_market_risk_change_at_8percent(BigDecimal r13_general_market_risk_change_at_8percent) {
		this.r13_general_market_risk_change_at_8percent = r13_general_market_risk_change_at_8percent;
	}
	public BigDecimal getR13_2percent_general_market_risk_change_for_welldiversified_portfolio() {
		return r13_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public void setR13_2percent_general_market_risk_change_for_welldiversified_portfolio(
			BigDecimal r13_2percent_general_market_risk_change_for_welldiversified_portfolio) {
		this.r13_2percent_general_market_risk_change_for_welldiversified_portfolio = r13_2percent_general_market_risk_change_for_welldiversified_portfolio;
	}
	public BigDecimal getR13_total_general_market_risk_charge() {
		return r13_total_general_market_risk_charge;
	}
	public void setR13_total_general_market_risk_charge(BigDecimal r13_total_general_market_risk_charge) {
		this.r13_total_general_market_risk_charge = r13_total_general_market_risk_charge;
	}
	public BigDecimal getR13_total_market_risk_change() {
		return r13_total_market_risk_change;
	}
	public void setR13_total_market_risk_change(BigDecimal r13_total_market_risk_change) {
		this.r13_total_market_risk_change = r13_total_market_risk_change;
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
	public BRS29_ENTITY(String r1_market, BigDecimal r1_nominal_amount_8,
			BigDecimal r1_positions_attracting_8_percent_specific_risk, BigDecimal r1_charge_8,
			BigDecimal r1_nominal_amount_4, BigDecimal r1_positions_attracting_4_percent_specific_risk,
			BigDecimal r1_charge_4, BigDecimal r1_nominal_amount_2,
			BigDecimal r1_positions_attracting_2_percent_specific_risk, BigDecimal r1_charge_2,
			BigDecimal r1_total_specific_risk_charge, BigDecimal r1_net_positions_for_general_market_risk,
			BigDecimal r1_general_market_risk_change_at_8percent,
			BigDecimal r1_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r1_total_general_market_risk_charge, BigDecimal r1_total_market_risk_change, String r2_market,
			BigDecimal r2_nominal_amount_8, BigDecimal r2_positions_attracting_8_percent_specific_risk,
			BigDecimal r2_charge_8, BigDecimal r2_nominal_amount_4,
			BigDecimal r2_positions_attracting_4_percent_specific_risk, BigDecimal r2_charge_4,
			BigDecimal r2_nominal_amount_2, BigDecimal r2_positions_attracting_2_percent_specific_risk,
			BigDecimal r2_charge_2, BigDecimal r2_total_specific_risk_charge,
			BigDecimal r2_net_positions_for_general_market_risk, BigDecimal r2_general_market_risk_change_at_8percent,
			BigDecimal r2_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r2_total_general_market_risk_charge, BigDecimal r2_total_market_risk_change, String r3_market,
			BigDecimal r3_nominal_amount_8, BigDecimal r3_positions_attracting_8_percent_specific_risk,
			BigDecimal r3_charge_8, BigDecimal r3_nominal_amount_4,
			BigDecimal r3_positions_attracting_4_percent_specific_risk, BigDecimal r3_charge_4,
			BigDecimal r3_nominal_amount_2, BigDecimal r3_positions_attracting_2_percent_specific_risk,
			BigDecimal r3_charge_2, BigDecimal r3_total_specific_risk_charge,
			BigDecimal r3_net_positions_for_general_market_risk, BigDecimal r3_general_market_risk_change_at_8percent,
			BigDecimal r3_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r3_total_general_market_risk_charge, BigDecimal r3_total_market_risk_change, String r4_market,
			BigDecimal r4_nominal_amount_8, BigDecimal r4_positions_attracting_8_percent_specific_risk,
			BigDecimal r4_charge_8, BigDecimal r4_nominal_amount_4,
			BigDecimal r4_positions_attracting_4_percent_specific_risk, BigDecimal r4_charge_4,
			BigDecimal r4_nominal_amount_2, BigDecimal r4_positions_attracting_2_percent_specific_risk,
			BigDecimal r4_charge_2, BigDecimal r4_total_specific_risk_charge,
			BigDecimal r4_net_positions_for_general_market_risk, BigDecimal r4_general_market_risk_change_at_8percent,
			BigDecimal r4_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r4_total_general_market_risk_charge, BigDecimal r4_total_market_risk_change, String r5_market,
			BigDecimal r5_nominal_amount_8, BigDecimal r5_positions_attracting_8_percent_specific_risk,
			BigDecimal r5_charge_8, BigDecimal r5_nominal_amount_4,
			BigDecimal r5_positions_attracting_4_percent_specific_risk, BigDecimal r5_charge_4,
			BigDecimal r5_nominal_amount_2, BigDecimal r5_positions_attracting_2_percent_specific_risk,
			BigDecimal r5_charge_2, BigDecimal r5_total_specific_risk_charge,
			BigDecimal r5_net_positions_for_general_market_risk, BigDecimal r5_general_market_risk_change_at_8percent,
			BigDecimal r5_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r5_total_general_market_risk_charge, BigDecimal r5_total_market_risk_change, String r6_market,
			BigDecimal r6_nominal_amount_8, BigDecimal r6_positions_attracting_8_percent_specific_risk,
			BigDecimal r6_charge_8, BigDecimal r6_nominal_amount_4,
			BigDecimal r6_positions_attracting_4_percent_specific_risk, BigDecimal r6_charge_4,
			BigDecimal r6_nominal_amount_2, BigDecimal r6_positions_attracting_2_percent_specific_risk,
			BigDecimal r6_charge_2, BigDecimal r6_total_specific_risk_charge,
			BigDecimal r6_net_positions_for_general_market_risk, BigDecimal r6_general_market_risk_change_at_8percent,
			BigDecimal r6_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r6_total_general_market_risk_charge, BigDecimal r6_total_market_risk_change, String r7_market,
			BigDecimal r7_nominal_amount_8, BigDecimal r7_positions_attracting_8_percent_specific_risk,
			BigDecimal r7_charge_8, BigDecimal r7_nominal_amount_4,
			BigDecimal r7_positions_attracting_4_percent_specific_risk, BigDecimal r7_charge_4,
			BigDecimal r7_nominal_amount_2, BigDecimal r7_positions_attracting_2_percent_specific_risk,
			BigDecimal r7_charge_2, BigDecimal r7_total_specific_risk_charge,
			BigDecimal r7_net_positions_for_general_market_risk, BigDecimal r7_general_market_risk_change_at_8percent,
			BigDecimal r7_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r7_total_general_market_risk_charge, BigDecimal r7_total_market_risk_change, String r8_market,
			BigDecimal r8_nominal_amount_8, BigDecimal r8_positions_attracting_8_percent_specific_risk,
			BigDecimal r8_charge_8, BigDecimal r8_nominal_amount_4,
			BigDecimal r8_positions_attracting_4_percent_specific_risk, BigDecimal r8_charge_4,
			BigDecimal r8_nominal_amount_2, BigDecimal r8_positions_attracting_2_percent_specific_risk,
			BigDecimal r8_charge_2, BigDecimal r8_total_specific_risk_charge,
			BigDecimal r8_net_positions_for_general_market_risk, BigDecimal r8_general_market_risk_change_at_8percent,
			BigDecimal r8_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r8_total_general_market_risk_charge, BigDecimal r8_total_market_risk_change, String r9_market,
			BigDecimal r9_nominal_amount_8, BigDecimal r9_positions_attracting_8_percent_specific_risk,
			BigDecimal r9_charge_8, BigDecimal r9_nominal_amount_4,
			BigDecimal r9_positions_attracting_4_percent_specific_risk, BigDecimal r9_charge_4,
			BigDecimal r9_nominal_amount_2, BigDecimal r9_positions_attracting_2_percent_specific_risk,
			BigDecimal r9_charge_2, BigDecimal r9_total_specific_risk_charge,
			BigDecimal r9_net_positions_for_general_market_risk, BigDecimal r9_general_market_risk_change_at_8percent,
			BigDecimal r9_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r9_total_general_market_risk_charge, BigDecimal r9_total_market_risk_change, String r10_market,
			BigDecimal r10_nominal_amount_8, BigDecimal r10_positions_attracting_8_percent_specific_risk,
			BigDecimal r10_charge_8, BigDecimal r10_nominal_amount_4,
			BigDecimal r10_positions_attracting_4_percent_specific_risk, BigDecimal r10_charge_4,
			BigDecimal r10_nominal_amount_2, BigDecimal r10_positions_attracting_2_percent_specific_risk,
			BigDecimal r10_charge_2, BigDecimal r10_total_specific_risk_charge,
			BigDecimal r10_net_positions_for_general_market_risk, BigDecimal r10_general_market_risk_change_at_8percent,
			BigDecimal r10_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r10_total_general_market_risk_charge, BigDecimal r10_total_market_risk_change, String r11_market,
			BigDecimal r11_nominal_amount_8, BigDecimal r11_positions_attracting_8_percent_specific_risk,
			BigDecimal r11_charge_8, BigDecimal r11_nominal_amount_4,
			BigDecimal r11_positions_attracting_4_percent_specific_risk, BigDecimal r11_charge_4,
			BigDecimal r11_nominal_amount_2, BigDecimal r11_positions_attracting_2_percent_specific_risk,
			BigDecimal r11_charge_2, BigDecimal r11_total_specific_risk_charge,
			BigDecimal r11_net_positions_for_general_market_risk, BigDecimal r11_general_market_risk_change_at_8percent,
			BigDecimal r11_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r11_total_general_market_risk_charge, BigDecimal r11_total_market_risk_change, String r12_market,
			BigDecimal r12_nominal_amount_8, BigDecimal r12_positions_attracting_8_percent_specific_risk,
			BigDecimal r12_charge_8, BigDecimal r12_nominal_amount_4,
			BigDecimal r12_positions_attracting_4_percent_specific_risk, BigDecimal r12_charge_4,
			BigDecimal r12_nominal_amount_2, BigDecimal r12_positions_attracting_2_percent_specific_risk,
			BigDecimal r12_charge_2, BigDecimal r12_total_specific_risk_charge,
			BigDecimal r12_net_positions_for_general_market_risk, BigDecimal r12_general_market_risk_change_at_8percent,
			BigDecimal r12_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r12_total_general_market_risk_charge, BigDecimal r12_total_market_risk_change, String r13_market,
			BigDecimal r13_nominal_amount_8, BigDecimal r13_positions_attracting_8_percent_specific_risk,
			BigDecimal r13_charge_8, BigDecimal r13_nominal_amount_4,
			BigDecimal r13_positions_attracting_4_percent_specific_risk, BigDecimal r13_charge_4,
			BigDecimal r13_nominal_amount_2, BigDecimal r13_positions_attracting_2_percent_specific_risk,
			BigDecimal r13_charge_2, BigDecimal r13_total_specific_risk_charge,
			BigDecimal r13_net_positions_for_general_market_risk, BigDecimal r13_general_market_risk_change_at_8percent,
			BigDecimal r13_2percent_general_market_risk_change_for_welldiversified_portfolio,
			BigDecimal r13_total_general_market_risk_charge, BigDecimal r13_total_market_risk_change, Date report_date,
			Date report_from_date, Date report_to_date, String entity_flg, String modify_flg, String del_flg,
			String report_code, Date report_submit_date) {
		super();
		this.r1_market = r1_market;
		this.r1_nominal_amount_8 = r1_nominal_amount_8;
		this.r1_positions_attracting_8_percent_specific_risk = r1_positions_attracting_8_percent_specific_risk;
		this.r1_charge_8 = r1_charge_8;
		this.r1_nominal_amount_4 = r1_nominal_amount_4;
		this.r1_positions_attracting_4_percent_specific_risk = r1_positions_attracting_4_percent_specific_risk;
		this.r1_charge_4 = r1_charge_4;
		this.r1_nominal_amount_2 = r1_nominal_amount_2;
		this.r1_positions_attracting_2_percent_specific_risk = r1_positions_attracting_2_percent_specific_risk;
		this.r1_charge_2 = r1_charge_2;
		this.r1_total_specific_risk_charge = r1_total_specific_risk_charge;
		this.r1_net_positions_for_general_market_risk = r1_net_positions_for_general_market_risk;
		this.r1_general_market_risk_change_at_8percent = r1_general_market_risk_change_at_8percent;
		this.r1_2percent_general_market_risk_change_for_welldiversified_portfolio = r1_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r1_total_general_market_risk_charge = r1_total_general_market_risk_charge;
		this.r1_total_market_risk_change = r1_total_market_risk_change;
		this.r2_market = r2_market;
		this.r2_nominal_amount_8 = r2_nominal_amount_8;
		this.r2_positions_attracting_8_percent_specific_risk = r2_positions_attracting_8_percent_specific_risk;
		this.r2_charge_8 = r2_charge_8;
		this.r2_nominal_amount_4 = r2_nominal_amount_4;
		this.r2_positions_attracting_4_percent_specific_risk = r2_positions_attracting_4_percent_specific_risk;
		this.r2_charge_4 = r2_charge_4;
		this.r2_nominal_amount_2 = r2_nominal_amount_2;
		this.r2_positions_attracting_2_percent_specific_risk = r2_positions_attracting_2_percent_specific_risk;
		this.r2_charge_2 = r2_charge_2;
		this.r2_total_specific_risk_charge = r2_total_specific_risk_charge;
		this.r2_net_positions_for_general_market_risk = r2_net_positions_for_general_market_risk;
		this.r2_general_market_risk_change_at_8percent = r2_general_market_risk_change_at_8percent;
		this.r2_2percent_general_market_risk_change_for_welldiversified_portfolio = r2_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r2_total_general_market_risk_charge = r2_total_general_market_risk_charge;
		this.r2_total_market_risk_change = r2_total_market_risk_change;
		this.r3_market = r3_market;
		this.r3_nominal_amount_8 = r3_nominal_amount_8;
		this.r3_positions_attracting_8_percent_specific_risk = r3_positions_attracting_8_percent_specific_risk;
		this.r3_charge_8 = r3_charge_8;
		this.r3_nominal_amount_4 = r3_nominal_amount_4;
		this.r3_positions_attracting_4_percent_specific_risk = r3_positions_attracting_4_percent_specific_risk;
		this.r3_charge_4 = r3_charge_4;
		this.r3_nominal_amount_2 = r3_nominal_amount_2;
		this.r3_positions_attracting_2_percent_specific_risk = r3_positions_attracting_2_percent_specific_risk;
		this.r3_charge_2 = r3_charge_2;
		this.r3_total_specific_risk_charge = r3_total_specific_risk_charge;
		this.r3_net_positions_for_general_market_risk = r3_net_positions_for_general_market_risk;
		this.r3_general_market_risk_change_at_8percent = r3_general_market_risk_change_at_8percent;
		this.r3_2percent_general_market_risk_change_for_welldiversified_portfolio = r3_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r3_total_general_market_risk_charge = r3_total_general_market_risk_charge;
		this.r3_total_market_risk_change = r3_total_market_risk_change;
		this.r4_market = r4_market;
		this.r4_nominal_amount_8 = r4_nominal_amount_8;
		this.r4_positions_attracting_8_percent_specific_risk = r4_positions_attracting_8_percent_specific_risk;
		this.r4_charge_8 = r4_charge_8;
		this.r4_nominal_amount_4 = r4_nominal_amount_4;
		this.r4_positions_attracting_4_percent_specific_risk = r4_positions_attracting_4_percent_specific_risk;
		this.r4_charge_4 = r4_charge_4;
		this.r4_nominal_amount_2 = r4_nominal_amount_2;
		this.r4_positions_attracting_2_percent_specific_risk = r4_positions_attracting_2_percent_specific_risk;
		this.r4_charge_2 = r4_charge_2;
		this.r4_total_specific_risk_charge = r4_total_specific_risk_charge;
		this.r4_net_positions_for_general_market_risk = r4_net_positions_for_general_market_risk;
		this.r4_general_market_risk_change_at_8percent = r4_general_market_risk_change_at_8percent;
		this.r4_2percent_general_market_risk_change_for_welldiversified_portfolio = r4_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r4_total_general_market_risk_charge = r4_total_general_market_risk_charge;
		this.r4_total_market_risk_change = r4_total_market_risk_change;
		this.r5_market = r5_market;
		this.r5_nominal_amount_8 = r5_nominal_amount_8;
		this.r5_positions_attracting_8_percent_specific_risk = r5_positions_attracting_8_percent_specific_risk;
		this.r5_charge_8 = r5_charge_8;
		this.r5_nominal_amount_4 = r5_nominal_amount_4;
		this.r5_positions_attracting_4_percent_specific_risk = r5_positions_attracting_4_percent_specific_risk;
		this.r5_charge_4 = r5_charge_4;
		this.r5_nominal_amount_2 = r5_nominal_amount_2;
		this.r5_positions_attracting_2_percent_specific_risk = r5_positions_attracting_2_percent_specific_risk;
		this.r5_charge_2 = r5_charge_2;
		this.r5_total_specific_risk_charge = r5_total_specific_risk_charge;
		this.r5_net_positions_for_general_market_risk = r5_net_positions_for_general_market_risk;
		this.r5_general_market_risk_change_at_8percent = r5_general_market_risk_change_at_8percent;
		this.r5_2percent_general_market_risk_change_for_welldiversified_portfolio = r5_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r5_total_general_market_risk_charge = r5_total_general_market_risk_charge;
		this.r5_total_market_risk_change = r5_total_market_risk_change;
		this.r6_market = r6_market;
		this.r6_nominal_amount_8 = r6_nominal_amount_8;
		this.r6_positions_attracting_8_percent_specific_risk = r6_positions_attracting_8_percent_specific_risk;
		this.r6_charge_8 = r6_charge_8;
		this.r6_nominal_amount_4 = r6_nominal_amount_4;
		this.r6_positions_attracting_4_percent_specific_risk = r6_positions_attracting_4_percent_specific_risk;
		this.r6_charge_4 = r6_charge_4;
		this.r6_nominal_amount_2 = r6_nominal_amount_2;
		this.r6_positions_attracting_2_percent_specific_risk = r6_positions_attracting_2_percent_specific_risk;
		this.r6_charge_2 = r6_charge_2;
		this.r6_total_specific_risk_charge = r6_total_specific_risk_charge;
		this.r6_net_positions_for_general_market_risk = r6_net_positions_for_general_market_risk;
		this.r6_general_market_risk_change_at_8percent = r6_general_market_risk_change_at_8percent;
		this.r6_2percent_general_market_risk_change_for_welldiversified_portfolio = r6_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r6_total_general_market_risk_charge = r6_total_general_market_risk_charge;
		this.r6_total_market_risk_change = r6_total_market_risk_change;
		this.r7_market = r7_market;
		this.r7_nominal_amount_8 = r7_nominal_amount_8;
		this.r7_positions_attracting_8_percent_specific_risk = r7_positions_attracting_8_percent_specific_risk;
		this.r7_charge_8 = r7_charge_8;
		this.r7_nominal_amount_4 = r7_nominal_amount_4;
		this.r7_positions_attracting_4_percent_specific_risk = r7_positions_attracting_4_percent_specific_risk;
		this.r7_charge_4 = r7_charge_4;
		this.r7_nominal_amount_2 = r7_nominal_amount_2;
		this.r7_positions_attracting_2_percent_specific_risk = r7_positions_attracting_2_percent_specific_risk;
		this.r7_charge_2 = r7_charge_2;
		this.r7_total_specific_risk_charge = r7_total_specific_risk_charge;
		this.r7_net_positions_for_general_market_risk = r7_net_positions_for_general_market_risk;
		this.r7_general_market_risk_change_at_8percent = r7_general_market_risk_change_at_8percent;
		this.r7_2percent_general_market_risk_change_for_welldiversified_portfolio = r7_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r7_total_general_market_risk_charge = r7_total_general_market_risk_charge;
		this.r7_total_market_risk_change = r7_total_market_risk_change;
		this.r8_market = r8_market;
		this.r8_nominal_amount_8 = r8_nominal_amount_8;
		this.r8_positions_attracting_8_percent_specific_risk = r8_positions_attracting_8_percent_specific_risk;
		this.r8_charge_8 = r8_charge_8;
		this.r8_nominal_amount_4 = r8_nominal_amount_4;
		this.r8_positions_attracting_4_percent_specific_risk = r8_positions_attracting_4_percent_specific_risk;
		this.r8_charge_4 = r8_charge_4;
		this.r8_nominal_amount_2 = r8_nominal_amount_2;
		this.r8_positions_attracting_2_percent_specific_risk = r8_positions_attracting_2_percent_specific_risk;
		this.r8_charge_2 = r8_charge_2;
		this.r8_total_specific_risk_charge = r8_total_specific_risk_charge;
		this.r8_net_positions_for_general_market_risk = r8_net_positions_for_general_market_risk;
		this.r8_general_market_risk_change_at_8percent = r8_general_market_risk_change_at_8percent;
		this.r8_2percent_general_market_risk_change_for_welldiversified_portfolio = r8_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r8_total_general_market_risk_charge = r8_total_general_market_risk_charge;
		this.r8_total_market_risk_change = r8_total_market_risk_change;
		this.r9_market = r9_market;
		this.r9_nominal_amount_8 = r9_nominal_amount_8;
		this.r9_positions_attracting_8_percent_specific_risk = r9_positions_attracting_8_percent_specific_risk;
		this.r9_charge_8 = r9_charge_8;
		this.r9_nominal_amount_4 = r9_nominal_amount_4;
		this.r9_positions_attracting_4_percent_specific_risk = r9_positions_attracting_4_percent_specific_risk;
		this.r9_charge_4 = r9_charge_4;
		this.r9_nominal_amount_2 = r9_nominal_amount_2;
		this.r9_positions_attracting_2_percent_specific_risk = r9_positions_attracting_2_percent_specific_risk;
		this.r9_charge_2 = r9_charge_2;
		this.r9_total_specific_risk_charge = r9_total_specific_risk_charge;
		this.r9_net_positions_for_general_market_risk = r9_net_positions_for_general_market_risk;
		this.r9_general_market_risk_change_at_8percent = r9_general_market_risk_change_at_8percent;
		this.r9_2percent_general_market_risk_change_for_welldiversified_portfolio = r9_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r9_total_general_market_risk_charge = r9_total_general_market_risk_charge;
		this.r9_total_market_risk_change = r9_total_market_risk_change;
		this.r10_market = r10_market;
		this.r10_nominal_amount_8 = r10_nominal_amount_8;
		this.r10_positions_attracting_8_percent_specific_risk = r10_positions_attracting_8_percent_specific_risk;
		this.r10_charge_8 = r10_charge_8;
		this.r10_nominal_amount_4 = r10_nominal_amount_4;
		this.r10_positions_attracting_4_percent_specific_risk = r10_positions_attracting_4_percent_specific_risk;
		this.r10_charge_4 = r10_charge_4;
		this.r10_nominal_amount_2 = r10_nominal_amount_2;
		this.r10_positions_attracting_2_percent_specific_risk = r10_positions_attracting_2_percent_specific_risk;
		this.r10_charge_2 = r10_charge_2;
		this.r10_total_specific_risk_charge = r10_total_specific_risk_charge;
		this.r10_net_positions_for_general_market_risk = r10_net_positions_for_general_market_risk;
		this.r10_general_market_risk_change_at_8percent = r10_general_market_risk_change_at_8percent;
		this.r10_2percent_general_market_risk_change_for_welldiversified_portfolio = r10_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r10_total_general_market_risk_charge = r10_total_general_market_risk_charge;
		this.r10_total_market_risk_change = r10_total_market_risk_change;
		this.r11_market = r11_market;
		this.r11_nominal_amount_8 = r11_nominal_amount_8;
		this.r11_positions_attracting_8_percent_specific_risk = r11_positions_attracting_8_percent_specific_risk;
		this.r11_charge_8 = r11_charge_8;
		this.r11_nominal_amount_4 = r11_nominal_amount_4;
		this.r11_positions_attracting_4_percent_specific_risk = r11_positions_attracting_4_percent_specific_risk;
		this.r11_charge_4 = r11_charge_4;
		this.r11_nominal_amount_2 = r11_nominal_amount_2;
		this.r11_positions_attracting_2_percent_specific_risk = r11_positions_attracting_2_percent_specific_risk;
		this.r11_charge_2 = r11_charge_2;
		this.r11_total_specific_risk_charge = r11_total_specific_risk_charge;
		this.r11_net_positions_for_general_market_risk = r11_net_positions_for_general_market_risk;
		this.r11_general_market_risk_change_at_8percent = r11_general_market_risk_change_at_8percent;
		this.r11_2percent_general_market_risk_change_for_welldiversified_portfolio = r11_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r11_total_general_market_risk_charge = r11_total_general_market_risk_charge;
		this.r11_total_market_risk_change = r11_total_market_risk_change;
		this.r12_market = r12_market;
		this.r12_nominal_amount_8 = r12_nominal_amount_8;
		this.r12_positions_attracting_8_percent_specific_risk = r12_positions_attracting_8_percent_specific_risk;
		this.r12_charge_8 = r12_charge_8;
		this.r12_nominal_amount_4 = r12_nominal_amount_4;
		this.r12_positions_attracting_4_percent_specific_risk = r12_positions_attracting_4_percent_specific_risk;
		this.r12_charge_4 = r12_charge_4;
		this.r12_nominal_amount_2 = r12_nominal_amount_2;
		this.r12_positions_attracting_2_percent_specific_risk = r12_positions_attracting_2_percent_specific_risk;
		this.r12_charge_2 = r12_charge_2;
		this.r12_total_specific_risk_charge = r12_total_specific_risk_charge;
		this.r12_net_positions_for_general_market_risk = r12_net_positions_for_general_market_risk;
		this.r12_general_market_risk_change_at_8percent = r12_general_market_risk_change_at_8percent;
		this.r12_2percent_general_market_risk_change_for_welldiversified_portfolio = r12_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r12_total_general_market_risk_charge = r12_total_general_market_risk_charge;
		this.r12_total_market_risk_change = r12_total_market_risk_change;
		this.r13_market = r13_market;
		this.r13_nominal_amount_8 = r13_nominal_amount_8;
		this.r13_positions_attracting_8_percent_specific_risk = r13_positions_attracting_8_percent_specific_risk;
		this.r13_charge_8 = r13_charge_8;
		this.r13_nominal_amount_4 = r13_nominal_amount_4;
		this.r13_positions_attracting_4_percent_specific_risk = r13_positions_attracting_4_percent_specific_risk;
		this.r13_charge_4 = r13_charge_4;
		this.r13_nominal_amount_2 = r13_nominal_amount_2;
		this.r13_positions_attracting_2_percent_specific_risk = r13_positions_attracting_2_percent_specific_risk;
		this.r13_charge_2 = r13_charge_2;
		this.r13_total_specific_risk_charge = r13_total_specific_risk_charge;
		this.r13_net_positions_for_general_market_risk = r13_net_positions_for_general_market_risk;
		this.r13_general_market_risk_change_at_8percent = r13_general_market_risk_change_at_8percent;
		this.r13_2percent_general_market_risk_change_for_welldiversified_portfolio = r13_2percent_general_market_risk_change_for_welldiversified_portfolio;
		this.r13_total_general_market_risk_charge = r13_total_general_market_risk_charge;
		this.r13_total_market_risk_change = r13_total_market_risk_change;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS29_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

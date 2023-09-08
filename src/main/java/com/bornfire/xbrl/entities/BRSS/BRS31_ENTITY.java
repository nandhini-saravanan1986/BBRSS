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
@Table(name="BRS31_TABLE")

public class BRS31_ENTITY {
	
	private String	r1_product;
	private BigDecimal	r1_total_long_position;
	private BigDecimal	r1_total_short_position;
	private BigDecimal	r1_gross_open_position;
	private BigDecimal	r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r1_net_open_position;
	private BigDecimal	r1_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r1_capital_charge_for_directional_risk;
	private BigDecimal	r1_total_capital_charge_by_commodity;
	private String	r2_product;
	private BigDecimal	r2_total_long_position;
	private BigDecimal	r2_total_short_position;
	private BigDecimal	r2_gross_open_position;
	private BigDecimal	r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r2_net_open_position;
	private BigDecimal	r2_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r2_capital_charge_for_directional_risk;
	private BigDecimal	r2_total_capital_charge_by_commodity;
	private String	r3_product;
	private BigDecimal	r3_total_long_position;
	private BigDecimal	r3_total_short_position;
	private BigDecimal	r3_gross_open_position;
	private BigDecimal	r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r3_net_open_position;
	private BigDecimal	r3_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r3_capital_charge_for_directional_risk;
	private BigDecimal	r3_total_capital_charge_by_commodity;
	private String	r4_product;
	private BigDecimal	r4_total_long_position;
	private BigDecimal	r4_total_short_position;
	private BigDecimal	r4_gross_open_position;
	private BigDecimal	r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r4_net_open_position;
	private BigDecimal	r4_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r4_capital_charge_for_directional_risk;
	private BigDecimal	r4_total_capital_charge_by_commodity;
	private String	r5_product;
	private BigDecimal	r5_total_long_position;
	private BigDecimal	r5_total_short_position;
	private BigDecimal	r5_gross_open_position;
	private BigDecimal	r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r5_net_open_position;
	private BigDecimal	r5_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r5_capital_charge_for_directional_risk;
	private BigDecimal	r5_total_capital_charge_by_commodity;
	private String	r6_product;
	private BigDecimal	r6_total_long_position;
	private BigDecimal	r6_total_short_position;
	private BigDecimal	r6_gross_open_position;
	private BigDecimal	r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r6_net_open_position;
	private BigDecimal	r6_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r6_capital_charge_for_directional_risk;
	private BigDecimal	r6_total_capital_charge_by_commodity;
	private String	r7_product;
	private BigDecimal	r7_total_long_position;
	private BigDecimal	r7_total_short_position;
	private BigDecimal	r7_gross_open_position;
	private BigDecimal	r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r7_net_open_position;
	private BigDecimal	r7_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r7_capital_charge_for_directional_risk;
	private BigDecimal	r7_total_capital_charge_by_commodity;
	private String	r8_product;
	private BigDecimal	r8_total_long_position;
	private BigDecimal	r8_total_short_position;
	private BigDecimal	r8_gross_open_position;
	private BigDecimal	r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	private BigDecimal	r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	private BigDecimal	r8_net_open_position;
	private BigDecimal	r8_charge_for_directional_risk_15percent_of_net_open_position;
	private BigDecimal	r8_capital_charge_for_directional_risk;
	private BigDecimal	r8_total_capital_charge_by_commodity;
	
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
	public BigDecimal getR1_total_long_position() {
		return r1_total_long_position;
	}
	public void setR1_total_long_position(BigDecimal r1_total_long_position) {
		this.r1_total_long_position = r1_total_long_position;
	}
	public BigDecimal getR1_total_short_position() {
		return r1_total_short_position;
	}
	public void setR1_total_short_position(BigDecimal r1_total_short_position) {
		this.r1_total_short_position = r1_total_short_position;
	}
	public BigDecimal getR1_gross_open_position() {
		return r1_gross_open_position;
	}
	public void setR1_gross_open_position(BigDecimal r1_gross_open_position) {
		this.r1_gross_open_position = r1_gross_open_position;
	}
	public BigDecimal getR1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR1_net_open_position() {
		return r1_net_open_position;
	}
	public void setR1_net_open_position(BigDecimal r1_net_open_position) {
		this.r1_net_open_position = r1_net_open_position;
	}
	public BigDecimal getR1_charge_for_directional_risk_15percent_of_net_open_position() {
		return r1_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR1_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r1_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r1_charge_for_directional_risk_15percent_of_net_open_position = r1_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR1_capital_charge_for_directional_risk() {
		return r1_capital_charge_for_directional_risk;
	}
	public void setR1_capital_charge_for_directional_risk(BigDecimal r1_capital_charge_for_directional_risk) {
		this.r1_capital_charge_for_directional_risk = r1_capital_charge_for_directional_risk;
	}
	public BigDecimal getR1_total_capital_charge_by_commodity() {
		return r1_total_capital_charge_by_commodity;
	}
	public void setR1_total_capital_charge_by_commodity(BigDecimal r1_total_capital_charge_by_commodity) {
		this.r1_total_capital_charge_by_commodity = r1_total_capital_charge_by_commodity;
	}
	public String getR2_product() {
		return r2_product;
	}
	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}
	public BigDecimal getR2_total_long_position() {
		return r2_total_long_position;
	}
	public void setR2_total_long_position(BigDecimal r2_total_long_position) {
		this.r2_total_long_position = r2_total_long_position;
	}
	public BigDecimal getR2_total_short_position() {
		return r2_total_short_position;
	}
	public void setR2_total_short_position(BigDecimal r2_total_short_position) {
		this.r2_total_short_position = r2_total_short_position;
	}
	public BigDecimal getR2_gross_open_position() {
		return r2_gross_open_position;
	}
	public void setR2_gross_open_position(BigDecimal r2_gross_open_position) {
		this.r2_gross_open_position = r2_gross_open_position;
	}
	public BigDecimal getR2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR2_net_open_position() {
		return r2_net_open_position;
	}
	public void setR2_net_open_position(BigDecimal r2_net_open_position) {
		this.r2_net_open_position = r2_net_open_position;
	}
	public BigDecimal getR2_charge_for_directional_risk_15percent_of_net_open_position() {
		return r2_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR2_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r2_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r2_charge_for_directional_risk_15percent_of_net_open_position = r2_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR2_capital_charge_for_directional_risk() {
		return r2_capital_charge_for_directional_risk;
	}
	public void setR2_capital_charge_for_directional_risk(BigDecimal r2_capital_charge_for_directional_risk) {
		this.r2_capital_charge_for_directional_risk = r2_capital_charge_for_directional_risk;
	}
	public BigDecimal getR2_total_capital_charge_by_commodity() {
		return r2_total_capital_charge_by_commodity;
	}
	public void setR2_total_capital_charge_by_commodity(BigDecimal r2_total_capital_charge_by_commodity) {
		this.r2_total_capital_charge_by_commodity = r2_total_capital_charge_by_commodity;
	}
	public String getR3_product() {
		return r3_product;
	}
	public void setR3_product(String r3_product) {
		this.r3_product = r3_product;
	}
	public BigDecimal getR3_total_long_position() {
		return r3_total_long_position;
	}
	public void setR3_total_long_position(BigDecimal r3_total_long_position) {
		this.r3_total_long_position = r3_total_long_position;
	}
	public BigDecimal getR3_total_short_position() {
		return r3_total_short_position;
	}
	public void setR3_total_short_position(BigDecimal r3_total_short_position) {
		this.r3_total_short_position = r3_total_short_position;
	}
	public BigDecimal getR3_gross_open_position() {
		return r3_gross_open_position;
	}
	public void setR3_gross_open_position(BigDecimal r3_gross_open_position) {
		this.r3_gross_open_position = r3_gross_open_position;
	}
	public BigDecimal getR3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR3_net_open_position() {
		return r3_net_open_position;
	}
	public void setR3_net_open_position(BigDecimal r3_net_open_position) {
		this.r3_net_open_position = r3_net_open_position;
	}
	public BigDecimal getR3_charge_for_directional_risk_15percent_of_net_open_position() {
		return r3_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR3_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r3_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r3_charge_for_directional_risk_15percent_of_net_open_position = r3_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR3_capital_charge_for_directional_risk() {
		return r3_capital_charge_for_directional_risk;
	}
	public void setR3_capital_charge_for_directional_risk(BigDecimal r3_capital_charge_for_directional_risk) {
		this.r3_capital_charge_for_directional_risk = r3_capital_charge_for_directional_risk;
	}
	public BigDecimal getR3_total_capital_charge_by_commodity() {
		return r3_total_capital_charge_by_commodity;
	}
	public void setR3_total_capital_charge_by_commodity(BigDecimal r3_total_capital_charge_by_commodity) {
		this.r3_total_capital_charge_by_commodity = r3_total_capital_charge_by_commodity;
	}
	public String getR4_product() {
		return r4_product;
	}
	public void setR4_product(String r4_product) {
		this.r4_product = r4_product;
	}
	public BigDecimal getR4_total_long_position() {
		return r4_total_long_position;
	}
	public void setR4_total_long_position(BigDecimal r4_total_long_position) {
		this.r4_total_long_position = r4_total_long_position;
	}
	public BigDecimal getR4_total_short_position() {
		return r4_total_short_position;
	}
	public void setR4_total_short_position(BigDecimal r4_total_short_position) {
		this.r4_total_short_position = r4_total_short_position;
	}
	public BigDecimal getR4_gross_open_position() {
		return r4_gross_open_position;
	}
	public void setR4_gross_open_position(BigDecimal r4_gross_open_position) {
		this.r4_gross_open_position = r4_gross_open_position;
	}
	public BigDecimal getR4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR4_net_open_position() {
		return r4_net_open_position;
	}
	public void setR4_net_open_position(BigDecimal r4_net_open_position) {
		this.r4_net_open_position = r4_net_open_position;
	}
	public BigDecimal getR4_charge_for_directional_risk_15percent_of_net_open_position() {
		return r4_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR4_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r4_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r4_charge_for_directional_risk_15percent_of_net_open_position = r4_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR4_capital_charge_for_directional_risk() {
		return r4_capital_charge_for_directional_risk;
	}
	public void setR4_capital_charge_for_directional_risk(BigDecimal r4_capital_charge_for_directional_risk) {
		this.r4_capital_charge_for_directional_risk = r4_capital_charge_for_directional_risk;
	}
	public BigDecimal getR4_total_capital_charge_by_commodity() {
		return r4_total_capital_charge_by_commodity;
	}
	public void setR4_total_capital_charge_by_commodity(BigDecimal r4_total_capital_charge_by_commodity) {
		this.r4_total_capital_charge_by_commodity = r4_total_capital_charge_by_commodity;
	}
	public String getR5_product() {
		return r5_product;
	}
	public void setR5_product(String r5_product) {
		this.r5_product = r5_product;
	}
	public BigDecimal getR5_total_long_position() {
		return r5_total_long_position;
	}
	public void setR5_total_long_position(BigDecimal r5_total_long_position) {
		this.r5_total_long_position = r5_total_long_position;
	}
	public BigDecimal getR5_total_short_position() {
		return r5_total_short_position;
	}
	public void setR5_total_short_position(BigDecimal r5_total_short_position) {
		this.r5_total_short_position = r5_total_short_position;
	}
	public BigDecimal getR5_gross_open_position() {
		return r5_gross_open_position;
	}
	public void setR5_gross_open_position(BigDecimal r5_gross_open_position) {
		this.r5_gross_open_position = r5_gross_open_position;
	}
	public BigDecimal getR5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR5_net_open_position() {
		return r5_net_open_position;
	}
	public void setR5_net_open_position(BigDecimal r5_net_open_position) {
		this.r5_net_open_position = r5_net_open_position;
	}
	public BigDecimal getR5_charge_for_directional_risk_15percent_of_net_open_position() {
		return r5_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR5_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r5_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r5_charge_for_directional_risk_15percent_of_net_open_position = r5_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR5_capital_charge_for_directional_risk() {
		return r5_capital_charge_for_directional_risk;
	}
	public void setR5_capital_charge_for_directional_risk(BigDecimal r5_capital_charge_for_directional_risk) {
		this.r5_capital_charge_for_directional_risk = r5_capital_charge_for_directional_risk;
	}
	public BigDecimal getR5_total_capital_charge_by_commodity() {
		return r5_total_capital_charge_by_commodity;
	}
	public void setR5_total_capital_charge_by_commodity(BigDecimal r5_total_capital_charge_by_commodity) {
		this.r5_total_capital_charge_by_commodity = r5_total_capital_charge_by_commodity;
	}
	public String getR6_product() {
		return r6_product;
	}
	public void setR6_product(String r6_product) {
		this.r6_product = r6_product;
	}
	public BigDecimal getR6_total_long_position() {
		return r6_total_long_position;
	}
	public void setR6_total_long_position(BigDecimal r6_total_long_position) {
		this.r6_total_long_position = r6_total_long_position;
	}
	public BigDecimal getR6_total_short_position() {
		return r6_total_short_position;
	}
	public void setR6_total_short_position(BigDecimal r6_total_short_position) {
		this.r6_total_short_position = r6_total_short_position;
	}
	public BigDecimal getR6_gross_open_position() {
		return r6_gross_open_position;
	}
	public void setR6_gross_open_position(BigDecimal r6_gross_open_position) {
		this.r6_gross_open_position = r6_gross_open_position;
	}
	public BigDecimal getR6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR6_net_open_position() {
		return r6_net_open_position;
	}
	public void setR6_net_open_position(BigDecimal r6_net_open_position) {
		this.r6_net_open_position = r6_net_open_position;
	}
	public BigDecimal getR6_charge_for_directional_risk_15percent_of_net_open_position() {
		return r6_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR6_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r6_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r6_charge_for_directional_risk_15percent_of_net_open_position = r6_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR6_capital_charge_for_directional_risk() {
		return r6_capital_charge_for_directional_risk;
	}
	public void setR6_capital_charge_for_directional_risk(BigDecimal r6_capital_charge_for_directional_risk) {
		this.r6_capital_charge_for_directional_risk = r6_capital_charge_for_directional_risk;
	}
	public BigDecimal getR6_total_capital_charge_by_commodity() {
		return r6_total_capital_charge_by_commodity;
	}
	public void setR6_total_capital_charge_by_commodity(BigDecimal r6_total_capital_charge_by_commodity) {
		this.r6_total_capital_charge_by_commodity = r6_total_capital_charge_by_commodity;
	}
	public String getR7_product() {
		return r7_product;
	}
	public void setR7_product(String r7_product) {
		this.r7_product = r7_product;
	}
	public BigDecimal getR7_total_long_position() {
		return r7_total_long_position;
	}
	public void setR7_total_long_position(BigDecimal r7_total_long_position) {
		this.r7_total_long_position = r7_total_long_position;
	}
	public BigDecimal getR7_total_short_position() {
		return r7_total_short_position;
	}
	public void setR7_total_short_position(BigDecimal r7_total_short_position) {
		this.r7_total_short_position = r7_total_short_position;
	}
	public BigDecimal getR7_gross_open_position() {
		return r7_gross_open_position;
	}
	public void setR7_gross_open_position(BigDecimal r7_gross_open_position) {
		this.r7_gross_open_position = r7_gross_open_position;
	}
	public BigDecimal getR7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR7_net_open_position() {
		return r7_net_open_position;
	}
	public void setR7_net_open_position(BigDecimal r7_net_open_position) {
		this.r7_net_open_position = r7_net_open_position;
	}
	public BigDecimal getR7_charge_for_directional_risk_15percent_of_net_open_position() {
		return r7_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR7_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r7_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r7_charge_for_directional_risk_15percent_of_net_open_position = r7_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR7_capital_charge_for_directional_risk() {
		return r7_capital_charge_for_directional_risk;
	}
	public void setR7_capital_charge_for_directional_risk(BigDecimal r7_capital_charge_for_directional_risk) {
		this.r7_capital_charge_for_directional_risk = r7_capital_charge_for_directional_risk;
	}
	public BigDecimal getR7_total_capital_charge_by_commodity() {
		return r7_total_capital_charge_by_commodity;
	}
	public void setR7_total_capital_charge_by_commodity(BigDecimal r7_total_capital_charge_by_commodity) {
		this.r7_total_capital_charge_by_commodity = r7_total_capital_charge_by_commodity;
	}
	public String getR8_product() {
		return r8_product;
	}
	public void setR8_product(String r8_product) {
		this.r8_product = r8_product;
	}
	public BigDecimal getR8_total_long_position() {
		return r8_total_long_position;
	}
	public void setR8_total_long_position(BigDecimal r8_total_long_position) {
		this.r8_total_long_position = r8_total_long_position;
	}
	public BigDecimal getR8_total_short_position() {
		return r8_total_short_position;
	}
	public void setR8_total_short_position(BigDecimal r8_total_short_position) {
		this.r8_total_short_position = r8_total_short_position;
	}
	public BigDecimal getR8_gross_open_position() {
		return r8_gross_open_position;
	}
	public void setR8_gross_open_position(BigDecimal r8_gross_open_position) {
		this.r8_gross_open_position = r8_gross_open_position;
	}
	public BigDecimal getR8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position() {
		return r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public void setR8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position(
			BigDecimal r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position) {
		this.r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
	}
	public BigDecimal getR8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk() {
		return r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public void setR8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk(
			BigDecimal r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk) {
		this.r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
	}
	public BigDecimal getR8_net_open_position() {
		return r8_net_open_position;
	}
	public void setR8_net_open_position(BigDecimal r8_net_open_position) {
		this.r8_net_open_position = r8_net_open_position;
	}
	public BigDecimal getR8_charge_for_directional_risk_15percent_of_net_open_position() {
		return r8_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public void setR8_charge_for_directional_risk_15percent_of_net_open_position(
			BigDecimal r8_charge_for_directional_risk_15percent_of_net_open_position) {
		this.r8_charge_for_directional_risk_15percent_of_net_open_position = r8_charge_for_directional_risk_15percent_of_net_open_position;
	}
	public BigDecimal getR8_capital_charge_for_directional_risk() {
		return r8_capital_charge_for_directional_risk;
	}
	public void setR8_capital_charge_for_directional_risk(BigDecimal r8_capital_charge_for_directional_risk) {
		this.r8_capital_charge_for_directional_risk = r8_capital_charge_for_directional_risk;
	}
	public BigDecimal getR8_total_capital_charge_by_commodity() {
		return r8_total_capital_charge_by_commodity;
	}
	public void setR8_total_capital_charge_by_commodity(BigDecimal r8_total_capital_charge_by_commodity) {
		this.r8_total_capital_charge_by_commodity = r8_total_capital_charge_by_commodity;
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
	public BRS31_ENTITY(String r1_product, BigDecimal r1_total_long_position, BigDecimal r1_total_short_position,
			BigDecimal r1_gross_open_position,
			BigDecimal r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r1_net_open_position, BigDecimal r1_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r1_capital_charge_for_directional_risk, BigDecimal r1_total_capital_charge_by_commodity,
			String r2_product, BigDecimal r2_total_long_position, BigDecimal r2_total_short_position,
			BigDecimal r2_gross_open_position,
			BigDecimal r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r2_net_open_position, BigDecimal r2_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r2_capital_charge_for_directional_risk, BigDecimal r2_total_capital_charge_by_commodity,
			String r3_product, BigDecimal r3_total_long_position, BigDecimal r3_total_short_position,
			BigDecimal r3_gross_open_position,
			BigDecimal r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r3_net_open_position, BigDecimal r3_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r3_capital_charge_for_directional_risk, BigDecimal r3_total_capital_charge_by_commodity,
			String r4_product, BigDecimal r4_total_long_position, BigDecimal r4_total_short_position,
			BigDecimal r4_gross_open_position,
			BigDecimal r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r4_net_open_position, BigDecimal r4_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r4_capital_charge_for_directional_risk, BigDecimal r4_total_capital_charge_by_commodity,
			String r5_product, BigDecimal r5_total_long_position, BigDecimal r5_total_short_position,
			BigDecimal r5_gross_open_position,
			BigDecimal r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r5_net_open_position, BigDecimal r5_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r5_capital_charge_for_directional_risk, BigDecimal r5_total_capital_charge_by_commodity,
			String r6_product, BigDecimal r6_total_long_position, BigDecimal r6_total_short_position,
			BigDecimal r6_gross_open_position,
			BigDecimal r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r6_net_open_position, BigDecimal r6_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r6_capital_charge_for_directional_risk, BigDecimal r6_total_capital_charge_by_commodity,
			String r7_product, BigDecimal r7_total_long_position, BigDecimal r7_total_short_position,
			BigDecimal r7_gross_open_position,
			BigDecimal r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r7_net_open_position, BigDecimal r7_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r7_capital_charge_for_directional_risk, BigDecimal r7_total_capital_charge_by_commodity,
			String r8_product, BigDecimal r8_total_long_position, BigDecimal r8_total_short_position,
			BigDecimal r8_gross_open_position,
			BigDecimal r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position,
			BigDecimal r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk,
			BigDecimal r8_net_open_position, BigDecimal r8_charge_for_directional_risk_15percent_of_net_open_position,
			BigDecimal r8_capital_charge_for_directional_risk, BigDecimal r8_total_capital_charge_by_commodity,
			Date report_date, Date report_from_date, Date report_to_date, String entity_flg, String modify_flg,
			String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r1_product = r1_product;
		this.r1_total_long_position = r1_total_long_position;
		this.r1_total_short_position = r1_total_short_position;
		this.r1_gross_open_position = r1_gross_open_position;
		this.r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r1_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r1_net_open_position = r1_net_open_position;
		this.r1_charge_for_directional_risk_15percent_of_net_open_position = r1_charge_for_directional_risk_15percent_of_net_open_position;
		this.r1_capital_charge_for_directional_risk = r1_capital_charge_for_directional_risk;
		this.r1_total_capital_charge_by_commodity = r1_total_capital_charge_by_commodity;
		this.r2_product = r2_product;
		this.r2_total_long_position = r2_total_long_position;
		this.r2_total_short_position = r2_total_short_position;
		this.r2_gross_open_position = r2_gross_open_position;
		this.r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r2_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r2_net_open_position = r2_net_open_position;
		this.r2_charge_for_directional_risk_15percent_of_net_open_position = r2_charge_for_directional_risk_15percent_of_net_open_position;
		this.r2_capital_charge_for_directional_risk = r2_capital_charge_for_directional_risk;
		this.r2_total_capital_charge_by_commodity = r2_total_capital_charge_by_commodity;
		this.r3_product = r3_product;
		this.r3_total_long_position = r3_total_long_position;
		this.r3_total_short_position = r3_total_short_position;
		this.r3_gross_open_position = r3_gross_open_position;
		this.r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r3_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r3_net_open_position = r3_net_open_position;
		this.r3_charge_for_directional_risk_15percent_of_net_open_position = r3_charge_for_directional_risk_15percent_of_net_open_position;
		this.r3_capital_charge_for_directional_risk = r3_capital_charge_for_directional_risk;
		this.r3_total_capital_charge_by_commodity = r3_total_capital_charge_by_commodity;
		this.r4_product = r4_product;
		this.r4_total_long_position = r4_total_long_position;
		this.r4_total_short_position = r4_total_short_position;
		this.r4_gross_open_position = r4_gross_open_position;
		this.r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r4_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r4_net_open_position = r4_net_open_position;
		this.r4_charge_for_directional_risk_15percent_of_net_open_position = r4_charge_for_directional_risk_15percent_of_net_open_position;
		this.r4_capital_charge_for_directional_risk = r4_capital_charge_for_directional_risk;
		this.r4_total_capital_charge_by_commodity = r4_total_capital_charge_by_commodity;
		this.r5_product = r5_product;
		this.r5_total_long_position = r5_total_long_position;
		this.r5_total_short_position = r5_total_short_position;
		this.r5_gross_open_position = r5_gross_open_position;
		this.r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r5_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r5_net_open_position = r5_net_open_position;
		this.r5_charge_for_directional_risk_15percent_of_net_open_position = r5_charge_for_directional_risk_15percent_of_net_open_position;
		this.r5_capital_charge_for_directional_risk = r5_capital_charge_for_directional_risk;
		this.r5_total_capital_charge_by_commodity = r5_total_capital_charge_by_commodity;
		this.r6_product = r6_product;
		this.r6_total_long_position = r6_total_long_position;
		this.r6_total_short_position = r6_total_short_position;
		this.r6_gross_open_position = r6_gross_open_position;
		this.r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r6_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r6_net_open_position = r6_net_open_position;
		this.r6_charge_for_directional_risk_15percent_of_net_open_position = r6_charge_for_directional_risk_15percent_of_net_open_position;
		this.r6_capital_charge_for_directional_risk = r6_capital_charge_for_directional_risk;
		this.r6_total_capital_charge_by_commodity = r6_total_capital_charge_by_commodity;
		this.r7_product = r7_product;
		this.r7_total_long_position = r7_total_long_position;
		this.r7_total_short_position = r7_total_short_position;
		this.r7_gross_open_position = r7_gross_open_position;
		this.r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r7_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r7_net_open_position = r7_net_open_position;
		this.r7_charge_for_directional_risk_15percent_of_net_open_position = r7_charge_for_directional_risk_15percent_of_net_open_position;
		this.r7_capital_charge_for_directional_risk = r7_capital_charge_for_directional_risk;
		this.r7_total_capital_charge_by_commodity = r7_total_capital_charge_by_commodity;
		this.r8_product = r8_product;
		this.r8_total_long_position = r8_total_long_position;
		this.r8_total_short_position = r8_total_short_position;
		this.r8_gross_open_position = r8_gross_open_position;
		this.r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position = r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk_3_percent_of_gross_position;
		this.r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk = r8_charge_for_basis_risk_interest_rate_risk_and_forward_gap_risk;
		this.r8_net_open_position = r8_net_open_position;
		this.r8_charge_for_directional_risk_15percent_of_net_open_position = r8_charge_for_directional_risk_15percent_of_net_open_position;
		this.r8_capital_charge_for_directional_risk = r8_capital_charge_for_directional_risk;
		this.r8_total_capital_charge_by_commodity = r8_total_capital_charge_by_commodity;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS31_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

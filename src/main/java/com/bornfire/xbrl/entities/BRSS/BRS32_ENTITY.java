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
@Table(name="M_OPTR")
public class BRS32_ENTITY {
	private BigDecimal	r8_line;
	private String	r8_row1;
	private String	r8_row2;
	private String	r8_row3;
	private BigDecimal	r8_interest_rates;
	private BigDecimal	r8_equities;
	private BigDecimal	r8_foreign_exchange_and_gold;
	private BigDecimal	r8_commodities;
	private BigDecimal	r8_total;
	private BigDecimal	r9_line;
	private String	r9_row1;
	private String	r9_row2;
	private String	r9_row3;
	private BigDecimal	r9_interest_rates;
	private BigDecimal	r9_equities;
	private BigDecimal	r9_foreign_exchange_and_gold;
	private BigDecimal	r9_commodities;
	private BigDecimal	r9_total;
	private BigDecimal	r10_line;
	private String	r10_row1;
	private String	r10_row2;
	private String	r10_row3;
	private BigDecimal	r10_interest_rates;
	private BigDecimal	r10_equities;
	private BigDecimal	r10_foreign_exchange_and_gold;
	private BigDecimal	r10_commodities;
	private BigDecimal	r10_total;
	private BigDecimal	r11_line;
	private String	r11_row1;
	private String	r11_row2;
	private String	r11_row3;
	private BigDecimal	r11_interest_rates;
	private BigDecimal	r11_equities;
	private BigDecimal	r11_foreign_exchange_and_gold;
	private BigDecimal	r11_commodities;
	private BigDecimal	r11_total;
	private BigDecimal	r12_line;
	private String	r12_row1;
	private String	r12_row2;
	private String	r12_row3;
	private BigDecimal	r12_interest_rates;
	private BigDecimal	r12_equities;
	private BigDecimal	r12_foreign_exchange_and_gold;
	private BigDecimal	r12_commodities;
	private BigDecimal	r12_total;
	private BigDecimal	r13_line;
	private String	r13_row1;
	private String	r13_row2;
	private String	r13_row3;
	private BigDecimal	r13_interest_rates;
	private BigDecimal	r13_equities;
	private BigDecimal	r13_foreign_exchange_and_gold;
	private BigDecimal	r13_commodities;
	private BigDecimal	r13_total;
	private BigDecimal	r14_line;
	private String	r14_row1;
	private String	r14_row2;
	private String	r14_row3;
	private BigDecimal	r14_interest_rates;
	private BigDecimal	r14_equities;
	private BigDecimal	r14_foreign_exchange_and_gold;
	private BigDecimal	r14_commodities;
	private BigDecimal	r14_total;
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
	public BigDecimal getR8_line() {
		return r8_line;
	}
	public void setR8_line(BigDecimal r8_line) {
		this.r8_line = r8_line;
	}
	public String getR8_row1() {
		return r8_row1;
	}
	public void setR8_row1(String r8_row1) {
		this.r8_row1 = r8_row1;
	}
	public String getR8_row2() {
		return r8_row2;
	}
	public void setR8_row2(String r8_row2) {
		this.r8_row2 = r8_row2;
	}
	public String getR8_row3() {
		return r8_row3;
	}
	public void setR8_row3(String r8_row3) {
		this.r8_row3 = r8_row3;
	}
	public BigDecimal getR8_interest_rates() {
		return r8_interest_rates;
	}
	public void setR8_interest_rates(BigDecimal r8_interest_rates) {
		this.r8_interest_rates = r8_interest_rates;
	}
	public BigDecimal getR8_equities() {
		return r8_equities;
	}
	public void setR8_equities(BigDecimal r8_equities) {
		this.r8_equities = r8_equities;
	}
	public BigDecimal getR8_foreign_exchange_and_gold() {
		return r8_foreign_exchange_and_gold;
	}
	public void setR8_foreign_exchange_and_gold(BigDecimal r8_foreign_exchange_and_gold) {
		this.r8_foreign_exchange_and_gold = r8_foreign_exchange_and_gold;
	}
	public BigDecimal getR8_commodities() {
		return r8_commodities;
	}
	public void setR8_commodities(BigDecimal r8_commodities) {
		this.r8_commodities = r8_commodities;
	}
	public BigDecimal getR8_total() {
		return r8_total;
	}
	public void setR8_total(BigDecimal r8_total) {
		this.r8_total = r8_total;
	}
	public BigDecimal getR9_line() {
		return r9_line;
	}
	public void setR9_line(BigDecimal r9_line) {
		this.r9_line = r9_line;
	}
	public String getR9_row1() {
		return r9_row1;
	}
	public void setR9_row1(String r9_row1) {
		this.r9_row1 = r9_row1;
	}
	public String getR9_row2() {
		return r9_row2;
	}
	public void setR9_row2(String r9_row2) {
		this.r9_row2 = r9_row2;
	}
	public String getR9_row3() {
		return r9_row3;
	}
	public void setR9_row3(String r9_row3) {
		this.r9_row3 = r9_row3;
	}
	public BigDecimal getR9_interest_rates() {
		return r9_interest_rates;
	}
	public void setR9_interest_rates(BigDecimal r9_interest_rates) {
		this.r9_interest_rates = r9_interest_rates;
	}
	public BigDecimal getR9_equities() {
		return r9_equities;
	}
	public void setR9_equities(BigDecimal r9_equities) {
		this.r9_equities = r9_equities;
	}
	public BigDecimal getR9_foreign_exchange_and_gold() {
		return r9_foreign_exchange_and_gold;
	}
	public void setR9_foreign_exchange_and_gold(BigDecimal r9_foreign_exchange_and_gold) {
		this.r9_foreign_exchange_and_gold = r9_foreign_exchange_and_gold;
	}
	public BigDecimal getR9_commodities() {
		return r9_commodities;
	}
	public void setR9_commodities(BigDecimal r9_commodities) {
		this.r9_commodities = r9_commodities;
	}
	public BigDecimal getR9_total() {
		return r9_total;
	}
	public void setR9_total(BigDecimal r9_total) {
		this.r9_total = r9_total;
	}
	public BigDecimal getR10_line() {
		return r10_line;
	}
	public void setR10_line(BigDecimal r10_line) {
		this.r10_line = r10_line;
	}
	public String getR10_row1() {
		return r10_row1;
	}
	public void setR10_row1(String r10_row1) {
		this.r10_row1 = r10_row1;
	}
	public String getR10_row2() {
		return r10_row2;
	}
	public void setR10_row2(String r10_row2) {
		this.r10_row2 = r10_row2;
	}
	public String getR10_row3() {
		return r10_row3;
	}
	public void setR10_row3(String r10_row3) {
		this.r10_row3 = r10_row3;
	}
	public BigDecimal getR10_interest_rates() {
		return r10_interest_rates;
	}
	public void setR10_interest_rates(BigDecimal r10_interest_rates) {
		this.r10_interest_rates = r10_interest_rates;
	}
	public BigDecimal getR10_equities() {
		return r10_equities;
	}
	public void setR10_equities(BigDecimal r10_equities) {
		this.r10_equities = r10_equities;
	}
	public BigDecimal getR10_foreign_exchange_and_gold() {
		return r10_foreign_exchange_and_gold;
	}
	public void setR10_foreign_exchange_and_gold(BigDecimal r10_foreign_exchange_and_gold) {
		this.r10_foreign_exchange_and_gold = r10_foreign_exchange_and_gold;
	}
	public BigDecimal getR10_commodities() {
		return r10_commodities;
	}
	public void setR10_commodities(BigDecimal r10_commodities) {
		this.r10_commodities = r10_commodities;
	}
	public BigDecimal getR10_total() {
		return r10_total;
	}
	public void setR10_total(BigDecimal r10_total) {
		this.r10_total = r10_total;
	}
	public BigDecimal getR11_line() {
		return r11_line;
	}
	public void setR11_line(BigDecimal r11_line) {
		this.r11_line = r11_line;
	}
	public String getR11_row1() {
		return r11_row1;
	}
	public void setR11_row1(String r11_row1) {
		this.r11_row1 = r11_row1;
	}
	public String getR11_row2() {
		return r11_row2;
	}
	public void setR11_row2(String r11_row2) {
		this.r11_row2 = r11_row2;
	}
	public String getR11_row3() {
		return r11_row3;
	}
	public void setR11_row3(String r11_row3) {
		this.r11_row3 = r11_row3;
	}
	public BigDecimal getR11_interest_rates() {
		return r11_interest_rates;
	}
	public void setR11_interest_rates(BigDecimal r11_interest_rates) {
		this.r11_interest_rates = r11_interest_rates;
	}
	public BigDecimal getR11_equities() {
		return r11_equities;
	}
	public void setR11_equities(BigDecimal r11_equities) {
		this.r11_equities = r11_equities;
	}
	public BigDecimal getR11_foreign_exchange_and_gold() {
		return r11_foreign_exchange_and_gold;
	}
	public void setR11_foreign_exchange_and_gold(BigDecimal r11_foreign_exchange_and_gold) {
		this.r11_foreign_exchange_and_gold = r11_foreign_exchange_and_gold;
	}
	public BigDecimal getR11_commodities() {
		return r11_commodities;
	}
	public void setR11_commodities(BigDecimal r11_commodities) {
		this.r11_commodities = r11_commodities;
	}
	public BigDecimal getR11_total() {
		return r11_total;
	}
	public void setR11_total(BigDecimal r11_total) {
		this.r11_total = r11_total;
	}
	public BigDecimal getR12_line() {
		return r12_line;
	}
	public void setR12_line(BigDecimal r12_line) {
		this.r12_line = r12_line;
	}
	public String getR12_row1() {
		return r12_row1;
	}
	public void setR12_row1(String r12_row1) {
		this.r12_row1 = r12_row1;
	}
	public String getR12_row2() {
		return r12_row2;
	}
	public void setR12_row2(String r12_row2) {
		this.r12_row2 = r12_row2;
	}
	public String getR12_row3() {
		return r12_row3;
	}
	public void setR12_row3(String r12_row3) {
		this.r12_row3 = r12_row3;
	}
	public BigDecimal getR12_interest_rates() {
		return r12_interest_rates;
	}
	public void setR12_interest_rates(BigDecimal r12_interest_rates) {
		this.r12_interest_rates = r12_interest_rates;
	}
	public BigDecimal getR12_equities() {
		return r12_equities;
	}
	public void setR12_equities(BigDecimal r12_equities) {
		this.r12_equities = r12_equities;
	}
	public BigDecimal getR12_foreign_exchange_and_gold() {
		return r12_foreign_exchange_and_gold;
	}
	public void setR12_foreign_exchange_and_gold(BigDecimal r12_foreign_exchange_and_gold) {
		this.r12_foreign_exchange_and_gold = r12_foreign_exchange_and_gold;
	}
	public BigDecimal getR12_commodities() {
		return r12_commodities;
	}
	public void setR12_commodities(BigDecimal r12_commodities) {
		this.r12_commodities = r12_commodities;
	}
	public BigDecimal getR12_total() {
		return r12_total;
	}
	public void setR12_total(BigDecimal r12_total) {
		this.r12_total = r12_total;
	}
	public BigDecimal getR13_line() {
		return r13_line;
	}
	public void setR13_line(BigDecimal r13_line) {
		this.r13_line = r13_line;
	}
	public String getR13_row1() {
		return r13_row1;
	}
	public void setR13_row1(String r13_row1) {
		this.r13_row1 = r13_row1;
	}
	public String getR13_row2() {
		return r13_row2;
	}
	public void setR13_row2(String r13_row2) {
		this.r13_row2 = r13_row2;
	}
	public String getR13_row3() {
		return r13_row3;
	}
	public void setR13_row3(String r13_row3) {
		this.r13_row3 = r13_row3;
	}
	public BigDecimal getR13_interest_rates() {
		return r13_interest_rates;
	}
	public void setR13_interest_rates(BigDecimal r13_interest_rates) {
		this.r13_interest_rates = r13_interest_rates;
	}
	public BigDecimal getR13_equities() {
		return r13_equities;
	}
	public void setR13_equities(BigDecimal r13_equities) {
		this.r13_equities = r13_equities;
	}
	public BigDecimal getR13_foreign_exchange_and_gold() {
		return r13_foreign_exchange_and_gold;
	}
	public void setR13_foreign_exchange_and_gold(BigDecimal r13_foreign_exchange_and_gold) {
		this.r13_foreign_exchange_and_gold = r13_foreign_exchange_and_gold;
	}
	public BigDecimal getR13_commodities() {
		return r13_commodities;
	}
	public void setR13_commodities(BigDecimal r13_commodities) {
		this.r13_commodities = r13_commodities;
	}
	public BigDecimal getR13_total() {
		return r13_total;
	}
	public void setR13_total(BigDecimal r13_total) {
		this.r13_total = r13_total;
	}
	public BigDecimal getR14_line() {
		return r14_line;
	}
	public void setR14_line(BigDecimal r14_line) {
		this.r14_line = r14_line;
	}
	public String getR14_row1() {
		return r14_row1;
	}
	public void setR14_row1(String r14_row1) {
		this.r14_row1 = r14_row1;
	}
	public String getR14_row2() {
		return r14_row2;
	}
	public void setR14_row2(String r14_row2) {
		this.r14_row2 = r14_row2;
	}
	public String getR14_row3() {
		return r14_row3;
	}
	public void setR14_row3(String r14_row3) {
		this.r14_row3 = r14_row3;
	}
	public BigDecimal getR14_interest_rates() {
		return r14_interest_rates;
	}
	public void setR14_interest_rates(BigDecimal r14_interest_rates) {
		this.r14_interest_rates = r14_interest_rates;
	}
	public BigDecimal getR14_equities() {
		return r14_equities;
	}
	public void setR14_equities(BigDecimal r14_equities) {
		this.r14_equities = r14_equities;
	}
	public BigDecimal getR14_foreign_exchange_and_gold() {
		return r14_foreign_exchange_and_gold;
	}
	public void setR14_foreign_exchange_and_gold(BigDecimal r14_foreign_exchange_and_gold) {
		this.r14_foreign_exchange_and_gold = r14_foreign_exchange_and_gold;
	}
	public BigDecimal getR14_commodities() {
		return r14_commodities;
	}
	public void setR14_commodities(BigDecimal r14_commodities) {
		this.r14_commodities = r14_commodities;
	}
	public BigDecimal getR14_total() {
		return r14_total;
	}
	public void setR14_total(BigDecimal r14_total) {
		this.r14_total = r14_total;
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
		return "BRS32_ENTITY [r8_line=" + r8_line + ", r8_row1=" + r8_row1 + ", r8_row2=" + r8_row2 + ", r8_row3="
				+ r8_row3 + ", r8_interest_rates=" + r8_interest_rates + ", r8_equities=" + r8_equities
				+ ", r8_foreign_exchange_and_gold=" + r8_foreign_exchange_and_gold + ", r8_commodities="
				+ r8_commodities + ", r8_total=" + r8_total + ", r9_line=" + r9_line + ", r9_row1=" + r9_row1
				+ ", r9_row2=" + r9_row2 + ", r9_row3=" + r9_row3 + ", r9_interest_rates=" + r9_interest_rates
				+ ", r9_equities=" + r9_equities + ", r9_foreign_exchange_and_gold=" + r9_foreign_exchange_and_gold
				+ ", r9_commodities=" + r9_commodities + ", r9_total=" + r9_total + ", r10_line=" + r10_line
				+ ", r10_row1=" + r10_row1 + ", r10_row2=" + r10_row2 + ", r10_row3=" + r10_row3
				+ ", r10_interest_rates=" + r10_interest_rates + ", r10_equities=" + r10_equities
				+ ", r10_foreign_exchange_and_gold=" + r10_foreign_exchange_and_gold + ", r10_commodities="
				+ r10_commodities + ", r10_total=" + r10_total + ", r11_line=" + r11_line + ", r11_row1=" + r11_row1
				+ ", r11_row2=" + r11_row2 + ", r11_row3=" + r11_row3 + ", r11_interest_rates=" + r11_interest_rates
				+ ", r11_equities=" + r11_equities + ", r11_foreign_exchange_and_gold=" + r11_foreign_exchange_and_gold
				+ ", r11_commodities=" + r11_commodities + ", r11_total=" + r11_total + ", r12_line=" + r12_line
				+ ", r12_row1=" + r12_row1 + ", r12_row2=" + r12_row2 + ", r12_row3=" + r12_row3
				+ ", r12_interest_rates=" + r12_interest_rates + ", r12_equities=" + r12_equities
				+ ", r12_foreign_exchange_and_gold=" + r12_foreign_exchange_and_gold + ", r12_commodities="
				+ r12_commodities + ", r12_total=" + r12_total + ", r13_line=" + r13_line + ", r13_row1=" + r13_row1
				+ ", r13_row2=" + r13_row2 + ", r13_row3=" + r13_row3 + ", r13_interest_rates=" + r13_interest_rates
				+ ", r13_equities=" + r13_equities + ", r13_foreign_exchange_and_gold=" + r13_foreign_exchange_and_gold
				+ ", r13_commodities=" + r13_commodities + ", r13_total=" + r13_total + ", r14_line=" + r14_line
				+ ", r14_row1=" + r14_row1 + ", r14_row2=" + r14_row2 + ", r14_row3=" + r14_row3
				+ ", r14_interest_rates=" + r14_interest_rates + ", r14_equities=" + r14_equities
				+ ", r14_foreign_exchange_and_gold=" + r14_foreign_exchange_and_gold + ", r14_commodities="
				+ r14_commodities + ", r14_total=" + r14_total + ", report_date=" + report_date + ", report_from_date="
				+ report_from_date + ", report_to_date=" + report_to_date + ", entity_flg=" + entity_flg
				+ ", modify_flg=" + modify_flg + ", del_flg=" + del_flg + ", report_code=" + report_code
				+ ", report_submit_date=" + report_submit_date + ", getR8_line()=" + getR8_line() + ", getR8_row1()="
				+ getR8_row1() + ", getR8_row2()=" + getR8_row2() + ", getR8_row3()=" + getR8_row3()
				+ ", getR8_interest_rates()=" + getR8_interest_rates() + ", getR8_equities()=" + getR8_equities()
				+ ", getR8_foreign_exchange_and_gold()=" + getR8_foreign_exchange_and_gold() + ", getR8_commodities()="
				+ getR8_commodities() + ", getR8_total()=" + getR8_total() + ", getR9_line()=" + getR9_line()
				+ ", getR9_row1()=" + getR9_row1() + ", getR9_row2()=" + getR9_row2() + ", getR9_row3()=" + getR9_row3()
				+ ", getR9_interest_rates()=" + getR9_interest_rates() + ", getR9_equities()=" + getR9_equities()
				+ ", getR9_foreign_exchange_and_gold()=" + getR9_foreign_exchange_and_gold() + ", getR9_commodities()="
				+ getR9_commodities() + ", getR9_total()=" + getR9_total() + ", getR10_line()=" + getR10_line()
				+ ", getR10_row1()=" + getR10_row1() + ", getR10_row2()=" + getR10_row2() + ", getR10_row3()="
				+ getR10_row3() + ", getR10_interest_rates()=" + getR10_interest_rates() + ", getR10_equities()="
				+ getR10_equities() + ", getR10_foreign_exchange_and_gold()=" + getR10_foreign_exchange_and_gold()
				+ ", getR10_commodities()=" + getR10_commodities() + ", getR10_total()=" + getR10_total()
				+ ", getR11_line()=" + getR11_line() + ", getR11_row1()=" + getR11_row1() + ", getR11_row2()="
				+ getR11_row2() + ", getR11_row3()=" + getR11_row3() + ", getR11_interest_rates()="
				+ getR11_interest_rates() + ", getR11_equities()=" + getR11_equities()
				+ ", getR11_foreign_exchange_and_gold()=" + getR11_foreign_exchange_and_gold()
				+ ", getR11_commodities()=" + getR11_commodities() + ", getR11_total()=" + getR11_total()
				+ ", getR12_line()=" + getR12_line() + ", getR12_row1()=" + getR12_row1() + ", getR12_row2()="
				+ getR12_row2() + ", getR12_row3()=" + getR12_row3() + ", getR12_interest_rates()="
				+ getR12_interest_rates() + ", getR12_equities()=" + getR12_equities()
				+ ", getR12_foreign_exchange_and_gold()=" + getR12_foreign_exchange_and_gold()
				+ ", getR12_commodities()=" + getR12_commodities() + ", getR12_total()=" + getR12_total()
				+ ", getR13_line()=" + getR13_line() + ", getR13_row1()=" + getR13_row1() + ", getR13_row2()="
				+ getR13_row2() + ", getR13_row3()=" + getR13_row3() + ", getR13_interest_rates()="
				+ getR13_interest_rates() + ", getR13_equities()=" + getR13_equities()
				+ ", getR13_foreign_exchange_and_gold()=" + getR13_foreign_exchange_and_gold()
				+ ", getR13_commodities()=" + getR13_commodities() + ", getR13_total()=" + getR13_total()
				+ ", getR14_line()=" + getR14_line() + ", getR14_row1()=" + getR14_row1() + ", getR14_row2()="
				+ getR14_row2() + ", getR14_row3()=" + getR14_row3() + ", getR14_interest_rates()="
				+ getR14_interest_rates() + ", getR14_equities()=" + getR14_equities()
				+ ", getR14_foreign_exchange_and_gold()=" + getR14_foreign_exchange_and_gold()
				+ ", getR14_commodities()=" + getR14_commodities() + ", getR14_total()=" + getR14_total()
				+ ", getReport_date()=" + getReport_date() + ", getReport_from_date()=" + getReport_from_date()
				+ ", getReport_to_date()=" + getReport_to_date() + ", getEntity_flg()=" + getEntity_flg()
				+ ", getModify_flg()=" + getModify_flg() + ", getDel_flg()=" + getDel_flg() + ", getReport_code()="
				+ getReport_code() + ", getReport_submit_date()=" + getReport_submit_date() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS32_ENTITY(BigDecimal r8_line, String r8_row1, String r8_row2, String r8_row3,
			BigDecimal r8_interest_rates, BigDecimal r8_equities, BigDecimal r8_foreign_exchange_and_gold,
			BigDecimal r8_commodities, BigDecimal r8_total, BigDecimal r9_line, String r9_row1, String r9_row2,
			String r9_row3, BigDecimal r9_interest_rates, BigDecimal r9_equities,
			BigDecimal r9_foreign_exchange_and_gold, BigDecimal r9_commodities, BigDecimal r9_total,
			BigDecimal r10_line, String r10_row1, String r10_row2, String r10_row3, BigDecimal r10_interest_rates,
			BigDecimal r10_equities, BigDecimal r10_foreign_exchange_and_gold, BigDecimal r10_commodities,
			BigDecimal r10_total, BigDecimal r11_line, String r11_row1, String r11_row2, String r11_row3,
			BigDecimal r11_interest_rates, BigDecimal r11_equities, BigDecimal r11_foreign_exchange_and_gold,
			BigDecimal r11_commodities, BigDecimal r11_total, BigDecimal r12_line, String r12_row1, String r12_row2,
			String r12_row3, BigDecimal r12_interest_rates, BigDecimal r12_equities,
			BigDecimal r12_foreign_exchange_and_gold, BigDecimal r12_commodities, BigDecimal r12_total,
			BigDecimal r13_line, String r13_row1, String r13_row2, String r13_row3, BigDecimal r13_interest_rates,
			BigDecimal r13_equities, BigDecimal r13_foreign_exchange_and_gold, BigDecimal r13_commodities,
			BigDecimal r13_total, BigDecimal r14_line, String r14_row1, String r14_row2, String r14_row3,
			BigDecimal r14_interest_rates, BigDecimal r14_equities, BigDecimal r14_foreign_exchange_and_gold,
			BigDecimal r14_commodities, BigDecimal r14_total, Date report_date, Date report_from_date,
			Date report_to_date, String entity_flg, String modify_flg, String del_flg, String report_code,
			Date report_submit_date) {
		super();
		this.r8_line = r8_line;
		this.r8_row1 = r8_row1;
		this.r8_row2 = r8_row2;
		this.r8_row3 = r8_row3;
		this.r8_interest_rates = r8_interest_rates;
		this.r8_equities = r8_equities;
		this.r8_foreign_exchange_and_gold = r8_foreign_exchange_and_gold;
		this.r8_commodities = r8_commodities;
		this.r8_total = r8_total;
		this.r9_line = r9_line;
		this.r9_row1 = r9_row1;
		this.r9_row2 = r9_row2;
		this.r9_row3 = r9_row3;
		this.r9_interest_rates = r9_interest_rates;
		this.r9_equities = r9_equities;
		this.r9_foreign_exchange_and_gold = r9_foreign_exchange_and_gold;
		this.r9_commodities = r9_commodities;
		this.r9_total = r9_total;
		this.r10_line = r10_line;
		this.r10_row1 = r10_row1;
		this.r10_row2 = r10_row2;
		this.r10_row3 = r10_row3;
		this.r10_interest_rates = r10_interest_rates;
		this.r10_equities = r10_equities;
		this.r10_foreign_exchange_and_gold = r10_foreign_exchange_and_gold;
		this.r10_commodities = r10_commodities;
		this.r10_total = r10_total;
		this.r11_line = r11_line;
		this.r11_row1 = r11_row1;
		this.r11_row2 = r11_row2;
		this.r11_row3 = r11_row3;
		this.r11_interest_rates = r11_interest_rates;
		this.r11_equities = r11_equities;
		this.r11_foreign_exchange_and_gold = r11_foreign_exchange_and_gold;
		this.r11_commodities = r11_commodities;
		this.r11_total = r11_total;
		this.r12_line = r12_line;
		this.r12_row1 = r12_row1;
		this.r12_row2 = r12_row2;
		this.r12_row3 = r12_row3;
		this.r12_interest_rates = r12_interest_rates;
		this.r12_equities = r12_equities;
		this.r12_foreign_exchange_and_gold = r12_foreign_exchange_and_gold;
		this.r12_commodities = r12_commodities;
		this.r12_total = r12_total;
		this.r13_line = r13_line;
		this.r13_row1 = r13_row1;
		this.r13_row2 = r13_row2;
		this.r13_row3 = r13_row3;
		this.r13_interest_rates = r13_interest_rates;
		this.r13_equities = r13_equities;
		this.r13_foreign_exchange_and_gold = r13_foreign_exchange_and_gold;
		this.r13_commodities = r13_commodities;
		this.r13_total = r13_total;
		this.r14_line = r14_line;
		this.r14_row1 = r14_row1;
		this.r14_row2 = r14_row2;
		this.r14_row3 = r14_row3;
		this.r14_interest_rates = r14_interest_rates;
		this.r14_equities = r14_equities;
		this.r14_foreign_exchange_and_gold = r14_foreign_exchange_and_gold;
		this.r14_commodities = r14_commodities;
		this.r14_total = r14_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS32_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

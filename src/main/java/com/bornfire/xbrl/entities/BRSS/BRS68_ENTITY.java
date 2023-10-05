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
@Table(name="BRS_68")
public class BRS68_ENTITY {
	private String	r9_product;
	private BigDecimal	r9_local;
	private BigDecimal	r9_expatriates;
	private BigDecimal	r9_total;
	private String	r10_product;
	private BigDecimal	r10_local;
	private BigDecimal	r10_expatriates;
	private BigDecimal	r10_total;
	private String	r11_product;
	private BigDecimal	r11_local;
	private BigDecimal	r11_expatriates;
	private BigDecimal	r11_total;
	private String	r12_product;
	private BigDecimal	r12_local;
	private BigDecimal	r12_expatriates;
	private BigDecimal	r12_total;
	private String	r13_product;
	private BigDecimal	r13_local;
	private BigDecimal	r13_expatriates;
	private BigDecimal	r13_total;
	private String	r14_product;
	private BigDecimal	r14_local;
	private BigDecimal	r14_expatriates;
	private BigDecimal	r14_total;
	private String	r15_product;
	private BigDecimal	r15_local;
	private BigDecimal	r15_expatriates;
	private BigDecimal	r15_total;
	private String	r21_product;
	private BigDecimal	r21_local;
	private BigDecimal	r21_expatriates;
	private BigDecimal	r21_total;
	private String	r22_product;
	private BigDecimal	r22_local;
	private BigDecimal	r22_expatriates;
	private BigDecimal	r22_total;
	private String	r23_product;
	private BigDecimal	r23_local;
	private BigDecimal	r23_expatriates;
	private BigDecimal	r23_total;
	private String	r24_product;
	private BigDecimal	r24_local;
	private BigDecimal	r24_expatriates;
	private BigDecimal	r24_total;
	private String	r25_product;
	private BigDecimal	r25_local;
	private BigDecimal	r25_expatriates;
	private BigDecimal	r25_total;
	private String	r26_product;
	private BigDecimal	r26_local;
	private BigDecimal	r26_expatriates;
	private BigDecimal	r26_total;
	private String	r27_product;
	private BigDecimal	r27_local;
	private BigDecimal	r27_expatriates;
	private BigDecimal	r27_total;
	private String	r28_product;
	private BigDecimal	r28_local;
	private BigDecimal	r28_expatriates;
	private BigDecimal	r28_total;
	private String	r33_product;
	private BigDecimal	r33_original_amount;
	private BigDecimal	r33_balance_outstanding;
	private BigDecimal	r33_no_of_acs;
	private BigDecimal	r33_interest_rates;
	private String	r34_product;
	private BigDecimal	r34_original_amount;
	private BigDecimal	r34_balance_outstanding;
	private BigDecimal	r34_no_of_acs;
	private BigDecimal	r34_interest_rates;
	private String	r35_product;
	private BigDecimal	r35_original_amount;
	private BigDecimal	r35_balance_outstanding;
	private BigDecimal	r35_no_of_acs;
	private BigDecimal	r35_interest_rates;
	private String	r36_product;
	private BigDecimal	r36_original_amount;
	private BigDecimal	r36_balance_outstanding;
	private BigDecimal	r36_no_of_acs;
	private BigDecimal	r36_interest_rates;
	private String	r37_product;
	private BigDecimal	r37_original_amount;
	private BigDecimal	r37_balance_outstanding;
	private BigDecimal	r37_no_of_acs;
	private BigDecimal	r37_interest_rates;
	private String	r38_product;
	private BigDecimal	r38_original_amount;
	private BigDecimal	r38_balance_outstanding;
	private BigDecimal	r38_no_of_acs;
	private BigDecimal	r38_interest_rates;
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
	public BigDecimal getR9_local() {
		return r9_local;
	}
	public void setR9_local(BigDecimal r9_local) {
		this.r9_local = r9_local;
	}
	public BigDecimal getR9_expatriates() {
		return r9_expatriates;
	}
	public void setR9_expatriates(BigDecimal r9_expatriates) {
		this.r9_expatriates = r9_expatriates;
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
	public BigDecimal getR10_local() {
		return r10_local;
	}
	public void setR10_local(BigDecimal r10_local) {
		this.r10_local = r10_local;
	}
	public BigDecimal getR10_expatriates() {
		return r10_expatriates;
	}
	public void setR10_expatriates(BigDecimal r10_expatriates) {
		this.r10_expatriates = r10_expatriates;
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
	public BigDecimal getR11_local() {
		return r11_local;
	}
	public void setR11_local(BigDecimal r11_local) {
		this.r11_local = r11_local;
	}
	public BigDecimal getR11_expatriates() {
		return r11_expatriates;
	}
	public void setR11_expatriates(BigDecimal r11_expatriates) {
		this.r11_expatriates = r11_expatriates;
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
	public BigDecimal getR12_local() {
		return r12_local;
	}
	public void setR12_local(BigDecimal r12_local) {
		this.r12_local = r12_local;
	}
	public BigDecimal getR12_expatriates() {
		return r12_expatriates;
	}
	public void setR12_expatriates(BigDecimal r12_expatriates) {
		this.r12_expatriates = r12_expatriates;
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
	public BigDecimal getR13_local() {
		return r13_local;
	}
	public void setR13_local(BigDecimal r13_local) {
		this.r13_local = r13_local;
	}
	public BigDecimal getR13_expatriates() {
		return r13_expatriates;
	}
	public void setR13_expatriates(BigDecimal r13_expatriates) {
		this.r13_expatriates = r13_expatriates;
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
	public BigDecimal getR14_local() {
		return r14_local;
	}
	public void setR14_local(BigDecimal r14_local) {
		this.r14_local = r14_local;
	}
	public BigDecimal getR14_expatriates() {
		return r14_expatriates;
	}
	public void setR14_expatriates(BigDecimal r14_expatriates) {
		this.r14_expatriates = r14_expatriates;
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
	public BigDecimal getR15_local() {
		return r15_local;
	}
	public void setR15_local(BigDecimal r15_local) {
		this.r15_local = r15_local;
	}
	public BigDecimal getR15_expatriates() {
		return r15_expatriates;
	}
	public void setR15_expatriates(BigDecimal r15_expatriates) {
		this.r15_expatriates = r15_expatriates;
	}
	public BigDecimal getR15_total() {
		return r15_total;
	}
	public void setR15_total(BigDecimal r15_total) {
		this.r15_total = r15_total;
	}
	public String getR21_product() {
		return r21_product;
	}
	public void setR21_product(String r21_product) {
		this.r21_product = r21_product;
	}
	public BigDecimal getR21_local() {
		return r21_local;
	}
	public void setR21_local(BigDecimal r21_local) {
		this.r21_local = r21_local;
	}
	public BigDecimal getR21_expatriates() {
		return r21_expatriates;
	}
	public void setR21_expatriates(BigDecimal r21_expatriates) {
		this.r21_expatriates = r21_expatriates;
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
	public BigDecimal getR22_local() {
		return r22_local;
	}
	public void setR22_local(BigDecimal r22_local) {
		this.r22_local = r22_local;
	}
	public BigDecimal getR22_expatriates() {
		return r22_expatriates;
	}
	public void setR22_expatriates(BigDecimal r22_expatriates) {
		this.r22_expatriates = r22_expatriates;
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
	public BigDecimal getR23_local() {
		return r23_local;
	}
	public void setR23_local(BigDecimal r23_local) {
		this.r23_local = r23_local;
	}
	public BigDecimal getR23_expatriates() {
		return r23_expatriates;
	}
	public void setR23_expatriates(BigDecimal r23_expatriates) {
		this.r23_expatriates = r23_expatriates;
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
	public BigDecimal getR24_local() {
		return r24_local;
	}
	public void setR24_local(BigDecimal r24_local) {
		this.r24_local = r24_local;
	}
	public BigDecimal getR24_expatriates() {
		return r24_expatriates;
	}
	public void setR24_expatriates(BigDecimal r24_expatriates) {
		this.r24_expatriates = r24_expatriates;
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
	public BigDecimal getR25_local() {
		return r25_local;
	}
	public void setR25_local(BigDecimal r25_local) {
		this.r25_local = r25_local;
	}
	public BigDecimal getR25_expatriates() {
		return r25_expatriates;
	}
	public void setR25_expatriates(BigDecimal r25_expatriates) {
		this.r25_expatriates = r25_expatriates;
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
	public BigDecimal getR26_local() {
		return r26_local;
	}
	public void setR26_local(BigDecimal r26_local) {
		this.r26_local = r26_local;
	}
	public BigDecimal getR26_expatriates() {
		return r26_expatriates;
	}
	public void setR26_expatriates(BigDecimal r26_expatriates) {
		this.r26_expatriates = r26_expatriates;
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
	public BigDecimal getR27_local() {
		return r27_local;
	}
	public void setR27_local(BigDecimal r27_local) {
		this.r27_local = r27_local;
	}
	public BigDecimal getR27_expatriates() {
		return r27_expatriates;
	}
	public void setR27_expatriates(BigDecimal r27_expatriates) {
		this.r27_expatriates = r27_expatriates;
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
	public BigDecimal getR28_local() {
		return r28_local;
	}
	public void setR28_local(BigDecimal r28_local) {
		this.r28_local = r28_local;
	}
	public BigDecimal getR28_expatriates() {
		return r28_expatriates;
	}
	public void setR28_expatriates(BigDecimal r28_expatriates) {
		this.r28_expatriates = r28_expatriates;
	}
	public BigDecimal getR28_total() {
		return r28_total;
	}
	public void setR28_total(BigDecimal r28_total) {
		this.r28_total = r28_total;
	}
	public String getR33_product() {
		return r33_product;
	}
	public void setR33_product(String r33_product) {
		this.r33_product = r33_product;
	}
	public BigDecimal getR33_original_amount() {
		return r33_original_amount;
	}
	public void setR33_original_amount(BigDecimal r33_original_amount) {
		this.r33_original_amount = r33_original_amount;
	}
	public BigDecimal getR33_balance_outstanding() {
		return r33_balance_outstanding;
	}
	public void setR33_balance_outstanding(BigDecimal r33_balance_outstanding) {
		this.r33_balance_outstanding = r33_balance_outstanding;
	}
	public BigDecimal getR33_no_of_acs() {
		return r33_no_of_acs;
	}
	public void setR33_no_of_acs(BigDecimal r33_no_of_acs) {
		this.r33_no_of_acs = r33_no_of_acs;
	}
	public BigDecimal getR33_interest_rates() {
		return r33_interest_rates;
	}
	public void setR33_interest_rates(BigDecimal r33_interest_rates) {
		this.r33_interest_rates = r33_interest_rates;
	}
	public String getR34_product() {
		return r34_product;
	}
	public void setR34_product(String r34_product) {
		this.r34_product = r34_product;
	}
	public BigDecimal getR34_original_amount() {
		return r34_original_amount;
	}
	public void setR34_original_amount(BigDecimal r34_original_amount) {
		this.r34_original_amount = r34_original_amount;
	}
	public BigDecimal getR34_balance_outstanding() {
		return r34_balance_outstanding;
	}
	public void setR34_balance_outstanding(BigDecimal r34_balance_outstanding) {
		this.r34_balance_outstanding = r34_balance_outstanding;
	}
	public BigDecimal getR34_no_of_acs() {
		return r34_no_of_acs;
	}
	public void setR34_no_of_acs(BigDecimal r34_no_of_acs) {
		this.r34_no_of_acs = r34_no_of_acs;
	}
	public BigDecimal getR34_interest_rates() {
		return r34_interest_rates;
	}
	public void setR34_interest_rates(BigDecimal r34_interest_rates) {
		this.r34_interest_rates = r34_interest_rates;
	}
	public String getR35_product() {
		return r35_product;
	}
	public void setR35_product(String r35_product) {
		this.r35_product = r35_product;
	}
	public BigDecimal getR35_original_amount() {
		return r35_original_amount;
	}
	public void setR35_original_amount(BigDecimal r35_original_amount) {
		this.r35_original_amount = r35_original_amount;
	}
	public BigDecimal getR35_balance_outstanding() {
		return r35_balance_outstanding;
	}
	public void setR35_balance_outstanding(BigDecimal r35_balance_outstanding) {
		this.r35_balance_outstanding = r35_balance_outstanding;
	}
	public BigDecimal getR35_no_of_acs() {
		return r35_no_of_acs;
	}
	public void setR35_no_of_acs(BigDecimal r35_no_of_acs) {
		this.r35_no_of_acs = r35_no_of_acs;
	}
	public BigDecimal getR35_interest_rates() {
		return r35_interest_rates;
	}
	public void setR35_interest_rates(BigDecimal r35_interest_rates) {
		this.r35_interest_rates = r35_interest_rates;
	}
	public String getR36_product() {
		return r36_product;
	}
	public void setR36_product(String r36_product) {
		this.r36_product = r36_product;
	}
	public BigDecimal getR36_original_amount() {
		return r36_original_amount;
	}
	public void setR36_original_amount(BigDecimal r36_original_amount) {
		this.r36_original_amount = r36_original_amount;
	}
	public BigDecimal getR36_balance_outstanding() {
		return r36_balance_outstanding;
	}
	public void setR36_balance_outstanding(BigDecimal r36_balance_outstanding) {
		this.r36_balance_outstanding = r36_balance_outstanding;
	}
	public BigDecimal getR36_no_of_acs() {
		return r36_no_of_acs;
	}
	public void setR36_no_of_acs(BigDecimal r36_no_of_acs) {
		this.r36_no_of_acs = r36_no_of_acs;
	}
	public BigDecimal getR36_interest_rates() {
		return r36_interest_rates;
	}
	public void setR36_interest_rates(BigDecimal r36_interest_rates) {
		this.r36_interest_rates = r36_interest_rates;
	}
	public String getR37_product() {
		return r37_product;
	}
	public void setR37_product(String r37_product) {
		this.r37_product = r37_product;
	}
	public BigDecimal getR37_original_amount() {
		return r37_original_amount;
	}
	public void setR37_original_amount(BigDecimal r37_original_amount) {
		this.r37_original_amount = r37_original_amount;
	}
	public BigDecimal getR37_balance_outstanding() {
		return r37_balance_outstanding;
	}
	public void setR37_balance_outstanding(BigDecimal r37_balance_outstanding) {
		this.r37_balance_outstanding = r37_balance_outstanding;
	}
	public BigDecimal getR37_no_of_acs() {
		return r37_no_of_acs;
	}
	public void setR37_no_of_acs(BigDecimal r37_no_of_acs) {
		this.r37_no_of_acs = r37_no_of_acs;
	}
	public BigDecimal getR37_interest_rates() {
		return r37_interest_rates;
	}
	public void setR37_interest_rates(BigDecimal r37_interest_rates) {
		this.r37_interest_rates = r37_interest_rates;
	}
	public String getR38_product() {
		return r38_product;
	}
	public void setR38_product(String r38_product) {
		this.r38_product = r38_product;
	}
	public BigDecimal getR38_original_amount() {
		return r38_original_amount;
	}
	public void setR38_original_amount(BigDecimal r38_original_amount) {
		this.r38_original_amount = r38_original_amount;
	}
	public BigDecimal getR38_balance_outstanding() {
		return r38_balance_outstanding;
	}
	public void setR38_balance_outstanding(BigDecimal r38_balance_outstanding) {
		this.r38_balance_outstanding = r38_balance_outstanding;
	}
	public BigDecimal getR38_no_of_acs() {
		return r38_no_of_acs;
	}
	public void setR38_no_of_acs(BigDecimal r38_no_of_acs) {
		this.r38_no_of_acs = r38_no_of_acs;
	}
	public BigDecimal getR38_interest_rates() {
		return r38_interest_rates;
	}
	public void setR38_interest_rates(BigDecimal r38_interest_rates) {
		this.r38_interest_rates = r38_interest_rates;
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
		return "BRS68_ENTITY [r9_product=" + r9_product + ", r9_local=" + r9_local + ", r9_expatriates="
				+ r9_expatriates + ", r9_total=" + r9_total + ", r10_product=" + r10_product + ", r10_local="
				+ r10_local + ", r10_expatriates=" + r10_expatriates + ", r10_total=" + r10_total + ", r11_product="
				+ r11_product + ", r11_local=" + r11_local + ", r11_expatriates=" + r11_expatriates + ", r11_total="
				+ r11_total + ", r12_product=" + r12_product + ", r12_local=" + r12_local + ", r12_expatriates="
				+ r12_expatriates + ", r12_total=" + r12_total + ", r13_product=" + r13_product + ", r13_local="
				+ r13_local + ", r13_expatriates=" + r13_expatriates + ", r13_total=" + r13_total + ", r14_product="
				+ r14_product + ", r14_local=" + r14_local + ", r14_expatriates=" + r14_expatriates + ", r14_total="
				+ r14_total + ", r15_product=" + r15_product + ", r15_local=" + r15_local + ", r15_expatriates="
				+ r15_expatriates + ", r15_total=" + r15_total + ", r21_product=" + r21_product + ", r21_local="
				+ r21_local + ", r21_expatriates=" + r21_expatriates + ", r21_total=" + r21_total + ", r22_product="
				+ r22_product + ", r22_local=" + r22_local + ", r22_expatriates=" + r22_expatriates + ", r22_total="
				+ r22_total + ", r23_product=" + r23_product + ", r23_local=" + r23_local + ", r23_expatriates="
				+ r23_expatriates + ", r23_total=" + r23_total + ", r24_product=" + r24_product + ", r24_local="
				+ r24_local + ", r24_expatriates=" + r24_expatriates + ", r24_total=" + r24_total + ", r25_product="
				+ r25_product + ", r25_local=" + r25_local + ", r25_expatriates=" + r25_expatriates + ", r25_total="
				+ r25_total + ", r26_product=" + r26_product + ", r26_local=" + r26_local + ", r26_expatriates="
				+ r26_expatriates + ", r26_total=" + r26_total + ", r27_product=" + r27_product + ", r27_local="
				+ r27_local + ", r27_expatriates=" + r27_expatriates + ", r27_total=" + r27_total + ", r28_product="
				+ r28_product + ", r28_local=" + r28_local + ", r28_expatriates=" + r28_expatriates + ", r28_total="
				+ r28_total + ", r33_product=" + r33_product + ", r33_original_amount=" + r33_original_amount
				+ ", r33_balance_outstanding=" + r33_balance_outstanding + ", r33_no_of_acs=" + r33_no_of_acs
				+ ", r33_interest_rates=" + r33_interest_rates + ", r34_product=" + r34_product
				+ ", r34_original_amount=" + r34_original_amount + ", r34_balance_outstanding="
				+ r34_balance_outstanding + ", r34_no_of_acs=" + r34_no_of_acs + ", r34_interest_rates="
				+ r34_interest_rates + ", r35_product=" + r35_product + ", r35_original_amount=" + r35_original_amount
				+ ", r35_balance_outstanding=" + r35_balance_outstanding + ", r35_no_of_acs=" + r35_no_of_acs
				+ ", r35_interest_rates=" + r35_interest_rates + ", r36_product=" + r36_product
				+ ", r36_original_amount=" + r36_original_amount + ", r36_balance_outstanding="
				+ r36_balance_outstanding + ", r36_no_of_acs=" + r36_no_of_acs + ", r36_interest_rates="
				+ r36_interest_rates + ", r37_product=" + r37_product + ", r37_original_amount=" + r37_original_amount
				+ ", r37_balance_outstanding=" + r37_balance_outstanding + ", r37_no_of_acs=" + r37_no_of_acs
				+ ", r37_interest_rates=" + r37_interest_rates + ", r38_product=" + r38_product
				+ ", r38_original_amount=" + r38_original_amount + ", r38_balance_outstanding="
				+ r38_balance_outstanding + ", r38_no_of_acs=" + r38_no_of_acs + ", r38_interest_rates="
				+ r38_interest_rates + ", report_date=" + report_date + ", report_from_date=" + report_from_date
				+ ", report_to_date=" + report_to_date + ", entity_flg=" + entity_flg + ", modify_flg=" + modify_flg
				+ ", del_flg=" + del_flg + ", report_code=" + report_code + ", report_submit_date=" + report_submit_date
				+ ", getR9_product()=" + getR9_product() + ", getR9_local()=" + getR9_local() + ", getR9_expatriates()="
				+ getR9_expatriates() + ", getR9_total()=" + getR9_total() + ", getR10_product()=" + getR10_product()
				+ ", getR10_local()=" + getR10_local() + ", getR10_expatriates()=" + getR10_expatriates()
				+ ", getR10_total()=" + getR10_total() + ", getR11_product()=" + getR11_product() + ", getR11_local()="
				+ getR11_local() + ", getR11_expatriates()=" + getR11_expatriates() + ", getR11_total()="
				+ getR11_total() + ", getR12_product()=" + getR12_product() + ", getR12_local()=" + getR12_local()
				+ ", getR12_expatriates()=" + getR12_expatriates() + ", getR12_total()=" + getR12_total()
				+ ", getR13_product()=" + getR13_product() + ", getR13_local()=" + getR13_local()
				+ ", getR13_expatriates()=" + getR13_expatriates() + ", getR13_total()=" + getR13_total()
				+ ", getR14_product()=" + getR14_product() + ", getR14_local()=" + getR14_local()
				+ ", getR14_expatriates()=" + getR14_expatriates() + ", getR14_total()=" + getR14_total()
				+ ", getR15_product()=" + getR15_product() + ", getR15_local()=" + getR15_local()
				+ ", getR15_expatriates()=" + getR15_expatriates() + ", getR15_total()=" + getR15_total()
				+ ", getR21_product()=" + getR21_product() + ", getR21_local()=" + getR21_local()
				+ ", getR21_expatriates()=" + getR21_expatriates() + ", getR21_total()=" + getR21_total()
				+ ", getR22_product()=" + getR22_product() + ", getR22_local()=" + getR22_local()
				+ ", getR22_expatriates()=" + getR22_expatriates() + ", getR22_total()=" + getR22_total()
				+ ", getR23_product()=" + getR23_product() + ", getR23_local()=" + getR23_local()
				+ ", getR23_expatriates()=" + getR23_expatriates() + ", getR23_total()=" + getR23_total()
				+ ", getR24_product()=" + getR24_product() + ", getR24_local()=" + getR24_local()
				+ ", getR24_expatriates()=" + getR24_expatriates() + ", getR24_total()=" + getR24_total()
				+ ", getR25_product()=" + getR25_product() + ", getR25_local()=" + getR25_local()
				+ ", getR25_expatriates()=" + getR25_expatriates() + ", getR25_total()=" + getR25_total()
				+ ", getR26_product()=" + getR26_product() + ", getR26_local()=" + getR26_local()
				+ ", getR26_expatriates()=" + getR26_expatriates() + ", getR26_total()=" + getR26_total()
				+ ", getR27_product()=" + getR27_product() + ", getR27_local()=" + getR27_local()
				+ ", getR27_expatriates()=" + getR27_expatriates() + ", getR27_total()=" + getR27_total()
				+ ", getR28_product()=" + getR28_product() + ", getR28_local()=" + getR28_local()
				+ ", getR28_expatriates()=" + getR28_expatriates() + ", getR28_total()=" + getR28_total()
				+ ", getR33_product()=" + getR33_product() + ", getR33_original_amount()=" + getR33_original_amount()
				+ ", getR33_balance_outstanding()=" + getR33_balance_outstanding() + ", getR33_no_of_acs()="
				+ getR33_no_of_acs() + ", getR33_interest_rates()=" + getR33_interest_rates() + ", getR34_product()="
				+ getR34_product() + ", getR34_original_amount()=" + getR34_original_amount()
				+ ", getR34_balance_outstanding()=" + getR34_balance_outstanding() + ", getR34_no_of_acs()="
				+ getR34_no_of_acs() + ", getR34_interest_rates()=" + getR34_interest_rates() + ", getR35_product()="
				+ getR35_product() + ", getR35_original_amount()=" + getR35_original_amount()
				+ ", getR35_balance_outstanding()=" + getR35_balance_outstanding() + ", getR35_no_of_acs()="
				+ getR35_no_of_acs() + ", getR35_interest_rates()=" + getR35_interest_rates() + ", getR36_product()="
				+ getR36_product() + ", getR36_original_amount()=" + getR36_original_amount()
				+ ", getR36_balance_outstanding()=" + getR36_balance_outstanding() + ", getR36_no_of_acs()="
				+ getR36_no_of_acs() + ", getR36_interest_rates()=" + getR36_interest_rates() + ", getR37_product()="
				+ getR37_product() + ", getR37_original_amount()=" + getR37_original_amount()
				+ ", getR37_balance_outstanding()=" + getR37_balance_outstanding() + ", getR37_no_of_acs()="
				+ getR37_no_of_acs() + ", getR37_interest_rates()=" + getR37_interest_rates() + ", getR38_product()="
				+ getR38_product() + ", getR38_original_amount()=" + getR38_original_amount()
				+ ", getR38_balance_outstanding()=" + getR38_balance_outstanding() + ", getR38_no_of_acs()="
				+ getR38_no_of_acs() + ", getR38_interest_rates()=" + getR38_interest_rates() + ", getReport_date()="
				+ getReport_date() + ", getReport_from_date()=" + getReport_from_date() + ", getReport_to_date()="
				+ getReport_to_date() + ", getEntity_flg()=" + getEntity_flg() + ", getModify_flg()=" + getModify_flg()
				+ ", getDel_flg()=" + getDel_flg() + ", getReport_code()=" + getReport_code()
				+ ", getReport_submit_date()=" + getReport_submit_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS68_ENTITY(String r9_product, BigDecimal r9_local, BigDecimal r9_expatriates, BigDecimal r9_total,
			String r10_product, BigDecimal r10_local, BigDecimal r10_expatriates, BigDecimal r10_total,
			String r11_product, BigDecimal r11_local, BigDecimal r11_expatriates, BigDecimal r11_total,
			String r12_product, BigDecimal r12_local, BigDecimal r12_expatriates, BigDecimal r12_total,
			String r13_product, BigDecimal r13_local, BigDecimal r13_expatriates, BigDecimal r13_total,
			String r14_product, BigDecimal r14_local, BigDecimal r14_expatriates, BigDecimal r14_total,
			String r15_product, BigDecimal r15_local, BigDecimal r15_expatriates, BigDecimal r15_total,
			String r21_product, BigDecimal r21_local, BigDecimal r21_expatriates, BigDecimal r21_total,
			String r22_product, BigDecimal r22_local, BigDecimal r22_expatriates, BigDecimal r22_total,
			String r23_product, BigDecimal r23_local, BigDecimal r23_expatriates, BigDecimal r23_total,
			String r24_product, BigDecimal r24_local, BigDecimal r24_expatriates, BigDecimal r24_total,
			String r25_product, BigDecimal r25_local, BigDecimal r25_expatriates, BigDecimal r25_total,
			String r26_product, BigDecimal r26_local, BigDecimal r26_expatriates, BigDecimal r26_total,
			String r27_product, BigDecimal r27_local, BigDecimal r27_expatriates, BigDecimal r27_total,
			String r28_product, BigDecimal r28_local, BigDecimal r28_expatriates, BigDecimal r28_total,
			String r33_product, BigDecimal r33_original_amount, BigDecimal r33_balance_outstanding,
			BigDecimal r33_no_of_acs, BigDecimal r33_interest_rates, String r34_product, BigDecimal r34_original_amount,
			BigDecimal r34_balance_outstanding, BigDecimal r34_no_of_acs, BigDecimal r34_interest_rates,
			String r35_product, BigDecimal r35_original_amount, BigDecimal r35_balance_outstanding,
			BigDecimal r35_no_of_acs, BigDecimal r35_interest_rates, String r36_product, BigDecimal r36_original_amount,
			BigDecimal r36_balance_outstanding, BigDecimal r36_no_of_acs, BigDecimal r36_interest_rates,
			String r37_product, BigDecimal r37_original_amount, BigDecimal r37_balance_outstanding,
			BigDecimal r37_no_of_acs, BigDecimal r37_interest_rates, String r38_product, BigDecimal r38_original_amount,
			BigDecimal r38_balance_outstanding, BigDecimal r38_no_of_acs, BigDecimal r38_interest_rates,
			Date report_date, Date report_from_date, Date report_to_date, String entity_flg, String modify_flg,
			String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r9_product = r9_product;
		this.r9_local = r9_local;
		this.r9_expatriates = r9_expatriates;
		this.r9_total = r9_total;
		this.r10_product = r10_product;
		this.r10_local = r10_local;
		this.r10_expatriates = r10_expatriates;
		this.r10_total = r10_total;
		this.r11_product = r11_product;
		this.r11_local = r11_local;
		this.r11_expatriates = r11_expatriates;
		this.r11_total = r11_total;
		this.r12_product = r12_product;
		this.r12_local = r12_local;
		this.r12_expatriates = r12_expatriates;
		this.r12_total = r12_total;
		this.r13_product = r13_product;
		this.r13_local = r13_local;
		this.r13_expatriates = r13_expatriates;
		this.r13_total = r13_total;
		this.r14_product = r14_product;
		this.r14_local = r14_local;
		this.r14_expatriates = r14_expatriates;
		this.r14_total = r14_total;
		this.r15_product = r15_product;
		this.r15_local = r15_local;
		this.r15_expatriates = r15_expatriates;
		this.r15_total = r15_total;
		this.r21_product = r21_product;
		this.r21_local = r21_local;
		this.r21_expatriates = r21_expatriates;
		this.r21_total = r21_total;
		this.r22_product = r22_product;
		this.r22_local = r22_local;
		this.r22_expatriates = r22_expatriates;
		this.r22_total = r22_total;
		this.r23_product = r23_product;
		this.r23_local = r23_local;
		this.r23_expatriates = r23_expatriates;
		this.r23_total = r23_total;
		this.r24_product = r24_product;
		this.r24_local = r24_local;
		this.r24_expatriates = r24_expatriates;
		this.r24_total = r24_total;
		this.r25_product = r25_product;
		this.r25_local = r25_local;
		this.r25_expatriates = r25_expatriates;
		this.r25_total = r25_total;
		this.r26_product = r26_product;
		this.r26_local = r26_local;
		this.r26_expatriates = r26_expatriates;
		this.r26_total = r26_total;
		this.r27_product = r27_product;
		this.r27_local = r27_local;
		this.r27_expatriates = r27_expatriates;
		this.r27_total = r27_total;
		this.r28_product = r28_product;
		this.r28_local = r28_local;
		this.r28_expatriates = r28_expatriates;
		this.r28_total = r28_total;
		this.r33_product = r33_product;
		this.r33_original_amount = r33_original_amount;
		this.r33_balance_outstanding = r33_balance_outstanding;
		this.r33_no_of_acs = r33_no_of_acs;
		this.r33_interest_rates = r33_interest_rates;
		this.r34_product = r34_product;
		this.r34_original_amount = r34_original_amount;
		this.r34_balance_outstanding = r34_balance_outstanding;
		this.r34_no_of_acs = r34_no_of_acs;
		this.r34_interest_rates = r34_interest_rates;
		this.r35_product = r35_product;
		this.r35_original_amount = r35_original_amount;
		this.r35_balance_outstanding = r35_balance_outstanding;
		this.r35_no_of_acs = r35_no_of_acs;
		this.r35_interest_rates = r35_interest_rates;
		this.r36_product = r36_product;
		this.r36_original_amount = r36_original_amount;
		this.r36_balance_outstanding = r36_balance_outstanding;
		this.r36_no_of_acs = r36_no_of_acs;
		this.r36_interest_rates = r36_interest_rates;
		this.r37_product = r37_product;
		this.r37_original_amount = r37_original_amount;
		this.r37_balance_outstanding = r37_balance_outstanding;
		this.r37_no_of_acs = r37_no_of_acs;
		this.r37_interest_rates = r37_interest_rates;
		this.r38_product = r38_product;
		this.r38_original_amount = r38_original_amount;
		this.r38_balance_outstanding = r38_balance_outstanding;
		this.r38_no_of_acs = r38_no_of_acs;
		this.r38_interest_rates = r38_interest_rates;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS68_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}


}

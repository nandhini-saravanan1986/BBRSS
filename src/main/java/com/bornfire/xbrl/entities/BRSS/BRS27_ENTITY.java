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
@Table(name="BRS27_TABLE")

public class BRS27_ENTITY {
	
	private String	r1_product;
	private BigDecimal	r1_pula;
	private BigDecimal	r1_usd;
	private BigDecimal	r1_zar;
	private BigDecimal	r1_gbp;
	private BigDecimal	r1_euro;
	private BigDecimal	r1_jpy;
	private BigDecimal	r1_rupee;
	private BigDecimal	r1_renminbi;
	private BigDecimal	r1_other;
	private BigDecimal	r1_total_capital_required;
	private String	r2_product;
	private BigDecimal	r2_pula;
	private BigDecimal	r2_usd;
	private BigDecimal	r2_zar;
	private BigDecimal	r2_gbp;
	private BigDecimal	r2_euro;
	private BigDecimal	r2_jpy;
	private BigDecimal	r2_rupee;
	private BigDecimal	r2_renminbi;
	private BigDecimal	r2_other;
	private BigDecimal	r2_total_capital_required;
	private String	r3_product;
	private BigDecimal	r3_pula;
	private BigDecimal	r3_usd;
	private BigDecimal	r3_zar;
	private BigDecimal	r3_gbp;
	private BigDecimal	r3_euro;
	private BigDecimal	r3_jpy;
	private BigDecimal	r3_rupee;
	private BigDecimal	r3_renminbi;
	private BigDecimal	r3_other;
	private BigDecimal	r3_total_capital_required;
	private String	r4_product;
	private BigDecimal	r4_pula;
	private BigDecimal	r4_usd;
	private BigDecimal	r4_zar;
	private BigDecimal	r4_gbp;
	private BigDecimal	r4_euro;
	private BigDecimal	r4_jpy;
	private BigDecimal	r4_rupee;
	private BigDecimal	r4_renminbi;
	private BigDecimal	r4_other;
	private BigDecimal	r4_total_capital_required;
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
	public BigDecimal getR1_pula() {
		return r1_pula;
	}
	public void setR1_pula(BigDecimal r1_pula) {
		this.r1_pula = r1_pula;
	}
	public BigDecimal getR1_usd() {
		return r1_usd;
	}
	public void setR1_usd(BigDecimal r1_usd) {
		this.r1_usd = r1_usd;
	}
	public BigDecimal getR1_zar() {
		return r1_zar;
	}
	public void setR1_zar(BigDecimal r1_zar) {
		this.r1_zar = r1_zar;
	}
	public BigDecimal getR1_gbp() {
		return r1_gbp;
	}
	public void setR1_gbp(BigDecimal r1_gbp) {
		this.r1_gbp = r1_gbp;
	}
	public BigDecimal getR1_euro() {
		return r1_euro;
	}
	public void setR1_euro(BigDecimal r1_euro) {
		this.r1_euro = r1_euro;
	}
	public BigDecimal getR1_jpy() {
		return r1_jpy;
	}
	public void setR1_jpy(BigDecimal r1_jpy) {
		this.r1_jpy = r1_jpy;
	}
	public BigDecimal getR1_rupee() {
		return r1_rupee;
	}
	public void setR1_rupee(BigDecimal r1_rupee) {
		this.r1_rupee = r1_rupee;
	}
	public BigDecimal getR1_renminbi() {
		return r1_renminbi;
	}
	public void setR1_renminbi(BigDecimal r1_renminbi) {
		this.r1_renminbi = r1_renminbi;
	}
	public BigDecimal getR1_other() {
		return r1_other;
	}
	public void setR1_other(BigDecimal r1_other) {
		this.r1_other = r1_other;
	}
	public BigDecimal getR1_total_capital_required() {
		return r1_total_capital_required;
	}
	public void setR1_total_capital_required(BigDecimal r1_total_capital_required) {
		this.r1_total_capital_required = r1_total_capital_required;
	}
	public String getR2_product() {
		return r2_product;
	}
	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}
	public BigDecimal getR2_pula() {
		return r2_pula;
	}
	public void setR2_pula(BigDecimal r2_pula) {
		this.r2_pula = r2_pula;
	}
	public BigDecimal getR2_usd() {
		return r2_usd;
	}
	public void setR2_usd(BigDecimal r2_usd) {
		this.r2_usd = r2_usd;
	}
	public BigDecimal getR2_zar() {
		return r2_zar;
	}
	public void setR2_zar(BigDecimal r2_zar) {
		this.r2_zar = r2_zar;
	}
	public BigDecimal getR2_gbp() {
		return r2_gbp;
	}
	public void setR2_gbp(BigDecimal r2_gbp) {
		this.r2_gbp = r2_gbp;
	}
	public BigDecimal getR2_euro() {
		return r2_euro;
	}
	public void setR2_euro(BigDecimal r2_euro) {
		this.r2_euro = r2_euro;
	}
	public BigDecimal getR2_jpy() {
		return r2_jpy;
	}
	public void setR2_jpy(BigDecimal r2_jpy) {
		this.r2_jpy = r2_jpy;
	}
	public BigDecimal getR2_rupee() {
		return r2_rupee;
	}
	public void setR2_rupee(BigDecimal r2_rupee) {
		this.r2_rupee = r2_rupee;
	}
	public BigDecimal getR2_renminbi() {
		return r2_renminbi;
	}
	public void setR2_renminbi(BigDecimal r2_renminbi) {
		this.r2_renminbi = r2_renminbi;
	}
	public BigDecimal getR2_other() {
		return r2_other;
	}
	public void setR2_other(BigDecimal r2_other) {
		this.r2_other = r2_other;
	}
	public BigDecimal getR2_total_capital_required() {
		return r2_total_capital_required;
	}
	public void setR2_total_capital_required(BigDecimal r2_total_capital_required) {
		this.r2_total_capital_required = r2_total_capital_required;
	}
	public String getR3_product() {
		return r3_product;
	}
	public void setR3_product(String r3_product) {
		this.r3_product = r3_product;
	}
	public BigDecimal getR3_pula() {
		return r3_pula;
	}
	public void setR3_pula(BigDecimal r3_pula) {
		this.r3_pula = r3_pula;
	}
	public BigDecimal getR3_usd() {
		return r3_usd;
	}
	public void setR3_usd(BigDecimal r3_usd) {
		this.r3_usd = r3_usd;
	}
	public BigDecimal getR3_zar() {
		return r3_zar;
	}
	public void setR3_zar(BigDecimal r3_zar) {
		this.r3_zar = r3_zar;
	}
	public BigDecimal getR3_gbp() {
		return r3_gbp;
	}
	public void setR3_gbp(BigDecimal r3_gbp) {
		this.r3_gbp = r3_gbp;
	}
	public BigDecimal getR3_euro() {
		return r3_euro;
	}
	public void setR3_euro(BigDecimal r3_euro) {
		this.r3_euro = r3_euro;
	}
	public BigDecimal getR3_jpy() {
		return r3_jpy;
	}
	public void setR3_jpy(BigDecimal r3_jpy) {
		this.r3_jpy = r3_jpy;
	}
	public BigDecimal getR3_rupee() {
		return r3_rupee;
	}
	public void setR3_rupee(BigDecimal r3_rupee) {
		this.r3_rupee = r3_rupee;
	}
	public BigDecimal getR3_renminbi() {
		return r3_renminbi;
	}
	public void setR3_renminbi(BigDecimal r3_renminbi) {
		this.r3_renminbi = r3_renminbi;
	}
	public BigDecimal getR3_other() {
		return r3_other;
	}
	public void setR3_other(BigDecimal r3_other) {
		this.r3_other = r3_other;
	}
	public BigDecimal getR3_total_capital_required() {
		return r3_total_capital_required;
	}
	public void setR3_total_capital_required(BigDecimal r3_total_capital_required) {
		this.r3_total_capital_required = r3_total_capital_required;
	}
	public String getR4_product() {
		return r4_product;
	}
	public void setR4_product(String r4_product) {
		this.r4_product = r4_product;
	}
	public BigDecimal getR4_pula() {
		return r4_pula;
	}
	public void setR4_pula(BigDecimal r4_pula) {
		this.r4_pula = r4_pula;
	}
	public BigDecimal getR4_usd() {
		return r4_usd;
	}
	public void setR4_usd(BigDecimal r4_usd) {
		this.r4_usd = r4_usd;
	}
	public BigDecimal getR4_zar() {
		return r4_zar;
	}
	public void setR4_zar(BigDecimal r4_zar) {
		this.r4_zar = r4_zar;
	}
	public BigDecimal getR4_gbp() {
		return r4_gbp;
	}
	public void setR4_gbp(BigDecimal r4_gbp) {
		this.r4_gbp = r4_gbp;
	}
	public BigDecimal getR4_euro() {
		return r4_euro;
	}
	public void setR4_euro(BigDecimal r4_euro) {
		this.r4_euro = r4_euro;
	}
	public BigDecimal getR4_jpy() {
		return r4_jpy;
	}
	public void setR4_jpy(BigDecimal r4_jpy) {
		this.r4_jpy = r4_jpy;
	}
	public BigDecimal getR4_rupee() {
		return r4_rupee;
	}
	public void setR4_rupee(BigDecimal r4_rupee) {
		this.r4_rupee = r4_rupee;
	}
	public BigDecimal getR4_renminbi() {
		return r4_renminbi;
	}
	public void setR4_renminbi(BigDecimal r4_renminbi) {
		this.r4_renminbi = r4_renminbi;
	}
	public BigDecimal getR4_other() {
		return r4_other;
	}
	public void setR4_other(BigDecimal r4_other) {
		this.r4_other = r4_other;
	}
	public BigDecimal getR4_total_capital_required() {
		return r4_total_capital_required;
	}
	public void setR4_total_capital_required(BigDecimal r4_total_capital_required) {
		this.r4_total_capital_required = r4_total_capital_required;
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
	public BRS27_ENTITY(String r1_product, BigDecimal r1_pula, BigDecimal r1_usd, BigDecimal r1_zar, BigDecimal r1_gbp,
			BigDecimal r1_euro, BigDecimal r1_jpy, BigDecimal r1_rupee, BigDecimal r1_renminbi, BigDecimal r1_other,
			BigDecimal r1_total_capital_required, String r2_product, BigDecimal r2_pula, BigDecimal r2_usd,
			BigDecimal r2_zar, BigDecimal r2_gbp, BigDecimal r2_euro, BigDecimal r2_jpy, BigDecimal r2_rupee,
			BigDecimal r2_renminbi, BigDecimal r2_other, BigDecimal r2_total_capital_required, String r3_product,
			BigDecimal r3_pula, BigDecimal r3_usd, BigDecimal r3_zar, BigDecimal r3_gbp, BigDecimal r3_euro,
			BigDecimal r3_jpy, BigDecimal r3_rupee, BigDecimal r3_renminbi, BigDecimal r3_other,
			BigDecimal r3_total_capital_required, String r4_product, BigDecimal r4_pula, BigDecimal r4_usd,
			BigDecimal r4_zar, BigDecimal r4_gbp, BigDecimal r4_euro, BigDecimal r4_jpy, BigDecimal r4_rupee,
			BigDecimal r4_renminbi, BigDecimal r4_other, BigDecimal r4_total_capital_required, Date report_date,
			Date report_from_date, Date report_to_date, String entity_flg, String modify_flg, String del_flg,
			String report_code, Date report_submit_date) {
		super();
		this.r1_product = r1_product;
		this.r1_pula = r1_pula;
		this.r1_usd = r1_usd;
		this.r1_zar = r1_zar;
		this.r1_gbp = r1_gbp;
		this.r1_euro = r1_euro;
		this.r1_jpy = r1_jpy;
		this.r1_rupee = r1_rupee;
		this.r1_renminbi = r1_renminbi;
		this.r1_other = r1_other;
		this.r1_total_capital_required = r1_total_capital_required;
		this.r2_product = r2_product;
		this.r2_pula = r2_pula;
		this.r2_usd = r2_usd;
		this.r2_zar = r2_zar;
		this.r2_gbp = r2_gbp;
		this.r2_euro = r2_euro;
		this.r2_jpy = r2_jpy;
		this.r2_rupee = r2_rupee;
		this.r2_renminbi = r2_renminbi;
		this.r2_other = r2_other;
		this.r2_total_capital_required = r2_total_capital_required;
		this.r3_product = r3_product;
		this.r3_pula = r3_pula;
		this.r3_usd = r3_usd;
		this.r3_zar = r3_zar;
		this.r3_gbp = r3_gbp;
		this.r3_euro = r3_euro;
		this.r3_jpy = r3_jpy;
		this.r3_rupee = r3_rupee;
		this.r3_renminbi = r3_renminbi;
		this.r3_other = r3_other;
		this.r3_total_capital_required = r3_total_capital_required;
		this.r4_product = r4_product;
		this.r4_pula = r4_pula;
		this.r4_usd = r4_usd;
		this.r4_zar = r4_zar;
		this.r4_gbp = r4_gbp;
		this.r4_euro = r4_euro;
		this.r4_jpy = r4_jpy;
		this.r4_rupee = r4_rupee;
		this.r4_renminbi = r4_renminbi;
		this.r4_other = r4_other;
		this.r4_total_capital_required = r4_total_capital_required;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS27_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

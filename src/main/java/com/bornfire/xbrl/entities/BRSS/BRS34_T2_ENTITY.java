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
@Table(name="M_CALOC_T2")
public class BRS34_T2_ENTITY {
	
	private String	r109_product;
	private BigDecimal	r109_pula;
	private BigDecimal	r109_usd;
	private BigDecimal	r109_zar;
	private BigDecimal	r109_gbp;
	private BigDecimal	r109_euro;
	private BigDecimal	r109_inr;
	private BigDecimal	r109_aud;
	private BigDecimal	r109_emt;
	private BigDecimal	r109_total;
	private String	r110_product;
	private BigDecimal	r110_pula;
	private BigDecimal	r110_usd;
	private BigDecimal	r110_zar;
	private BigDecimal	r110_gbp;
	private BigDecimal	r110_euro;
	private BigDecimal	r110_inr;
	private BigDecimal	r110_aud;
	private BigDecimal	r110_emt;
	private BigDecimal	r110_total;
	private String	r111_product;
	private BigDecimal	r111_pula;
	private BigDecimal	r111_usd;
	private BigDecimal	r111_zar;
	private BigDecimal	r111_gbp;
	private BigDecimal	r111_euro;
	private BigDecimal	r111_inr;
	private BigDecimal	r111_aud;
	private BigDecimal	r111_emt;
	private BigDecimal	r111_total;
	private String	r112_product;
	private BigDecimal	r112_pula;
	private BigDecimal	r112_usd;
	private BigDecimal	r112_zar;
	private BigDecimal	r112_gbp;
	private BigDecimal	r112_euro;
	private BigDecimal	r112_inr;
	private BigDecimal	r112_aud;
	private BigDecimal	r112_emt;
	private BigDecimal	r112_total;
	private String	r113_product;
	private BigDecimal	r113_pula;
	private BigDecimal	r113_usd;
	private BigDecimal	r113_zar;
	private BigDecimal	r113_gbp;
	private BigDecimal	r113_euro;
	private BigDecimal	r113_inr;
	private BigDecimal	r113_aud;
	private BigDecimal	r113_emt;
	private BigDecimal	r113_total;
	private String	r114_product;
	private BigDecimal	r114_pula;
	private BigDecimal	r114_usd;
	private BigDecimal	r114_zar;
	private BigDecimal	r114_gbp;
	private BigDecimal	r114_euro;
	private BigDecimal	r114_inr;
	private BigDecimal	r114_aud;
	private BigDecimal	r114_emt;
	private BigDecimal	r114_total;
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
	public String getR109_product() {
		return r109_product;
	}
	public void setR109_product(String r109_product) {
		this.r109_product = r109_product;
	}
	public BigDecimal getR109_pula() {
		return r109_pula;
	}
	public void setR109_pula(BigDecimal r109_pula) {
		this.r109_pula = r109_pula;
	}
	public BigDecimal getR109_usd() {
		return r109_usd;
	}
	public void setR109_usd(BigDecimal r109_usd) {
		this.r109_usd = r109_usd;
	}
	public BigDecimal getR109_zar() {
		return r109_zar;
	}
	public void setR109_zar(BigDecimal r109_zar) {
		this.r109_zar = r109_zar;
	}
	public BigDecimal getR109_gbp() {
		return r109_gbp;
	}
	public void setR109_gbp(BigDecimal r109_gbp) {
		this.r109_gbp = r109_gbp;
	}
	public BigDecimal getR109_euro() {
		return r109_euro;
	}
	public void setR109_euro(BigDecimal r109_euro) {
		this.r109_euro = r109_euro;
	}
	public BigDecimal getR109_inr() {
		return r109_inr;
	}
	public void setR109_inr(BigDecimal r109_inr) {
		this.r109_inr = r109_inr;
	}
	public BigDecimal getR109_aud() {
		return r109_aud;
	}
	public void setR109_aud(BigDecimal r109_aud) {
		this.r109_aud = r109_aud;
	}
	public BigDecimal getR109_emt() {
		return r109_emt;
	}
	public void setR109_emt(BigDecimal r109_emt) {
		this.r109_emt = r109_emt;
	}
	public BigDecimal getR109_total() {
		return r109_total;
	}
	public void setR109_total(BigDecimal r109_total) {
		this.r109_total = r109_total;
	}
	public String getR110_product() {
		return r110_product;
	}
	public void setR110_product(String r110_product) {
		this.r110_product = r110_product;
	}
	public BigDecimal getR110_pula() {
		return r110_pula;
	}
	public void setR110_pula(BigDecimal r110_pula) {
		this.r110_pula = r110_pula;
	}
	public BigDecimal getR110_usd() {
		return r110_usd;
	}
	public void setR110_usd(BigDecimal r110_usd) {
		this.r110_usd = r110_usd;
	}
	public BigDecimal getR110_zar() {
		return r110_zar;
	}
	public void setR110_zar(BigDecimal r110_zar) {
		this.r110_zar = r110_zar;
	}
	public BigDecimal getR110_gbp() {
		return r110_gbp;
	}
	public void setR110_gbp(BigDecimal r110_gbp) {
		this.r110_gbp = r110_gbp;
	}
	public BigDecimal getR110_euro() {
		return r110_euro;
	}
	public void setR110_euro(BigDecimal r110_euro) {
		this.r110_euro = r110_euro;
	}
	public BigDecimal getR110_inr() {
		return r110_inr;
	}
	public void setR110_inr(BigDecimal r110_inr) {
		this.r110_inr = r110_inr;
	}
	public BigDecimal getR110_aud() {
		return r110_aud;
	}
	public void setR110_aud(BigDecimal r110_aud) {
		this.r110_aud = r110_aud;
	}
	public BigDecimal getR110_emt() {
		return r110_emt;
	}
	public void setR110_emt(BigDecimal r110_emt) {
		this.r110_emt = r110_emt;
	}
	public BigDecimal getR110_total() {
		return r110_total;
	}
	public void setR110_total(BigDecimal r110_total) {
		this.r110_total = r110_total;
	}
	public String getR111_product() {
		return r111_product;
	}
	public void setR111_product(String r111_product) {
		this.r111_product = r111_product;
	}
	public BigDecimal getR111_pula() {
		return r111_pula;
	}
	public void setR111_pula(BigDecimal r111_pula) {
		this.r111_pula = r111_pula;
	}
	public BigDecimal getR111_usd() {
		return r111_usd;
	}
	public void setR111_usd(BigDecimal r111_usd) {
		this.r111_usd = r111_usd;
	}
	public BigDecimal getR111_zar() {
		return r111_zar;
	}
	public void setR111_zar(BigDecimal r111_zar) {
		this.r111_zar = r111_zar;
	}
	public BigDecimal getR111_gbp() {
		return r111_gbp;
	}
	public void setR111_gbp(BigDecimal r111_gbp) {
		this.r111_gbp = r111_gbp;
	}
	public BigDecimal getR111_euro() {
		return r111_euro;
	}
	public void setR111_euro(BigDecimal r111_euro) {
		this.r111_euro = r111_euro;
	}
	public BigDecimal getR111_inr() {
		return r111_inr;
	}
	public void setR111_inr(BigDecimal r111_inr) {
		this.r111_inr = r111_inr;
	}
	public BigDecimal getR111_aud() {
		return r111_aud;
	}
	public void setR111_aud(BigDecimal r111_aud) {
		this.r111_aud = r111_aud;
	}
	public BigDecimal getR111_emt() {
		return r111_emt;
	}
	public void setR111_emt(BigDecimal r111_emt) {
		this.r111_emt = r111_emt;
	}
	public BigDecimal getR111_total() {
		return r111_total;
	}
	public void setR111_total(BigDecimal r111_total) {
		this.r111_total = r111_total;
	}
	public String getR112_product() {
		return r112_product;
	}
	public void setR112_product(String r112_product) {
		this.r112_product = r112_product;
	}
	public BigDecimal getR112_pula() {
		return r112_pula;
	}
	public void setR112_pula(BigDecimal r112_pula) {
		this.r112_pula = r112_pula;
	}
	public BigDecimal getR112_usd() {
		return r112_usd;
	}
	public void setR112_usd(BigDecimal r112_usd) {
		this.r112_usd = r112_usd;
	}
	public BigDecimal getR112_zar() {
		return r112_zar;
	}
	public void setR112_zar(BigDecimal r112_zar) {
		this.r112_zar = r112_zar;
	}
	public BigDecimal getR112_gbp() {
		return r112_gbp;
	}
	public void setR112_gbp(BigDecimal r112_gbp) {
		this.r112_gbp = r112_gbp;
	}
	public BigDecimal getR112_euro() {
		return r112_euro;
	}
	public void setR112_euro(BigDecimal r112_euro) {
		this.r112_euro = r112_euro;
	}
	public BigDecimal getR112_inr() {
		return r112_inr;
	}
	public void setR112_inr(BigDecimal r112_inr) {
		this.r112_inr = r112_inr;
	}
	public BigDecimal getR112_aud() {
		return r112_aud;
	}
	public void setR112_aud(BigDecimal r112_aud) {
		this.r112_aud = r112_aud;
	}
	public BigDecimal getR112_emt() {
		return r112_emt;
	}
	public void setR112_emt(BigDecimal r112_emt) {
		this.r112_emt = r112_emt;
	}
	public BigDecimal getR112_total() {
		return r112_total;
	}
	public void setR112_total(BigDecimal r112_total) {
		this.r112_total = r112_total;
	}
	public String getR113_product() {
		return r113_product;
	}
	public void setR113_product(String r113_product) {
		this.r113_product = r113_product;
	}
	public BigDecimal getR113_pula() {
		return r113_pula;
	}
	public void setR113_pula(BigDecimal r113_pula) {
		this.r113_pula = r113_pula;
	}
	public BigDecimal getR113_usd() {
		return r113_usd;
	}
	public void setR113_usd(BigDecimal r113_usd) {
		this.r113_usd = r113_usd;
	}
	public BigDecimal getR113_zar() {
		return r113_zar;
	}
	public void setR113_zar(BigDecimal r113_zar) {
		this.r113_zar = r113_zar;
	}
	public BigDecimal getR113_gbp() {
		return r113_gbp;
	}
	public void setR113_gbp(BigDecimal r113_gbp) {
		this.r113_gbp = r113_gbp;
	}
	public BigDecimal getR113_euro() {
		return r113_euro;
	}
	public void setR113_euro(BigDecimal r113_euro) {
		this.r113_euro = r113_euro;
	}
	public BigDecimal getR113_inr() {
		return r113_inr;
	}
	public void setR113_inr(BigDecimal r113_inr) {
		this.r113_inr = r113_inr;
	}
	public BigDecimal getR113_aud() {
		return r113_aud;
	}
	public void setR113_aud(BigDecimal r113_aud) {
		this.r113_aud = r113_aud;
	}
	public BigDecimal getR113_emt() {
		return r113_emt;
	}
	public void setR113_emt(BigDecimal r113_emt) {
		this.r113_emt = r113_emt;
	}
	public BigDecimal getR113_total() {
		return r113_total;
	}
	public void setR113_total(BigDecimal r113_total) {
		this.r113_total = r113_total;
	}
	public String getR114_product() {
		return r114_product;
	}
	public void setR114_product(String r114_product) {
		this.r114_product = r114_product;
	}
	public BigDecimal getR114_pula() {
		return r114_pula;
	}
	public void setR114_pula(BigDecimal r114_pula) {
		this.r114_pula = r114_pula;
	}
	public BigDecimal getR114_usd() {
		return r114_usd;
	}
	public void setR114_usd(BigDecimal r114_usd) {
		this.r114_usd = r114_usd;
	}
	public BigDecimal getR114_zar() {
		return r114_zar;
	}
	public void setR114_zar(BigDecimal r114_zar) {
		this.r114_zar = r114_zar;
	}
	public BigDecimal getR114_gbp() {
		return r114_gbp;
	}
	public void setR114_gbp(BigDecimal r114_gbp) {
		this.r114_gbp = r114_gbp;
	}
	public BigDecimal getR114_euro() {
		return r114_euro;
	}
	public void setR114_euro(BigDecimal r114_euro) {
		this.r114_euro = r114_euro;
	}
	public BigDecimal getR114_inr() {
		return r114_inr;
	}
	public void setR114_inr(BigDecimal r114_inr) {
		this.r114_inr = r114_inr;
	}
	public BigDecimal getR114_aud() {
		return r114_aud;
	}
	public void setR114_aud(BigDecimal r114_aud) {
		this.r114_aud = r114_aud;
	}
	public BigDecimal getR114_emt() {
		return r114_emt;
	}
	public void setR114_emt(BigDecimal r114_emt) {
		this.r114_emt = r114_emt;
	}
	public BigDecimal getR114_total() {
		return r114_total;
	}
	public void setR114_total(BigDecimal r114_total) {
		this.r114_total = r114_total;
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
		return "BRS34_T2_ENTITY [r109_product=" + r109_product + ", r109_pula=" + r109_pula + ", r109_usd=" + r109_usd
				+ ", r109_zar=" + r109_zar + ", r109_gbp=" + r109_gbp + ", r109_euro=" + r109_euro + ", r109_inr="
				+ r109_inr + ", r109_aud=" + r109_aud + ", r109_emt=" + r109_emt + ", r109_total=" + r109_total
				+ ", r110_product=" + r110_product + ", r110_pula=" + r110_pula + ", r110_usd=" + r110_usd
				+ ", r110_zar=" + r110_zar + ", r110_gbp=" + r110_gbp + ", r110_euro=" + r110_euro + ", r110_inr="
				+ r110_inr + ", r110_aud=" + r110_aud + ", r110_emt=" + r110_emt + ", r110_total=" + r110_total
				+ ", r111_product=" + r111_product + ", r111_pula=" + r111_pula + ", r111_usd=" + r111_usd
				+ ", r111_zar=" + r111_zar + ", r111_gbp=" + r111_gbp + ", r111_euro=" + r111_euro + ", r111_inr="
				+ r111_inr + ", r111_aud=" + r111_aud + ", r111_emt=" + r111_emt + ", r111_total=" + r111_total
				+ ", r112_product=" + r112_product + ", r112_pula=" + r112_pula + ", r112_usd=" + r112_usd
				+ ", r112_zar=" + r112_zar + ", r112_gbp=" + r112_gbp + ", r112_euro=" + r112_euro + ", r112_inr="
				+ r112_inr + ", r112_aud=" + r112_aud + ", r112_emt=" + r112_emt + ", r112_total=" + r112_total
				+ ", r113_product=" + r113_product + ", r113_pula=" + r113_pula + ", r113_usd=" + r113_usd
				+ ", r113_zar=" + r113_zar + ", r113_gbp=" + r113_gbp + ", r113_euro=" + r113_euro + ", r113_inr="
				+ r113_inr + ", r113_aud=" + r113_aud + ", r113_emt=" + r113_emt + ", r113_total=" + r113_total
				+ ", r114_product=" + r114_product + ", r114_pula=" + r114_pula + ", r114_usd=" + r114_usd
				+ ", r114_zar=" + r114_zar + ", r114_gbp=" + r114_gbp + ", r114_euro=" + r114_euro + ", r114_inr="
				+ r114_inr + ", r114_aud=" + r114_aud + ", r114_emt=" + r114_emt + ", r114_total=" + r114_total
				+ ", report_date=" + report_date + ", report_from_date=" + report_from_date + ", report_to_date="
				+ report_to_date + ", entity_flg=" + entity_flg + ", modify_flg=" + modify_flg + ", del_flg=" + del_flg
				+ ", report_code=" + report_code + ", report_submit_date=" + report_submit_date + ", getR109_product()="
				+ getR109_product() + ", getR109_pula()=" + getR109_pula() + ", getR109_usd()=" + getR109_usd()
				+ ", getR109_zar()=" + getR109_zar() + ", getR109_gbp()=" + getR109_gbp() + ", getR109_euro()="
				+ getR109_euro() + ", getR109_inr()=" + getR109_inr() + ", getR109_aud()=" + getR109_aud()
				+ ", getR109_emt()=" + getR109_emt() + ", getR109_total()=" + getR109_total() + ", getR110_product()="
				+ getR110_product() + ", getR110_pula()=" + getR110_pula() + ", getR110_usd()=" + getR110_usd()
				+ ", getR110_zar()=" + getR110_zar() + ", getR110_gbp()=" + getR110_gbp() + ", getR110_euro()="
				+ getR110_euro() + ", getR110_inr()=" + getR110_inr() + ", getR110_aud()=" + getR110_aud()
				+ ", getR110_emt()=" + getR110_emt() + ", getR110_total()=" + getR110_total() + ", getR111_product()="
				+ getR111_product() + ", getR111_pula()=" + getR111_pula() + ", getR111_usd()=" + getR111_usd()
				+ ", getR111_zar()=" + getR111_zar() + ", getR111_gbp()=" + getR111_gbp() + ", getR111_euro()="
				+ getR111_euro() + ", getR111_inr()=" + getR111_inr() + ", getR111_aud()=" + getR111_aud()
				+ ", getR111_emt()=" + getR111_emt() + ", getR111_total()=" + getR111_total() + ", getR112_product()="
				+ getR112_product() + ", getR112_pula()=" + getR112_pula() + ", getR112_usd()=" + getR112_usd()
				+ ", getR112_zar()=" + getR112_zar() + ", getR112_gbp()=" + getR112_gbp() + ", getR112_euro()="
				+ getR112_euro() + ", getR112_inr()=" + getR112_inr() + ", getR112_aud()=" + getR112_aud()
				+ ", getR112_emt()=" + getR112_emt() + ", getR112_total()=" + getR112_total() + ", getR113_product()="
				+ getR113_product() + ", getR113_pula()=" + getR113_pula() + ", getR113_usd()=" + getR113_usd()
				+ ", getR113_zar()=" + getR113_zar() + ", getR113_gbp()=" + getR113_gbp() + ", getR113_euro()="
				+ getR113_euro() + ", getR113_inr()=" + getR113_inr() + ", getR113_aud()=" + getR113_aud()
				+ ", getR113_emt()=" + getR113_emt() + ", getR113_total()=" + getR113_total() + ", getR114_product()="
				+ getR114_product() + ", getR114_pula()=" + getR114_pula() + ", getR114_usd()=" + getR114_usd()
				+ ", getR114_zar()=" + getR114_zar() + ", getR114_gbp()=" + getR114_gbp() + ", getR114_euro()="
				+ getR114_euro() + ", getR114_inr()=" + getR114_inr() + ", getR114_aud()=" + getR114_aud()
				+ ", getR114_emt()=" + getR114_emt() + ", getR114_total()=" + getR114_total() + ", getReport_date()="
				+ getReport_date() + ", getReport_from_date()=" + getReport_from_date() + ", getReport_to_date()="
				+ getReport_to_date() + ", getEntity_flg()=" + getEntity_flg() + ", getModify_flg()=" + getModify_flg()
				+ ", getDel_flg()=" + getDel_flg() + ", getReport_code()=" + getReport_code()
				+ ", getReport_submit_date()=" + getReport_submit_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public BRS34_T2_ENTITY(String r109_product, BigDecimal r109_pula, BigDecimal r109_usd, BigDecimal r109_zar,
			BigDecimal r109_gbp, BigDecimal r109_euro, BigDecimal r109_inr, BigDecimal r109_aud, BigDecimal r109_emt,
			BigDecimal r109_total, String r110_product, BigDecimal r110_pula, BigDecimal r110_usd, BigDecimal r110_zar,
			BigDecimal r110_gbp, BigDecimal r110_euro, BigDecimal r110_inr, BigDecimal r110_aud, BigDecimal r110_emt,
			BigDecimal r110_total, String r111_product, BigDecimal r111_pula, BigDecimal r111_usd, BigDecimal r111_zar,
			BigDecimal r111_gbp, BigDecimal r111_euro, BigDecimal r111_inr, BigDecimal r111_aud, BigDecimal r111_emt,
			BigDecimal r111_total, String r112_product, BigDecimal r112_pula, BigDecimal r112_usd, BigDecimal r112_zar,
			BigDecimal r112_gbp, BigDecimal r112_euro, BigDecimal r112_inr, BigDecimal r112_aud, BigDecimal r112_emt,
			BigDecimal r112_total, String r113_product, BigDecimal r113_pula, BigDecimal r113_usd, BigDecimal r113_zar,
			BigDecimal r113_gbp, BigDecimal r113_euro, BigDecimal r113_inr, BigDecimal r113_aud, BigDecimal r113_emt,
			BigDecimal r113_total, String r114_product, BigDecimal r114_pula, BigDecimal r114_usd, BigDecimal r114_zar,
			BigDecimal r114_gbp, BigDecimal r114_euro, BigDecimal r114_inr, BigDecimal r114_aud, BigDecimal r114_emt,
			BigDecimal r114_total, Date report_date, Date report_from_date, Date report_to_date, String entity_flg,
			String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r109_product = r109_product;
		this.r109_pula = r109_pula;
		this.r109_usd = r109_usd;
		this.r109_zar = r109_zar;
		this.r109_gbp = r109_gbp;
		this.r109_euro = r109_euro;
		this.r109_inr = r109_inr;
		this.r109_aud = r109_aud;
		this.r109_emt = r109_emt;
		this.r109_total = r109_total;
		this.r110_product = r110_product;
		this.r110_pula = r110_pula;
		this.r110_usd = r110_usd;
		this.r110_zar = r110_zar;
		this.r110_gbp = r110_gbp;
		this.r110_euro = r110_euro;
		this.r110_inr = r110_inr;
		this.r110_aud = r110_aud;
		this.r110_emt = r110_emt;
		this.r110_total = r110_total;
		this.r111_product = r111_product;
		this.r111_pula = r111_pula;
		this.r111_usd = r111_usd;
		this.r111_zar = r111_zar;
		this.r111_gbp = r111_gbp;
		this.r111_euro = r111_euro;
		this.r111_inr = r111_inr;
		this.r111_aud = r111_aud;
		this.r111_emt = r111_emt;
		this.r111_total = r111_total;
		this.r112_product = r112_product;
		this.r112_pula = r112_pula;
		this.r112_usd = r112_usd;
		this.r112_zar = r112_zar;
		this.r112_gbp = r112_gbp;
		this.r112_euro = r112_euro;
		this.r112_inr = r112_inr;
		this.r112_aud = r112_aud;
		this.r112_emt = r112_emt;
		this.r112_total = r112_total;
		this.r113_product = r113_product;
		this.r113_pula = r113_pula;
		this.r113_usd = r113_usd;
		this.r113_zar = r113_zar;
		this.r113_gbp = r113_gbp;
		this.r113_euro = r113_euro;
		this.r113_inr = r113_inr;
		this.r113_aud = r113_aud;
		this.r113_emt = r113_emt;
		this.r113_total = r113_total;
		this.r114_product = r114_product;
		this.r114_pula = r114_pula;
		this.r114_usd = r114_usd;
		this.r114_zar = r114_zar;
		this.r114_gbp = r114_gbp;
		this.r114_euro = r114_euro;
		this.r114_inr = r114_inr;
		this.r114_aud = r114_aud;
		this.r114_emt = r114_emt;
		this.r114_total = r114_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS34_T2_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}

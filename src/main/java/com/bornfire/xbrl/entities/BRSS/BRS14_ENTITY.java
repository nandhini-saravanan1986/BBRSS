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
@Table(name = "BRS14")
public class BRS14_ENTITY {
		private BigDecimal	r12_pre_ifrs;
		private BigDecimal	r12_post_ifrs;
		private BigDecimal	r12_tran_amt;
		private String	r19_fin_year;
		private BigDecimal	r19_cap;
		private BigDecimal	r19_amt_cet1;
		private String	r20_fin_year;
		private BigDecimal	r20_cap;
		private BigDecimal	r20_amt_cet1;
		private String	r21_fin_year;
		private BigDecimal	r21_cap;
		private BigDecimal	r21_amt_cet1;
		private String	r22_fin_year;
		private BigDecimal	r22_cap;
		private BigDecimal	r22_amt_cet1;
		@Id
		@Temporal(TemporalType.DATE)
		@DateTimeFormat(pattern = "dd/MM/yyyy")
		private Date	report_date ;
		private Date	report_from_date;
		private Date	report_to_date;
		private String	entity_flg ;
		private String	modify_flg ;
		private String	del_flg ;
		private String	report_code  ;
		private Date	report_submit_date ;
		public BigDecimal getR12_pre_ifrs() {
			return r12_pre_ifrs;
		}
		public void setR12_pre_ifrs(BigDecimal r12_pre_ifrs) {
			this.r12_pre_ifrs = r12_pre_ifrs;
		}
		public BigDecimal getR12_post_ifrs() {
			return r12_post_ifrs;
		}
		public void setR12_post_ifrs(BigDecimal r12_post_ifrs) {
			this.r12_post_ifrs = r12_post_ifrs;
		}
		public BigDecimal getR12_tran_amt() {
			return r12_tran_amt;
		}
		public void setR12_tran_amt(BigDecimal r12_tran_amt) {
			this.r12_tran_amt = r12_tran_amt;
		}
		public String getR19_fin_year() {
			return r19_fin_year;
		}
		public void setR19_fin_year(String r19_fin_year) {
			this.r19_fin_year = r19_fin_year;
		}
		public BigDecimal getR19_cap() {
			return r19_cap;
		}
		public void setR19_cap(BigDecimal r19_cap) {
			this.r19_cap = r19_cap;
		}
		public BigDecimal getR19_amt_cet1() {
			return r19_amt_cet1;
		}
		public void setR19_amt_cet1(BigDecimal r19_amt_cet1) {
			this.r19_amt_cet1 = r19_amt_cet1;
		}
		public String getR20_fin_year() {
			return r20_fin_year;
		}
		public void setR20_fin_year(String r20_fin_year) {
			this.r20_fin_year = r20_fin_year;
		}
		public BigDecimal getR20_cap() {
			return r20_cap;
		}
		public void setR20_cap(BigDecimal r20_cap) {
			this.r20_cap = r20_cap;
		}
		public BigDecimal getR20_amt_cet1() {
			return r20_amt_cet1;
		}
		public void setR20_amt_cet1(BigDecimal r20_amt_cet1) {
			this.r20_amt_cet1 = r20_amt_cet1;
		}
		public String getR21_fin_year() {
			return r21_fin_year;
		}
		public void setR21_fin_year(String r21_fin_year) {
			this.r21_fin_year = r21_fin_year;
		}
		public BigDecimal getR21_cap() {
			return r21_cap;
		}
		public void setR21_cap(BigDecimal r21_cap) {
			this.r21_cap = r21_cap;
		}
		public BigDecimal getR21_amt_cet1() {
			return r21_amt_cet1;
		}
		public void setR21_amt_cet1(BigDecimal r21_amt_cet1) {
			this.r21_amt_cet1 = r21_amt_cet1;
		}
		public String getR22_fin_year() {
			return r22_fin_year;
		}
		public void setR22_fin_year(String r22_fin_year) {
			this.r22_fin_year = r22_fin_year;
		}
		public BigDecimal getR22_cap() {
			return r22_cap;
		}
		public void setR22_cap(BigDecimal r22_cap) {
			this.r22_cap = r22_cap;
		}
		public BigDecimal getR22_amt_cet1() {
			return r22_amt_cet1;
		}
		public void setR22_amt_cet1(BigDecimal r22_amt_cet1) {
			this.r22_amt_cet1 = r22_amt_cet1;
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
		public BRS14_ENTITY(BigDecimal r12_pre_ifrs, BigDecimal r12_post_ifrs, BigDecimal r12_tran_amt,
				String r19_fin_year, BigDecimal r19_cap, BigDecimal r19_amt_cet1, String r20_fin_year,
				BigDecimal r20_cap, BigDecimal r20_amt_cet1, String r21_fin_year, BigDecimal r21_cap,
				BigDecimal r21_amt_cet1, String r22_fin_year, BigDecimal r22_cap, BigDecimal r22_amt_cet1,
				Date report_date, Date report_from_date, Date report_to_date, String entity_flg, String modify_flg,
				String del_flg, String report_code, Date report_submit_date) {
			super();
			this.r12_pre_ifrs = r12_pre_ifrs;
			this.r12_post_ifrs = r12_post_ifrs;
			this.r12_tran_amt = r12_tran_amt;
			this.r19_fin_year = r19_fin_year;
			this.r19_cap = r19_cap;
			this.r19_amt_cet1 = r19_amt_cet1;
			this.r20_fin_year = r20_fin_year;
			this.r20_cap = r20_cap;
			this.r20_amt_cet1 = r20_amt_cet1;
			this.r21_fin_year = r21_fin_year;
			this.r21_cap = r21_cap;
			this.r21_amt_cet1 = r21_amt_cet1;
			this.r22_fin_year = r22_fin_year;
			this.r22_cap = r22_cap;
			this.r22_amt_cet1 = r22_amt_cet1;
			this.report_date = report_date;
			this.report_from_date = report_from_date;
			this.report_to_date = report_to_date;
			this.entity_flg = entity_flg;
			this.modify_flg = modify_flg;
			this.del_flg = del_flg;
			this.report_code = report_code;
			this.report_submit_date = report_submit_date;
		}
		public BRS14_ENTITY() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}

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
@Table(name = "BRS19")
public class BRS19_ENTITY {
	private String	r12_loan_to_val;
	private BigDecimal	r12_per_exp_res_mor;
	private BigDecimal	r12_non_per_exp_res_mor;
	private BigDecimal	r12_spec_prov_res_mor;
	private BigDecimal	r12_sp_unsec_por_res_mor;
	private BigDecimal	r12_total;
	private String	r13_loan_to_val;
	private BigDecimal	r13_per_exp_res_mor;
	private BigDecimal	r13_non_per_exp_res_mor;
	private BigDecimal	r13_spec_prov_res_mor;
	private BigDecimal	r13_sp_unsec_por_res_mor;
	private BigDecimal	r13_total;
	private String	r14_loan_to_val;
	private BigDecimal	r14_per_exp_res_mor;
	private BigDecimal	r14_non_per_exp_res_mor;
	private BigDecimal	r14_spec_prov_res_mor;
	private BigDecimal	r14_sp_unsec_por_res_mor;
	private BigDecimal	r14_total;
	private String	r15_loan_to_val;
	private BigDecimal	r15_per_exp_res_mor;
	private BigDecimal	r15_non_per_exp_res_mor;
	private BigDecimal	r15_spec_prov_res_mor;
	private BigDecimal	r15_sp_unsec_por_res_mor;
	private BigDecimal	r15_total;
	private String	r16_loan_to_val;
	private BigDecimal	r16_per_exp_res_mor;
	private BigDecimal	r16_non_per_exp_res_mor;
	private BigDecimal	r16_spec_prov_res_mor;
	private BigDecimal	r16_sp_unsec_por_res_mor;
	private BigDecimal	r16_total;
	private String	r17_loan_to_val;
	private BigDecimal	r17_per_exp_res_mor;
	private BigDecimal	r17_non_per_exp_res_mor;
	private BigDecimal	r17_spec_prov_res_mor;
	private BigDecimal	r17_sp_unsec_por_res_mor;
	private BigDecimal	r17_total;
	private String	r18_loan_to_val;
	private BigDecimal	r18_per_exp_res_mor;
	private BigDecimal	r18_non_per_exp_res_mor;
	private BigDecimal	r18_spec_prov_res_mor;
	private BigDecimal	r18_sp_unsec_por_res_mor;
	private BigDecimal	r18_total;
	private String	r19_loan_to_val;
	private BigDecimal	r19_per_exp_res_mor;
	private BigDecimal	r19_non_per_exp_res_mor;
	private BigDecimal	r19_spec_prov_res_mor;
	private BigDecimal	r19_sp_unsec_por_res_mor;
	private BigDecimal	r19_total;
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
	public String getR12_loan_to_val() {
		return r12_loan_to_val;
	}
	public void setR12_loan_to_val(String r12_loan_to_val) {
		this.r12_loan_to_val = r12_loan_to_val;
	}
	public BigDecimal getR12_per_exp_res_mor() {
		return r12_per_exp_res_mor;
	}
	public void setR12_per_exp_res_mor(BigDecimal r12_per_exp_res_mor) {
		this.r12_per_exp_res_mor = r12_per_exp_res_mor;
	}
	public BigDecimal getR12_non_per_exp_res_mor() {
		return r12_non_per_exp_res_mor;
	}
	public void setR12_non_per_exp_res_mor(BigDecimal r12_non_per_exp_res_mor) {
		this.r12_non_per_exp_res_mor = r12_non_per_exp_res_mor;
	}
	public BigDecimal getR12_spec_prov_res_mor() {
		return r12_spec_prov_res_mor;
	}
	public void setR12_spec_prov_res_mor(BigDecimal r12_spec_prov_res_mor) {
		this.r12_spec_prov_res_mor = r12_spec_prov_res_mor;
	}
	public BigDecimal getR12_sp_unsec_por_res_mor() {
		return r12_sp_unsec_por_res_mor;
	}
	public void setR12_sp_unsec_por_res_mor(BigDecimal r12_sp_unsec_por_res_mor) {
		this.r12_sp_unsec_por_res_mor = r12_sp_unsec_por_res_mor;
	}
	public BigDecimal getR12_total() {
		return r12_total;
	}
	public void setR12_total(BigDecimal r12_total) {
		this.r12_total = r12_total;
	}
	public String getR13_loan_to_val() {
		return r13_loan_to_val;
	}
	public void setR13_loan_to_val(String r13_loan_to_val) {
		this.r13_loan_to_val = r13_loan_to_val;
	}
	public BigDecimal getR13_per_exp_res_mor() {
		return r13_per_exp_res_mor;
	}
	public void setR13_per_exp_res_mor(BigDecimal r13_per_exp_res_mor) {
		this.r13_per_exp_res_mor = r13_per_exp_res_mor;
	}
	public BigDecimal getR13_non_per_exp_res_mor() {
		return r13_non_per_exp_res_mor;
	}
	public void setR13_non_per_exp_res_mor(BigDecimal r13_non_per_exp_res_mor) {
		this.r13_non_per_exp_res_mor = r13_non_per_exp_res_mor;
	}
	public BigDecimal getR13_spec_prov_res_mor() {
		return r13_spec_prov_res_mor;
	}
	public void setR13_spec_prov_res_mor(BigDecimal r13_spec_prov_res_mor) {
		this.r13_spec_prov_res_mor = r13_spec_prov_res_mor;
	}
	public BigDecimal getR13_sp_unsec_por_res_mor() {
		return r13_sp_unsec_por_res_mor;
	}
	public void setR13_sp_unsec_por_res_mor(BigDecimal r13_sp_unsec_por_res_mor) {
		this.r13_sp_unsec_por_res_mor = r13_sp_unsec_por_res_mor;
	}
	public BigDecimal getR13_total() {
		return r13_total;
	}
	public void setR13_total(BigDecimal r13_total) {
		this.r13_total = r13_total;
	}
	public String getR14_loan_to_val() {
		return r14_loan_to_val;
	}
	public void setR14_loan_to_val(String r14_loan_to_val) {
		this.r14_loan_to_val = r14_loan_to_val;
	}
	public BigDecimal getR14_per_exp_res_mor() {
		return r14_per_exp_res_mor;
	}
	public void setR14_per_exp_res_mor(BigDecimal r14_per_exp_res_mor) {
		this.r14_per_exp_res_mor = r14_per_exp_res_mor;
	}
	public BigDecimal getR14_non_per_exp_res_mor() {
		return r14_non_per_exp_res_mor;
	}
	public void setR14_non_per_exp_res_mor(BigDecimal r14_non_per_exp_res_mor) {
		this.r14_non_per_exp_res_mor = r14_non_per_exp_res_mor;
	}
	public BigDecimal getR14_spec_prov_res_mor() {
		return r14_spec_prov_res_mor;
	}
	public void setR14_spec_prov_res_mor(BigDecimal r14_spec_prov_res_mor) {
		this.r14_spec_prov_res_mor = r14_spec_prov_res_mor;
	}
	public BigDecimal getR14_sp_unsec_por_res_mor() {
		return r14_sp_unsec_por_res_mor;
	}
	public void setR14_sp_unsec_por_res_mor(BigDecimal r14_sp_unsec_por_res_mor) {
		this.r14_sp_unsec_por_res_mor = r14_sp_unsec_por_res_mor;
	}
	public BigDecimal getR14_total() {
		return r14_total;
	}
	public void setR14_total(BigDecimal r14_total) {
		this.r14_total = r14_total;
	}
	public String getR15_loan_to_val() {
		return r15_loan_to_val;
	}
	public void setR15_loan_to_val(String r15_loan_to_val) {
		this.r15_loan_to_val = r15_loan_to_val;
	}
	public BigDecimal getR15_per_exp_res_mor() {
		return r15_per_exp_res_mor;
	}
	public void setR15_per_exp_res_mor(BigDecimal r15_per_exp_res_mor) {
		this.r15_per_exp_res_mor = r15_per_exp_res_mor;
	}
	public BigDecimal getR15_non_per_exp_res_mor() {
		return r15_non_per_exp_res_mor;
	}
	public void setR15_non_per_exp_res_mor(BigDecimal r15_non_per_exp_res_mor) {
		this.r15_non_per_exp_res_mor = r15_non_per_exp_res_mor;
	}
	public BigDecimal getR15_spec_prov_res_mor() {
		return r15_spec_prov_res_mor;
	}
	public void setR15_spec_prov_res_mor(BigDecimal r15_spec_prov_res_mor) {
		this.r15_spec_prov_res_mor = r15_spec_prov_res_mor;
	}
	public BigDecimal getR15_sp_unsec_por_res_mor() {
		return r15_sp_unsec_por_res_mor;
	}
	public void setR15_sp_unsec_por_res_mor(BigDecimal r15_sp_unsec_por_res_mor) {
		this.r15_sp_unsec_por_res_mor = r15_sp_unsec_por_res_mor;
	}
	public BigDecimal getR15_total() {
		return r15_total;
	}
	public void setR15_total(BigDecimal r15_total) {
		this.r15_total = r15_total;
	}
	public String getR16_loan_to_val() {
		return r16_loan_to_val;
	}
	public void setR16_loan_to_val(String r16_loan_to_val) {
		this.r16_loan_to_val = r16_loan_to_val;
	}
	public BigDecimal getR16_per_exp_res_mor() {
		return r16_per_exp_res_mor;
	}
	public void setR16_per_exp_res_mor(BigDecimal r16_per_exp_res_mor) {
		this.r16_per_exp_res_mor = r16_per_exp_res_mor;
	}
	public BigDecimal getR16_non_per_exp_res_mor() {
		return r16_non_per_exp_res_mor;
	}
	public void setR16_non_per_exp_res_mor(BigDecimal r16_non_per_exp_res_mor) {
		this.r16_non_per_exp_res_mor = r16_non_per_exp_res_mor;
	}
	public BigDecimal getR16_spec_prov_res_mor() {
		return r16_spec_prov_res_mor;
	}
	public void setR16_spec_prov_res_mor(BigDecimal r16_spec_prov_res_mor) {
		this.r16_spec_prov_res_mor = r16_spec_prov_res_mor;
	}
	public BigDecimal getR16_sp_unsec_por_res_mor() {
		return r16_sp_unsec_por_res_mor;
	}
	public void setR16_sp_unsec_por_res_mor(BigDecimal r16_sp_unsec_por_res_mor) {
		this.r16_sp_unsec_por_res_mor = r16_sp_unsec_por_res_mor;
	}
	public BigDecimal getR16_total() {
		return r16_total;
	}
	public void setR16_total(BigDecimal r16_total) {
		this.r16_total = r16_total;
	}
	public String getR17_loan_to_val() {
		return r17_loan_to_val;
	}
	public void setR17_loan_to_val(String r17_loan_to_val) {
		this.r17_loan_to_val = r17_loan_to_val;
	}
	public BigDecimal getR17_per_exp_res_mor() {
		return r17_per_exp_res_mor;
	}
	public void setR17_per_exp_res_mor(BigDecimal r17_per_exp_res_mor) {
		this.r17_per_exp_res_mor = r17_per_exp_res_mor;
	}
	public BigDecimal getR17_non_per_exp_res_mor() {
		return r17_non_per_exp_res_mor;
	}
	public void setR17_non_per_exp_res_mor(BigDecimal r17_non_per_exp_res_mor) {
		this.r17_non_per_exp_res_mor = r17_non_per_exp_res_mor;
	}
	public BigDecimal getR17_spec_prov_res_mor() {
		return r17_spec_prov_res_mor;
	}
	public void setR17_spec_prov_res_mor(BigDecimal r17_spec_prov_res_mor) {
		this.r17_spec_prov_res_mor = r17_spec_prov_res_mor;
	}
	public BigDecimal getR17_sp_unsec_por_res_mor() {
		return r17_sp_unsec_por_res_mor;
	}
	public void setR17_sp_unsec_por_res_mor(BigDecimal r17_sp_unsec_por_res_mor) {
		this.r17_sp_unsec_por_res_mor = r17_sp_unsec_por_res_mor;
	}
	public BigDecimal getR17_total() {
		return r17_total;
	}
	public void setR17_total(BigDecimal r17_total) {
		this.r17_total = r17_total;
	}
	public String getR18_loan_to_val() {
		return r18_loan_to_val;
	}
	public void setR18_loan_to_val(String r18_loan_to_val) {
		this.r18_loan_to_val = r18_loan_to_val;
	}
	public BigDecimal getR18_per_exp_res_mor() {
		return r18_per_exp_res_mor;
	}
	public void setR18_per_exp_res_mor(BigDecimal r18_per_exp_res_mor) {
		this.r18_per_exp_res_mor = r18_per_exp_res_mor;
	}
	public BigDecimal getR18_non_per_exp_res_mor() {
		return r18_non_per_exp_res_mor;
	}
	public void setR18_non_per_exp_res_mor(BigDecimal r18_non_per_exp_res_mor) {
		this.r18_non_per_exp_res_mor = r18_non_per_exp_res_mor;
	}
	public BigDecimal getR18_spec_prov_res_mor() {
		return r18_spec_prov_res_mor;
	}
	public void setR18_spec_prov_res_mor(BigDecimal r18_spec_prov_res_mor) {
		this.r18_spec_prov_res_mor = r18_spec_prov_res_mor;
	}
	public BigDecimal getR18_sp_unsec_por_res_mor() {
		return r18_sp_unsec_por_res_mor;
	}
	public void setR18_sp_unsec_por_res_mor(BigDecimal r18_sp_unsec_por_res_mor) {
		this.r18_sp_unsec_por_res_mor = r18_sp_unsec_por_res_mor;
	}
	public BigDecimal getR18_total() {
		return r18_total;
	}
	public void setR18_total(BigDecimal r18_total) {
		this.r18_total = r18_total;
	}
	public String getR19_loan_to_val() {
		return r19_loan_to_val;
	}
	public void setR19_loan_to_val(String r19_loan_to_val) {
		this.r19_loan_to_val = r19_loan_to_val;
	}
	public BigDecimal getR19_per_exp_res_mor() {
		return r19_per_exp_res_mor;
	}
	public void setR19_per_exp_res_mor(BigDecimal r19_per_exp_res_mor) {
		this.r19_per_exp_res_mor = r19_per_exp_res_mor;
	}
	public BigDecimal getR19_non_per_exp_res_mor() {
		return r19_non_per_exp_res_mor;
	}
	public void setR19_non_per_exp_res_mor(BigDecimal r19_non_per_exp_res_mor) {
		this.r19_non_per_exp_res_mor = r19_non_per_exp_res_mor;
	}
	public BigDecimal getR19_spec_prov_res_mor() {
		return r19_spec_prov_res_mor;
	}
	public void setR19_spec_prov_res_mor(BigDecimal r19_spec_prov_res_mor) {
		this.r19_spec_prov_res_mor = r19_spec_prov_res_mor;
	}
	public BigDecimal getR19_sp_unsec_por_res_mor() {
		return r19_sp_unsec_por_res_mor;
	}
	public void setR19_sp_unsec_por_res_mor(BigDecimal r19_sp_unsec_por_res_mor) {
		this.r19_sp_unsec_por_res_mor = r19_sp_unsec_por_res_mor;
	}
	public BigDecimal getR19_total() {
		return r19_total;
	}
	public void setR19_total(BigDecimal r19_total) {
		this.r19_total = r19_total;
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
	public BRS19_ENTITY(String r12_loan_to_val, BigDecimal r12_per_exp_res_mor, BigDecimal r12_non_per_exp_res_mor,
			BigDecimal r12_spec_prov_res_mor, BigDecimal r12_sp_unsec_por_res_mor, BigDecimal r12_total,
			String r13_loan_to_val, BigDecimal r13_per_exp_res_mor, BigDecimal r13_non_per_exp_res_mor,
			BigDecimal r13_spec_prov_res_mor, BigDecimal r13_sp_unsec_por_res_mor, BigDecimal r13_total,
			String r14_loan_to_val, BigDecimal r14_per_exp_res_mor, BigDecimal r14_non_per_exp_res_mor,
			BigDecimal r14_spec_prov_res_mor, BigDecimal r14_sp_unsec_por_res_mor, BigDecimal r14_total,
			String r15_loan_to_val, BigDecimal r15_per_exp_res_mor, BigDecimal r15_non_per_exp_res_mor,
			BigDecimal r15_spec_prov_res_mor, BigDecimal r15_sp_unsec_por_res_mor, BigDecimal r15_total,
			String r16_loan_to_val, BigDecimal r16_per_exp_res_mor, BigDecimal r16_non_per_exp_res_mor,
			BigDecimal r16_spec_prov_res_mor, BigDecimal r16_sp_unsec_por_res_mor, BigDecimal r16_total,
			String r17_loan_to_val, BigDecimal r17_per_exp_res_mor, BigDecimal r17_non_per_exp_res_mor,
			BigDecimal r17_spec_prov_res_mor, BigDecimal r17_sp_unsec_por_res_mor, BigDecimal r17_total,
			String r18_loan_to_val, BigDecimal r18_per_exp_res_mor, BigDecimal r18_non_per_exp_res_mor,
			BigDecimal r18_spec_prov_res_mor, BigDecimal r18_sp_unsec_por_res_mor, BigDecimal r18_total,
			String r19_loan_to_val, BigDecimal r19_per_exp_res_mor, BigDecimal r19_non_per_exp_res_mor,
			BigDecimal r19_spec_prov_res_mor, BigDecimal r19_sp_unsec_por_res_mor, BigDecimal r19_total,
			Date report_date, Date report_from_date, Date report_to_date, String entity_flg, String modify_flg,
			String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r12_loan_to_val = r12_loan_to_val;
		this.r12_per_exp_res_mor = r12_per_exp_res_mor;
		this.r12_non_per_exp_res_mor = r12_non_per_exp_res_mor;
		this.r12_spec_prov_res_mor = r12_spec_prov_res_mor;
		this.r12_sp_unsec_por_res_mor = r12_sp_unsec_por_res_mor;
		this.r12_total = r12_total;
		this.r13_loan_to_val = r13_loan_to_val;
		this.r13_per_exp_res_mor = r13_per_exp_res_mor;
		this.r13_non_per_exp_res_mor = r13_non_per_exp_res_mor;
		this.r13_spec_prov_res_mor = r13_spec_prov_res_mor;
		this.r13_sp_unsec_por_res_mor = r13_sp_unsec_por_res_mor;
		this.r13_total = r13_total;
		this.r14_loan_to_val = r14_loan_to_val;
		this.r14_per_exp_res_mor = r14_per_exp_res_mor;
		this.r14_non_per_exp_res_mor = r14_non_per_exp_res_mor;
		this.r14_spec_prov_res_mor = r14_spec_prov_res_mor;
		this.r14_sp_unsec_por_res_mor = r14_sp_unsec_por_res_mor;
		this.r14_total = r14_total;
		this.r15_loan_to_val = r15_loan_to_val;
		this.r15_per_exp_res_mor = r15_per_exp_res_mor;
		this.r15_non_per_exp_res_mor = r15_non_per_exp_res_mor;
		this.r15_spec_prov_res_mor = r15_spec_prov_res_mor;
		this.r15_sp_unsec_por_res_mor = r15_sp_unsec_por_res_mor;
		this.r15_total = r15_total;
		this.r16_loan_to_val = r16_loan_to_val;
		this.r16_per_exp_res_mor = r16_per_exp_res_mor;
		this.r16_non_per_exp_res_mor = r16_non_per_exp_res_mor;
		this.r16_spec_prov_res_mor = r16_spec_prov_res_mor;
		this.r16_sp_unsec_por_res_mor = r16_sp_unsec_por_res_mor;
		this.r16_total = r16_total;
		this.r17_loan_to_val = r17_loan_to_val;
		this.r17_per_exp_res_mor = r17_per_exp_res_mor;
		this.r17_non_per_exp_res_mor = r17_non_per_exp_res_mor;
		this.r17_spec_prov_res_mor = r17_spec_prov_res_mor;
		this.r17_sp_unsec_por_res_mor = r17_sp_unsec_por_res_mor;
		this.r17_total = r17_total;
		this.r18_loan_to_val = r18_loan_to_val;
		this.r18_per_exp_res_mor = r18_per_exp_res_mor;
		this.r18_non_per_exp_res_mor = r18_non_per_exp_res_mor;
		this.r18_spec_prov_res_mor = r18_spec_prov_res_mor;
		this.r18_sp_unsec_por_res_mor = r18_sp_unsec_por_res_mor;
		this.r18_total = r18_total;
		this.r19_loan_to_val = r19_loan_to_val;
		this.r19_per_exp_res_mor = r19_per_exp_res_mor;
		this.r19_non_per_exp_res_mor = r19_non_per_exp_res_mor;
		this.r19_spec_prov_res_mor = r19_spec_prov_res_mor;
		this.r19_sp_unsec_por_res_mor = r19_sp_unsec_por_res_mor;
		this.r19_total = r19_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRS19_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

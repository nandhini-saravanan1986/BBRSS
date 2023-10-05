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
@Table(name="BRS30_TABLE")

public class BRS30_ENTITY {
	
	private String	r11_currency;
	private BigDecimal	r11_net_spot_position;
	private BigDecimal	r11_net_forward_position;
	private BigDecimal	r11_guarantees;
	private BigDecimal	r11_net_future_income_expenses;
	private BigDecimal	r11_net_delta_weighted_fxop;
	private BigDecimal	r11_other_items;
	private BigDecimal	r11_net_long_position;
	private BigDecimal	r11_or;
	private BigDecimal	r11_net_short_position;
	private BigDecimal	r11_r1;
	private BigDecimal	r11_r2;
	private BigDecimal	r11_r3;
	private BigDecimal	r11_r4;
	private BigDecimal	r11_r5;
	private String	r12_currency;
	private BigDecimal	r12_net_spot_position;
	private BigDecimal	r12_net_forward_position;
	private BigDecimal	r12_guarantees;
	private BigDecimal	r12_net_future_income_expenses;
	private BigDecimal	r12_net_delta_weighted_fxop;
	private BigDecimal	r12_other_items;
	private BigDecimal	r12_net_long_position;
	private BigDecimal	r12_or;
	private BigDecimal	r12_net_short_position;
	private BigDecimal	r12_r1;
	private BigDecimal	r12_r2;
	private BigDecimal	r12_r3;
	private BigDecimal	r12_r4;
	private BigDecimal	r12_r5;
	private String	r13_currency;
	private BigDecimal	r13_net_spot_position;
	private BigDecimal	r13_net_forward_position;
	private BigDecimal	r13_guarantees;
	private BigDecimal	r13_net_future_income_expenses;
	private BigDecimal	r13_net_delta_weighted_fxop;
	private BigDecimal	r13_other_items;
	private BigDecimal	r13_net_long_position;
	private BigDecimal	r13_or;
	private BigDecimal	r13_net_short_position;
	private BigDecimal	r13_r1;
	private BigDecimal	r13_r2;
	private BigDecimal	r13_r3;
	private BigDecimal	r13_r4;
	private BigDecimal	r13_r5;
	private String	r14_currency;
	private BigDecimal	r14_net_spot_position;
	private BigDecimal	r14_net_forward_position;
	private BigDecimal	r14_guarantees;
	private BigDecimal	r14_net_future_income_expenses;
	private BigDecimal	r14_net_delta_weighted_fxop;
	private BigDecimal	r14_other_items;
	private BigDecimal	r14_net_long_position;
	private BigDecimal	r14_or;
	private BigDecimal	r14_net_short_position;
	private BigDecimal	r14_r1;
	private BigDecimal	r14_r2;
	private BigDecimal	r14_r3;
	private BigDecimal	r14_r4;
	private BigDecimal	r14_r5;
	private String	r15_currency;
	private BigDecimal	r15_net_spot_position;
	private BigDecimal	r15_net_forward_position;
	private BigDecimal	r15_guarantees;
	private BigDecimal	r15_net_future_income_expenses;
	private BigDecimal	r15_net_delta_weighted_fxop;
	private BigDecimal	r15_other_items;
	private BigDecimal	r15_net_long_position;
	private BigDecimal	r15_or;
	private BigDecimal	r15_net_short_position;
	private BigDecimal	r15_r1;
	private BigDecimal	r15_r2;
	private BigDecimal	r15_r3;
	private BigDecimal	r15_r4;
	private BigDecimal	r15_r5;
	private String	r16_currency;
	private BigDecimal	r16_net_spot_position;
	private BigDecimal	r16_net_forward_position;
	private BigDecimal	r16_guarantees;
	private BigDecimal	r16_net_future_income_expenses;
	private BigDecimal	r16_net_delta_weighted_fxop;
	private BigDecimal	r16_other_items;
	private BigDecimal	r16_net_long_position;
	private BigDecimal	r16_or;
	private BigDecimal	r16_net_short_position;
	private BigDecimal	r16_r1;
	private BigDecimal	r16_r2;
	private BigDecimal	r16_r3;
	private BigDecimal	r16_r4;
	private BigDecimal	r16_r5;
	private String	r17_currency;
	private BigDecimal	r17_net_spot_position;
	private BigDecimal	r17_net_forward_position;
	private BigDecimal	r17_guarantees;
	private BigDecimal	r17_net_future_income_expenses;
	private BigDecimal	r17_net_delta_weighted_fxop;
	private BigDecimal	r17_other_items;
	private BigDecimal	r17_net_long_position;
	private BigDecimal	r17_or;
	private BigDecimal	r17_net_short_position;
	private BigDecimal	r17_r1;
	private BigDecimal	r17_r2;
	private BigDecimal	r17_r3;
	private BigDecimal	r17_r4;
	private BigDecimal	r17_r5;
	private String	r18_currency;
	private BigDecimal	r18_net_spot_position;
	private BigDecimal	r18_net_forward_position;
	private BigDecimal	r18_guarantees;
	private BigDecimal	r18_net_future_income_expenses;
	private BigDecimal	r18_net_delta_weighted_fxop;
	private BigDecimal	r18_other_items;
	private BigDecimal	r18_net_long_position;
	private BigDecimal	r18_or;
	private BigDecimal	r18_net_short_position;
	private BigDecimal	r18_r1;
	private BigDecimal	r18_r2;
	private BigDecimal	r18_r3;
	private BigDecimal	r18_r4;
	private BigDecimal	r18_r5;
	private String	r19_currency;
	private BigDecimal	r19_net_spot_position;
	private BigDecimal	r19_net_forward_position;
	private BigDecimal	r19_guarantees;
	private BigDecimal	r19_net_future_income_expenses;
	private BigDecimal	r19_net_delta_weighted_fxop;
	private BigDecimal	r19_other_items;
	private BigDecimal	r19_net_long_position;
	private BigDecimal	r19_or;
	private BigDecimal	r19_net_short_position;
	private BigDecimal	r19_r1;
	private BigDecimal	r19_r2;
	private BigDecimal	r19_r3;
	private BigDecimal	r19_r4;
	private BigDecimal	r19_r5;
	private String	r20_currency;
	private BigDecimal	r20_net_spot_position;
	private BigDecimal	r20_net_forward_position;
	private BigDecimal	r20_guarantees;
	private BigDecimal	r20_net_future_income_expenses;
	private BigDecimal	r20_net_delta_weighted_fxop;
	private BigDecimal	r20_other_items;
	private BigDecimal	r20_net_long_position;
	private BigDecimal	r20_or;
	private BigDecimal	r20_net_short_position;
	private BigDecimal	r20_r1;
	private BigDecimal	r20_r2;
	private BigDecimal	r20_r3;
	private BigDecimal	r20_r4;
	private BigDecimal	r20_r5;
	private String	r21_currency;
	private BigDecimal	r21_net_spot_position;
	private BigDecimal	r21_net_forward_position;
	private BigDecimal	r21_guarantees;
	private BigDecimal	r21_net_future_income_expenses;
	private BigDecimal	r21_net_delta_weighted_fxop;
	private BigDecimal	r21_other_items;
	private BigDecimal	r21_net_long_position;
	private BigDecimal	r21_or;
	private BigDecimal	r21_net_short_position;
	private BigDecimal	r21_r1;
	private BigDecimal	r21_r2;
	private BigDecimal	r21_r3;
	private BigDecimal	r21_r4;
	private BigDecimal	r21_r5;
	private String	r22_currency;
	private BigDecimal	r22_net_spot_position;
	private BigDecimal	r22_net_forward_position;
	private BigDecimal	r22_guarantees;
	private BigDecimal	r22_net_future_income_expenses;
	private BigDecimal	r22_net_delta_weighted_fxop;
	private BigDecimal	r22_other_items;
	private BigDecimal	r22_net_long_position;
	private BigDecimal	r22_or;
	private BigDecimal	r22_net_short_position;
	private BigDecimal	r22_r1;
	private BigDecimal	r22_r2;
	private BigDecimal	r22_r3;
	private BigDecimal	r22_r4;
	private BigDecimal	r22_r5;
	private String	r23_currency;
	private BigDecimal	r23_net_spot_position;
	private BigDecimal	r23_net_forward_position;
	private BigDecimal	r23_guarantees;
	private BigDecimal	r23_net_future_income_expenses;
	private BigDecimal	r23_net_delta_weighted_fxop;
	private BigDecimal	r23_other_items;
	private BigDecimal	r23_net_long_position;
	private BigDecimal	r23_or;
	private BigDecimal	r23_net_short_position;
	private BigDecimal	r23_r1;
	private BigDecimal	r23_r2;
	private BigDecimal	r23_r3;
	private BigDecimal	r23_r4;
	private BigDecimal	r23_r5;
	private String	r24_currency;
	private BigDecimal	r24_net_spot_position;
	private BigDecimal	r24_net_forward_position;
	private BigDecimal	r24_guarantees;
	private BigDecimal	r24_net_future_income_expenses;
	private BigDecimal	r24_net_delta_weighted_fxop;
	private BigDecimal	r24_other_items;
	private BigDecimal	r24_net_long_position;
	private BigDecimal	r24_or;
	private BigDecimal	r24_net_short_position;
	private BigDecimal	r24_r1;
	private BigDecimal	r24_r2;
	private BigDecimal	r24_r3;
	private BigDecimal	r24_r4;
	private BigDecimal	r24_r5;
	private String	r25_currency;
	private BigDecimal	r25_net_spot_position;
	private BigDecimal	r25_net_forward_position;
	private BigDecimal	r25_guarantees;
	private BigDecimal	r25_net_future_income_expenses;
	private BigDecimal	r25_net_delta_weighted_fxop;
	private BigDecimal	r25_other_items;
	private BigDecimal	r25_net_long_position;
	private BigDecimal	r25_or;
	private BigDecimal	r25_net_short_position;
	private BigDecimal	r25_r1;
	private BigDecimal	r25_r2;
	private BigDecimal	r25_r3;
	private BigDecimal	r25_r4;
	private BigDecimal	r25_r5;
	private String	r26_currency;
	private BigDecimal	r26_net_spot_position;
	private BigDecimal	r26_net_forward_position;
	private BigDecimal	r26_guarantees;
	private BigDecimal	r26_net_future_income_expenses;
	private BigDecimal	r26_net_delta_weighted_fxop;
	private BigDecimal	r26_other_items;
	private BigDecimal	r26_net_long_position;
	private BigDecimal	r26_or;
	private BigDecimal	r26_net_short_position;
	private BigDecimal	r26_r1;
	private BigDecimal	r26_r2;
	private BigDecimal	r26_r3;
	private BigDecimal	r26_r4;
	private BigDecimal	r26_r5;
	private String	r27_currency;
	private BigDecimal	r27_net_spot_position;
	private BigDecimal	r27_net_forward_position;
	private BigDecimal	r27_guarantees;
	private BigDecimal	r27_net_future_income_expenses;
	private BigDecimal	r27_net_delta_weighted_fxop;
	private BigDecimal	r27_other_items;
	private BigDecimal	r27_net_long_position;
	private BigDecimal	r27_or;
	private BigDecimal	r27_net_short_position;
	private BigDecimal	r27_r1;
	private BigDecimal	r27_r2;
	private BigDecimal	r27_r3;
	private BigDecimal	r27_r4;
	private BigDecimal	r27_r5;
	private String	r28_currency;
	private BigDecimal	r28_net_spot_position;
	private BigDecimal	r28_net_forward_position;
	private BigDecimal	r28_guarantees;
	private BigDecimal	r28_net_future_income_expenses;
	private BigDecimal	r28_net_delta_weighted_fxop;
	private BigDecimal	r28_other_items;
	private BigDecimal	r28_net_long_position;
	private BigDecimal	r28_or;
	private BigDecimal	r28_net_short_position;
	private BigDecimal	r28_r1;
	private BigDecimal	r28_r2;
	private BigDecimal	r28_r3;
	private BigDecimal	r28_r4;
	private BigDecimal	r28_r5;
	private String	r29_currency;
	private BigDecimal	r29_net_spot_position;
	private BigDecimal	r29_net_forward_position;
	private BigDecimal	r29_guarantees;
	private BigDecimal	r29_net_future_income_expenses;
	private BigDecimal	r29_net_delta_weighted_fxop;
	private BigDecimal	r29_other_items;
	private BigDecimal	r29_net_long_position;
	private BigDecimal	r29_or;
	private BigDecimal	r29_net_short_position;
	private BigDecimal	r29_r1;
	private BigDecimal	r29_r2;
	private BigDecimal	r29_r3;
	private BigDecimal	r29_r4;
	private BigDecimal	r29_r5;
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
	public String getR11_currency() {
		return r11_currency;
	}
	public void setR11_currency(String r11_currency) {
		this.r11_currency = r11_currency;
	}
	public BigDecimal getR11_net_spot_position() {
		return r11_net_spot_position;
	}
	public void setR11_net_spot_position(BigDecimal r11_net_spot_position) {
		this.r11_net_spot_position = r11_net_spot_position;
	}
	public BigDecimal getR11_net_forward_position() {
		return r11_net_forward_position;
	}
	public void setR11_net_forward_position(BigDecimal r11_net_forward_position) {
		this.r11_net_forward_position = r11_net_forward_position;
	}
	public BigDecimal getR11_guarantees() {
		return r11_guarantees;
	}
	public void setR11_guarantees(BigDecimal r11_guarantees) {
		this.r11_guarantees = r11_guarantees;
	}
	public BigDecimal getR11_net_future_income_expenses() {
		return r11_net_future_income_expenses;
	}
	public void setR11_net_future_income_expenses(BigDecimal r11_net_future_income_expenses) {
		this.r11_net_future_income_expenses = r11_net_future_income_expenses;
	}
	public BigDecimal getR11_net_delta_weighted_fxop() {
		return r11_net_delta_weighted_fxop;
	}
	public void setR11_net_delta_weighted_fxop(BigDecimal r11_net_delta_weighted_fxop) {
		this.r11_net_delta_weighted_fxop = r11_net_delta_weighted_fxop;
	}
	public BigDecimal getR11_other_items() {
		return r11_other_items;
	}
	public void setR11_other_items(BigDecimal r11_other_items) {
		this.r11_other_items = r11_other_items;
	}
	public BigDecimal getR11_net_long_position() {
		return r11_net_long_position;
	}
	public void setR11_net_long_position(BigDecimal r11_net_long_position) {
		this.r11_net_long_position = r11_net_long_position;
	}
	public BigDecimal getR11_or() {
		return r11_or;
	}
	public void setR11_or(BigDecimal r11_or) {
		this.r11_or = r11_or;
	}
	public BigDecimal getR11_net_short_position() {
		return r11_net_short_position;
	}
	public void setR11_net_short_position(BigDecimal r11_net_short_position) {
		this.r11_net_short_position = r11_net_short_position;
	}
	public BigDecimal getR11_r1() {
		return r11_r1;
	}
	public void setR11_r1(BigDecimal r11_r1) {
		this.r11_r1 = r11_r1;
	}
	public BigDecimal getR11_r2() {
		return r11_r2;
	}
	public void setR11_r2(BigDecimal r11_r2) {
		this.r11_r2 = r11_r2;
	}
	public BigDecimal getR11_r3() {
		return r11_r3;
	}
	public void setR11_r3(BigDecimal r11_r3) {
		this.r11_r3 = r11_r3;
	}
	public BigDecimal getR11_r4() {
		return r11_r4;
	}
	public void setR11_r4(BigDecimal r11_r4) {
		this.r11_r4 = r11_r4;
	}
	public BigDecimal getR11_r5() {
		return r11_r5;
	}
	public void setR11_r5(BigDecimal r11_r5) {
		this.r11_r5 = r11_r5;
	}
	public String getR12_currency() {
		return r12_currency;
	}
	public void setR12_currency(String r12_currency) {
		this.r12_currency = r12_currency;
	}
	public BigDecimal getR12_net_spot_position() {
		return r12_net_spot_position;
	}
	public void setR12_net_spot_position(BigDecimal r12_net_spot_position) {
		this.r12_net_spot_position = r12_net_spot_position;
	}
	public BigDecimal getR12_net_forward_position() {
		return r12_net_forward_position;
	}
	public void setR12_net_forward_position(BigDecimal r12_net_forward_position) {
		this.r12_net_forward_position = r12_net_forward_position;
	}
	public BigDecimal getR12_guarantees() {
		return r12_guarantees;
	}
	public void setR12_guarantees(BigDecimal r12_guarantees) {
		this.r12_guarantees = r12_guarantees;
	}
	public BigDecimal getR12_net_future_income_expenses() {
		return r12_net_future_income_expenses;
	}
	public void setR12_net_future_income_expenses(BigDecimal r12_net_future_income_expenses) {
		this.r12_net_future_income_expenses = r12_net_future_income_expenses;
	}
	public BigDecimal getR12_net_delta_weighted_fxop() {
		return r12_net_delta_weighted_fxop;
	}
	public void setR12_net_delta_weighted_fxop(BigDecimal r12_net_delta_weighted_fxop) {
		this.r12_net_delta_weighted_fxop = r12_net_delta_weighted_fxop;
	}
	public BigDecimal getR12_other_items() {
		return r12_other_items;
	}
	public void setR12_other_items(BigDecimal r12_other_items) {
		this.r12_other_items = r12_other_items;
	}
	public BigDecimal getR12_net_long_position() {
		return r12_net_long_position;
	}
	public void setR12_net_long_position(BigDecimal r12_net_long_position) {
		this.r12_net_long_position = r12_net_long_position;
	}
	public BigDecimal getR12_or() {
		return r12_or;
	}
	public void setR12_or(BigDecimal r12_or) {
		this.r12_or = r12_or;
	}
	public BigDecimal getR12_net_short_position() {
		return r12_net_short_position;
	}
	public void setR12_net_short_position(BigDecimal r12_net_short_position) {
		this.r12_net_short_position = r12_net_short_position;
	}
	public BigDecimal getR12_r1() {
		return r12_r1;
	}
	public void setR12_r1(BigDecimal r12_r1) {
		this.r12_r1 = r12_r1;
	}
	public BigDecimal getR12_r2() {
		return r12_r2;
	}
	public void setR12_r2(BigDecimal r12_r2) {
		this.r12_r2 = r12_r2;
	}
	public BigDecimal getR12_r3() {
		return r12_r3;
	}
	public void setR12_r3(BigDecimal r12_r3) {
		this.r12_r3 = r12_r3;
	}
	public BigDecimal getR12_r4() {
		return r12_r4;
	}
	public void setR12_r4(BigDecimal r12_r4) {
		this.r12_r4 = r12_r4;
	}
	public BigDecimal getR12_r5() {
		return r12_r5;
	}
	public void setR12_r5(BigDecimal r12_r5) {
		this.r12_r5 = r12_r5;
	}
	public String getR13_currency() {
		return r13_currency;
	}
	public void setR13_currency(String r13_currency) {
		this.r13_currency = r13_currency;
	}
	public BigDecimal getR13_net_spot_position() {
		return r13_net_spot_position;
	}
	public void setR13_net_spot_position(BigDecimal r13_net_spot_position) {
		this.r13_net_spot_position = r13_net_spot_position;
	}
	public BigDecimal getR13_net_forward_position() {
		return r13_net_forward_position;
	}
	public void setR13_net_forward_position(BigDecimal r13_net_forward_position) {
		this.r13_net_forward_position = r13_net_forward_position;
	}
	public BigDecimal getR13_guarantees() {
		return r13_guarantees;
	}
	public void setR13_guarantees(BigDecimal r13_guarantees) {
		this.r13_guarantees = r13_guarantees;
	}
	public BigDecimal getR13_net_future_income_expenses() {
		return r13_net_future_income_expenses;
	}
	public void setR13_net_future_income_expenses(BigDecimal r13_net_future_income_expenses) {
		this.r13_net_future_income_expenses = r13_net_future_income_expenses;
	}
	public BigDecimal getR13_net_delta_weighted_fxop() {
		return r13_net_delta_weighted_fxop;
	}
	public void setR13_net_delta_weighted_fxop(BigDecimal r13_net_delta_weighted_fxop) {
		this.r13_net_delta_weighted_fxop = r13_net_delta_weighted_fxop;
	}
	public BigDecimal getR13_other_items() {
		return r13_other_items;
	}
	public void setR13_other_items(BigDecimal r13_other_items) {
		this.r13_other_items = r13_other_items;
	}
	public BigDecimal getR13_net_long_position() {
		return r13_net_long_position;
	}
	public void setR13_net_long_position(BigDecimal r13_net_long_position) {
		this.r13_net_long_position = r13_net_long_position;
	}
	public BigDecimal getR13_or() {
		return r13_or;
	}
	public void setR13_or(BigDecimal r13_or) {
		this.r13_or = r13_or;
	}
	public BigDecimal getR13_net_short_position() {
		return r13_net_short_position;
	}
	public void setR13_net_short_position(BigDecimal r13_net_short_position) {
		this.r13_net_short_position = r13_net_short_position;
	}
	public BigDecimal getR13_r1() {
		return r13_r1;
	}
	public void setR13_r1(BigDecimal r13_r1) {
		this.r13_r1 = r13_r1;
	}
	public BigDecimal getR13_r2() {
		return r13_r2;
	}
	public void setR13_r2(BigDecimal r13_r2) {
		this.r13_r2 = r13_r2;
	}
	public BigDecimal getR13_r3() {
		return r13_r3;
	}
	public void setR13_r3(BigDecimal r13_r3) {
		this.r13_r3 = r13_r3;
	}
	public BigDecimal getR13_r4() {
		return r13_r4;
	}
	public void setR13_r4(BigDecimal r13_r4) {
		this.r13_r4 = r13_r4;
	}
	public BigDecimal getR13_r5() {
		return r13_r5;
	}
	public void setR13_r5(BigDecimal r13_r5) {
		this.r13_r5 = r13_r5;
	}
	public String getR14_currency() {
		return r14_currency;
	}
	public void setR14_currency(String r14_currency) {
		this.r14_currency = r14_currency;
	}
	public BigDecimal getR14_net_spot_position() {
		return r14_net_spot_position;
	}
	public void setR14_net_spot_position(BigDecimal r14_net_spot_position) {
		this.r14_net_spot_position = r14_net_spot_position;
	}
	public BigDecimal getR14_net_forward_position() {
		return r14_net_forward_position;
	}
	public void setR14_net_forward_position(BigDecimal r14_net_forward_position) {
		this.r14_net_forward_position = r14_net_forward_position;
	}
	public BigDecimal getR14_guarantees() {
		return r14_guarantees;
	}
	public void setR14_guarantees(BigDecimal r14_guarantees) {
		this.r14_guarantees = r14_guarantees;
	}
	public BigDecimal getR14_net_future_income_expenses() {
		return r14_net_future_income_expenses;
	}
	public void setR14_net_future_income_expenses(BigDecimal r14_net_future_income_expenses) {
		this.r14_net_future_income_expenses = r14_net_future_income_expenses;
	}
	public BigDecimal getR14_net_delta_weighted_fxop() {
		return r14_net_delta_weighted_fxop;
	}
	public void setR14_net_delta_weighted_fxop(BigDecimal r14_net_delta_weighted_fxop) {
		this.r14_net_delta_weighted_fxop = r14_net_delta_weighted_fxop;
	}
	public BigDecimal getR14_other_items() {
		return r14_other_items;
	}
	public void setR14_other_items(BigDecimal r14_other_items) {
		this.r14_other_items = r14_other_items;
	}
	public BigDecimal getR14_net_long_position() {
		return r14_net_long_position;
	}
	public void setR14_net_long_position(BigDecimal r14_net_long_position) {
		this.r14_net_long_position = r14_net_long_position;
	}
	public BigDecimal getR14_or() {
		return r14_or;
	}
	public void setR14_or(BigDecimal r14_or) {
		this.r14_or = r14_or;
	}
	public BigDecimal getR14_net_short_position() {
		return r14_net_short_position;
	}
	public void setR14_net_short_position(BigDecimal r14_net_short_position) {
		this.r14_net_short_position = r14_net_short_position;
	}
	public BigDecimal getR14_r1() {
		return r14_r1;
	}
	public void setR14_r1(BigDecimal r14_r1) {
		this.r14_r1 = r14_r1;
	}
	public BigDecimal getR14_r2() {
		return r14_r2;
	}
	public void setR14_r2(BigDecimal r14_r2) {
		this.r14_r2 = r14_r2;
	}
	public BigDecimal getR14_r3() {
		return r14_r3;
	}
	public void setR14_r3(BigDecimal r14_r3) {
		this.r14_r3 = r14_r3;
	}
	public BigDecimal getR14_r4() {
		return r14_r4;
	}
	public void setR14_r4(BigDecimal r14_r4) {
		this.r14_r4 = r14_r4;
	}
	public BigDecimal getR14_r5() {
		return r14_r5;
	}
	public void setR14_r5(BigDecimal r14_r5) {
		this.r14_r5 = r14_r5;
	}
	public String getR15_currency() {
		return r15_currency;
	}
	public void setR15_currency(String r15_currency) {
		this.r15_currency = r15_currency;
	}
	public BigDecimal getR15_net_spot_position() {
		return r15_net_spot_position;
	}
	public void setR15_net_spot_position(BigDecimal r15_net_spot_position) {
		this.r15_net_spot_position = r15_net_spot_position;
	}
	public BigDecimal getR15_net_forward_position() {
		return r15_net_forward_position;
	}
	public void setR15_net_forward_position(BigDecimal r15_net_forward_position) {
		this.r15_net_forward_position = r15_net_forward_position;
	}
	public BigDecimal getR15_guarantees() {
		return r15_guarantees;
	}
	public void setR15_guarantees(BigDecimal r15_guarantees) {
		this.r15_guarantees = r15_guarantees;
	}
	public BigDecimal getR15_net_future_income_expenses() {
		return r15_net_future_income_expenses;
	}
	public void setR15_net_future_income_expenses(BigDecimal r15_net_future_income_expenses) {
		this.r15_net_future_income_expenses = r15_net_future_income_expenses;
	}
	public BigDecimal getR15_net_delta_weighted_fxop() {
		return r15_net_delta_weighted_fxop;
	}
	public void setR15_net_delta_weighted_fxop(BigDecimal r15_net_delta_weighted_fxop) {
		this.r15_net_delta_weighted_fxop = r15_net_delta_weighted_fxop;
	}
	public BigDecimal getR15_other_items() {
		return r15_other_items;
	}
	public void setR15_other_items(BigDecimal r15_other_items) {
		this.r15_other_items = r15_other_items;
	}
	public BigDecimal getR15_net_long_position() {
		return r15_net_long_position;
	}
	public void setR15_net_long_position(BigDecimal r15_net_long_position) {
		this.r15_net_long_position = r15_net_long_position;
	}
	public BigDecimal getR15_or() {
		return r15_or;
	}
	public void setR15_or(BigDecimal r15_or) {
		this.r15_or = r15_or;
	}
	public BigDecimal getR15_net_short_position() {
		return r15_net_short_position;
	}
	public void setR15_net_short_position(BigDecimal r15_net_short_position) {
		this.r15_net_short_position = r15_net_short_position;
	}
	public BigDecimal getR15_r1() {
		return r15_r1;
	}
	public void setR15_r1(BigDecimal r15_r1) {
		this.r15_r1 = r15_r1;
	}
	public BigDecimal getR15_r2() {
		return r15_r2;
	}
	public void setR15_r2(BigDecimal r15_r2) {
		this.r15_r2 = r15_r2;
	}
	public BigDecimal getR15_r3() {
		return r15_r3;
	}
	public void setR15_r3(BigDecimal r15_r3) {
		this.r15_r3 = r15_r3;
	}
	public BigDecimal getR15_r4() {
		return r15_r4;
	}
	public void setR15_r4(BigDecimal r15_r4) {
		this.r15_r4 = r15_r4;
	}
	public BigDecimal getR15_r5() {
		return r15_r5;
	}
	public void setR15_r5(BigDecimal r15_r5) {
		this.r15_r5 = r15_r5;
	}
	public String getR16_currency() {
		return r16_currency;
	}
	public void setR16_currency(String r16_currency) {
		this.r16_currency = r16_currency;
	}
	public BigDecimal getR16_net_spot_position() {
		return r16_net_spot_position;
	}
	public void setR16_net_spot_position(BigDecimal r16_net_spot_position) {
		this.r16_net_spot_position = r16_net_spot_position;
	}
	public BigDecimal getR16_net_forward_position() {
		return r16_net_forward_position;
	}
	public void setR16_net_forward_position(BigDecimal r16_net_forward_position) {
		this.r16_net_forward_position = r16_net_forward_position;
	}
	public BigDecimal getR16_guarantees() {
		return r16_guarantees;
	}
	public void setR16_guarantees(BigDecimal r16_guarantees) {
		this.r16_guarantees = r16_guarantees;
	}
	public BigDecimal getR16_net_future_income_expenses() {
		return r16_net_future_income_expenses;
	}
	public void setR16_net_future_income_expenses(BigDecimal r16_net_future_income_expenses) {
		this.r16_net_future_income_expenses = r16_net_future_income_expenses;
	}
	public BigDecimal getR16_net_delta_weighted_fxop() {
		return r16_net_delta_weighted_fxop;
	}
	public void setR16_net_delta_weighted_fxop(BigDecimal r16_net_delta_weighted_fxop) {
		this.r16_net_delta_weighted_fxop = r16_net_delta_weighted_fxop;
	}
	public BigDecimal getR16_other_items() {
		return r16_other_items;
	}
	public void setR16_other_items(BigDecimal r16_other_items) {
		this.r16_other_items = r16_other_items;
	}
	public BigDecimal getR16_net_long_position() {
		return r16_net_long_position;
	}
	public void setR16_net_long_position(BigDecimal r16_net_long_position) {
		this.r16_net_long_position = r16_net_long_position;
	}
	public BigDecimal getR16_or() {
		return r16_or;
	}
	public void setR16_or(BigDecimal r16_or) {
		this.r16_or = r16_or;
	}
	public BigDecimal getR16_net_short_position() {
		return r16_net_short_position;
	}
	public void setR16_net_short_position(BigDecimal r16_net_short_position) {
		this.r16_net_short_position = r16_net_short_position;
	}
	public BigDecimal getR16_r1() {
		return r16_r1;
	}
	public void setR16_r1(BigDecimal r16_r1) {
		this.r16_r1 = r16_r1;
	}
	public BigDecimal getR16_r2() {
		return r16_r2;
	}
	public void setR16_r2(BigDecimal r16_r2) {
		this.r16_r2 = r16_r2;
	}
	public BigDecimal getR16_r3() {
		return r16_r3;
	}
	public void setR16_r3(BigDecimal r16_r3) {
		this.r16_r3 = r16_r3;
	}
	public BigDecimal getR16_r4() {
		return r16_r4;
	}
	public void setR16_r4(BigDecimal r16_r4) {
		this.r16_r4 = r16_r4;
	}
	public BigDecimal getR16_r5() {
		return r16_r5;
	}
	public void setR16_r5(BigDecimal r16_r5) {
		this.r16_r5 = r16_r5;
	}
	public String getR17_currency() {
		return r17_currency;
	}
	public void setR17_currency(String r17_currency) {
		this.r17_currency = r17_currency;
	}
	public BigDecimal getR17_net_spot_position() {
		return r17_net_spot_position;
	}
	public void setR17_net_spot_position(BigDecimal r17_net_spot_position) {
		this.r17_net_spot_position = r17_net_spot_position;
	}
	public BigDecimal getR17_net_forward_position() {
		return r17_net_forward_position;
	}
	public void setR17_net_forward_position(BigDecimal r17_net_forward_position) {
		this.r17_net_forward_position = r17_net_forward_position;
	}
	public BigDecimal getR17_guarantees() {
		return r17_guarantees;
	}
	public void setR17_guarantees(BigDecimal r17_guarantees) {
		this.r17_guarantees = r17_guarantees;
	}
	public BigDecimal getR17_net_future_income_expenses() {
		return r17_net_future_income_expenses;
	}
	public void setR17_net_future_income_expenses(BigDecimal r17_net_future_income_expenses) {
		this.r17_net_future_income_expenses = r17_net_future_income_expenses;
	}
	public BigDecimal getR17_net_delta_weighted_fxop() {
		return r17_net_delta_weighted_fxop;
	}
	public void setR17_net_delta_weighted_fxop(BigDecimal r17_net_delta_weighted_fxop) {
		this.r17_net_delta_weighted_fxop = r17_net_delta_weighted_fxop;
	}
	public BigDecimal getR17_other_items() {
		return r17_other_items;
	}
	public void setR17_other_items(BigDecimal r17_other_items) {
		this.r17_other_items = r17_other_items;
	}
	public BigDecimal getR17_net_long_position() {
		return r17_net_long_position;
	}
	public void setR17_net_long_position(BigDecimal r17_net_long_position) {
		this.r17_net_long_position = r17_net_long_position;
	}
	public BigDecimal getR17_or() {
		return r17_or;
	}
	public void setR17_or(BigDecimal r17_or) {
		this.r17_or = r17_or;
	}
	public BigDecimal getR17_net_short_position() {
		return r17_net_short_position;
	}
	public void setR17_net_short_position(BigDecimal r17_net_short_position) {
		this.r17_net_short_position = r17_net_short_position;
	}
	public BigDecimal getR17_r1() {
		return r17_r1;
	}
	public void setR17_r1(BigDecimal r17_r1) {
		this.r17_r1 = r17_r1;
	}
	public BigDecimal getR17_r2() {
		return r17_r2;
	}
	public void setR17_r2(BigDecimal r17_r2) {
		this.r17_r2 = r17_r2;
	}
	public BigDecimal getR17_r3() {
		return r17_r3;
	}
	public void setR17_r3(BigDecimal r17_r3) {
		this.r17_r3 = r17_r3;
	}
	public BigDecimal getR17_r4() {
		return r17_r4;
	}
	public void setR17_r4(BigDecimal r17_r4) {
		this.r17_r4 = r17_r4;
	}
	public BigDecimal getR17_r5() {
		return r17_r5;
	}
	public void setR17_r5(BigDecimal r17_r5) {
		this.r17_r5 = r17_r5;
	}
	public String getR18_currency() {
		return r18_currency;
	}
	public void setR18_currency(String r18_currency) {
		this.r18_currency = r18_currency;
	}
	public BigDecimal getR18_net_spot_position() {
		return r18_net_spot_position;
	}
	public void setR18_net_spot_position(BigDecimal r18_net_spot_position) {
		this.r18_net_spot_position = r18_net_spot_position;
	}
	public BigDecimal getR18_net_forward_position() {
		return r18_net_forward_position;
	}
	public void setR18_net_forward_position(BigDecimal r18_net_forward_position) {
		this.r18_net_forward_position = r18_net_forward_position;
	}
	public BigDecimal getR18_guarantees() {
		return r18_guarantees;
	}
	public void setR18_guarantees(BigDecimal r18_guarantees) {
		this.r18_guarantees = r18_guarantees;
	}
	public BigDecimal getR18_net_future_income_expenses() {
		return r18_net_future_income_expenses;
	}
	public void setR18_net_future_income_expenses(BigDecimal r18_net_future_income_expenses) {
		this.r18_net_future_income_expenses = r18_net_future_income_expenses;
	}
	public BigDecimal getR18_net_delta_weighted_fxop() {
		return r18_net_delta_weighted_fxop;
	}
	public void setR18_net_delta_weighted_fxop(BigDecimal r18_net_delta_weighted_fxop) {
		this.r18_net_delta_weighted_fxop = r18_net_delta_weighted_fxop;
	}
	public BigDecimal getR18_other_items() {
		return r18_other_items;
	}
	public void setR18_other_items(BigDecimal r18_other_items) {
		this.r18_other_items = r18_other_items;
	}
	public BigDecimal getR18_net_long_position() {
		return r18_net_long_position;
	}
	public void setR18_net_long_position(BigDecimal r18_net_long_position) {
		this.r18_net_long_position = r18_net_long_position;
	}
	public BigDecimal getR18_or() {
		return r18_or;
	}
	public void setR18_or(BigDecimal r18_or) {
		this.r18_or = r18_or;
	}
	public BigDecimal getR18_net_short_position() {
		return r18_net_short_position;
	}
	public void setR18_net_short_position(BigDecimal r18_net_short_position) {
		this.r18_net_short_position = r18_net_short_position;
	}
	public BigDecimal getR18_r1() {
		return r18_r1;
	}
	public void setR18_r1(BigDecimal r18_r1) {
		this.r18_r1 = r18_r1;
	}
	public BigDecimal getR18_r2() {
		return r18_r2;
	}
	public void setR18_r2(BigDecimal r18_r2) {
		this.r18_r2 = r18_r2;
	}
	public BigDecimal getR18_r3() {
		return r18_r3;
	}
	public void setR18_r3(BigDecimal r18_r3) {
		this.r18_r3 = r18_r3;
	}
	public BigDecimal getR18_r4() {
		return r18_r4;
	}
	public void setR18_r4(BigDecimal r18_r4) {
		this.r18_r4 = r18_r4;
	}
	public BigDecimal getR18_r5() {
		return r18_r5;
	}
	public void setR18_r5(BigDecimal r18_r5) {
		this.r18_r5 = r18_r5;
	}
	public String getR19_currency() {
		return r19_currency;
	}
	public void setR19_currency(String r19_currency) {
		this.r19_currency = r19_currency;
	}
	public BigDecimal getR19_net_spot_position() {
		return r19_net_spot_position;
	}
	public void setR19_net_spot_position(BigDecimal r19_net_spot_position) {
		this.r19_net_spot_position = r19_net_spot_position;
	}
	public BigDecimal getR19_net_forward_position() {
		return r19_net_forward_position;
	}
	public void setR19_net_forward_position(BigDecimal r19_net_forward_position) {
		this.r19_net_forward_position = r19_net_forward_position;
	}
	public BigDecimal getR19_guarantees() {
		return r19_guarantees;
	}
	public void setR19_guarantees(BigDecimal r19_guarantees) {
		this.r19_guarantees = r19_guarantees;
	}
	public BigDecimal getR19_net_future_income_expenses() {
		return r19_net_future_income_expenses;
	}
	public void setR19_net_future_income_expenses(BigDecimal r19_net_future_income_expenses) {
		this.r19_net_future_income_expenses = r19_net_future_income_expenses;
	}
	public BigDecimal getR19_net_delta_weighted_fxop() {
		return r19_net_delta_weighted_fxop;
	}
	public void setR19_net_delta_weighted_fxop(BigDecimal r19_net_delta_weighted_fxop) {
		this.r19_net_delta_weighted_fxop = r19_net_delta_weighted_fxop;
	}
	public BigDecimal getR19_other_items() {
		return r19_other_items;
	}
	public void setR19_other_items(BigDecimal r19_other_items) {
		this.r19_other_items = r19_other_items;
	}
	public BigDecimal getR19_net_long_position() {
		return r19_net_long_position;
	}
	public void setR19_net_long_position(BigDecimal r19_net_long_position) {
		this.r19_net_long_position = r19_net_long_position;
	}
	public BigDecimal getR19_or() {
		return r19_or;
	}
	public void setR19_or(BigDecimal r19_or) {
		this.r19_or = r19_or;
	}
	public BigDecimal getR19_net_short_position() {
		return r19_net_short_position;
	}
	public void setR19_net_short_position(BigDecimal r19_net_short_position) {
		this.r19_net_short_position = r19_net_short_position;
	}
	public BigDecimal getR19_r1() {
		return r19_r1;
	}
	public void setR19_r1(BigDecimal r19_r1) {
		this.r19_r1 = r19_r1;
	}
	public BigDecimal getR19_r2() {
		return r19_r2;
	}
	public void setR19_r2(BigDecimal r19_r2) {
		this.r19_r2 = r19_r2;
	}
	public BigDecimal getR19_r3() {
		return r19_r3;
	}
	public void setR19_r3(BigDecimal r19_r3) {
		this.r19_r3 = r19_r3;
	}
	public BigDecimal getR19_r4() {
		return r19_r4;
	}
	public void setR19_r4(BigDecimal r19_r4) {
		this.r19_r4 = r19_r4;
	}
	public BigDecimal getR19_r5() {
		return r19_r5;
	}
	public void setR19_r5(BigDecimal r19_r5) {
		this.r19_r5 = r19_r5;
	}
	public String getR20_currency() {
		return r20_currency;
	}
	public void setR20_currency(String r20_currency) {
		this.r20_currency = r20_currency;
	}
	public BigDecimal getR20_net_spot_position() {
		return r20_net_spot_position;
	}
	public void setR20_net_spot_position(BigDecimal r20_net_spot_position) {
		this.r20_net_spot_position = r20_net_spot_position;
	}
	public BigDecimal getR20_net_forward_position() {
		return r20_net_forward_position;
	}
	public void setR20_net_forward_position(BigDecimal r20_net_forward_position) {
		this.r20_net_forward_position = r20_net_forward_position;
	}
	public BigDecimal getR20_guarantees() {
		return r20_guarantees;
	}
	public void setR20_guarantees(BigDecimal r20_guarantees) {
		this.r20_guarantees = r20_guarantees;
	}
	public BigDecimal getR20_net_future_income_expenses() {
		return r20_net_future_income_expenses;
	}
	public void setR20_net_future_income_expenses(BigDecimal r20_net_future_income_expenses) {
		this.r20_net_future_income_expenses = r20_net_future_income_expenses;
	}
	public BigDecimal getR20_net_delta_weighted_fxop() {
		return r20_net_delta_weighted_fxop;
	}
	public void setR20_net_delta_weighted_fxop(BigDecimal r20_net_delta_weighted_fxop) {
		this.r20_net_delta_weighted_fxop = r20_net_delta_weighted_fxop;
	}
	public BigDecimal getR20_other_items() {
		return r20_other_items;
	}
	public void setR20_other_items(BigDecimal r20_other_items) {
		this.r20_other_items = r20_other_items;
	}
	public BigDecimal getR20_net_long_position() {
		return r20_net_long_position;
	}
	public void setR20_net_long_position(BigDecimal r20_net_long_position) {
		this.r20_net_long_position = r20_net_long_position;
	}
	public BigDecimal getR20_or() {
		return r20_or;
	}
	public void setR20_or(BigDecimal r20_or) {
		this.r20_or = r20_or;
	}
	public BigDecimal getR20_net_short_position() {
		return r20_net_short_position;
	}
	public void setR20_net_short_position(BigDecimal r20_net_short_position) {
		this.r20_net_short_position = r20_net_short_position;
	}
	public BigDecimal getR20_r1() {
		return r20_r1;
	}
	public void setR20_r1(BigDecimal r20_r1) {
		this.r20_r1 = r20_r1;
	}
	public BigDecimal getR20_r2() {
		return r20_r2;
	}
	public void setR20_r2(BigDecimal r20_r2) {
		this.r20_r2 = r20_r2;
	}
	public BigDecimal getR20_r3() {
		return r20_r3;
	}
	public void setR20_r3(BigDecimal r20_r3) {
		this.r20_r3 = r20_r3;
	}
	public BigDecimal getR20_r4() {
		return r20_r4;
	}
	public void setR20_r4(BigDecimal r20_r4) {
		this.r20_r4 = r20_r4;
	}
	public BigDecimal getR20_r5() {
		return r20_r5;
	}
	public void setR20_r5(BigDecimal r20_r5) {
		this.r20_r5 = r20_r5;
	}
	public String getR21_currency() {
		return r21_currency;
	}
	public void setR21_currency(String r21_currency) {
		this.r21_currency = r21_currency;
	}
	public BigDecimal getR21_net_spot_position() {
		return r21_net_spot_position;
	}
	public void setR21_net_spot_position(BigDecimal r21_net_spot_position) {
		this.r21_net_spot_position = r21_net_spot_position;
	}
	public BigDecimal getR21_net_forward_position() {
		return r21_net_forward_position;
	}
	public void setR21_net_forward_position(BigDecimal r21_net_forward_position) {
		this.r21_net_forward_position = r21_net_forward_position;
	}
	public BigDecimal getR21_guarantees() {
		return r21_guarantees;
	}
	public void setR21_guarantees(BigDecimal r21_guarantees) {
		this.r21_guarantees = r21_guarantees;
	}
	public BigDecimal getR21_net_future_income_expenses() {
		return r21_net_future_income_expenses;
	}
	public void setR21_net_future_income_expenses(BigDecimal r21_net_future_income_expenses) {
		this.r21_net_future_income_expenses = r21_net_future_income_expenses;
	}
	public BigDecimal getR21_net_delta_weighted_fxop() {
		return r21_net_delta_weighted_fxop;
	}
	public void setR21_net_delta_weighted_fxop(BigDecimal r21_net_delta_weighted_fxop) {
		this.r21_net_delta_weighted_fxop = r21_net_delta_weighted_fxop;
	}
	public BigDecimal getR21_other_items() {
		return r21_other_items;
	}
	public void setR21_other_items(BigDecimal r21_other_items) {
		this.r21_other_items = r21_other_items;
	}
	public BigDecimal getR21_net_long_position() {
		return r21_net_long_position;
	}
	public void setR21_net_long_position(BigDecimal r21_net_long_position) {
		this.r21_net_long_position = r21_net_long_position;
	}
	public BigDecimal getR21_or() {
		return r21_or;
	}
	public void setR21_or(BigDecimal r21_or) {
		this.r21_or = r21_or;
	}
	public BigDecimal getR21_net_short_position() {
		return r21_net_short_position;
	}
	public void setR21_net_short_position(BigDecimal r21_net_short_position) {
		this.r21_net_short_position = r21_net_short_position;
	}
	public BigDecimal getR21_r1() {
		return r21_r1;
	}
	public void setR21_r1(BigDecimal r21_r1) {
		this.r21_r1 = r21_r1;
	}
	public BigDecimal getR21_r2() {
		return r21_r2;
	}
	public void setR21_r2(BigDecimal r21_r2) {
		this.r21_r2 = r21_r2;
	}
	public BigDecimal getR21_r3() {
		return r21_r3;
	}
	public void setR21_r3(BigDecimal r21_r3) {
		this.r21_r3 = r21_r3;
	}
	public BigDecimal getR21_r4() {
		return r21_r4;
	}
	public void setR21_r4(BigDecimal r21_r4) {
		this.r21_r4 = r21_r4;
	}
	public BigDecimal getR21_r5() {
		return r21_r5;
	}
	public void setR21_r5(BigDecimal r21_r5) {
		this.r21_r5 = r21_r5;
	}
	public String getR22_currency() {
		return r22_currency;
	}
	public void setR22_currency(String r22_currency) {
		this.r22_currency = r22_currency;
	}
	public BigDecimal getR22_net_spot_position() {
		return r22_net_spot_position;
	}
	public void setR22_net_spot_position(BigDecimal r22_net_spot_position) {
		this.r22_net_spot_position = r22_net_spot_position;
	}
	public BigDecimal getR22_net_forward_position() {
		return r22_net_forward_position;
	}
	public void setR22_net_forward_position(BigDecimal r22_net_forward_position) {
		this.r22_net_forward_position = r22_net_forward_position;
	}
	public BigDecimal getR22_guarantees() {
		return r22_guarantees;
	}
	public void setR22_guarantees(BigDecimal r22_guarantees) {
		this.r22_guarantees = r22_guarantees;
	}
	public BigDecimal getR22_net_future_income_expenses() {
		return r22_net_future_income_expenses;
	}
	public void setR22_net_future_income_expenses(BigDecimal r22_net_future_income_expenses) {
		this.r22_net_future_income_expenses = r22_net_future_income_expenses;
	}
	public BigDecimal getR22_net_delta_weighted_fxop() {
		return r22_net_delta_weighted_fxop;
	}
	public void setR22_net_delta_weighted_fxop(BigDecimal r22_net_delta_weighted_fxop) {
		this.r22_net_delta_weighted_fxop = r22_net_delta_weighted_fxop;
	}
	public BigDecimal getR22_other_items() {
		return r22_other_items;
	}
	public void setR22_other_items(BigDecimal r22_other_items) {
		this.r22_other_items = r22_other_items;
	}
	public BigDecimal getR22_net_long_position() {
		return r22_net_long_position;
	}
	public void setR22_net_long_position(BigDecimal r22_net_long_position) {
		this.r22_net_long_position = r22_net_long_position;
	}
	public BigDecimal getR22_or() {
		return r22_or;
	}
	public void setR22_or(BigDecimal r22_or) {
		this.r22_or = r22_or;
	}
	public BigDecimal getR22_net_short_position() {
		return r22_net_short_position;
	}
	public void setR22_net_short_position(BigDecimal r22_net_short_position) {
		this.r22_net_short_position = r22_net_short_position;
	}
	public BigDecimal getR22_r1() {
		return r22_r1;
	}
	public void setR22_r1(BigDecimal r22_r1) {
		this.r22_r1 = r22_r1;
	}
	public BigDecimal getR22_r2() {
		return r22_r2;
	}
	public void setR22_r2(BigDecimal r22_r2) {
		this.r22_r2 = r22_r2;
	}
	public BigDecimal getR22_r3() {
		return r22_r3;
	}
	public void setR22_r3(BigDecimal r22_r3) {
		this.r22_r3 = r22_r3;
	}
	public BigDecimal getR22_r4() {
		return r22_r4;
	}
	public void setR22_r4(BigDecimal r22_r4) {
		this.r22_r4 = r22_r4;
	}
	public BigDecimal getR22_r5() {
		return r22_r5;
	}
	public void setR22_r5(BigDecimal r22_r5) {
		this.r22_r5 = r22_r5;
	}
	public String getR23_currency() {
		return r23_currency;
	}
	public void setR23_currency(String r23_currency) {
		this.r23_currency = r23_currency;
	}
	public BigDecimal getR23_net_spot_position() {
		return r23_net_spot_position;
	}
	public void setR23_net_spot_position(BigDecimal r23_net_spot_position) {
		this.r23_net_spot_position = r23_net_spot_position;
	}
	public BigDecimal getR23_net_forward_position() {
		return r23_net_forward_position;
	}
	public void setR23_net_forward_position(BigDecimal r23_net_forward_position) {
		this.r23_net_forward_position = r23_net_forward_position;
	}
	public BigDecimal getR23_guarantees() {
		return r23_guarantees;
	}
	public void setR23_guarantees(BigDecimal r23_guarantees) {
		this.r23_guarantees = r23_guarantees;
	}
	public BigDecimal getR23_net_future_income_expenses() {
		return r23_net_future_income_expenses;
	}
	public void setR23_net_future_income_expenses(BigDecimal r23_net_future_income_expenses) {
		this.r23_net_future_income_expenses = r23_net_future_income_expenses;
	}
	public BigDecimal getR23_net_delta_weighted_fxop() {
		return r23_net_delta_weighted_fxop;
	}
	public void setR23_net_delta_weighted_fxop(BigDecimal r23_net_delta_weighted_fxop) {
		this.r23_net_delta_weighted_fxop = r23_net_delta_weighted_fxop;
	}
	public BigDecimal getR23_other_items() {
		return r23_other_items;
	}
	public void setR23_other_items(BigDecimal r23_other_items) {
		this.r23_other_items = r23_other_items;
	}
	public BigDecimal getR23_net_long_position() {
		return r23_net_long_position;
	}
	public void setR23_net_long_position(BigDecimal r23_net_long_position) {
		this.r23_net_long_position = r23_net_long_position;
	}
	public BigDecimal getR23_or() {
		return r23_or;
	}
	public void setR23_or(BigDecimal r23_or) {
		this.r23_or = r23_or;
	}
	public BigDecimal getR23_net_short_position() {
		return r23_net_short_position;
	}
	public void setR23_net_short_position(BigDecimal r23_net_short_position) {
		this.r23_net_short_position = r23_net_short_position;
	}
	public BigDecimal getR23_r1() {
		return r23_r1;
	}
	public void setR23_r1(BigDecimal r23_r1) {
		this.r23_r1 = r23_r1;
	}
	public BigDecimal getR23_r2() {
		return r23_r2;
	}
	public void setR23_r2(BigDecimal r23_r2) {
		this.r23_r2 = r23_r2;
	}
	public BigDecimal getR23_r3() {
		return r23_r3;
	}
	public void setR23_r3(BigDecimal r23_r3) {
		this.r23_r3 = r23_r3;
	}
	public BigDecimal getR23_r4() {
		return r23_r4;
	}
	public void setR23_r4(BigDecimal r23_r4) {
		this.r23_r4 = r23_r4;
	}
	public BigDecimal getR23_r5() {
		return r23_r5;
	}
	public void setR23_r5(BigDecimal r23_r5) {
		this.r23_r5 = r23_r5;
	}
	public String getR24_currency() {
		return r24_currency;
	}
	public void setR24_currency(String r24_currency) {
		this.r24_currency = r24_currency;
	}
	public BigDecimal getR24_net_spot_position() {
		return r24_net_spot_position;
	}
	public void setR24_net_spot_position(BigDecimal r24_net_spot_position) {
		this.r24_net_spot_position = r24_net_spot_position;
	}
	public BigDecimal getR24_net_forward_position() {
		return r24_net_forward_position;
	}
	public void setR24_net_forward_position(BigDecimal r24_net_forward_position) {
		this.r24_net_forward_position = r24_net_forward_position;
	}
	public BigDecimal getR24_guarantees() {
		return r24_guarantees;
	}
	public void setR24_guarantees(BigDecimal r24_guarantees) {
		this.r24_guarantees = r24_guarantees;
	}
	public BigDecimal getR24_net_future_income_expenses() {
		return r24_net_future_income_expenses;
	}
	public void setR24_net_future_income_expenses(BigDecimal r24_net_future_income_expenses) {
		this.r24_net_future_income_expenses = r24_net_future_income_expenses;
	}
	public BigDecimal getR24_net_delta_weighted_fxop() {
		return r24_net_delta_weighted_fxop;
	}
	public void setR24_net_delta_weighted_fxop(BigDecimal r24_net_delta_weighted_fxop) {
		this.r24_net_delta_weighted_fxop = r24_net_delta_weighted_fxop;
	}
	public BigDecimal getR24_other_items() {
		return r24_other_items;
	}
	public void setR24_other_items(BigDecimal r24_other_items) {
		this.r24_other_items = r24_other_items;
	}
	public BigDecimal getR24_net_long_position() {
		return r24_net_long_position;
	}
	public void setR24_net_long_position(BigDecimal r24_net_long_position) {
		this.r24_net_long_position = r24_net_long_position;
	}
	public BigDecimal getR24_or() {
		return r24_or;
	}
	public void setR24_or(BigDecimal r24_or) {
		this.r24_or = r24_or;
	}
	public BigDecimal getR24_net_short_position() {
		return r24_net_short_position;
	}
	public void setR24_net_short_position(BigDecimal r24_net_short_position) {
		this.r24_net_short_position = r24_net_short_position;
	}
	public BigDecimal getR24_r1() {
		return r24_r1;
	}
	public void setR24_r1(BigDecimal r24_r1) {
		this.r24_r1 = r24_r1;
	}
	public BigDecimal getR24_r2() {
		return r24_r2;
	}
	public void setR24_r2(BigDecimal r24_r2) {
		this.r24_r2 = r24_r2;
	}
	public BigDecimal getR24_r3() {
		return r24_r3;
	}
	public void setR24_r3(BigDecimal r24_r3) {
		this.r24_r3 = r24_r3;
	}
	public BigDecimal getR24_r4() {
		return r24_r4;
	}
	public void setR24_r4(BigDecimal r24_r4) {
		this.r24_r4 = r24_r4;
	}
	public BigDecimal getR24_r5() {
		return r24_r5;
	}
	public void setR24_r5(BigDecimal r24_r5) {
		this.r24_r5 = r24_r5;
	}
	public String getR25_currency() {
		return r25_currency;
	}
	public void setR25_currency(String r25_currency) {
		this.r25_currency = r25_currency;
	}
	public BigDecimal getR25_net_spot_position() {
		return r25_net_spot_position;
	}
	public void setR25_net_spot_position(BigDecimal r25_net_spot_position) {
		this.r25_net_spot_position = r25_net_spot_position;
	}
	public BigDecimal getR25_net_forward_position() {
		return r25_net_forward_position;
	}
	public void setR25_net_forward_position(BigDecimal r25_net_forward_position) {
		this.r25_net_forward_position = r25_net_forward_position;
	}
	public BigDecimal getR25_guarantees() {
		return r25_guarantees;
	}
	public void setR25_guarantees(BigDecimal r25_guarantees) {
		this.r25_guarantees = r25_guarantees;
	}
	public BigDecimal getR25_net_future_income_expenses() {
		return r25_net_future_income_expenses;
	}
	public void setR25_net_future_income_expenses(BigDecimal r25_net_future_income_expenses) {
		this.r25_net_future_income_expenses = r25_net_future_income_expenses;
	}
	public BigDecimal getR25_net_delta_weighted_fxop() {
		return r25_net_delta_weighted_fxop;
	}
	public void setR25_net_delta_weighted_fxop(BigDecimal r25_net_delta_weighted_fxop) {
		this.r25_net_delta_weighted_fxop = r25_net_delta_weighted_fxop;
	}
	public BigDecimal getR25_other_items() {
		return r25_other_items;
	}
	public void setR25_other_items(BigDecimal r25_other_items) {
		this.r25_other_items = r25_other_items;
	}
	public BigDecimal getR25_net_long_position() {
		return r25_net_long_position;
	}
	public void setR25_net_long_position(BigDecimal r25_net_long_position) {
		this.r25_net_long_position = r25_net_long_position;
	}
	public BigDecimal getR25_or() {
		return r25_or;
	}
	public void setR25_or(BigDecimal r25_or) {
		this.r25_or = r25_or;
	}
	public BigDecimal getR25_net_short_position() {
		return r25_net_short_position;
	}
	public void setR25_net_short_position(BigDecimal r25_net_short_position) {
		this.r25_net_short_position = r25_net_short_position;
	}
	public BigDecimal getR25_r1() {
		return r25_r1;
	}
	public void setR25_r1(BigDecimal r25_r1) {
		this.r25_r1 = r25_r1;
	}
	public BigDecimal getR25_r2() {
		return r25_r2;
	}
	public void setR25_r2(BigDecimal r25_r2) {
		this.r25_r2 = r25_r2;
	}
	public BigDecimal getR25_r3() {
		return r25_r3;
	}
	public void setR25_r3(BigDecimal r25_r3) {
		this.r25_r3 = r25_r3;
	}
	public BigDecimal getR25_r4() {
		return r25_r4;
	}
	public void setR25_r4(BigDecimal r25_r4) {
		this.r25_r4 = r25_r4;
	}
	public BigDecimal getR25_r5() {
		return r25_r5;
	}
	public void setR25_r5(BigDecimal r25_r5) {
		this.r25_r5 = r25_r5;
	}
	public String getR26_currency() {
		return r26_currency;
	}
	public void setR26_currency(String r26_currency) {
		this.r26_currency = r26_currency;
	}
	public BigDecimal getR26_net_spot_position() {
		return r26_net_spot_position;
	}
	public void setR26_net_spot_position(BigDecimal r26_net_spot_position) {
		this.r26_net_spot_position = r26_net_spot_position;
	}
	public BigDecimal getR26_net_forward_position() {
		return r26_net_forward_position;
	}
	public void setR26_net_forward_position(BigDecimal r26_net_forward_position) {
		this.r26_net_forward_position = r26_net_forward_position;
	}
	public BigDecimal getR26_guarantees() {
		return r26_guarantees;
	}
	public void setR26_guarantees(BigDecimal r26_guarantees) {
		this.r26_guarantees = r26_guarantees;
	}
	public BigDecimal getR26_net_future_income_expenses() {
		return r26_net_future_income_expenses;
	}
	public void setR26_net_future_income_expenses(BigDecimal r26_net_future_income_expenses) {
		this.r26_net_future_income_expenses = r26_net_future_income_expenses;
	}
	public BigDecimal getR26_net_delta_weighted_fxop() {
		return r26_net_delta_weighted_fxop;
	}
	public void setR26_net_delta_weighted_fxop(BigDecimal r26_net_delta_weighted_fxop) {
		this.r26_net_delta_weighted_fxop = r26_net_delta_weighted_fxop;
	}
	public BigDecimal getR26_other_items() {
		return r26_other_items;
	}
	public void setR26_other_items(BigDecimal r26_other_items) {
		this.r26_other_items = r26_other_items;
	}
	public BigDecimal getR26_net_long_position() {
		return r26_net_long_position;
	}
	public void setR26_net_long_position(BigDecimal r26_net_long_position) {
		this.r26_net_long_position = r26_net_long_position;
	}
	public BigDecimal getR26_or() {
		return r26_or;
	}
	public void setR26_or(BigDecimal r26_or) {
		this.r26_or = r26_or;
	}
	public BigDecimal getR26_net_short_position() {
		return r26_net_short_position;
	}
	public void setR26_net_short_position(BigDecimal r26_net_short_position) {
		this.r26_net_short_position = r26_net_short_position;
	}
	public BigDecimal getR26_r1() {
		return r26_r1;
	}
	public void setR26_r1(BigDecimal r26_r1) {
		this.r26_r1 = r26_r1;
	}
	public BigDecimal getR26_r2() {
		return r26_r2;
	}
	public void setR26_r2(BigDecimal r26_r2) {
		this.r26_r2 = r26_r2;
	}
	public BigDecimal getR26_r3() {
		return r26_r3;
	}
	public void setR26_r3(BigDecimal r26_r3) {
		this.r26_r3 = r26_r3;
	}
	public BigDecimal getR26_r4() {
		return r26_r4;
	}
	public void setR26_r4(BigDecimal r26_r4) {
		this.r26_r4 = r26_r4;
	}
	public BigDecimal getR26_r5() {
		return r26_r5;
	}
	public void setR26_r5(BigDecimal r26_r5) {
		this.r26_r5 = r26_r5;
	}
	public String getR27_currency() {
		return r27_currency;
	}
	public void setR27_currency(String r27_currency) {
		this.r27_currency = r27_currency;
	}
	public BigDecimal getR27_net_spot_position() {
		return r27_net_spot_position;
	}
	public void setR27_net_spot_position(BigDecimal r27_net_spot_position) {
		this.r27_net_spot_position = r27_net_spot_position;
	}
	public BigDecimal getR27_net_forward_position() {
		return r27_net_forward_position;
	}
	public void setR27_net_forward_position(BigDecimal r27_net_forward_position) {
		this.r27_net_forward_position = r27_net_forward_position;
	}
	public BigDecimal getR27_guarantees() {
		return r27_guarantees;
	}
	public void setR27_guarantees(BigDecimal r27_guarantees) {
		this.r27_guarantees = r27_guarantees;
	}
	public BigDecimal getR27_net_future_income_expenses() {
		return r27_net_future_income_expenses;
	}
	public void setR27_net_future_income_expenses(BigDecimal r27_net_future_income_expenses) {
		this.r27_net_future_income_expenses = r27_net_future_income_expenses;
	}
	public BigDecimal getR27_net_delta_weighted_fxop() {
		return r27_net_delta_weighted_fxop;
	}
	public void setR27_net_delta_weighted_fxop(BigDecimal r27_net_delta_weighted_fxop) {
		this.r27_net_delta_weighted_fxop = r27_net_delta_weighted_fxop;
	}
	public BigDecimal getR27_other_items() {
		return r27_other_items;
	}
	public void setR27_other_items(BigDecimal r27_other_items) {
		this.r27_other_items = r27_other_items;
	}
	public BigDecimal getR27_net_long_position() {
		return r27_net_long_position;
	}
	public void setR27_net_long_position(BigDecimal r27_net_long_position) {
		this.r27_net_long_position = r27_net_long_position;
	}
	public BigDecimal getR27_or() {
		return r27_or;
	}
	public void setR27_or(BigDecimal r27_or) {
		this.r27_or = r27_or;
	}
	public BigDecimal getR27_net_short_position() {
		return r27_net_short_position;
	}
	public void setR27_net_short_position(BigDecimal r27_net_short_position) {
		this.r27_net_short_position = r27_net_short_position;
	}
	public BigDecimal getR27_r1() {
		return r27_r1;
	}
	public void setR27_r1(BigDecimal r27_r1) {
		this.r27_r1 = r27_r1;
	}
	public BigDecimal getR27_r2() {
		return r27_r2;
	}
	public void setR27_r2(BigDecimal r27_r2) {
		this.r27_r2 = r27_r2;
	}
	public BigDecimal getR27_r3() {
		return r27_r3;
	}
	public void setR27_r3(BigDecimal r27_r3) {
		this.r27_r3 = r27_r3;
	}
	public BigDecimal getR27_r4() {
		return r27_r4;
	}
	public void setR27_r4(BigDecimal r27_r4) {
		this.r27_r4 = r27_r4;
	}
	public BigDecimal getR27_r5() {
		return r27_r5;
	}
	public void setR27_r5(BigDecimal r27_r5) {
		this.r27_r5 = r27_r5;
	}
	public String getR28_currency() {
		return r28_currency;
	}
	public void setR28_currency(String r28_currency) {
		this.r28_currency = r28_currency;
	}
	public BigDecimal getR28_net_spot_position() {
		return r28_net_spot_position;
	}
	public void setR28_net_spot_position(BigDecimal r28_net_spot_position) {
		this.r28_net_spot_position = r28_net_spot_position;
	}
	public BigDecimal getR28_net_forward_position() {
		return r28_net_forward_position;
	}
	public void setR28_net_forward_position(BigDecimal r28_net_forward_position) {
		this.r28_net_forward_position = r28_net_forward_position;
	}
	public BigDecimal getR28_guarantees() {
		return r28_guarantees;
	}
	public void setR28_guarantees(BigDecimal r28_guarantees) {
		this.r28_guarantees = r28_guarantees;
	}
	public BigDecimal getR28_net_future_income_expenses() {
		return r28_net_future_income_expenses;
	}
	public void setR28_net_future_income_expenses(BigDecimal r28_net_future_income_expenses) {
		this.r28_net_future_income_expenses = r28_net_future_income_expenses;
	}
	public BigDecimal getR28_net_delta_weighted_fxop() {
		return r28_net_delta_weighted_fxop;
	}
	public void setR28_net_delta_weighted_fxop(BigDecimal r28_net_delta_weighted_fxop) {
		this.r28_net_delta_weighted_fxop = r28_net_delta_weighted_fxop;
	}
	public BigDecimal getR28_other_items() {
		return r28_other_items;
	}
	public void setR28_other_items(BigDecimal r28_other_items) {
		this.r28_other_items = r28_other_items;
	}
	public BigDecimal getR28_net_long_position() {
		return r28_net_long_position;
	}
	public void setR28_net_long_position(BigDecimal r28_net_long_position) {
		this.r28_net_long_position = r28_net_long_position;
	}
	public BigDecimal getR28_or() {
		return r28_or;
	}
	public void setR28_or(BigDecimal r28_or) {
		this.r28_or = r28_or;
	}
	public BigDecimal getR28_net_short_position() {
		return r28_net_short_position;
	}
	public void setR28_net_short_position(BigDecimal r28_net_short_position) {
		this.r28_net_short_position = r28_net_short_position;
	}
	public BigDecimal getR28_r1() {
		return r28_r1;
	}
	public void setR28_r1(BigDecimal r28_r1) {
		this.r28_r1 = r28_r1;
	}
	public BigDecimal getR28_r2() {
		return r28_r2;
	}
	public void setR28_r2(BigDecimal r28_r2) {
		this.r28_r2 = r28_r2;
	}
	public BigDecimal getR28_r3() {
		return r28_r3;
	}
	public void setR28_r3(BigDecimal r28_r3) {
		this.r28_r3 = r28_r3;
	}
	public BigDecimal getR28_r4() {
		return r28_r4;
	}
	public void setR28_r4(BigDecimal r28_r4) {
		this.r28_r4 = r28_r4;
	}
	public BigDecimal getR28_r5() {
		return r28_r5;
	}
	public void setR28_r5(BigDecimal r28_r5) {
		this.r28_r5 = r28_r5;
	}
	public String getR29_currency() {
		return r29_currency;
	}
	public void setR29_currency(String r29_currency) {
		this.r29_currency = r29_currency;
	}
	public BigDecimal getR29_net_spot_position() {
		return r29_net_spot_position;
	}
	public void setR29_net_spot_position(BigDecimal r29_net_spot_position) {
		this.r29_net_spot_position = r29_net_spot_position;
	}
	public BigDecimal getR29_net_forward_position() {
		return r29_net_forward_position;
	}
	public void setR29_net_forward_position(BigDecimal r29_net_forward_position) {
		this.r29_net_forward_position = r29_net_forward_position;
	}
	public BigDecimal getR29_guarantees() {
		return r29_guarantees;
	}
	public void setR29_guarantees(BigDecimal r29_guarantees) {
		this.r29_guarantees = r29_guarantees;
	}
	public BigDecimal getR29_net_future_income_expenses() {
		return r29_net_future_income_expenses;
	}
	public void setR29_net_future_income_expenses(BigDecimal r29_net_future_income_expenses) {
		this.r29_net_future_income_expenses = r29_net_future_income_expenses;
	}
	public BigDecimal getR29_net_delta_weighted_fxop() {
		return r29_net_delta_weighted_fxop;
	}
	public void setR29_net_delta_weighted_fxop(BigDecimal r29_net_delta_weighted_fxop) {
		this.r29_net_delta_weighted_fxop = r29_net_delta_weighted_fxop;
	}
	public BigDecimal getR29_other_items() {
		return r29_other_items;
	}
	public void setR29_other_items(BigDecimal r29_other_items) {
		this.r29_other_items = r29_other_items;
	}
	public BigDecimal getR29_net_long_position() {
		return r29_net_long_position;
	}
	public void setR29_net_long_position(BigDecimal r29_net_long_position) {
		this.r29_net_long_position = r29_net_long_position;
	}
	public BigDecimal getR29_or() {
		return r29_or;
	}
	public void setR29_or(BigDecimal r29_or) {
		this.r29_or = r29_or;
	}
	public BigDecimal getR29_net_short_position() {
		return r29_net_short_position;
	}
	public void setR29_net_short_position(BigDecimal r29_net_short_position) {
		this.r29_net_short_position = r29_net_short_position;
	}
	public BigDecimal getR29_r1() {
		return r29_r1;
	}
	public void setR29_r1(BigDecimal r29_r1) {
		this.r29_r1 = r29_r1;
	}
	public BigDecimal getR29_r2() {
		return r29_r2;
	}
	public void setR29_r2(BigDecimal r29_r2) {
		this.r29_r2 = r29_r2;
	}
	public BigDecimal getR29_r3() {
		return r29_r3;
	}
	public void setR29_r3(BigDecimal r29_r3) {
		this.r29_r3 = r29_r3;
	}
	public BigDecimal getR29_r4() {
		return r29_r4;
	}
	public void setR29_r4(BigDecimal r29_r4) {
		this.r29_r4 = r29_r4;
	}
	public BigDecimal getR29_r5() {
		return r29_r5;
	}
	public void setR29_r5(BigDecimal r29_r5) {
		this.r29_r5 = r29_r5;
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
	
}

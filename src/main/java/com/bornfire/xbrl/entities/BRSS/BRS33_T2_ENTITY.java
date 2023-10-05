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
@Table(name="M_GALOR_T2")
public class BRS33_T2_ENTITY {
	private String	r101_product;
	private BigDecimal	r101_botswana;
	private BigDecimal	r101_south_africa;
	private BigDecimal	r101_sadc;
	private BigDecimal	r101_usa;
	private BigDecimal	r101_uk;
	private BigDecimal	r101_europe;
	private BigDecimal	r101_india;
	private BigDecimal	r101_sydney;
	private BigDecimal	r101_uganda;
	private BigDecimal	r101_total;
	private String	r102_product;
	private BigDecimal	r102_botswana;
	private BigDecimal	r102_south_africa;
	private BigDecimal	r102_sadc;
	private BigDecimal	r102_usa;
	private BigDecimal	r102_uk;
	private BigDecimal	r102_europe;
	private BigDecimal	r102_india;
	private BigDecimal	r102_sydney;
	private BigDecimal	r102_uganda;
	private BigDecimal	r102_total;
	private String	r103_product;
	private BigDecimal	r103_botswana;
	private BigDecimal	r103_south_africa;
	private BigDecimal	r103_sadc;
	private BigDecimal	r103_usa;
	private BigDecimal	r103_uk;
	private BigDecimal	r103_europe;
	private BigDecimal	r103_india;
	private BigDecimal	r103_sydney;
	private BigDecimal	r103_uganda;
	private BigDecimal	r103_total;
	private String	r104_product;
	private BigDecimal	r104_botswana;
	private BigDecimal	r104_south_africa;
	private BigDecimal	r104_sadc;
	private BigDecimal	r104_usa;
	private BigDecimal	r104_uk;
	private BigDecimal	r104_europe;
	private BigDecimal	r104_india;
	private BigDecimal	r104_sydney;
	private BigDecimal	r104_uganda;
	private BigDecimal	r104_total;
	private String	r105_product;
	private BigDecimal	r105_botswana;
	private BigDecimal	r105_south_africa;
	private BigDecimal	r105_sadc;
	private BigDecimal	r105_usa;
	private BigDecimal	r105_uk;
	private BigDecimal	r105_europe;
	private BigDecimal	r105_india;
	private BigDecimal	r105_sydney;
	private BigDecimal	r105_uganda;
	private BigDecimal	r105_total;
	private String	r106_product;
	private BigDecimal	r106_botswana;
	private BigDecimal	r106_south_africa;
	private BigDecimal	r106_sadc;
	private BigDecimal	r106_usa;
	private BigDecimal	r106_uk;
	private BigDecimal	r106_europe;
	private BigDecimal	r106_india;
	private BigDecimal	r106_sydney;
	private BigDecimal	r106_uganda;
	private BigDecimal	r106_total;
	private String	r107_product;
	private BigDecimal	r107_botswana;
	private BigDecimal	r107_south_africa;
	private BigDecimal	r107_sadc;
	private BigDecimal	r107_usa;
	private BigDecimal	r107_uk;
	private BigDecimal	r107_europe;
	private BigDecimal	r107_india;
	private BigDecimal	r107_sydney;
	private BigDecimal	r107_uganda;
	private BigDecimal	r107_total;
	private String	r108_product;
	private BigDecimal	r108_botswana;
	private BigDecimal	r108_south_africa;
	private BigDecimal	r108_sadc;
	private BigDecimal	r108_usa;
	private BigDecimal	r108_uk;
	private BigDecimal	r108_europe;
	private BigDecimal	r108_india;
	private BigDecimal	r108_sydney;
	private BigDecimal	r108_uganda;
	private BigDecimal	r108_total;
	private String	r109_product;
	private BigDecimal	r109_botswana;
	private BigDecimal	r109_south_africa;
	private BigDecimal	r109_sadc;
	private BigDecimal	r109_usa;
	private BigDecimal	r109_uk;
	private BigDecimal	r109_europe;
	private BigDecimal	r109_india;
	private BigDecimal	r109_sydney;
	private BigDecimal	r109_uganda;
	private BigDecimal	r109_total;
	private String	r110_product;
	private BigDecimal	r110_botswana;
	private BigDecimal	r110_south_africa;
	private BigDecimal	r110_sadc;
	private BigDecimal	r110_usa;
	private BigDecimal	r110_uk;
	private BigDecimal	r110_europe;
	private BigDecimal	r110_india;
	private BigDecimal	r110_sydney;
	private BigDecimal	r110_uganda;
	private BigDecimal	r110_total;
	private String	r111_product;
	private BigDecimal	r111_botswana;
	private BigDecimal	r111_south_africa;
	private BigDecimal	r111_sadc;
	private BigDecimal	r111_usa;
	private BigDecimal	r111_uk;
	private BigDecimal	r111_europe;
	private BigDecimal	r111_india;
	private BigDecimal	r111_sydney;
	private BigDecimal	r111_uganda;
	private BigDecimal	r111_total;
	private String	r112_product;
	private BigDecimal	r112_botswana;
	private BigDecimal	r112_south_africa;
	private BigDecimal	r112_sadc;
	private BigDecimal	r112_usa;
	private BigDecimal	r112_uk;
	private BigDecimal	r112_europe;
	private BigDecimal	r112_india;
	private BigDecimal	r112_sydney;
	private BigDecimal	r112_uganda;
	private BigDecimal	r112_total;
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
	private String	r61_product;
	private BigDecimal	r61_botswana;
	private BigDecimal	r61_south_africa;
	private BigDecimal	r61_sadc;
	private BigDecimal	r61_usa;
	private BigDecimal	r61_uk;
	private BigDecimal	r61_europe;
	private BigDecimal	r61_india;
	private BigDecimal	r61_sydney;
	private BigDecimal	r61_uganda;
	private BigDecimal	r61_total;
	public String getR101_product() {
		return r101_product;
	}
	public void setR101_product(String r101_product) {
		this.r101_product = r101_product;
	}
	public BigDecimal getR101_botswana() {
		return r101_botswana;
	}
	public void setR101_botswana(BigDecimal r101_botswana) {
		this.r101_botswana = r101_botswana;
	}
	public BigDecimal getR101_south_africa() {
		return r101_south_africa;
	}
	public void setR101_south_africa(BigDecimal r101_south_africa) {
		this.r101_south_africa = r101_south_africa;
	}
	public BigDecimal getR101_sadc() {
		return r101_sadc;
	}
	public void setR101_sadc(BigDecimal r101_sadc) {
		this.r101_sadc = r101_sadc;
	}
	public BigDecimal getR101_usa() {
		return r101_usa;
	}
	public void setR101_usa(BigDecimal r101_usa) {
		this.r101_usa = r101_usa;
	}
	public BigDecimal getR101_uk() {
		return r101_uk;
	}
	public void setR101_uk(BigDecimal r101_uk) {
		this.r101_uk = r101_uk;
	}
	public BigDecimal getR101_europe() {
		return r101_europe;
	}
	public void setR101_europe(BigDecimal r101_europe) {
		this.r101_europe = r101_europe;
	}
	public BigDecimal getR101_india() {
		return r101_india;
	}
	public void setR101_india(BigDecimal r101_india) {
		this.r101_india = r101_india;
	}
	public BigDecimal getR101_sydney() {
		return r101_sydney;
	}
	public void setR101_sydney(BigDecimal r101_sydney) {
		this.r101_sydney = r101_sydney;
	}
	public BigDecimal getR101_uganda() {
		return r101_uganda;
	}
	public void setR101_uganda(BigDecimal r101_uganda) {
		this.r101_uganda = r101_uganda;
	}
	public BigDecimal getR101_total() {
		return r101_total;
	}
	public void setR101_total(BigDecimal r101_total) {
		this.r101_total = r101_total;
	}
	public String getR102_product() {
		return r102_product;
	}
	public void setR102_product(String r102_product) {
		this.r102_product = r102_product;
	}
	public BigDecimal getR102_botswana() {
		return r102_botswana;
	}
	public void setR102_botswana(BigDecimal r102_botswana) {
		this.r102_botswana = r102_botswana;
	}
	public BigDecimal getR102_south_africa() {
		return r102_south_africa;
	}
	public void setR102_south_africa(BigDecimal r102_south_africa) {
		this.r102_south_africa = r102_south_africa;
	}
	public BigDecimal getR102_sadc() {
		return r102_sadc;
	}
	public void setR102_sadc(BigDecimal r102_sadc) {
		this.r102_sadc = r102_sadc;
	}
	public BigDecimal getR102_usa() {
		return r102_usa;
	}
	public void setR102_usa(BigDecimal r102_usa) {
		this.r102_usa = r102_usa;
	}
	public BigDecimal getR102_uk() {
		return r102_uk;
	}
	public void setR102_uk(BigDecimal r102_uk) {
		this.r102_uk = r102_uk;
	}
	public BigDecimal getR102_europe() {
		return r102_europe;
	}
	public void setR102_europe(BigDecimal r102_europe) {
		this.r102_europe = r102_europe;
	}
	public BigDecimal getR102_india() {
		return r102_india;
	}
	public void setR102_india(BigDecimal r102_india) {
		this.r102_india = r102_india;
	}
	public BigDecimal getR102_sydney() {
		return r102_sydney;
	}
	public void setR102_sydney(BigDecimal r102_sydney) {
		this.r102_sydney = r102_sydney;
	}
	public BigDecimal getR102_uganda() {
		return r102_uganda;
	}
	public void setR102_uganda(BigDecimal r102_uganda) {
		this.r102_uganda = r102_uganda;
	}
	public BigDecimal getR102_total() {
		return r102_total;
	}
	public void setR102_total(BigDecimal r102_total) {
		this.r102_total = r102_total;
	}
	public String getR103_product() {
		return r103_product;
	}
	public void setR103_product(String r103_product) {
		this.r103_product = r103_product;
	}
	public BigDecimal getR103_botswana() {
		return r103_botswana;
	}
	public void setR103_botswana(BigDecimal r103_botswana) {
		this.r103_botswana = r103_botswana;
	}
	public BigDecimal getR103_south_africa() {
		return r103_south_africa;
	}
	public void setR103_south_africa(BigDecimal r103_south_africa) {
		this.r103_south_africa = r103_south_africa;
	}
	public BigDecimal getR103_sadc() {
		return r103_sadc;
	}
	public void setR103_sadc(BigDecimal r103_sadc) {
		this.r103_sadc = r103_sadc;
	}
	public BigDecimal getR103_usa() {
		return r103_usa;
	}
	public void setR103_usa(BigDecimal r103_usa) {
		this.r103_usa = r103_usa;
	}
	public BigDecimal getR103_uk() {
		return r103_uk;
	}
	public void setR103_uk(BigDecimal r103_uk) {
		this.r103_uk = r103_uk;
	}
	public BigDecimal getR103_europe() {
		return r103_europe;
	}
	public void setR103_europe(BigDecimal r103_europe) {
		this.r103_europe = r103_europe;
	}
	public BigDecimal getR103_india() {
		return r103_india;
	}
	public void setR103_india(BigDecimal r103_india) {
		this.r103_india = r103_india;
	}
	public BigDecimal getR103_sydney() {
		return r103_sydney;
	}
	public void setR103_sydney(BigDecimal r103_sydney) {
		this.r103_sydney = r103_sydney;
	}
	public BigDecimal getR103_uganda() {
		return r103_uganda;
	}
	public void setR103_uganda(BigDecimal r103_uganda) {
		this.r103_uganda = r103_uganda;
	}
	public BigDecimal getR103_total() {
		return r103_total;
	}
	public void setR103_total(BigDecimal r103_total) {
		this.r103_total = r103_total;
	}
	public String getR104_product() {
		return r104_product;
	}
	public void setR104_product(String r104_product) {
		this.r104_product = r104_product;
	}
	public BigDecimal getR104_botswana() {
		return r104_botswana;
	}
	public void setR104_botswana(BigDecimal r104_botswana) {
		this.r104_botswana = r104_botswana;
	}
	public BigDecimal getR104_south_africa() {
		return r104_south_africa;
	}
	public void setR104_south_africa(BigDecimal r104_south_africa) {
		this.r104_south_africa = r104_south_africa;
	}
	public BigDecimal getR104_sadc() {
		return r104_sadc;
	}
	public void setR104_sadc(BigDecimal r104_sadc) {
		this.r104_sadc = r104_sadc;
	}
	public BigDecimal getR104_usa() {
		return r104_usa;
	}
	public void setR104_usa(BigDecimal r104_usa) {
		this.r104_usa = r104_usa;
	}
	public BigDecimal getR104_uk() {
		return r104_uk;
	}
	public void setR104_uk(BigDecimal r104_uk) {
		this.r104_uk = r104_uk;
	}
	public BigDecimal getR104_europe() {
		return r104_europe;
	}
	public void setR104_europe(BigDecimal r104_europe) {
		this.r104_europe = r104_europe;
	}
	public BigDecimal getR104_india() {
		return r104_india;
	}
	public void setR104_india(BigDecimal r104_india) {
		this.r104_india = r104_india;
	}
	public BigDecimal getR104_sydney() {
		return r104_sydney;
	}
	public void setR104_sydney(BigDecimal r104_sydney) {
		this.r104_sydney = r104_sydney;
	}
	public BigDecimal getR104_uganda() {
		return r104_uganda;
	}
	public void setR104_uganda(BigDecimal r104_uganda) {
		this.r104_uganda = r104_uganda;
	}
	public BigDecimal getR104_total() {
		return r104_total;
	}
	public void setR104_total(BigDecimal r104_total) {
		this.r104_total = r104_total;
	}
	public String getR105_product() {
		return r105_product;
	}
	public void setR105_product(String r105_product) {
		this.r105_product = r105_product;
	}
	public BigDecimal getR105_botswana() {
		return r105_botswana;
	}
	public void setR105_botswana(BigDecimal r105_botswana) {
		this.r105_botswana = r105_botswana;
	}
	public BigDecimal getR105_south_africa() {
		return r105_south_africa;
	}
	public void setR105_south_africa(BigDecimal r105_south_africa) {
		this.r105_south_africa = r105_south_africa;
	}
	public BigDecimal getR105_sadc() {
		return r105_sadc;
	}
	public void setR105_sadc(BigDecimal r105_sadc) {
		this.r105_sadc = r105_sadc;
	}
	public BigDecimal getR105_usa() {
		return r105_usa;
	}
	public void setR105_usa(BigDecimal r105_usa) {
		this.r105_usa = r105_usa;
	}
	public BigDecimal getR105_uk() {
		return r105_uk;
	}
	public void setR105_uk(BigDecimal r105_uk) {
		this.r105_uk = r105_uk;
	}
	public BigDecimal getR105_europe() {
		return r105_europe;
	}
	public void setR105_europe(BigDecimal r105_europe) {
		this.r105_europe = r105_europe;
	}
	public BigDecimal getR105_india() {
		return r105_india;
	}
	public void setR105_india(BigDecimal r105_india) {
		this.r105_india = r105_india;
	}
	public BigDecimal getR105_sydney() {
		return r105_sydney;
	}
	public void setR105_sydney(BigDecimal r105_sydney) {
		this.r105_sydney = r105_sydney;
	}
	public BigDecimal getR105_uganda() {
		return r105_uganda;
	}
	public void setR105_uganda(BigDecimal r105_uganda) {
		this.r105_uganda = r105_uganda;
	}
	public BigDecimal getR105_total() {
		return r105_total;
	}
	public void setR105_total(BigDecimal r105_total) {
		this.r105_total = r105_total;
	}
	public String getR106_product() {
		return r106_product;
	}
	public void setR106_product(String r106_product) {
		this.r106_product = r106_product;
	}
	public BigDecimal getR106_botswana() {
		return r106_botswana;
	}
	public void setR106_botswana(BigDecimal r106_botswana) {
		this.r106_botswana = r106_botswana;
	}
	public BigDecimal getR106_south_africa() {
		return r106_south_africa;
	}
	public void setR106_south_africa(BigDecimal r106_south_africa) {
		this.r106_south_africa = r106_south_africa;
	}
	public BigDecimal getR106_sadc() {
		return r106_sadc;
	}
	public void setR106_sadc(BigDecimal r106_sadc) {
		this.r106_sadc = r106_sadc;
	}
	public BigDecimal getR106_usa() {
		return r106_usa;
	}
	public void setR106_usa(BigDecimal r106_usa) {
		this.r106_usa = r106_usa;
	}
	public BigDecimal getR106_uk() {
		return r106_uk;
	}
	public void setR106_uk(BigDecimal r106_uk) {
		this.r106_uk = r106_uk;
	}
	public BigDecimal getR106_europe() {
		return r106_europe;
	}
	public void setR106_europe(BigDecimal r106_europe) {
		this.r106_europe = r106_europe;
	}
	public BigDecimal getR106_india() {
		return r106_india;
	}
	public void setR106_india(BigDecimal r106_india) {
		this.r106_india = r106_india;
	}
	public BigDecimal getR106_sydney() {
		return r106_sydney;
	}
	public void setR106_sydney(BigDecimal r106_sydney) {
		this.r106_sydney = r106_sydney;
	}
	public BigDecimal getR106_uganda() {
		return r106_uganda;
	}
	public void setR106_uganda(BigDecimal r106_uganda) {
		this.r106_uganda = r106_uganda;
	}
	public BigDecimal getR106_total() {
		return r106_total;
	}
	public void setR106_total(BigDecimal r106_total) {
		this.r106_total = r106_total;
	}
	public String getR107_product() {
		return r107_product;
	}
	public void setR107_product(String r107_product) {
		this.r107_product = r107_product;
	}
	public BigDecimal getR107_botswana() {
		return r107_botswana;
	}
	public void setR107_botswana(BigDecimal r107_botswana) {
		this.r107_botswana = r107_botswana;
	}
	public BigDecimal getR107_south_africa() {
		return r107_south_africa;
	}
	public void setR107_south_africa(BigDecimal r107_south_africa) {
		this.r107_south_africa = r107_south_africa;
	}
	public BigDecimal getR107_sadc() {
		return r107_sadc;
	}
	public void setR107_sadc(BigDecimal r107_sadc) {
		this.r107_sadc = r107_sadc;
	}
	public BigDecimal getR107_usa() {
		return r107_usa;
	}
	public void setR107_usa(BigDecimal r107_usa) {
		this.r107_usa = r107_usa;
	}
	public BigDecimal getR107_uk() {
		return r107_uk;
	}
	public void setR107_uk(BigDecimal r107_uk) {
		this.r107_uk = r107_uk;
	}
	public BigDecimal getR107_europe() {
		return r107_europe;
	}
	public void setR107_europe(BigDecimal r107_europe) {
		this.r107_europe = r107_europe;
	}
	public BigDecimal getR107_india() {
		return r107_india;
	}
	public void setR107_india(BigDecimal r107_india) {
		this.r107_india = r107_india;
	}
	public BigDecimal getR107_sydney() {
		return r107_sydney;
	}
	public void setR107_sydney(BigDecimal r107_sydney) {
		this.r107_sydney = r107_sydney;
	}
	public BigDecimal getR107_uganda() {
		return r107_uganda;
	}
	public void setR107_uganda(BigDecimal r107_uganda) {
		this.r107_uganda = r107_uganda;
	}
	public BigDecimal getR107_total() {
		return r107_total;
	}
	public void setR107_total(BigDecimal r107_total) {
		this.r107_total = r107_total;
	}
	public String getR108_product() {
		return r108_product;
	}
	public void setR108_product(String r108_product) {
		this.r108_product = r108_product;
	}
	public BigDecimal getR108_botswana() {
		return r108_botswana;
	}
	public void setR108_botswana(BigDecimal r108_botswana) {
		this.r108_botswana = r108_botswana;
	}
	public BigDecimal getR108_south_africa() {
		return r108_south_africa;
	}
	public void setR108_south_africa(BigDecimal r108_south_africa) {
		this.r108_south_africa = r108_south_africa;
	}
	public BigDecimal getR108_sadc() {
		return r108_sadc;
	}
	public void setR108_sadc(BigDecimal r108_sadc) {
		this.r108_sadc = r108_sadc;
	}
	public BigDecimal getR108_usa() {
		return r108_usa;
	}
	public void setR108_usa(BigDecimal r108_usa) {
		this.r108_usa = r108_usa;
	}
	public BigDecimal getR108_uk() {
		return r108_uk;
	}
	public void setR108_uk(BigDecimal r108_uk) {
		this.r108_uk = r108_uk;
	}
	public BigDecimal getR108_europe() {
		return r108_europe;
	}
	public void setR108_europe(BigDecimal r108_europe) {
		this.r108_europe = r108_europe;
	}
	public BigDecimal getR108_india() {
		return r108_india;
	}
	public void setR108_india(BigDecimal r108_india) {
		this.r108_india = r108_india;
	}
	public BigDecimal getR108_sydney() {
		return r108_sydney;
	}
	public void setR108_sydney(BigDecimal r108_sydney) {
		this.r108_sydney = r108_sydney;
	}
	public BigDecimal getR108_uganda() {
		return r108_uganda;
	}
	public void setR108_uganda(BigDecimal r108_uganda) {
		this.r108_uganda = r108_uganda;
	}
	public BigDecimal getR108_total() {
		return r108_total;
	}
	public void setR108_total(BigDecimal r108_total) {
		this.r108_total = r108_total;
	}
	public String getR109_product() {
		return r109_product;
	}
	public void setR109_product(String r109_product) {
		this.r109_product = r109_product;
	}
	public BigDecimal getR109_botswana() {
		return r109_botswana;
	}
	public void setR109_botswana(BigDecimal r109_botswana) {
		this.r109_botswana = r109_botswana;
	}
	public BigDecimal getR109_south_africa() {
		return r109_south_africa;
	}
	public void setR109_south_africa(BigDecimal r109_south_africa) {
		this.r109_south_africa = r109_south_africa;
	}
	public BigDecimal getR109_sadc() {
		return r109_sadc;
	}
	public void setR109_sadc(BigDecimal r109_sadc) {
		this.r109_sadc = r109_sadc;
	}
	public BigDecimal getR109_usa() {
		return r109_usa;
	}
	public void setR109_usa(BigDecimal r109_usa) {
		this.r109_usa = r109_usa;
	}
	public BigDecimal getR109_uk() {
		return r109_uk;
	}
	public void setR109_uk(BigDecimal r109_uk) {
		this.r109_uk = r109_uk;
	}
	public BigDecimal getR109_europe() {
		return r109_europe;
	}
	public void setR109_europe(BigDecimal r109_europe) {
		this.r109_europe = r109_europe;
	}
	public BigDecimal getR109_india() {
		return r109_india;
	}
	public void setR109_india(BigDecimal r109_india) {
		this.r109_india = r109_india;
	}
	public BigDecimal getR109_sydney() {
		return r109_sydney;
	}
	public void setR109_sydney(BigDecimal r109_sydney) {
		this.r109_sydney = r109_sydney;
	}
	public BigDecimal getR109_uganda() {
		return r109_uganda;
	}
	public void setR109_uganda(BigDecimal r109_uganda) {
		this.r109_uganda = r109_uganda;
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
	public BigDecimal getR110_botswana() {
		return r110_botswana;
	}
	public void setR110_botswana(BigDecimal r110_botswana) {
		this.r110_botswana = r110_botswana;
	}
	public BigDecimal getR110_south_africa() {
		return r110_south_africa;
	}
	public void setR110_south_africa(BigDecimal r110_south_africa) {
		this.r110_south_africa = r110_south_africa;
	}
	public BigDecimal getR110_sadc() {
		return r110_sadc;
	}
	public void setR110_sadc(BigDecimal r110_sadc) {
		this.r110_sadc = r110_sadc;
	}
	public BigDecimal getR110_usa() {
		return r110_usa;
	}
	public void setR110_usa(BigDecimal r110_usa) {
		this.r110_usa = r110_usa;
	}
	public BigDecimal getR110_uk() {
		return r110_uk;
	}
	public void setR110_uk(BigDecimal r110_uk) {
		this.r110_uk = r110_uk;
	}
	public BigDecimal getR110_europe() {
		return r110_europe;
	}
	public void setR110_europe(BigDecimal r110_europe) {
		this.r110_europe = r110_europe;
	}
	public BigDecimal getR110_india() {
		return r110_india;
	}
	public void setR110_india(BigDecimal r110_india) {
		this.r110_india = r110_india;
	}
	public BigDecimal getR110_sydney() {
		return r110_sydney;
	}
	public void setR110_sydney(BigDecimal r110_sydney) {
		this.r110_sydney = r110_sydney;
	}
	public BigDecimal getR110_uganda() {
		return r110_uganda;
	}
	public void setR110_uganda(BigDecimal r110_uganda) {
		this.r110_uganda = r110_uganda;
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
	public BigDecimal getR111_botswana() {
		return r111_botswana;
	}
	public void setR111_botswana(BigDecimal r111_botswana) {
		this.r111_botswana = r111_botswana;
	}
	public BigDecimal getR111_south_africa() {
		return r111_south_africa;
	}
	public void setR111_south_africa(BigDecimal r111_south_africa) {
		this.r111_south_africa = r111_south_africa;
	}
	public BigDecimal getR111_sadc() {
		return r111_sadc;
	}
	public void setR111_sadc(BigDecimal r111_sadc) {
		this.r111_sadc = r111_sadc;
	}
	public BigDecimal getR111_usa() {
		return r111_usa;
	}
	public void setR111_usa(BigDecimal r111_usa) {
		this.r111_usa = r111_usa;
	}
	public BigDecimal getR111_uk() {
		return r111_uk;
	}
	public void setR111_uk(BigDecimal r111_uk) {
		this.r111_uk = r111_uk;
	}
	public BigDecimal getR111_europe() {
		return r111_europe;
	}
	public void setR111_europe(BigDecimal r111_europe) {
		this.r111_europe = r111_europe;
	}
	public BigDecimal getR111_india() {
		return r111_india;
	}
	public void setR111_india(BigDecimal r111_india) {
		this.r111_india = r111_india;
	}
	public BigDecimal getR111_sydney() {
		return r111_sydney;
	}
	public void setR111_sydney(BigDecimal r111_sydney) {
		this.r111_sydney = r111_sydney;
	}
	public BigDecimal getR111_uganda() {
		return r111_uganda;
	}
	public void setR111_uganda(BigDecimal r111_uganda) {
		this.r111_uganda = r111_uganda;
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
	public BigDecimal getR112_botswana() {
		return r112_botswana;
	}
	public void setR112_botswana(BigDecimal r112_botswana) {
		this.r112_botswana = r112_botswana;
	}
	public BigDecimal getR112_south_africa() {
		return r112_south_africa;
	}
	public void setR112_south_africa(BigDecimal r112_south_africa) {
		this.r112_south_africa = r112_south_africa;
	}
	public BigDecimal getR112_sadc() {
		return r112_sadc;
	}
	public void setR112_sadc(BigDecimal r112_sadc) {
		this.r112_sadc = r112_sadc;
	}
	public BigDecimal getR112_usa() {
		return r112_usa;
	}
	public void setR112_usa(BigDecimal r112_usa) {
		this.r112_usa = r112_usa;
	}
	public BigDecimal getR112_uk() {
		return r112_uk;
	}
	public void setR112_uk(BigDecimal r112_uk) {
		this.r112_uk = r112_uk;
	}
	public BigDecimal getR112_europe() {
		return r112_europe;
	}
	public void setR112_europe(BigDecimal r112_europe) {
		this.r112_europe = r112_europe;
	}
	public BigDecimal getR112_india() {
		return r112_india;
	}
	public void setR112_india(BigDecimal r112_india) {
		this.r112_india = r112_india;
	}
	public BigDecimal getR112_sydney() {
		return r112_sydney;
	}
	public void setR112_sydney(BigDecimal r112_sydney) {
		this.r112_sydney = r112_sydney;
	}
	public BigDecimal getR112_uganda() {
		return r112_uganda;
	}
	public void setR112_uganda(BigDecimal r112_uganda) {
		this.r112_uganda = r112_uganda;
	}
	public BigDecimal getR112_total() {
		return r112_total;
	}
	public void setR112_total(BigDecimal r112_total) {
		this.r112_total = r112_total;
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
	public String getR61_product() {
		return r61_product;
	}
	public void setR61_product(String r61_product) {
		this.r61_product = r61_product;
	}
	public BigDecimal getR61_botswana() {
		return r61_botswana;
	}
	public void setR61_botswana(BigDecimal r61_botswana) {
		this.r61_botswana = r61_botswana;
	}
	public BigDecimal getR61_south_africa() {
		return r61_south_africa;
	}
	public void setR61_south_africa(BigDecimal r61_south_africa) {
		this.r61_south_africa = r61_south_africa;
	}
	public BigDecimal getR61_sadc() {
		return r61_sadc;
	}
	public void setR61_sadc(BigDecimal r61_sadc) {
		this.r61_sadc = r61_sadc;
	}
	public BigDecimal getR61_usa() {
		return r61_usa;
	}
	public void setR61_usa(BigDecimal r61_usa) {
		this.r61_usa = r61_usa;
	}
	public BigDecimal getR61_uk() {
		return r61_uk;
	}
	public void setR61_uk(BigDecimal r61_uk) {
		this.r61_uk = r61_uk;
	}
	public BigDecimal getR61_europe() {
		return r61_europe;
	}
	public void setR61_europe(BigDecimal r61_europe) {
		this.r61_europe = r61_europe;
	}
	public BigDecimal getR61_india() {
		return r61_india;
	}
	public void setR61_india(BigDecimal r61_india) {
		this.r61_india = r61_india;
	}
	public BigDecimal getR61_sydney() {
		return r61_sydney;
	}
	public void setR61_sydney(BigDecimal r61_sydney) {
		this.r61_sydney = r61_sydney;
	}
	public BigDecimal getR61_uganda() {
		return r61_uganda;
	}
	public void setR61_uganda(BigDecimal r61_uganda) {
		this.r61_uganda = r61_uganda;
	}
	public BigDecimal getR61_total() {
		return r61_total;
	}
	public void setR61_total(BigDecimal r61_total) {
		this.r61_total = r61_total;
	}
	@Override
	public String toString() {
		return "BRS33_T2_ENTITY [r101_product=" + r101_product + ", r101_botswana=" + r101_botswana
				+ ", r101_south_africa=" + r101_south_africa + ", r101_sadc=" + r101_sadc + ", r101_usa=" + r101_usa
				+ ", r101_uk=" + r101_uk + ", r101_europe=" + r101_europe + ", r101_india=" + r101_india
				+ ", r101_sydney=" + r101_sydney + ", r101_uganda=" + r101_uganda + ", r101_total=" + r101_total
				+ ", r102_product=" + r102_product + ", r102_botswana=" + r102_botswana + ", r102_south_africa="
				+ r102_south_africa + ", r102_sadc=" + r102_sadc + ", r102_usa=" + r102_usa + ", r102_uk=" + r102_uk
				+ ", r102_europe=" + r102_europe + ", r102_india=" + r102_india + ", r102_sydney=" + r102_sydney
				+ ", r102_uganda=" + r102_uganda + ", r102_total=" + r102_total + ", r103_product=" + r103_product
				+ ", r103_botswana=" + r103_botswana + ", r103_south_africa=" + r103_south_africa + ", r103_sadc="
				+ r103_sadc + ", r103_usa=" + r103_usa + ", r103_uk=" + r103_uk + ", r103_europe=" + r103_europe
				+ ", r103_india=" + r103_india + ", r103_sydney=" + r103_sydney + ", r103_uganda=" + r103_uganda
				+ ", r103_total=" + r103_total + ", r104_product=" + r104_product + ", r104_botswana=" + r104_botswana
				+ ", r104_south_africa=" + r104_south_africa + ", r104_sadc=" + r104_sadc + ", r104_usa=" + r104_usa
				+ ", r104_uk=" + r104_uk + ", r104_europe=" + r104_europe + ", r104_india=" + r104_india
				+ ", r104_sydney=" + r104_sydney + ", r104_uganda=" + r104_uganda + ", r104_total=" + r104_total
				+ ", r105_product=" + r105_product + ", r105_botswana=" + r105_botswana + ", r105_south_africa="
				+ r105_south_africa + ", r105_sadc=" + r105_sadc + ", r105_usa=" + r105_usa + ", r105_uk=" + r105_uk
				+ ", r105_europe=" + r105_europe + ", r105_india=" + r105_india + ", r105_sydney=" + r105_sydney
				+ ", r105_uganda=" + r105_uganda + ", r105_total=" + r105_total + ", r106_product=" + r106_product
				+ ", r106_botswana=" + r106_botswana + ", r106_south_africa=" + r106_south_africa + ", r106_sadc="
				+ r106_sadc + ", r106_usa=" + r106_usa + ", r106_uk=" + r106_uk + ", r106_europe=" + r106_europe
				+ ", r106_india=" + r106_india + ", r106_sydney=" + r106_sydney + ", r106_uganda=" + r106_uganda
				+ ", r106_total=" + r106_total + ", r107_product=" + r107_product + ", r107_botswana=" + r107_botswana
				+ ", r107_south_africa=" + r107_south_africa + ", r107_sadc=" + r107_sadc + ", r107_usa=" + r107_usa
				+ ", r107_uk=" + r107_uk + ", r107_europe=" + r107_europe + ", r107_india=" + r107_india
				+ ", r107_sydney=" + r107_sydney + ", r107_uganda=" + r107_uganda + ", r107_total=" + r107_total
				+ ", r108_product=" + r108_product + ", r108_botswana=" + r108_botswana + ", r108_south_africa="
				+ r108_south_africa + ", r108_sadc=" + r108_sadc + ", r108_usa=" + r108_usa + ", r108_uk=" + r108_uk
				+ ", r108_europe=" + r108_europe + ", r108_india=" + r108_india + ", r108_sydney=" + r108_sydney
				+ ", r108_uganda=" + r108_uganda + ", r108_total=" + r108_total + ", r109_product=" + r109_product
				+ ", r109_botswana=" + r109_botswana + ", r109_south_africa=" + r109_south_africa + ", r109_sadc="
				+ r109_sadc + ", r109_usa=" + r109_usa + ", r109_uk=" + r109_uk + ", r109_europe=" + r109_europe
				+ ", r109_india=" + r109_india + ", r109_sydney=" + r109_sydney + ", r109_uganda=" + r109_uganda
				+ ", r109_total=" + r109_total + ", r110_product=" + r110_product + ", r110_botswana=" + r110_botswana
				+ ", r110_south_africa=" + r110_south_africa + ", r110_sadc=" + r110_sadc + ", r110_usa=" + r110_usa
				+ ", r110_uk=" + r110_uk + ", r110_europe=" + r110_europe + ", r110_india=" + r110_india
				+ ", r110_sydney=" + r110_sydney + ", r110_uganda=" + r110_uganda + ", r110_total=" + r110_total
				+ ", r111_product=" + r111_product + ", r111_botswana=" + r111_botswana + ", r111_south_africa="
				+ r111_south_africa + ", r111_sadc=" + r111_sadc + ", r111_usa=" + r111_usa + ", r111_uk=" + r111_uk
				+ ", r111_europe=" + r111_europe + ", r111_india=" + r111_india + ", r111_sydney=" + r111_sydney
				+ ", r111_uganda=" + r111_uganda + ", r111_total=" + r111_total + ", r112_product=" + r112_product
				+ ", r112_botswana=" + r112_botswana + ", r112_south_africa=" + r112_south_africa + ", r112_sadc="
				+ r112_sadc + ", r112_usa=" + r112_usa + ", r112_uk=" + r112_uk + ", r112_europe=" + r112_europe
				+ ", r112_india=" + r112_india + ", r112_sydney=" + r112_sydney + ", r112_uganda=" + r112_uganda
				+ ", r112_total=" + r112_total + ", report_date=" + report_date + ", report_from_date="
				+ report_from_date + ", report_to_date=" + report_to_date + ", entity_flg=" + entity_flg
				+ ", modify_flg=" + modify_flg + ", del_flg=" + del_flg + ", report_code=" + report_code
				+ ", report_submit_date=" + report_submit_date + ", r61_product=" + r61_product + ", r61_botswana="
				+ r61_botswana + ", r61_south_africa=" + r61_south_africa + ", r61_sadc=" + r61_sadc + ", r61_usa="
				+ r61_usa + ", r61_uk=" + r61_uk + ", r61_europe=" + r61_europe + ", r61_india=" + r61_india
				+ ", r61_sydney=" + r61_sydney + ", r61_uganda=" + r61_uganda + ", r61_total=" + r61_total
				+ ", getR101_product()=" + getR101_product() + ", getR101_botswana()=" + getR101_botswana()
				+ ", getR101_south_africa()=" + getR101_south_africa() + ", getR101_sadc()=" + getR101_sadc()
				+ ", getR101_usa()=" + getR101_usa() + ", getR101_uk()=" + getR101_uk() + ", getR101_europe()="
				+ getR101_europe() + ", getR101_india()=" + getR101_india() + ", getR101_sydney()=" + getR101_sydney()
				+ ", getR101_uganda()=" + getR101_uganda() + ", getR101_total()=" + getR101_total()
				+ ", getR102_product()=" + getR102_product() + ", getR102_botswana()=" + getR102_botswana()
				+ ", getR102_south_africa()=" + getR102_south_africa() + ", getR102_sadc()=" + getR102_sadc()
				+ ", getR102_usa()=" + getR102_usa() + ", getR102_uk()=" + getR102_uk() + ", getR102_europe()="
				+ getR102_europe() + ", getR102_india()=" + getR102_india() + ", getR102_sydney()=" + getR102_sydney()
				+ ", getR102_uganda()=" + getR102_uganda() + ", getR102_total()=" + getR102_total()
				+ ", getR103_product()=" + getR103_product() + ", getR103_botswana()=" + getR103_botswana()
				+ ", getR103_south_africa()=" + getR103_south_africa() + ", getR103_sadc()=" + getR103_sadc()
				+ ", getR103_usa()=" + getR103_usa() + ", getR103_uk()=" + getR103_uk() + ", getR103_europe()="
				+ getR103_europe() + ", getR103_india()=" + getR103_india() + ", getR103_sydney()=" + getR103_sydney()
				+ ", getR103_uganda()=" + getR103_uganda() + ", getR103_total()=" + getR103_total()
				+ ", getR104_product()=" + getR104_product() + ", getR104_botswana()=" + getR104_botswana()
				+ ", getR104_south_africa()=" + getR104_south_africa() + ", getR104_sadc()=" + getR104_sadc()
				+ ", getR104_usa()=" + getR104_usa() + ", getR104_uk()=" + getR104_uk() + ", getR104_europe()="
				+ getR104_europe() + ", getR104_india()=" + getR104_india() + ", getR104_sydney()=" + getR104_sydney()
				+ ", getR104_uganda()=" + getR104_uganda() + ", getR104_total()=" + getR104_total()
				+ ", getR105_product()=" + getR105_product() + ", getR105_botswana()=" + getR105_botswana()
				+ ", getR105_south_africa()=" + getR105_south_africa() + ", getR105_sadc()=" + getR105_sadc()
				+ ", getR105_usa()=" + getR105_usa() + ", getR105_uk()=" + getR105_uk() + ", getR105_europe()="
				+ getR105_europe() + ", getR105_india()=" + getR105_india() + ", getR105_sydney()=" + getR105_sydney()
				+ ", getR105_uganda()=" + getR105_uganda() + ", getR105_total()=" + getR105_total()
				+ ", getR106_product()=" + getR106_product() + ", getR106_botswana()=" + getR106_botswana()
				+ ", getR106_south_africa()=" + getR106_south_africa() + ", getR106_sadc()=" + getR106_sadc()
				+ ", getR106_usa()=" + getR106_usa() + ", getR106_uk()=" + getR106_uk() + ", getR106_europe()="
				+ getR106_europe() + ", getR106_india()=" + getR106_india() + ", getR106_sydney()=" + getR106_sydney()
				+ ", getR106_uganda()=" + getR106_uganda() + ", getR106_total()=" + getR106_total()
				+ ", getR107_product()=" + getR107_product() + ", getR107_botswana()=" + getR107_botswana()
				+ ", getR107_south_africa()=" + getR107_south_africa() + ", getR107_sadc()=" + getR107_sadc()
				+ ", getR107_usa()=" + getR107_usa() + ", getR107_uk()=" + getR107_uk() + ", getR107_europe()="
				+ getR107_europe() + ", getR107_india()=" + getR107_india() + ", getR107_sydney()=" + getR107_sydney()
				+ ", getR107_uganda()=" + getR107_uganda() + ", getR107_total()=" + getR107_total()
				+ ", getR108_product()=" + getR108_product() + ", getR108_botswana()=" + getR108_botswana()
				+ ", getR108_south_africa()=" + getR108_south_africa() + ", getR108_sadc()=" + getR108_sadc()
				+ ", getR108_usa()=" + getR108_usa() + ", getR108_uk()=" + getR108_uk() + ", getR108_europe()="
				+ getR108_europe() + ", getR108_india()=" + getR108_india() + ", getR108_sydney()=" + getR108_sydney()
				+ ", getR108_uganda()=" + getR108_uganda() + ", getR108_total()=" + getR108_total()
				+ ", getR109_product()=" + getR109_product() + ", getR109_botswana()=" + getR109_botswana()
				+ ", getR109_south_africa()=" + getR109_south_africa() + ", getR109_sadc()=" + getR109_sadc()
				+ ", getR109_usa()=" + getR109_usa() + ", getR109_uk()=" + getR109_uk() + ", getR109_europe()="
				+ getR109_europe() + ", getR109_india()=" + getR109_india() + ", getR109_sydney()=" + getR109_sydney()
				+ ", getR109_uganda()=" + getR109_uganda() + ", getR109_total()=" + getR109_total()
				+ ", getR110_product()=" + getR110_product() + ", getR110_botswana()=" + getR110_botswana()
				+ ", getR110_south_africa()=" + getR110_south_africa() + ", getR110_sadc()=" + getR110_sadc()
				+ ", getR110_usa()=" + getR110_usa() + ", getR110_uk()=" + getR110_uk() + ", getR110_europe()="
				+ getR110_europe() + ", getR110_india()=" + getR110_india() + ", getR110_sydney()=" + getR110_sydney()
				+ ", getR110_uganda()=" + getR110_uganda() + ", getR110_total()=" + getR110_total()
				+ ", getR111_product()=" + getR111_product() + ", getR111_botswana()=" + getR111_botswana()
				+ ", getR111_south_africa()=" + getR111_south_africa() + ", getR111_sadc()=" + getR111_sadc()
				+ ", getR111_usa()=" + getR111_usa() + ", getR111_uk()=" + getR111_uk() + ", getR111_europe()="
				+ getR111_europe() + ", getR111_india()=" + getR111_india() + ", getR111_sydney()=" + getR111_sydney()
				+ ", getR111_uganda()=" + getR111_uganda() + ", getR111_total()=" + getR111_total()
				+ ", getR112_product()=" + getR112_product() + ", getR112_botswana()=" + getR112_botswana()
				+ ", getR112_south_africa()=" + getR112_south_africa() + ", getR112_sadc()=" + getR112_sadc()
				+ ", getR112_usa()=" + getR112_usa() + ", getR112_uk()=" + getR112_uk() + ", getR112_europe()="
				+ getR112_europe() + ", getR112_india()=" + getR112_india() + ", getR112_sydney()=" + getR112_sydney()
				+ ", getR112_uganda()=" + getR112_uganda() + ", getR112_total()=" + getR112_total()
				+ ", getReport_date()=" + getReport_date() + ", getReport_from_date()=" + getReport_from_date()
				+ ", getReport_to_date()=" + getReport_to_date() + ", getEntity_flg()=" + getEntity_flg()
				+ ", getModify_flg()=" + getModify_flg() + ", getDel_flg()=" + getDel_flg() + ", getReport_code()="
				+ getReport_code() + ", getReport_submit_date()=" + getReport_submit_date() + ", getR61_product()="
				+ getR61_product() + ", getR61_botswana()=" + getR61_botswana() + ", getR61_south_africa()="
				+ getR61_south_africa() + ", getR61_sadc()=" + getR61_sadc() + ", getR61_usa()=" + getR61_usa()
				+ ", getR61_uk()=" + getR61_uk() + ", getR61_europe()=" + getR61_europe() + ", getR61_india()="
				+ getR61_india() + ", getR61_sydney()=" + getR61_sydney() + ", getR61_uganda()=" + getR61_uganda()
				+ ", getR61_total()=" + getR61_total() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public BRS33_T2_ENTITY(String r101_product, BigDecimal r101_botswana, BigDecimal r101_south_africa,
			BigDecimal r101_sadc, BigDecimal r101_usa, BigDecimal r101_uk, BigDecimal r101_europe,
			BigDecimal r101_india, BigDecimal r101_sydney, BigDecimal r101_uganda, BigDecimal r101_total,
			String r102_product, BigDecimal r102_botswana, BigDecimal r102_south_africa, BigDecimal r102_sadc,
			BigDecimal r102_usa, BigDecimal r102_uk, BigDecimal r102_europe, BigDecimal r102_india,
			BigDecimal r102_sydney, BigDecimal r102_uganda, BigDecimal r102_total, String r103_product,
			BigDecimal r103_botswana, BigDecimal r103_south_africa, BigDecimal r103_sadc, BigDecimal r103_usa,
			BigDecimal r103_uk, BigDecimal r103_europe, BigDecimal r103_india, BigDecimal r103_sydney,
			BigDecimal r103_uganda, BigDecimal r103_total, String r104_product, BigDecimal r104_botswana,
			BigDecimal r104_south_africa, BigDecimal r104_sadc, BigDecimal r104_usa, BigDecimal r104_uk,
			BigDecimal r104_europe, BigDecimal r104_india, BigDecimal r104_sydney, BigDecimal r104_uganda,
			BigDecimal r104_total, String r105_product, BigDecimal r105_botswana, BigDecimal r105_south_africa,
			BigDecimal r105_sadc, BigDecimal r105_usa, BigDecimal r105_uk, BigDecimal r105_europe,
			BigDecimal r105_india, BigDecimal r105_sydney, BigDecimal r105_uganda, BigDecimal r105_total,
			String r106_product, BigDecimal r106_botswana, BigDecimal r106_south_africa, BigDecimal r106_sadc,
			BigDecimal r106_usa, BigDecimal r106_uk, BigDecimal r106_europe, BigDecimal r106_india,
			BigDecimal r106_sydney, BigDecimal r106_uganda, BigDecimal r106_total, String r107_product,
			BigDecimal r107_botswana, BigDecimal r107_south_africa, BigDecimal r107_sadc, BigDecimal r107_usa,
			BigDecimal r107_uk, BigDecimal r107_europe, BigDecimal r107_india, BigDecimal r107_sydney,
			BigDecimal r107_uganda, BigDecimal r107_total, String r108_product, BigDecimal r108_botswana,
			BigDecimal r108_south_africa, BigDecimal r108_sadc, BigDecimal r108_usa, BigDecimal r108_uk,
			BigDecimal r108_europe, BigDecimal r108_india, BigDecimal r108_sydney, BigDecimal r108_uganda,
			BigDecimal r108_total, String r109_product, BigDecimal r109_botswana, BigDecimal r109_south_africa,
			BigDecimal r109_sadc, BigDecimal r109_usa, BigDecimal r109_uk, BigDecimal r109_europe,
			BigDecimal r109_india, BigDecimal r109_sydney, BigDecimal r109_uganda, BigDecimal r109_total,
			String r110_product, BigDecimal r110_botswana, BigDecimal r110_south_africa, BigDecimal r110_sadc,
			BigDecimal r110_usa, BigDecimal r110_uk, BigDecimal r110_europe, BigDecimal r110_india,
			BigDecimal r110_sydney, BigDecimal r110_uganda, BigDecimal r110_total, String r111_product,
			BigDecimal r111_botswana, BigDecimal r111_south_africa, BigDecimal r111_sadc, BigDecimal r111_usa,
			BigDecimal r111_uk, BigDecimal r111_europe, BigDecimal r111_india, BigDecimal r111_sydney,
			BigDecimal r111_uganda, BigDecimal r111_total, String r112_product, BigDecimal r112_botswana,
			BigDecimal r112_south_africa, BigDecimal r112_sadc, BigDecimal r112_usa, BigDecimal r112_uk,
			BigDecimal r112_europe, BigDecimal r112_india, BigDecimal r112_sydney, BigDecimal r112_uganda,
			BigDecimal r112_total, Date report_date, Date report_from_date, Date report_to_date, String entity_flg,
			String modify_flg, String del_flg, String report_code, Date report_submit_date, String r61_product,
			BigDecimal r61_botswana, BigDecimal r61_south_africa, BigDecimal r61_sadc, BigDecimal r61_usa,
			BigDecimal r61_uk, BigDecimal r61_europe, BigDecimal r61_india, BigDecimal r61_sydney,
			BigDecimal r61_uganda, BigDecimal r61_total) {
		super();
		this.r101_product = r101_product;
		this.r101_botswana = r101_botswana;
		this.r101_south_africa = r101_south_africa;
		this.r101_sadc = r101_sadc;
		this.r101_usa = r101_usa;
		this.r101_uk = r101_uk;
		this.r101_europe = r101_europe;
		this.r101_india = r101_india;
		this.r101_sydney = r101_sydney;
		this.r101_uganda = r101_uganda;
		this.r101_total = r101_total;
		this.r102_product = r102_product;
		this.r102_botswana = r102_botswana;
		this.r102_south_africa = r102_south_africa;
		this.r102_sadc = r102_sadc;
		this.r102_usa = r102_usa;
		this.r102_uk = r102_uk;
		this.r102_europe = r102_europe;
		this.r102_india = r102_india;
		this.r102_sydney = r102_sydney;
		this.r102_uganda = r102_uganda;
		this.r102_total = r102_total;
		this.r103_product = r103_product;
		this.r103_botswana = r103_botswana;
		this.r103_south_africa = r103_south_africa;
		this.r103_sadc = r103_sadc;
		this.r103_usa = r103_usa;
		this.r103_uk = r103_uk;
		this.r103_europe = r103_europe;
		this.r103_india = r103_india;
		this.r103_sydney = r103_sydney;
		this.r103_uganda = r103_uganda;
		this.r103_total = r103_total;
		this.r104_product = r104_product;
		this.r104_botswana = r104_botswana;
		this.r104_south_africa = r104_south_africa;
		this.r104_sadc = r104_sadc;
		this.r104_usa = r104_usa;
		this.r104_uk = r104_uk;
		this.r104_europe = r104_europe;
		this.r104_india = r104_india;
		this.r104_sydney = r104_sydney;
		this.r104_uganda = r104_uganda;
		this.r104_total = r104_total;
		this.r105_product = r105_product;
		this.r105_botswana = r105_botswana;
		this.r105_south_africa = r105_south_africa;
		this.r105_sadc = r105_sadc;
		this.r105_usa = r105_usa;
		this.r105_uk = r105_uk;
		this.r105_europe = r105_europe;
		this.r105_india = r105_india;
		this.r105_sydney = r105_sydney;
		this.r105_uganda = r105_uganda;
		this.r105_total = r105_total;
		this.r106_product = r106_product;
		this.r106_botswana = r106_botswana;
		this.r106_south_africa = r106_south_africa;
		this.r106_sadc = r106_sadc;
		this.r106_usa = r106_usa;
		this.r106_uk = r106_uk;
		this.r106_europe = r106_europe;
		this.r106_india = r106_india;
		this.r106_sydney = r106_sydney;
		this.r106_uganda = r106_uganda;
		this.r106_total = r106_total;
		this.r107_product = r107_product;
		this.r107_botswana = r107_botswana;
		this.r107_south_africa = r107_south_africa;
		this.r107_sadc = r107_sadc;
		this.r107_usa = r107_usa;
		this.r107_uk = r107_uk;
		this.r107_europe = r107_europe;
		this.r107_india = r107_india;
		this.r107_sydney = r107_sydney;
		this.r107_uganda = r107_uganda;
		this.r107_total = r107_total;
		this.r108_product = r108_product;
		this.r108_botswana = r108_botswana;
		this.r108_south_africa = r108_south_africa;
		this.r108_sadc = r108_sadc;
		this.r108_usa = r108_usa;
		this.r108_uk = r108_uk;
		this.r108_europe = r108_europe;
		this.r108_india = r108_india;
		this.r108_sydney = r108_sydney;
		this.r108_uganda = r108_uganda;
		this.r108_total = r108_total;
		this.r109_product = r109_product;
		this.r109_botswana = r109_botswana;
		this.r109_south_africa = r109_south_africa;
		this.r109_sadc = r109_sadc;
		this.r109_usa = r109_usa;
		this.r109_uk = r109_uk;
		this.r109_europe = r109_europe;
		this.r109_india = r109_india;
		this.r109_sydney = r109_sydney;
		this.r109_uganda = r109_uganda;
		this.r109_total = r109_total;
		this.r110_product = r110_product;
		this.r110_botswana = r110_botswana;
		this.r110_south_africa = r110_south_africa;
		this.r110_sadc = r110_sadc;
		this.r110_usa = r110_usa;
		this.r110_uk = r110_uk;
		this.r110_europe = r110_europe;
		this.r110_india = r110_india;
		this.r110_sydney = r110_sydney;
		this.r110_uganda = r110_uganda;
		this.r110_total = r110_total;
		this.r111_product = r111_product;
		this.r111_botswana = r111_botswana;
		this.r111_south_africa = r111_south_africa;
		this.r111_sadc = r111_sadc;
		this.r111_usa = r111_usa;
		this.r111_uk = r111_uk;
		this.r111_europe = r111_europe;
		this.r111_india = r111_india;
		this.r111_sydney = r111_sydney;
		this.r111_uganda = r111_uganda;
		this.r111_total = r111_total;
		this.r112_product = r112_product;
		this.r112_botswana = r112_botswana;
		this.r112_south_africa = r112_south_africa;
		this.r112_sadc = r112_sadc;
		this.r112_usa = r112_usa;
		this.r112_uk = r112_uk;
		this.r112_europe = r112_europe;
		this.r112_india = r112_india;
		this.r112_sydney = r112_sydney;
		this.r112_uganda = r112_uganda;
		this.r112_total = r112_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
		this.r61_product = r61_product;
		this.r61_botswana = r61_botswana;
		this.r61_south_africa = r61_south_africa;
		this.r61_sadc = r61_sadc;
		this.r61_usa = r61_usa;
		this.r61_uk = r61_uk;
		this.r61_europe = r61_europe;
		this.r61_india = r61_india;
		this.r61_sydney = r61_sydney;
		this.r61_uganda = r61_uganda;
		this.r61_total = r61_total;
	}
	public BRS33_T2_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	
}

package com.demo.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private Integer cno;
	private Double pAmt;
	private Double interest;
	private Double time;
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Double getpAmt() {
		return pAmt;
	}
	public void setpAmt(Double pAmt) {
		this.pAmt = pAmt;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public Double getTime() {
		return time;
	}
	public void setTime(Double time) {
		this.time = time;
	}
	
}

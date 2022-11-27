package com.sam.expenseManager.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long personId;
	private String personName;
	private String personMailId;
	private String personPhoneNo;
	private double personMonthlyIncome;
	public long getPersonId() {
		return personId;
	}
	public void setId(long id) {
		this.personId = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String name) {
		this.personName = name;
	}
	public String getPersonMailId() {
		return personMailId;
	}
	public void setPersonMailId(String mailId) {
		this.personMailId = mailId;
	}
	public String getPersonPhoneNo() {
		return personPhoneNo;
	}
	public void setPersonPhoneNo(String phoneNo) {
		this.personPhoneNo = phoneNo;
	}
	public double getPersonMonthlyIncome() {
		return personMonthlyIncome;
	}
	public void setPersonMonthlyIncome(double monthlyIncome) {
		this.personMonthlyIncome = monthlyIncome;
	}
	
	
}

package com.sam.expenseManager.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expenses")
public class Expense {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long expenseId;
	String expenseName;
	String expenseType;
	double expenseAmount;
	int spentBy;
	
	public Expense() {}
	
	public Expense(long expenseId, String expenseName, String expenseType, double expenseAmount, int spentBy) {
		this.expenseId = expenseId;
		this.expenseName = expenseName;
		this.expenseType = expenseType;
		this.expenseAmount = expenseAmount;
		this.spentBy = spentBy;
	}
	
	public long getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}
	public String getExpenseName() {
		return expenseName;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public double getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public int getSpentBy() {
		return spentBy;
	}
	public void setSpentBy(int spentBy) {
		this.spentBy = spentBy;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseName=" + expenseName + ", expenseType=" + expenseType
				+ ", expenseAmount=" + expenseAmount + ", spentBy=" + spentBy + "]";
	}
	
	
}

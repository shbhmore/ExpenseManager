package com.sam.expenseManager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.expenseManager.Model.Expense;
import com.sam.expenseManager.Repo.ExpenseManagerRepo;

@Service
public class ExpenseManagerService {
	
	@Autowired
	ExpenseManagerRepo repo;
	
	public List<Expense> getAllExpenses(){
		return repo.findAll();
	}

	public void addExpense(Expense expense) {
		
		System.out.println("Expense:: is:: "+expense);
		
		repo.save(expense);
	}
}

package com.sam.expenseManager.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sam.expenseManager.Model.Expense;
import com.sam.expenseManager.Model.Person;
import com.sam.expenseManager.Service.ExpenseService;
import com.sam.expenseManager.Service.PersonService;
 
@RestController
@CrossOrigin
public class HomeController {
	@Autowired
	ExpenseService eService;
	@Autowired
	PersonService pService;
	
	@GetMapping("getAllExpenses")
	public List<Expense> getAllExpenses(){
		System.out.println("Asked");
		return eService.getAllExpenses();		
	}
	
	@RequestMapping("addExpense")
	public void addExpense(@RequestBody Expense expense){
		System.out.println("Spent by: "+expense.getSpentBy()+"::"+expense.getExpenseName());
		eService.addExpense(expense);  
	}
	
	@GetMapping("getAllPersons")
	public List<Person> getAllPerson(){
		
		return pService.getAllPerson();
	}
	
	@PostMapping("addPerson")
	public void addPerson(@RequestBody Person person) {
		pService.addPerson(person);
	}
	
	@PostMapping("updateMail")
	public int updateMailById(String mailId, long id) {
		
		return pService.updateMailById(mailId, id);
	}
	
	@PostMapping("updatePhone")
	public int updatePhoneById(String phoneNo, long id) {
		
		return pService.updatePhoneById(phoneNo, id);
	}
	
	@PostMapping("updateMonthlyIncome")
	public int updateMonthlyIncomeById(double monthlyIncome, long id) {
		
		return pService.updateMonthlyIncomeById(monthlyIncome, id);
	}
	
	
	
}

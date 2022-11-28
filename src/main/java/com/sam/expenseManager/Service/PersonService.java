package com.sam.expenseManager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.expenseManager.Model.Person;
import com.sam.expenseManager.Repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo repo;
	
	public List<Person> getAllPerson(){
		return repo.findAll();
	}
	
	public void addPerson(Person person) {
		repo.save(person);
	}
	
	public int updateMailById(String mailId, long id) {
		if(repo.existsById(id))
		{
			return repo.updateMailById(mailId,id);
		}
		else
		{
			return 0;
		}	
	}
	public int updatePhoneById(String phoneNo, long id) {
		if(repo.existsById(id))
		{
			return repo.updatePhoneById(phoneNo,id);
		}
		else
		{
			return 0;
		}
	}

	public int updateMonthlyIncomeById(double monthlyIncome, long id) {
		if(repo.existsById(id))
		{
			return repo.updateMonthlyIncomeById(monthlyIncome,id);
		}
		else
		{
			return 0;
		}
	}
		
}

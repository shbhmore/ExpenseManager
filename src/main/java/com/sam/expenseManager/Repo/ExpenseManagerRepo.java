package com.sam.expenseManager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.expenseManager.Model.Expense;

@Repository
public interface ExpenseManagerRepo extends JpaRepository<Expense, Long>{

}

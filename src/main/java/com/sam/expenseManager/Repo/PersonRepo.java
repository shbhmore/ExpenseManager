package com.sam.expenseManager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sam.expenseManager.Model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
	
	@Modifying(clearAutomatically=true)
	@Query(value="update person p set phone_no = :phoneNo where id = :id", nativeQuery = true)
	int updatePhoneById(@Param("phoneNo")String phoneNo, @Param("id")long id);

	@Modifying(clearAutomatically=true)
	@Query(value="update person p set mail_id = :mailId where id= :id", nativeQuery = true)	
	int updateMailById(@Param("mailId") String mailId,@Param("id") long id);

	@Modifying(clearAutomatically=true)
	@Query(value = "update person p set monthly_income = :monthlyIncome where id = :id", nativeQuery = true)
	int updateMonthlyIncomeById(@Param("monthlyIncome") double monthlyIncome,@Param("id") long id);
}

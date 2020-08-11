package com.reinosoft.core.repository;

import com.reinosoft.core.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Expenses extends JpaRepository<Expense, Long> {
}

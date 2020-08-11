package com.reinosoft.core.repository;

import com.reinosoft.core.model.Saving;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Savings extends JpaRepository<Saving, Long> {
}

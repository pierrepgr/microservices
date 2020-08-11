package com.reinosoft.financial;

import com.reinosoft.core.model.BaseEntity;
import com.reinosoft.core.repository.Expenses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackageClasses = { BaseEntity.class })
@EnableJpaRepositories(basePackageClasses = { Expenses.class })
public class FinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialApplication.class, args);
    }
}

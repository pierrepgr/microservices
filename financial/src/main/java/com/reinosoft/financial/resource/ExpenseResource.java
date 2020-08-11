package com.reinosoft.financial.resource;

import com.reinosoft.core.model.Expense;
import com.reinosoft.core.repository.Expenses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExpenseResource {

    private final Expenses expenses;

    @GetMapping
    public ResponseEntity<List<Expense>> listAll() {
        return ResponseEntity.ok(this.expenses.findAll());
    }
}

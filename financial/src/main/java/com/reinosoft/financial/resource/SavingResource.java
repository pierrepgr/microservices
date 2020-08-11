package com.reinosoft.financial.resource;

import com.reinosoft.core.model.Saving;
import com.reinosoft.core.repository.Savings;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/savings")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SavingResource {

    private final Savings savings;

    @GetMapping
    public ResponseEntity<List<Saving>> listAll() {
        return ResponseEntity.ok(this.savings.findAll());
    }
}

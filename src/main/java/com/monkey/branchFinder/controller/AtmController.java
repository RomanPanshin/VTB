package com.monkey.branchFinder.controller;

import com.monkey.branchFinder.model.Atm;
import com.monkey.branchFinder.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/atms")
public class AtmController {

    private final AtmService atmService;

    @Autowired
    public AtmController(AtmService atmService) {
        this.atmService = atmService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atm> getAtmById(@PathVariable Long id) {
        Optional<Atm> atm = atmService.findById(id);
        return atm.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

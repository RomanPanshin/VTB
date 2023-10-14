package com.monkey.branchFinder.controller;


import com.monkey.branchFinder.model.OpenHours;
import com.monkey.branchFinder.service.OpenHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/openhours/{branchId}/openhours")
public class OpenHoursController {

    private final OpenHoursService openHoursService;

    @Autowired
    public OpenHoursController(OpenHoursService openHoursService) {
        this.openHoursService = openHoursService;
    }

    @GetMapping
    public ResponseEntity<List<OpenHours>> getOpenHoursByBranchId(@PathVariable Long branchId) {

        List<OpenHours> openHours = openHoursService.getOpenHoursByBranchId(branchId);

        if (openHours.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(openHours);
    }
}

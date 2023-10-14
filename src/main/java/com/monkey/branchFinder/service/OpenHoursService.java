package com.monkey.branchFinder.service;

import com.monkey.branchFinder.model.OpenHours;
import com.monkey.branchFinder.repository.OpenHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenHoursService {

    @Autowired
    private OpenHoursRepository openHoursRepository;

    public List<OpenHours> getOpenHoursByBranchId(Long branchId) {
        return openHoursRepository.findByBranchId(branchId);
    }
}

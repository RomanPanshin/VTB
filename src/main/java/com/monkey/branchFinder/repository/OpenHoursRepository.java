package com.monkey.branchFinder.repository;

import com.monkey.branchFinder.model.OpenHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpenHoursRepository extends JpaRepository<OpenHours, Long> {

    List<OpenHours> findByBranchId(Long branchId);

}

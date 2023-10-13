package com.monkey.branchFinder.repository;
import com.monkey.branchFinder.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

    // Example custom query methods:

    // Find branches by sale point name
    List<Branch> findBySalePointName(String salePointName);

    // Find branches by office type
    List<Branch> findByOfficeType(String officeType);

    // Find branches by status
    List<Branch> findByStatus(String status);
}
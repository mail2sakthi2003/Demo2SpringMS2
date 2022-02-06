package com.sakthi.springclaimms.repository;

import com.sakthi.springclaimms.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Long>  {


}

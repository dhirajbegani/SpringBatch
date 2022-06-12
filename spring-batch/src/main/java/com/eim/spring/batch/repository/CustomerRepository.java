package com.eim.spring.batch.repository;

import com.eim.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository <Customer, Long>{

}

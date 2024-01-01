package com.example.Customer_Service.Repo;


import com.example.Customer_Service.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
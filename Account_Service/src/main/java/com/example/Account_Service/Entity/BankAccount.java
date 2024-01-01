package com.example.Account_Service.Entity;

import com.example.Account_Service.Enum.AccountType;
import com.example.Account_Service.Model.Customer;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;

}
package com.TekarchAccountService.AccountService.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long account_id;
    private  String account_number;
    private String account_type;
    private  Double balance;
    private String currency;



}

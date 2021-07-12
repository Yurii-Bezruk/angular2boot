package com.ideasoft.practice.angular2boot.transactions;

import com.ideasoft.practice.angular2boot.repositories.CompaniesRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transaction")
@RestController
public class TransactionService {
    CompaniesRepository companiesRepository;

    @Transactional
    @PostMapping(path = "/income")
    public void incomeTransaction(){

    }

    @Transactional
    @PostMapping(path = "/outcome")
    public void outcomeTransaction(){

    }
}
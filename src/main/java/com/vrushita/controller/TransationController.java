package com.vrushita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vrushita.model.Transation;
import com.vrushita.service.TransationService;

import jakarta.transaction.Transaction;

public class TransationController {
	@Autowired private TransationService service;
    @GetMapping("/getTransactions") public List<Transation> getTransactions() { return service.getTransactions(); }
    //@PostMapping("/addTransaction") public Transation addTransaction(@RequestBody Transaction transaction) { return service.addTransation(transaction); }
}

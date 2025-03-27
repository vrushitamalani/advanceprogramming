package com.vrushita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrushita.model.Transation;
import com.vrushita.repository.ITransationRepository;

@Service
public class TransationService {
	@Autowired private ITransationRepository repo;
    public List<Transation> getTransactions() { return repo.findAll(); }
    public Transation addTransaction(Transation transaction) { return repo.save(transaction); }

}

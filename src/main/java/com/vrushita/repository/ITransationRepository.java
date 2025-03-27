package com.vrushita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrushita.model.Transation;

public interface ITransationRepository extends JpaRepository<Transation, Integer> {

}

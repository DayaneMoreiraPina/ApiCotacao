package com.apiday.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiday.domain.Milho;

public interface IMilhoRepository extends JpaRepository<Milho, Long> {

}

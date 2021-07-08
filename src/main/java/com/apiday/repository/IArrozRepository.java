package com.apiday.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiday.domain.Arroz;

public interface IArrozRepository extends JpaRepository<Arroz, Long> {

}

package com.dashboardbianca.dashboardvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboardbianca.dashboardvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

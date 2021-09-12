package com.dashboardbianca.dashboardvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboardbianca.dashboardvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

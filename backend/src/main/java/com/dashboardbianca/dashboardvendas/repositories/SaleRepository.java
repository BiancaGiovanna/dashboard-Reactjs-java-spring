package com.dashboardbianca.dashboardvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dashboardbianca.dashboardvendas.dto.SaleSuccessDTO;
import com.dashboardbianca.dashboardvendas.dto.SaleSumDTO;
import com.dashboardbianca.dashboardvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.dashboardbianca.dashboardvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGropedBySeller();
	
	@Query("SELECT new com.dashboardbianca.dashboardvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGropedBySeller();
}

package com.dashboardbianca.dashboardvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dashboardbianca.dashboardvendas.dto.SaleDTO;
import com.dashboardbianca.dashboardvendas.dto.SaleSuccessDTO;
import com.dashboardbianca.dashboardvendas.dto.SaleSumDTO;
import com.dashboardbianca.dashboardvendas.entities.Sale;
import com.dashboardbianca.dashboardvendas.repositories.SaleRepository;
import com.dashboardbianca.dashboardvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageble);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSumDTO> amountGropedBySeller(){
		return repository.amountGropedBySeller();
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSuccessDTO> successGropedBySeller(){
		return repository.successGropedBySeller();
	}
}

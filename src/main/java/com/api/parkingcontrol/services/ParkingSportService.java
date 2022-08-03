package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.dtos.ParkingSpotDTO;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSporRepository;

@Service
public class ParkingSportService {

	final ParkingSporRepository parkingSporRepository;
	
	public ParkingSportService(ParkingSporRepository parkingSporRepository) {
		this.parkingSporRepository = parkingSporRepository;
	}

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSporRepository.save(parkingSpotModel);
	}

	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSporRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSporRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartamentAndBlock(String apartament, String block) {
		return parkingSporRepository.existsByApartamentAndBlock(apartament, block);
	}

	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		return parkingSporRepository.findAll(pageable);
	}

	public Optional<ParkingSpotModel> findById(String id) {
		return parkingSporRepository.findById(id);
	}

	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		parkingSporRepository.delete(parkingSpotModel);
	}
	
}

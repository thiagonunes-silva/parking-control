package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSporRepository extends JpaRepository<ParkingSpotModel, String> {
	
	boolean existsByLicensePlateCar(String licensePlateCar);
	
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	
	boolean existsByApartamentAndBlock(String apartament, String block);

}

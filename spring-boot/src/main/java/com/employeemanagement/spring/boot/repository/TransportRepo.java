package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeemanagement.spring.boot.DTO.TransportDTO;
import com.employeemanagement.spring.boot.entity.Transport;


@Repository
public interface TransportRepo extends JpaRepository<Transport,Integer> {

	//@Query(value="SELECT route,type,time FROM transports" + " WHERE (:route IS NULL OR route=:route)"
	//+"AND (:type IS NULL OR type=:type)"
	//+"AND (:time IS NULL OR time=:time)",nativeQuery=true)
	//TransportDTO findByCriteria(String route, String type, float time);
	@Query(value="SELECT * FROM transports s WHERE s.route=:r and s.type=:t and s.name=:ti",nativeQuery=true)
Transport findByCriteria(@Param("r") String route,@Param("t") String type,@Param("ti") String name);

	

	

	
}

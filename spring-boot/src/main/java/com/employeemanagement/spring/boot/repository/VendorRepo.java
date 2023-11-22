package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeemanagement.spring.boot.DTO.VendorStaffDTO;
import com.employeemanagement.spring.boot.entity.Vendor;
@Repository
public interface VendorRepo extends JpaRepository<Vendor,Integer>{
	
@Query(value="SELECT vendor.id,vendor.vname,vendor.project,staff.sid,staff.work,staff.role from vendor "
		+ "INNER JOIN staff ON vendor.id=staff.fk_id WHERE staff.work=:workParam",nativeQuery=true)
	VendorStaffDTO findByCriteria(@Param("workParam") String work);

}

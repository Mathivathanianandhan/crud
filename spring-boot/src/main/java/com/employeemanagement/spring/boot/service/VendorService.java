package com.employeemanagement.spring.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.DTO.StaffDTO;
import com.employeemanagement.spring.boot.DTO.VendorDTO;
import com.employeemanagement.spring.boot.DTO.VendorStaffDTO;
import com.employeemanagement.spring.boot.entity.Staff;
import com.employeemanagement.spring.boot.entity.Vendor;
import com.employeemanagement.spring.boot.repository.StaffRepo;
import com.employeemanagement.spring.boot.repository.VendorRepo;

@Service
public class VendorService {
	@Autowired
	private VendorRepo vendorRepo;
	
	@Autowired
	private StaffRepo staffRepo;
	
	public Vendor createVendor(VendorDTO vendorDto)
	{
		Vendor v=new Vendor();
		v.setVname(vendorDto.getVname());
		v.setProject(vendorDto.getProject());
		List<Staff> staff=new ArrayList<>();
		for(StaffDTO staffDto:vendorDto.getStaff())
		{
			Staff staff1=new Staff();
			staff1.setWork(staffDto.getWork());
			staff1.setRole(staffDto.getRole());
			staff.add(staff1);
		}
		v.setStaff(staff);
		return vendorRepo.save(v);
	}
	public Vendor updateVendor(int id,Vendor vendor)
	{
		Vendor vendor1=vendorRepo.findById(id).orElse(null);
		vendor1.setVname(vendor.getVname());
		vendor1.setProject(vendor.getProject());
		List<Staff> updatestaff=new ArrayList<>();
		for(Staff staff:vendor.getStaff())
		{
			Staff staff2=new Staff();
			staff2.setWork(staff.getWork());
			staff2.setRole(staff.getRole());
			updatestaff.add(staff2);
			
		}
		vendor1.setStaff(updatestaff);
		return vendorRepo.save(vendor1);
		
	}
	public Optional<Vendor> findById(int id)
	{
		return vendorRepo.findById(id);
	}
	public List<Vendor> getVendor()
	{
		return vendorRepo.findAll();
	}
	public void deleteById(int id) {
		vendorRepo.deleteById(id);
	}
	public VendorStaffDTO filterVendor(String work) {
			return vendorRepo.findByCriteria(work);
		}
}
	


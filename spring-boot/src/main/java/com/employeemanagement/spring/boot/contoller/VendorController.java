package com.employeemanagement.spring.boot.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.DTO.VendorDTO;
import com.employeemanagement.spring.boot.DTO.VendorStaffDTO;
import com.employeemanagement.spring.boot.entity.Vendor;
import com.employeemanagement.spring.boot.service.VendorService;

@RestController
@RequestMapping("/ap/vendor")
public class VendorController {
@Autowired
private VendorService vendorService;
@PostMapping("/postvendor")
public Vendor createVendor(@RequestBody VendorDTO vendorDto)
{
	return vendorService.createVendor(vendorDto);
}
@PutMapping("/updatevendor/{id}")
public Vendor updateVendor(@PathVariable int id,@RequestBody Vendor vendor)
{
	return vendorService.updateVendor(id, vendor);
}
@GetMapping("/getvendor/{id}")
public Optional<Vendor> getVendorById(@PathVariable int id)
{
	return vendorService.findById(id);
}
@GetMapping("/getvendor")
public List<Vendor> getVendor()
{
	return vendorService.getVendor();
}
@DeleteMapping("/deletevendor/{id}")
public void deleteById(@PathVariable int id)
{
	vendorService.deleteById(id);	
}
@GetMapping("/filtervendor")
public VendorStaffDTO  filterVendor(
		@RequestParam(name = "work", required = true) String work) {
	return  vendorService.filterVendor(work);
}

}

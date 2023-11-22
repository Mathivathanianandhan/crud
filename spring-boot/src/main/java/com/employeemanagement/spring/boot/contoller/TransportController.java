package com.employeemanagement.spring.boot.contoller;

import java.util.*;

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

import com.employeemanagement.spring.boot.DTO.TransportDTO;
import com.employeemanagement.spring.boot.DTO.TransportsDTO;
import com.employeemanagement.spring.boot.entity.Employee;
import com.employeemanagement.spring.boot.entity.Transport;
import com.employeemanagement.spring.boot.service.TransportService;

@RestController
@RequestMapping("/api/transport")
public class TransportController {
	@Autowired
	private TransportService transportService;

	@PostMapping("/posttransport")
	public Transport CreateTransport(@RequestBody TransportDTO transportDto) {
		return transportService.CreateTransport(transportDto);

	}

	@PostMapping("/listtransport")
	public List<Transport> transportList(@RequestBody List<Transport> transport) {
		return transportService.transportList(transport);
	}

	@PutMapping("/updatetransport/{id}")
	public Transport update(@PathVariable int id, @RequestBody Transport transport) {
		return transportService.update(id, transport);

	}

	@DeleteMapping("/deletetransport/{id}")
	public void delete(@PathVariable int id) {
		transportService.deleteById(id);
	}

	@GetMapping("/gettransport/{id}")
	public Optional<Transport> getTransportById(@PathVariable int id) {
		return transportService.findById(id);

	}

	@GetMapping("/gettransports")
	public List<Transport> getTransport() {
		return transportService.getTransport();

	}

	/*@GetMapping("/filtertransport/{route}/{type}/{name}")
	public TransportDTO filterTransport(@PathVariable(name = "route", required = true) String route,
			@PathVariable(name = "type", required = true) String type,
			@PathVariable(name = "name", required = true) String name) {
		return transportService.filterTransport(route, type, name);
	}*/
	@GetMapping("/filtertransport1/{route}/{type}/{name}")
	public Transport filterTransport(@RequestParam(name="route") String route,@RequestParam(name="type") String type,@RequestParam(name="name") String name) {
	return transportService.filterTransport(route,type,name);

}
}
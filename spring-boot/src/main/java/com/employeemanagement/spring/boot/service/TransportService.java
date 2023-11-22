package com.employeemanagement.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.DTO.TransportDTO;
import com.employeemanagement.spring.boot.DTO.TransportsDTO;
import com.employeemanagement.spring.boot.entity.Employee;
import com.employeemanagement.spring.boot.entity.Transport;
import com.employeemanagement.spring.boot.repository.TransportRepo;


@Service
public class TransportService{
	@Autowired
	private TransportRepo transportRepo;
	public Transport CreateTransport(TransportDTO transportDto)
	{
		Transport transport=new Transport();
		transport.setName(transportDto.getName());
		transport.setRoute(transportDto.getRoute());
		transport.setType(transportDto.getType());
		//transport.setTime(transportDto.getTime());
		return transportRepo.save(transport);
		
	}

public List<Transport> transportList(List<Transport> transport) 
{
	return transportRepo.saveAll(transport);
}
	public Transport update(int id,Transport transport)

	{
		Transport transport1=transportRepo.findById(id).orElse(null);
		transport1.setName(transport.getName());
		transport1.setRoute(transport.getRoute());
		transport1.setType(transport.getType());
		transport1.setTime(transport.getTime());
		return transportRepo.save(transport1);
		
	}
	public void deleteById(int id)
	{
		transportRepo.deleteById(id);
	}
	public Optional<Transport> findById(int id)
	{
		return transportRepo.findById(id);
		
	}
	public List<Transport> getTransport()
	{
		return transportRepo.findAll();
		
	}
	/*public TransportDTO filterTransport(String route, String type, String name) {
			List<Transport> obj=transportRepo.findAll();
			TransportDTO tDto=new TransportDTO();
			for(Transport i:obj)
			{
				if(i.getRoute().equalsIgnoreCase(route) && i.getType().equalsIgnoreCase(type) && i.getName().equalsIgnoreCase(name))
				{
					tDto.setRoute(i.getRoute());
					tDto.setType(i.getType());
					tDto.setName(i.getName());
					tDto.setTime(i.getTime());
					tDto.setDestination(i.getDestination());
					tDto.setSource(i.getSource());
					tDto.setId(i.getId());	
				}
				}
			return tDto;
			}*/
			
	

	
	public Transport filterTransport(String route, String type, String name) {
		// TODO Auto-generated method stub
		return transportRepo.findByCriteria(route, type, name);
	}
}
	




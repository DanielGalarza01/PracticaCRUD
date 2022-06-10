package com.tp2_neoris.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.entity.ClienteEntity;
import com.tp2_neoris.model.ClienteModel;
import com.tp2_neoris.repository.ClienteRepository;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void saveCliente(ClienteModel clienteModelo) {
		clienteRepository.save(this.mapearCliente(clienteModelo));
	}
	
	private ClienteEntity mapearCliente(ClienteModel clienteModelo) {
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setNombre(clienteModelo.getNombre());
		clienteEntity.setApellido(clienteModelo.getApellido());
		clienteEntity.setDni(clienteModelo.getDni());
		clienteEntity.setHabilitado(clienteModelo.isHabilitado());
		return clienteEntity;
	}

	
}

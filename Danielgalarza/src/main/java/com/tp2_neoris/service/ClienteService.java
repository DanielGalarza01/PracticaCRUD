package com.tp2_neoris.service;




import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp2_neoris.dto.ClienteDto;
import com.tp2_neoris.dto.RespuestaDto;
import com.tp2_neoris.entity.ClienteEntity;
import com.tp2_neoris.repository.ClienteRepository;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void saveCliente(ClienteDto clienteModelo) {
		clienteRepository.save(this.mapearCliente(clienteModelo));
	}
	
	private ClienteEntity mapearCliente(ClienteDto clienteModelo) {
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setNombre(clienteModelo.getNombre());
		clienteEntity.setApellido(clienteModelo.getApellido());
		clienteEntity.setDni(clienteModelo.getDni());
		clienteEntity.setHabilitado(clienteModelo.isHabilitado());
		return clienteEntity;
	}
		
	public RespuestaDto getClienteById(Long id){
		ClienteEntity clienteEntity = clienteRepository.getReferenceById(id);
		return this.generarRespuestaDto(clienteEntity);
	}
	
	public RespuestaDto generarRespuestaDto(ClienteEntity clienteEntity) {
		RespuestaDto respuestaDto = new RespuestaDto();
		respuestaDto.setCodigo(200);
		respuestaDto.setMensaje(" ");
		ClienteDto clienteDto = new ClienteDto();
		clienteDto.setNombre(clienteEntity.getNombre()); 
		clienteDto.setApellido(clienteEntity.getApellido());
		clienteDto.setDni(clienteEntity.getDni());
		clienteDto.setHabilitado(clienteEntity.isHabilitado());
		respuestaDto.setData(clienteDto);
		return respuestaDto;
	}
	
	public ArrayList<RespuestaDto> getListaClientes(){
		ArrayList<RespuestaDto> listaClientes = new ArrayList<RespuestaDto>();
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}

package com.tp2_neoris.controller;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.dto.ClienteDto;
import com.tp2_neoris.dto.RespuestaDto;
import com.tp2_neoris.entity.ClienteEntity;
import com.tp2_neoris.service.ClienteService;



@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value="/saveCliente")
	public String saveCliente(@RequestBody ClienteDto clienteModel) {
		clienteService.saveCliente(clienteModel); 
		return "cliente guardado con éxito";
	}
	
	@GetMapping(value="/showCliente/{id}")
		public @ResponseBody RespuestaDto getClienteById(@PathVariable("id") Long id) {
		RespuestaDto respuestaDto = clienteService.getClienteById(id);
		return respuestaDto;
	}
	
	@GetMapping(value="showListaClientes")
		public @ResponseBody ArrayList<RespuestaDto> getListaClientes(){
		return clienteService.getListaClientes();
	}

}

/*VERSIÓN 1. 11/06/22.
 * @requestMapping: Le indica al servidor que este endpoint de entrada.
 * @GetMapping: Es parte la url que gestina peticiones get.
 * @PostMapping : Es parte la url que gestina peticiones post.
 * @RestController: Le indica a SpringBoot que la clase cumple la funcion de controllador.
 * @RequestBody: hace que la solicitud llegue en formato Json.
 * @ResponseBody: hace que la respuesta salga en formato Json.
 * @Repository & @Service: Le indica a SpringBoot que la clase cumple la funcion de service. 
 * 			Para que guarde la clase en el pool de SpringBoot
 * @Entity: Le indica a SpringBoot que la clase cumple la funcion de Entity. Para que SpringBoot 
 * 			la reconozca como la representacion en una clase de Java de una tabla en la base de datos 
 * @PathVariable: Se usa más en las peticiones get. Vincula la variable a la que hace referencia con la que viene en la url. (Path=Ruta)
 * @Autowired: Injecta la depencia. instanciar una sola vez la clase injectada. y mantenerla con vida en el pool.
 * @Id
 * @GenerateValue
 * @Column*/









package com.tp2_neoris.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp2_neoris.model.ClienteModel;
import com.tp2_neoris.service.ClienteService;



@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	/*@GetMapping(value="/getCliente")
	public ClienteModel get() {
		return this.cliente;
	}*/
	
	@PostMapping(value="/saveCliente")
	public String saveCliente(@RequestBody ClienteModel clienteModel) {
		clienteService.saveCliente(clienteModel); 
		return "cliente guardado con éxito";
	}
	
	

	/********************************************************************************************************************
	  
	 * Prueba del controlador contra postman
	 
	@GetMapping(value="/saludo")
	public String saludo (){
		return "Hola";
	}
	
	@PostMapping(value="/cambioSaludo/{mensajea}/{mensajeb}")
	public String cambioSaludo( @PathVariable String mensajea,
		@PathVariable String mensajeb) {
		return "El mensaje "+mensaje+" se guardó correctamente";
	}
	
	*********************************************************************************************************************/
}











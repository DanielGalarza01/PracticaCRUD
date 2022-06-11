package com.tp2_neoris.dto;



public class RespuestaDto {
	
	private int codigo;
	private String mensaje;
	private Object data;
	
	
	
	public RespuestaDto(int codigo, String mensaje, Object data) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.data = data;
	}
	public RespuestaDto() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
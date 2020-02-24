package com.tianguix.bean.libroOrdenes;

import java.util.Date;

public class Orden {
	
	private String idOrden;
	private TipoOrden tipoOrden;
	private Producto idProducto;
	private int Cantidad;
	private double unidad;
	private double precioTotal;
	private Date vigenciaInicial;
	private Date vigenciaFinal;
	
	
	public String getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(String idOrden) {
		this.idOrden = idOrden;
	}
	public TipoOrden getTipoOrden() {
		return tipoOrden;
	}
	public void setTipoOrden(TipoOrden tipoOrden) {
		this.tipoOrden = tipoOrden;
	}
	public Producto getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getUnidad() {
		return unidad;
	}
	public void setUnidad(double unidad) {
		this.unidad = unidad;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Date getVigenciaInicial() {
		return vigenciaInicial;
	}
	public void setVigenciaInicial(Date vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}
	public Date getVigenciaFinal() {
		return vigenciaFinal;
	}
	public void setVigenciaFinal(Date vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}
	
	
	

}

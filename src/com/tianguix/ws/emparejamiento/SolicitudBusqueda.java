package com.tianguix.ws.emparejamiento;

import javax.jws.WebService;

import com.tianguix.bean.libroOrdenes.Orden;


@WebService

public interface SolicitudBusqueda {
	
	String existeMatch (Orden obj);

}

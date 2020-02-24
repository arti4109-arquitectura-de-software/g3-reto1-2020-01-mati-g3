package com.tianguix;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.EndpointImpl;

import com.tianguix.bean.emparejamiento.SolicitudBusquedaImpl;

public class Main {
   public static void main(String[] args) {
      Endpoint endpointSolicitudBusqueda = EndpointImpl.create(new SolicitudBusquedaImpl());
      endpointSolicitudBusqueda.publish("http://localhost:8081/SolicitudBusqueda");
/*
	    String resultado = "";
	    ConexionOracle objConex = new ConexionOracle();
	    
	    try {
	    	objConex.conectar();
			resultado = objConex.leerDatosBD();
			System.out.println(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
   }
   
}

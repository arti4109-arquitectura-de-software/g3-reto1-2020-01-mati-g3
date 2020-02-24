package com.tianguix.bean.emparejamiento;

import java.sql.SQLException;

import com.tianguix.bean.libroOrdenes.Orden;
import com.tianguix.persistencia.ConexionOracle;
import com.tianguix.ws.emparejamiento.SolicitudBusqueda;

public class SolicitudBusquedaImpl implements SolicitudBusqueda {

	@Override
	public String existeMatch(Orden obj) {
		//Orden resultadoQuery = new Orden();
		
		// Ejecutar sentencia en BD
	    String resultado = "No encontro";
	    ConexionOracle objConex = new ConexionOracle();
	    
	    try {
	    	objConex.conectar();
			resultado = objConex.leerDatosBD();
			System.out.println(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultado;
	}

}

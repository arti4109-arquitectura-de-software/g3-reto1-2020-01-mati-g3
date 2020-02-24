package com.tianguix.persistencia;

import java.sql.*;

import javax.swing.*;

public class ConexionOracle {

	String user;
	String pass;
	String url;
	Connection conex;
	Statement stm;

	public ConexionOracle() {
		user = "tianguix";
		pass = "tianguix";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		conex = null;
		stm = null;

	}

	public void conectar() {

		try {
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			conex = DriverManager.getConnection(url, user, pass);
			//JOptionPane.showMessageDialog(null, "Conexon realizada");
			System.out.println("******************************Conexon realizada*****************************");
		} catch (Exception e) {
			//JOptionPane.showMessageDialog(null, "No se realizo la conexion");
			System.out.println("******************************No se realizo la conexion*****************************");
		}

	}


	public String leerDatosBD() throws SQLException {
		stm = conex.createStatement();
		String cadSql = "";
		String datos = "";
		try {
			cadSql = "select * from ORDEN";
			ResultSet rs = stm.executeQuery(cadSql);
			
			while (rs.next()) {
				datos += (rs.getString("ID") +  "\n");
			}
			return datos;
		} catch (Exception e) {
			//JOptionPane.showMessageDialog(null, "La tabla no existe");
			datos = "La tabla no existe";
			return datos;
		}

	}


	public String buscarDatosBD(String id) throws SQLException {
		stm = conex.createStatement();

		String cadSql;

		try {
			String nombre = "";
			cadSql = "select * from ORDEN where ID ='" + id + "'";
			ResultSet rs = stm.executeQuery(cadSql);
			while (rs.next()) {
				nombre = rs.getString(1) + " " + rs.getString(2) + " "
						+ rs.getInt(3);

			}
			return nombre;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El codigo no existe");

			return null;
		}

	}


	public Connection getConex() {
		return conex;
	}

	
}

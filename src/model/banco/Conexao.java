package model.banco;

import java.sql.*;

public class Conexao {
	private String host;
	private String banco;
	private String usuario;
	private String senha;
	
	public Conexao() {
		host = "da_java.mysql.dbaas.com.br";
		banco = "da_java";
		usuario = "da_java";
		senha = "Tecnicas*2023@";
	}
	
	public Connection getConexao() {
		String url = "jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);	
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro na conexão");
		}
		return null;
	}
}

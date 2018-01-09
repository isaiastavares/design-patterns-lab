package br.com.alura.dp.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Connection conexao ;

            String tipoBanco = System.getenv("tipoBanco");

            if("mysql".equals(tipoBanco)) {
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
            } else {
                conexao = DriverManager.getConnection("jdbc:postgres://localhost:3306/banco", "usuario", "senha");
            }

            return conexao;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}

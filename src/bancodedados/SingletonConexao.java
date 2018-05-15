/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Daniel
 */
public class SingletonConexao {
    private static Connection conexao=null;
    public static Connection getConexao() throws SQLException {
        if(conexao==null){
            String url="jdbc:postgresql://localhost/";
            conexao=DriverManager.getConnection(url,"postgres","root");
        }
        return conexao;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class DAOCliente {
    public void adicionar(String nome, int cpf, String endereco, char sexo) 
            throws SQLException{
        String sql="insert into cliente (nome,cpf,endereco,sexo) "
                + "values(?,?,?,?)";
        Connection c=SingletonConexao.getConexao();
        PreparedStatement s=c.prepareStatement(sql);
        s.setString(1, nome);
        s.setInt(2,cpf);
        s.setString(3,endereco);
        s.setString(4, ""+sexo);
        s.execute();
        s.close();
    }
    
    public void atualizar(String nome, int cpf, 
            String endereco, char sexo){
        String sql="update pessoa set nome=?, sexo=?, "
                + "endereco=? where cpf=?";
        
    }
    
    public void excluir(int cpf){
        String sql="delete from pessoa where cpf=?";
    }
    
    public ResultSet listar() throws SQLException{
        String sql="select * from cliente";
        Connection c=SingletonConexao.getConexao();
        PreparedStatement p=c.prepareStatement(sql);
        ResultSet resultado= p.executeQuery();
        return resultado;
    }
}

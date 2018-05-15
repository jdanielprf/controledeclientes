/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleclientes;

import bancodedados.DAOCliente;
import bancodedados.SingletonConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class ControleClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            DAOCliente daoCliente=new DAOCliente();
            ResultSet lista=daoCliente.listar();
            while(lista.next()){
                System.out.println(lista.getInt("cpf"));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}

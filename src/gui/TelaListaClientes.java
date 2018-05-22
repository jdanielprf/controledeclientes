/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//JFrame

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Daniel
 */
public class TelaListaClientes extends JFrame{
    
    public static void main(String[] args) {
        String colunas[]={"Nome","CPF"};
        // usar sempre as chaves para declarar vetores e matrizes
        String valores[][]={
            {"Daniel","1"},
            {"Jose","2"}
        };
        
        TelaListaClientes tela=new TelaListaClientes();
        tela.setSize(600, 600);
        JTable tabela=new JTable(valores,colunas);
        
        
        JPanel painel=new JPanel();
        painel.setLayout(new BorderLayout());
        painel.add(tabela.getTableHeader(),BorderLayout.PAGE_START);
       
        painel.add(tabela,BorderLayout.CENTER);
        tela.setContentPane(painel);
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    
}

//tabela.setFillsViewportHeight(true);
//        JPanel panel=new JPanel();
//        panel.setLayout(new BorderLayout());
//        panel.add(tabela.getTableHeader(),BorderLayout.PAGE_START);
//        panel.add(tabela,BorderLayout.CENTER);
//        JScrollPane scroll=new JScrollPane(panel);
//        tela.setContentPane(scroll);
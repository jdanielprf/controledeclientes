/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TelaDebug {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float nota1=scan.nextFloat();
        float nota2=scan.nextFloat();
        float media=(nota1+nota2)/2;
        if(media>=4&&media<7){
            System.out.println("Final");
        }else if(media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
}

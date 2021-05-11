/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Denilson
 */
public class Operacion {
    
    public double resultado;
    private int resultadoC;
    private int num;
    private String signo;
    
    public Operacion(){
        
    }
    
    public void valorI(int resultado){
        this.resultado = resultado;
    }
    
    public void suma(int ...numero){
        this.signo = "+";
        for (int i = 0; i < numero.length; i++) {
            this.num = numero[i];
            this.resultado += this.num;
        }
    }
    
    public void multiplicacion(int ...numero){
        this.signo = "*";
        for (int i = 0; i < numero.length; i++) {
            this.num = numero[i];
            this.resultado *= this.num;
        }
    }
    
    public void resta(int ...numero){
        this.signo = "-";
        for (int i = 0; i < numero.length; i++) {
            this.num = numero[i];
            this.resultado -= this.num;
        }
    }
    
    public void division(int ...numero){
        this.signo = "/";
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] == 0){
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Introduce correctamente un numero de la division", "!ERROR", 0);
                break;
            } else {
                this.num = numero[i];
                resultado /= this.num;
            }
        }
    }
    
    public void eliminar(){
        if(this.signo.equalsIgnoreCase("+")){
            this.resultado -= this.num;
        } else if(this.signo.equalsIgnoreCase("-")){
            this.resultado += this.num;
        } else if(this.signo.equalsIgnoreCase("*")){
            this.resultado /= this.num;
        } else if(this.signo.equalsIgnoreCase("/")){
            this.resultado *= this.num;
        }
    }
    
    public void resultado(){
        resultadoC = (int)resultado;
        if(resultado % resultadoC == 0){
            System.out.println("resultado = " + resultadoC);
        } else{
            System.out.println("resultado = " + resultado);
        } 
    }
    
}

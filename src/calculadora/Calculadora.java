/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Denilson
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion calculadora = new Operacion();

        calculadora.suma(7,8,10);
        calculadora.resta(12);
        calculadora.multiplicacion(2);
        calculadora.division(5);
        calculadora.eliminar();
        calculadora.resultado();
        
    }
}

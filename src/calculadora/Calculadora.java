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

        calculadora.suma(3,2,4);
        calculadora.resta(4);
        calculadora.multiplicacion(2);
        calculadora.suma(5,6);
        calculadora.eliminar();
        calculadora.resultado();
        
    }
}

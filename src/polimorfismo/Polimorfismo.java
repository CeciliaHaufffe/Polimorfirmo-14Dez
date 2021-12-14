/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.text.DecimalFormat;

/**
 *
 * @author IFSC
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* DecimalFormat f = new DecimalFormat("#.#");
        Calculadora calc = new Calculadora();
        System.out.println(f.format(calc.somar(1.1,2.2)));
        */
      
       Animal ani = new Animal ();
       ani.comunicar();
       
       Gato cat = new Gato();
       cat.comunicar();
       
       Cachorro dog = new Cachorro();
       dog.comunicar();
       
       Pato duck = new Pato();
       duck.comunicar();
           
    }
    
}

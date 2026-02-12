/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author franc
 */
public class Calculadora {
    public static void main(String[] args){
        Suma s = new Suma();
        Resta r = new Resta();
        multiplicacion m = new multiplicacion();
        
        System.out.println("5 + 3 = " + s.sumar(5, 3));
        System.out.println("5 - 3 = " + r.restar(5, 3));
        System.out.println("5 * 3 = " + m.multiplicar(5, 3));
    }
}

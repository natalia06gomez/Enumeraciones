/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeenumeraciones;

/**
 *
 * @author linan
 */
public class EjeEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo semaforo1, semaforo2;
        semaforo1 = new Semaforo();
        semaforo2 = new Semaforo(ColorSemaforo. VERDE,false);
        semaforo1.setColor(ColorSemaforo. AMARILLO);
        System.out.println("El semaforo1 tiene el color " + semaforo1.getColor().toString());
        System.out.println("El semaforo2 tiene el color " + semaforo2.getColor().toString());
    }
    
}

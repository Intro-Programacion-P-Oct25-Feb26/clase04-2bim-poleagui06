/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos03;

/**
 *
 * @author Pole
 */
public class Ejemplo06 {

    static int suma = 0; // variable de alcance global
                         // se la puede usar en cualquier método
                         // hemos declarado la variable estática
                         // porque estamos usando métodos estáticos

    public static void main(String[] args) {
        //
        System.out.printf("Valor de variable suma (main): %d\n", suma);
        obtenerSuma(10, 30);
        obtenerSumaDos();
    }

    public static void obtenerSuma(int a, int b) {
        suma = a + b;
        System.out.printf("Valor de variable suma (obtenerSuma): %d\n", suma);
    }

    public static void obtenerSumaDos() {
        suma = suma + 100;
        System.out.printf("Valor de variable suma (obtenerSumaDos): %d\n", suma);
    }

}

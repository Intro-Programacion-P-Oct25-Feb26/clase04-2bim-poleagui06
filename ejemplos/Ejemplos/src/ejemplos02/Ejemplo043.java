/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        //
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};

        for (int i = 0; i < valores1.length; i++) {

            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1, v2); // se invoca al método (procedimiento) obtenerSuma

            /*
            Se declaran dos arreglos de enteros (valores1 y valores2) con la 
            misma cantidad de elementos.
            Se utiliza un ciclo 'for' para recorrer los arreglos desde el 
            índice 0 hasta el final (valores1.length).
            En cada iteración:
            1. Se extrae el valor de la posición 'i' de cada arreglo y se asigna
            a las variables v1 y v2.
            2. Se envían estos valores como argumentos al método 'obtenerSuma' 
            para procesarlos y mostrar el resultado.
             */
        }

    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}

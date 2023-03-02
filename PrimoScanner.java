/* Crear una funcion que nos indique si un numero es primo o no pedido por consola */

package Ejercicios_funciones;

import java.util.Scanner;
public class PrimoScanner {

    public static void main (String [] args) {
        Scanner sc =  new Scanner (System.in);

        System.out.print("¿Que numero quieres saber si es primo o no?: ");
        int num = sc.nextInt();

        if (esPrimo(n)) {
            System.out.print ("El numero " + num + " es primo");
        } else {
            System.out.print ("El numero " + num + " no es primo");

        }

        sc.close();
    }
/* Funcion que comprueba que un numero es primo*/
    public static boolean esPrimo(int numero){

        if(numero <= 1) {
            return false;
        }

        for(int i = 2; i < numero; i++) {
            if((numero % i) == 0) {
                return false;
            }
        }
        return true;    
    }
}

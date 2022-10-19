package Extras;

import java.util.ArrayList;
import java.util.Scanner;

public class P2Clase1310 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner((System.in));
        int numero;
        String opcion;
        Boolean jiji;
      //  System.out.println("Ingresar un numero entero: ");
        //numero = entrada.nextInt();
        System.out.println("Ingresa una opción:(1-5) ");
        opcion = entrada.next();
        int valor = Integer.parseInt(opcion); // de un valor string a un a valor entero, no primitiivo
        valor = valor+1;
        System.out.println("La siguiente opcion es: "+ valor );

        //Intentar convertir cualquier valor a otra cosa//

        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        Integer numeroEntero = 10;
        arreglo.add(numeroEntero);


    }
}

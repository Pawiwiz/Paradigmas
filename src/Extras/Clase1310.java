package Extras;
//Creando objeto de la clase
public class Clase1310 {
    private static String mensaje ="Hola";
    //El static va a pertenecer a la clase misma, no el objeto 1, van a ser los mismos para cada objeto de la clase//
    private static int numero (int v1){
        return v1++;
    }

    public static void main(String[] args) {
        Clase1310 obj1 = new Clase1310();
        Clase1310 obj2= new Clase1310();
        Clase1310.mensaje = "mundo";
        obj2.mensaje = "mundo";
        System.out.println("Ejemplo 1: "+obj1.mensaje);
        System.out.println(Clase1310.mensaje);
        System.out.println("El resultado es "+ Clase1310.numero(6));
    }
}
//Hacer un contador//
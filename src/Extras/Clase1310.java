package Extras;
//Creando objeto de la clase
public class Clase1310 {
    private static String mensaje ="Hola";
    //El static va a pertenecer a la clase misma, no el objeto 1, van a ser los mismos para cada objeto de la clase//

    public static void main(String[] args) {
        Clase1310 obj1 = new Clase1310();
        Clase1310 obj2= new Clase1310();
        obj2.mensaje = "mundo";
        System.out.println(obj1.mensaje);
        System.out.println(Clase1310.mensaje);
    }
}

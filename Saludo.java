import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String nombre="";
 
        System.out.print("Por favor, ingresa tu nombre: ");
        nombre = input.nextLine();

      
        System.out.println(" Hola, " + nombre + "! Bienvenido al reto de algoritmo!");

        input.close();

    
       
    }
}



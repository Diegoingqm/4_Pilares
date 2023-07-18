
package pilares_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    ///Arreglo dinamico para almacenar
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner (System.in);
    
    public static void main (String [] args){
    //metidi en donde llene un poligono
    llenarPoligono();
    
    //mostrar los datos y el area de cada poligono
    mostrarResultados();
    }
    
    
    
public static void llenarPoligono(){
    char respuesta;
    int opcion;
    do{
        
    do{
        System.out.println("Digite que poligono desea");
        System.out.println("1. Triangulo ");
        System.out.println("2. Rectangulo ");
        System.out.println("Opcion ");
        opcion = entrada.nextInt();
    }
    while(opcion<1 || opcion>2);
    
    switch(opcion){
        
    
        case 1: llenarTriangulo(); //llena un triangulo
            break;
        case 2: llenarRectangulo(); //llena rectangulo
            break;
    
}    
    System.out.println("\n Desea introducir otro poligono (s/n): ");
    respuesta = entrada.next().charAt(0);
    System.out.println(" ");
    }
    while(respuesta=='s' || respuesta=='S');
}
public static void llenarTriangulo (){
    double lado1, lado2, lado3;
    System.out.println("\n Digite el lado1 del triangulo ");
    lado1 = entrada.nextDouble();
    System.out.println("\n Digite el lado2 del triangulo ");
    lado2 = entrada.nextDouble();
    System.out.println("\n Digite el lado3 del triangulo ");
    lado3 = entrada.nextDouble();
    
   Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
   
   poligono.add(triangulo);
    
}
public static void llenarRectangulo(){
    double lado1,lado2;
    System.out.println("\n digite el lado1 del rectangulo: ");
    lado1 = entrada.nextDouble();
    System.out.println("\n digite el lado2 del rectangulo: ");
    lado2 = entrada.nextDouble();
    Rectangulo rectangulo = new Rectangulo(lado1, lado2);
    
    poligono.add(rectangulo);
}
public static void mostrarResultados(){
    for (Poligono poli: poligono){
        System.out.println(poli.toString());
        System.out.println("El area es  " + poli.area());
        System.out.println("");
        
    }
}
}


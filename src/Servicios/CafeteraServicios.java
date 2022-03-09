
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicios {
        
    double a1;

    
    String opcion;
    String opc1;
    String opc2;
    String opc3;
    String opc4;
    
    public Cafetera altaCafetera(){
        
        opc1 = "llenarcafetera";
        opc2 = "servirtaza";
        opc3 = "vaciarcafetera";
        opc4 = "agregarcafe";
        Cafetera v1 = new Cafetera();  
        Scanner leer = new Scanner (System.in);   
        
        
        System.out.println("Ingresar la capacidad maxima de la cafetera en ml: ");
        v1.setCapMaxima(leer.nextDouble());
        
        System.out.println("Ingresar la capacidad actual de la cafetera en ml: ");
        v1.setCapActual(leer.nextDouble());
        
        System.out.println("Que desea realizar? (llenarcafetera, servirtaza, vaciarcafetera, agregarcafe)");
        opcion=leer.next();
    return v1;
    }
    
    Scanner leeer = new Scanner (System.in);
    double taza;
    double nuevacap;
    double agrega;
    public void a1 (Cafetera v1){
        if (opcion.equals(opc1)){
            System.out.println("La cafetera esta llena en " + v1.getCapMaxima() + "ml"); 
        } 
        if (opcion.equals(opc2)){
            System.out.println("Ingresar la capacidad de la taza vacia en ml: ");
            taza=leeer.nextDouble();
            
            if (v1.getCapActual()>= taza){
                nuevacap = (int) (v1.getCapActual()-taza) ;
                System.out.println("La ueva capacidad actual de la maquina es " + nuevacap); 
            } else {
                System.out.println("La capacidad de la taza es mayor a la cantidad presente en la cafetera, se le añadieron a la taza " + v1.getCapActual() + "ml");
            }
        }
        if (opcion.equals(opc3)){
            nuevacap = nuevacap + 0;
            System.out.println("Se vacio la cafetera, capacidad actual = " + nuevacap);
        }
        if (opcion.equals(opc4)){
            System.out.println("Ingresar la cantidad de cafe que desea agregar en ml: ");
            agrega = leeer.nextDouble();
            nuevacap = agrega + v1.getCapActual();
            if (nuevacap>v1.getCapMaxima()) {
                System.out.println("Se rebalso la cafetera!!!");
            } else {
                System.out.println("La nueva capacidad de la cafetera es = " + nuevacap);
            }
        }
    }

}

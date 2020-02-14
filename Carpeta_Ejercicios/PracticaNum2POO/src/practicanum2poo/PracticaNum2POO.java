
package practicanum2poo;
import java.util.Scanner;
public class PracticaNum2POO {

    public static void main(String[] args) {
      Scanner teclado=new Scanner (System.in);
      double la,alt,bas;
      
        System.out.println("Lado de cuadrado:");
        la=teclado.nextDouble();
         System.out.println("Base del rectangulo:");
        bas=teclado.nextDouble();
         System.out.println("Altura del rectangulo:");
        alt=teclado.nextDouble();
       
        cuadrado objC = new cuadrado (la);
        rectangulo objR = new rectangulo (bas,alt);
        objC.setArea();
        objC.setPerimetro();
        objC.resultados();
        objR.setArea();
        objR.setPerimetro();
        objR.resultados();
         
        
                
      
    }
    
}

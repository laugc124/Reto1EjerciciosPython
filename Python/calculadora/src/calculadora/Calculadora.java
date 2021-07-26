

package calculadora;

import java.util.Scanner; // Importación de la clase Scanner.
 
public class Calculadora{
  public static void main(String[] args) {

      int numero1;
      int numero2;
      int operacion;
      
      Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Elige opción:\n1.- Sumar" + "\n2.- Restar\n" +"3.- Multiplicar\n" + "4.- Dividir\n" );
        operacion=reader.nextInt();
                
        
        
            
        
            switch(operacion){
                case 1:
                    System.out.println("ingrese primer numero: ");
                    numero1=reader.nextInt();
        
                    System.out.println("ingrese segundo numero: ");
                    numero2=reader.nextInt();
                    
                    System.out.println("el resultado: "+numero1+" + "+numero2+" = "+(numero1+numero2));
                    break;
                
                case 2:
                    System.out.println("ingrese primer numero: ");
                    numero1=reader.nextInt();
        
                    System.out.println("ingrese segundo numero: ");
                    numero2=reader.nextInt();
                    
                    System.out.println("el resultado: "+numero1+" - "+numero2+" = "+(numero1-numero2));
                    break;
                    
                case 3:
                    System.out.println("ingrese primer numero: ");
                    numero1=reader.nextInt();
        
                    System.out.println("ingrese segundo numero: ");
                    numero2=reader.nextInt();
                    
                    System.out.println("el resultado: "+numero1+" * "+numero2+" = "+(numero1*numero2));
                    break;
                    
                case 4:
                    System.out.println("ingrese primer numero: ");
                    numero1=reader.nextInt();
        
                    System.out.println("ingrese segundo numero: ");
                    numero2=reader.nextInt();
                    
                    System.out.println("el resultado: "+numero1+" / "+numero2+" = "+(numero1/numero2));
                    break;
                    
                
            }
        }
      
}

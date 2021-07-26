/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detección.del.virus;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agos1
 */
public class DetecciónDelVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> verificacion = new ArrayList<>();
        
        String secuenciavirus="no";
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("ingrese el virus: ");
        secuenciavirus = reader.next();
        
              
        
        
        verificacion.add(secuenciavirus.indexOf("r"));
        verificacion.add(secuenciavirus.indexOf("a"));
        verificacion.add(secuenciavirus.indexOf("v"));
        verificacion.add(secuenciavirus.indexOf("u"));
        verificacion.add(secuenciavirus.indexOf("s"));
        
        //System.out.println(verificacion);
        
        for (Integer c:verificacion){
            if (c==-1){
                System.out.println("negativo para covid");
                break;
            }
            else {
                System.out.println("positivo para covid");
                break;
            }
        }
    }
    
}

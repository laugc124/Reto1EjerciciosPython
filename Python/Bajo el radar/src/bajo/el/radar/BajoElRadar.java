/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bajo.el.radar;

import java.util.Scanner;

/**
 *
 * @author agos1
 */
public class BajoElRadar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int distancia1;
        int distancia2;
        int tiempo;
        int velocidad;
        String texto_multa_velocidad;
        int grado_alcohol=0;
        String suspension="sin multa";
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("ingrese la distancia 1: ");
        distancia1=reader.nextInt();
        
        System.out.println("ingrese la distancia 2: ");
        distancia2=reader.nextInt();
        
        System.out.println("ingrese el tiempo: ");
        tiempo=reader.nextInt();
        
        velocidad = (int) (Math.abs((distancia2-distancia1)/tiempo)*3.6);
        System.out.println("la velocidad es: "+ velocidad + "km/s");
        
        
        if (velocidad>1 && velocidad<=20){
            texto_multa_velocidad = "llamado atencion por baja velocidad";
                    }
        else if (velocidad>21 && velocidad<=60){
            texto_multa_velocidad = "velocidad normal";
        } 
        else if (velocidad>61 && velocidad<=80){
            texto_multa_velocidad ="llamado de atencion por alta velocidad";
        } 
        else if (velocidad>81 && velocidad<=120){
            texto_multa_velocidad ="multa tipo I";
        }
        else {
            texto_multa_velocidad ="multa tipo II";}        
           
        System.out.println("tipo de multa: "+texto_multa_velocidad);
        
        if(texto_multa_velocidad=="multa tipo I" || texto_multa_velocidad=="multa tipo II"){
            System.out.println("ingrese gadro de alcohol: ");
            grado_alcohol=reader.nextInt();
        }
       
        if (grado_alcohol>20 && grado_alcohol<=40){
            suspension = "suspension 6 a 12 meses";
        }
        else if (grado_alcohol>41 && grado_alcohol<=100){
            suspension = "suspension 1 a 3 años";
        }
        else if (grado_alcohol>101 && grado_alcohol<=150){
            suspension = "suspension 3 a 5 años";
        }
        
        else if (grado_alcohol>151){
            suspension = "suspension 5 a 10 años";
        }
        
        
        System.out.println("tipo de multa alcholemia: "+suspension);
        
        
       
        
        
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoy.capitan;

/**
 *
 * @author Laura Gonzalez 
 */
public class AhoyCapitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int numero = (int)(Math.random()*8+1);
        String criatura="no";
        int x = (int)(Math.random()*4+1);
        String direccion="no";
        String articulo="no";
        String articulo2="no";
        
        //System.out.println(numero);
        
        if (numero==1){
            criatura="Kraken";
        }
        else if (numero==2){
            criatura="Sirenas";
        }
        else if (numero==3){
            criatura="Ballena";
        }
        else if (numero==4){
            criatura="Hipocampo";
        }
        else if (numero==5){
            criatura="Macaraprono";
        }
        else if (numero==6){
            criatura="Pulpo";
        }
        else if (numero==7){
            criatura="Leviatanes";
        }
        else if (numero==8){
            criatura="Hidras";
        }
        
        if (x==1){
            direccion="babor";
        }
        else if (x==2){
            direccion="estribor";
        }
        else if (x==3){
            direccion="proa";
        }
        else if (x==4){
            direccion="popa";
        }
        
        System.out.println(criatura + " "+direccion);
       
        
        if (criatura=="Kraken"|| criatura=="Hipocampo" || criatura=="Pulpo" ){
            articulo ="un";
        }
        else if (criatura == "Hidras"||criatura == "Sirenas" ){
            articulo ="unas"; 
        }
         else if (criatura == "Leviatanes" ){
            articulo ="unos"; 
        }
        else if (criatura == "Macaraprono"||criatura == "Ballena" ){
            articulo ="una"; 
        }
        
        if (direccion=="babor"|| direccion=="estribor" ){
            articulo2 ="a";
        }
        else if (direccion == "proa"||direccion == "popa" ){
            articulo2 ="por la"; 
        }
        
        System.out.println("Ahoy capitan, "+ " "+ articulo+" "+criatura+" "+articulo2+" "+direccion);
        
    }
}


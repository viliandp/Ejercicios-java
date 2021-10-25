import java.util.Scanner;
public class EjCadenas2{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la cadena 1: ");
        String cad1 = sc.nextLine();
        System.out.println("Introduce la cadena 2: ");
        String cad2 = sc.nextLine();
        if(cad1.compareTo(cad2)<0){
            System.out.println("la cadena 1 es primera lexicográficamente :"+cad1.compareTo(cad2));
        }
        else if (cad1.compareTo(cad2)==0) {
            System.out.println("las 2 cadenas son lexicográficamente iguales :"+cad1.compareTo(cad2));
        }else{
            System.out.println("la cadena 2 es lexicográficamente primera :"+cad1.compareTo(cad2));
        }
        
        System.out.println("La cadena 1 en minúsculas es :" + cad1.toLowerCase());
        System.out.println("La cadena 1 en mayúsculas es :" + cad1.toUpperCase());

        System.out.printf("Introduce un carácter de búsqueda: ");
        char caracter = sc.next().charAt(0);
        if(cad1.indexOf(caracter)<0){
            System.out.println("Ese carácter introducido no existe.");
        }else{
            int posicion, contador = 0;
            posicion = cad1.indexOf(caracter);
            while (posicion != -1) { 
                contador++;          
                posicion = cad1.indexOf(caracter, posicion + 1);
            }
            System.out.println("El carácter introducido es : "+ caracter + " y aparece : " + contador + " veces.");    
        }

        for(int i=0;i<cad1.length();i++){
            cad1.charAt(i);
            int posicion, contador = 0;
            posicion = cad1.indexOf(cad1.charAt(i));
            while (posicion != -1) { 
                contador++;          
                posicion = cad1.indexOf(caracter, posicion + 1);
            }
            System.out.println("El carácter"+cad1.charAt(i)+" aparece un total de: "+contador );
        }
    }
}
import java.util.Scanner;
public class EjCadenas{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    /* Dada la cadena “Estoy utilizando cadenas de texto”,
    Obtén la cadena2, que resulta desde la posición 6 de la cadena 
    hasta el final de esta.
    Muestra esa cadena 2.
    Obtén la cadena 3, que resulta de obtenerde cadena la 
    subcadena desde la posicion 15 hasta la
    posición 23.
    Muestra esa cadena 3.
    A continuación el programa creará un String llamado 
    “stringtemporal”, en el que almacene la
    cadena invertida.(escrita de derecha a izquierda)
    A continuación, muestra las dos cadenas, la cadena normal y la invertida.
    Por último, crea a partir de cadena una cadenasinblancos, en el que metas la cadena original pero
    sin ningún blanco. A continuación, muestra las dos cadenas*/
    String cadena ="Estoy utilizando cadenas de texto";
    System.out.println(cadena.length());
    String cadena2=cadena.substring(6);
    System.out.println(cadena2);
    String cadena3=cadena.substring(15,23);
    System.out.println(cadena3);
    String stringtemporal="";
    int indice = 32;
    for(int i=0;i<cadena.length();i++){
        stringtemporal += cadena.charAt(indice);
        indice--;
    }
    System.out.println(cadena);
    System.out.println(stringtemporal);
    String cadenasinblancos = cadena.replaceAll(" ","");
    System.out.println(cadenasinblancos);

    /*    
    • Pide al usuario que te inserte en Java 2 nombres de personas ( el nombre y dos apellidos).
    • Muestra los nombre que ha introducido el usuario, especificando 
    el número de caracteres que tiene cada uno de ellos.
    • Comprueba si los nombres son iguales, haciéndolo primero sin 
    tener en cuanta mayúsculas y posteriormente, teniendo en cuenta mayúsculas y minúsculas.
    • Muestra los espacios en blanco que tiene cada cadena. Para 
    ello realiza un método, contar_blancos(cadena), que devuelve el número de blancos que tiene la cadena que se le pasa como parámetro.
    • Muestra la primera cadena, carácter a carácter, indicando 
    la posición que ocupa ese carácter dentro de la cadena, es decir si cadena1 es : Juan Palomo Sanchez, debería mostrar:
    • Nombre: Juan Palomo Sanchez.
    • Si mostramos el nombre carácter a carácter, indicando su  posición, sería: */
    System.out.println("Introduce el nombre y apellidos de la primera persona -> \n Nombre : ");
    String nombre1=sc.nextLine();
    
    System.out.println("Introduce el nombre y apellidos de la primera persona -> \n Nombre : ");
    String nombre2=sc.nextLine();
    
    System.out.println("La persona 1 se llama :"+nombre1+"["+(nombre1.length())+"]");
    System.out.println("La persona 2 se llama :"+nombre2+"["+(nombre2.length())+"]");

    nombre1.equals(nombre2);
    nombre1.equalsIgnoreCase(nombre2);

    int blancos1 = contarBlancos(nombre1);
    System.out.println("El nombre 1:"+ nombre1 +" tiene "+blancos1+" espacios en blancos.");
    int blancos2 = contarBlancos(nombre2);
    System.out.println("El nombre 2:"+ nombre2 +" tiene "+blancos2+" espacios en blancos.");

    System.out.println(nombre1);
    for(int i=0;i<nombre1.length();i++){
        System.out.println("Posicion ["+i+"]"+nombre1.charAt(i));
    }

    }

    public static int contarBlancos(String x){
        int cont=0;
        for(int i=0; i<x.length();i++){
            char c = x.charAt(i);
           if (c==' '){
            cont++;
           } 
        }
        return cont;
    }
}
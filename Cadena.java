public class Cadena{
public static void main(String[] args) {
String cadena;
char temp;

//Diferentes formas de inicializar
cadena = new String(); //Cadena vacia
System.out.println(cadena+" "+cadena.length());

cadena = "";//cadena vacía
System.out.println(cadena+" "+cadena.length());

cadena = "Hola Mundo";//Cadena Hola Mundo
System.out.println(cadena+" "+cadena.length());

cadena = new String("Hola Mundo");////Cadena Hola Mundo
System.out.println(cadena+" "+ cadena.length());

/*for(int i=0; i<=255; i++)
{
temp =(char) i;
System.out.println(temp+" "+i);
} */

System.out.println(cadena.charAt(0));
System.out.println(cadena.toUpperCase());

cadena = cadena.charAT(0)+"";

for (int i=cadena.length()-1;i>=0;i--){
	System.out.print(cadena.charAt(i));
}
	System.out.println();
	}
}
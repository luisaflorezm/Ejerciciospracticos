	import java.util.Scanner;
	public class Ejercicios{
public static void main (String[]args){

	Scanner lector= new Scanner(System.in);

		System.out.println("Ingrese valor de X");
        int x = lector.nextInt();

        System.out.print("Ingrese Ingrese valor Y");
        int y = lector.nextInt();

        int resultado; //Declaración

        resultado=0; //Inicialización
        resultado=(((4*x*x)/(2*y+1))/((5*x*y)/(2+(1/2+x*x))));

        int resultado1; //Inicialización
        resultado1=0;
        resultado1= ((((1+3*y)/(2*x))+((1)+(2*x)/(1+y*y)))/((1)+(3*y)/(1+5*x*x)));


        System.out.println("El resultado de la ecuación es: "+resultado); 
        System.out.println("El resultado de la ecuación es: "+resultado1);
}

	}


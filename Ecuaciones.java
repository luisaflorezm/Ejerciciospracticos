import java.util.Scanner;
	public class Ecuaciones{
public static void main (String[]args){
		
		Scanner lector= new Scanner(System.in);

		System.out.println("Ingrese valor de X");
        float variable1 = lector.nextFloat(); 

        System.out.print("Ingrese Ingrese valor Y");
        float variable2= lector.nextFloat();

        System.out.println("Ingrese valor de Z");
        float variable3 = lector.nextFloat();

        System.out.print("Ingrese Ingrese valor W");
        float variable4= lector.nextFloat();

        float resultado; //Declaración

        resultado=0f; //Inicialización
        resultado=(3*variable1)-(2*variable2)-(variable3)-(variable4)+6;

        System.out.println("El resultado de la ecuación es: "+resultado);
}

	}

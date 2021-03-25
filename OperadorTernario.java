import java.util.Scanner;
	public class OperadorTernario{
public static void main (String[]args){

	Scanner lector= new Scanner(System.in);

		System.out.println("Ingrese valor de Y");
        double y = lector.nextDouble();

        System.out.println("Ingrese Ingrese valor Z");
        double z = lector.nextDouble();

        double x; //Declaración

        x=0; //Inicialización
        x=(((1)/((3*y)+((1)/(2+3*z)))+(((1)/(1+y*y))/((1)+((1)/(z*z*z*+z))))));


        System.out.println("El resultado de la ecuación es: "+x); 
        
}

	}

	public class Ecuacion1{
public static void main (String[]args){

        float x; //Declaración
        int y = 2; //Inicialización
        int z = 3;
        x=0.0f; 

        float a = 1;
        float b = 3*y+(1/(2+(3*z)));
        float c = 1/(1+(y*y));
        float d = 1 + (1/((z*z*z)+z));
        x = (a/b) + (c/d);

        //x=(((1)/((3*y)+((1)/(2+3*z)))+(((1)/(1+y*y))/((1)+((1)/(z*z*z*+z))))));


        System.out.println("El resultado de la ecuación es: "+x); 
        
}

	}

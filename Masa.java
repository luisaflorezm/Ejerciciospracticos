	import java.util.Scanner;
	public class Masa{
		public static void main(String[]args){
			Scanner lector= new Scanner(System.in);

		System.out.println("Ingrese su peso");
        double peso = lector.nextDouble(); 

		System.out.println("Ingrese su altura");
        double altura = lector.nextDouble(); 

        double imc= (peso/(altura*altura));

        if(imc<18.5)
			{
				System.out.println("Bajo de peso");
			}
			else
			{
				if((imc>=18.6)&&(imc<=24.9))
				{
					System.out.println("Normal");
				}
				 else
				 {
				 	if((imc>=25.0)&&(imc<=29.9))
				 	{
				 		System.out.println("Sobre pesado");
				 	}
				 	else
				 	{
				 		if((imc>=30))
      					{
      						System.out.println("Obeso");
      					}
				 		
				 	}
				 }
			}
		}
	}

  
 
     
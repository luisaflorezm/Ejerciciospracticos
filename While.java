public class While{
	public static void main(String[]args)
	{
		int i =0;
		while(i<=20){
			System.out.println("El valor actual de la i "+i);
			i = i + 2; //Criterio para que el valor sea falso para poder qaue termine el programa.
		}
		System.out.println("El valor final de la i "+i);
	}
}
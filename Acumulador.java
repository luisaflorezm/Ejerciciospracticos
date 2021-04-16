public class Acumulador{
	public static void main(String[]args)
	{
		int acumulador = 2;

		do{
			System.out.println("El valor del acumulador "+acumulador);
			acumulador+=10;
		}while(acumulador<1000);
		System.out.println("El valor final del acumulador "+acumulador);

		}
}
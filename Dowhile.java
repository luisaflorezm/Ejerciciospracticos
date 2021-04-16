public class Dowhile{
	public static void main(String[]args)
	{
		int i = 100;
		do{
			System.out.println("El valor actual de la i "+i);
			i = i - 5; //Garantizar que la i sea 0, entonce se incrementa la i en -5.
		}while(i>=0);
		System.out.println("El valor final de la i "+i);
	}
}
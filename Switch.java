public class Switch{
	public static void main (String[]args){
		int opcion=2;
		int a=1, b=1, c;

		switch(a){
			case 1:c =a+b;
			System.out.println("La suma es "+c);
			break;
			case 2:c =a*b;
			System.out.println("La multiplicación es "+c);
			break;
			case 3:c =a/b;
			System.out.println("La divisón es "+c);
			break;
			default: System.out.println("Opción no válida");
			break;
		}
	}
}
		
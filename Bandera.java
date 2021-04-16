public class Bandera{
	public static void main(String[]args)
	{
		int i=0;
		boolean bandera =true;

		while(bandera)
		{
			System.out.println("Hola");
			if(i >20)
		{
			bandera=false;
		}
		i++;

		}
		System.out.println("Bandera "+bandera);
		}
}
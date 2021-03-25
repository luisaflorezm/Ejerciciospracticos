	public class Factura{
		public static void main (String[]args){
			int valor=350;
			int valor1=350;

			if ((valor>=500)&&(valor<=700)) 
			{
				System.out.println("Su descuento es del 15% "+(valor-(valor*0.15)));
				double a=((valor*0.15)-valor);
			}
				if((valor1>=700)&&(valor1<=1250))
				{
					System.out.println("Su descuento es del 25% "+(valor1-(valor1*0.25)));
					double b=(valor1-(valor1*0.25));
				}
		}
	}

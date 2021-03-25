	public class Promedio{
		public static void main(String[]args){
			byte x=-127;
			short y=322;
			int z=2345;
			float w=4352;
			double v=125.34; 

			double promedio=0;
			promedio= ((x+y+z+w+v)/5);

			System.out.print("byte= "+x);
			System.out.print(" short= "+y);
			System.out.print(" int= "+z);
			System.out.print(" float= "+w);
			System.out.print(" double= "+v);
			System.out.println();
			System.out.println("El resultado es: "+promedio);
			


		}
	}
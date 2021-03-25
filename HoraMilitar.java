	public class HoraMilitar{
		public static void main (String[]args){
			int horamilitar=11;

			if(horamilitar<12)
			{
				System.out.println("Buenos días");
			}
			else
			{
				if((horamilitar>12)&&(horamilitar<18))
				{
					System.out.println("Buenas tardes");
				}
				 else
				 {
				 	if((horamilitar>18)&&(horamilitar<12))
				 	{
				 		System.out.println("Buenas noches");
				 	}
				 	else
				 	{
				 		System.out.println("Feliz año");
				 	}
				 }
			}
		}
	}
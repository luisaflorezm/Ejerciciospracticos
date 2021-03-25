public class Saludo{
public static void main (String[]args){
    int hora=13;//Declaracion de la variable
    if(hora<12)
    {
        System.out.println("buenos dias");
    }
    
    else
    {

    if ((12<hora)&(hora<=18))
        {
            System.out.println("buenas tardes");
        }
        {
        else
        
            {
            if((18<hora)&&(hora<=22))
            {
                System.out.println("Buenas noches");
            }
            }
            else 
            {
                System.out.println("Feliz año");
            }
    }

    }
    
    }
public class Main {
  public static String upperCaseFirst(String val) {
      char[] arr = val.toCharArray();
      arr[0] = Character.toUpperCase(arr[0]);
      return new String(arr);
   }
  
    public static void main(String[] args) {
        String val1 = "luisa";
        String val2 = "camilo";
        String val3 = "mariana";
        String val4 = "jeronimo";
        String val5 = "mateo";
        String val6 = "susana";
        String val7 = "juan";
        String val8 = "ana";
        
        String output = upperCaseFirst(val1);
        
        System.out.println(output);
    
        output = upperCaseFirst(val2);
       
        System.out.println(output); 
        output = upperCaseFirst(val3);
       
        System.out.println(output);
        output = upperCaseFirst(val4);
       
        System.out.println(output);
        output = upperCaseFirst(val5);
       
        System.out.println(output);
        output = upperCaseFirst(val6);
       
        System.out.println(output);
        output = upperCaseFirst(val7);
       
        System.out.println(output); 
        output = upperCaseFirst(val8);
       
        System.out.println(output);
    }  
}

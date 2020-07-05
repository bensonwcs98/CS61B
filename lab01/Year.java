/** Print out whether or not a year is a leap year 
* or not. */
public class LeapYear{
    
	/** Calls isLeapYear to print correct statement.
	 *  @param year to be analyzed
	 */
     private static void isLeapYear(){
         if(isLeapYear(year)){
            System.out.printf("%d is a lear year.\n", year);
         }else{
            System.out.printf("%d is not a leap year.\n",year);
         }
     }	

    /** Must be provide an integer as a command line argument ARGS. */
    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for(int i = 0; i < args.length; i++){
           try{
               int year = Integer.parseInt(args[i]);
               checkLeapYear(year);
           }catch(NumberFormatException e){
               System.out.printf("%s is not a valid number.\n", args[i]);
           }
        }
    }
}



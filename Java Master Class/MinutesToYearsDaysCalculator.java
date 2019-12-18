public class MinutesToYearsDaysCalculator {
    // write your code here
     public static void printYearsAndDays(long mimutes){
         
         if(mimutes < 0){
         System.out.println("Invalid Value");
         }else{
         long years = (int)(mimutes / 60 / 24 / 365) ;
         long days =  (int)(mimutes / 60 / 24) ;
            if (days < 365){
            System.out.println(mimutes + " min = " + years +" y and " + days +" d");} else{ 
                long remainDays = (int)(days % 365) ;
                System.out.println(mimutes + " min = " + years +" y and " + remainDays +" d");
                }
         }
     }
}
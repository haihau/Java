public class BarkingDog {
    
    public static boolean shouldWakeUp (boolean dogIsBarking , int hourOfDay ){
        
        if (dogIsBarking == true &&  
            (hourOfDay >= 0 && hourOfDay < 8) || 
            (hourOfDay > 22 && hourOfDay < 24)){
            return true;
        }else
        return false;
    }
}
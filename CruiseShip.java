/** 
 * ACS-1904 lab 6
 * @Sveinson
*/

public class CruiseShip extends Ship{
    private String cruiseLine;
    private int passengers;
    
    // constructors
    public CruiseShip(){
        cruiseLine = "Unknown";
        passengers = 0;
    }
    
    //String name, String flag, int year
    public CruiseShip(String n, String f, int y,  String cl, int p){
        super(n, f, y);
        cruiseLine = cl;
        passengers = p;
    }
    
    //getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets info about the cruise shi[
    * 
    * @return       String: ship info
    * ****************************************/  
    @Override
    public String getName(){
        return cruiseLine + ", " + shipName + ", " + passengers;
    }
        

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/

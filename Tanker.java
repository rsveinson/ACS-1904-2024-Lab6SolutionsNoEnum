/** 
 * ACS-1904 lab 6
 * @Sveinson
*/

public class Tanker extends Ship{
    private int capacity;
    private int length;
    
    // constructors
    public Tanker(){
        capacity = 0;
        length = 0;
    }
    
    //String name, String flag, int year
    public Tanker(String n, String f, int y,  int c, int l){
        super(n, f, y);
        capacity = c;
        length = l;
    }    
    //getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets info about the tanker
    * 
    * @return       String: ship info
    * ****************************************/  
    public String getName(){
        return shipName + ", " + capacity + "L, " + length + "m";
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

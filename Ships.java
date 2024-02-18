import java.util.ArrayList;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Ships{
    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList();

        Tanker s = new Tanker("Evergreen", "Panama", 2004, 300000, 500);
        Tanker t = new Tanker("Ranger", "Beliz", 1997, 250000, 450);
        CruiseShip c = new CruiseShip("Aurora", "HongKong", 2021, "MSV", 5453);

        ships.add(s);
        ships.add(t);
        ships.add(c);

        for(Ship ship : ships)
            System.out.println(ship.getName());
   
        System.out.println();
        System.out.println("Printing with toString()");
        System.out.println(ships.get(1));
        
        // for(Ship ship : ships)
            // System.out.println(ship);

        System.out.println("\nend of program");
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

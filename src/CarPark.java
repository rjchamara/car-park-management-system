import java.util.HashMap;

public class CarPark { // car park class
    String faculty;
    String parkid;
    String entrancegps;
    String exitgps;
    String parkindicator = "Available";

    HashMap<String, String> allparks = new HashMap<>();


    public void addpark(){ // method for add car park and set availability of park

        allparks.put(faculty+", Park. "+"(ID: "+parkid+", Entrance: "+entrancegps+", Exit: "+exitgps+")",parkindicator);

    }

    public void park(){ //print details of car park

        for (String i : allparks.keySet()) {
            System.out.println( i + " ---> " + allparks.get(i));
        }

    }
}

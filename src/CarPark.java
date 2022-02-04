import java.util.HashMap;

public class CarPark {
    String faculty;
    String parkid;
    String entrancegps;
    String exitgps;
    String parkindicator = "Available";

    HashMap<String, String> allparks = new HashMap<>();


    public void addpark(){

        allparks.put(faculty+" Park. "+"(ID : "+parkid+")",parkindicator);

    }

    public void park(){

        for (String i : allparks.keySet()) {
            System.out.println( i + " ---> " + allparks.get(i));
        }

    }
}

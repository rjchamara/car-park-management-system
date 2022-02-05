
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        /*ArrayList set for check parks and slots availability*/
        ArrayList<String> checktechslot = new ArrayList<>();
        ArrayList<String> checkmedislot = new ArrayList<>();
        ArrayList<String> checkartsslot = new ArrayList<>();
        ArrayList<String> checktechpark = new ArrayList<>();
        ArrayList<String> checkmedipark = new ArrayList<>();
        ArrayList<String> checkartspark = new ArrayList<>();

        CarPark tech = new CarPark(); // technology faculty car park

        tech.faculty = "Faculty of Technology ";
        tech.parkid = "tech1";
        tech.entrancegps = "6.9364° N, 79.8486° E";
        tech.exitgps = "6.9360° N, 79.8486° E";
        tech.parkindicator="Parking Available..!!";
        tech.addpark();

        CarPark medi = new CarPark(); //medicine faculty car park

        medi.faculty = "Faculty of Medicine";
        medi.parkid = "medi1";
        medi.entrancegps = "6.9364° N, 79.8486° E";
        medi.exitgps = "6.9360° N, 79.8486° E";
        medi.addpark();
	
    }
}

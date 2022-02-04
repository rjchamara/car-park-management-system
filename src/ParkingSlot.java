import java.util.ArrayList;
import java.util.HashMap;

    public class ParkingSlot {
        String slotid;
        String slotgps;
        String slotindicator;
        String slotimformation;
        String slottype;
        String parkingslotindicator = "Available";
        HashMap<String, ArrayList<String>> parkingslot = new HashMap<>();
        HashMap<String, String> allslots = new HashMap<>();

        public void addslot(){

            allslots.put(slotid+"("+slottype+")",parkingslotindicator);
            parkingslot.put(slotid, new ArrayList<>());// then simply access it with
            parkingslot.get(slotid).add("Slot id : "+slotid);
            parkingslot.get(slotid).add("Slot type : "+slottype);
            parkingslot.get(slotid).add("GPS coordinates string of slot : "+slotgps);
            parkingslot.get(slotid).add("Other information : "+slotimformation);
        }

        public void allslots() {

            for (String i : allslots.keySet()) {
                System.out.println(i + " ---> " + allslots.get(i));
            }
        }

        public void bookslot(){
            allslots.put(slotid+"("+slottype+")","Unavailable");
        }

        public void exitslot() {
            allslots.put(slotid+"("+slottype+")","Available");
        }


    }


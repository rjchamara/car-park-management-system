import java.util.ArrayList;
import java.util.HashMap;

    public class ParkingSlot { // parking slot class
        String slotid;
        String slotgps;
        String slotindicator;
        String slotimformation;
        String slottype;
        String parkingslotindicator = "Available";
        HashMap<String, ArrayList<String>> parkingslot = new HashMap<>();
        HashMap<String, String> allslots = new HashMap<>();

        public void addslot(){ //add sloat for park

            allslots.put(slotid,parkingslotindicator);
            parkingslot.put(slotid, new ArrayList<>());// then simply access it with
            parkingslot.get(slotid).add("Slot id : "+slotid);
            parkingslot.get(slotid).add("Slot type : "+slottype);
            parkingslot.get(slotid).add("GPS coordinates string of slot : "+slotgps);
            parkingslot.get(slotid).add("Other information : "+slotimformation);
        }

        public void allslots() { //view all slots in park

            for (String i : allslots.keySet()) {
                System.out.println(i + " ---> " + allslots.get(i));
            }
        }

        public void bookslot(){ // book a slot
            allslots.put(slotid,"Unavailable");
        }

        public void exitslot() { // exit from slot
            allslots.put(slotid,"Available");
        }

        public void slotdetails(){
            System.out.println(parkingslot.get(slotid));
        }


    }


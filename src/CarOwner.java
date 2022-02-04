import java.util.ArrayList;
import java.util.HashMap;

public class CarOwner {
    public class CarOwner {
        String ownerid;
        String mobile;
        String vehiclenumber;
        String detailsid;
        String exitid;

        HashMap<String, ArrayList<String>> carowner = new HashMap<>();
        HashMap<String, String> allowners = new HashMap<>();


        public void enter(){

            allowners.put(ownerid,vehiclenumber);
            carowner.put(ownerid, new ArrayList<>());// then simply access it with
            carowner.get(ownerid).add("owner id : "+ownerid);
            carowner.get(ownerid).add("mobile number : "+mobile);
            carowner.get(ownerid).add("vehicle number : "+vehiclenumber);
        }
        public void details(){


            for (String i : carowner.keySet()) {
                System.out.println( i + " ---> " + carowner.get(i));
            }

        }


        public void all(){

            for (String i : allowners.keySet()) {
                System.out.println( i + " ---> " + allowners.get(i));
            }


        }

    }
}

import java.util.ArrayList;
import java.util.HashMap;


    public class CarOwner { // car owner class
        String ownerid;
        String mobile;
        String vehiclenumber;
        String detailsid;
        String exitid;

        HashMap<String, ArrayList<String>> carowner = new HashMap<>(); // save all car owner data in this array



        public void enter(){ //enter all car owner details


            carowner.put(ownerid, new ArrayList<>()); // add details to array
            carowner.get(ownerid).add("owner id : "+ownerid);
            carowner.get(ownerid).add("mobile number : "+mobile);
            carowner.get(ownerid).add("vehicle number : "+vehiclenumber);
        }
        public void details(){ // view all carowner detailes


            for (String i : carowner.keySet()) {
                System.out.println( i + " ---> " + carowner.get(i));
            }

        }

        public void removeowner(){
            carowner.remove(ownerid);

        }

        }



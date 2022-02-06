
import java.util.ArrayList;
import java.util.Scanner;

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
        tech.parkindicator = "Parking Available..!!";
        tech.addpark();

        ParkingSlot techslots = new ParkingSlot(); // add slots for technology faculty car park

        techslots.slotid = "ts1";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "standard";
        techslots.slotimformation = "----";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);

        techslots.slotid = "ts2";
        techslots.slottype = "standard";
        techslots.slotimformation = "----";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);

        techslots.slotid = "ts3";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "standard";
        techslots.slotimformation = "----";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);


        CarPark medi = new CarPark(); //medicine faculty car park

        medi.faculty = "Faculty of Medicine";
        medi.parkid = "medi1";
        medi.entrancegps = "6.9364° N, 79.8486° E";
        medi.exitgps = "6.9360° N, 79.8486° E";
        medi.addpark();

        ParkingSlot medislots = new ParkingSlot(); // add slots for medicine faculty car park

        medislots.slotid = "ms1";
        medislots.slottype = "standard";
        medislots.slotimformation = "----";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        medislots.slotid = "ms2";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "standard";
        medislots.slotimformation = "----";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        medislots.slotid = "ms3";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "standard";
        medislots.slotimformation = "----";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        medislots.slotid = "ms4";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "standard";
        medislots.slotimformation = "----";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        CarPark arts = new CarPark(); //add arts faculty car park

        arts.faculty = "Faculty of Arts";
        arts.parkid = "arts1";
        arts.entrancegps = "6.9364° N, 79.8486° E";
        arts.exitgps = "6.9360° N, 79.8486° E";
        arts.addpark();

        ParkingSlot artsslots = new ParkingSlot(); //add slots for arts faculty car park

        artsslots.slotid = "as1";
        artsslots.slottype = "standard";
        artsslots.slotimformation = "----";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.addslot();
        checkartsslot.add(artsslots.slotid);
        checkartspark.add(artsslots.slotid);

        artsslots.slotid = "as2";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.slottype = "standard";
        artsslots.slotimformation = "----";
        artsslots.addslot();
        checkartsslot.add(artsslots.slotid);
        checkartspark.add(artsslots.slotid);

        artsslots.slotid = "as3";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.slottype = "standard";
        artsslots.slotimformation = "----";
        artsslots.addslot();
        checkartsslot.add(artsslots.slotid);
        checkartspark.add(artsslots.slotid);

        artsslots.slotid = "as4";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.slottype = "standard";
        artsslots.slotimformation = "----";
        artsslots.addslot();
        checkartsslot.add(artsslots.slotid);
        checkartspark.add(artsslots.slotid);

        tech.park();
        techslots.allslots();
        medi.park();
        medislots.allslots();
        arts.park();
        artsslots.allslots();

        System.out.println(checktechslot);
        System.out.println(checkmedislot);
        System.out.println(checkartsslot);
        System.out.println(checktechpark);
        System.out.println(checkmedipark);
        System.out.println(checkartspark);

       CarOwner owner = new CarOwner();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("1 staff member."); // selecting part of car owner and staff
        System.out.println("2 car owner.");


        System.out.println("Are you ?");
        int user = myObj.nextInt();

        if (user == 1) {


            while (true) {

                /*this is a selecting part of staff's work*/
                System.out.println("1 add car owner.");
                System.out.println("2 view all owners.");
                System.out.println("3 view park.");
                System.out.println("4 back.");
                System.out.println("what do you want ?");

                int staffwork = myObj.nextInt();

                if (staffwork == 1) { //add car owner part

                    /*get inputs for car owner details*/
                    Scanner detail = new Scanner(System.in);
                    System.out.println("Enter car owner ID.");
                    String ownerid = detail.nextLine();
                    System.out.println("Enter car owner mobile number.");
                    String mobile = detail.nextLine();
                    System.out.println("Enter vehicle number.");
                    String vehiclenumber = detail.nextLine();
                    owner.ownerid = ownerid;
                    owner.mobile = mobile;
                    owner.vehiclenumber = vehiclenumber;
                    owner.enter();
                }else if (staffwork == 2) { //view all owners part
                    owner.details();

                }else if (staffwork == 3) { //view park

                    /*from this part print all parks,parking slots and check availability of park using park checking array*/
                    if (checktechpark.size() == 0) {
                        tech.parkindicator = "Parking full..!!";
                        tech.addpark();
                        tech.park();
                        techslots.allslots();

                    } else {
                        tech.parkindicator = "Parking Available..!!";
                        tech.addpark();
                        tech.park();
                        techslots.allslots();
                    }

                    if (checkmedipark.size() == 0) {
                        medi.parkindicator = "Parking full..!!";
                        medi.addpark();
                        medi.park();
                        medislots.allslots();

                    } else {
                        medi.parkindicator = "Parking Available..!!";
                        medi.addpark();
                        medi.park();
                        medislots.allslots();
                    }

                    if (checkartspark.size() == 0) {
                        arts.parkindicator = "Parking full..!!";
                        arts.addpark();
                        arts.park();
                        artsslots.allslots();

                    } else {
                        arts.parkindicator = "Parking Available..!!";
                        arts.addpark();
                        arts.park();
                        artsslots.allslots();
                    }
                }
                else if (staffwork == 4){ // back from staff side
                    break;

                }
                else { // print "invalid input..!!" when input incorrect number
                    System.out.println("Invalid input...!!");
                }

            }
        }
    }
}

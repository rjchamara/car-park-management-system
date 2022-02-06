
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

        ArrayList<String> password = new ArrayList<>(); //arraylist for store the passwords

        /*add passwords*/
        password.add("abc123");
        password.add("abc234");
        password.add("abc345");

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

        techslots.slotid = "th1";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "handicapped";
        techslots.slotimformation = "Near to library";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);

        techslots.slotid = "th2";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "handicapped";
        techslots.slotimformation = "Near to library";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);

        techslots.slotid = "tl1";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "long vehicle";
        techslots.slotimformation = "length: 6m, width: 3m";
        techslots.addslot();
        checktechslot.add(techslots.slotid);
        checktechpark.add(techslots.slotid);

        techslots.slotid = "tl2";
        techslots.slotgps = "6.9364° N, 79.8487° E";
        techslots.slottype = "long vehicle";
        techslots.slotimformation = "length: 6m, width: 3m";
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

        medislots.slotid = "mh1";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "handicapped";
        medislots.slotimformation = "Near to chemistry lab";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        medislots.slotid = "mh2";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "handicapped";
        medislots.slotimformation = "Near to chemistry lab";
        medislots.addslot();
        checkmedislot.add(medislots.slotid);
        checkmedipark.add(medislots.slotid);

        medislots.slotid = "ml1";
        medislots.slotgps = "6.9364° N, 79.8487° E";
        medislots.slottype = "long vehicle";
        medislots.slotimformation = "length: 6m, width: 3m";
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

        artsslots.slotid = "ah1";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.slottype = "handicapped";
        artsslots.slotimformation = "Near to canteen";
        artsslots.addslot();
        checkartsslot.add(artsslots.slotid);
        checkartspark.add(artsslots.slotid);

        artsslots.slotid = "al1";
        artsslots.slotgps = "6.9364° N, 79.8487° E";
        artsslots.slottype = "long vehicle";
        artsslots.slotimformation = "length: 6m, width: 3m";
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

        if (user == 1) { //staff side

            int j=1;
            int k=0;
            while (j==1) {
                /*this is staff password checking part*/
                Scanner staffpw = new Scanner(System.in);
                System.out.println("Enter your Password.");
                String  pw = staffpw.nextLine();

                if (password.contains(pw)) {
                    j=0;
                } else {
                    System.out.println("Your password is incorrect..!!");
                    System.out.println("1 enter again.");
                    System.out.println("2 back");
                    System.out.println("what do you want?");
                    Scanner pwback = new Scanner(System.in);
                    int  pwb = pwback.nextInt();
                    if (pwb ==  2) {
                        k=1;
                        break;
                    }else {
                        j=1;
                    }


                }
            }


            while (true) {

                if (k==1){ //this id go back part when user select back option in the password checking part
                    break;
                }

                /*this is a selecting part of staff's work*/
                System.out.println("1 add car owner.");
                System.out.println("2 view all owners.");
                System.out.println("3 view park.");
                System.out.println("4 change password.");
                System.out.println("5 back.");
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
                }else if (staffwork == 4){
                    /*this is staff password reset part*/
                    Scanner oldpw = new Scanner(System.in);
                    System.out.println("Enter old password.");
                    String oldpass = oldpw.nextLine();
                    if (password.contains(oldpass)){
                        Scanner newpw1 = new Scanner(System.in);
                        System.out.println("Enter new password.");
                        String newpass1 = newpw1.nextLine();
                        Scanner newpw2 = new Scanner(System.in);
                        System.out.println("confirm password.");
                        String newpass2 = newpw2.nextLine();
                        if (newpass1.equals(newpass2)){
                            password.remove(oldpass);
                            password.add(newpass2);
                            System.out.println("changing your password is successful..!!");
                        }else {
                            System.out.println("Your confirmation password does not match..!!");
                        }


                    }else {
                        System.out.println("The old password you entered is incorrect..!!" );
                    }

                }
                else if (staffwork == 5){ // back from staff side
                    break;

                }
                else { // print "invalid input..!!" when input incorrect number
                    System.out.println("Invalid input...!!");
                }

            }
        }

        if (user == 2) {

            while (true) {

                /*this is carowner's work selecting part*/
                System.out.println("1 view park");
                System.out.println("2 book park");
                System.out.println("3 exit park");
                System.out.println("4 view slot details");
                System.out.println("5 back");
                Scanner ownerwork = new Scanner(System.in);
                System.out.println("what do you want ?");
                int carownerwork = ownerwork.nextInt();

                if (carownerwork == 1) { //view park

                    /*this is view park part from car owner side */
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
                }else if (carownerwork == 2) { //select park
                    /*this is the part that selecting a slot according to car owner inputs*/
                    Scanner slotidbook = new Scanner(System.in);
                    System.out.println("Enter slot id.");
                    String slotid = slotidbook.nextLine();

                    if (checktechslot.contains(slotid)) {
                        techslots.slotid = slotid;
                        techslots.bookslot();
                        checktechpark.remove(slotid);
                    } else if (checkmedislot.contains(slotid)) {
                        medislots.slotid = slotid;
                        medislots.bookslot();
                        checkmedipark.remove(slotid);
                    }
                    else if (checkartsslot.contains(slotid)) {
                        artsslots.slotid = slotid;
                        artsslots.bookslot();
                        checkartspark.remove(slotid);
                    }
                    else {
                        System.out.println("invalid id..!!");
                    }


                }else if (carownerwork == 3) { // exit from the park

                    int i=1;
                    while (i==1) {

                        /*check car owner id when exit */
                        Scanner owneridexit = new Scanner(System.in);
                        System.out.println("Enter your id.");
                        String exitid = owneridexit.nextLine();

                        if (owner.carowner.containsKey(exitid)) {
                            owner.ownerid = exitid;
                            owner.removeowner();
                            i=0;
                        } else {
                            System.out.println("check your ID and enter again..!!");
                            i=1;
                        }
                    }
                    /*this id the part that car owner exit from the park*/
                    Scanner slotidexit = new Scanner(System.in);
                    System.out.println("Enter slot id.");
                    String slotid = slotidexit.nextLine();


                    if (checktechslot.contains(slotid)) {
                        techslots.slotid = slotid;
                        techslots.exitslot();
                        checktechpark.add(slotid);
                    } else if (checkmedislot.contains(slotid)) {
                        medislots.slotid = slotid;
                        medislots.exitslot();
                        checkmedipark.add(slotid);
                    } else if (checkartsslot.contains(slotid)) {
                        artsslots.slotid = slotid;
                        artsslots.exitslot();
                        checkartspark.add(slotid);
                    }
                    else {

                        System.out.println("invalid id..!!");
                    }
                }else if (carownerwork == 4){

                    /*this is the part that view each slots details separately*/
                Scanner slotidexit = new Scanner(System.in);
                System.out.println("Enter slot id.");
                String slotid = slotidexit.nextLine();


                if (checktechslot.contains(slotid)) {
                    techslots.slotid = slotid;
                    techslots.slotdetails();
                } else if (checkmedislot.contains(slotid)) {
                    medislots.slotid = slotid;
                    medislots.slotdetails();
                }
                else if (checkartsslot.contains(slotid)) {
                    artsslots.slotid = slotid;
                    artsslots.slotdetails();
                }
                else {

                    System.out.println("invalid id..!!");
                }

            }else if (carownerwork == 5){
                    break;

                } else {
                    System.out.println("invalid input...!!");
                }
            }
        }
    }
}

package Find_My_Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrain {
    public static void main(String[] args) {

        //First Main trainSystem object
        TrainSystem system = new TrainSystem();

        //creating Train object to add a train and there name
        Train train1 = new Train("000333", "Duranto Exp","Express");
        Train train2 = new Train("000334", "Rajdhani Exp","Express");
        Train train3 = new Train("000335", "Vapi Passenger","Passenger");

        //Creation Station object to add Station
        Station station1 = new Station("S001" , "Mumbai");
        Station station2 = new Station("S002" , "Ahmedabad");
        Station station3 = new Station("S003" , "Vapi");

        //Creating platform to add
        Platforms p1 = new Platforms(1);
        Platforms p2 = new Platforms(2);
        Platforms p3 = new Platforms(3);

        //Set the Which Platform Contain Which train
        p1.setTrain(train1);
        p2.setTrain(train2);
        p3.setTrain(train3);

        //adding all this in LIst format
        List<Platforms> platforms = new ArrayList<>();
        platforms.add(p1);
        platforms.add(p2);
        platforms.add(p3);

        station1.setPlatformsList(platforms);

        //Creating A Schedule for a train
        Schedule s1 = new Schedule(train1 ,station1 ,"9.00Am","9.05Am",p1);
        Schedule s2 = new Schedule(train2 ,station2 ,"10.00Am","10.05Am",p2);
        Schedule s3 = new Schedule(train3 ,station3 ,"11.00Am","11.05Am",p1);


         //After Creating all object adding into the TrainSystem

        //first add station in the system
        system.addStation(station1);
        system.addStation(station2);
        system.addStation(station3);

        //Second we add trains in the System

        system.addTrains(train1);
        system.addTrains(train2);
        system.addTrains(train3);

        //adding Schedule in the System
        system.addShedule(s1);
        system.addShedule(s2);
        system.addShedule(s3);

        //let's Find out trains between stations

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Source");
        String source = sc.nextLine();

        System.out.println("Enter the Destination");
        String destination = sc.nextLine();

        List<Schedule>myTrains = system.findMyTrains(source ,destination);

        // Display the results
        if (myTrains.isEmpty()) {
            System.out.println("No trains found between " + source + " and " + destination);
        } else {
            System.out.println("Trains between " + source + " and " + destination + ":");
            for (Schedule schedule : myTrains) {
                System.out.println(schedule.getTrain());
            }
        }

    }
}

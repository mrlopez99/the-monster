/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Problem5 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Input distance in meters: ");
        double distanceInMeters = scanner.nextDouble();
        
        System.out.print("Input hour: ");
        int hours = scanner.nextInt();
        
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSecond = distanceInMeters / totalTimeInSeconds;
        double speedInKilometersPerHour = (distanceInMeters / 1000) / (totalTimeInSeconds / 3600);
        double speedInMilesPerHour = (distanceInMeters / 1609) / (totalTimeInSeconds / 3600);
     
        System.out.println("\n Your speed in meters/second is:" + speedInMetersPerSecond);
        System.out.println("\n Your speed in km/h is:" + speedInKilometersPerHour);
        System.out.println("\n Your speed in miles/h is:" + speedInMilesPerHour);
        
        scanner.close();
    }
}



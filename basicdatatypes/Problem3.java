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
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long minutes = sc.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        
        System.out.println(minutes + " minutes is approximately" + years + " year and " + days + "days");
        sc.close();
    } 
}

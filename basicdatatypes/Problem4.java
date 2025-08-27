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
public class Problem4 {
    public static void main(String[] args) {
        
    
            Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Input weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.print("Input height in inches: ");
        double heightInInches = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.453592;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
       
        System.out.printf("Body Mass Index is %.15f%n", bmi);
        
     
        scanner.close();
}
    

}

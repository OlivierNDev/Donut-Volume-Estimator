/*
 *Student Name: Olivier Niyonshima
 *Student Number:
 *Lab Professor Name: Hala Own
 *Lab Section Number: CST8116
 *Due Date:

 * I'm required to build program which will determine the volume of a squashed donut depending on user input for its height,
 * inner radius, and outer radius. Program will output programmer's name which is my name and outpted volume will be 
 * in 2 decimal places
 */

import java.util.Scanner;

public class DonutLauncher {
	public static void main (String[] args) {
	        Scanner keyboard = new Scanner(System.in);

	        System.out.print("Enter the height of the donut:"); // I have use print in order to prevent 
	                                                             //carriage return bugs in my code
	        double height = keyboard.nextDouble();

	        System.out.print("Enter the inner radius of the donut:");
	        double innerRadius = keyboard.nextDouble();

	        System.out.print("Enter the outer radius of the donut:");
	        double outerRadius = keyboard.nextDouble();

	        Donut donut = new Donut(height, innerRadius, outerRadius);
	        double volume = donut.calculateVolume();

	        System.out.printf("The volume of the squashed donut is: %.2f cm³ %n", volume);
	        System.out.println("Program by Olivier ");
	        keyboard.close();
	       
	        
	    }
	}

package Hello_World1;

import java.util.Scanner;
import java.lang.Math;

public class PaintEstimator {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double paintGallons;
	      int neededCans;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();                      
	      
	      
	      wallArea = wallHeight * wallWidth;                        
	      System.out.println("Wall area: " + wallArea + " square feet");     
	      
	      paintGallons = wallArea / 350;
	      System.out.println("Paint needed: " + paintGallons + " gallons");
	      
	      neededCans = (int)Math.round(paintGallons);
	      System.out.println("Cans needed: " + neededCans + " can(s)");
	   }
	}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subroutineselection;
import java.util.Scanner;
/**
 *
 * @author kibat6204
 */
public class SubroutineSelection {

    /**
     * @param args the command line arguments
     */
    
    public static int areaAndOut(int l, int w, int h)
        {
            int answer = l*w*h;
            return answer;
        }
    
    public static void averageAndOut(int one, int two, int three, int four)
    {
        System.out.println((one + two + three + four)/4);
    }
    
    public static void accelerationAndOut(double vFinal, double vInitial, double displacement)
    {
        double vFinalSquared = vFinal*vFinal;
        double vInitialSquared = vInitial*vInitial;
        double velocityDifference = vFinalSquared-vInitialSquared;
        double twoTimesDisplacement = 2*displacement;
        double acceleration = velocityDifference/twoTimesDisplacement;
        
        System.out.println("\nThe acceleration is " +acceleration+ " m/s");
    }
    
    public static void circumferanceAndOut(int one)
    {
        System.out.println(2*(Math.PI)*one);
    }
    
    public static void factorialAndOut(int factorial)
    {
        int n = 1;
        int answer = 1;
        for(int i = 1; i<factorial; i++)
        {
            answer = answer *(n+1);
            n = n + 1;
        }
        
        System.out.println("The factorial of "+factorial+ " is " +answer);
    }
            
    public static void main(String[] args) {
        
        boolean exit = false;
        
        Scanner input = new Scanner(System.in);
        
        while(exit == false)
        {
            System.out.println("***CALCULATOR***");
            System.out.println("1...Rectancular Prism Volume Calculator");
            System.out.println("2...Average Calculator");
            System.out.println("3...Circumferance Calculator");
            System.out.println("4...Acceleration Calculator");
            System.out.println("5...Factorial Calculator");
            System.out.println("6...Exit");
            System.out.print("\nPlease select the program number you wish to run --> ");
            
            int selection = input.nextInt();
            
            if(selection == 1)
            {
                System.out.print("\n\nEnter the length --> ");
                int l = input.nextInt();
                System.out.print("\nEnter the width --> ");
                int w = input.nextInt();
                System.out.print("\nEnter the height --> ");
                int h = input.nextInt();
                
                System.out.println("\n\nThe volume is "+areaAndOut(l, w, h));
            }
            
            if(selection == 2)
            {
                System.out.print("\n\nEnter the first number --> ");
                int one = input.nextInt();
                System.out.print("\nEnter the second number --> ");
                int two = input.nextInt();
                System.out.print("\nEnter the third number --> ");
                int three = input.nextInt();
                System.out.print("\nEnter the fourth number --> ");
                int four = input.nextInt();
                
                averageAndOut(one, two, three, four);
                
            }
            if(selection == 3)
            {
                
                System.out.print("\n\nEnter the radius of the circle --> ");
                int one = input.nextInt();
                circumferanceAndOut(one);
            }
            if(selection == 4)
            {
                System.out.print("Enter the initial velocity of the object in m/s --> ");
                double vInitial = input.nextDouble();
                System.out.print("\nEnter the final velocity of the object in m/s --> ");
                double vFinal = input.nextDouble();
                System.out.print("\nEnter the displacement of the object over the acceleration period in m --> ");
                double displacement = input.nextDouble();
            
                accelerationAndOut(vInitial, vFinal, displacement);
            }
            if(selection == 5)
            {
                
                System.out.print("Enter an integer --> ");
                int one = input.nextInt();
                factorialAndOut(one);
            }
            if(selection == 6)
            {
                exit = true;
            }
        }
    }
    
}

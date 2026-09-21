//Area of Circle Class 
//Ronny Jhamb
//Purpose: Class that has logic to Find Area of Circle with User Input with its radius


//Resources: Code.org

import java.util.Scanner;
public class AreaofaCircle
{

 
private double radius;
 private double area_of_circ;

    public AreaofaCircle ()
    {
        System.out.println("The formula for the area of a cirlce is PIr^2   \n \n ");
        System.out.println("Please input a value for the circles radius");
      

         Scanner input = new Scanner(System.in);             
      radius = input.nextDouble();
     

    }


public double solveAreaOfCircle(){

double area_of_circ = Math.PI*Math.pow(radius,2);

System.out.println("The Area of the cirlce with a raidus of   " + radius + "   is equal to   " + area_of_circ +  "   units ^ 2") ;


return area_of_circ;
}

}

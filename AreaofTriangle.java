//Area of Triangle class
//Ronny Jhamb
//Purpose:Class that has logic to Find Area of Triangle with User Input with the base and height


//Resources: Code.org

import java.util.Scanner;
public class AreaofTriangle
{

  
private double height;
private double base;
 private double area_of_tri;

    public AreaofTriangle ()
    {
        System.out.println("The formula for a area of a triangle is (b)(h) * 1/2 \n \n ");
        Scanner input = new Scanner(System.in);   

        System.out.println("Please input a height value \n ");
        height = input.nextDouble();

        System.out.println("Please input a base value \n");
         base = input.nextDouble();

    }


public double solveAreaTriangle(){

double area_of_tri = base*height*1/2;

System.out.println("Area of the triangle is " + area_of_tri + "   units ^2") ;


return area_of_tri;
}

}



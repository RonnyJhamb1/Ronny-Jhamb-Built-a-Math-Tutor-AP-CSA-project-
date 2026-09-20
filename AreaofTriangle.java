//Area of Triangle class
//Ronny Jhamb
//Class that has logic to Find Area of Triangle with User Input


//Resources: Code.org

import java.util.Scanner;
public class AreaofTriangle
{

  
private double height;
private double base;
 private double area_of_tri;

    public AreaofTriangle ()
    {

        System.out.println("Please input a height value");
        System.out.println("Please input a base value");

         Scanner input = new Scanner(System.in);             
      height = input.nextDouble();
     base = input.nextDouble();

    }


public double solveAreaTriangle(){

double area_of_tri = base*height*1/2;

System.out.println("Areaof the triangle " + area_of_tri) ;


return area_of_tri;
}

}



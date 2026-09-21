//PythagoreanTherom Class
//Ronny Jhamb
//Purpose:This class grabs the user input for 2 values which then those two values are used to solve the pythagorean therom and get the hypotenuse
//Sources: Code.org


import java.util.Scanner;

public class PythagoreanTheorm
{

  
private double a_value;
private double b_value;
private double c_value;
private double final_result;

    public PythagoreanTheorm ()
    {

        System.out.println("Here is the formula for Pythagoreans Theorm       a^2+b^2=c^2  \n");

         Scanner input = new Scanner(System.in); 

        System.out.println("Please input a value for one side of the triange (A value) \n " );

        a_value = input.nextDouble();

        System.out.println("Please input a value for the other side of the triange (B value) \n");
        
                    
      
     b_value = input.nextDouble();
        System.out.println("The equation you are going to solve is the square of      "    + a_value +     "     + The square of       " + b_value +  "       which equals c squared which is the hypotensue of the triangle of two values you haven chosen");
    }


public double solvePythoTherom(){

double c_value = Math.pow(a_value, 2)+Math.pow(b_value, 2);
double final_result = Math.sqrt(c_value);

System.out.println("The hypotenuse of your triangle is      " + final_result) ;


return final_result;
}

}


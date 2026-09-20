//Math Tutor AP CSA Project
//Ronny Jhamb
//Instantiate a Scanner Object and use Scanner Library, print out options for User to pick a problem 
//Sources : Code.org, User input code given from project build a Math Tutor Directions 





import java . util . Scanner;



 public class MathTutor
 {
 public static void main (String [] args) 
    {
   Scanner input = new Scanner(System.in);
    

 

    

    System.out.println("Welcome to Math Tutor! \n ");

     System.out.println("Choose a problem: \n ");

     System.out.println("1. Area of a Triangle");
     System.out.println("2. Area of a Circle");
     System.out.println( "3. Pythagorean Theorem \n");


System.out.println("Enter the number of the problem you want to solve (example: 1 = Area of a Triange etc.) : ");
int user_input = input.nextInt();


if ( user_input ==1) {
 AreaofTriangle problem = new AreaofTriangle () ;
problem.solveAreaTriangle();
 
    }

    if ( user_input ==2) {
 AreaofaCircle problem = new AreaofaCircle () ;
 problem.solveAreaOfCircle () ;
 }

if ( user_input ==3) {
 PythagoreanTheorm problem = new PythagoreanTheorm () ;
 problem.solvePythoTherom() ;
 }

 }
}
 
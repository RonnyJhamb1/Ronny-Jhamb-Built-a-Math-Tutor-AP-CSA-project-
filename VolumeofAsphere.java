//Volume of a Sphere class
//Ronny Jhamb
//The Putpose of this class is to find the volume of a sphere from a given radius found with the user input 
//Sources: Code.org




import java.util.Scanner;


public class VolumeofAsphere {
    
private double radius;
 private double volofsphere;
 

    public VolumeofAsphere ()
    {
        System.out.println("The formula for the volume of a sphere is 4/3*PI*radius^3   \n \n ");
        System.out.println("Please input a value for the spheres radius");
      

         Scanner input = new Scanner(System.in);             
      radius = input.nextDouble();
     

    }


public double volofsphere(){

double volofsphere = Math.PI*Math.pow(radius,3)*4/3;

System.out.println("The Volume of a sphere with a raidus of   " + radius + "   is equal to   " + volofsphere + "    units^3") ;


return volofsphere;
}

}






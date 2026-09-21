//TemperatureConverter class
//Ronny Jhamb
//The Purpose of this class is to convert Fahrenheit into Celcius with the user input 
//Sources: Code.org




import java.util.Scanner;

public class Temperatureconverter {
    
private double tempindegrees;
 private double tempincelsius;

    public Temperatureconverter  ()
    {
        System.out.println("The formula for converting from Fahrenheit to Celcius is        Celsius = (Fahrenheit - 32)*5/9 \n \n ");
        System.out.println("Please input a value for Fahrenheit");
      

         Scanner input = new Scanner(System.in);             
      tempindegrees = input.nextDouble();
     

    }


public double Temperatureconverter(){

double tempincelsius = (tempindegrees-32)*5/9;

System.out.println("The Temperature of   "  + tempindegrees  + "  In Fahrenheit      is equal to    " + tempincelsius+ "    In degrees Celsius ") ;


return tempincelsius;
}






}

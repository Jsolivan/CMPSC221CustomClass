/* Custom Classes
@author Jack Solivan CMPSC 221
*/
public class Main 
{
  
  public static void main(String[] args) 
  {
    
    
    Chatbot siri = new Chatbot();
    siri.Greet();
    siri.Weather();
    siri.Time();
  } 
}

//////////////////////////////////////////////////////////

class Chatbot
{
    // state (properties)
    private int Farenheit; 
    private int EST;
    private int Volume;
    public Chatbot()
    {
     Farenheit = 65;
     EST = 3;
     Volume= 15;
    }
    
    // behaviors (methods)
    public void Greet()
    {
      System.out.println("What's up! " +"volume is " +Volume + "db");
    }
    public void Weather()
    {
      System.out.println("The weather is nice outside, " +Farenheit + " degrees Farenheit");
    }
    public void Time()
    {
      System.out.println("Its the afternoon, " +EST + ":00 to be exact");
    }
  

}

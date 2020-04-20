//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
public class Wilder
{
  private String firstName ="wilderFirst";
  private String lastName ="wilderLast";
  private int age = 18;
  // arguments are passed using the text field below this editor
   public Wilder(String firstName,String secondName,int age)
  {
    this.firstName = firstName;
    lastName=secondName;
    this.age=age;
   }
 
  public String sayHello()
  {
  
    String message = "Hello my name is "+    firstName +" "+ lastName;
	return message;
  }
  public String howOldAreYou()
  {
  return "I am "+ age +" years old." ;
  }
}


 

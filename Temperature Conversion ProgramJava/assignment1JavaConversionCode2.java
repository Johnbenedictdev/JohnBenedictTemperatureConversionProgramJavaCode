import javax.swing.*; //what this does is it imports a utility package called javax.swing. This allows the program to create panels and allows keyboard input.
		
public class assignment1JavaConversionCode2  //this line of code creates a public class. Many methods that perform specific tasks can be added within a class.
{ 
	
	static int tempCelsius=0; //This creates a global variable. Such variables can be accessed by all of the methods created within the class(public class). The variable type is integer by the input is String, which was then parsed into integer. Basically the string input is parsed into integer, which then gets stored in the allocated data storage container named tempCelsius as integer, that is accessed globally by all methods.
	
	public static void main(String [] args)  //this creates the main method for this class. 
	{ 
		//this calls the methods named info and out, into the main method
		info(); 
		out(); 
	} 
	 
	
	public static void out() //this creates a method named out
	{  
			
		JOptionPane.showMessageDialog(null,"It's " +tempCelsius+ "°C or "	+((((tempCelsius*9)/5)+32) )+ "°F!"); //this orders the JOptionPane to print out the temperature in celsius and fahrenheit.
			
		if (tempCelsius >= 100)  //this creates a condition that if the temperature is 100 and above, print out a message saying "That's too hot! Well, at least you dont have to worry about bacterial infection."
		{ 
			JOptionPane.showMessageDialog(null,"That's too hot! Well, at least you don't have to worry about bacterial infection."); 
		} 
		
		else if (tempCelsius >= 40 )//this creates a condition that if the input temperature in celsius is more than 40 but less than 100, print out
		{ 
			JOptionPane.showMessageDialog(null,"Wow that's hot!"); 
		} 
		
		else if (tempCelsius <= 15) //this creates a condition that if the temperature in celsius is 15 and below, print out “Call Elsa and Anna cause that’s icy!”
		{ 
			JOptionPane.showMessageDialog(null,"Call Elsa and Anna cause that's icy!"); 
		} 
		
		else //this creates a condition that if the input data does not satisfy the above conditions, in other words if it’s 40≥x≤15, then print out “what a beautiful day! This is the best day of my life!(so far)” 
		{ 
			JOptionPane.showMessageDialog(null,"What a beautiful day! This is the best day of my life!(so far)."); 
		} 
	 
	} 
	
	public static void info()  //this creates a method named info. Which is also called forth by the main method named main
	{ 
	
		String tempCelsiusType = JOptionPane.showInputDialog(null, "What is the temperature in degrees celsius?");//this creates a variable named tempCelsius. This also orders the JOptionPane to print out “what is the temperature in degrees celsius?”. The input with data type string then is stored in the allocated data storage (variable) named tempCelsius as an integer.  
		tempCelsius = Integer.parseInt(tempCelsiusType);//this is where the string gets parsed into integer
	} 
}

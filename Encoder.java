import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;
  
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Encoder
{
    public static void main(String[] args)throws IOException
    {   
    	//import Arraylist
    	ArrayList<String> words = new ArrayList<String>();
    	//Use scanner for obtaining primitive types like int,double,boolean,strings and etc.
    	Scanner scan = new Scanner(System.in);
    	Boolean isDone = false;
    	
    	//I input while loop to repeatedly execute a target statement as long as my condition is true
    	while(!isDone)
    	{
    		//I used string to not change the value
    		String word = scan.next();
    		if(!word.equals(":a"))
    		{
    			//I get the encode of the output and I used byte to save space in large arrays
    			byte[] encoded = Base64.getEncoder().encode((word + "\n").getBytes());
    			words.add(new String(encoded));
    		}
    		else
    		{
    			isDone = true;
    		}
    	}
    	//I write a character-oriented data to a file so that I used filewriter which helps for handling file
    	FileWriter fileko = new FileWriter("myfile.txt"); 
    	for(String b: words)
    	{
    		fileko.write(b);    
    	}
    	//I will closed the scanner which has been opened
      		fileko.close();  

    	
                   
       	
    }
}
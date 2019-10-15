import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Base64;

public class Decoder 
{
    //import IOException
    public static void main(String[] args)throws IOException
    	{
    	
    	//I create new file to initialize File Object	
    	Scanner scan = new Scanner(new File("myfile.txt"));
    	
    	
    	
		//I get the Decode of the output and I used byte to save space in large arrays
    	
    	byte[] decoded = Base64.getDecoder().decode(scan.next());
		System.out.println(new String(decoded));
       	
    	}
}


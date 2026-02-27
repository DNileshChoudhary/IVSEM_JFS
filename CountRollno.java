import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
class CountRollno
{
	public static void main(String args[])
	{
		try
		{
			int total = 0 , cse = 0 , aiml = 0 , ds = 0 , ece = 0 , it = 0 ;
			File file = new File("rollno.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String s = sc.nextLine();
				total++;
				String sub = s.substring(6,8);
				if(sub.equals("05"))	cse++;
				if(sub.equals("04"))	ece++;
				if(sub.equals("66"))	aiml++;
				if(sub.equals("67"))	ds++;
				if(sub.equals("12"))	it++;
			}
			System.out.print("Total rollno in file are : "+total+"\nCSE : "+cse+"\nAIML : "+aiml+"\nDS : "+ds+"\nECE : "+ece + "\nIT : "+it+"\nOthers : "+(total-cse-aiml-ds-it-ece));
		}
		catch(IOException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
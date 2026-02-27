import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

class ReadFile
{
	public static void main(String args[])
	{
		try
		{
			File file = new File("student.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String s = sc.nextLine();
				System.out.println(s);
			}
			sc.close();
			System.out.println("File Read Successfully...");
		}
		catch(IOException e )
		{
			System.out.println("An error occurred...");
			e.printStackTrace();
		}
	}
}
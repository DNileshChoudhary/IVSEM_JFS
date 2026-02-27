//write your name to a file.
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class WriteName
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		sc.close();
		try
		{
			FileWriter obj = new FileWriter("student.txt");
			obj.write(name);
			System.out.println("Hello my name is : "+name);
			obj.close();
			System.out.println("Name wirtten successfully.");
		}
		catch(IOException e)
		{
			System.out.println("An Error occurred...");
			e.printStackTrace();
		}
	}
}
//write your name to a file.
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class WritenName
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Names : ");
		int n = sc.nextInt();
		try
		{
			FileWriter obj = new FileWriter("student.txt");
			for(int i = 1 ; i<=n ; i++)
			{
				System.out.print("Enter the "+i+"th name : ");
				String name = sc.next();
				name=i+"	"+name+'\n';
				obj.write(name);	
			}
			System.out.println("All names written wirtten successfully.");
			sc.close();
			obj.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error occurred...");
			e.printStackTrace();
		}
	}
}
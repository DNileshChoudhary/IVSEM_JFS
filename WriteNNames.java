import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


class WriteNNames
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			FileWriter obj1 = new FileWriter("cse.txt");
			FileWriter obj2 = new FileWriter("it.txt");
			FileWriter obj3 = new FileWriter("aiml.txt");
			FileWriter obj4 = new FileWriter("ds.txt");
			FileWriter obj5 = new FileWriter("ece.txt");
			System.out.print("Enter the number of Rollnumbers : ");
			int n = sc.nextInt();	sc.nextLine();
			int j = 1 ;
			while(j<=n)
			{
				String rollnumber = sc.nextLine();
				String brCode = rollnumber.substring(6,8);
				if(brCode.equals("05"))		obj1.write(rollnumber+'\n');
				if(brCode.equals("12"))		obj2.write(rollnumber+'\n');
				if(brCode.equals("66"))		obj3.write(rollnumber+'\n');
				if(brCode.equals("67"))		obj4.write(rollnumber+'\n');
				if(brCode.equals("04"))		obj5.write(rollnumber+'\n');
				
				j++;
			}
			System.out.println("Written in File successfully..");
			sc.close();
			obj1.close();
			obj2.close();
			obj3.close();
			obj4.close();
			obj5.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occurred...");
			e.printStackTrace();
		}
	}
}
import java.util.Scanner;

public class EndOfFile 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int lines = 1;
		while (true)
		{
			String line = input.nextLine();
			System.out.println(lines + " " + line);
			lines++;
			if (!input.hasNext())
			{
				break;
			}
		}
		input.close();
	}
}
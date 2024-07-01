import java.util.Scanner;

public class critthinkweek4 {

	public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in))
			{
			
			double Total = 0, Max = Double.MIN_VALUE, Min = Double.MAX_VALUE, Value;
			int count = 0;

			while (count < 5) {
			    System.out.println("Enter a number:");
			    Value = sc.nextDouble();
			    Total += Value;
			    if (Value > Max) Max = Value;
			    if (Value < Min) Min = Value;
			    count++;
			}

			double Average = Total / 5;
			double Interest = Total * 0.2;

			System.out.println("Total Is: " + Total);
			System.out.println("Average Is: " + Average);
			System.out.println("Maximum Is: " + Max);
			System.out.println("Minimum Is: " + Min);
			System.out.println("Interest on total at 20% Is: " + Interest);
		}
	}
}
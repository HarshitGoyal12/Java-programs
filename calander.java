import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;
 
public class calander
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Month between 1 and 12 : ");
		int m = input.nextInt();
		System.out.print("Enter a Full Year : ");
		int y = input.nextInt();
		display_Month(y, m);
	}
 
	static void display_Month(int y, int m)
	{
		YearMonth ym = YearMonth.of(y, m);
		System.out.println("\n---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("---------------------------");
		int cou = 1;
		int day = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
		if (day != 7)
			for (int i = 0; i < day; i++, cou++)
			{
				System.out.printf("%-4s", "");
			}
 
		for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, cou++)
		{
			System.out.printf("%-4d", i);
			if (cou % 7 == 0)
			{
				System.out.println();
			}
		}		
		System.out.println("\n---------------------------");
    }
}
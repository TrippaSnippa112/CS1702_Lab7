import java.util.Date;
public class CS1702_Lab7 
{
	public static void main(String args[]) 
	{
		
		
	
		System.out.println("Q7.4.1");
		System.out.println(EvenOdd(8));
		
		System.out.println("Q7.4.2");
		System.out.println(reversedString("Bruno"));
		
		System.out.println("Q7.4.3");
		System.out.println(leapYear(2012));
	
		System.out.println("Q7.4.4");
		int toReverse = daysInMonth("January", 2019);
		System.out.println(toReverse);
		
		System.out.println("Q.7.4.6");
		Fib(10);
	
		System.out.println("Q.7.4.7");
		long fact = Fact(10);
		System.out.println(fact);
	
		System.out.println("Q.7.4.8");
		System.out.println(McCarthy(90));
	}
	
	public static boolean EvenOdd(long n) 
	{
		if ((n % 2) == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static String reversedString(String toReverse) {
		int i;
		String reversed = "";
		for (i = toReverse.length() - 1; i >= 0; i--) 
		{
			reversed = reversed + toReverse.charAt(i);
		}
		return reversed;
	}
	
	public static boolean leapYear(int year) 
	{
		if ((year % 4) == 0)
			return true;
		else {

			return false;
		}
	}
	
	public static int daysInMonth(String month, int year) {
		switch (month) {

		case "January":
			return 31;
		case "February":
			int days;
			if ((year % 4) == 0) {

			} else {
				days = 28;
				return days;
			}
			return 29;
		case "March":
			return 31;
		case "April":
			return 30;
		case "May":
			return 31;
		case "June":
			return 30;
		case "July":
			return 31;
		case "August":
			return 31;
		case "September":
			return 30;
		case "October":
			return 31;
		case "November":
			return 30;
		case "December":
			return 31;
		default:
			return 0;
		}
	}
	
	public static void Fib(int n) 
	{
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < n; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("\n");
	}
	
	public static long Fact(int n) 
	{
		if (n == 0)
			return 1;
		else
			return (n * Fact(n - 1));
	}
	
	
	
	public static int McCarthy(int x)
    {
        if (x>100)
            return x -10;
        else 
            return McCarthy(McCarthy(x+11));
    }

	
}
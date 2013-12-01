import java.util.Scanner;

public class combat {

	/**
	 * @param testname name of test
	 */
	public static int study(String testname) {
		// TODO Auto-generated method stub
		int grade = 0;
		Scanner input = new Scanner(System.in);

		System.out
				.println("How many hours would you like to study? (0-4 hours, whole numbers please)");
		String hours = input.nextLine();
		if (hours.equals("0")) {
			grade = (int) (Math.random() * 100) + 1;
			System.out.println("You get a grade of "+ grade + " on this " + testname);
		} else if (hours.equals("1")) {
			grade = (int) (Math.random() * 40) + 61;
			System.out.println("You get a grade of "+ grade + " on this " + testname);
		} else if (hours.equals("2")) {
			grade = (int) (Math.random() * 30) + 71;
			System.out.println("You get a grade of "+ grade + " on this " + testname);
		} else if (hours.equals("3")) {
			grade = (int) (Math.random() * 20) + 81;
			System.out.println("You get a grade of "+ grade + " on this " + testname);
		} else if (hours.equals("4")) {
			grade = (int) (Math.random() * 10) + 91;
			System.out.println("You get a grade of "+ grade + " on this " + testname);
		}else
		{
			System.out.println("PLEASE PUT A NUMBER BETWEEN 0-4");
		}
		if(grade >= 70)
		{
			return 1;
		}
		if(grade < 70)
		{
			return 0;
		}
		return 0;
	}

}

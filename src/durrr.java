import java.util.Scanner;

//Matthew Peak

public class durrr
{

	private static Pencil pencil;
	private static Calculator calc;
	private static combat combat;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String userinput2;
		System.out.println("Would you like to play a game? (y/n)");
		userinput2 = readinput();
		while(!userinput2.contains("n"))
		{
            System.out.println("Welcome To TechQuest!");
            System.out.println("Today you will begin your journey");
            System.out.println("through the wonderful world of university ");
            System.out.println("Please tell me your name");
            String name = readinput();
            System.out.println("Welcome " + name);
            System.out.println("Let us begin your story!");
            System.out.println();
			pencil = new Pencil();
			calc = new Calculator();
			System.out.println("You wake up in your college dorm room. You get dressed and ready for the day.");
			System.out.println("What do you want to do?");
			String userinput;
			userinput = readinput();
			while(!userinput.contains("continue"))
			{
				if(userinput.contains("look"))
				{
					System.out.println("You see a dresser and your desk with a laptop on it");
					System.out.println("Other then that, your room is boring and you are anxious to leave");

					System.out.println("What do you do now?");

				}
				if(userinput.contains("find"))
				{
					System.out.println("You find a pencil and a calculator");
					pencil.pencilIncrease();
					calc.calcIncrease();

					System.out.println("What do you do now?");
				}
				if(userinput.contains("print") || userinput.contains("inventory"))
				{
					PrintInventory(pencil, calc);

				}
				if(!userinput.contains("look") && !userinput.contains("find") && !userinput.contains("print") && !userinput.contains("inventory"))
				{
					System.out.println("Sorry, I do not understand that command, please try another");
				}
				userinput = readinput();
			}
			System.out.println("As you leave your room, you head to your first class, an engineering class!");
			System.out.println("Your teacher goes over the syllabus and what assignments there will be: 1 pop quiz," +
					"1 test, and 1 final.");
			System.out.println("As your teacher finishes the syllabus, she decides to give a pop quiz based on what" +
					" she just went over. You can take it home or spend the time there.");
			int grade = combat.study("pop quiz");
			if(grade == 0)
			{
				System.out.println("You are very upset that you failed your first quiz. This isnt a good start");
			}
			if(grade == 1)
			{
				System.out.println("You are confident in your abilities to listen to the teacher as you pass your quiz");
			}
			System.out.println("After the quiz, you have time to look around the room. Do you look around?");
			userinput = readinput();
			while(!userinput.contains("continue"))
			{
				if(userinput.contains("look"))
				{
					System.out.println("You see rows and rows of desks. Most of the students have left, while some" +
							"are introducing themselves to the teacher");
				}
				if(userinput.contains("find"))
				{
					System.out.println("You find one pencil and some lint under a desk, you keep the pencil.");
					pencil.pencilIncrease();

					System.out.println("What do you do now?");

				}
				if(userinput.contains("print") || userinput.contains("inventory"))
				{
					PrintInventory(pencil, calc);

					System.out.println("What do you do now?");
				}
				if(!userinput.contains("look") && !userinput.contains("find") && !userinput.contains("print") && !userinput.contains("inventory"))
				{
					System.out.println("Sorry, I do not understand that command, please try another");
				}

				userinput = readinput();

			}
			System.out.println("You now leave the building, and head to the FieldDrill. A massive circle in the center of" +
					" campus. After walking around a little bit you head back to your room to prepare for your other classes" +
					"As you head back, you calmly reflect that you are going to enjoy college!");
			System.out.println();
			System.out.println("A few weeks pass. Your classes are going slowly but they are going. Engineering is currently" +
					" your biggest worry. Hopefully you can pass this class.");
			System.out.println("As you sit in class, you hear your teacher mention your first test is tomorrow! You have to prepare!");
			System.out.println("Once class is over, you head out and walk around outside, deciding on how to study for this test.");
			System.out.println("What do you do while you are outside?");
			userinput = readinput();
			while(!userinput.contains("continue"))
			{
				if(userinput.contains("look"))
				{
					System.out.println("You see the amazing architecture of your college campus, and realize this is much better" +
							" then seeing a bunch of bricks and pillars all over the place");
					System.out.println("What do you do now?");
				}
				if(userinput.contains("find"))
				{
					System.out.println("Oddly enough, you find a calculator on the ground and decide to keep it.");
					calc.calcIncrease();
					System.out.println("What do you do now?");
				}
				if(!userinput.contains("look") && !userinput.contains("find") && !userinput.contains("print") && !userinput.contains("inventory"))
				{
					System.out.println("Sorry, I do not understand that command, please try another");
				}

				userinput = readinput();
			}
			System.out.println("The next day.");
			System.out.println();
			System.out.println("You wake up and head over to your engineering exam, pumped to do this.");
			System.out.println("Once you get into the exam block you see a ton of people that you have never seen before. Where did they all come from??");
			grade = combat.study("Test");
			if(grade == 0)
			{
				System.out.println("You are very upset that you failed your test, this is not good");
			}
			if(grade == 1)
			{
				System.out.println("You are confident in your abilities in this class. You will do just fine!");
			}
			System.out.println("After the exam, you head to the Donuts Dunking that reciently opened up on campus to get a donut.");
			System.out.println("You are now waiting in line. What do you do while you wait?");
			userinput = readinput();
			while(!userinput.contains("continue"))
			{
				if(userinput.contains("look"))
				{
					System.out.println("You see a bunch of starving college kids who have been standing in line for days.");
					System.out.println("Maybe this line isnt the best idea");
					System.out.println("What do you do now?");

				}
				if(userinput.contains("find"))
				{
					System.out.println("You see a pencil just lying on the windowsill, you decide to grab it and take it.");
					pencil.pencilIncrease();
					System.out.println("What do you do now?");
				}
				if(!userinput.contains("look") && !userinput.contains("find") && !userinput.contains("print") && !userinput.contains("inventory"))
				{
					System.out.println("Sorry, I do not understand that command, please try another");
				}

				userinput = readinput();
			}
			System.out.println("Three weeks pass");
			System.out.println();
			System.out.println("It is now final exam week, you have worked hard to get here, and hopefully you will pass your classes!");
			System.out.println("It is also the night before your engineering final exam, when your friend calls you up.");
			System.out.println("He invites you to a party that starts in an hour. He says that there will be lots of people, and pleny of alcohol");
			System.out.println("But you know that you should study. Do you go and possibly have the best night of your life? Or do you stay and study?");
			userinput = readinput();
			int cont = 3;
			while(cont != 1)
			{
				if(userinput.contains("stay"))
				{
					System.out.println("You decide to stay in and study. You know your grade will be better.");
					System.out.println("Your chances of passing the Final increase by 25%");
					cont = 1;
				}
				if(userinput.contains("go"))
				{
					System.out.println("You decide to go to the party. You end up drinking so much that you dont remember if" +
							" it really was the best night of your life, but your sure enjoyed it.");
					System.out.println("Your chances of passing the Final decrease by 25%");
					cont = 1;
				}

			}
			System.out.println("It is now the morning of the exam, and you head to the exam and sit down.");
			System.out.println("As the teacher hands you your exam, you know that this will decide your fate at TechQuest!");
			int finalexam = 4;
			finalexam = combat.study("Final Exam");
			if(finalexam == 1)
			{
				System.out.println("Congratulations!! You have passed your Engineering Class! More classes will be coming soon!");
			}
			if(finalexam == 0)
			{
				System.out.println("Unfortunatly you did not pass your Engineering Class. Maybe next time you will study more.");
			}
			System.out.println("Thank you for playing TechQuest. Would you like to play again?");
			userinput2 = readinput();
		// TODO Auto-generated method stub
		}
	}


	public static String readinput()
	{
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();

		return input;
	}

    public static void PrintInventory(Pencil pencil2, Calculator calc2)
    {
        System.out.println("NUMBER OF PENCILS  :  " + pencil2.returnPencil());


        System.out.println("NUMBER OF CALCULATORS :  "
            + calc2.returnCalc());
     }



}


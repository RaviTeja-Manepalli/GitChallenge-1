package client;

import java.util.Scanner;
import service.Validations;
import service.MuseumOperations;
import entity.Visitor;

public class MuseumApp {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		MuseumOperations museumOperations = new MuseumOperations();
		Visitor[] visitor = null;
		int a = 0;
		do {
			System.out.println("1. Enter visitor details");
			System.out.println("2. Display no of visitors on particular date");
			System.out.println("3. Fetch visitors count with in age range");
			System.out.println("4. Fetch female to male ratio");
			System.out.println("5. Total money earned");
			
			System.out.println("6. Exit");
			System.out.println("Enter ur choice");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("No of visitors");
				int noofVisitors = sc.nextInt();
				visitor = new Visitor[noofVisitors];

				visitor = museumOperations.visitorDetails(visitor);

				break;
			case 2:
				if (visitor != null)
					System.out.println(museumOperations.countVisitors(visitor));
				else
					System.out.println("No visitor detAILS");
				break;
			case 3:
				if (visitor != null)
					System.out.println(museumOperations.countVisitorAgeRange(visitor));
				else
					System.out.println("No visitor detAILS");
				break;
			case 4:
				if (visitor != null)
					museumOperations.ratioMF(visitor);
				else
					System.out.println("No visitor detAILS");
				break;
			case 5:
				if (visitor != null)
					System.out.println(museumOperations.moneyEarned(visitor));
				else
					System.out.println("No visitor detAILS");
				break;
			case 6:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Invalid option");
			}

		} while (a != 6);
		System.out.println("The End ");
	}

}

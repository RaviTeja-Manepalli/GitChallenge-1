package service;

import entity.Visitor;

public class MuseumOperations {
	Validations valid = new Validations();

	public double moneyEarned(Visitor[] visitor) {
		// TODO Auto-generated method stub
		double amount = 0;
		for (int i = 0; i < visitor.length; i++) {
			if (visitor[i] != null) {
				if (visitor[i].getAge() >= 5 && visitor[i].getAge() < 18)
					amount = amount + 10;
				else if (visitor[i].getAge() >= 18 && visitor[i].getAge() <= 60)
					amount = amount + 20;
				else if (visitor[i].getAge() >= 0 && visitor[i].getAge() < 5)
					amount = amount + 0;
				else
					amount = amount + 5;

			}
		}
		return amount;
	}

	public void ratioMF(Visitor[] visitor) {
		// TODO Auto-generated method stub
		int m = 0, f = 0;
		for (int i = 0; i < visitor.length; i++) {
			if (visitor[i] != null) {
				if (visitor[i].getGender().compareTo("M") == 0) {
					m++;
				} else
					f++;
			}
		}
		int a = gcd(m, f);
		System.out.println("Ratio of Male female is  " + m / a + " : " + f / a);

	}

	public int gcd(int m, int f) {
		// TODO Auto-generated method stub
		if (f == 0)
			return m;
		return gcd(f, m % f);
	}

	public int countVisitorAgeRange(Visitor[] visitor) {
		// TODO Auto-generated method stub
		System.out.println("Enter age range");
		int k = 0;
		System.out.println("Enter lower value");
		int low = valid.integerValidation();
		System.out.println("Enter higher value");
		int high = valid.integerValidation();
		if(high>low)
		for (int i = 0; i < visitor.length; i++) {
			if (visitor[i] != null && (visitor[i].getAge() > low && visitor[i].getAge() < high))
				k++;
		}
		return k;

	}

	public int countVisitors(Visitor[] visitor) {
		int k = 0;

		System.out.println("enter date");
		String date = valid.dateValidation();
		for (int i = 0; i < visitor.length; i++) {
			if (visitor[i].getDate().compareTo(date) == 0)
				k++;
		}
		return k;
		// TODO Auto-generated method stub

	}

	public Visitor[] visitorDetails(Visitor[] visitor) {
		// TODO Auto-generated method stub
		System.out.println("Enter visitor details");
		String gender = null;
		for (int i = 0; i < visitor.length; i++) {
			System.out.println("Enter details for visitor " + (i + 1));
			System.out.println("Enter age");
			int age = valid.ageValidation();
			System.out.println("Enter name");
			String name = valid.validinput();
			System.out.println("Enter gender");
			gender = valid.genderValidation();
			System.out.println("Enter date");
			String date = valid.dateValidation();
			visitor[i] = new Visitor(age, gender, name, date);
		}
		return visitor;

	}

}

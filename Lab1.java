package edu.monmouth.lab1;

public class Lab1 {

	public static void main(String[] args) {
		// Problem 2 lab 1 
		System.out.println("Problem 2");
		
	    // Person class using the default constructor 
		Person person1 = new Person();
		System.out.println(person1.getName());
		System.out.println(person1.isNameLong());

		Person person2 = new Person("Rolf");
		System.out.println(person2.getName());
		System.out.println(person2.isNameLong());

		Person person3 = new Person("Ebenezer");
		System.out.println(person3.getName());
		System.out.println(person3.isNameLong());

		Person person4 = new Person("Alexander");
		System.out.println(person4.getName());
		System.out.println(person4.isNameLong());

		Person person5 = new Person(null);
		System.out.println(person5.getName());
		System.out.println(person5.isNameLong());

		Person person6 = new Person("");
		System.out.println(person6.getName());
		System.out.println(person6.isNameLong());
		
		//Problem 3 
		System.out.println("PROBLEM 3");
		
		//Giving the String value
		String value = new String("Monmouth University");

	    System.out.println(value.length());

		System.out.println(value.charAt(0));

		System.out.println(value.charAt(value.length() - 1));

		char third = value.charAt(2);

		if (third >= 'A' && third <= 'Z') {
		   System.out.println("true");
		} else {
		    System.out.println("false");
		}

		char tenth = value.charAt(9);

		if (tenth >= '0' && tenth <= '9') {
		   System.out.println("digit");
		} else {
		   System.out.println("letter");
		}
		
		// Problem 4 
        System.out.println("PROBLEM 4");

        int sum = 0;

        for (int number = 6; number <= 14; number++) {
            if (number % 2 != 0) {
                sum = sum + number;
            }
        }

        System.out.println("Sum: " + sum);

        //Problem 5 
        System.out.println("PROBLEM 5");

        String backwards = new String("devlos melborp");

        for (int i = backwards.length() - 1; i >= 0; i--) {
            System.out.println(backwards.charAt(i));
        }
    }
}






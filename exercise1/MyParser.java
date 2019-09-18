package com.ge.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyParser implements Parser {
	//private static final Logger logger = (Logger) LogManager.getLogger(MyParser.class);

	int id;
	String name;
	String group;
	@SuppressWarnings("rawtypes")
	static ArrayList al = new ArrayList();
	static int count = 0; // to track the no. of User

	MyParser() {
	}

	// constructor for initializing Parsing objects

	MyParser(int id, String name, String group) {
		this.id = id;
		this.name = name;
		this.group = group;
		count++;
	}

	// method to store User details in an arraylist

	@SuppressWarnings("unchecked")
	public void putDetails(MyParser e) {
		al.add(e);
	}

	// method to retreive user objects

	public MyParser getDetails(int id) {
		MyParser es = (MyParser) al.get(id);
		return es;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MyParser e = new MyParser();
		MyParser e1 = new MyParser(1, "Beth Jones", "Project Owner");
		MyParser e2 = new MyParser(2, "GEM", "GL");

		e.putDetails(e1);
		e.putDetails(e2);

		System.out.println("The total number of User are: " + count);
		System.out.println(" ");

		while (true) {
			System.out.println("Enter User id to get the User details: ");
			int id = Integer.parseInt(br.readLine());
			boolean flag = false;

			for (int i = 0; i <= i; i++) {
				MyParser es = e1.getDetails(i);
				if (id == es.id) {
					System.out.println("The details of the User with id " + id + " is: ");
					System.out.print(es.id + " " + es.name + " " + es.group);
					flag = true;
					break;
				}
			}

			System.out.println(" ");

			if (!flag) {
				System.out.println("Sorry, no data exists with the id " + id);
			}
			System.out.println(" ");
			String ch = null;

			while (true) {
				System.out.println("Want to Continue(y/n)?)");
				System.out.println(" ");
				ch = br.readLine();
				if (ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n"))
					break;
				if (!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n"))) {
					System.out.println("Invalid option : please type y/n");
					System.out.println(" ");
				}
			}

			if (ch.equalsIgnoreCase("n")) {
				System.out.println(" ");
				System.out.println("Thank you");
				break;
			}
		}
	}

	@Override
	public Application parseApplicationData(String data) {

		return null;
	}
}

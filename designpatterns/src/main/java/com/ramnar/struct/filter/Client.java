package com.ramnar.struct.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("ram", "male");
		Person p2 = new Person("rani", "female");
		Person p3 = new Person("raju", "male");
		Person p4 = new Person("rekha", "female");
		Person p5 = new Person("ramanujan", "male");
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);

		System.out.println(new CriteriaFemale().meetCriteria(people));

		System.out.println(new CriteriaMale().meetCriteria(people));

	}

}

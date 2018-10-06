package com.ramnar.struct.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ceo = new Employee("Ram", "ceo");
		Employee headSales = new Employee("vikas", "Head sales");
		Employee salesPerson1 = new Employee("shiva", "sales");
		Employee salesPerson2 = new Employee("ravi", "sales");
		
		ceo.add(headSales);
		headSales.add(salesPerson2);
		headSales.add(salesPerson1);
		System.out.println(ceo);
		for(Employee e : ceo.getSubordinates()) {
			System.out.println(e);
			for(Employee g : e.getSubordinates()) {
				System.out.println(g);
			}
		}

	}

}

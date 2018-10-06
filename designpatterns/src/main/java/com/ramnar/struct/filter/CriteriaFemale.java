package com.ramnar.struct.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements ICriteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if("female".equalsIgnoreCase(person.getGender())) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
	

}

package com.ramnar.behaviour.iterator;

public class MContainer implements IContainer {
	
	public String names[] = {"ram", "rahul", "vishal", "karan"};

	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{

		int index; 
		
		public boolean hasNext() {

	         if(index < names.length){
	            return true;
	         }
	         return false;
		}

		public Object next() {
			if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
		}
		
	}

}

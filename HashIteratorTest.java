package com.acadglid.java.core.session8.assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashIteratorTest {
	private static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet=new HashSet<String>();
		System.out.println("enter the size of elements of HashSet object");
		int size=s.nextInt();
		addElements(hashSet, size); // here we making a call to static method to add elements to HashSet object
		printHashSetElements(hashSet); // here we making a call to static method to print the elements of hashSet object, passing the object as a parameter
		
		
	}
	// method to add elements to the HashSet object
	static HashSet<String> addElements( HashSet<String> hashSet, int size){
		for(int i=0;i<size;i++){
			System.out.println("enter the string value for "+i);
			hashSet.add(s.next());
		}
		return hashSet;
	}
	//method to print the elements of hashSet
	static void printHashSetElements(HashSet<String> hashSet){
		Iterator<String> itr=hashSet.iterator();// usage of iterator() method of java.util.HashSet.iterator() method
		while(itr.hasNext()){
			System.out.println("the value is : "+ itr.next());
		}
	}

}

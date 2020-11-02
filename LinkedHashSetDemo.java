package com.set;

	import java.util.LinkedHashSet;
	import java.util.Iterator;


	public class LinkedHashSetDemo {

		public static void main(String[] args) {
			LinkedHashSet<String> lhs =new LinkedHashSet<>();
			lhs.add("Akhilesh");
			lhs.add("Mahesh");
			lhs.add("Balram");
			lhs.add("Abhishek");
			lhs.add("Nitin");
			lhs.add("Anil");
			lhs.add("Balu");
			System.out.println(lhs);	
			Iterator<String> i=lhs.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+lhs.isEmpty());
			System.out.println(lhs.contains("Balram"));
			lhs.clear();
			System.out.println("\n"+lhs.isEmpty());
			System.out.println(lhs.removeAll(lhs));
		}

	}



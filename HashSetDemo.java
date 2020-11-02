package com.set;


	import java.util.Iterator;
	import java.util.HashSet;

	public class HashSetDemo {

		public static void main(String[] args) {
			HashSet<String> hs=new HashSet<>();
			hs.add("Akhilesh");
			hs.add("Mahesh");
			hs.add("Balram");
			hs.add("Abhishek");
			hs.add("Anil");
			hs.add("Nitin");
			hs.add("Balu");
			System.out.println(hs);	
			System.out.println(hs.size());
			Iterator<String> i=hs.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+hs.isEmpty());
			System.out.println(hs.contains("Balram"));
			hs.clear();
			System.out.println("\n"+hs.isEmpty());
			System.out.println(hs.removeAll(hs));

		}

	}


package com.set;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
		public static void main(String[] args) {
			TreeSet<String> ts=new TreeSet<>();
			ts.add("Akhilesh");
			ts.add("Mahesh");
			ts.add("Balram");
			ts.add("Anil");
			ts.add("Ajay");
			ts.add("Nikhil");
			ts.add("Sunil");
			System.out.println(ts);	
			System.out.println(ts.first());
			System.out.println(ts.last());
			System.out.println(ts.lower("Mahesh"));
			System.out.println(ts.higher("Mahesh"));
			System.out.println(ts.size());
			System.out.println(ts.pollFirst());
			System.out.println(ts.pollLast());
			Iterator<String> i=ts.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+ts.isEmpty());
			System.out.println(ts.contains("Balram"));
			ts.clear();
			System.out.println("\n"+ts.isEmpty());
			System.out.println(ts.removeAll(ts));

		}

}

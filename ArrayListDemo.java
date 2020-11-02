package com.list;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArrayListDemo {

		public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<>();
			al.add("Akhilesh");
			al.add("Mahesh");
			al.add("Balram");
			al.add("Abhishek");
			al.add("Nitin");
			al.add("Balu");
			System.out.println(al);
			System.out.println(al.get(3));
			al.set(4, "jayant");
			System.out.println(al);
			System.out.println(al.size());
			al.remove(5);
			Iterator<String> i=al.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+al.isEmpty());
			System.out.println(al.contains("Balram"));
			System.out.println(al.indexOf("Abhishek"));
			al.clear();
			System.out.println("\n"+al.isEmpty());
			System.out.println(al.removeAll(al));
		}

	}



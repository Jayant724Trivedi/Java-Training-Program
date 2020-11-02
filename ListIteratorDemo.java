package com.iterator;
	import java.util.ListIterator;
	import java.util.LinkedList;

	public class ListIteratorDemo {

		public static void main(String[] args) {
			LinkedList<String> ll=new LinkedList<>();
			ll.add("Akhilesh");
			ll.add("Mahesh");
			ll.add("Balram");
			ll.add("Abhishek");
			ll.add("Nitin");
			ll.add("Balu");
			ll.addFirst("jayant");
			ll.addLast("Ram");
			ListIterator<String> li=ll.listIterator();
			while(li.hasNext()) {
				System.out.print(li.next()+" ");
			}
			System.out.println("\n==========================");
			while(li.hasPrevious()) {
				System.out.print(li.previous()+" ");
			}
			System.out.println("\n==========================");
					
		}

	}




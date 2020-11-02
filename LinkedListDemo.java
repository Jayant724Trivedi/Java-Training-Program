package com.list;

	import java.util.LinkedList;
	import java.util.Iterator;

	public class LinkedListDemo {

		public static void main(String[] args) {
			LinkedList<String> ll=new LinkedList<>();
			ll.add("Akhilesh");
			ll.add("Mahesh");
			ll.add("Balram");
			ll.add("Abhishek");
			ll.add("Nitin");
			ll.add("Sunil");
			ll.addFirst("Ram");
			ll.addLast("Mohan");
			System.out.println(ll);
			System.out.println(ll.get(3));
			System.out.println(ll.getLast());
			ll.removeFirst();
			ll.removeLast();
			ll.set(4, "Srinivas");
			System.out.println(ll);
			System.out.println(ll.size());
			System.out.println(ll.peek());
			System.out.println(ll.poll());
			Iterator<String> i=ll.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+ll.isEmpty());
			System.out.println(ll.contains("Balram"));
			System.out.println(ll.indexOf("Abhishek"));
			ll.clear();
			System.out.println("\n"+ll.isEmpty());
			System.out.println(ll.removeAll(ll));
		}

	}



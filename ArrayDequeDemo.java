package com.queue;

	import java.util.Iterator;
	import java.util.ArrayDeque;

	public class ArrayDequeDemo {

		public static void main(String[] args) {
			ArrayDeque<String> ad=new ArrayDeque<>();
			ad.add("Akhilesh");
			ad.add("Mahesh");
			ad.add("Balram");
			ad.add("Abhishek");
			ad.add("Nitin");
			ad.add("Balu");
			System.out.println(ad);
			System.out.println(ad);
			System.out.println(ad.size());
			ad.remove(5);
			System.out.println(ad.peek());
			System.out.println(ad.poll());
			Iterator<String> i=ad.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+ad.isEmpty());
			System.out.println(ad.contains("Balram"));
			ad.clear();
			System.out.println("\n"+ad.isEmpty());
			System.out.println(ad.removeAll(ad));

		}


}

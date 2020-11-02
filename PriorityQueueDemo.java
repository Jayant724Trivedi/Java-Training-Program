package com.queue;

	import java.util.Iterator;
	import java.util.PriorityQueue;

	public class PriorityQueueDemo{

		public static void main(String[] args) {
			PriorityQueue<String> pq=new PriorityQueue<>();
			pq.add("Mahesh");
			pq.add("Balram");
			pq.add("Anil");
			pq.add("Nilesh");
			pq.add("Sunny");
			System.out.println(pq);
			System.out.println(pq);
			System.out.println(pq.size());
			pq.remove(5);
			System.out.println(pq.peek());
			System.out.println(pq.poll());
			Iterator<String> i=pq.iterator();
			while (i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println("\n"+pq.isEmpty());
			System.out.println(pq.contains("Balram"));
			pq.clear();
			System.out.println("\n"+pq.isEmpty());
			System.out.println(pq.removeAll(pq));
		}

	}



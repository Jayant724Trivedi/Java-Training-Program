package com.map;
	import java.util.HashMap;

	public class HashMapDemo {

		public static void main(String[] args) {
			HashMap<Integer,String> hm = new HashMap<>();
			hm.put(1,"Akhilesh");
			hm.put(2,"Mahesh");
			hm.put(3,"Balram");
			hm.put(4,"Abhishek");
			hm.put(5,"Anil");
			hm.put(6,"Nitin");
			hm.put(7,"Balu");
			System.out.println(hm);
			System.out.println(hm.size());
			System.out.println("\n"+hm.isEmpty());
			System.out.println(hm.containsValue("Akhilesh"));
			hm.replace(4, "Abhishek", "Ram");
			System.out.println(hm);
			hm.clear();
		}

	}


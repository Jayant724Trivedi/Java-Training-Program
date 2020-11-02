package com.map;

	import java.util.LinkedHashMap;

	public class LinkedHashMapDemo {
		public static void main(String[] args) {
			LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
			lhm.put(1,"Akhilesh");
			lhm.put(2,"Mahesh");
			lhm.put(3,"Balram");
			lhm.put(4,"Abhishek");
			lhm.put(5,"Anil");
			lhm.put(6,"Nitin");
			lhm.put(7,"Balu");
			System.out.println(lhm);
			System.out.println(lhm.size());
			System.out.println("\n"+lhm.isEmpty());
			System.out.println(lhm.containsKey(2));
			System.out.println(lhm.containsValue("Akhilesh"));
			lhm.replace(4, "Abhishek", "Pawan");
			System.out.println(lhm);
			lhm.clear();
		}
	}



package com.map;
import java.util.TreeMap;

public class TreeMapDemo {

		public static void main(String[] args) {
			TreeMap<Integer,String> tm = new TreeMap<>();
			tm.put(101,"Akhilesh");
			tm.put(102,"Manav");
			tm.put(103,"Balram");
			tm.put(104,"Abhishek");
			tm.put(105,"Rahul");
			tm.put(106,"Nikhil");
			tm.put(107,"Ajay");
			System.out.println(tm);
			System.out.println(tm.size());
			System.out.println("\n"+tm.isEmpty());
			System.out.println(tm.containsKey(2));
			System.out.println(tm.containsValue("Akhilesh"));
			tm.replace(4, "Abhishek", "Anmol");
			System.out.println(tm);
			System.out.println(tm.subMap(2,false, 5,true));
			System.out.println(tm.headMap(3,true));
			System.out.println(tm.tailMap(4,false));
			tm.clear();
		}
	}



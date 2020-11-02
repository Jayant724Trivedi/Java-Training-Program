package com.list;
import java.util.Enumeration;
import java.util.Vector;


public class VectorDemo1 {
		public static void main(String[] args) {
			Vector<String> v=new Vector<>();
			v.add("jayant");
			v.add("Mahesh");
			v.add("rahul");
			v.add("nitin");
			v.add("akshay");
			v.add("Bunny");
			System.out.println(v);
			System.out.println(v.get(3));
			System.out.println(v.firstElement());
			System.out.println(v.lastElement());
			v.set(4, "nitin");
			v.insertElementAt("jay", 5);
			System.out.println(v);
			System.out.println(v.size());
			v.remove(3);
			Enumeration<String> i=v.elements();
			while (i.hasMoreElements()) {
				System.out.print(i.nextElement()+" ");
			}
			System.out.println("\n" +v.isEmpty());
			System.out.println(v.contains("akshay"));
			System.out.println(v.indexOf("rahul"));
			v.clear();
			System.out.println("\n"+v.isEmpty());
			System.out.println(v.removeAll(v));
		}
	}



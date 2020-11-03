package com.anonymous;
	abstract class Person{
		abstract void eat();
	}
	public class PublicAnonymousClass {

		public static void main(String[] args) {
			new Person() {
				void eat() {
					System.out.println("Eating ice cream");
				}
			}.eat();

		}

	}



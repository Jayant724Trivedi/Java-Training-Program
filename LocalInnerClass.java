package com.localinnerclass;
	class Apple{
		void announcement() {
			System.out.println("New model release from 1 Dec");
			class Model{
				void newFeatures() {
					System.out.println("new model with new Features");
				}
			}
			Model iphone12pro=new Model();
			iphone12pro.newFeatures();
		}
		
	}
	public class LocalInnerClass {

		public static void main(String[] args) {
			Apple a=new Apple();
			a.announcement();

		}

	}



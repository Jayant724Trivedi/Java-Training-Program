package com.staticnestedclass;
	class Nokia {

		static class Model {
			void announcement() {
					System.out.println("New model release from 1 Dec");
			}
			static void newFeatures() {
				System.out.println("new model with new Features");
			}
		}

	}

	public class StaticInnerClass {

		public static void main(String[] args) {
			Nokia.Model n=new Nokia.Model();
			n.announcement();
			Nokia.Model.newFeatures();

		}

	}



package com.memberinnerclass;
	class Samsung{
		void announcement() {
			System.out.println("New model release from 1 Dec");
			Model galaxyM31=new Model();
			galaxyM31.newFeatures();
		}
		class Model{
			void newFeatures() {
				System.out.println("new model with new Features");
			}
		}
	}
	public class MemberInnerClass{

		public static void main(String[] args) {
			Samsung s=new Samsung();
			s.announcement();

		}

	}



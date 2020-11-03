package com.localinnerclass;
	class University{
		void announcement() {
			System.out.println("Exams results declared");
			class Department{
				void examPapers() {
					System.out.println("To chek result on website");
				}
			}
			Department d=new Department();
			d.examPapers();
		}
		
	}

	public class UniversityLocalInner {

		public static void main(String[] args) {
			University jntu=new University();
			jntu.announcement();
		}

	}



package com.anonymous;
	abstract class Mobile {
		abstract void cost();

		abstract void ram();

		abstract void rom();

		abstract void camera_pexcel();

		void open() {
			System.out.println("open with power botton");
		}
	}

	public class AnonymousInnerClass {

		public static void main(String[] args) {
			Mobile m = new Mobile() {

				void cost() {
					System.out.println("Prize of Samsung is: 17000");
				}

				void ram() {
					System.out.println("Ram of Samsung is: 8GB");
				}

				void rom() {
					System.out.println("Rom of Samsung is: 128GB");
				}

				void camera_pexcel() {
					System.out.println("camera_pexcel of Samsung is: 64px");
				}

			};
			m.cost();
			m.camera_pexcel();
			m.rom();
			m.ram();
			m.open();

		}

	}



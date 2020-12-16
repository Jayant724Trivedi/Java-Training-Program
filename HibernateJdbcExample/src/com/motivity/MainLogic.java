package com.motivity;

import java.util.Scanner;

public class MainLogic {

	public static void main(String[] args) throws Exception {
			Scanner sc=new Scanner(System.in);
			int choice=0;
			do {
					System.out.println("Select your option\n 1.Insert\n 2. Display\n 3.Update\n 4. Delete\n 5. Exit");
					choice=sc.nextInt();
					if(choice==1) {
							OperationInsert.insert();
					} else if(choice==2) {
							OperationDisplay.display();
					} else if(choice==3) {
							OperationUpdate.update();
					} else if(choice==4) {
							OperationDelete.delete();
					}
			} while(choice!=5);
	}
}

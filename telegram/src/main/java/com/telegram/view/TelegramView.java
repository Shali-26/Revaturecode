package com.telegram.view;

import java.util.Scanner;

import com.telegram.controller.TelegramControllerInterface;



public class TelegramView {

	public static void main(String[] args) {
		System.out.println("***************MAIN MENU****************");
		System.out.println("enter a choice");
		System.out.println("press 1 login");
		System.out.println("press 2 for profile");
		System.out.println("press3  for delete");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		TelegramControllerInterface te=new TelegramController();
		
		
		switch(a) {
		case 1: te.createController();
		     break;
		case 2: te.deleteController();
			break;
		case 3 : te.editController();
			break;
			default: System.out.println("invalid");
				}
			

	}

}

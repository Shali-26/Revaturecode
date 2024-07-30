package com.facebook.view;

import java.util.Scanner;

public class FacebookView {

	public static void main(String[] args) {
		
		System.out.println("press 1 enter your profile");
		System.out.println("press 2 for profile");
		System.out.println("press 3 profile");
		System.out.println("press 4 profile");
		System.out.println("press 5 profile");
		System.out.println("press 6 profile");
		System.out.println("press 7 profile");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a choice");
		int a = sc.nextInt();
		FacebookControllerInterface fc =new FacebookController();
		switch(a) {
		case 1:  fc.createProfileController();
			break;
		case 2:   fc.viewProfileController();
			break;
		case 3:  fc.deleteProfileController();
			break;
		case 4:  fc.editProfileController();
			break;
		case 5: fc.viewAllProfileController();
			break;
		case 6: fc.loginProfileController();
			break;
		case 7: fc.detailsProfileController();
			break;
		default:
			break;	
		}

	}

}

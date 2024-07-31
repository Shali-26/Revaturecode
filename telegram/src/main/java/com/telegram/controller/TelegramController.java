package com.telegram.controller;

import java.util.Scanner;

import com.telegram.entity.TelegramUser;
import com.telegram.service.TelegramService;
import com.telegram.service.TelegramServiceInterface;


public class TelegramController implements TelegramControllerInterface {

	@Override
	public void createController() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setName(name);
		tu.setEmail(email);
		tu.setAddress(address);
		
		TelegramServiceInterface ts = new TelegramService();
		int i = ts.createProfile(tu);
		if(i>0) {
			System.out.println("profile created");
		}else {
			System.out.println("not created");
		}

	}

	@Override
	public void deleteController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editController() {
		// TODO Auto-generated method stub

	}

}

package com.hand;

import java.util.Scanner;

import com.hand.AOP.TransactionTool;
import com.hand.Util.SpringBeanFactory;
import com.hand.db.Film;;
public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TransactionTool tt=SpringBeanFactory.getBeanFactory().getBean("transactionTool",TransactionTool.class);
		Film aim = new Film();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 电影名(title):");
		String input = sc.nextLine();
		aim.setTitle(input);
		System.out.println("请输入电影描述(description):");
		input = sc.nextLine();
		aim.setDescription(input);;
		System.out.println("请输入 语言ID(language_id):");
		input = sc.nextLine();
		aim.setLanguage_id(input);
	
		
	}
	public void init(){
		System.out.println("Context Start");
		}
		public void destroy(){
		System.out.println("Context Stop");
		}
}
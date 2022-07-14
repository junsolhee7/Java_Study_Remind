package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {

		// 프로그램 생각
		// 현실 -> digital
		// 음식 주문, 옷 쇼핑몰, 커피 로봇, 이력서
		// Java
		// Data, Function
		// 이력서 : 이름, 전화번호, 나이, 주소 
		
		Resume r = new Resume();
		// r = new Resume(); // 한종이에 덮어쓰기 
		Resume r2 = new Resume();
		r.name="iu";
		r2.name="suji";
		
		Check check = new Check();
		
		check.resumeCut(r);
		check.resumeCut(r2);
		
		

	}

}

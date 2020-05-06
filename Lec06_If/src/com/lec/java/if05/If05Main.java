package com.lec.java.if05;

/* 중첩된 if (nested-if) 문
 *   조건문 안의 조건문
 */
public class If05Main {

	public static void main(String[] args) {
		System.out.println("중첩된 if (nested-if) 문");
		
		int num=98;
		
		if (num%2==0) {
			System.out.println("짝수");
			if(num%4==0){
				System.out.println("4의배수");
			}else {
				System.out.println("짝수이긴하지만 4의배수는 아니다.");
			}
		} else {
			System.out.println("홀수");
			if (num%3==0) {
				System.out.println("3의배수");
			} else {
				System.out.println("홀수이지만3의배수는 아닙니다.");
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










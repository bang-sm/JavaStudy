package com.lec.java.if07;

/* String 비교, char 비교
 * - 문자열 비교는 절대로 == 를 사용하지 말자
 * - 문자열 비교는 equals(), equalsIgnoreCase() 사용!
 * 
 * - char 는 기본적으로 정수값 (아스키 코드값) 이라 일반 산술 비교 가능 
 */

public class If07Main {

	public static void main(String[] args) {
		System.out.println("String 비교, char 비교");
	
		String str1="john";
		String str2="john";
		
		if (str1==str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str3="jo";
		String str4=str3+"hn";
		System.out.println(str4);
		if (str1==str4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str1.equals(str4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str5="JOHN";
		System.out.println(str1.equals(str5));
		System.out.println(str1.equalsIgnoreCase(str5));
		
		char ch ='R';
		if (ch>= '0'&&ch <='9') {
			System.out.println("숫자입니다");
		} else if('A'<=ch && ch<='Z') {
			System.out.println("대문자입니다.");
		} else if('a'<=ch && ch<='z') {
			System.out.println("소문자입니다");
		}else {
			System.out.println("숫자도 알파벳도아닙니다");
		}
		
		
		
		// 문자열 비교는 절대로 == 를 사용하지 말자
		// TODO
		
		
		// 문자열 비교는 equals() 사용!
		// TODO
		

		System.out.println();
		// char 는 기본적으로 정수값 (아스키 코드값) 이라
		// 일반 산술 비교가 가능.
		// TODO

		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

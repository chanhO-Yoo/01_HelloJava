package com.kh.api;

import java.util.Date;
//import java.lang.String;

//JVM이 빈번하게 사용되는 java.lang패키지의 모든 클래스는
//import문 없이 사용할 수 있도록 제공

/*
 * 기능 제공용 클래스
 * 메인 메소드 없이, 실행클래스에서 호출해서 사용
 */
public class Execute {
	public void test() {
		//실행할 코드
		//현재 시간 정보를 가진 java.util.Date 사용
		Date today = new Date();
		System.out.println(today);
	
		//문자열클래스 String
		System.out.println(new String("안녕:)"));
	}
}
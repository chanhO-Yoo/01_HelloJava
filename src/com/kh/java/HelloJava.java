package com.kh.java;

import com.kh.other.Other;
import com.kh.test.Test;


/**
 * javadoc 구성
 * (잘 적어두면 문서가 된다)
 * 
 * @author user1
 * 
 */

public class HelloJava {
	/**
	 * 메인메소드
	 * 자바 어플리케이션은 메인메소드로 시작해서 종료합니다
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("안녕 이클립스");
		System.out.println("=============");

		//1줄 주석
		/*
		 * 주
		 * 우
		 * 석
		 */
		
		//객체를 만들어서 메소드 호출
		HelloJava h = new HelloJava();
		h.methodA();
		
		//같은 패키지의 다른 클래스 HelloM의 메소드 sayHi호출
		HelloM m = new HelloM();
		m.sayHi();
		
		//(패키지 이름은 소문자로 표현, 클래스 이름은 대문자로 시작, 메소드 이름은 소문자로 시작)
		
		//다른 패키지의 클래스 com.kh.other.Other 클래스 
		//sayHello메소드 호출
		//com.kh.other.Other.sayHello 호출
		//다른 클래스의 패키지를 사용할 때
		//파일 최상단에 import문을 작성
		Other o = new Other();
		o.sayHello();
		
		//ctrl + shift + o || ctrl + spacebar --> 자동 import

		//출력메소드 테스트
		Test t = new Test();
		t.print();
		
		//@실습문제
		//단 하나의 System.out.print 메소드를 이용하여
		//다음 내용을 콘솔에 출력하세요.
		//com.kh.test.Test.escapingTest()에 작성
		/*       출력문
			아침잠이 많은 사람을 위한 "ShakeIt알람"
			------------------------------------
				흔들기	쏴리질러	터치하기
			------------------------------------
			아침부터 쌩쇼를 해야 알람을 끌 수 있음.
		 */
		t.escapingTest();
		
	}
	
	public void methodA() {
		System.out.println("mehtodA!!!!");
	}

}
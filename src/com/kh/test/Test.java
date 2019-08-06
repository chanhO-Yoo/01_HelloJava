package com.kh.test;

public class Test {
	public void print() {
		//내용 출력 후 개행하는 메소드 println
		System.out.println("-----------------------");
		
		//내용 출력 후 개행하지 않는 메소드 print  \n을 통해 줄바꿈
		System.out.print("가\n");
		System.out.print("나\n");
		System.out.print("다\n");
		
		//escapeing
		//키보드로 표현할 수 없는 특별한 문자표현식
		//백슬래쉬(\)와 다음문자 하나를 결합
		// \n:개행문자(커서의 위치를 다음줄의 처음으로 옮긴다.)
		// \r : carriage return(현재 줄의 처음으로 커서를 옮긴다.), 개행(줄바꿈)을 하지 않음
		// \t : tab 키를 누른것과 동일
		// \", \', \\ : 문자열 내 "(쌍따옴표), '(따옴표), \(역슬래쉬 표현)
		
		System.out.println("안녕\t잘가");
		System.out.println("누가 말했다.\"잘가라고\"");
		System.out.println("'a\'");
		System.out.println("\\");
		//경로표현시
		System.out.println("C:\\Users\\user1\\Desktop\\text.txt");
	}
	
	public void escapingTest() {
		/*
		System.out.print("아침잠이 많은 사람을 위한 \"ShakeIt알람\"\r\n" + 
				"----------------------------\r\n" + 
				"  흔들기	쏴리질러	터치하기\r\n" + 
				"----------------------------\r\n" + 
				"아침부터 쌩쇼를 해야 알람을 끌 수 있음.\n");
		
		System.out.print(
					"아침잠이 많은 사람을 위한 \"ShakeIt알람\"\n" +
					"----------------------------\n" +
					"  흔들기\t쏴리질러\t터치하기\n" +
					"----------------------------\n" +
					"아침부터 쌩쑈해야 알람을 끌 수 있음.\n"
				);
		*/
		System.out.print(
				"아침잠이 많은 사람을 위한 \"ShakeIt알람\"\n----------------------------\n  흔들기\t쏴리질러\t터치하기\n----------------------------\n아침부터 쌩쑈해야 알람을 끌 수 있음.\n"
			);
		
	}
}
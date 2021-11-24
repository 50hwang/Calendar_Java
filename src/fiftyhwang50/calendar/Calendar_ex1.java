package fiftyhwang50.calendar;

import java.util.Scanner;

public class Calendar_ex1 {
	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일 수를 출력받는 로직 
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하시오 : ");
		int month = scanner.nextInt();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 31};	//월별 최대 일수를 정수형 배열로 지정
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);
			//윤년의 경우까지 고려하지는 않음.
		scanner.close();
	}
}

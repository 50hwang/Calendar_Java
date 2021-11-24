package fiftyhwang50.calendar;

import java.util.Scanner;

public class Calendar_ex3 {
	// 해당하는 월의 최대 일 수를 출력하는 별도의 메소드 지정
	public int getMaxDaysOfMonth(int month) { // month라는 int값을 입력받아 switch 조건문으로 최대 일 수 반환
		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	// 달력 예시를 출력해주는 별도의 메소드 지정(입력X, 출력X)
	public void printSampleCalendar() {
		System.out.println(" 일  월 화  수 목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 최대 일 수를 찾아주는 별도의 메소드로 입력시키는 메인 메소드
		Scanner scanner = new Scanner(System.in);
		Calendar_ex3 cal = new Calendar_ex3();
		System.out.println("달을 입력하시오 : ");
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month)); // 윤년의 경우까지 고려하지는 않음.
		scanner.close();
	}
}

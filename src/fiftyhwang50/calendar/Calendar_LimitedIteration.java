package fiftyhwang50.calendar;

import java.util.Scanner;

public class Calendar_LimitedIteration {
	// 최대 일수 데이터를 정수형 배열 상수로 저장
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 월을 입력받고 최대 일 수 리턴으로 불러오기
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	// 메인 메소드
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar_LimitedIteration cal = new Calendar_LimitedIteration();

		// 반복 횟수 입력 받기
		System.out.println("반복 횟수를 입력하세요 : ");
		int repeat = scanner.nextInt();

		// 반복문 - 월 입력 받아 최대 일 수 출력하기
		for (int i = 0; i < repeat; i++) {
			System.out.println("시작할 달을 입력하세요 : ");
			int month = scanner.nextInt();
			System.out.printf("%d월 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}

		// 반복문 종료 후 프로그램 종료 알림
		System.out.println("프로그램이 종료되었습니다.");
		scanner.close();
	}

}

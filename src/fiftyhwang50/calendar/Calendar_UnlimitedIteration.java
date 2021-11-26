package fiftyhwang50.calendar;

import java.util.Scanner;

public class Calendar_UnlimitedIteration {
	// 최대 일수 데이터를 정수형 배열 상수로 저장
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 월을 입력받고 최대 일 수 리턴으로 불러오기
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	// 메인 메소드
	public static void main(String[] args) {
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar_UnlimitedIteration cal = new Calendar_UnlimitedIteration();

		// 조건부 무한 반복문
		int month = 1; // 무한반복 실행 가능한 초기값 지정
		while (true) {
			System.out.println("달을 입력하세요 : ");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			// -1 입력시 반복 이탈 후 프로그램 종료
			if (month == -1) {
				break;
			}
			// 13 이상의 숫자 입력시 에러 무시, 속행
			if (month > 12) {
				System.out.printf("1 ~ 12까지의 숫자를 입력하십시오.\n\n");
				continue;
			}
			System.out.printf("%d월 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}

		// 반복문 종료 후 프로그램 종료 알림
		System.out.println("프로그램이 종료되었습니다.");
		scanner.close();
	}

}

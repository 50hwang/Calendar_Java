package fiftyhwang50.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		ShowCalendarModel_ex1 form1 = new ShowCalendarModel_ex1();
		Calendar_UnlimitedIteration cal = new Calendar_UnlimitedIteration();

		// 조건부 무한 반복문
		int month = 1; // 무한반복 실행 가능한 초기값 지정
		int year = 2000; // 무한반복 실행 가능한 초기값 지정
		while (true) {
			System.out.println("년도를 입력하세요 : ");
			System.out.print(PROMPT);
			year = scanner.nextInt();
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

			// 입력받은 숫자에 대한 원하는 프로그램 실행(최대 일수, 캘린더 출력 등...)
			form1.printCalendar(year, month);
			System.out.printf("%d년 %d월 %d일까지 있습니다.\n\n", year, month, cal.getMaxDaysOfMonth(year, month));
		}

		// 반복문 종료 후 프로그램 종료 알림
		System.out.println("프로그램이 종료되었습니다.");
		scanner.close();
	}

	public static void main(String args[]) {
		// 프롬프트 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}

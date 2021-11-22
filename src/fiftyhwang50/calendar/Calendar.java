package fiftyhwang50.calendar;
import java.util.Scanner;

public class Calendar {
	public static void main(String args[]) {
		System.out.println(" 일  월 화  수 목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		// Ctrl + Shift + F 하면 코드 정렬
		
		//각 월별 최대 일수 데이터 배열 작성(윤년 따지지 말고)
		int[] maxDays = new int[12];
		maxDays[0] = 31;
		maxDays[1] = 28;
		maxDays[2] = 31;
		maxDays[3] = 30;
		maxDays[4] = 31;
		maxDays[5] = 30;
		maxDays[6] = 31;
		maxDays[7] = 31;
		maxDays[8] = 30;
		maxDays[9] = 31;
		maxDays[10] = 30;
		maxDays[11] = 31;
		
		//숫자를 입력받아 해당하는 달의 최대 일 수 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("최대 일 수를 알아볼 월을 입력하시오 : ");
		int month = scanner.nextInt();
		System.out.printf("입력하신 %d월의 최대 일수는 %d일 입니다.", month, maxDays[(month - 1)]);
		
		//프로그램 종료
		scanner.close();
	}
}


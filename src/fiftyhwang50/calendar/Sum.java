package fiftyhwang50.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {
		//두 정수 변수 정의
		int a, b;
		
		//키보드로 두 수 입력 받기
		Scanner scanner = new Scanner(System.in);
		
		//입력값을 문자열로 변환 후 출력
		String s1, s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", " + s2);

		//문자열을 정수로 타입 변환
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);		
		
		//두 수의 합 출력
		System.out.println("두 수의 합은 " + (a+b) + "입니다.");
		
		//(좀 더 나은) 두 수의 합 출력
		System.out.printf("입력하신 %d와 %d의 합은 %d입니다.", a, b, (a+b));
		
		//가져온 Scanner 프로그램 종료(resource leak 방지)
		scanner.close();
	}
}

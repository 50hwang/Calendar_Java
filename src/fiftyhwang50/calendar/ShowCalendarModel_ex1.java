package fiftyhwang50.calendar;


public class ShowCalendarModel_ex1 {

	// 각 월별 최대 일 수 데이터 클래스
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 평년(false), 윤년(true) 판단하기
	public boolean isLeapYear(int year) {
		if (year % 4 == 0)
			if (year % 100 == 0)
				if (year % 400 == 0)
					return true;
				else
					return false;
			else
				return true;
		else
			return false;
	}

	// 입력한 month로 MAX_DAYS 안의 값 반환받기
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];	// 맞을 경우 윤년배열
		} else {
			return MAX_DAYS[month - 1];	//아닐 경우 평년배열
		}
	}

	// 캘린더 폼 출력
	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년 %2d월>>   \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		// 캘린더 폼에 반영할 Max_Days 값을 maxDay에 받기
		int maxDay = getMaxDaysOfMonth(year, month);

		// 받은 maxDay까지 달력 출력
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//		System.out.println("29 30 31");

	}
}

package bronzeLevel;

import java.time.LocalDateTime;

// 오늘의 날짜 시간 출력하기
public class N16170 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}

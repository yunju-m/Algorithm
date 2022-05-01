package bronzeLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 오늘 날짜
public class N10699 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
		System.out.println(formatedNow);
	}

}

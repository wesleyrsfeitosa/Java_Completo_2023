package aula07_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-07-03");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-03T15:40:20");
		Instant d06 = Instant.parse("2023-07-03T15:40:20Z");
		Instant d07 = Instant.parse("2023-07-03T15:40:20-03:00");
		
		LocalDate d08 = LocalDate.parse("03/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("03/07/2023 15:56", fmt2);
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
	}

}

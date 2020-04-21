package com.capgemini.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

public class TimeApiExaample {

	public static void main(String[] args) {

//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900);  // depricated functions
//		System.out.println(d1.getMonth());
//		Date dob = new Date(1999, 21, 07);
//		System.out.println(dob);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate dob = LocalDate.of(1987, 11, 03);
		System.out.println(dob);
		
		Period p = Period.between(dob, ld);
		System.out.println(p.getYears());
		
		LocalDate tommorow = LocalDate.now().plusDays(2);
		System.out.println(tommorow);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		allZoneIds.forEach(System.out::println);
		
		ZonedDateTime zonedatetime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedatetime);
		
		
		Optional<Integer> op = Optional.of(56);
		if(op.isPresent())
			System.out.println(op.get());
		else
			System.out.println("no Value");

	}

}

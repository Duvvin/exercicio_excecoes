package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Which your Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date: (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date: (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		Reservation res = new Reservation(number, checkIn, checkOut);
		System.out.println(res);
		
		System.out.println("Updating Date, Check-in date: (dd/MM/yyyy)");
		checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date: (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());
		
		res.updateDate(checkIn, checkOut);
		
		System.out.println(res);
		
		sc.close();
	    }
		catch(ParseException e) {
	    	System.out.println("Invalid Date Format");
	    }
		catch(DomainException e) {
			System.out.println("Error in reservation" + e.getMessage());
		}
	}
}

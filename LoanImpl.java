package loanbanking;

import java.util.Scanner;

public class LoanImpl implements Loan {
	static Scanner sc = new Scanner(System.in);
	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter your Phone Number:");
		String phone = sc.next();
		boolean isphonevalid = phone.matches("[6-9][0-9]{9}");
		return isphonevalid;
	}
	@Override
	public boolean isAdhaarValid() {
		System.out.println("Enter your Adhaar Number:");
		String adhaar = sc.next();
		boolean ispanvalid = adhaar.matches("[0-9]{12}");
		return ispanvalid;
	}
	@Override
	public boolean isPanValid() {
		System.out.println("Enter your PanCard Number:");
		String pan = sc.next();
		boolean ispanvalid = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return ispanvalid;
	}
	@Override
	public int getAge() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}
	@Override
	public double getSalary() {
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();
		return sal;
	}
	@Override
	public int getCibilScore() {
		System.out.println("Enter your Cibil Score");
		int cibil = sc.nextInt();
		return cibil;
	}
	@Override
	public double getROI() {
		return 9.5;
	}
	@Override
	public String getAdressDetails() {
		String adress="";
		System.out.println("Enter your Flat Number:");
		String flat=sc.next();
		System.out.println("Enter your plot Number:");
		String plot=sc.next();
		System.out.println("Enter your Street :");
		String street=sc.next();
		System.out.println("Enter your City :");
		String city=sc.next();
		System.out.println("Enter your State and Country :");
		String state=sc.next();
		String country=sc.next();
		adress="\n"+"Flat Details:"+flat+"\n"+"Plot Details: "+plot+"\n"+"Street: "+street+"\n"+"City: "+city+"\n"+"State: "+state+"\n"+"Country: "+country;
		return adress;
	}
}

package loanbanking;

public interface Loan {
	boolean isPhoneValid();
	boolean isAdhaarValid();
	boolean isPanValid();
	int getAge();
	double getSalary();
	int getCibilScore();
	double getROI();
	String getAdressDetails();
}

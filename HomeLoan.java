package loanbanking;

public class HomeLoan extends LoanImpl {
	void getHomeLoanDocInfo() {
		System.out.println("All Home Loan Documents Submitted Successfully");
	}
	public static void main(String[] args) {
		System.out.println("****Welcome to ABC Home Loan Banking****");
		HomeLoan hl = new HomeLoan();
		if (hl.isPhoneValid() && hl.isAdhaarValid() && hl.isPanValid()) {
			int age = hl.getAge();
			double salary = hl.getSalary();
			int cibilscore = hl.getCibilScore();
			double roi = hl.getROI();
			if ((age >= 18 && age < 70) && salary >= 30000 && (cibilscore > 300 && cibilscore <= 900)) {
				System.out.println("...Congratulations...!!! Your Home Loan have been Approved....");
				if (cibilscore >= 300 && cibilscore <= 600) {
					System.out.println("Poor Cibil Score");
					roi = roi + 1.5;
				} else if (cibilscore > 600 && cibilscore < 700) {
					System.out.println("Fair Cibil Score");
					roi = roi + 1.0;
				} else if (cibilscore >= 700 && cibilscore < 750) {
					System.out.println("Good Cibil SCore");
					roi = roi + 0.5;
				} else {
					roi = roi - 2.0;
				}
				System.out.println("Your Rate of Interest for Home Loan is:" + roi);
				System.out.println("As Entered Your Adresss Details are:"+hl.getAdressDetails());

			} else {
				System.out.println("Your Home Loan Cannot Be approved....");
			}
		} else {
			System.out.println("Invalid Personal Details.Once check Your Personal Details");
		}

	}

}

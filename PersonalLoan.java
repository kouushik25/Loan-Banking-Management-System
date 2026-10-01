package loanbanking;

public class PersonalLoan extends LoanImpl {

	void getPersonalLoanDocInfo() {
		System.out.println("All Personal Loan Documents Submitted Successfully");
	}

	public static void main(String[] args) {
		System.out.println("****Welcome to ABC Personal Loan Banking****");
		PersonalLoan pl = new PersonalLoan();
		if (pl.isPhoneValid() && pl.isAdhaarValid() && pl.isPanValid()) {
			int age = pl.getAge();
			double salary = pl.getSalary();
			int cibilscore = pl.getCibilScore();
			double roi = pl.getROI();
			if ((age >= 22 && age < 60) && salary >= 50000 && (cibilscore > 300 && cibilscore <= 900)) {
				System.out.println("...Congratulations...!!! Your Pesronal Loan have been Approved....");
				if (cibilscore >= 300 && cibilscore <= 600) {
					System.out.println("Poor Cibil Score");
					roi = roi + 3.5;
				} else if (cibilscore > 600 && cibilscore < 700) {
					System.out.println("Fair Cibil Score");
					roi = roi + 2.5;
				} else if (cibilscore >= 700 && cibilscore < 750) {
					System.out.println("Good Cibil SCore");
					roi = roi + 1.5;
				} else {
					roi = roi - 1.0;
				}
				System.out.println("Your Rate of Interest for Personal Loan is:" + roi);
				System.out.println("As Entered Your Adresss Details are:" + pl.getAdressDetails());

			} else {
				System.out.println("Your Perosnal Loan Cannot Be approved....");
			}
		} else {
			System.out.println("Invalid Personal Details.Once check Your Personal Details");
		}

	}
}

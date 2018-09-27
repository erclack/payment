package cars;
public static void main(String[] args) {
	// TODO Auto-generated method stub
}
	public class Payment {
		private double carCost;
		private double downPayment;
		private int lengthOfLoan;
		private double interestRate;
		
		public double getCarCost() {
			return carCost;
		}
		public void setCarCost(double carCost) {
			this.carCost = carCost;
		}
		public double getDownPayment() {
			return downPayment;
		}
		public void setDownPayment(double downPayment) {
			this.downPayment = downPayment;
		}
		public int getLengthOfLoan() {
			return lengthOfLoan;
		}
		public void setLengthOfLoan(int lengthOfLoan) {
			this.lengthOfLoan = lengthOfLoan;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		public double monthyCarPayment() {
			return (carCost - downPayment)*(interestRate/12*Math.pow(1+(interestRate/12),lengthOfLoan))/(Math.pow(1+(interestRate/12),lengthOfLoan) -1);
		}
		public double totalInterestSpent() {
			return interestRate*lengthOfLoan*(carCost-downPayment);
		}
	}


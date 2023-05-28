package Ex10_1c;

public abstract class PayCalculator {
	double payRate;
	public PayCalculator(double p) {
		payRate = p;
	}
	public double computePay(double hours) {
		return (this.payRate*hours);
	}
}

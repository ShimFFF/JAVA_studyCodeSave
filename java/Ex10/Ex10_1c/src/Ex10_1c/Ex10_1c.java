package Ex10_1c;


class RegularPay extends PayCalculator {
	public RegularPay(double p) {
		super(p);
	}
}

class HazardPay extends PayCalculator {
	public HazardPay (double p) {
		super(p);
	}
	public double computePay(double hours) {
		return super.payRate*hours*1.5;
	}
}

public class Ex10_1c {
	public static void main(String [] args) {
		System.out.println(" payRate is 2$");
		double pay=2;
		
		RegularPay r=new RegularPay(pay);
		HazardPay h=new HazardPay(pay);
		
		System.out.println("working hour is 5");
		
		
		
		System.out.println("RegularPay "+r.computePay(5));
		System.out.println("HazardPay "+h.computePay(5));
	}
}

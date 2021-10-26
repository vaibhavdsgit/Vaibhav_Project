package com.cg.oct12.day5.inheritance;

interface FinanceMinistry{
	public abstract void payInterestOnDeposit();
}

interface StateGovernment{
	public abstract void paySalaryToEmployees();
}

abstract class RBI{
	abstract void doKYC();
}

class HdfcBank extends RBI implements FinanceMinistry, StateGovernment{
	@Override
	void doKYC() {
		System.out.println("Use Aadhar Card");
	}

	@Override
	public void paySalaryToEmployees() {
		System.out.println("Hdfc pays salary to Emp");
	}

	@Override
	public void payInterestOnDeposit() {
		System.out.println("Hdfc pays interest");
	}
}

class IciciBank extends RBI{
	@Override
	void doKYC() {
		System.out.println("Use PAN Card");
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank hdfc = new HdfcBank();
		hdfc.doKYC();
		hdfc.payInterestOnDeposit();
		hdfc.paySalaryToEmployees();
		
		IciciBank ic = new IciciBank();
		ic.doKYC();
	}

}

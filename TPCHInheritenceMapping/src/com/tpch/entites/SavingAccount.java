package com.tpch.entites;

public class SavingAccount extends Account {
	protected float minBalance;
	protected boolean hasCheckFault;
	protected int withdraw;
	
	public float getMinBalance() {
		return minBalance;
	}
	public boolean isHasCheckFault() {
		return hasCheckFault;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	public void setHasCheckFault(boolean hasCheckFault) {
		this.hasCheckFault = hasCheckFault;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasCheckFault ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(minBalance);
		result = prime * result + withdraw;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (hasCheckFault != other.hasCheckFault)
			return false;
		if (Float.floatToIntBits(minBalance) != Float
				.floatToIntBits(other.minBalance))
			return false;
		if (withdraw != other.withdraw)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SavingAccount [minBalance=" + minBalance + ", hasCheckFault="
				+ hasCheckFault + ", withdraw=" + withdraw + ", accountNo="
				+ accountNo + ", accountHolder=" + accountHolder
				+ ", openDate=" + openDate + ", balance=" + balance + "]";
	}
	
}

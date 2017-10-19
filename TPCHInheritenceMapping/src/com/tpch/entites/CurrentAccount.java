package com.tpch.entites;

public class CurrentAccount extends Account {
protected int OverDraftLimit;
protected int annualCharge;
public int getOverDraftLimit() {
	return OverDraftLimit;
}
public int getAnnualCharge() {
	return annualCharge;
}
public void setOverDraftLimit(int overDraftLimit) {
	OverDraftLimit = overDraftLimit;
}
public void setAnnualCharge(int annualCharge) {
	this.annualCharge = annualCharge;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + OverDraftLimit;
	result = prime * result + annualCharge;
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
	CurrentAccount other = (CurrentAccount) obj;
	if (OverDraftLimit != other.OverDraftLimit)
		return false;
	if (annualCharge != other.annualCharge)
		return false;
	return true;
}
@Override
public String toString() {
	return "CurrentAccount [OverDraftLimit=" + OverDraftLimit
			+ ", annualCharge=" + annualCharge + "]";
}

}

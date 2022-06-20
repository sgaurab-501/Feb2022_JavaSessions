package constructorConcept;

public class Company {

String name;
String hq;
int empCount;
boolean isActive;
double sharePrice;

public Company(String name, String hq) {
	super();
	this.name = name;
	this.hq = hq;
}

public Company(String name, double sharePrice) {
	super();
	this.name = name;
	this.sharePrice = sharePrice;
}

public Company(String name, String hq, int empCount) {
	super();
	this.name = name;
	this.hq = hq;
	this.empCount = empCount;
}

public Company(String name, String hq, int empCount, boolean isActive, double sharePrice) {
	super();
	this.name = name;
	this.hq = hq;
	this.empCount = empCount;
	this.isActive = isActive;
	this.sharePrice = sharePrice;
}

public static void main(String[] args) {

Company c1 = new Company("IBM", "Pune");
Company c2 = new Company("TCS", "Bangalore");
	



}
}

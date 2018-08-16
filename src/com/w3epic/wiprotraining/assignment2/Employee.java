package com.w3epic.wiprotraining.assignment2;

public class Employee extends Person {
	private double annualSalary;
	private int yearOfJoining;
	private String nationalInsuranceNo;
	
	public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo + ", name=" + name + "]";
	}
	
	
}

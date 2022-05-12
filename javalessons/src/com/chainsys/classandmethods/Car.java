package com.chainsys.classandmethods;
/**
 * 
 * @author arun3117
 *
 */
public class Car {
    public final String regNo;
    private int YearOfPurchase;
    private String color;
    private String fuel;
    
    public Car(String rno) {
    	this.regNo=rno;
    }

	public int getYearOfPurchase() {
		return YearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.YearOfPurchase = yearOfPurchase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
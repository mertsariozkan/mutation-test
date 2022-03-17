package com.example.mutationtest;

public class Calculator {

    private double grossAmount;
    private double taxes;

    public Calculator(double grossAmount, double taxes) {
        this.grossAmount = grossAmount;
        this.taxes = taxes;
    }

    public double calculateNetAmount() {
        return grossAmount - taxes;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }
}

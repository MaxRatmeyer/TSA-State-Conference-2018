package me.maxratmeyer.tsa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TSA {

    static int unitsSold;
    static double unitsSoldPrice;

    static ArrayList<Double> stocks;

    public static void main(String[] args){

        stocks = new ArrayList<>();

        //Number of years customer has purchased
        System.out.println("How many years have you purchased Stock X? ");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();

        //Loop through amount of years customer purchased stock
        for (int i = 0; i < years; i++) {
            int year = i + 1;

            //Ask for units purchased
            System.out.println("How many units did you purchase in year " + year + "?");
            Scanner unitScanner = new Scanner(System.in);
            int units = unitScanner.nextInt();

            //Ask for price per share
            System.out.println("What was the price per share? ");
            Scanner shareScanner = new Scanner(System.in);
            double sharePrice = shareScanner.nextDouble();

            for (int i2 = 0; i2 < units; i2++) {

                stocks.add(sharePrice);

            }

        }

        //Ask for units sold
        System.out.println("How many units did you sell?");
        Scanner unitSellScanner = new Scanner(System.in);
        unitsSold = unitSellScanner.nextInt();

        //Ask for price per units sold
        System.out.println("What was the price per share? ");
        Scanner unitSellPriceScanner = new Scanner(System.in);
        unitsSoldPrice = unitSellPriceScanner.nextDouble();

        double units = 0;

        for (int i = 0; i < unitsSold; i++) {

            double sharePrice = stocks.get(i);
            units = units + sharePrice;

        }

        double boughtPrice = units/unitsSold;

        double priceDifference = unitsSoldPrice - Math.round(boughtPrice);

        double capitalgain = unitsSold * priceDifference;

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);

        System.out.println("Your total capital gain is $" + decimalFormat.format(capitalgain) + ".");

    }

}

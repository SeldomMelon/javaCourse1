package lesson_09.hash_code;

public class Coin extends Object{


    private int nominal;
    private double diameter;
    private String country;
    private int year;

    public Coin(int nominal, double diameter, String country, int year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.year = year;
    }

    public int getNominal() {

        return nominal;
    }

    public void setNominal(int nominal) {

        this.nominal = nominal;
    }

    public double getDiameter() {

        return diameter;
    }

    public void setDiameter(double diameter) {

        this.diameter = diameter;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }


}

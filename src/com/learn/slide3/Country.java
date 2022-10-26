package com.learn.slide3;

public class Country {

    private static final int CITIES_MAX_NUMBER = 100;
    private String name;

    private int cities;

    private City[] countryCities;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
        countryCities = new City[CITIES_MAX_NUMBER];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCity(City city) {
        countryCities[cities] = city;
        cities++;
    }

    public void printInfo() {
        System.out.println("about country " + name);
        System.out.println("country cities");
        for (int i = 0; i < cities; i++) {
            countryCities[i].printInfo();
        }
    }

    public City findAndGetCapital() {
        for (int i = 0; i < cities; i++) {
            if (countryCities[i].isCapital()) {
                return countryCities[i];
            }
        }
        return null;
    }

    public int findCountryPopulation() {
        int sum = 0;

        for (int i = 0; i < cities; i++) {
            sum = sum + countryCities[i].getPopulation();
        }
        return sum;
    }

}

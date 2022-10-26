package com.learn.slide3;

public class City {
    private String name;
    private boolean capital;
    private int population;

    public City() {
    }

    public City(String name, boolean capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void printInfo() {
        System.out.println("name, capital, population :" + name + "  " + capital + "  " + population);
    }
}

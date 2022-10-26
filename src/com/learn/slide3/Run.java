package com.learn.slide3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter country name");
        String countryName = scanner.next();
        Country country = new Country(countryName);

        while (true) {
            System.out.println("Please enter 1 for add city and enter 0 for stop the process");
            int option = scanner.nextInt();
            if (option == 0){
                break;
            } else {
                System.out.println("Please enter city name");
                String cityName = scanner.next();
                System.out.println("Please enter cities population");
                int citiesPopulation = scanner.nextInt();
                System.out.println("Please enter if this city is a capital(true/false)?");
                boolean capital = scanner.nextBoolean();

                City city = new City(cityName,capital,citiesPopulation);
                country.addCity(city);
            }
        }

        System.out.println("Countries population is: " + country.findCountryPopulation());
        System.out.println("Countries capitan name is  " + country.findAndGetCapital().getName());
        country.printInfo();

    }
}

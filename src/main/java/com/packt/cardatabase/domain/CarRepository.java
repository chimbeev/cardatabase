package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    //Fetch cars by brand
    List<Car> findByBrand(String brand);

    //Fetch cars by color
    List<Car> findByColor(String model);

    //Fetch cars by model year
    List<Car> findByModelYear(int year);

    //Fetch cars by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    //Fetch cars by brand or color
    List<Car> findByBrandOrColor(String model, String brand);

    //Fetch cars by brand and sort by year
    List<Car> findByBrandOrderByModelYearAsc(String brand);

}

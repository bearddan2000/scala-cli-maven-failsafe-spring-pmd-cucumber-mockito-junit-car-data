package example.repository;

import org.springframework.stereotype.Repository;
import example.model.Car;

@Repository
class CarRepositoryImpl extends CarRepository {
  override def createCar(price: Double, year: Integer, model: String, make: String): Car = new Car(price,year,model,make)
}

package example.repository;

import example.model.Car;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
trait CarRepository {

  def createCar(price: Double, year: Integer, model: String, make: String): Car;

}

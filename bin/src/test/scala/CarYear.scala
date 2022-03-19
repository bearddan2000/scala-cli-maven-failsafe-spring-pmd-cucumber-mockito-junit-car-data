import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarYear {
  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car year should be 0")
  def checkYear(): Unit = {
    val car = service.createCar();
    Assertions.assertEquals(car.year, 0);
  }
}

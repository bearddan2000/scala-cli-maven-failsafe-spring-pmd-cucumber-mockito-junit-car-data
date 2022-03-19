import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarMake {
  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car make should be test")
  def checkMake(): Unit  = {
    val car = service.createCar();
    Assertions.assertEquals(car.make, "test");
  }
}

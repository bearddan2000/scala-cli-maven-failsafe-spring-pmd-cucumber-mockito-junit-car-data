import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.CarServiceImpl;

class CarModel {
  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car model should be test")
  def checkModel(): Unit = {
    val car = service.createCar();
    Assertions.assertEquals(car.model, "test");
  }
}

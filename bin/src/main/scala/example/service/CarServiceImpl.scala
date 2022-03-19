package example.service;

import example.model.Car;
import example.repository._;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.{ArrayList, List, Random};

@Service
class CarServiceImpl extends CarService {

  var carRepository: CarRepository = new CarRepositoryImpl();

  def createOneCar(): Car = carRepository.createCar(0, 0, "test", "test");

  def createList(): List[Car] = {
    return new ArrayList[Car](){
      {
        add(carRepository.createCar(0, 0, "0", "0"));
        add(carRepository.createCar(1, 1, "1", "1"));
        add(carRepository.createCar(2, 2, "2", "2"));
      }
    };
  }

  override def createCar(): Car = createOneCar()

  override def createRandomCar(): Car = {
    val lst: List[Car] = createList();
    var x = 0;
    var y = lst.size() - 1;
    val r: Random = new Random();
    val number = x+((r.nextDouble()*(y-x))).toInt;
    return lst.get(number);
  }

  override def addCar(): List[Car] = {
    val lst: List[Car] = createList();
    lst.add(createOneCar());
    return lst;
  }

  override def deleteCar(): List[Car] = {
    val lst: List[Car] = createList();
    lst.remove(0);
    return lst;
  }

  override def findAll(): List[Car] = createList()

}

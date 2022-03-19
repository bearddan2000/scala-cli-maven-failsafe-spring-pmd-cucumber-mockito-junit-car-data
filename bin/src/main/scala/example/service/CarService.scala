package example.service;

import example.model.Car;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
trait CarService {
  def createCar(): Car;

  def createRandomCar(): Car;

  def addCar(): List[Car];

  def deleteCar(): List[Car];

  def findAll(): List[Car];

}

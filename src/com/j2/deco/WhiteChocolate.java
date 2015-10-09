package com.j2.deco;

public class WhiteChocolate extends CondimentDecorator {


 public WhiteChocolate(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", WhiteChocolate";
 }

 public double cost() {
  return .10 + beverage.cost();
 }
}

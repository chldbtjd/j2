package com.j2.decorater;

public class CacaoChocolate extends CondimentDecorator {


 public CacaoChocolate(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", CacaoChocolate";
 }

 public double cost() {
  return .10 + beverage.cost();
 }
}

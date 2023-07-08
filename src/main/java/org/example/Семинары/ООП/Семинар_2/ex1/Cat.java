package org.example.Семинары.ООП.Семинар_2.ex1;

class Cat extends Animal {
    protected static int count;

 public Cat(String name,String type, int maxRunDistance, int maxSwimDistance) {
  super(name,"Кот", maxRunDistance, maxSwimDistance);
  count = count +1;
 }

 public Cat() {
 }

 public static int getCount() {
  return count;
 }

 public static void setCount(int count) {
  Cat.count = count;
 }
}
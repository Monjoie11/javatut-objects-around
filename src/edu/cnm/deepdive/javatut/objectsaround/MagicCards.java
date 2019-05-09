package edu.cnm.deepdive.javatut.objectsaround;


  public class MagicCards {

    int cadence = 8;
    int speed = 50;
    int gear = 3;

    public void changeCadence(int newValue) {
      cadence = newValue;
    }

    public void changeGear(int newValue) {
      gear = newValue;
    }

    public void speedUp(int increment) {
      speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
      speed = speed - decrement;
    }

    public void printStates() {
      System.out.println("cadence:" +
          cadence + " speed:" +
          speed + " gear:" + gear);
    }
  }
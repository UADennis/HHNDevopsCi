package org.example;

public class Prof {

  private String name;
  private String lastname;

  private int coolness;

  public Prof(String name, String lastname, int coolness){
    this.name = name;
    this.lastname = lastname;
    this.coolness = coolness;
  }

  public String giveExercise(){
    return "Aufgabe";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getCoolness() {
    return coolness;
  }

  public void setCoolness(int coolness) {
    this.coolness = coolness;
  }


}

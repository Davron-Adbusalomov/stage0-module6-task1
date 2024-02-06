package com.epam.mjc.stage0;

public class Bird extends Animal{
  public Bird(){
    super().color = "blue";
    super().numberOfPaws = 2;
    super().hasFur = false;
  }

  @Override
  public String getDescription(){
    return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
  }
}

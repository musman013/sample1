package com.nfinity.ll.ttestapp1.application.specialties.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class CreateSpecialtiesInput {

  @Length(max = 80, message = "name must be less than 80 characters")
  private String name;
  

  public String getName() {
  return name;
  }

  public void setName(String name){
  this.name = name;
  }
  
 
}

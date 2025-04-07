package com.collection;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

class Vaccine{
	int age;
	float dosage;
	public Vaccine(int age) {
		super();
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getDosage() {
		return dosage;
	}
	public void setDosage(float dosage) {
		this.dosage = dosage;
	}
	
}

public class VaccinationCamp {

      ArrayList<Vaccine> v=new ArrayList();
      
       void assignVaccine() {
    	   for(Vaccine v1:v) {
    	   if(v1.getAge()>=45)
           {
               v1.setDosage(250);
           }
               else if(v1.getAge()>=20 && v1.getAge()<=44)
           {
               v1.setDosage(200);
               
           } 
           
            else 
           {
               v1.setDosage(100);
           }
    	   
    	  }
       }
    	 
    	  
    	  float vaccineInjected() {
    		  float total=0;
    		  for(Vaccine p:v) {
    			  total +=p.getDosage();
    		  }
    		  
    		  return total;
    		  
    	  }


      public static void main(String args[]) {
    	  VaccinationCamp vc = new VaccinationCamp();
    	  vc.v.add(new Vaccine(23));
    	  vc.v.add(new Vaccine(17));
    	  vc.v.add(new Vaccine(16));
    	  vc.assignVaccine();
    	  System.out.println(vc.vaccineInjected());
    	  
      }

}
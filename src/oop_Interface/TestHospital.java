package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
	FortisHospital fh = new FortisHospital();
	fh.physioServices();
	fh.medicalTraining();
	fh.pediaServices();
	fh.covid19Vaccination();
	fh.covidGuidelines();
	fh.oncologyServices();
	fh.medNews(); // USMedical interface
	fh.cardioServices();
	 
	System.out.println(USMedical.min_fee);
	USMedical.billing();
	FortisHospital.billing();
	System.out.println(FortisHospital.min_fee);
	
// Top Casting:
// Child class object can be referred by parent interface reference variable
	
	USMedical us = new FortisHospital();
	us.cardioServices();
	us.emergencyServices();
	us.physioServices();
	us.pediaServices();
	
	WHO wh = new FortisHospital();
      
// Down casting: Invalid concept
// Parent interface object is referred by child class reference variable
	
//	FortisHospital fh1 = new USMedical();
	

	
	}
}

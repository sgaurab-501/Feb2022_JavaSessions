package oop_Interface;

public class FortisHospital implements USMedical, WHO, UNHG {

public void oncologyServices() {
	
}
// Individual methods	
public void medicalInsurance() {
	
	System.out.println("FH -- Medical Insurance");
}
public void medicalTraining() {
	
	System.out.println("FH -- Medical Training");
}
public void covid19Vaccination() {
		
	System.out.println("FH -- Covid19Vaccination");
}

@Override
public void physioServices() {
	
	System.out.println("FH -- PhysioServices");
}

@Override
public void cardioServices() {
	
	System.out.println("FH -- CardioServices");
}

@Override
public void pediaServices() {
	
	System.out.println("FH -- PediaServices");
}

@Override
public void emergencyServices() {
	
	System.out.println("FH -- EmergencyServices");
}

@Override
public void covidGuidelines() {

	System.out.println("FH -- Covid Guidelines");
}

public static void billing() {
	
	System.out.println("FH -- Billing");
}

//@Override
//public void medNews() {
//System.out.println("US - med news");
//}

public void patientHistory() {
	
}

}

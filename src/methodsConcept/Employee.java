package methodsConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

//WAF: getEmpDevices(String name)
//return: ArrayList<String>
	
	public ArrayList<String> getEmpDevices(String name)
	{
	ArrayList<String> deviceList = new ArrayList<String>();
	System.out.println("Emp Name: "+name);
	
	if(name.equals("sri")) {
    deviceList.add("iPhone7");
	deviceList.add("iPhone8");
    deviceList.add("iPhone10");
		
	}
	else if( name.equals("shashi")){
	deviceList.add("iPhone 6s");
	deviceList.add("iPhone7 plus");
	deviceList.add("iPhone 10s");
	}
	
	else {
	System.out.println("Employee not Found.....");
	}
	return deviceList;
	
	}

	public String[] getCompInfo(String compName) {
	String dept[] = new String[5];
	System.out.println("Company Name: "+compName);
	
	if(compName.equals("IBM")) {
		dept[0]="HR";
		dept[1]="Admin";
		dept[2]="Finance";
		}
	
	if(compName.equals("TCS")) {
	dept[0]="HR";
	dept[1]="Admin";
	dept[2]="Finance";
	dept[3]="QA";
	dept[4]="Product";
	}
	else {
	System.out.println("Company not Found: "+compName);
	}
	
	return dept;
//	return dept[0];
	
	}
public static void main(String[] args) {
	
	Employee obj = new Employee();
    ArrayList<String> empDevList =  obj.getEmpDevices("Naveen");
    System.out.println(empDevList);
   
 //  String deptArr = obj.getCompInfo("TCS");
    String deptArr[] = obj.getCompInfo("IBM");
    System.out.println(Arrays.toString(deptArr));
 //  System.out.println(deptArr); 
    
    
  }
}

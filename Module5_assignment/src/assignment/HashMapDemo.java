package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		EmployeeRecord e1 = new EmployeeRecord("E001","RAM","ACCOUNTS");
		EmployeeRecord e2 = new EmployeeRecord("E002","ROHIT","HR");
		EmployeeRecord e3 = new EmployeeRecord("E003","HARI","DEV");
		EmployeeRecord e4 = new EmployeeRecord("E004","SITA","IT");
		EmployeeRecord e5 = new EmployeeRecord("E005","PUJA","SUPPORT");
		
		HashMap<String, EmployeeRecord> emprec = new HashMap<String, EmployeeRecord>();
		
		// Add keys and values (Country, City)
	    emprec.put(e1.getEmpID(),e1);
	    emprec.put(e2.getEmpID(),e2);
	    emprec.put(e3.getEmpID(),e3);
	    emprec.put(e4.getEmpID(),e4);
	    emprec.put(e5.getEmpID(),e5);
	  
	    System.out.println(emprec);
	    
	 // using iterators
        Iterator<Map.Entry<String, EmployeeRecord>> itr = emprec.entrySet().iterator();
        while(itr.hasNext())
        {
             Map.Entry<String, EmployeeRecord> entry = itr.next();
             System.out.println("ID = " + entry.getKey() +
                                 ", Name = " + entry.getValue().getEmpName() +
             						", Department = " + entry.getValue().getEmpDept());
        }
        

	}

}

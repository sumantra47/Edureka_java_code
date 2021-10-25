package assignment;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMark s1 = new StudentMark("E001","RAM",45);
		StudentMark s2 = new StudentMark("E002","SITA",95);
		StudentMark s3 = new StudentMark("E003","RAHIM",55);
		StudentMark s4 = new StudentMark("E004","RITU",78);
		StudentMark s5 = new StudentMark("E005","RAJNNI",15);
		
		
		Hashtable<String, StudentMark> studtable = new Hashtable<String, StudentMark>();
		
		// add student rec
	    studtable.put(s1.getStudentID(),s1);
	    studtable.put(s2.getStudentID(),s2);
	    studtable.put(s3.getStudentID(),s3);
	    studtable.put(s4.getStudentID(),s4);
	    studtable.put(s5.getStudentID(),s5);
	   
	  
	    System.out.println(studtable);
	    
	 // using iterators
        Iterator<Map.Entry<String, StudentMark>> itr = studtable.entrySet().iterator();
        int max=0;
        String id ="";
        String name ="";
        while(itr.hasNext())
        {
             Map.Entry<String, StudentMark> entry = itr.next();
             if(entry.getValue().getStudentMark() > max) {
            	 max = entry.getValue().getStudentMark();
            	 id = entry.getValue().getStudentID();
            	 name = entry.getValue().getStudentName();
             }
        }
        System.out.println("Student with Highest Score : ID = " + id +
                ", Name = " + name +
					", Department = " + max);

	}

}

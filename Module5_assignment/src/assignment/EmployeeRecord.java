package assignment;

public class EmployeeRecord {
	private String empID;
	private String empName;
	private String empDept;
	
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public EmployeeRecord(String empID, String empName, String empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "EmployeeRecord [empID=" + empID + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	
	
	

}

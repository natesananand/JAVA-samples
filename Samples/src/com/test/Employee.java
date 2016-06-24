package com.test;


public class Employee {
	
	Employee(Integer no,String nname){
		this.empNo=no;
		this.empName=nname;
	}
	
	
	private Integer empNo;
	
	private String empName;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (!(o instanceof Employee)) return false;
        
        final Employee employee = (Employee) o;
        
        if(this.empName==null){
        	return (this.empName == employee.empName);
        }
        return (this.empName.equals(employee.empName));
    }
    
    /**
     *Override the hashcode() method
     */
    public int hashCode() {
       
        return  empName.hashCode() ;
       
    }
    
    @Override
public String toString(){
    	return this.empName;
	
}

}

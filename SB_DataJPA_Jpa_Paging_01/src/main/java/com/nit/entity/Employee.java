package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP_TBL")
public class Employee {

	public Employee() {

	}


	public Employee(Integer empId, String empName, Double empSal, String empAddress) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAddress = empAddress;
	}


	@Id
	@Column(name = "EMP_ID")
	private Integer empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_SAL")
	private Double empSal;

	@Column(name = "EMP_ADDRESS")
	private String empAddress;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAddress=" + empAddress
				+ "]";
	}



}

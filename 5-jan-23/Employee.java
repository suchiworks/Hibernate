package com.HibernateEg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
	//specifies the table name where data of this entity is to be persisted.
@Table  (name ="Employee_info")
	public class Employee {
		@Id //Marks identifier of class
		private int Emp_Id;
		private String Emp_Name, Emp_Addr;
		private long Emp_Phone;
		private double Emp_Sal;
}


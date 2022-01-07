package com.employee.client.dto.v1_0;

import com.employee.client.function.UnsafeSupplier;
import com.employee.client.serdes.v1_0.EmployeeDetailsSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Administrator
 * @generated
 */
@Generated("")
public class EmployeeDetails implements Cloneable, Serializable {

	public static EmployeeDetails toDTO(String json) {
		return EmployeeDetailsSerDes.toDTO(json);
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentId(
		UnsafeSupplier<Long, Exception> departmentIdUnsafeSupplier) {

		try {
			departmentId = departmentIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long departmentId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeId(
		UnsafeSupplier<Long, Exception> employeeIdUnsafeSupplier) {

		try {
			employeeId = employeeIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long employeeId;

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setJobTitle(
		UnsafeSupplier<String, Exception> jobTitleUnsafeSupplier) {

		try {
			jobTitle = jobTitleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String jobTitle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public void setSalary(
		UnsafeSupplier<Long, Exception> salaryUnsafeSupplier) {

		try {
			salary = salaryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long salary;

	@Override
	public EmployeeDetails clone() throws CloneNotSupportedException {
		return (EmployeeDetails)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeDetails)) {
			return false;
		}

		EmployeeDetails employeeDetails = (EmployeeDetails)object;

		return Objects.equals(toString(), employeeDetails.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EmployeeDetailsSerDes.toJSON(this);
	}

}
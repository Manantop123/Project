package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="job_profile")
public class emp {
	private int id;
	private String job;
	private double salary;
	private empinfo info;
	
	
	@Id
	@GenericGenerator(name="inc" ,strategy = "increment")
	@GeneratedValue(generator = "inc")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="job")
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(name="salary")
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinColumn(name="info")
	public empinfo getInfo() {
		return info;
	}
	public void setInfo(empinfo info) {
		this.info = info;
	}
		
}

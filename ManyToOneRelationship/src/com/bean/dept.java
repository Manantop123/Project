package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="deprtment")
public class dept {
	private int d_id;
	private String d_name , d_loc;
	private Collection<emp> emp;
	
	@Id
	@GenericGenerator(name="inc" ,strategy = "increment")
	@GeneratedValue(generator = "inc")
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	
	@Column(name="d_name")
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	@Column(name="d_loc")
	public String getD_loc() {
		return d_loc;
	}
	public void setD_loc(String d_loc) {
		this.d_loc = d_loc;
	}
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "dept")
	public Collection<emp> getEmp() {
		return emp;
	}
	public void setEmp(Collection<emp> emp) {
		this.emp = emp;
	}
	
	
}

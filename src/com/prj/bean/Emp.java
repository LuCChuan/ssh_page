package com.prj.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "EMP", schema = "SCOTT")
public class Emp implements java.io.Serializable {

	// Fields

	private Short empno;
	private Dept dept;
	private String ename;
	private String job;
	private Short mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(Short empno) {
		this.empno = empno;
	}

	/** full constructor */
	public Emp(Short empno, Dept dept, String ename, String job, Short mgr,
			Date hiredate, Double sal, Double comm) {
		this.empno = empno;
		this.dept = dept;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	// Property accessors
	@Id
	@Column(name = "EMPNO", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getEmpno() {
		return this.empno;
	}

	public void setEmpno(Short empno) {
		this.empno = empno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPTNO")
	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Column(name = "ENAME", length = 10)
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Column(name = "JOB", length = 9)
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name = "MGR", precision = 4, scale = 0)
	public Short getMgr() {
		return this.mgr;
	}

	public void setMgr(Short mgr) {
		this.mgr = mgr;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "HIREDATE", length = 7)
	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Column(name = "SAL", precision = 7)
	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Column(name = "COMM", precision = 7)
	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

}
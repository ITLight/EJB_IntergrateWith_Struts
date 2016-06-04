package com.scb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the SCBCS_USER database table.
 * 
 */
@Entity
@Table(name="SCBCS_USER")
@NamedQuery(name="ScbcsUser.findAll", query="SELECT s FROM ScbcsUser s")
public class ScbcsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String active;

	@Temporal(TemporalType.DATE)
	private Date activedate;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Temporal(TemporalType.DATE)
	private Date changepass;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_USER")
	private String createdUser;

	private String depid;

	private String firstlogon;

	@Temporal(TemporalType.DATE)
	private Date fromdate;

	private String fullname;

	@Temporal(TemporalType.DATE)
	private Date lastlogon;

	private String password;

	private String pin;

	@Column(name="STAFF_ID")
	private String staffId;

	private String supervisor;

	@Temporal(TemporalType.DATE)
	private Date todate;

	private String userlock;

	@Temporal(TemporalType.DATE)
	private Date userlockdate;

	private String usertype;

	public ScbcsUser() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Date getActivedate() {
		return this.activedate;
	}

	public void setActivedate(Date activedate) {
		this.activedate = activedate;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Date getChangepass() {
		return this.changepass;
	}

	public void setChangepass(Date changepass) {
		this.changepass = changepass;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getFirstlogon() {
		return this.firstlogon;
	}

	public void setFirstlogon(String firstlogon) {
		this.firstlogon = firstlogon;
	}

	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getLastlogon() {
		return this.lastlogon;
	}

	public void setLastlogon(Date lastlogon) {
		this.lastlogon = lastlogon;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public String getUserlock() {
		return this.userlock;
	}

	public void setUserlock(String userlock) {
		this.userlock = userlock;
	}

	public Date getUserlockdate() {
		return this.userlockdate;
	}

	public void setUserlockdate(Date userlockdate) {
		this.userlockdate = userlockdate;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

}
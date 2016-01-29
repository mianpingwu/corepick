package com.wump.model;

import java.util.Date;

public class Member {

	private Long customerId;

	private String academyNo;

	private String createBy;

	private Date createDate;

	private Date effectiveDate;

	private Date firstJoinDate;

	private String internalRemark;

	private String relationshipCode;

	private String status;

	private Date terminationDate;

	private String updateBy;

	private Date updateDate;

	private Long superiorMemberId;

	private String memberType;

	private String userId;

	private Long version;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getAcademyNo() {
		return academyNo;
	}

	public void setAcademyNo(String academyNo) {
		this.academyNo = academyNo;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getFirstJoinDate() {
		return firstJoinDate;
	}

	public void setFirstJoinDate(Date firstJoinDate) {
		this.firstJoinDate = firstJoinDate;
	}

	public String getInternalRemark() {
		return internalRemark;
	}

	public void setInternalRemark(String internalRemark) {
		this.internalRemark = internalRemark;
	}

	public String getRelationshipCode() {
		return relationshipCode;
	}

	public void setRelationshipCode(String relationshipCode) {
		this.relationshipCode = relationshipCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getSuperiorMemberId() {
		return superiorMemberId;
	}

	public void setSuperiorMemberId(Long superiorMemberId) {
		this.superiorMemberId = superiorMemberId;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
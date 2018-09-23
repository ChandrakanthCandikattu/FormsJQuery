package com.chandrakanth.financesystem.entity.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.chandrakanth.financesystem.entity.UserCredentials;
import com.chandrakanth.financesystem.entity.VehicleDetails;

public class PersonalIdentityDocsDTO {

	public PersonalIdentityDocsDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This Parameterized constructor is added for Testing Purpose only.
	 * 
	 * @param seqPiDOC
	 * @param activeStatus
	 * @param panId
	 * @param aadharId
	 * @param passportId
	 * @param dlId
	 * @param nsrId
	 * @param voterId
	 * @param referenceNumber
	 * @param vRegNumber
	 * @param vehicleClass
	 * @param vehicleClassDesc
	 * @param piDocType
	 * @param piDocCtgryType
	 * @param primaryMobileNumber
	 * @param piAlternateMobile
	 * @param docHolderName
	 * @param piParentSpouseGuardian
	 * @param parentSpseGrdRelation
	 * @param bloodGroup
	 * @param dateOfBirth
	 * @param piAddress
	 * @param piAddressCity
	 * @param piAddressState
	 * @param piAddressPin
	 * @param firstIssueDate
	 * @param reIssueDate
	 * @param reIssueIndicator
	 * @param tenureNumber
	 * @param expiryDate
	 * @param createdDateTime
	 * @param modifiedDateTime
	 * @param userCredentials
	 * @param vehicleDetails
	 */
	public PersonalIdentityDocsDTO(String seqPiDOC, String activeStatus, String panId, String aadharId,
			String passportId, String dlId, String nsrId, String voterId, String referenceNumber, String vRegNumber,
			String vehicleClass, String vehicleClassDesc, String piDocType, String piDocCtgryType,
			String primaryMobileNumber, String piAlternateMobile, String docHolderName, String piParentSpouseGuardian,
			String parentSpseGrdRelation, String bloodGroup, String dateOfBirth, String piAddress, String piAddressCity,
			String piAddressState, String piAddressPin, String firstIssueDate, String reIssueDate,
			Character reIssueIndicator, String tenureNumber, String expiryDate, String createdDateTime,
			String modifiedDateTime) {
		super();
		this.seqPiDOC = seqPiDOC;
		this.activeStatus = activeStatus;
		this.panId = panId;
		this.aadharId = aadharId;
		this.passportId = passportId;
		this.dlId = dlId;
		this.nsrId = nsrId;
		this.voterId = voterId;
		this.referenceNumber = referenceNumber;
		this.vRegNumber = vRegNumber;
		this.vehicleClass = vehicleClass;
		this.vehicleClassDesc = vehicleClassDesc;
		this.piDocType = piDocType;
		this.piDocCtgryType = piDocCtgryType;
		this.primaryMobileNumber = primaryMobileNumber;
		this.piAlternateMobile = piAlternateMobile;
		this.docHolderName = docHolderName;
		this.piParentSpouseGuardian = piParentSpouseGuardian;
		this.parentSpseGrdRelation = parentSpseGrdRelation;
		this.bloodGroup = bloodGroup;
		this.dateOfBirth = dateOfBirth;
		this.piAddress = piAddress;
		this.piAddressCity = piAddressCity;
		this.piAddressState = piAddressState;
		this.piAddressPin = piAddressPin;
		this.firstIssueDate = firstIssueDate;
		this.reIssueDate = reIssueDate;
		this.reIssueIndicator = reIssueIndicator;
		this.tenureNumber = tenureNumber;
		this.expiryDate = expiryDate;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	private String seqPiDOC;
	private String activeStatus;
	private String panId;
	private String aadharId;
	private String passportId;
	private String dlId;
	private String nsrId;
	private String voterId;
	private String referenceNumber;
	private String vRegNumber;
	private String vehicleClass;
	private String vehicleClassDesc;
	private String piDocType;
	private String piDocCtgryType;
	private String primaryMobileNumber;
	private String piAlternateMobile;
	private String docHolderName;
	private String piParentSpouseGuardian;
	private String parentSpseGrdRelation;
	private String bloodGroup;
	private String dateOfBirth;
	private String piAddress;
	private String piAddressCity;
	private String piAddressState;
	private String piAddressPin;
	private String firstIssueDate;
	private String reIssueDate;
	private Character reIssueIndicator;
	private String tenureNumber;
	private String expiryDate;
	private String createdDateTime;
	private String modifiedDateTime;

	/**
	 * @return the seqPiDOC
	 */
	public String getSeqPiDOC() {
		return seqPiDOC;
	}

	/**
	 * @param seqPiDOC
	 *            the seqPiDOC to set
	 */
	public void setSeqPiDOC(String seqPiDOC) {
		this.seqPiDOC = seqPiDOC;
	}

	/**
	 * @return the activeStatus
	 */
	public String getActiveStatus() {
		return activeStatus;
	}

	/**
	 * @param activeStatus
	 *            the activeStatus to set
	 */
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	/**
	 * @return the panId
	 */
	public String getPanId() {
		return panId;
	}

	/**
	 * @param panId
	 *            the panId to set
	 */
	public void setPanId(String panId) {
		this.panId = panId;
	}

	/**
	 * @return the aadharId
	 */
	public String getAadharId() {
		return aadharId;
	}

	/**
	 * @param aadharId
	 *            the aadharId to set
	 */
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	/**
	 * @return the passportId
	 */
	public String getPassportId() {
		return passportId;
	}

	/**
	 * @param passportId
	 *            the passportId to set
	 */
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	/**
	 * @return the dlId
	 */
	public String getDlId() {
		return dlId;
	}

	/**
	 * @param dlId
	 *            the dlId to set
	 */
	public void setDlId(String dlId) {
		this.dlId = dlId;
	}

	/**
	 * @return the nsrId
	 */
	public String getNsrId() {
		return nsrId;
	}

	/**
	 * @param nsrId
	 *            the nsrId to set
	 */
	public void setNsrId(String nsrId) {
		this.nsrId = nsrId;
	}

	/**
	 * @return the voterId
	 */
	public String getVoterId() {
		return voterId;
	}

	/**
	 * @param voterId
	 *            the voterId to set
	 */
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * @param referenceNumber
	 *            the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * @return the vRegNumber
	 */
	public String getvRegNumber() {
		return vRegNumber;
	}

	/**
	 * @param vRegNumber
	 *            the vRegNumber to set
	 */
	public void setvRegNumber(String vRegNumber) {
		this.vRegNumber = vRegNumber;
	}

	/**
	 * @return the vehicleClass
	 */
	public String getVehicleClass() {
		return vehicleClass;
	}

	/**
	 * @param vehicleClass
	 *            the vehicleClass to set
	 */
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	/**
	 * @return the vehicleClassDesc
	 */
	public String getVehicleClassDesc() {
		return vehicleClassDesc;
	}

	/**
	 * @param vehicleClassDesc
	 *            the vehicleClassDesc to set
	 */
	public void setVehicleClassDesc(String vehicleClassDesc) {
		this.vehicleClassDesc = vehicleClassDesc;
	}

	/**
	 * @return the piDocType
	 */
	public String getPiDocType() {
		return piDocType;
	}

	/**
	 * @param piDocType
	 *            the piDocType to set
	 */
	public void setPiDocType(String piDocType) {
		this.piDocType = piDocType;
	}

	/**
	 * @return the piDocCtgryType
	 */
	public String getPiDocCtgryType() {
		return piDocCtgryType;
	}

	/**
	 * @param piDocCtgryType
	 *            the piDocCtgryType to set
	 */
	public void setPiDocCtgryType(String piDocCtgryType) {
		this.piDocCtgryType = piDocCtgryType;
	}

	/**
	 * @return the primaryMobileNumber
	 */
	public String getPrimaryMobileNumber() {
		return primaryMobileNumber;
	}

	/**
	 * @param primaryMobileNumber
	 *            the primaryMobileNumber to set
	 */
	public void setPrimaryMobileNumber(String primaryMobileNumber) {
		this.primaryMobileNumber = primaryMobileNumber;
	}

	/**
	 * @return the piAlternateMobile
	 */
	public String getPiAlternateMobile() {
		return piAlternateMobile;
	}

	/**
	 * @param piAlternateMobile
	 *            the piAlternateMobile to set
	 */
	public void setPiAlternateMobile(String piAlternateMobile) {
		this.piAlternateMobile = piAlternateMobile;
	}

	/**
	 * @return the docHolderName
	 */
	public String getDocHolderName() {
		return docHolderName;
	}

	/**
	 * @param docHolderName
	 *            the docHolderName to set
	 */
	public void setDocHolderName(String docHolderName) {
		this.docHolderName = docHolderName;
	}

	/**
	 * @return the piParentSpouseGuardian
	 */
	public String getPiParentSpouseGuardian() {
		return piParentSpouseGuardian;
	}

	/**
	 * @param piParentSpouseGuardian
	 *            the piParentSpouseGuardian to set
	 */
	public void setPiParentSpouseGuardian(String piParentSpouseGuardian) {
		this.piParentSpouseGuardian = piParentSpouseGuardian;
	}

	/**
	 * @return the parentSpseGrdRelation
	 */
	public String getParentSpseGrdRelation() {
		return parentSpseGrdRelation;
	}

	/**
	 * @param parentSpseGrdRelation
	 *            the parentSpseGrdRelation to set
	 */
	public void setParentSpseGrdRelation(String parentSpseGrdRelation) {
		this.parentSpseGrdRelation = parentSpseGrdRelation;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the piAddress
	 */
	public String getPiAddress() {
		return piAddress;
	}

	/**
	 * @param piAddress
	 *            the piAddress to set
	 */
	public void setPiAddress(String piAddress) {
		this.piAddress = piAddress;
	}

	/**
	 * @return the piAddressCity
	 */
	public String getPiAddressCity() {
		return piAddressCity;
	}

	/**
	 * @param piAddressCity
	 *            the piAddressCity to set
	 */
	public void setPiAddressCity(String piAddressCity) {
		this.piAddressCity = piAddressCity;
	}

	/**
	 * @return the piAddressState
	 */
	public String getPiAddressState() {
		return piAddressState;
	}

	/**
	 * @param piAddressState
	 *            the piAddressState to set
	 */
	public void setPiAddressState(String piAddressState) {
		this.piAddressState = piAddressState;
	}

	/**
	 * @return the piAddressPin
	 */
	public String getPiAddressPin() {
		return piAddressPin;
	}

	/**
	 * @param piAddressPin
	 *            the piAddressPin to set
	 */
	public void setPiAddressPin(String piAddressPin) {
		this.piAddressPin = piAddressPin;
	}

	/**
	 * @return the firstIssueDate
	 */
	public String getFirstIssueDate() {
		return firstIssueDate;
	}

	/**
	 * @param firstIssueDate
	 *            the firstIssueDate to set
	 */
	public void setFirstIssueDate(String firstIssueDate) {
		this.firstIssueDate = firstIssueDate;
	}

	/**
	 * @return the reIssueDate
	 */
	public String getReIssueDate() {
		return reIssueDate;
	}

	/**
	 * @param reIssueDate
	 *            the reIssueDate to set
	 */
	public void setReIssueDate(String reIssueDate) {
		this.reIssueDate = reIssueDate;
	}

	/**
	 * @return the reIssueIndicator
	 */
	public Character getReIssueIndicator() {
		return reIssueIndicator;
	}

	/**
	 * @param reIssueIndicator
	 *            the reIssueIndicator to set
	 */
	public void setReIssueIndicator(Character reIssueIndicator) {
		this.reIssueIndicator = reIssueIndicator;
	}

	/**
	 * @return the tenureNumber
	 */
	public String getTenureNumber() {
		return tenureNumber;
	}

	/**
	 * @param tenureNumber
	 *            the tenureNumber to set
	 */
	public void setTenureNumber(String tenureNumber) {
		this.tenureNumber = tenureNumber;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the createdDateTime
	 */
	public String getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime
	 *            the createdDateTime to set
	 */
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	/**
	 * @return the modifiedDateTime
	 */
	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	/**
	 * @param modifiedDateTime
	 *            the modifiedDateTime to set
	 */
	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

}

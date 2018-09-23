package com.chandrakanth.financesystem.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Chandrakanth
 *
 */
/**
 * This entity deails with Personal Identity Documents - viz. Aadhar, PAN, Voter
 * ID, Driving License
 *
 */

@Entity
@Table(name = "PERSONAL_IDENTITY_DOCS")
public class PersonalIdentityDocs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PI_DOCS")
	@SequenceGenerator(allocationSize = 50, name = "SEQ_PI_DOCS", sequenceName = "SEQ_PI_DOCS")
	@Column(name = "SEQ_PI_DOCS")
	private String seqPiDOC;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	@Column(name = "ACTIVE_STATUS", columnDefinition = "DEFAULTS TO 'Y' IN DB")
	private String activeStatus;
	@Column(name = "PAN_ID")
	private String panId;
	@Column(name = "AADHAR_ID")
	private String aadharId;
	@Column(name = "PASSPORT_ID")
	private String passportId;
	@Column(name = "DL_ID")
	private String dlId;
	@Column(name = "NSR_ID")
	private String nsrId;
	@Column(name = "VOTER_ID")
	private String voterId;
	@Column(name = "REFERENCE_NUMBER", columnDefinition = "APPLICABLE ONLY TO DRIVING LICENSE")
	private String referenceNumber;
	@Column(name = "V_REG_NUMBER", columnDefinition = "FOREIGN KEY REFERENCING VEHICLE_DETAILS ENTITY")
	private String vRegNumber;
	@Column(name = "V_CLASS", nullable = true)
	private String vehicleClass;
	@Column(name = "V_CLASS_DESC", nullable = true)
	private String vehicleClassDesc;
	@Column(name = "PI_DOC_TYPE")
	private String piDocType;
	@Column(name = "PI_DOC_CTGRY_TYPE")
	private String piDocCtgryType;
	@Column(name = "PI_PRIMARY_MOB_NUM")
	private String primaryMobileNumber;
	@Column(name = "PI_ALTERNATE_MOB_NUM", nullable = true)
	private String piAlternateMobile;
	@Column(name = "DOC_HOLDER_NAME")
	private String docHolderName;
	@Column(name = "PI_PRNT_SPSE_GRDN")
	private String piParentSpouseGuardian;
	@Column(name = "PRNT_SPSE_GRDN_REL")
	private String parentSpseGrdRelation;
	@Column(name = "BLOOD_GRP")
	private String bloodGroup;
	@Column(name = "PI_DATE_OF_BIRTH")
	private String dateOfBirth;
	@Column(name = "PI_ADDRESS")
	private String piAddress;
	@Column(name = "PI_ADDR_CITY")
	private String piAddressCity;
	@Column(name = "PI_ADDR_STATE")
	private String piAddressState;
	@Column(name = "PI_ADDR_PINCODE")
	private String piAddressPin;
	@Column(name = "FIRST_ISSUE_DATE")
	private String firstIssueDate;
	@Column(name = "RE_ISSUE_DATE")
	private String reIssueDate;
	@Column(name = "REISSUE_INDICATOR")
	private Character reIssueIndicator;
	@Column(name = "TENURE_NUMBER")
	private String tenureNumber;
	@Column(name = "EXPIRY_DATE")
	private String expiryDate;
	@Column(name = "CREATED_DATETIME")
	private String createdDateTime;
	@Column(name = "MODIFIED_DATETIME")
	private String modifiedDateTime;


	public String getSeqPiDOC() {
		return seqPiDOC;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void setSeqPiDOC(final String seqPiDOC) {
		this.seqPiDOC = seqPiDOC;
	}

	public String getPiAlternateMobile() {
		return piAlternateMobile;
	}

	public void setPiAlternateMobile(final String piAlternateMobile) {
		this.piAlternateMobile = piAlternateMobile;
	}

	public String getPiParentSpouseGuardian() {
		return piParentSpouseGuardian;
	}

	public void setPiParentSpouseGuardian(final String piParentSpouseGuardian) {
		this.piParentSpouseGuardian = piParentSpouseGuardian;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPiAddress() {
		return piAddress;
	}

	public void setPiAddress(final String piAddress) {
		this.piAddress = piAddress;
	}

	public String getPiAddressCity() {
		return piAddressCity;
	}

	public void setPiAddressCity(final String piAddressCity) {
		this.piAddressCity = piAddressCity;
	}

	public String getPiAddressState() {
		return piAddressState;
	}

	public void setPiAddressState(final String piAddressState) {
		this.piAddressState = piAddressState;
	}

	public String getPiAddressPin() {
		return piAddressPin;
	}

	public void setPiAddressPin(final String piAddressPin) {
		this.piAddressPin = piAddressPin;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getDlId() {
		return dlId;
	}

	public void setDlId(String dlId) {
		this.dlId = dlId;
	}

	public String getNsrId() {
		return nsrId;
	}

	public void setNsrId(String nsrId) {
		this.nsrId = nsrId;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getvRegNumber() {
		return vRegNumber;
	}

	public void setvRegNumber(String vRegNumber) {
		this.vRegNumber = vRegNumber;
	}

	public String getPiDocType() {
		return piDocType;
	}

	public void setPiDocType(String piDocType) {
		this.piDocType = piDocType;
	}

	public String getPrimaryMobileNumber() {
		return primaryMobileNumber;
	}

	public void setPrimaryMobileNumber(String primaryMobileNumber) {
		this.primaryMobileNumber = primaryMobileNumber;
	}

	public String getDocHolderName() {
		return docHolderName;
	}

	public void setDocHolderName(String docHolderName) {
		this.docHolderName = docHolderName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getReIssueDate() {
		return reIssueDate;
	}

	public void setReIssueDate(String reIssueDate) {
		this.reIssueDate = reIssueDate;
	}

	public Character getReIssueIndicator() {
		return reIssueIndicator;
	}

	public void setReIssueIndicator(Character reIssueIndicator) {
		this.reIssueIndicator = reIssueIndicator;
	}

	public String getTenureNumber() {
		return tenureNumber;
	}

	public void setTenureNumber(String tenureNumber) {
		this.tenureNumber = tenureNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClassDesc() {
		return vehicleClassDesc;
	}

	public void setVehicleClassDesc(String vehicleClassDesc) {
		this.vehicleClassDesc = vehicleClassDesc;
	}

	public String getPiDocCtgryType() {
		return piDocCtgryType;
	}

	public void setPiDocCtgryType(String piDocCtgryType) {
		this.piDocCtgryType = piDocCtgryType;
	}

	public String getParentSpseGrdRelation() {
		return parentSpseGrdRelation;
	}

	public void setParentSpseGrdRelation(String parentSpseGrdRelation) {
		this.parentSpseGrdRelation = parentSpseGrdRelation;
	}

	public String getFirstIssueDate() {
		return firstIssueDate;
	}

	public void setFirstIssueDate(String firstIssueDate) {
		this.firstIssueDate = firstIssueDate;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharId == null) ? 0 : aadharId.hashCode());
		result = prime * result + ((activeStatus == null) ? 0 : activeStatus.hashCode());
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((createdDateTime == null) ? 0 : createdDateTime.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((dlId == null) ? 0 : dlId.hashCode());
		result = prime * result + ((docHolderName == null) ? 0 : docHolderName.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((firstIssueDate == null) ? 0 : firstIssueDate.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((modifiedDateTime == null) ? 0 : modifiedDateTime.hashCode());
		result = prime * result + ((nsrId == null) ? 0 : nsrId.hashCode());
		result = prime * result + ((panId == null) ? 0 : panId.hashCode());
		result = prime * result + ((parentSpseGrdRelation == null) ? 0 : parentSpseGrdRelation.hashCode());
		result = prime * result + ((passportId == null) ? 0 : passportId.hashCode());
		result = prime * result + ((piAddress == null) ? 0 : piAddress.hashCode());
		result = prime * result + ((piAddressCity == null) ? 0 : piAddressCity.hashCode());
		result = prime * result + ((piAddressPin == null) ? 0 : piAddressPin.hashCode());
		result = prime * result + ((piAddressState == null) ? 0 : piAddressState.hashCode());
		result = prime * result + ((piAlternateMobile == null) ? 0 : piAlternateMobile.hashCode());
		result = prime * result + ((piDocCtgryType == null) ? 0 : piDocCtgryType.hashCode());
		result = prime * result + ((piDocType == null) ? 0 : piDocType.hashCode());
		result = prime * result + ((piParentSpouseGuardian == null) ? 0 : piParentSpouseGuardian.hashCode());
		result = prime * result + ((primaryMobileNumber == null) ? 0 : primaryMobileNumber.hashCode());
		result = prime * result + ((reIssueDate == null) ? 0 : reIssueDate.hashCode());
		result = prime * result + ((reIssueIndicator == null) ? 0 : reIssueIndicator.hashCode());
		result = prime * result + ((referenceNumber == null) ? 0 : referenceNumber.hashCode());
		result = prime * result + ((tenureNumber == null) ? 0 : tenureNumber.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((vRegNumber == null) ? 0 : vRegNumber.hashCode());
		result = prime * result + ((vehicleClass == null) ? 0 : vehicleClass.hashCode());
		result = prime * result + ((vehicleClassDesc == null) ? 0 : vehicleClassDesc.hashCode());
		result = prime * result + ((voterId == null) ? 0 : voterId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalIdentityDocs other = (PersonalIdentityDocs) obj;
		if (aadharId == null) {
			if (other.aadharId != null)
				return false;
		} else if (!aadharId.equals(other.aadharId))
			return false;
		if (activeStatus == null) {
			if (other.activeStatus != null)
				return false;
		} else if (!activeStatus.equals(other.activeStatus))
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (createdDateTime == null) {
			if (other.createdDateTime != null)
				return false;
		} else if (!createdDateTime.equals(other.createdDateTime))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dlId == null) {
			if (other.dlId != null)
				return false;
		} else if (!dlId.equals(other.dlId))
			return false;
		if (docHolderName == null) {
			if (other.docHolderName != null)
				return false;
		} else if (!docHolderName.equals(other.docHolderName))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (firstIssueDate == null) {
			if (other.firstIssueDate != null)
				return false;
		} else if (!firstIssueDate.equals(other.firstIssueDate))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (modifiedDateTime == null) {
			if (other.modifiedDateTime != null)
				return false;
		} else if (!modifiedDateTime.equals(other.modifiedDateTime))
			return false;
		if (nsrId == null) {
			if (other.nsrId != null)
				return false;
		} else if (!nsrId.equals(other.nsrId))
			return false;
		if (panId == null) {
			if (other.panId != null)
				return false;
		} else if (!panId.equals(other.panId))
			return false;
		if (parentSpseGrdRelation == null) {
			if (other.parentSpseGrdRelation != null)
				return false;
		} else if (!parentSpseGrdRelation.equals(other.parentSpseGrdRelation))
			return false;
		if (passportId == null) {
			if (other.passportId != null)
				return false;
		} else if (!passportId.equals(other.passportId))
			return false;
		if (piAddress == null) {
			if (other.piAddress != null)
				return false;
		} else if (!piAddress.equals(other.piAddress))
			return false;
		if (piAddressCity == null) {
			if (other.piAddressCity != null)
				return false;
		} else if (!piAddressCity.equals(other.piAddressCity))
			return false;
		if (piAddressPin == null) {
			if (other.piAddressPin != null)
				return false;
		} else if (!piAddressPin.equals(other.piAddressPin))
			return false;
		if (piAddressState == null) {
			if (other.piAddressState != null)
				return false;
		} else if (!piAddressState.equals(other.piAddressState))
			return false;
		if (piAlternateMobile == null) {
			if (other.piAlternateMobile != null)
				return false;
		} else if (!piAlternateMobile.equals(other.piAlternateMobile))
			return false;
		if (piDocCtgryType == null) {
			if (other.piDocCtgryType != null)
				return false;
		} else if (!piDocCtgryType.equals(other.piDocCtgryType))
			return false;
		if (piDocType == null) {
			if (other.piDocType != null)
				return false;
		} else if (!piDocType.equals(other.piDocType))
			return false;
		if (piParentSpouseGuardian == null) {
			if (other.piParentSpouseGuardian != null)
				return false;
		} else if (!piParentSpouseGuardian.equals(other.piParentSpouseGuardian))
			return false;
		if (primaryMobileNumber == null) {
			if (other.primaryMobileNumber != null)
				return false;
		} else if (!primaryMobileNumber.equals(other.primaryMobileNumber))
			return false;
		if (reIssueDate == null) {
			if (other.reIssueDate != null)
				return false;
		} else if (!reIssueDate.equals(other.reIssueDate))
			return false;
		if (reIssueIndicator == null) {
			if (other.reIssueIndicator != null)
				return false;
		} else if (!reIssueIndicator.equals(other.reIssueIndicator))
			return false;
		if (referenceNumber == null) {
			if (other.referenceNumber != null)
				return false;
		} else if (!referenceNumber.equals(other.referenceNumber))
			return false;
		if (tenureNumber == null) {
			if (other.tenureNumber != null)
				return false;
		} else if (!tenureNumber.equals(other.tenureNumber))
			return false;
		
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (vRegNumber == null) {
			if (other.vRegNumber != null)
				return false;
		} else if (!vRegNumber.equals(other.vRegNumber))
			return false;
		if (vehicleClass == null) {
			if (other.vehicleClass != null)
				return false;
		} else if (!vehicleClass.equals(other.vehicleClass))
			return false;
		if (vehicleClassDesc == null) {
			if (other.vehicleClassDesc != null)
				return false;
		} else if (!vehicleClassDesc.equals(other.vehicleClassDesc))
			return false;
		if (voterId == null) {
			if (other.voterId != null)
				return false;
		} else if (!voterId.equals(other.voterId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

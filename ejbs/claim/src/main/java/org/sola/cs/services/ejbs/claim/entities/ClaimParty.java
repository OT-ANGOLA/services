package org.sola.cs.services.ejbs.claim.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.entities.AbstractVersionedEntity;

@Table(schema = "opentenure", name = "party")
public class ClaimParty extends AbstractVersionedEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "id_type_code")
    private String idTypeCode;
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "gender_code")
    private String genderCode;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "user_name", updatable = false)
    private String userName;
    @Column(name="is_person")
    private boolean person;
    
    @Column(name = "other_name")
    private String otherName;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "id_issuance_date")
    private Date idIssuanceDate;
    @Column(name = "id_issuance_country")
    private String idIssuanceCountryCode;
    @Column(name = "id_issuance_province")
    private String idIssuanceProvinceCode;
    @Column(name = "birth_country_code")
    private String birthCountryCode;
    @Column(name = "birth_commune_code")
    private String birthCommuneCode;
    @Column(name = "residence_commune_code")
    private String residenceCommuneCode;
    @Column(name = "beneficiary_name")
    private String beneficiaryName;
    @Column(name = "beneficiary_id_number")
    private String beneficiaryIdNumber;
    @Column(name = "marital_status_code")
    private String maritalStatusCode;
    
    public ClaimParty(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdTypeCode() {
        return idTypeCode;
    }

    public void setIdTypeCode(String idTypeCode) {
        this.idTypeCode = idTypeCode;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public boolean isPerson() {
        return person;
    }

    public void setPerson(boolean person) {
        this.person = person;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Date getIdIssuanceDate() {
        return idIssuanceDate;
    }

    public void setIdIssuanceDate(Date idIssuanceDate) {
        this.idIssuanceDate = idIssuanceDate;
    }

    public String getIdIssuanceCountryCode() {
        return idIssuanceCountryCode;
    }

    public void setIdIssuanceCountryCode(String idIssuanceCountryCode) {
        this.idIssuanceCountryCode = idIssuanceCountryCode;
    }

    public String getIdIssuanceProvinceCode() {
        return idIssuanceProvinceCode;
    }

    public void setIdIssuanceProvinceCode(String idIssuanceProvinceCode) {
        this.idIssuanceProvinceCode = idIssuanceProvinceCode;
    }

    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    public void setBirthCountryCode(String birthCountryCode) {
        this.birthCountryCode = birthCountryCode;
    }

    public String getBirthCommuneCode() {
        return birthCommuneCode;
    }

    public void setBirthCommuneCode(String birthCommuneCode) {
        this.birthCommuneCode = birthCommuneCode;
    }

    public String getResidenceCommuneCode() {
        return residenceCommuneCode;
    }

    public void setResidenceCommuneCode(String residenceCommuneCode) {
        this.residenceCommuneCode = residenceCommuneCode;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryIdNumber() {
        return beneficiaryIdNumber;
    }

    public void setBeneficiaryIdNumber(String beneficiaryIdNumber) {
        this.beneficiaryIdNumber = beneficiaryIdNumber;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }
}

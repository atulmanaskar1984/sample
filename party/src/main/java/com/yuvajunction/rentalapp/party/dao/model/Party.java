package com.yuvajunction.rentalapp.party.dao.model;

import java.util.Map;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.yuvajunction.rentalapp.party.dao.model.converter.AddressConverter;

@DynamoDBTable(tableName="Party")
public class Party {
	
	private String partyid;
	private String firstName;
	private String middleName;
	private String lastName;
	private Set<PartyAddress> partyAddresses;
	private String emailID;
	private String cellPhone;
	
	
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey(attributeName="partyid")
	public String getPartyid() {
		return partyid;
	}
	public void setPartyid(String partyid) {
		this.partyid = partyid;
	}
	
	
	@DynamoDBAttribute(attributeName="firstname")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@DynamoDBAttribute(attributeName="middlename")
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	@DynamoDBAttribute(attributeName="lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@DynamoDBTypeConverted(converter = AddressConverter.class)
	@DynamoDBAttribute(attributeName="address")
	public Set<PartyAddress> getPartyAddresses() {
		return partyAddresses;
	}
	public void setPartyAddresses(Set<PartyAddress> partyAddresses) {
		this.partyAddresses = partyAddresses;
	}
	
	@DynamoDBAttribute(attributeName="email")
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	@DynamoDBAttribute(attributeName="cellPhone")
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
}
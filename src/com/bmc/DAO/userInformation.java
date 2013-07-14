package com.bmc.DAO;

public class userInformation 
{
String username;
String password;
String sourceIp;
boolean authenticated;
boolean disabled;
String firstName;
String lastName;
String occupation;
String company;
String phonenumber;
String biography;
String url;
String expertise;
String joindate;
String alternatephonenumber;
String alternateemail;

public userInformation(String username,String password,String sourceIp,boolean authenticated,boolean disabled,String firstName,String lastName,String occupation,String company,String phonenumber,String biography,String url,String expertise,String joindate,String alternatephonenumber,String alternateemail)
{
	this.username=username;
	this.password=password;
	this.sourceIp=sourceIp;
	this.authenticated=authenticated;
	this.disabled=disabled;
	this.firstName=firstName;
	this.lastName=lastName;
	this.occupation=occupation;
	this.company=company;
	this.phonenumber=phonenumber;
	this.biography=biography;
	this.url=url;
	this.expertise=expertise;
	this.joindate=joindate;
	this.alternatephonenumber=alternatephonenumber;
	this.alternateemail=alternateemail;
	
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getBiography() {
	return biography;
}
public void setBiography(String biography) {
	this.biography = biography;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getExpertise() {
	return expertise;
}
public void setExpertise(String expertise) {
	this.expertise = expertise;
}
public String getJoindate() {
	return joindate;
}
public void setJoindate(String joindate) {
	this.joindate = joindate;
}
public String getAlternatephonenumber() {
	return alternatephonenumber;
}
public void setAlternatephonenumber(String alternatephonenumber) {
	this.alternatephonenumber = alternatephonenumber;
}
public String getAlternateemail() {
	return alternateemail;
}
public void setAlternateemail(String alternateemail) {
	this.alternateemail = alternateemail;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSourceIp() {
	return sourceIp;
}
public void setSourceIp(String sourceIp) {
	this.sourceIp = sourceIp;
}
public boolean isAuthenticated() {
	return authenticated;
}
public void setAuthenticated(boolean authenticated) {
	this.authenticated = authenticated;
}
public boolean isDisabled() {
	return disabled;
}
public void setDisabled(boolean disabled) {
	this.disabled = disabled;
}

}

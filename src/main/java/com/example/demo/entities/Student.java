package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`users`")
public class Student {
	@Id
   private String username;
   private String first_name;
   private String Last_name;
   private String Date_of_birth;
   private String email_id;
   private String Password;
public Student() {
	super();
}

public Student(String username, String first_name, String last_name, String date_of_birth, String email_id,
		String password) {
	super();
	this.username = username;
	this.first_name = first_name;
	Last_name = last_name;
	Date_of_birth = date_of_birth;
	this.email_id = email_id;
	Password = password;
}


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return Last_name;
}
public void setLast_name(String last_name) {
	Last_name = last_name;
}
public String getDate_of_birth() {
	return Date_of_birth;
}
public void setDate_of_birth(String date_of_birth) {
	Date_of_birth = date_of_birth;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
   
   
}
//   
//public Student(long id, String username, String first_name, String last_name, String date_of_birth, String email_id,String Password) {
//	super();
//	this.username = username;
//	this.first_name = first_name;
//	Last_name = last_name;
//	Date_of_birth = date_of_birth;
//	this.email_id = email_id;
//	this.Password = Password;
//}
//
//public Student() {
//	super();
//}
//
//public long getId() {
//	return id;
//}
//public void setId(long id) {
//	this.id = id;
//}
//public String getUsername() {
//	return username;
//}
//public void setUsername(String username) {
//	this.username = username;
//}
//public String getFirst_name() {
//	return first_name;
//}
//public void setFirst_name(String first_name) {
//	this.first_name = first_name;
//}
//public String getLast_name() {
//	return Last_name;
//}
//public void setLast_name(String last_name) {
//	Last_name = last_name;
//}
//public String getDate_of_birth() {
//	return Date_of_birth;
//}
//public void setDate_of_birth(String date_of_birth) {
//	Date_of_birth = date_of_birth;
//}
//public String getEmail_id() {
//	return email_id;
//}
//public void setEmail_id(String email_id) {
//	this.email_id = email_id;
//}
//
//public String getPassword() {
//	return Password;
//}
//
//public void setPassword(String password) {
//	Password = password;
//}
//   
//   
//   
//   
//}

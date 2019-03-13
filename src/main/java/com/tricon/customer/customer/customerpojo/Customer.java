package com.tricon.customer.customer.customerpojo;

/**/
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*import javax.persistence.Entity;
import javax.persistence.Table;*/

@Entity
@Table(name="customerdb")
public class Customer {
	 @NotNull
     @Id
	String customer_id;
	 @NotNull
	 @Size(min=2,max=50, message="The name must be between 2-20 characters")
	String customer_name;
	 
	 @NotNull
	 @Size(min=10,max=10,message="Please enter 10 digit phone number")
	String customer_phoneno;
	 @NotNull
	 @Email(message = "Please enter correct email format")
	String customer_email;
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_phoneno() {
		return customer_phoneno;
	}
	public void setCustomer_phoneno(String customer_phoneno) {
		this.customer_phoneno = customer_phoneno;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_phoneno="
				+ customer_phoneno + ", customer_email=" + customer_email + "]";
	}
	
}

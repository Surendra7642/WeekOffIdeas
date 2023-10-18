package com.surya.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="regForm")
public class RegistrationForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
//	@NotNull
//	@Column
//	@Size(min=5,max=20)
	private String name;
   // @Column
//    @Size(min=10,max=12)
	private long mobile;
//	@Email
//	@Column
//	@Size(min=10,max=50)
	private String email;

	//	@NotEmpty
//	@Column
//	@Size(min=5,max=10)
	private String password;
	@Transient
	private String confirm_Password;
	//@NotEmpty
	private String address;
	public RegistrationForm() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public long getMobile_Number() {
//		return mobile_Number;
//	}
//	public void setMobile_Number(long mobile_Number) {
//		this.mobile_Number = mobile_Number;
//	}
	
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Password() {
		return confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public RegistrationForm(Integer id, String name, long mobiler, String email, String password,
			String confirm_Password, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.confirm_Password = confirm_Password;
		this.address = address;
	}
	@Override
	public String toString() {
		return "RegistrationForm [id=" + id + ", name=" + name + ", mobile=" + mobile+ ", email=" + email
				+ ", password=" + password + ", confirm_Password=" + confirm_Password + ", address=" + address + "]";
	}
	

}

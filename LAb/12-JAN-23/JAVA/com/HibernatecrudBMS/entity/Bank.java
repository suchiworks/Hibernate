package com.HibernatecrudBMS.entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bank_Information")
public class Bank {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int accountNo;
@Column(length=20,nullable=false)
private String name;
@Column(length=20,nullable=false,unique=true)
private String ifsccode;
@Column(length=11,nullable=false, unique=true)
private long phone;
@Column(length=11,nullable=false)
private int deposit;
@Column(length=25,nullable=false,unique=true)
private String email;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfsccode() {
	return ifsccode;
}
public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public int getDeposit() {
	return deposit;
}
public void setDeposit(int deposit) {
	this.deposit = deposit;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}


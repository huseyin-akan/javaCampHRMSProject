package Husonia.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name ="User")
@EqualsAndHashCode(callSuper=false)
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;	
}

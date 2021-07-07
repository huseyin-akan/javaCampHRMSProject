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
@EqualsAndHashCode(callSuper=false)
@Table(name="User")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="webSite")
	private String webSite;
	
	@Column(name="webSiteMail")
	private String webSiteMail;
}

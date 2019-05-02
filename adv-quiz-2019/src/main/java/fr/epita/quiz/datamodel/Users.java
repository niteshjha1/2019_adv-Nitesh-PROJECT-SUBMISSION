package fr.epita.quiz.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_role_id", unique = true, nullable = false)
	private Integer userRoleId;

	@Column(name = "user_name", unique = true, nullable = false)
	private String user_name;

	@Column(name = "psswd", nullable = false)
	private String psswd;

	@Column(name = "enable", nullable = false)
	private boolean enable;

	@Column(name = "role", nullable = false)
	private TypeOfRoles role;

	@Column(name = "mail", nullable = false)
	private String mail;

		public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	
	public String getUser_name() {
		return user_name;
	}

	
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	public String getPsswd() {
		return psswd;
	}

	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

	
	public boolean isEnable() {
		return enable;
	}

	
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	
	public TypeOfRoles getRole() {
		return role;
	}

	
	public void setRole(TypeOfRoles role) {
		this.role = role;
	}

	
	public String getMail() {
		return mail;
	}

	
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPassword(String parameter) {
		// TODO Auto-generated method stub
		
	}

	

}

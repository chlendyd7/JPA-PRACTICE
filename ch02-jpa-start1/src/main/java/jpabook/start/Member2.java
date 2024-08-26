package jpabook.start;

import javax.persistence.*;  //**

@Entity
@Table(name="MEMBER")
public class Member2 {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "NAME")
	private String username;
	
	private Integer age;

	public String getId() {return id;}
	public void setUsername(String username) {this.username = username;}
	
	public Integer getAge() {return age;}
	public void setAge(Integer age) {
		this.age = age;
	}
}

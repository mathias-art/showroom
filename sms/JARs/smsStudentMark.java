package net.javaguides.sms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "student_marks")
public class StudentMark implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1135448377277418616L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "student_id", nullable = false)
	private Long student_id;
	
	@OneToOne                                // ab hier: wieder einkommentiert (Tabellenvereinigung)
	@PrimaryKeyJoinColumn(name = "student_id")       // (Mathias Hüther (Freitag, 18.02.2022)) - one column from one table to another table in another table?
	Student student;

	@Column(name = "first_name", nullable = false) 
	
	private String firstName; 

	@Column(name = "last_name")
	private String lastName;


	@Column(name = "first_sem", nullable = false)
	//@Column(name = "first_sem")
	private int first_sem;

	@Column(name = "second_sem")
	private int second_sem;

	@Column(name = "third_sem")
	private int third_sem;

	@Column(name = "fourth_sem")
	private int fourth_sem;
	
	

	public StudentMark(Long student_id, String firstName, String lastName, int first_sem, int second_sem, int third_sem,
			int fourth_sem) {
		super();
		this.student_id = student_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.first_sem = first_sem;
		this.second_sem = second_sem;
		this.third_sem = third_sem;
		this.fourth_sem = fourth_sem;
	}

	public StudentMark() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return student_id;
	}

	public void setId(Long id) {
		this.student_id = id;
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

	public int getFirst_sem() {
		return first_sem;
	}

	public void setFirst_sem(int first_sem) {
		this.first_sem = first_sem;
	}

	public int getSecond_sem() {
		return second_sem;
	}

	public void setSecond_sem(int second_sem) {
		this.second_sem = second_sem;
	}

	public int getThird_sem() {
		return third_sem;
	}

	public void setThird_sem(int third_sem) {
		this.third_sem = third_sem;
	}

	public int getFourth_sem() {
		return fourth_sem;
	}

	public void setFourth_sem(int fourth_sem) {
		this.fourth_sem = fourth_sem;
	}

	
}

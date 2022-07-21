package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.entity.StudentMark;


public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(long id);

	void saveStudentMark(StudentMark studentMark);

	Object getAllStudentMarks();

	StudentMark getStudentMarkById(Long id);

	void updateStudentMark(StudentMark existingStudentMark);
	

		
		

}

package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.entity.StudentMark;
//import net.javaguides.sms.repository.StudentMarksRepository;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	private JpaRepository<StudentMark, Long> studentMarksRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
		
	}


	

	@Override
	public void saveStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object getAllStudentMarks() {
		// TODO Auto-generated method stub
		return studentMarksRepository.findAll();
	}


	@Override
	public StudentMark getStudentMarkById(Long id) {
		// TODO Auto-generated method stub
		return studentMarksRepository.findById(id).get();
	}


	@Override
	public void updateStudentMark(StudentMark existingStudentMark) {
		// TODO Auto-generated method stub
		
	}
	




}

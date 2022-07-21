package net.javaguides.sms.service.impl;

import java.util.List;

import net.javaguides.sms.entity.StudentMark;
import net.javaguides.sms.repository.StudentMarksRepository;
import net.javaguides.sms.service.StudentMarksService;


public class StudentMarksServiceImpl implements StudentMarksService {
	
	private StudentMarksRepository studentMarksRepository;
	
	public StudentMarksServiceImpl(StudentMarksRepository studentMarksRepository)
	{
		super();
		this.studentMarksRepository = studentMarksRepository;
	}
	
	
		@Override
		public List<StudentMark> getAllStudentMarks() {
			return studentMarksRepository.findAll();
		}

		@Override
		public StudentMark saveStudentMark(StudentMark studentMark) {
			return studentMarksRepository.save(studentMark);
		}

		@Override
		public StudentMark getStudentMarkById(Long id) {
			return studentMarksRepository.findById(id).get();


		}
		
		
		@Override
		public StudentMark updateStudentMark(StudentMark studentMark) {
			return studentMarksRepository.save(studentMark);
		}


		@Override
		public void deleteStudentMarkById(long id) {
			studentMarksRepository.deleteById(id);
			
		}

}

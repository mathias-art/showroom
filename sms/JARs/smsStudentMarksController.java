package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.entity.StudentMark;
import net.javaguides.sms.service.StudentService;

@Controller
public class StudentMarksController { // always have two separate classes: StudentController and StudentMarksController in one package
	private StudentService studentMarksService;
	
	
	public StudentMarksController(StudentService studentMarksService) {
		super();                                       
		this.studentMarksService = studentMarksService;
	}
	
	public StudentMarksController()  //mit No-Args-Konstruktur erstellt (Mo, 24.01.2022, 15 Uhr 47)
	{
		
	}
	
	// Getters und Setters aus den Fields erstellt (Mo, 24.01.2022, 15 Uhr 47)
	
	public StudentService getStudentMarksService() {
		return studentMarksService;
	}

	
	public void setStudentMarksService(StudentService studentMarksService) {
		this.studentMarksService = studentMarksService;
	}

	// handler method to handle list student_marks and return model and view
	@GetMapping("/student_marks")
	public String listStudent_Marks(Model model)
	{
		model.addAttribute("student_marks", studentMarksService.getAllStudentMarks());
		return "student_marks";
	} 
	
	@GetMapping("/student_marks/new")
	public String createStudentMarksForm(Model model)
	{
		// create student marks object to hold student marks from data
		StudentMark studentMark = new StudentMark();
		
		
		model.addAttribute("studentMark", studentMark);
		return "create_studentMark";
		
	}
	@PostMapping("student_marks")
	public String saveStudentMark(@ModelAttribute("studentMark") StudentMark studentMark) {
		studentMarksService.saveStudentMark(studentMark);
		return "redirect:/student_marks";
	}
	
	@GetMapping("student_marks/edit/{id}")
	public String editStudentMarksForm(@PathVariable Long id, Model model) {
		model.addAttribute("studentMark", studentMarksService.getStudentMarkById(id));
		return "edit_studentMark";
	}
	
	@PostMapping("student_marks/{id}")
	public String updateStudentMark(@PathVariable Long id,
			@ModelAttribute("studentMark") Student studentMark,
			Model model) {
		//get studentMark from database by id
		StudentMark existingStudentMark = studentMarksService.getStudentMarkById(id);
		existingStudentMark.setId(id);
		existingStudentMark.setFirstName(studentMark.getFirstName());
//		existingStudentMark.setFirst_sem(studentMark.getFirst_sem()); // create method 'getFirst_sem' in type student
//		existingStudentMark.setSecond_sem(studentMark.getSecond_sem());
//		existingStudentMark.setThird_sem(studentMark.getThird_sem());
//		existingStudentMark.setFourth_sem(studentMark.getFourth_sem());

		
		//save updated studentMark object
		
		studentMarksService.updateStudentMark(existingStudentMark);
		return "redirect:/student_marks";
		
	}
	
	// handler method to handle delete studentMark request
	
	public String deleteStudentMark(@PathVariable Long id) {
		//studentMarksService.deleteStudentMarkById(id);
		studentMarksService.deleteStudentById(id);
		return "redirect:/student_marks";
	}
	
	


}

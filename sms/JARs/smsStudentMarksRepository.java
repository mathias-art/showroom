package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.StudentMark;

public interface StudentMarksRepository extends JpaRepository<StudentMark, Long> {

}

package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//            createStudent(studentDAO);
            createMultipleStudents(studentDAO);
		};
	}

    private void createStudent(StudentDAO studentDAO) {
        // create the student object
        System.out.println("Creating new student object ...");
        Student tempStudent = new Student("Paul" , "Doe" , "mahdi@gmail.com");
        // save the student object
        System.out.println("Saveing the student ...");
        studentDAO.save(tempStudent);
        // display id of the saved student
        System.out.println("Saved student. Generated id: "+ tempStudent.getId());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        // create multiple students
        System.out.println("Creating 3 student objects ...");
        Student tempStudent1 = new Student("mahdi" , "Doee" , "mahdi021@gmail.com");
        Student tempStudent2 = new Student("aron" , "Doef" , "mahdi022@gmail.com");
        Student tempStudent3 = new Student("nima" , "Doeee" , "mahdi023@gmail.com");
        // save the student object
        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
        // display id of the saved student

    }
}
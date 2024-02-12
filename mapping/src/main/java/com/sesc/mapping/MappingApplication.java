package com.sesc.mapping;

import com.sesc.mapping.entities.Address;
import com.sesc.mapping.entities.Student;
import com.sesc.mapping.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	private Logger logger = LoggerFactory.getLogger(MappingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);}

		@Override
		public void run(String... args) throws Exception {

		// OneToOne mapping between student and address

		Student student = new Student();
		student.setStudentId(102);
		student.setStudentName("Alex");
		student.setStudentCourse("Bsc");

		Address address = new Address();
		address.setHouseNumber(202);
		address.setStreetName("Leeds Road");
		address.setPostCode("XY34CZ");
		address.setCountryName("UK");
		address.setStudent(student);

		student.setAddress(address);

		Student save = studentRepository.save(student);

		logger.info("saved student : {}", save.getStudentName());




			// To access student name and address through student id

			/*
			Student student = studentRepository.findById(101L).get();
			logger.info("student name is {}", student.getStudentName());

			Address address = student.getAddress();
			logger.info("student address is {}, {}, {}", address.getHouseNumber(), address.getStreetName(),address.getPostCode());

			 */



	}


}

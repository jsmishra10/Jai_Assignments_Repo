package com.greatlearning.controller;


import com.greatlearning.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.greatlearning.entity.Student;

import java.util.List;


@Controller
@RequestMapping("/students")
public class StudentController {
        private StudentService studentService;

        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }


        @GetMapping("/list")
        public String listStudents(Model model) {

            List<Student> students = studentService.findAll();

            model.addAttribute("students", students);

            return "list-students";
        }

        @GetMapping("/showFormForAdd")
        public String showFormForAddingRecord(Model model) {

            Student student = new Student();
            model.addAttribute("student", student);

            return "student-form";
        }

        @PostMapping("/addStudent")
        public String addStudentRecord(@ModelAttribute("student") Student student) {

            studentService.addRecord(student);

            return "redirect:/students/list";
        }

        @PostMapping("/showFormForUpdate")
        public String showFormForUpdate(@RequestParam("studentId") Long Id,
                                        Model theModel) {

            Student student = studentService.findById(Id);

            // set book as a model attribute to pre-populate the form
            theModel.addAttribute("student", student);

            // send over to our form
            return "student-form";
        }


        @PostMapping("/delete")
        public String delete(@RequestParam("studentId") Long Id) {
            studentService.deleteStudentRecord(Id);
            return "redirect:/students/list";
        }



}


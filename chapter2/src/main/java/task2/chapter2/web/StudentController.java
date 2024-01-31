package task2.chapter2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import task2.chapter2.domain.Student;

@Controller
public class StudentController {
    @GetMapping("/hello_students")
    public String hello(Model model) {
        List<Student> studentList = createStudentList();
        model.addAttribute("students", studentList);

        return "hello_students";
    }

    private List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kate", "Cole"));
        studentList.add(new Student("Dan", "Brown"));
        studentList.add(new Student("Mike", "Mars"));

        return studentList;
    }

}

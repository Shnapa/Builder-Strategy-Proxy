package ua.edu.ucu.task_1;


public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
            .firstName("John")
            .lastName("Doe")
            .grade("A")
            .grade("B")
            .grade("C")
            .group("Group A")
            .age(20)
            .height(175)
            .build();
        
        System.out.println("Student: " + student);
    }
}

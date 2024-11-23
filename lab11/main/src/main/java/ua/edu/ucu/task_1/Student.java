package ua.edu.ucu.task_1;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.Singular;
import java.util.List;


@SuperBuilder @Getter
public class Student extends Human{
    @Singular
    private List<String> grades;
    private String group;
    private int age;
    private int height;
}
package ua.edu.ucu.task_2;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public class Client {
    private static int counter = 0;
    private final int id = counter++;
    private final String name;
    private final LocalDate birthDate;
    private final String gender;
}


package Семинары.Seminar_3.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String lastName;
    private  Integer group;
    private Integer money;
    private List<Integer> step;

}

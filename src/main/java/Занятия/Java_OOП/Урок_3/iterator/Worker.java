package Занятия.Java_OOП.Урок_3.iterator;


import java.util.Iterator;
import java.util.function.Consumer;

public class Worker  {
    private String name;
    private String lastName;
    private Integer age;
    private Integer salary;

    public Worker(String name, String lastName, Integer age, Integer salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    int index;
//
//    @Override
//    public boolean hasNext() {
//        return index++ < 4;
//    }
//
//    @Override
//    public String next() {
//        switch (index){
//            case 1 -> {
//                return String.format( "First name %s" , name);
//            }
//            case 2 ->
//            {
//                return String.format( "Last name %s" , lastName);
//            }
//            case 3 -> {
//                return String.format( "Age %s" , age);
//            }
//            default -> {
//                return String.format( "Salary %s" , salary);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Рабочий " + index +
                "Имя ='" + name + "\n" +
                ", Фамилия='" + lastName + "\n" +
                ", Возраст=" + age +"\n"+
                ", ЗарПлат=" + salary +"\n";
    }

//    @Override
//    public int compareTo(Worker o) {
//
//        return Integer.compare(this.salary,o.salary);
//        if(this.age>o.age)
//        return 1;
//        else if (this.age<o.age) {
//            return -1;
//        }
//        else return 0;
//    }
}

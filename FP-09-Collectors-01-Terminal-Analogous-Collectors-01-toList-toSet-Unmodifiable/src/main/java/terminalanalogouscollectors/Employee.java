package terminalanalogouscollectors;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class Employee {

    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date joiningDate;
    private double salary;

    public Employee(int id, String name, char gender, Date dob, String city, String designation, Date joiningDate, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.city = city;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

}

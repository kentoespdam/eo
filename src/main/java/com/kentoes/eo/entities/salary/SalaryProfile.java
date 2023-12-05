package com.kentoes.eo.entities.salary;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kentoes.eo.entities.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "salary_profile")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryProfile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String status;
    @OneToMany(mappedBy = "empSgId")
    @JsonBackReference
    private List<Employee> employeeList;

}

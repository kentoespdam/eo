package com.kentoes.eo.entities.salary.trans;

import com.kentoes.eo.entities.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_potongan_tkk")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryPotonganTkk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_code", referencedColumnName = "batchCode")
    private SalaryBatchProcess salaryBatchProcess;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_code", referencedColumnName = "empCode")
    private Employee employee;
    private Integer potongan;
}

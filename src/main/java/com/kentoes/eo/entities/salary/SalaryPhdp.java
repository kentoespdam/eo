package com.kentoes.eo.entities.salary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_phdp")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryPhdp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String seq;
    private String condition;
    private String formula;
}

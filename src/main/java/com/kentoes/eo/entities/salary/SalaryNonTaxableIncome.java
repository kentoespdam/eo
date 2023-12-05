package com.kentoes.eo.entities.salary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_non_taxable_income")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryNonTaxableIncome implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String value;
    private Boolean status;
}

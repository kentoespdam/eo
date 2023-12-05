package com.kentoes.eo.entities.salary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_component")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryComponent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private SalaryProfile salaryProfile;
    private Integer seq;
    private String code;
    //Operator penjumlahan gaji (+/-)
    private Character ctype;
    private Long value;
    private String formula;
    private String description;
}

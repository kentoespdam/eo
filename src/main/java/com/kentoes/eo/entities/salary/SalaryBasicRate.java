package com.kentoes.eo.entities.salary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "salary_basic_rate")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryBasicRate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean status;
    private LocalDateTime createdAt;
    private String createdBy;
}

package com.kentoes.eo.entities.salary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_official_house_rate")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryOfficialHouseRate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Integer value;
}

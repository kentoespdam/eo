package com.kentoes.eo.entities.salary.trans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_process_detail")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryProcessDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pm_id", referencedColumnName = "id")
    private SalaryProcessMaster salaryProcessMaster;
    private Integer seq;
    private String code;
    private String ctype;
    private Long value;
    private String description;
    private String formula;
    @Column(name = "v_formula")
    private String formulaValue;
}

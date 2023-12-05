package com.kentoes.eo.entities.salary;

import com.kentoes.eo.enums.ESalaryAllowanceCode;
import com.kentoes.eo.enums.ESalaryAllowanceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_allowance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryAllowance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private ESalaryAllowanceCode code;
    @Enumerated(EnumType.ORDINAL)
    private ESalaryAllowanceType refType;
    private Integer refId;
    private Boolean status;
}

package com.kentoes.eo.entities.salary;

import com.kentoes.eo.enums.EEmpFlag;
import com.kentoes.eo.enums.EPosLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_tkk_reduction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryTkkReduction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private EEmpFlag empFlag;
    @Enumerated(EnumType.ORDINAL)
    private EPosLevel posLevel;
    private Integer golongan;
    private Integer potongan;
}

package com.kentoes.eo.entities.salary.trans;

import com.kentoes.eo.entities.master.Organization;
import com.kentoes.eo.entities.salary.SalaryProfile;
import com.kentoes.eo.enums.EEmpFlag;
import com.kentoes.eo.enums.EPosLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "salary_process_master")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryProcessMaster implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String batchCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profil_id", referencedColumnName = "id")
    private SalaryProfile salaryProfile;
    private LocalDate period;
    private String empCode;
    private String empName;
    private String empGolongan;
    private String empPangkat;
    private String empPosition;
    @Enumerated(EnumType.ORDINAL)
    private EPosLevel empPosLevel;
    @Enumerated(EnumType.ORDINAL)
    private EEmpFlag empFlag;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_group_id", referencedColumnName = "id")
    private Organization organization;
    private String orgGroupName;
    @Column(name="jkn_no")
    private String noJkn;
    private Integer salaryType;
    private String taxCode;
    private String jmlJiwa;
    private Long totalIncome;
    private Long totalAdhocIncome;
    private Long totalDeduction;
    private Long totalAdhocDeduction;
    private Long nettIncome;
    private Long nettIncome2;
    private Long rounding;
    private Long rounding2;
    private Long finalIncome;
    private Long finalIncome2;
    private Long tax;
    @Column(name="acc_no")
    private String accountNumber;
    @Column(name="acc_bank_name")
    private String bankName;
    @Column(name="status")
    private Boolean isSuccess;
    private String description;
    @Column(name="fi_change_flag")
    private Boolean isFinalIncomeChanged;
}

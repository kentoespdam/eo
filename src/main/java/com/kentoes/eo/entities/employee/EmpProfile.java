package com.kentoes.eo.entities.employee;

import com.kentoes.eo.enums.EEmpIdentityType;
import com.kentoes.eo.entities.salary.SalaryNonTaxableIncome;
import com.kentoes.eo.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "emp_profile")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpProfile implements Serializable {
    @Id
    @Column(name = "emp_profile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private EEmpType empType;
    private String empName;
    @Enumerated(EnumType.STRING)
    private EGender empGender;
    private String empAddress;
    private String empPhone;
    private String empMobile;
    private String empEmail;
    private LocalDate empBirthDate;
    private String empBirthPlace;
    @Enumerated(EnumType.ORDINAL)
    private EReligion empReligion;
    private String empPhoto;
    private EEmpIdentityType empIdentityType;
    private String empIdentityNumber;
    private LocalDate empIdentityExpDate;
    private String empMotherName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_tax_code", referencedColumnName = "code")
    private SalaryNonTaxableIncome empTaxCode;
    private Integer empHeight;
    private Integer empWeight;
    @Enumerated(EnumType.STRING)
    private EBloodType empBloodType;
    @Enumerated(EnumType.ORDINAL)
    private EActiveStatus empStatus;
    private LocalDate empAppDate;
    private String empNote;
    private LocalDateTime empEntryDate;
    private String empEntryByName;
    private LocalDateTime empLastUpdate;
    private String empUpdateByName;
    @Enumerated(EnumType.ORDINAL)
    private EAskesFlag askesFlag;
    private Integer idRumdin;
    private EMaritalStatus idMaritalStatus;
}

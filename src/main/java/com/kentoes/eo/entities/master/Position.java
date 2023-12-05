package com.kentoes.eo.entities.master;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kentoes.eo.entities.employee.Employee;
import com.kentoes.eo.enums.EPosLevel;
import com.kentoes.eo.enums.EEnableStatus;
import jakarta.persistence.*;

import java.util.List;

public class Position {
    @Id
    @Column(name = "pos_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pos_org_id", referencedColumnName = "orgId")
    private Organization organization;
    private String posCode;
    private String posName;
    @Enumerated(EnumType.ORDINAL)
    private EPosLevel posLevel;
    private Integer posParent;
    private String posGolongan;
    @Enumerated(EnumType.STRING)
    private EEnableStatus posStatus;
    @OneToMany(mappedBy = "empPosition")
    @JsonIgnore
    @JsonBackReference
    private List<Employee> employeeList;
}

package com.kentoes.eo.entities.master;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kentoes.eo.entities.employee.Employee;
import com.kentoes.eo.enums.ELocStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Location implements Serializable {
    @Id
    @Column(name = "loc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String locName;
    private String locAddress;
    private Integer locParentId;
    private String locPicName;
    private String locPicPhone;
    private String locPicMobile;
    private String locPicEmail;
    private Integer locLevel;
    @Column(name = "loc_level_1")
    private Integer locLevel1;
    @Column(name = "loc_level_2")
    private Integer locLevel2;
    @Column(name = "loc_level_3")
    private Integer locLevel3;
    @Column(name = "loc_level_4")
    private Integer locLevel4;
    @Column(name = "loc_level_5")
    private Integer locLevel5;
    @Enumerated(EnumType.STRING)
    private ELocStatus locStatus;
    @OneToMany(mappedBy = "empLocation")
    @JsonBackReference
    private List<Employee> employeeList;
}

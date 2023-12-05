package com.kentoes.eo.entities.master;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kentoes.eo.enums.EEnableStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "organization")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Organization implements Serializable {
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String orgCode;
    private String orgName;
    private Integer orgLevel;
    private Integer orgParent;
    @Column(name = "org_level_1")
    private Integer orgLevel1;
    @Column(name = "org_level_2")
    private Integer orgLevel2;
    @Column(name = "org_level_3")
    private Integer orgLevel3;
    @Column(name = "org_level_4")
    private Integer orgLevel4;
    @Column(name = "org_level_5")
    private Integer orgLevel5;
    @Enumerated(EnumType.STRING)
    private EEnableStatus orgStatus;
    private String mailCode;
    private String officeCode;
    private String group;
    private String category;
    @OneToMany(mappedBy = "organization")
    @JsonBackReference
    private List<Position> positions;
}

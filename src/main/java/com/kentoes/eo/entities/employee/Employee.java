package com.kentoes.eo.entities.employee;

import com.kentoes.eo.entities.master.Golongan;
import com.kentoes.eo.entities.master.Location;
import com.kentoes.eo.entities.master.Position;
import com.kentoes.eo.entities.salary.SalaryProfile;
import com.kentoes.eo.enums.EActiveStatus;
import com.kentoes.eo.enums.EEmpFlag;
import com.kentoes.eo.enums.EEmpLocType;
import com.kentoes.eo.enums.EEmpWorkStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer id;
    private String empCode;
    @OneToOne
    @JoinColumn(name="emp_profile_id", referencedColumnName = "id")
    private EmpProfile empProfile;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_pos_id", referencedColumnName = "posId")
    private Position empPosition;
    private Integer empExternalPosId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_loc_id", referencedColumnName = "locId")
    private Location empLocation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_sg_id", referencedColumnName = "id")
    private SalaryProfile empSgId;
    private LocalDate empLastMutation;
    private LocalDate empStart;
    private LocalDate empEnd;
    @Enumerated(EnumType.ORDINAL)
    private EEmpFlag empFlag;
    private LocalDate tglPengangkatan;
    private String skPengangkatan;
    @Enumerated(EnumType.ORDINAL)
    private EEmpLocType empLocType;
    @Enumerated(EnumType.ORDINAL)
    private EEmpWorkStatus empWorkStatus;
    @Enumerated(EnumType.ORDINAL)
    private EActiveStatus empStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_gol_id", referencedColumnName = "id")
    private Golongan golongan;
    private LocalDateTime empEntryDate;
private String empEntryByName;


}

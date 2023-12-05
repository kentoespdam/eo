package com.kentoes.eo.entities.employee.trans;

import com.kentoes.eo.entities.employee.Employee;
import com.kentoes.eo.entities.master.Golongan;
import com.kentoes.eo.entities.sys.SysUser;
import com.kentoes.eo.enums.EEnableStatus;
import com.kentoes.eo.enums.EJenisSk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "emp_sk")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpSK implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Employee employee;
    private Integer refId;
    @Enumerated(EnumType.ORDINAL)
    private EJenisSk jenisSk;
    private String noSk;
    private LocalDate tglSk;
    private LocalDate tmtSk;
    private String keterangan;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "golongan_id", referencedColumnName = "id")
    private Golongan golongan;
    private Long gajiPokok;
    private Integer mkgTahun;
    private Integer mkgBulan;
    private LocalDate kenaikanBerikutnya;
    private Integer mkgbTahun;
    private Integer mkgbBulan;
    @Column(name = "flag_update_master")
    private Boolean isMasterUpdate;
    @Enumerated(EnumType.ORDINAL)
    private EEnableStatus status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private SysUser createdBy;
}

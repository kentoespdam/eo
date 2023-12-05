package com.kentoes.eo.entities.salary;

import com.kentoes.eo.entities.master.Golongan;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "salary_basic_rate_detail")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryBasicRateDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_br", referencedColumnName = "id")
    private Integer basicRate;
    @Column(name = "mkg")
    private Integer masaKerjaGolongan;
    @OneToMany
    @JoinColumn(name = "gol_id", referencedColumnName = "id")
    private Golongan golongan;
    private Double value;
}

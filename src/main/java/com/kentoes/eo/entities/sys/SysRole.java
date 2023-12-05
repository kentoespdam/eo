package com.kentoes.eo.entities.sys;

import com.kentoes.eo.entities.master.Position;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_role")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;
    @Column(name = "role_name")
    private String name;
    @Column(name = "role_description")
    private String description;
    @Column(name = "role_status")
    private Boolean status;
    private Integer roleCategory;
    private LocalDateTime createdDate;
    private Integer createdBy;
    private String createdByUserName;
    /**
     * Join ke Jabatan. di Eoffice ROLE===JABATAN
     **/
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;
    private SysMenu sysMenu;
}

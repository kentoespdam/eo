package com.kentoes.eo.entities.sys;

import com.kentoes.eo.enums.EMenuType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "sys_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer id;
    @Column(name = "menu_code")
    private String code;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "menu_type")
    private EMenuType type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_parent_id", referencedColumnName = "id")
    private SysMenu parent;
    private String title;
    private String icon;
    private String module;
    private String controller;
    private String action;
    private String param;
    @Column(name = "published")
    private Boolean isPublished;
    private Integer sortId;
}

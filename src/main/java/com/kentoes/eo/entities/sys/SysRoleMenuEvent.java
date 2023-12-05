package com.kentoes.eo.entities.sys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "sys_role_menu_event")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysRoleMenuEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_menu_event_id")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private SysRole role;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    private SysMenu menu;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_event_id", referencedColumnName = "id")
    private SysMenuEvent menuEvent;
}

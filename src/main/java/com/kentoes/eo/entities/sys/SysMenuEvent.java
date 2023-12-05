package com.kentoes.eo.entities.sys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "sys_menu_event")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysMenuEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_event_id")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    private SysMenu menu;
    private String menuEventCode;
    private String menuEventName;
}

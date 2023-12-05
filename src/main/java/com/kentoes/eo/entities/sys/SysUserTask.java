package com.kentoes.eo.entities.sys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "sys_user_task")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysUserTask implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_task_id")
    private Integer id;

}

package com.kentoes.eo.entities.sys;

import com.kentoes.eo.entities.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SysUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_login")
    private String login;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_full_name")
    private String fullName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_role_id", referencedColumnName = "id")
    private SysRole sysRole;
    @OneToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Employee employee;
    @Column(name = "user_status")
    private Boolean status;
    private LocalDateTime lastLogin;
    private Integer countLogin;
    @Column(name = "online")
    private Boolean isOnline;
    @Column(name = "reset_flag")
    private Boolean isResetPassword;
    @Column(name = "m_session")
    private String session;
    @Column(name = "online_mobile")
    private Boolean isOnlineMobile;
    private LocalDateTime lastNotif;
}

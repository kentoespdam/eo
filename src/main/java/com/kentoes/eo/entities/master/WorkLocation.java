package com.kentoes.eo.entities.master;

import com.kentoes.eo.enums.EActiveStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkLocation implements Serializable {
    @Id
    @Column(name = "wl_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer clientId;
    @Column(name = "wl_code")
    private String code;
    @Column(name = "wl_name")
    private String name;
    @Column(name = "wl_address")
    private String address;
    @Column(name = "wl_contact")
    private String contact;
    @Column(name = "wl_contact_title")
    private String contactTitle;
    @Column(name = "wl_description")
    private String description;
    @Column(name = "wl_status")
    @Enumerated(EnumType.ORDINAL)
    private EActiveStatus status;
    @Column(name = "wl_entry_date")
    private LocalDateTime entryDate;
    @Column(name = "wl_entry_by_name")
    private String entryByName;
}

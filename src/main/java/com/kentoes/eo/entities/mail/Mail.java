package com.kentoes.eo.entities.mail;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Table(name = "mail")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Integer id;
    private String mNo;
    private String mDate;

}

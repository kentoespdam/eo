package com.kentoes.eo.entities.master;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "golongan")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Golongan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String golongan;
    private String pangkat;
    private Boolean status;
}

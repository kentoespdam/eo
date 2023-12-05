package com.kentoes.eo.entities.salary.trans;

import com.kentoes.eo.enums.EBatchProcessStatus;
import com.kentoes.eo.enums.ESlipStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "salary_batch_process")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryBatchProcess implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "batch_no")
    private String batchCode;
    private LocalDate period;
    private LocalDateTime processDate;
    private Integer totalRecord;
    private LocalDateTime verificationDate;
    private String verifiedByName;
    private String verifiedByPosition;
    private LocalDateTime approvalDate;
    private String approvedByName;
    private String approvedByPosition;
    @Enumerated
    private EBatchProcessStatus status;
    private String note;
    private String file1;
    private String file2;
    private String file3;
    private String file4;
    @Enumerated(EnumType.ORDINAL)
    private ESlipStatus slipStatus;
}

package com.notifications.notifications.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "REPORT_TYPES")
@Getter
@Setter
@NoArgsConstructor
public class ReportType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_TYPE_ID")
    private Long reportTypeId;
    @Column(name = "REPORT_TYPE")
    private String reportType;
}

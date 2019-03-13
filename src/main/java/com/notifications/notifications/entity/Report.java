package com.notifications.notifications.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "REPORTS")
@Getter
@Setter
@NoArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_ID")
    private Long reportId;
    @Column(name = "REPORT_Name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "REPORT_TYPE_ID")
    private ReportType reportType;
}

package com.notifications.notifications.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "REPORT_NOTIFICATIONS")
@Getter
@Setter
@NoArgsConstructor
public class ReportNotifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_NOTIFICATION_ID")
    private Long reportNotificationId;
    @ManyToOne
    @JoinColumn(name = "REPORT_ID")
    private Report reportId;
    @ManyToOne
    @JoinColumn(name = "SENT_BY")
    private User sentBy;
    @ManyToOne
    @JoinColumn(name = "RECIEVED_BY")
    private User recievedBy;

}

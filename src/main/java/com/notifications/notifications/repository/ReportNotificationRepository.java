package com.notifications.notifications.repository;

import com.notifications.notifications.entity.ReportNotifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportNotificationRepository extends JpaRepository<ReportNotifications, Long> {
}

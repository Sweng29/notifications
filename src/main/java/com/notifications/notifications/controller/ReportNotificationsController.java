package com.notifications.notifications.controller;

import com.notifications.notifications.entity.ReportNotifications;
import com.notifications.notifications.service.ReportNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/report-notifications")
public class ReportNotificationsController {

    @Autowired
    ReportNotificationService reportNotificationService;

    @GetMapping("/")
    public List<ReportNotifications> getAllReportNotifications() {
        if (reportNotificationService.getAll() != null) {
            return reportNotificationService.getAll();
        }
        return null;
    }

    @GetMapping("/{id}")
    public List<ReportNotifications> getReportNotificationsById(@PathVariable(value = "id") Long id) {
        if (reportNotificationService.getById(id) != null) {
            return reportNotificationService.getAllNotificationsById(id);
        }
        return null;
    }

    @PostMapping("/")
    public List<ReportNotifications> saveReportNotifications(@Valid @RequestBody ReportNotifications reportNotifications) {
        reportNotificationService.saveOrUpdate(reportNotifications);
        return reportNotificationService.getAll();
    }

    @DeleteMapping("/{id}")
    public List<ReportNotifications> deleteReportNotificationsById(@PathVariable(value = "id") Long id) {
        reportNotificationService.deleteById(id);
        return reportNotificationService.getAll();
    }

}

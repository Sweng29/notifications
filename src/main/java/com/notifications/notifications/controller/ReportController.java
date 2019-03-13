package com.notifications.notifications.controller;

import com.notifications.notifications.entity.Report;
import com.notifications.notifications.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {


    @Autowired
    ReportService reportService;

    @GetMapping("/")
    public List<Report> getAllReports() {
        if (reportService.getAll() != null) {
            return reportService.getAll();
        }
        return null;
    }

    @GetMapping("/{id}")
    public Report getReportById(@PathVariable(value = "id") Long id) {
        if (reportService.getById(id) != null) {
            return reportService.getById(id);
        }
        return null;
    }

    @PostMapping("/")
    public List<Report> saveReport(@Valid @RequestBody Report user) {
        reportService.saveOrUpdate(user);
        return reportService.getAll();
    }

    @DeleteMapping("/{id}")
    public List<Report> deleteReportById(@PathVariable(value = "id") Long id) {
        reportService.deleteById(id);
        return reportService.getAll();
    }


}

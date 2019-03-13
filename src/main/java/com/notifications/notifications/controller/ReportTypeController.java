package com.notifications.notifications.controller;

import com.notifications.notifications.entity.ReportType;
import com.notifications.notifications.service.ReportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/report-types")
public class ReportTypeController {


    @Autowired
    ReportTypeService reportTypeService;

    @GetMapping("/")
    public List<ReportType> getAllReports() {
        if (reportTypeService.getAll() != null) {
            return reportTypeService.getAll();
        }
        return null;
    }

    @GetMapping("/{id}")
    public ReportType getReportTypeById(@PathVariable(value = "id") Long id) {
        if (reportTypeService.getById(id) != null) {
            return reportTypeService.getById(id);
        }
        return null;
    }

    @PostMapping("/")
    public List<ReportType> saveReportType(@Valid @RequestBody ReportType reportType) {
        reportTypeService.saveOrUpdate(reportType);
        return reportTypeService.getAll();
    }

    @DeleteMapping("/{id}")
    public List<ReportType> deleteReportTypeById(@PathVariable(value = "id") Long id) {
        reportTypeService.deleteById(id);
        return reportTypeService.getAll();
    }


}

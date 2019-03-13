package com.notifications.notifications.service;

import com.notifications.notifications.entity.Report;
import com.notifications.notifications.genericDAO.GenericDAO;
import com.notifications.notifications.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService implements GenericDAO<Report> {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public Report getById(Long id) {
        return reportRepository.findById(id).get();
    }

    @Override
    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    @Override
    public Report saveOrUpdate(Report entity) {
        return reportRepository.save(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        reportRepository.deleteById(id);
        return true;
    }
}

package com.notifications.notifications.service;

import com.notifications.notifications.entity.ReportType;
import com.notifications.notifications.genericDAO.GenericDAO;
import com.notifications.notifications.repository.ReportTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportTypeService implements GenericDAO<ReportType> {

    @Autowired
    private ReportTypeRepository reportTypeRepository;

    @Override
    public ReportType getById(Long id) {
        return reportTypeRepository.findById(id).get();
    }

    @Override
    public List<ReportType> getAll() {
        return reportTypeRepository.findAll();
    }

    @Override
    public ReportType saveOrUpdate(ReportType entity) {
        return reportTypeRepository.save(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        reportTypeRepository.deleteById(id);
        return true;
    }
}

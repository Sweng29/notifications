package com.notifications.notifications.service;

import com.notifications.notifications.entity.ReportNotifications;
import com.notifications.notifications.genericDAO.GenericDAO;
import com.notifications.notifications.repository.ReportNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReportNotificationService implements GenericDAO<ReportNotifications> {

    @Autowired
    private ReportNotificationRepository reportNotificationRepository;


    @Override
    public ReportNotifications getById(Long id) {
        return reportNotificationRepository.findById(id).get();
    }

    @Override
    public List<ReportNotifications> getAll() {
        return reportNotificationRepository.findAll();
    }

    @Override
    public ReportNotifications saveOrUpdate(ReportNotifications entity) {
        return reportNotificationRepository.save(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        reportNotificationRepository.deleteById(id);
        return true;
    }

    public List<ReportNotifications> getAllNotificationsById(Long id) {
        return (List<ReportNotifications>) reportNotificationRepository.findAllById(Collections.singleton(id));
    }
}

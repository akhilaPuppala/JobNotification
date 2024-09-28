package com.ust.JobNotificationApplication.service;

import com.ust.JobNotificationApplication.model.JobNotification;
import com.ust.JobNotificationApplication.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobNotificationService {

    @Autowired
    private JobRepository repo;
    public JobNotification addJob(JobNotification jobNotification)
    {
        return repo.save(jobNotification);
    }
}

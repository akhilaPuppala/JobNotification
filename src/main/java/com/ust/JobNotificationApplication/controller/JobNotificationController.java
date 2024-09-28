package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.JobNotification;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobNotificationController {
    @Autowired
    private JobNotificationService jobNotificationService;
    @PostMapping("/create job")
    public JobNotification createJob(@RequestBody JobNotification jobNotification) {
        return jobNotificationService.addJob(jobNotification);
    }
}

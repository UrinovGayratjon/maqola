package uz.urinov.embarkxjobproject.job.service;

import org.springframework.stereotype.Service;
import uz.urinov.embarkxjobproject.job.Job;

import java.util.List;


public interface JobService {

    List<Job> findAll();
    void createJob(Job newJob);

    Job findById(Long id);

    boolean deleteJobById(Long id);
     boolean updateJob(Long id, Job updatedJob);
}

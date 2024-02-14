package uz.urinov.embarkxjobproject.job.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.urinov.embarkxjobproject.job.Job;
import uz.urinov.embarkxjobproject.job.repository.JobRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job newJob) {
        jobRepository.save(newJob);
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> byId = jobRepository.findById(id);
        if (byId.isPresent()) {

            Job job = byId.get();
            job.setDescription(updatedJob.getDescription());
            job.setLocation(updatedJob.getLocation());
            job.setTitle(updatedJob.getTitle());
            job.setMinSalary(updatedJob.getMinSalary());
            job.setMaxSalary(job.getMaxSalary());

            jobRepository.save(job);
            return true;
        }
        return false;
    }

    @Override
    public Job findById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
        jobRepository.deleteById(id);
        return true;
    }
}

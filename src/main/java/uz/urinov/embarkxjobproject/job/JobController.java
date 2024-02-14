package uz.urinov.embarkxjobproject.job;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.urinov.embarkxjobproject.job.service.JobService;

import java.util.List;

@RequestMapping("/api/jobs")
@RestController
@AllArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping()
    public ResponseEntity<List<Job>> findAll() {
        return ResponseEntity.ok(jobService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        return ResponseEntity.ok(jobService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteJobById(@PathVariable Long id) {
        return ResponseEntity.ok(jobService.deleteJobById(id));
    }

    @PostMapping()
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return ResponseEntity.ok("Success");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job job) {
        boolean updateJob = jobService.updateJob(id, job);
        if (updateJob){
            return ResponseEntity.ok("Success");
        }else {
            return ResponseEntity.status(409).body("Error");
        }
    }


}

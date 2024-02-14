package uz.urinov.embarkxjobproject.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.embarkxjobproject.job.Job;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

}

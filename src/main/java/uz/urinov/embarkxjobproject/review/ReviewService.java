package uz.urinov.embarkxjobproject.review;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    List<Review> getAllReview(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

}

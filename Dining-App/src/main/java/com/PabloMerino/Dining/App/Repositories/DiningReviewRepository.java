package com.PabloMerino.Dining.App.Repositories;

import com.PabloMerino.Dining.App.Model.AdminReviewAction;
import com.PabloMerino.Dining.App.Model.DiningReview;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DiningReviewRepository extends CrudRepository <DiningReview, Long> {

    Optional <DiningReview> findBySubmitStatus(AdminReviewAction SubmitStatus);
    Optional <DiningReview> findByIdAndSubmitStatus(Long reviewId, AdminReviewAction SubmitStatus);

}

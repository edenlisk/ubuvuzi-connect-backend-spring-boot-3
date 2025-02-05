package com.edenlisk.ubuvuzi.connect.repository;

import com.edenlisk.ubuvuzi.connect.entity.ReferralFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReferralFeedbackRepository extends JpaRepository<ReferralFeedback, Long> {

    Optional<ReferralFeedback> findByTransfer_Id(Long transferId);

}

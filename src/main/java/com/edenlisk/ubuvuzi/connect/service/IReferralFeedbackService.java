package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.CreateReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.ReferralFeedbackDto;

public interface IReferralFeedbackService {


    /**
     * @param referralFeedbackDto
     */
    void createReferralFeedback(CreateReferralFeedbackDto referralFeedbackDto);

    /**
     * @param transferId
     * @return ReferralFeedback
     */
    ReferralFeedbackDto getReferralFeedbackByTransfer(Long transferId);

}

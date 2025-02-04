package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.CreateReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.ReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.entity.ReferralFeedback;

public class ReferralFeedbackMapper {

    public static ReferralFeedbackDto mapToReferralFeedbackDto(
            ReferralFeedback referralFeedback,
            ReferralFeedbackDto referralFeedbackDto
            ) {
        referralFeedbackDto.setDateOfDischarge(referralFeedback.getDateOfDischarge());
        referralFeedbackDto.setFinalDiagnosis(referralFeedback.getFinalDiagnosis());
        referralFeedbackDto.setTreatmentAtReferredFacility(referralFeedback.getTreatmentAtReferredFacility());
        referralFeedback.setDateOfAdmissionReferredFacility(referralFeedback.getDateOfAdmissionReferredFacility());
        return referralFeedbackDto;
    }


    public static ReferralFeedback mapToReferralFeedback(
            CreateReferralFeedbackDto createReferralFeedbackDto,
            ReferralFeedback referralFeedback
            ) {
        referralFeedback.setFinalDiagnosis(createReferralFeedbackDto.getFinalDiagnosis());
        referralFeedback.setDateOfDischarge(createReferralFeedbackDto.getDateOfDischarge());
        referralFeedback.setTreatmentAtReferredFacility(createReferralFeedbackDto.getTreatmentAtReferredFacility());
        referralFeedback.setDateOfAdmissionReferredFacility(createReferralFeedbackDto.getDateOfAdmissionReferredFacility());
        return referralFeedback;
    }

}

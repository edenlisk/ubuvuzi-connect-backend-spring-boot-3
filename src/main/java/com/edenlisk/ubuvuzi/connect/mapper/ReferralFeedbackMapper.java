package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.CreateReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.OutcomeDto;
import com.edenlisk.ubuvuzi.connect.dto.ReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.TransferDto;
import com.edenlisk.ubuvuzi.connect.entity.ReferralFeedback;

public class ReferralFeedbackMapper {

    public static ReferralFeedbackDto mapToReferralFeedbackDto(
            ReferralFeedback referralFeedback,
            ReferralFeedbackDto referralFeedbackDto
            ) {
        referralFeedbackDto.setTransfer(TransferMapper.mapToTransferDto(referralFeedback.getTransfer(), new TransferDto()));
        referralFeedbackDto.setDateOfDischarge(referralFeedback.getDateOfDischarge());
        referralFeedbackDto.setFinalDiagnosis(referralFeedback.getFinalDiagnosis());
        referralFeedbackDto.setOutcome(OutcomeMapper.mapToOutcomeDto(referralFeedback.getOutcome(), new OutcomeDto()));
        referralFeedbackDto.setTreatmentAtReferredFacility(referralFeedback.getTreatmentAtReferredFacility());
        referralFeedbackDto.setDateOfAdmissionReferredFacility(referralFeedback.getDateOfAdmissionReferredFacility());
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

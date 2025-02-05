package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.CreateReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.dto.ReferralFeedbackDto;
import com.edenlisk.ubuvuzi.connect.entity.Outcome;
import com.edenlisk.ubuvuzi.connect.entity.ReferralFeedback;
import com.edenlisk.ubuvuzi.connect.entity.Transfer;
import com.edenlisk.ubuvuzi.connect.exception.ResourceNotFoundException;
import com.edenlisk.ubuvuzi.connect.mapper.ReferralFeedbackMapper;
import com.edenlisk.ubuvuzi.connect.repository.IOutcomeRepository;
import com.edenlisk.ubuvuzi.connect.repository.ReferralFeedbackRepository;
import com.edenlisk.ubuvuzi.connect.repository.TransferRepository;
import com.edenlisk.ubuvuzi.connect.service.IReferralFeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class IReferralFeedbackServiceImpl implements IReferralFeedbackService {

    private ReferralFeedbackRepository referralFeedbackRepository;
    private IOutcomeRepository outcomeRepository;
    private TransferRepository transferRepository;
    /**
     * @param referralFeedbackDto
     */
    @Override
    public void createReferralFeedback(CreateReferralFeedbackDto referralFeedbackDto) {
        ReferralFeedback referralFeedback = ReferralFeedbackMapper.mapToReferralFeedback(referralFeedbackDto, new ReferralFeedback());
        Outcome outcome = outcomeRepository.findById(referralFeedbackDto.getOutcomeId())
                .orElseThrow(
                        () -> new ResourceNotFoundException("Outcome", "id", referralFeedbackDto.getOutcomeId().toString())
                );
        referralFeedback.setOutcome(outcome);
        Transfer transfer = transferRepository.findById(referralFeedbackDto.getTransferId())
                .orElseThrow(
                        () -> new ResourceNotFoundException("Transfer", "id", referralFeedbackDto.getTransferId().toString())
                );
        referralFeedback.setTransfer(transfer);
        referralFeedbackRepository.save(referralFeedback);

    }

    /**
     * @param transferId
     * @return ReferralFeedback
     */
    @Override
    public ReferralFeedbackDto getReferralFeedbackByTransfer(Long transferId) {
        Optional<ReferralFeedback> referralFeedback = referralFeedbackRepository.findByTransfer_Id(transferId);
        if (referralFeedback.isEmpty()) {
            throw new ResourceNotFoundException("Transfer", "id", transferId.toString());
        }
        return ReferralFeedbackMapper.mapToReferralFeedbackDto(referralFeedback.get(), new ReferralFeedbackDto());
    }
}

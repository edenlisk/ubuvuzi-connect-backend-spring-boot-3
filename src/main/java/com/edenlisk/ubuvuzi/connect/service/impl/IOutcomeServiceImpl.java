package com.edenlisk.ubuvuzi.connect.service.impl;


import com.edenlisk.ubuvuzi.connect.dto.OutcomeDto;
import com.edenlisk.ubuvuzi.connect.entity.Outcome;
import com.edenlisk.ubuvuzi.connect.mapper.OutcomeMapper;
import com.edenlisk.ubuvuzi.connect.repository.IOutcomeRepository;
import com.edenlisk.ubuvuzi.connect.service.IOutcomeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IOutcomeServiceImpl implements IOutcomeService {

    private IOutcomeRepository outcomeRepository;

    /**
     * @param outcomeDto
     */
    @Override
    public void createOutcome(OutcomeDto outcomeDto) {
        Outcome outcome = OutcomeMapper.mapToOutcome(outcomeDto, new Outcome());
        outcomeRepository.save(outcome);
    }

    /**
     * @return List<OutcomeDto>
     */
    @Override
    public List<OutcomeDto> getAllOutcomes() {
        return outcomeRepository.findAll()
                .stream()
                .map(outcome -> OutcomeMapper.mapToOutcomeDto(outcome, new OutcomeDto()))
                .toList();

    }
}

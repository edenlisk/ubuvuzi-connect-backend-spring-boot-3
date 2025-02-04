package com.edenlisk.ubuvuzi.connect.service;

import com.edenlisk.ubuvuzi.connect.dto.OutcomeDto;

import java.util.List;

public interface IOutcomeService {


    /**
     * @param outcomeDto
     */
    void createOutcome(OutcomeDto outcomeDto);

    /**
     * @return List<OutcomeDto>
     */
    List<OutcomeDto> getAllOutcomes();

}

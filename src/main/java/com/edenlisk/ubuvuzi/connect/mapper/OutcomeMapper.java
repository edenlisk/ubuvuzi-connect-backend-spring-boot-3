package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.OutcomeDto;
import com.edenlisk.ubuvuzi.connect.entity.Outcome;

public class OutcomeMapper {

    public static OutcomeDto mapToOutcomeDto(Outcome outcome, OutcomeDto outcomeDto) {
        outcomeDto.setDescription(outcome.getDescription());
        outcomeDto.setName(outcome.getName());
        outcomeDto.setId(outcomeDto.getId());
        return outcomeDto;
    }


    public static Outcome mapToOutcome(OutcomeDto outcomeDto, Outcome outcome) {
        outcome.setDescription(outcomeDto.getDescription());
        outcome.setName(outcomeDto.getName());
        return outcome;
    }



}

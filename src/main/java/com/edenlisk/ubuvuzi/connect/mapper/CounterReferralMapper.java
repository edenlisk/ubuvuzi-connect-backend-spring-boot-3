package com.edenlisk.ubuvuzi.connect.mapper;


import com.edenlisk.ubuvuzi.connect.dto.ApplicationUserDto;
import com.edenlisk.ubuvuzi.connect.dto.CounterReferralDto;
import com.edenlisk.ubuvuzi.connect.dto.CreateCounterReferralDto;
import com.edenlisk.ubuvuzi.connect.entity.CounterReferral;

public class CounterReferralMapper {

    public static CounterReferral mapToCounterReferral(
            CreateCounterReferralDto counterReferralDto,
            CounterReferral counterReferral
            ) {
        counterReferral.setDate(counterReferralDto.getDate());
        counterReferral.setTime(counterReferralDto.getTime());
        counterReferral.setRecommendations(counterReferralDto.getRecommendations());
        return counterReferral;
    }

    public static CounterReferralDto mapToCounterReferralDto(
            CounterReferral counterReferral,
            CounterReferralDto counterReferralDto
    ) {
        counterReferralDto.setTime(counterReferral.getTime());
        counterReferralDto.setTime(counterReferral.getTime());
        counterReferralDto.setRecommendations(counterReferral.getRecommendations());
//        counterReferralDto.setTransferDto();
        counterReferralDto.setId(counterReferral.getId());
        counterReferralDto.setCreatedBy(counterReferral.getCreatedBy());
        counterReferralDto.setCreatedAt(counterReferral.getCreatedAt());
        counterReferralDto.setUpdatedBy(counterReferral.getUpdatedBy());
        counterReferralDto.setUpdatedAt(counterReferral.getUpdatedAt());
        counterReferralDto.setHealthCareProvider(ApplicationUserMapper.mapToApplicationUserDto(counterReferral.getHealthCareProvider(), new ApplicationUserDto()));
        return counterReferralDto;
    }
}

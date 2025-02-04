package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.CounterReferralDto;
import com.edenlisk.ubuvuzi.connect.dto.CreateCounterReferralDto;

public interface ICounterReferralService {


    void createCounterReferral(CreateCounterReferralDto counterReferralDto);

    CounterReferralDto getCounterReferralByTransfer(Long transferId);

}

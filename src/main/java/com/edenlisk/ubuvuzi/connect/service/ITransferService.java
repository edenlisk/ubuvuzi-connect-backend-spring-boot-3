package com.edenlisk.ubuvuzi.connect.service;


import com.edenlisk.ubuvuzi.connect.dto.CreateTransferDto;
import com.edenlisk.ubuvuzi.connect.dto.TransferDto;

import java.util.List;

public interface ITransferService {


    void createTransfer(CreateTransferDto createTransferDto);

    TransferDto getTransferById(Long id);

    List<TransferDto> getTransfersByHospital(Long id);

    List<TransferDto> getTransfersByHealthcareProvider(Long id);

    List<TransferDto> getPatientTransfersByPhoneNumber(String phoneNumber);

}

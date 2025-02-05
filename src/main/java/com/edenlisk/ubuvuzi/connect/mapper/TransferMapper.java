package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.*;
import com.edenlisk.ubuvuzi.connect.entity.Transfer;

public class TransferMapper {

    public static Transfer mapToTransfer(
            CreateTransferDto createTransferDto,
            Transfer transfer
            ) {

        transfer.setClientName(createTransferDto.getClientName());
        transfer.setDateOfBirth(createTransferDto.getDateOfBirth());
        transfer.setSerialNumber(createTransferDto.getSerialNumber());
        transfer.setGender(createTransferDto.getGender());
        transfer.setCaregiverName(createTransferDto.getCaregiverName());
        transfer.setCaregiverPhoneNumber(createTransferDto.getCaregiverPhoneNumber());
        // address thing to be handled in service before persistence
        transfer.setDateOfAdmission(createTransferDto.getDateOfAdmission());
        transfer.setDateOfTransferDecision(createTransferDto.getDateOfTransferDecision());

        // referral facility and receiving facility, contacted person ---> service

        transfer.setDistrict(createTransferDto.getDistrict());
        transfer.setSector(createTransferDto.getSector());
        transfer.setCell(createTransferDto.getCell());
        transfer.setVillage(createTransferDto.getVillage());
        transfer.setCallingTime(createTransferDto.getCallingTime());
        transfer.setTypeOfTransfer(createTransferDto.getTypeOfTransfer());
        transfer.setAmbulanceCallTime(createTransferDto.getAmbulanceCallTime());
        transfer.setDepartureTime(createTransferDto.getDepartureTime());
        transfer.setTransferReason(createTransferDto.getTransferReason());
        transfer.setClinicalPresentation(createTransferDto.getClinicalPresentation());
        transfer.setDisabilityType(createTransferDto.getDisabilityType());
        transfer.setTemperature(createTransferDto.getTemperature());
        transfer.setSpo2(createTransferDto.getSpo2());
        transfer.setRr(createTransferDto.getRr());
        transfer.setPulse(createTransferDto.getPulse());
        transfer.setBp(createTransferDto.getBp());
        transfer.setWeight(createTransferDto.getWeight());
        transfer.setHeight(createTransferDto.getHeight());
        transfer.setMuac(createTransferDto.getMuac());
        transfer.setLaboratoryAnalysis(createTransferDto.getLaboratoryAnalysis());
        transfer.setDiagnosis(createTransferDto.getDiagnosis());
        transfer.setTypeOfTransport(createTransferDto.getTypeOfTransport());
        transfer.setOtherTransportation(createTransferDto.getOtherTransportation());
        // health insurance ---> service
//        transfer.setOtherTransportation(createTransferDto.getOtherTransportation());
        transfer.setDate(createTransferDto.getDate());
        transfer.setTime(createTransferDto.getTime());
        return transfer;
    }


    public static TransferDto mapToTransferDto(
            Transfer transfer,
            TransferDto transferDto
    ) {

        transferDto.setId(transfer.getId());
        transferDto.setClientName(transfer.getClientName());
        transferDto.setDateOfBirth(transfer.getDateOfBirth());
        transferDto.setSerialNumber(transfer.getSerialNumber());
        transferDto.setGender(transfer.getGender());
        transferDto.setCaregiverName(transfer.getCaregiverName());
        // address thing to be handled in service before persistence
        transferDto.setDateOfAdmission(transfer.getDateOfAdmission());
        transferDto.setDateOfTransferDecision(transfer.getDateOfTransferDecision());

        transferDto.setDistrict(transfer.getDistrict());
        transferDto.setSector(transfer.getSector());
        transferDto.setCell(transfer.getCell());
        transferDto.setVillage(transfer.getVillage());
        transferDto.setCallingTime(transfer.getCallingTime());
        transferDto.setTypeOfTransfer(transfer.getTypeOfTransfer());
        transferDto.setAmbulanceCallTime(transfer.getAmbulanceCallTime());
        transferDto.setDepartureTime(transfer.getDepartureTime());
        transferDto.setTransferReason(transfer.getTransferReason());
        transferDto.setClinicalPresentation(transfer.getClinicalPresentation());
        transferDto.setDisabilityType(transfer.getDisabilityType());
        transferDto.setTemperature(transfer.getTemperature());
        transferDto.setSpo2(transfer.getSpo2());
        transferDto.setRr(transfer.getRr());
        transferDto.setPulse(transfer.getPulse());
        transferDto.setBp(transfer.getBp());
        transferDto.setWeight(transfer.getWeight());
        transferDto.setHeight(transfer.getHeight());
        transferDto.setMuac(transfer.getMuac());
        transferDto.setLaboratoryAnalysis(transfer.getLaboratoryAnalysis());
        transferDto.setDiagnosis(transfer.getDiagnosis());
        transferDto.setTypeOfTransport(transfer.getTypeOfTransport());
        transferDto.setOtherTransportation(transfer.getOtherTransportation());
        // health insurance ---> service
//        transferDto.setOtherTransportation(transfer.getOtherTransportation());
        transferDto.setDate(transfer.getDate());
        transferDto.setTime(transfer.getTime());
        transferDto.setCaregiverPhoneNumber(transfer.getCaregiverPhoneNumber());
        transferDto.setHealthCareProvider(ApplicationUserMapper.mapToApplicationUserDto(transfer.getHealthCareProvider(), new ApplicationUserDto()));
        transferDto.setContactedPerson(ApplicationUserMapper.mapToApplicationUserDto(transfer.getHealthCareProvider(), new ApplicationUserDto()));
        transferDto.setReceivingFacility(HospitalMapper.mapToHospitalDto(transfer.getReceivingFacility(), new HospitalDto()));
        transferDto.setReferralFacility(HospitalMapper.mapToHospitalDto(transfer.getReceivingFacility(), new HospitalDto()));
        transferDto.setHealthInsurance(HealthInsuranceMapper.mapToHealthInsuranceDto(transfer.getHealthInsurance(), new HealthInsuranceDto()));



        return transferDto;
    }

}

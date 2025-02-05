package com.edenlisk.ubuvuzi.connect.repository;


import com.edenlisk.ubuvuzi.connect.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {

    // Find all transfers where the hospital is either the referral or receiving facility
//    @Query("SELECT t FROM Transfer t WHERE t.referralFacility.id = :hospitalId OR t.receivingFacility.id = :hospitalId")
//    List<Transfer> findAllByHospitalId(@Param("hospitalId") Long hospitalId);

    List<Transfer> findAllByCaregiverPhoneNumberOrderByDateDesc(String phoneNumber);

//    findAllByReferralFacilityIdOrReceivingFacilityId
    List<Transfer> findAllByReferralFacility_IdOrReceivingFacility_IdOrderByDateDesc(Long referralFacility_id, Long receivingFacility_id);
//    findAllByHealthCareProviderUserId
    List<Transfer> findAllByHealthCareProvider_UserIdOrderByDateDesc(Long healthCareProvider_userId);

}

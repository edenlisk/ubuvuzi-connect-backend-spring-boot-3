package com.edenlisk.ubuvuzi.connect.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("AuditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**
     * @return current auditor
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("admin");
    }
}

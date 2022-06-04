package com.docker.test.config;

import com.docker.test.sample.SampleEntity;
import com.docker.test.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class SampleConfig {

    private final SampleRepository sampleRepository;

    /**
     * Sample 데이터
     */
    @EventListener(ApplicationReadyEvent.class)
    public void initSampleData() {
        log.info("[Sample Data Init]");

        sampleRepository.save(new SampleEntity("Hello"));
        sampleRepository.save(new SampleEntity("World"));
    }
}

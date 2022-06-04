package com.docker.test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    public Optional<SampleEntity> hello(Long idx) {
        return sampleRepository.findById(idx);
    }
}

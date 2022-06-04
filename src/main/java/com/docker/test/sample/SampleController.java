package com.docker.test.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/hello")
    public String hello(Long idx) {
        Optional<SampleEntity> sample = sampleService.hello(idx);
        log.info("[Find Data={}]", sample.get().getSampleWord());
        return sample.get().getSampleWord();
    }
}

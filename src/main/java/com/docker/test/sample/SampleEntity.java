package com.docker.test.sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter @Setter
@Entity
public class SampleEntity {

    @Id @GeneratedValue
    private Long id;
    private String sampleWord;

    public SampleEntity(String sampleWord) {
        this.sampleWord = sampleWord;
    }

    public SampleEntity(Long id, String sampleWord) {
        this.id = id;
        this.sampleWord = sampleWord;
    }
}

package com.ar50645.polls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        PollsApplication.class,
        Jsr310JpaConverters.class
})
public class PollsApplication {
//test git revision
    @PostConstruct
    void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
    console.log("test updtte 2");

    public static void main(String[] args) {
        SpringApplication.run(PollsApplication.class, args);
    }
}

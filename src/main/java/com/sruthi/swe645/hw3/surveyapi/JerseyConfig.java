package com.sruthi.swe645.hw3.surveyapi;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(SurveyResource.class);
    }
}

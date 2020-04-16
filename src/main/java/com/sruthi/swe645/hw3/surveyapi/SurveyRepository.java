package com.sruthi.swe645.hw3.surveyapi;

import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey,Integer> {
    Survey findBySurveyId(Integer surveyId);
}


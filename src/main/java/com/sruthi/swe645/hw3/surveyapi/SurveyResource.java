package com.sruthi.swe645.hw3.surveyapi;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/survey")
@Produces("application/json")
public class SurveyResource {

    @Autowired
    SurveyRepository repository;

    @GET
    @Path("/{surveyId}")
    public Survey getSurvey(@PathParam("surveyId") int surveyId) {
        return repository.findById(surveyId).get();
    }

    @GET
    public List<Integer> getAllSurveyIds() {
        List<Integer> ids = new ArrayList<>();
        Iterable<Survey> survey = repository.findAll();
        for(Survey s : survey) {
            ids.add(s.getSurveyId());
        }
        return ids;
    }

    @POST
    @Consumes("application/json")
    public void update(Survey survey) {
        repository.save(survey);
    }




}

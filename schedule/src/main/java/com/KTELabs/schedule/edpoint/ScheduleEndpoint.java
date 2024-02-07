package com.KTELabs.schedule.edpoint;


import com.KTELabs.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import schedule1.localhost._8080.GetScheduleRequest;
import schedule1.localhost._8080.GetScheduleResponse;

@Endpoint
public class ScheduleEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080";

    @Autowired
    private ScheduleService scheduleService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetScheduleResponse createSchedule(@RequestPayload GetScheduleRequest request) {
        GetScheduleResponse response = new GetScheduleResponse();
        response.setTicket(scheduleService.createSchedule(request));
        return response;
    }
}

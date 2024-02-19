package com.manrel.boilerservice.controller;

import com.manrel.boilerservice.model.request.BoilerSteamRequest;
import com.manrel.boilerservice.model.request.DeleteRequest;
import com.manrel.boilerservice.model.response.BoilerSteamResponse;
import com.manrel.boilerservice.model.response.Response;
import com.manrel.boilerservice.model.response.SaveResponse;
import com.manrel.boilerservice.service.BoilerSteamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/boiler")
@RequiredArgsConstructor
public class BoilerSteamController {

    private final BoilerSteamService boilerSteamService;

    @PostMapping
    public Response<SaveResponse> create(@RequestBody BoilerSteamRequest boilerSteamRequest) {
        SaveResponse saveResponse = boilerSteamService.saveOrUpdate(boilerSteamRequest);
        return new Response<>(saveResponse);
    }

    @GetMapping("/list")
    public Response<List<BoilerSteamResponse>> get(@RequestParam String period) {
        List<BoilerSteamResponse> boilerSteamList = boilerSteamService.getBoilerSteamList(period);
        return new Response<>(boilerSteamList);
    }

    @PostMapping("/delete")
    public Response<Void> delete(@RequestBody DeleteRequest request) {
        boilerSteamService.delete(request);
        return new Response<>();
    }
}

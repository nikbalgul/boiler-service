package com.manrel.boilerservice.service;

import com.manrel.boilerservice.model.request.BoilerSteamRequest;
import com.manrel.boilerservice.model.request.DeleteRequest;
import com.manrel.boilerservice.model.response.BoilerSteamResponse;
import com.manrel.boilerservice.model.response.SaveResponse;

import java.util.List;

public interface BoilerSteamService {

    SaveResponse saveOrUpdate(BoilerSteamRequest boilerSteamRequest);

    List<BoilerSteamResponse> getBoilerSteamList(String period);

    void delete(DeleteRequest request);
}

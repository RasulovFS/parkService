package com.example.mypark.controller;

import com.example.mypark.controller.mapper.ClientDtoMapper;
import com.example.mypark.controller.model.ClientDto;
import com.example.mypark.interactor.ClientParkingInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientParking")
@RequiredArgsConstructor
public class ClientParkingController {

    private final ClientParkingInteractor clientParkingInteractor;
    private final ClientDtoMapper clientDtoMapper;

    @RequestMapping(value = "/detail/{clientid}", method = RequestMethod.GET)
    public ResponseEntity<ClientDto> details(@PathVariable(value = "clientid") Integer clientid) {
        return ResponseEntity.ok(clientDtoMapper.map(clientParkingInteractor.getClient()));
    }
}

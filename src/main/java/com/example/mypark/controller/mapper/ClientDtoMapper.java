package com.example.mypark.controller.mapper;

import com.example.mypark.controller.model.ClientDto;
import com.example.mypark.interactor.model.Client;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/** Мапперы из бизнес-сущностей в dto сущность */
@Component
@Mapper(componentModel = "spring")
public interface ClientDtoMapper {

    ClientDto map(Client client);
}

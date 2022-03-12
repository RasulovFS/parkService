package com.example.mypark.interactor.mapper;

import com.example.mypark.database.model.ClientEntity;
import com.example.mypark.interactor.model.Client;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/** Маппер из любых сущности в бизнес-сущность */
@Component
@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client map(ClientEntity clientEntity);
}

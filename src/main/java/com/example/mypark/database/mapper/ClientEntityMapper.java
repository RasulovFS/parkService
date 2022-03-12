package com.example.mypark.database.mapper;

import com.example.mypark.database.model.ClientEntity;
import com.example.mypark.interactor.model.Client;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/** Из бизнес-сущности в модель базы*/
@Component
@Mapper(componentModel = "spring")
public interface ClientEntityMapper {

    ClientEntity map(Client client);
}

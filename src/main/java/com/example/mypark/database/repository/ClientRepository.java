package com.example.mypark.database.repository;

import com.example.mypark.database.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/** Интерфейс для запросов в таблицу Парковочные места*/
public interface ClientRepository extends JpaRepository<ClientEntity, UUID> {

}

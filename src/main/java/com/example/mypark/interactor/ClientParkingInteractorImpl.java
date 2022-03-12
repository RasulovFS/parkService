package com.example.mypark.interactor;

import com.example.mypark.database.mapper.ClientEntityMapper;
import com.example.mypark.database.repository.ClientRepository;
import com.example.mypark.interactor.mapper.ClientMapper;
import com.example.mypark.interactor.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientParkingInteractorImpl implements ClientParkingInteractor {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final ClientEntityMapper clientEntityMapper;

    public Client getClient() {
        /**работаем с базой и прочей логикой и отдаем бизнес сущность*/
        return new Client();
    }

    public void saveClient(Client client) {
        /** Пишем в базу*/
        var clientEntity = clientEntityMapper.map(client);
        clientRepository.save(clientEntity);
    }

}

package com.example.mypark.interactor;

import com.example.mypark.interactor.model.Client;

public interface ClientParkingInteractor {
    Client getClient();

    void saveClient(Client client);
}

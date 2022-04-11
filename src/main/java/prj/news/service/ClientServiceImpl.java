package prj.news.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prj.news.model.Client;
import prj.news.repository.ClientRepo;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public Client saveClient(Client client) {

        return clientRepo.save(client);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepo.findAll();
    }

    @Override
    public Client signupClient(Client client) {
        return clientRepo.save(client);

    }

    @Override
    public Client getClient(Long id) {
        Optional<Client> client = clientRepo.findById(id);
        if (client.isPresent()) {
            return client.get();
        }
        throw new RuntimeException("client is not found for the id " + id);
    }
}

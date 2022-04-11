package prj.news.service;

import java.util.List;

import prj.news.model.Client;

public interface ClientService {

    public Client saveClient(Client client);

    public List<Client> getAllClient();

    public Client getClient(Long id);

    public Client signupClient(Client client);

}

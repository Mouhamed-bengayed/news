package prj.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prj.news.model.Client;
import prj.news.service.ClientService;

@CrossOrigin
@RestController

@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public String add(@RequestBody Client client) {
        clientService.saveClient(client);
        return "new is client added";
    }

    @GetMapping("/getAll")
    public List<Client> getAlClients() {
        return clientService.getAllClient();
    }

    @GetMapping("/get/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }
}

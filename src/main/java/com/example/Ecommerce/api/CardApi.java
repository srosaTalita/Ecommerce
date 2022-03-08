package com.example.Ecommerce.api;

import java.util.List;
import com.example.Ecommerce.model.Card;
import com.example.Ecommerce.respository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class CardApi {
    @Autowired //substitui o construtor na injeção de dependências
    private CardRepository repository;
    
    @GetMapping("/api/card")
    public List<Card> read(Model req){
        List<Card> list = (List<Card>)repository.findAll();
        req.addAttribute("card", list);
        return list;
    }

    @PostMapping("/api/card")
    public String salvar(@RequestBody Card model){
        repository.save(model);
        return "Salvo com sucesso!";
    }

    @DeleteMapping("/api/card/{id}")
    public String delete(@PathVariable int id){
        repository.deleteById(id);
        return "Deletado com sucesso!";
    }

    @PutMapping("/api/card/{id}")
    public String update(@PathVariable int id, @RequestBody Card model){
        if(model.getId() == id){
            repository.save(model);
            return "Atualizado com sucesso!";
        }
        return "Ids diferentes -_-";
    }
}

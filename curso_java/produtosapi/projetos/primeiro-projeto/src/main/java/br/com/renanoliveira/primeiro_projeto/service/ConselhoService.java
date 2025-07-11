package br.com.renanoliveira.primeiro_projeto.service;

import br.com.renanoliveira.primeiro_projeto.model.Conselho;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ConselhoService {

    // lista do tipo Conselho
    private List<Conselho> conselhos;

    // gerar valor randomico
    private Random random = new Random();

    @PostConstruct
    public void init(){
        this.conselhos = Arrays.asList(
                new Conselho("Renan", "@RequestMapping serve para mapear minhas requisições HTTP", "Spring Boot"),
                new Conselho("Renan", "@GetMapping serve para mapear uma requisição do tipo GET", "Spring Boot"),
                new Conselho("Renan", "@Service serve para dizer que a classe é uma service", "Spring Boot")
        );
    }

    public Conselho getConselhoAleatorio() {
        // da minha lista de conselhos, preciso recuperar um objeto aleatório que meu random gerar
        return conselhos.get(random.nextInt(conselhos.size()));
    }
}

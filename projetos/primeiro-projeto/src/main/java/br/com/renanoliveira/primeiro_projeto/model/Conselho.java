package br.com.renanoliveira.primeiro_projeto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//meu model irá ter 3 informações: o nome do autor, a mensagem e ao que se refere essa mensagem
@Getter //anotação lombok para criar getters
@Setter //anotação lombok para criar setters
@AllArgsConstructor
public class Conselho {
    private String autor;
    private String mensagem;
    private String tipo;
}

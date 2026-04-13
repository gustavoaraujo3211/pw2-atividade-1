package Receita.model;

import Receita.enums.Dificuldade;
import Receita.enums.Preco;

import java.time.LocalTime;

public class Receita {
    public String titulo;
    public String autor;
    public AvaliacaoReceita avaliacao;
    public String ingredientes;
    public LocalTime duracao;
    public Preco preco;
    public int porcao;
    public Dificuldade dificuldade;
    public String descricao;

}

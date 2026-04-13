package Meteorologia.model;

import Meteorologia.enums.Diasemana;
import Meteorologia.enums.Luas;
import Meteorologia.enums.Ventodirecao;

import java.time.LocalDateTime;

public class Meteorologia {

    public LocalDateTime dataehora;
    public int temperatura;
    public double chuva;
    public Ventodirecao ventodirecao;
    public int umidade;
    public Luas lua;
    public int ventovelocidade;
    public Diasemana diasemana;
}


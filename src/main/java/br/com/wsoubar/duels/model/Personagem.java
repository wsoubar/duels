package br.com.wsoubar.duels.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Personagem {
    private int saude;
    private int ataque;
    private int defesa;
}
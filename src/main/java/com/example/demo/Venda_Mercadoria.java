package com.example.demo;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name="venda_mercadoria")
@Data  // Gera todos os Gets/Sets/Hashs/Icons com uma notação só
@Builder// Cria um metodo estatico em cada uma das classes, 
        // esses metodos permitem  mandar dados do construtor independente da ordem
@NoArgsConstructor // Criar construtor sem argumentos
@AllArgsConstructor// Criar construtor com argumentos

public class Venda_Mercadoria {

    @Id // diz que é chave
    @Column(name="venda_mercadoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz que é auto-numeração
    private Long id;

    @Column(name="code")
    private long codigo;
}

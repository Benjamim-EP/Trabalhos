package com.example.demo;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name="vendas")
@Data  // Gera todos os Gets/Sets/Hashs/Icons com uma notação só
@Builder// Cria um metodo estatico em cada uma das classes, 
        // esses metodos permitem  mandar dados do construtor independente da ordem
@NoArgsConstructor // Criar construtor sem argumentos
@AllArgsConstructor// Criar construtor com argumentos

public class Vendas {

    @Id // diz que é chave
    @Column(name="numerovenda")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz que é auto-numeração
    private Long id_venda;

    @Column(name="datavenda")
    private String data;
    
}

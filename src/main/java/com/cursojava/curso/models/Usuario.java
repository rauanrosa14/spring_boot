package com.cursojava.curso.models;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "Id")
    private Long id;

    @Getter @Setter @Column(name = "nome")
    private String nome;

    @Getter @Setter @Column(name = "apelido")
    private String apelido;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "telefone")
    private String telefone;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "descricao")
    private String descricao;

}

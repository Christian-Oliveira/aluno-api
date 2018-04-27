package br.com.alunoapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_curso")
public class Curso {

    private Integer id;
    private String nome;
}

package br.com.alunoapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_curso")
public class Curso {
    private Integer id;
    private String nome;
    private List<Aluno> alunos;
}

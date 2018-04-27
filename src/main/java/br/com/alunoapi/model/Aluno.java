
package br.com.alunoapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_aluno")
public class Aluno {
    private Integer id;
    private String name;
    private String cpf;
    private String matricula;
    private Curso curso;


}

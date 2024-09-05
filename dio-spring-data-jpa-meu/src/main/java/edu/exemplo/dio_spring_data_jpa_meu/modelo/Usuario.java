package edu.exemplo.dio_spring_data_jpa_meu.modelo;

import jakarta.persistence.*;

/* Usando o Spring JPA e anotações específicas iremos transformar essa classe em uma
 * entidade usando anotação @Entity 
 * (Uma entidade é uma representação de um conjunto de informações sobre determinado conceito do sistema. 
 * Toda entidade possui ATRIBUTOS, que são as informações que referenciam a entidade.)
 * 
 * Persistência (de dados): Ou seja, podemos entender o que é persistência de dados como a garantia de que 
 * um dado foi salvo e que poderá ser recuperado quando necessário no futuro. 
 * Esse conceito existe na computação para referenciar o ato de salvar os dados.
 */

@Entity
public class Usuario {
    @Id //Anotação para específica a chave primária da entidade;
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //Especifica uma geração estratégia de geração de valores de chave primária;
    //GenerationType.IDENTITY  é uma das estratégias de geração de chave primária;
    @Column(name = "user_id") //A anotação @Column determina a diferença do nome da coluna no banco (atributo do banco de dados) e o atributo da classe em si;
    private Integer id;
    //@Column(length = 200, nullable = false) //Neste caso, a anotação @Column está determinado que o tamanho dessa coluna será 50 e não poderá ser nulo. Como não foi passado o parâmetro nome, o nome do atributo de classe é o mesmo do atributo da entidade (coluna no banco de dados)
    private String nome;
   // @Column(length = 200, nullable = false)
    private String nomeUsuario;
   // @Column(length = 100, nullable = false)
    private String senha;
    
    public Usuario(Integer id, String nome, String nomeUsuario, String senha) {
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", nomeUsuario=" + nomeUsuario + "]";
    }

}

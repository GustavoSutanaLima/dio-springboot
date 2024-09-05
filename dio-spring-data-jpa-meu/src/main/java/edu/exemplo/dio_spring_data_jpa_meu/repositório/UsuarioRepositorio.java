package edu.exemplo.dio_spring_data_jpa_meu.repositório;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.exemplo.dio_spring_data_jpa_meu.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    //UsuarioRepositorio está extendendo JpaRepository<Usuario, Integer>: que faz a gestão de operações CRUD e da pesistência de dados automaticamente;
}

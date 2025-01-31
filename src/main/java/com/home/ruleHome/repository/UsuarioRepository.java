package com.home.ruleHome.repository;


import com.home.ruleHome.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE UPPER(u.name) LIKE UPPER(CONCAT('%', :name, '%'))")
    List<Usuario> findByListaName(@Param("name") String name) ;

    //Se pode haver um ou nenhum resultado, é recomendável usar Optional para evitar exceções quando não houver um usuário correspondente:
    @Query("SELECT u FROM Usuario u WHERE UPPER(u.name) LIKE UPPER(CONCAT('%', :name, '%'))")
    Optional<Usuario> usuario (@Param("name") String name) ;
}


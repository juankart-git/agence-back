package com.agence.api.persistence.crud;

import com.agence.api.persistence.entity.CaoUsuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CaoUsuarioRepository extends CrudRepository<CaoUsuario, String> {

    @Query(nativeQuery = true, value="select usu.* from cao_usuario usu " +
            "inner join permissao_sistema sis on usu.co_usuario = sis.co_usuario " +
            "where sis.co_sistema=1 and sis.in_ativo='S' and sis.co_tipo_usuario in (0,1,2)" )
    List<CaoUsuario> activeUsers();


}

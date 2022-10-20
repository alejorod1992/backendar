
package com.portfolio.alejor.Security.Repository;

import com.portfolio.alejor.Security.Entity.Rol;
import com.portfolio.alejor.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional <Rol> findByRolNombre(RolNombre rolNombre); 
}

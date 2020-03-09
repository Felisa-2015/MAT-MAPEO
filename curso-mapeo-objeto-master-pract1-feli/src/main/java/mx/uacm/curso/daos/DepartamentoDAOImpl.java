
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Departamento;

/**
 *
 * @author Felisa Dìaz 10-003-1195
 */
public class DepartamentoDAOImpl extends GenericDAOImpl<Departamento,Integer> implements DepartamentoDAO{
    
    public DepartamentoDAOImpl(EntityManager em) {
        super(em, Departamento.class);
    }
    
    
    
    
}

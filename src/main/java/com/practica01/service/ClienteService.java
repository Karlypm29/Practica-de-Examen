package com.practica01.service;

import com.practica01.domain.Cliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
}

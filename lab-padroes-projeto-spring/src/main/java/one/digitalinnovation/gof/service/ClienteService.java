package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(long id);
    void inserir(Cliente cliente);
    void atualizar(long id, Cliente cliente);
    void deletar(long id);

    
}

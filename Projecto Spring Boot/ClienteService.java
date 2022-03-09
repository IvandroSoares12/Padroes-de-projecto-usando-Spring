/*Interface que define o padrao <b>Strategy no dominio cliete com
*isto se necessario,podemos ter multiplas implementações dessa mesma interface
*/

public interface ClienteService {
    Interable<Cliente>buuscarTodos();
    Cliente buscarPorid(Long id);
    void inserir (Cliente cliente);
    void atualizar(Long id,Cliente cliente);
    void deletar(Long id);

}

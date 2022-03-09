@RestController
@RequestMapping("clientes")
public class ClienteresController {

    @Autowired
    private ClienteService clienteservice;

    @GetMapping 
    publicResponseEbtily<Interable<Cliente>>buscarTodos(){
        returnResponseEntily.ok(clienteservice.buscarTodos());

    }

    @PostMapping
    publicResponseEbtily<Cliente>inserir(@RequestBody,Cliente cliente){
        clienteservice.inserir(cliente);
        returnResponseEntily.ok(cliente);
    }

    @PutMapping("/{id}")
    publicResponseEbtily<Cliente>atualizar(@PathVarianle long id,RequestBody Cliente cliente){
        clienteservice.atualizar(cliente);
        returnResponseEntily.ok(cliente);
      

    }

    @DeleteMapping("/{id}")
    publicResponseEbtily<Cliente>deletar(@PathVarianle long id,RequestBody Cliente cliente){
        clienteservice.deletar(id);
        returnResponseEntily.ok().Build();

}

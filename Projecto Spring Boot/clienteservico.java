public class clienteservico implements ClienteService {


    @Autowired
    private ClienteRepository clienterepository;
    @Autowired
    private EnderecoRepository enderecorepository;
    @Autowired
    private ViaCepService viacepservice;

   @Override   
    public Interable<Cliente>buscarTodos(){
        return clienterepository.findAll();
    }
    @Override
   public  Cliente buscarPorid(Long id){
       Optional<Cliente>cliente=clienterepository,findById(id);
   
  return cliente.get();
   }
   @Override
   public  void inserir (Cliente cliente){
        salvarClienteComCep(cliente);
   }
    
@Override
   public  void atualizar(Long id,Cliente cliente){
     Optional<Cliente>clienteBd=clienterepository.findById(id);
     if(clienteBd.isPresent()){
         salvarClienteComCep(cliente);

     }
       }
   @Override
    public  void deletar(Long id){
      clienterepository=deleteById(id);
    
    
    
    }
    @Override
    private void salvarClienteComCep(Cliente cliente){
        String cep=cliente.getEndereco().getCep();
        Endereco endereco=enderecorepository.findById(cep).orElsetGet(()->{
            Endereco novoendereco=viacepservice.consultarcep(cep);
             enderecorepository.save(novoendereco);
             return novoendereco;
    });
    cliente.setEndereco(endereco);
    clienterepository.save(cliente);
    }

}


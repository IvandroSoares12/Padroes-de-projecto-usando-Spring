@FeingCliente(name = "viacep", url = "http;//viacep.com.br/ws")
public interface Viacepservice {
    @RequestMapping(method=RequestMethod.GET,value="/{cep}/json/")
    Endereco consultarcep(@PathVariable("cep")String cep);

}

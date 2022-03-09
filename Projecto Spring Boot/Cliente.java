import javax.annotation.processing.Generated;

public class Cliente {
    @GeneratedValue(strategy=GenerationType.AUTO);
    private long id;
    private String nome;
    @ManyToOny;
    private endereco Endereco;
    public Long getid(){
        return id;
    }
    public void setid(long id){
        this.id=id;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public endereco Endereco(){
        return Endereco;
    }
    public void setEndereco(endereco Endereco){
        this.Endereco=Endereco;
    }



}

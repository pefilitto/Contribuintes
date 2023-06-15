import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrupoDeContribuintes{
    private List <Contribuinte> contribuintes;

    public GrupoDeContribuintes() {
        this.contribuintes = new ArrayList<>();
    }

    public List<Contribuinte> getContribuintes() {
        return contribuintes;
    }

    public void setContribuintes(List<Contribuinte> contribuintes) {
        this.contribuintes = contribuintes;
    }

    public void inserePessoaFisica(String nome, String cpf, double renda, String sexo){
        contribuintes.add(new PessoaFisica(nome, cpf, renda, sexo));
    }

    public void inserePessoaJuridica(String nome, String cnpj, double renda, Date ano_de_fundacao){
        contribuintes.add(new PessoaJuridica(nome, cnpj, renda, ano_de_fundacao));
    }

    public double verificaImpostoTotal(){
        double cont=0;
        for (int i = 0; i < contribuintes.size(); i++) {
            cont += getContribuintes().get(i).calcImposto();
        }
        return cont;
    }

    public double verificaQtdMulheres(){
        int cont=0;
        for (int i = 0; i < contribuintes.size(); i++) {
            if (getContribuintes().get(i) instanceof PessoaFisica){
                if(((PessoaFisica) contribuintes.get(i)).getSexo() == "F")
                    cont++;
            }
        }
        return (double) cont/contribuintes.size()*100;
    }
}

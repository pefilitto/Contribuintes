import java.util.Date;

public class PessoaJuridica extends Contribuinte{
    private Date ano_de_fundacao;

    public PessoaJuridica(String nome, String cpf, double renda, Date ano_de_fundacao) {
        super(nome, cpf, renda);
        this.ano_de_fundacao = ano_de_fundacao;
    }

    @Override
    public double calcImposto() {
        double renda = this.renda;
        return renda*0.1;
    }
}

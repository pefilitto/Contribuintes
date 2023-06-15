public class PessoaFisica extends Contribuinte{
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public PessoaFisica(String nome, String cpf, double renda, String sexo) {
        super(nome, cpf, renda);
        this.sexo = sexo;
    }

    @Override
    public double calcImposto() {
        double renda = this.renda;
        double imposto=0;
        if(renda >= 0 && renda <= 1400){
            imposto = 0;
        }
        else if(renda <= 2100.00){
            imposto = renda * 0.1;
        }
        else if(renda <= 2800){
            imposto = renda * 0.15;
        }
        else if(renda <= 3600){
            imposto = renda * 0.25;
        }
        else imposto = renda * 0.3;

        return imposto;
    }
}

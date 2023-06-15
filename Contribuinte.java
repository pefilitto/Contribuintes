abstract class Contribuinte implements ITributacao{
    protected String nome;
    protected String cpf;
    protected double renda;

    public Contribuinte(String nome, String cpf, double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}

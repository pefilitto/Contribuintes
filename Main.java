import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GrupoDeContribuintes lista = new GrupoDeContribuintes();
        Date d = new Date(2002-10-30);

        lista.inserePessoaFisica("Pedro", "425.117.858-03", 1300, "M");
        lista.inserePessoaFisica("Mariana", "463.623.958-08", 2000, "F");
        lista.inserePessoaJuridica("Unoeste", "44.860.740/0001-73", 1000, d);
        lista.inserePessoaJuridica("Empresa 2", "00.000.000/0001-80", 150000, d);

        System.out.println("O total de imposto a ser pago eh de: R$" + lista.verificaImpostoTotal());
        System.out.println("A porcentagem mulheres nessa lista eh de: " + lista.verificaQtdMulheres() + "%");
    }
}
package Aula05.cemiteriodeelefantes.gestao;
public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Airton", "2321321", 4000);
        Departamento departamento = new Departamento("RH");
        departamento.adicionarEmpregado(empregado);
        empregado.detalhes();
    }
}

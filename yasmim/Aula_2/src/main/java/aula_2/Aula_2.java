package aula_2;
public class Aula_2 {
    public static void main(String[] args) {
        
        // Classe Ganço
        
        Ganco g1 = new Ganco("Rosa", 1.0f);
        System.out.println("\nCLASSE GANÇO\n");
        g1.detalhes();
        
        System.out.println("___________________");
        
        //Classe Livro
        
        System.out.println("\nCLASSE LIVRO\n");
        
        Livro l1 = new Livro("J.K", "Harry Potter", 1997);
        
        l1.detalhes();
        
        System.out.println("\n");
        
        Livro l2 = new Livro();
        l2.autor = "J.A";
        l2.titulo = "Orgulho e Preconceito";
        l2.anoPublicacao =  1813;
        
        l2.detalhes();
       
        System.out.println("____________________");
        
        //Classe Circulo
        
        Circulo C = new Circulo();
        
        System.out.println("\nCLASSE CIRCULO\n");
        C.definirRaio(7.0);
        double areaCalculada = C.calcArea(Circulo.PI); 
        System.out.println("Área do círculo: " + areaCalculada);
       
        System.out.println("______________________");
        
       //Classe Calculadora
        
       Calculadora calculadora = new Calculadora();
       
        System.out.println("\nCLASSE CALCULADORA\n");
        int resultado1 = calculadora.calcularSoma(10, 97);
        int resultado2 = calculadora.calcularSoma(86, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        
        System.out.println("\n");
    }
}

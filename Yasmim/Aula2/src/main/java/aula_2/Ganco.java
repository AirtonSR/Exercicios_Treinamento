package aula_2;
public class Ganco {
    public String corDaPluma;
    public float altura;
    
    public Ganco(String corDaPluma, float altura) {
        this.corDaPluma = corDaPluma;
        this.altura = altura;
    }
    public void detalhes(){
        System.out.println("Cor: " + this.corDaPluma + " \nAltura: " + this.altura);
    }
}

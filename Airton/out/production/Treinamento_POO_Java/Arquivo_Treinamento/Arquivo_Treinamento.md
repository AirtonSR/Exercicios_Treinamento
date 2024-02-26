<font size= "4" face="Vollkorn">

Treinamento Programação Orientada Objeto em java

Treinador: Thiago André

## Introdução
### **O que é Programação Orientada a Objetos (POO)?**
A Programação Orientada a Objetos (POO) é um paradigma de programação que se baseia no conceito de "objetos". Esses objetos podem conter dados na forma de atributos e código na forma de métodos. O principal objetivo é modelar o mundo real de forma mais próxima possível, dividindo-o em entidades autônomas que interagem entre si.
1. **Vantagens da POO:**
   - Reutilização de Código: A capacidade de reutilizar classes e objetos facilita o desenvolvimento e manutenção de software.
   Encapsulamento: Oculta detalhes internos de implementação e expõe apenas o necessário, melhorando a segurança e a modularidade.
   Herança: Permite que uma classe herde características e comportamentos de outra, promovendo a reutilização e a criação de hierarquias de classes.
   Polimorfismo: Permite que objetos de diferentes classes sejam tratados de forma uniforme, facilitando a flexibilidade e extensibilidade do código.
2. **Conceitos Básicos:**
   - Classes e Objetos:
      Classe: Uma classe é um modelo ou blueprint para criar objetos. Ela define os atributos (variáveis) e métodos (funções) que os objetos dessa classe terão.
3. Princípios da POO:
   - Abstração: Representa características essenciais de um objeto, ignorando detalhes irrelevantes.
   - Encapsulamento: Esconde a implementação interna e expõe apenas o necessário.
   - Herança: Permite que uma classe herde características de outra.
   - Polimorfismo: Permite que objetos de diferentes tipos sejam tratados de forma uniforme.
4. **Considerações Finais:**
   - A POO é uma abordagem poderosa para projetar sistemas complexos, tornando o código mais modular, reutilizável e fácil de entender. Ela promove o desenvolvimento centrado em objetos, proporcionando uma maneira eficaz de lidar com a complexidade do mundo real na programação de software.

### **Atributos**
- Em Java, atributos referem-se às variáveis que pertencem a uma classe. Esses atributos representam as características ou propriedades dos objetos criados a partir dessa classe. Eles são muitas vezes chamados de membros de dados ou campos da classe. Aqui estão alguns pontos essenciais sobre atributos em Java:

Declaração de Atributos:

- Os atributos são declarados dentro da classe, fora dos métodos.
Eles podem ter diferentes tipos de dados, como inteiros, strings, booleanos, objetos de outras classes, entre outros.

````java
public class Ganso {
    // Atributos
    String pena;
    String cor;
    boolean voar;
}
````

### **Metódos**
O que são métodos em Java:
   - Em programação orientada a objetos (POO), um método é uma função associada a uma classe ou objeto. Ele define comportamentos específicos que objetos dessa classe podem realizar. Os métodos representam ações ou operações que podem ser executadas sobre os dados da classe. Eles encapsulam a lógica de manipulação dos atributos e fornecem uma interface para interagir com objetos.

Declaração e chamada de métodos:
````java
public class Ganso {
    // Método sem parâmetros e sem retorno
    public void Comer() {
        System.out.println("Ganso comendo !!!!");
    }

    // Método com parâmetros e retorno
    public void correr(int velocidade){
        return velocidade + 1;
    }
}
````
Chamada de Método:
````java
public class Main {
    public static void main(String[] args) {
        Ganso gs = new Ganso();

        gs.Comer();
        gs.correr(20);
    }
}

````

### **Construtores e Destrutores**
**Construtores:**
1. O que são construtores:
    - Em Java, um construtor é um método especial chamado no momento em que um objeto de uma classe é criado.
Ele é responsável por inicializar os atributos da classe e realizar tarefas necessárias para garantir que o objeto seja consistente e pronto para uso.

**Sobrecarga:**
1. Sobrecarga de construtores:

   - Assim como métodos, construtores podem ser sobrecarregados, permitindo a criação de objetos de diferentes maneiras.

**Destrutores:**
1. Destrutores em Java:
   - Java não possui explicitamente destrutores como em algumas outras linguagens.
   O Garbage Collection é um processo automático que gerencia a liberação de memória, eliminando objetos não referenciados.
   1. Coleta de lixo (Garbage Collection):

      - Java usa o Garbage Collector para identificar e remover objetos que não estão mais sendo referenciados pelo programa.
A classe Object tem um método finalize(), que é chamado antes de um objeto ser removido pela coleta de lixo. No entanto, o uso direto deste método não é comum.
### **Emcapsulamentoe e Modificadores de Acesso**
<font size="5">Encapsulamento:</font>
- Encapsulamento é outro princípio chave da POO e envolve o agrupamento dos detalhes de implementação de uma classe, ocultando o acesso direto aos seus membros. Em Java, o encapsulamento é frequentemente alcançado usando modificadores de acesso (private, protected, public).

  - **Public:** A classe, método ou atributo é acessível de qualquer lugar.
  - **private:** A classe, método ou atributo é acessível apenas dentro da própria classe.
  - **Protected:** A classe, método ou atributo é acessível dentro da própria classe, classes do mesmo pacote e subclasses (mesmo que estejam em pacotes diferentes)
  - **Default:**  A classe, método ou atributo é acessível apenas dentro do mesmo pacote.

Para mais informações sobre emcapsulamento [Click Aqui](https://blog.betrybe.com/tecnologia/encapsulamento/)

<font size="5">Modificadores de Acesso:</font>
- Em programação orientada a objetos, os métodos get e set são usados para acessar e modificar os valores dos atributos de uma classe. Eles fazem parte de uma prática chamada encapsulamento, que visa controlar o acesso aos membros de uma classe. Aqui estão os detalhes sobre esses métodos:
1. Método Get (get):
   - Objetivo:
O método get é usado para obter o valor de um atributo privado de uma classe
2. Método Set (set):
   - Objetivo:
   O método set é usado para modificar o valor de um atributo privado de uma classe.

### **Instacia e Abstração**

<font size="5">**Instancia:**</font>
Refere-se à criação de um objeto a partir de uma classe. Quando você instancia uma classe, está criando uma cópia específica dessa classe na memória,
com seus próprios valores de atributos e comportamentos. Cada instância é independente das outras e pode ser manipulada separadamente. Por exemplo, se você tem uma classe Cachorro, 
ao criar uma instância dessa classe, você obtém um objeto específico que representa um cachorro em particular, com sua própria idade, raça, cor, etc.

````java
Animal animal = new Animal();
````
- No primeiro trecho de código, estamos criando uma instância da classe Animal utilizando o operador new, o que aloca espaço na memória para um novo objeto do tipo Animal.
Em seguida, estamos atribuindo essa instância à variável animal, que é do tipo Animal. Portanto, animal é uma referência para um objeto do tipo Animal.

````java
Animal animal = new Cachorro();
````
- No segundo trecho, estamos criando uma instância da classe Cachorro, que é uma subclasse de Animal. 
- Em seguida, atribuímos essa instância à mesma variável animal. Isso é possível porque o polimorfismo permite que uma variável de referência de uma superclasse possa apontar para um objeto de uma subclasse. Nesse caso, Cachorro é uma especialização de Animal, então pode ser tratado como um Animal. Essa técnica é útil quando queremos tratar diferentes tipos de objetos de forma uniforme, por exemplo, em listas de animais onde pode haver diferentes tipos de animais representados.

<font size="5">**Abstração:**</font>
Em Java, o termo "abstrato" é frequentemente usado para descrever uma classe abstrata ou um método abstrato. Uma classe abstrata é uma classe que não pode ser instanciada diretamente,
ou seja, você não pode criar objetos a partir dela. Ela serve como um modelo para outras classes que estendem dela,
fornecendo uma estrutura comum e métodos que podem ser implementados por suas subclasses. Um método abstrato é um método declarado sem implementação na classe abstrata, deixando a implementação para suas subclasses. 
Isso permite que cada subclasse forneça sua própria implementação específica para o método abstrato. Por exemplo, você pode ter uma classe abstrata Veículo, que define métodos como acelerar() e parar() como métodos abstratos.
Então, as subclasses concretas como Carro e Bicicleta podem fornecer suas próprias implementações específicas para esses métodos.

### **Herança e Polimorfismo**

<font size="5">**Herança:**</font>
A herança é um dos princípios fundamentais da Programação Orientada a Objetos (POO) e é implementada em Java por meio da palavra-chave extends. Permite que uma classe (subclasse) herde os membros (atributos e métodos) de outra classe (superclasse).
- Para se herda um atributos de uma classe pai se ultiliza os extends e o nome da classe.
- Se atente quando se herda os atributos da classe pai, vou so consegue alterar o tipo e o nome na propria classe pai, pois na classe filho não tem autorização.

```java
public class Classe1{
    
    public void tipo(){
        System.out.println("Pato de Boracha");
    }
}
```

```java
public class Classe2 extends Classe1{
    public void barulho(){
        System.out.println("Check, check !!!");
    }
}
```
- Com esse exemplo, Podemos ver que `Classe2` ta herdando os metódos da classe `Classe1`, com isso você consegue herda os metodos da classe pai e ultilizar elas em sua classe , mais preste atenção se você definir na classe pai a variavel como `private`, você não consegue acessar ela na sua classe filha, qualquer duvida proucure emcapsolamento que você tira suas duvidas. 

<font size="5">**Polimorfismo:**</font>
O polimorfismo é um dos princípios fundamentais da programação orientada a objetos (POO). Ele se baseia na capacidade de objetos de diferentes classes responderem ao mesmo método de maneira única. Em Java, o polimorfismo pode ser alcançado por meio de duas formas: polimorfismo de sobrecarga e polimorfismo de sobrescrita.
1. Benefícios do Polimorfismo:
     - Flexibilidade:
O polimorfismo permite que um objeto seja tratado como uma instância de sua classe base, proporcionando flexibilidade no design.
2. Manutenção Simplificada:
   - Facilita a manutenção, pois as mudanças nas implementações são feitas apenas nas classes específicas, mantendo a consistência.
3. Código Mais Limpo:
   - Promove um código mais limpo e modular, evitando repetições desnecessárias.

### **Conteúdo Adicional**

- Para se ultilizar os comanda de imprimir tipo `%d, %f ...` se ultiliza os comandos printf para se imprimir , ou então String.format
````java    
    //Esse exemplo aqui e a forma de erro
    public class Erro {
    int idade = 18;
    System.out.println("Idade é: %d",idade); // esse programa vai gerar
    // o erro pois para se consiga imprimir nesse formato se ultiliza o printf

    //-------------------------------------------------------------------------
}     // Agora e exemplo certo;
        
    public class Acerto1{
        int idade = 18;
        System.out.printf("Idade é: %f", idade);
        //dessa forma você consiguirar imprimir sua variavel
    }
    
    // -----------------------------------------------------------
        // Outro exemplo certo

    public class Acerto2{
        int idade = 18;
        
        String imprimir = String.format("Idade é: ", idade);
    }
````

- `Static` faz que sua classe não precise que seja instanciada para que se consiga acessar seus atributos

````java
import java.util.Scanner; // biblioteca para que consiga digitar algo no terminal

public class MinhaClasse {
    float idade;

    public static void InformaIdade() {
        Scanner scanner = new Scanner(System.in); // Essa e a forma de cria ela
        idade = scanner.nextFloat(); // Esse Aqui e a forma de chama ela
        System.out.printf("Minha idade é: %f", idade);
    }
    
}

public class Main{
    public static void main(String[] args) {
        MinhaClasse.InformaIdade(); // você consgue acessar diretamente
    }
}
````
- È possivel cria dois contrutores para uma classe, segue o exemplo:

```java
public class MinhaClasse{
    public static void main(String[] args) {
        MinhaClasse2 mc = new MinhaClasse2();
        MinhaClasse2 mc1 = new MinhaClasse2("Airton", 20);
    
    }
}

public class MinhaClasse2{
    public int idade;
    public String nome;
    
    public MinhaClasse(){
        
    }
    
    public MinhaClasse(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
}
```

## Classe abstrata não pode ser instaciada
pode conter metodos abtratos e metodos concreto
`Abs`

## O que e Abstrato?
o termo "abstrata" refere-se a algo que não é concreto ou tangível, mas sim conceitual, geral ou idealizado. Na filosofia, por exemplo, "abstrato" se opõe a "concreto", significando algo que existe apenas na mente, como ideias, conceitos ou princípios, em oposição a objetos físicos.

No contexto da programação orientada a objetos (POO), uma classe abstrata segue essa ideia de abstração. Ela é um tipo de classe que não pode ser instanciada diretamente, ou seja, não pode ser transformada em um objeto real. Em vez disso, ela serve como um modelo ou molde para outras classes que estendem dela, chamadas de subclasses.

Assim, uma classe abstrata é uma representação abstrata de um conceito mais amplo, que define um conjunto de características e comportamentos que as subclasses devem implementar. Ela pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação), além de atributos e outros elementos de uma classe.

Portanto, a abstração em programação refere-se à capacidade de capturar os aspectos essenciais de algo, ignorando detalhes irrelevantes, e representá-los de forma conceitual e reutilizável. As classes abstratas desempenham um papel fundamental nesse processo, permitindo que os desenvolvedores criem hierarquias de classes que refletem a estrutura e comportamento do domínio do problema de forma mais abstrata e organizada.


```
</font>

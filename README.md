![imagemGit](https://user-images.githubusercontent.com/97994560/155146294-e61f3fe0-ee97-4fdf-acd6-2d4c4349ae6a.png)

Repositório destinado a entrega dos desafios da trilha Back-end

# 💻 trilhaBackEnd
A missão nessa nova jornada é a capacitação nos pontos de vista técnico e profissional, a fim de tornar um desenvolvedor NTT. Visando alcançar um patamar de especialista. Trilhando sempre pelo caminho da ética e transparência.

# 📖 Desafios
- [Desafio 1](#-Desafio-1)
- [Desafio 2](#-Desafio-2)

## 🎯 Desafio 1
O objetivo durante o desafio 1 deve ser realizar o entendimento do que é um sistema de controle de versão, quais são suas vantagens na prática e aprender os comandos básicos para entregar os próximos desafios.

```
a) Com suas palavras defina o que é um sistema de controle de versões (VCS)?
----------
O VCS é um software que tem como finalidade gerenciar e controlar as versões, históricos e documentações durante o desenvolvimento de um sistema.
```

```
b) Cite cinco vantagens em utilizar um VCS?
----------
1 - Controle do histórico: facilidade na análise do histórico de desenvolvimento e no resgaste de versões mais antigas e estáveis.
2 - Trabalho em equipe: um sistema de versionamento permite que diversas pessoas trabalhem sobre o mesmo conjunto de documentos ao mesmo tempo, minimizando o desgaste provocado por problemas com conflitos de edições.
3 - Ramificação de projeto: possibilita a divisão do projeto em várias linhas de desenvolvimento sem que uma interfira na outra.
4 - Segurança: o VCS usa mecanismos de segurança que evitam invasões e permita que somente usuários autorizados acessem os documentos.
5 - Confiança: O uso do repositório remoto ajuda a não perder arquivos por eventos inesperados.
```

```
c) Cite três exemplos de VCS?
----------
1 - Git
2 - SVN
3 - CVS
```
[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 2
```
a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares?
----------
A programação orientada a objetos é um paradigma que utiliza objetos como elementos principais para a construção
de uma solução, tendo como pilares:
1 - Abstração.
2 - Encapsulamento.
3 - Herança.
4 - Polimorfismo.
```

```
b) Exemplifique e explique um cenário de abstração:
----------
Abstração de características e ações do mundo real para definição de um objeto. No exemplo abstraímos do animal 
cachorro as características: (cor do pelo, raça, tamanho e peso) e as ações: (latir, comer, andar e abanar o rabo).
```
```java
public class Cachorro {

    String corDoPelo;
    String raca;
    Double tamanho;
    Double peso;
    
    public String latir() {
        return "Latindo...";
    }
    
    public String comer() {
        return "comendo ração...";
    }
    
    public String andar() {
        return  "andando...";
    }
    
     public String abanarRabo() {
        return  "Abanando rabo...";
    }
```

```
c) Exemplifique e explique um cenário de encapsulamento:
----------
Técnica usada para não expor dados internos de um objeto ao usuário. No exemplo temos o objeto Cliente e não
queremos expor seus dados pessoais como, nome, cpf e telefone, desse modo definimos os atributos em questão como
privados e usaremos os métodos setters e getters para acessar os dados.
```
```java
public class Cliente {

    private String nome;
    private String cpf;
    private int telefone;
    
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
```

```
d) Exemplifique e explique um cenário de herança:
----------
A herança permite que uma classe herde atributos e métodos de outra. No exemplo temos as classes Gerente, Secretário e 
Técnico que herdam os atributos e métodos da classe Funcionário.
```
```java
public class Funcionario {

    public String nome;
    public String cpf;
    public Double salario;

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
```
```java
public class Gerente extends Funcionario{

    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}

public class Secretario extends Funcionario {

    private String telefoneCorporativo;

    public String getTelefoneCorporativo() {
        return telefoneCorporativo;
    }

    public void setTelefoneCorporativo(String telefoneCorporativo) {
        this.telefoneCorporativo = telefoneCorporativo;
    }

}
```
```java
public class Tecnico extends Funcionario{
}
```

```
e) Exemplifique e explique um cenário de polimorfismo:
----------
O polimorfismo permite o uso de métodos com implantações distintas em diferentes objetos, desde que mantenha-se a 
mesma assinatura do método da superclasse. No exemplo temos a superclasse abstrata animal que não poderá ser instanciada
e as subclasses cachorro e peixe, as subclasses herdam o método locomover da classe animal, porém cada uma implementa a
sua forma específica de locomover em seu método.
```
```java
public abstract class Animal {

    public String tipoAnimal;

    public String locomover() {
        return "locomovendo";
    }

}
```
```java
public class Cachorro extends Animal{

    @Override
    public String locomover() {
        return tipoAnimal + " andando.";
    }

}
```
```java
public class Peixe extends Animal {

    @Override
    public String locomover() {
        return tipoAnimal + " nadando.";
    }

}
```
```
f) Cite 5 vantagens da POO:
----------
1 - Facilidade na reutilização do código.
2 - Possibilidade de trabalhar em um nível mais elevado de abstração.
3 - Facilidade de manutenção considerando o conceito de herança.
4 - O conceito de objeto fornece grande independência ao programa.
5 - Processo de desenvolvimento ágil. Várias equipes podem trabalhar no mesmo projeto de
forma independente.
```
[Voltar para menu de desafios](#-Desafios)


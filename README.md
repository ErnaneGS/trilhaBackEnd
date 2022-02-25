![imagemGit](https://user-images.githubusercontent.com/97994560/155146294-e61f3fe0-ee97-4fdf-acd6-2d4c4349ae6a.png)

Repositório destinado a entrega dos desafios da trilha Back-end

# 💻 trilhaBackEnd
A missão nessa nova jornada é a capacitação nos pontos de vista técnico e profissional, a fim de tornar um desenvolvedor NTT. Visando alcançar um patamar de especialista. Trilhando sempre pelo caminho da ética e transparência.

# 📖 Desafios
- [Desafio 1](#-Desafio-1)
- [Desafio 2](#-Desafio-2)
- [Desafio 3](#-Desafio-3)

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
◀️[Voltar para menu de desafios](#-Desafios)

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
◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 3
O objetivo durante o desafio 3 é entender o básico a respeito do protocolo de comunicação  mais  utilizado  da  internet,
e  a  partir  desses  princípios  ser  capaz  de  implementar controllers a fim de se comunicar com uma aplicação de 
front-end, um micro serviço ou outros tipos de aplicações.

```
a) Com suas palavras defina:
I. O que é o protocolo de comunicação HTTP e como ele funciona:
----------
É um protocolo que determina os padrões e regras de troca de informações entre servidores. O seu funcionamento se da
quando um cliente inicia uma solicitação ao servidor através do request HTTP, que faz o acesso ao servidor e retorna 
o conteúdo desejado ao cliente ou uma mensagem de erro HTT informando o porquê não foi possível localizar ou realizar
aquela solicitação.

II. O que é REST, e qual é a sua relação com o protocolo HTTP:
----------
O REST é um padrão de arquitetura que define como vai acontecer a comunicação entre camadas da aplicação, essa
comunicação acontece através dos verbos do HTTP correspondentes ao método CRUD (Create, Read, Update e Delete).

III. O que é Web API, e qual é a sua relação com REST:
----------
API é um conjunto de regras que permite a comunicação de diferentes programas, essa comunicação se torna mais fácil
utilizando o REST e suas funções, a qual podemos executar solicitações e receber respostas através do protocolo HTTP.
```
```
b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades:
```
|Requisições | Descrição                                                                    |
|-----------|------------------------------------------------------------------------------|
| POST      | Usado para enviar dados para o servidor.                                     |
| GET       | Usado para recuperar informações de um determinado servidor.                 |
| PATCH     | Usado para realizar modificações parciais nos recursos.                      |
| PUT       | Usado para substituir os dados atuais pelos dados da nova requisição enviada |
| DEL       | Usado para deletar um recurso.                                               |

```
c) Crie uma classe do tipo controller para a entidade categoria:
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafioTres/financys/src/main/java/trilha/back/financys/controller/CategoryController.java)<br/>

```
d) Repita o item c para lançamentos:
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafioTres/financys/src/main/java/trilha/back/financys/controller/EntryController.java)<br/>

```
e) Crie 2 objetos do tipo categoria:
```
```json
  {
       "id": 1,
       "name": "Salario",
       "description": "Pagamento mensal"
  }
```
```json
  {
       "id": 2,
       "name": "Vale Alimentação",
       "description": "Pagamento mensal"
  }
```
```
f) Liste as categorias:
```
```json
[
    {
        "id": 1,
        "name": "Salario",
        "description": "Pagamento mensal"
    },
    {
        "id": 2,
        "name": "Vale Alimentação",
        "description": "Pagamento mensal"
    }
]
```
```
g) Crie 2 objetos do tipo lançamentos:
```
```json
  {
    "id": 1,
    "name": "Pagamento de Salário",
    "description": "Pagamento de salário referente ao mês de janeiro",
    "type": "Despesa",
    "amount": "5000,00",
    "date": "2022-02-24",
    "paid": true,
    "categoriaId": 1
}
```
```json
  {
    "id": 2,
    "name": "Pagamento de Vale Alimentação",
    "description": "Pagamento de VA referente ao mês de janeiro",
    "type": "Despesa",
    "amount": "500,00",
    "date": "2022-02-25",
    "paid": true,
    "categoriaId": 2
}
```
```
h) Liste os lançamentos ordenados por data:
```
```json
[
    {
        "id": 1,
        "name": "Pagamento de Salário",
        "description": "Pagamento de salário referente ao mês de janeiro",
        "type": "Despesa",
        "amount": "5000,00",
        "date": "2022-02-24",
        "paid": true,
        "categoriaId": 1
    },
    {
        "id": 2,
        "name": "Pagamento de Vale Alimentação",
        "description": "Pagamento de VA referente ao mês de janeiro",
        "type": "Despesa",
        "amount": "500,00",
        "date": "2022-02-25",
        "paid": true,
        "categoriaId": 2
    }
]
```
```
i) O que é Swagger?
----------
O Swagger é um framework composto por diversas ferramentas que, independente da linguagem, auxilia a descrição, consumo
e visualização de serviços de uma API REST. 
```
```
j) Implemente o Swagger na sua Spring Rest API;
```
[Implementação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafioTres/financys/pom.xml)<br/>

```
k) Repita as letras e, f  , g e h porém agora em vez de usar o postman, vamos usar o swagger
```
◀️[Voltar para menu de desafios](#-Desafios)
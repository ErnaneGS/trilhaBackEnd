![imagemGit](https://user-images.githubusercontent.com/97994560/155146294-e61f3fe0-ee97-4fdf-acd6-2d4c4349ae6a.png)

Repositório destinado a entrega dos desafios da trilha Back-end

# 💻 trilhaBackEnd
A missão nessa nova jornada é a capacitação nos pontos de vista técnico e profissional, a fim de tornar um desenvolvedor NTT. Visando alcançar um patamar de especialista. Trilhando sempre pelo caminho da ética e transparência.

# 📖 Desafios
- [Desafio 1](#-Desafio-1)
- [Desafio 2](#-Desafio-2)
- [Desafio 3](#-Desafio-3)
- [Desafio 4](#-Desafio-4)

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
É um protocolo de comunicação entre aplicações para a transmissão de documentos hipermídia. O seu funcionamento segue o
modelo cliente servidor para a comunicação entre navegadores web w servidores web. O cliente abre uma conexão, executa
uma requisição e espera até receber uma resposta.

II. O que é REST, e qual é a sua relação com o protocolo HTTP:
----------
O REST é um padrão de arquitetura que define diretrizes para a comunicação (requisição e resposta) dos sistemas 
distributivos. Nas requisições é preciso que o cliente faça a solicitação que consiste em: (um método http, um header
e um patch). Já na resposta que a aplicação REST retorna é enviado um código de status de resposta http definindo o
status da requisição. 

III. O que é Web API, e qual é a sua relação com REST:
----------
API é uma Interface de Programação de Aplicações onde permite que dois softwares diferentes comuniquem-se entre si, 
podendo utilizar o padrão RESTFul que é uma interface que fornece dados em um formato padronizado baseado em requisições
HTTP.
```
```
b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades:
```
| Requisições   | Descrição                                                                                                                                                                |
|---------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET           | O método GET solicita a representação de um recurso específico. Requisições utilizando o método GET devem retornar apenas dados.                                         |
| HEAD          | O método HEAD solicita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.                                                               |
| POST          | O método POST é utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor. |
| PUT           | O método PUT substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.                                                                                                                                                                         |
| DELETE        | O método DELETE remove um recurso específico                                                                                                                                                                         |
| CONNECT       | O método CONNECT estabelece um túnel para o servidor identificado pelo recurso de destino.                                                                                                                                                                         |
| OPTIONS       | O método OPTIONS é usado para descrever as opções de comunicação com o recurso de destino                                                                                                                                                                         |
| TRACE         | O método TRACE executa um teste de chamada loop-back junto com o caminho para o recurso de destino.                                                                                                                                                                         |
| PATCH         | O método PATCH é utilizado para aplicar modificações parciais em um recurso.                                                                                                                                                                         |

```
c) Crie uma classe do tipo controller para a entidade categoria:
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/src/main/java/trilha/back/financys/controller/CategoryController.java)<br/>

```
d) Repita o item c para lançamentos:
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/src/main/java/trilha/back/financys/controller/EntryController.java)<br/>

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
[Implementação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/pom.xml)<br/>

```
k) Repita as letras e, f  , g e h porém agora em vez de usar o postman, vamos usar o swagger
```
◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 4
O objetivo durante o desafio 4 é entender o papel da camada de persistência, a abstração da linguagem dos bancos de
dados criada pelas ferramentas de ORM e a partir desse entendimento ser capaz de comunicar com qualquer tipo de banco
de dados independendo da sua linguagem nativa.  O foco durante o  desafio 4 deve estar em saber implementar
suas próprias classes de repositório.

```
a) Com suas palavras conceitue:
I. O que é JDBC?
----------
Java Database Connectivity é um conjunto de classes e interfaces de instruções SQL que ajudam na interação com um banco
de dados. Por exemplo, quando baixamos os drives do mysql é implementada as interfaces definidas no JDBC para conexão.
     
II. O que é ORM, cite 3 exemplos?
----------
O ORM (mapeamento objeto relacional) é uma ferramenta para o mapeamento de nossos objetos (classes) e seus atributos  
para o modelo entidade relacionamento do banco de dados, aprimorando o paradigma de orientação a objetos ao paradigma de
banco de dados relacional. Exemplos: Hibernate, EclipseLink e ActiveJPA.

III. O que é JPA e qual é a sua relação com os ORM’s?
----------
O JPA (API de Persistência do Java) é um framework para persistir objetos Java, ou seja, uma especificação de como o ORM
deve ser implementado. 
     
IV. O que é Spring Data?
----------
É um conjunto de projetos para manipulação de dados de diversas formas, como por exemplo o projeto Spring Data JPA para
o desenvolvimento de aplicações com a Java Persistence API (JPA).
```
```
b) Instale, configure e teste um banco de dados SQL.
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio04/financys/src/main/resources/application.properties)

```
c) Implemente uma interface repository (nossa camada de persistência) utilizando spring data e as entidades criadas no
desafio anterior.
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio04/financys/src/main/java/trilha/back/financys/repositories)

```
d) O que caracteriza um projeto “CRUD básico”?
----------
Um projeto CRUD é caracterizado pelas quatro operações básicas:
1 - CREATE: Criar um novo registro;
2 - READ: Exibir informações de um registro;
3 - UPDATE: Atualizar informações de um registro;
4 - DELETE: Deleta um registro;
```
```
e) Com base nas classes de controller, use as interfaces desenvolvidas e crie/refatore métodos
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio04/financys/src/main/java/trilha/back/financys/controller)

◀️[Voltar para menu de desafios](#-Desafios)

![imagemGit](https://user-images.githubusercontent.com/97994560/155146294-e61f3fe0-ee97-4fdf-acd6-2d4c4349ae6a.png)

Repositório destinado a entrega dos desafios da trilha Back-end

# 💻 trilhaBackEnd
A missão nessa nova jornada é a capacitação nos pontos de vista técnico e profissional, a fim de tornar um desenvolvedor NTT. Visando alcançar um patamar de especialista. Trilhando sempre pelo caminho da ética e transparência.

# 📖 Desafios
- [Desafio 1](#-Desafio-1)
- [Desafio 2](#-Desafio-2)
- [Desafio 3](#-Desafio-3)
- [Desafio 4](#-Desafio-4)
- [Desafio 5](#-Desafio-5)
- [Desafio 6](#-Desafio-6)
- [Desafio 7](#-Desafio-7)
- [Desafio 8](#-Desafio-8)

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

## 🎯 Desafio 5
O objetivo durante o desafio 5 é conhecer mais uma das camadas de uma aplicação,  sendo  capaz  de  entender  qual  o
papel  de  cada  uma  das  camadas  apresentadas  até  o  momento,  e  por  consequência  saber  replicar  seus  
conceitos  para diferentes tipos de projetos.

```
a)  Defina  com  suas  palavras  qual  é  a  responsabilidade  das  camadas  vistas  até  agora, entity, controller,
repository e service.
----------
- Entity: Classe principal onde possui a lógica da aplicação responsável por determinar as características e comportamentos
dos objetos, responsável também pelo mapeamento de entidades para o banco de dados.
- Controller: Camada intermediária entre a entity e a view (parte do sistema que interage com o usuário), responsável por
intermediar a comunicação do usuário com a aplicação através de requisições e respostas.
- Repository: Interface responsável pelo relacionamento entre a aplicação e o banco de dados com funções para criar, deletar,
atualizar, obter e filtrar objetos do banco de dados.
- Service: Classe responsável pela operação dos serviços de acordo com as regras de negócio definidas em cada um dos métodos
nela declarados.
```
```
b) Com base na informação anterior (Entry):
I. Crie uma classe de serviço para lançamentos;
II. Crie um método dentro na nova classe de serviço para validar categoriapelo ID; Ex: public boolean
validateCategoryById(long idCategory) { }
III. Refatore a controller de lançamentos para utilizaro método validateCategoryById(  );
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/services/EntryService.java)

```
c) Com base na informação anterior (Category):
I. Crie uma classe de serviço para category;
II.  Crie  um  método  dentro na  nova  classe  de  serviço  para  trazer  o  id  da  categoria  passando   o   nome
da   categoria;   Ex:   public   String   idCategoryByName(name   nameCategory) { };
III. Refatore a controller de lançamentos para utilizar o método idCategoryByName( )
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/services/CategoryService.java)

```
d) Com base na informação anterior (Entry):
I. Adicione a anotação “@RestController” na classe da controller;
II.    Refatore    todas    os    retornos    da    controller    adicionando    o    retorno    como    ResponseEntity;
III. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/controller/EntryController.java)

```
e) Com base na informação anterior(Category): 
I. Adicione a anotação “@RestController” na classe da controller;
II. Refatore    todas    os    retornos    da    controller    adicionando    o    retorno    como    ResponseEntity;
III. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/controller/CategoryController.java)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 6
O objetivo durante o desafio 6 é conhecer o funcionamento das classes de DTO e a importância dessa prática que tem
como viés de trazer maior segurança para a nossa aplicação.

```
a) O que significa DTO, e qual sua importância?
----------
Data Transfer Object (DTO)  é um padrão de projeto usado em java para o transporte de dados entre diferentes componentes
de um sistema, atualmente na arquitetura MVC o DTO tem a responsabilidade de separar as camadas model e view, deixando
explicito quais campos da model irão para a camada de view, assim os responses terão apenas informações necessárias para 
atender certa requisição. 
```
```
b) Com base no artigo passado, crie classes de DTO’s para as entidades de lançamento e de categoria
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio06/financys/src/main/java/trilha/back/financys/dtos)

```
c) Com base na informação anterior:
I. Crie uma classe (objeto) DTO chart;
II.  Crie  um  método  dentro  da  classe  de  serviço  de  lançamentos  e  utilize  um  laço  for para realizar o
agrupamento por categoria e retornar uma lista de objetos do tipo DTO;
III. Crie um método dentro da controller de lançamentos para retornar a lista criada no item anterior;
```
```java
 public List<GetEntryChartResponse> chart() {
        List<Category> categories = categoryRepository.findAll();
        List<Entry> entries = entryRepository.findAll();
        List<GetEntryChartResponse> chart = new ArrayList<>();
        for (Category category : categories) {
            Double total = 0.0;
            GetEntryChartResponse getEntryChartResponse = new GetEntryChartResponse();
            getEntryChartResponse.setName(category.getName());
            for (Entry entry : entries) {
                if(entry.getCategoriaId().getId() == category.getId()) {
                    getEntryChartResponse.setType(entry.getType());
                    String str = entry.getAmount().replaceAll(",", ".");
                    Double annount = Double.parseDouble(str);
                    total = total + annount;
                    getEntryChartResponse.setAmount(total);
                }
            }
            chart.add(getEntryChartResponse);
        }
        return chart;
    }
 ```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio06/financys/src/main/java/trilha/back/financys/services/EntryService.java)

```
d)  Implemente uma nova serialização dos dados utilizando Mapper
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio06/financys/src/main/java/trilha/back/financys/mappers)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 7
O objetivo durante o desafio 7 é aprender os conceitos de validação, tratamento e manipulação de dados de forma otimizada.

```
a) Crie uma validação para a entidade de categoria seguindo os seguintes requisitos:
I. name: não pode ser nulo ou vazio, min = 3 e max = 15
II. description: não pode ser nulo ou vazio, min = 15 e max = 50
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/java/trilha/back/financys/dtos/request/CategoryRequest.java)

```
b) Crie uma validação para a entidade de lançamento seguindo os seguintes requisitos:
I. name: não pode ser nulo ou vazio, min = 3 e max = 45
II. description: não pode ser nulo ou vazio, min = 15 e max = 150
III. type: não pode ser nulo ou vazio, min = 3 e max = 10 (nota extra pra quem usar enum)
IV. amount: não pode ser nulo ou vazio, < 0;
V. date: não pode ser nulo ou vazio;
VI. paid: não pode ser nulo ou vazio;
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/java/trilha/back/financys/dtos/request/EntryRequest.java)

```
c) Configure mensagens específicas para cada uma das validações
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/resources/validationMessages.properties)

```
e) No desafio anterior, mais especificamente na letra c é utilizando o comando for para criar o agrupamento das informações
necessárias para criar o gráfico. Existem maneiras mais otimizadas para realizar essas manipulações, experimente refatorar
o item c, agora utilizando o stream( ) no lugar do for e if’s.
```
[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/java/trilha/back/financys/services/EntryService.java)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 8
O objetivo durante o desafio 8 é entender como funcionam as exceptions, e ser capaz de trata-las com o intuito de manter
um bom funcionamento da API.

**a) O que são exceptions?**
```
Exceptions são eventos que ocorrem durante a execução de um programa, fazendo com que a execução da aplicação seja
interrompida e encerrada de forma anormal, uma exceção pode acontecer por vários motivos e devem ser tratadas.
```

**b) Qual é o funcionamento do try, catch e finally?**
```
O Try-Cath-Finally é usado para capturar exceções na execução de programas, no bloco Try é inserido códigos que
são propensos a exceções que caso aconteçam serão tratadas pelos comandos do bloco catch associado a ela. No bloco
fo Finally teremos comandos que sempre serão executados independendo da exceção ser executada ou não, basicamente o 
finally irá forçar a execução dos comandos do seu bloco sem depender de outros resultados.
```

**c) Qual a relação entre “try, catch e finally” e “throws”?**
```
Ambos são usados no tratamento de exceções, porém o throws é usado na assinatura do método para declarar as exceções
que podem ser lançadas naquele método, deixando de modo explícito o erro que pode acontecer no método.
```

**d) Para que serve a annotation @ExceptionHandler?**
```
A @ExceptionHandler é uma anotação do Spring  para manusear exceções em classes de manipuladores específicas e/ou métodos
de manipulador.
```

**e) Para que serve o comando throw?**
```
A instrução throw é usada para lançar uma exceção explicitamente. O lançamento é seguido por uma instância da classe
Exception e é realizado dentro do corpo de um método.
```

**f) Para que serve a annotation @ControllerAdvice?**
```
@ControllerAdvice é uma especialização da anotação que permite lidar com exceções em toda a aplicação em um componente
de manuseio global. Pode ser visto como um interceptador de exceções lançadas por métodos anotados e similares.
```

**g) Crie o seguinte método na classe de serviço do lançamento
Integer calculaMedia(Integer x, Integer y) {     return (x/y);**
```java
    public Integer calculaMedia(Integer x, Integer y) {
        return (x/y);
    }
```

**g) I. Dentro   da   controller   de   lançamentos   crie   um   endopint   com   as   seguintes   características:
calculaMediaPath: /calcula
Method: GET
Pathvariable: variáveis x e y
Response: retorna divisão x/y**
```java
    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
        return ResponseEntity.ok(entryService.calculaMedia(x,y));
    }
```

**g) II. Realize uma chamada passando o valor x=10 e y=5 e verifique o retorno. Agora faça outra chamada passando x=10 e
 y=0;
g) III. O que aconteceu?**

```json
{
  "timestamp": "2022-03-17T19:03:53.486+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "trace": "java.lang.ArithmeticException: / by zero\r\n\tat trilha.back.financys.services.EntryService.calculaMedia(EntryService.java:133)\r\n\..."
  "message": "/ by zero",
  "path": "/entry/calcula/10/0"
}
```

**g) IV. Faça o tratamento dessa exception utilizando try catch e se necessário finally**
```java
    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x/y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Impossível realizar a divisão por zero.");
        }
    }
```

**g) V. Agora faça o tratamento utilizando throw e @ExceptionHandler**
```java
package trilha.back.financys.exceptions.exceptions;
public class CalculaMediaExceptions extends ArithmeticException{
    public CalculaMediaExceptions(String exception) {
        super(exception);
    }
}
```

**g) VI. Aproveitando o método criado com @ExceptionHandler crie sua própria classe para tratamento de exceptions
utilizando @ControllerAdvice**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio08/financys/src/main/java/trilha/back/financys/exceptions/handle/ExceptionHandle.java)


**g) VII. Realize novos testes, verifique o resultado final e escreva sua própria conclusão sobre exceptions:**
```
Podemos concluir que as exceções quando usadas da melhor forma melhoram a legibilidade, confiabilidade e manutenção de
um programa, pois ajuda a detectar e tratar possíveis erros que possam acontecer. O tratamento das exceções, é o 
mecanismo responsável pelo tratamento da ocorrência de condições que alteram o fluxo normal da execução de programas.
```
◀️[Voltar para menu de desafios](#-Desafios)

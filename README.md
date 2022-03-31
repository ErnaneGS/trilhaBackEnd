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
- [Desafio 9](#-Desafio-9)
- [Desafio 10](#-Desafio-10)
- [Desafio 11](#-Desafio-11)

## 🎯 Desafio 1
O objetivo durante o desafio 1 deve ser realizar o entendimento do que é um sistema de controle de versão, quais são suas vantagens na prática e aprender os comandos básicos para entregar os próximos desafios.

**a) Com suas palavras defina o que é um sistema de controle de versões (VCS)?**
> O VCS é um software que tem como finalidade gerenciar e controlar as versões, históricos e documentações durante o desenvolvimento de um sistema.

**b) Cite cinco vantagens em utilizar um VCS?**
> 1 - Controle do histórico: facilidade na análise do histórico de desenvolvimento e no resgaste de versões mais antigas e estáveis. \
> 2 - Trabalho em equipe: um sistema de versionamento permite que diversas pessoas trabalhem sobre o mesmo conjunto de documentos ao mesmo tempo, minimizando o desgaste provocado por problemas com conflitos de edições. \
> 3 - Ramificação de projeto: possibilita a divisão do projeto em várias linhas de desenvolvimento sem que uma interfira na outra. \
> 4 - Segurança: o VCS usa mecanismos de segurança que evitam invasões e permita que somente usuários autorizados acessem os documentos. \
> 5 - Confiança: O uso do repositório remoto ajuda a não perder arquivos por eventos inesperados.

**c) Cite três exemplos de VCS?**
> 1 - Git \
> 2 - SVN \
> 3 - CVS

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 2

**a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares?**
> A programação orientada a objetos é um paradigma que utiliza objetos como elementos principais para a construção
> de uma solução, tendo como pilares: \
> 1 - Abstração. \
> 2 - Encapsulamento. \
> 3 - Herança. \
> 4 - Polimorfismo.

**b) Exemplifique e explique um cenário de abstração:**
> Abstração de características e ações do mundo real para definição de um objeto. No exemplo abstraímos do animal
> cachorro as características: (cor do pelo, raça, tamanho e peso) e as ações: (latir, comer, andar e abanar o rabo).

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

**c) Exemplifique e explique um cenário de encapsulamento:**
> Técnica usada para não expor dados internos de um objeto ao usuário. No exemplo temos o objeto Cliente e não
> queremos expor seus dados pessoais como, nome, cpf e telefone, desse modo definimos os atributos em questão como
> privados e usaremos os métodos setters e getters para acessar os dados.

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

**d) Exemplifique e explique um cenário de herança:**
> A herança permite que uma classe herde atributos e métodos de outra. No exemplo temos as classes Gerente, Secretário e
> Técnico que herdam os atributos e métodos da classe Funcionário.

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

**e) Exemplifique e explique um cenário de polimorfismo:**
> O polimorfismo permite o uso de métodos com implantações distintas em diferentes objetos, desde que mantenha-se a
> mesma assinatura do método da superclasse. No exemplo temos a superclasse abstrata animal que não poderá ser instanciada
> e as subclasses cachorro e peixe, as subclasses herdam o método locomover da classe animal, porém cada uma implementa a
> sua forma específica de locomover em seu método.

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

**f) Cite 5 vantagens da POO:**
> 1 - Facilidade na reutilização do código. \
> 2 - Possibilidade de trabalhar em um nível mais elevado de abstração. \
> 3 - Facilidade de manutenção considerando o conceito de herança. \
> 4 - O conceito de objeto fornece grande independência ao programa. \
> 5 - Processo de desenvolvimento ágil. Várias equipes podem trabalhar no mesmo projeto de
forma independente.

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 3
O objetivo durante o desafio 3 é entender o básico a respeito do protocolo de comunicação  mais  utilizado  da  internet,
e  a  partir  desses  princípios  ser  capaz  de  implementar controllers a fim de se comunicar com uma aplicação de
front-end, um micro serviço ou outros tipos de aplicações.

**a) Com suas palavras defina:**
I. O que é o protocolo de comunicação HTTP e como ele funciona:
```
É um protocolo de comunicação entre aplicações para a transmissão de documentos hipermídia. O seu funcionamento segue o
modelo cliente servidor para a comunicação entre navegadores web w servidores web. O cliente abre uma conexão, executa
uma requisição e espera até receber uma resposta.
```
II. O que é REST, e qual é a sua relação com o protocolo HTTP:
```
O REST é um padrão de arquitetura que define diretrizes para a comunicação (requisição e resposta) dos sistemas 
distributivos. Nas requisições é preciso que o cliente faça a solicitação que consiste em: (um método http, um header
e um patch). Já na resposta que a aplicação REST retorna é enviado um código de status de resposta http definindo o
status da requisição. 
```
III. O que é Web API, e qual é a sua relação com REST:
```
API é uma Interface de Programação de Aplicações onde permite que dois softwares diferentes comuniquem-se entre si, 
podendo utilizar o padrão RESTFul que é uma interface que fornece dados em um formato padronizado baseado em requisições
HTTP.
```
**b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades:**

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

**c) Crie uma classe do tipo controller para a entidade categoria:**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/src/main/java/trilha/back/financys/controller/CategoryController.java)<br/>

**d) Repita o item c para lançamentos:**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/src/main/java/trilha/back/financys/controller/EntryController.java)<br/>

**e) Crie 2 objetos do tipo categoria:**
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

**f) Liste as categorias:**
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

**g) Crie 2 objetos do tipo lançamentos:**
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
**h) Liste os lançamentos ordenados por data:**
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

**i) O que é Swagger?**
```
O Swagger é um framework composto por diversas ferramentas que, independente da linguagem, auxilia a descrição, consumo
e visualização de serviços de uma API REST. 
```

**j) Implemente o Swagger na sua Spring Rest API;**

[Implementação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio03/financys/pom.xml)<br/>

**k) Repita as letras e, f  , g e h porém agora em vez de usar o postman, vamos usar o swagger**

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 4
O objetivo durante o desafio 4 é entender o papel da camada de persistência, a abstração da linguagem dos bancos de
dados criada pelas ferramentas de ORM e a partir desse entendimento ser capaz de comunicar com qualquer tipo de banco
de dados independendo da sua linguagem nativa.  O foco durante o  desafio 4 deve estar em saber implementar
suas próprias classes de repositório.

**a) Com suas palavras conceitue:**
I. O que é JDBC?
```
Java Database Connectivity é um conjunto de classes e interfaces de instruções SQL que ajudam na interação com um banco
de dados. Por exemplo, quando baixamos os drives do mysql é implementada as interfaces definidas no JDBC para conexão.
```
II. O que é ORM, cite 3 exemplos?
```
O ORM (mapeamento objeto relacional) é uma ferramenta para o mapeamento de nossos objetos (classes) e seus atributos  
para o modelo entidade relacionamento do banco de dados, aprimorando o paradigma de orientação a objetos ao paradigma de
banco de dados relacional. Exemplos: Hibernate, EclipseLink e ActiveJPA.
```
III. O que é JPA e qual é a sua relação com os ORM’s?
```
O JPA (API de Persistência do Java) é um framework para persistir objetos Java, ou seja, uma especificação de como o ORM
deve ser implementado. 
```   
IV. O que é Spring Data?
```
É um conjunto de projetos para manipulação de dados de diversas formas, como por exemplo o projeto Spring Data JPA para
o desenvolvimento de aplicações com a Java Persistence API (JPA).
```

**b) Instale, configure e teste um banco de dados SQL.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio04/financys/src/main/resources/application.properties)

**c) Implemente uma interface repository (nossa camada de persistência) utilizando spring data e as entidades criadas no
desafio anterior.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio04/financys/src/main/java/trilha/back/financys/repositories)


**d) O que caracteriza um projeto “CRUD básico”?**
```
Um projeto CRUD é caracterizado pelas quatro operações básicas:
1 - CREATE: Criar um novo registro;
2 - READ: Exibir informações de um registro;
3 - UPDATE: Atualizar informações de um registro;
4 - DELETE: Deleta um registro;
```

**e) Com base nas classes de controller, use as interfaces desenvolvidas e crie/refatore métodos**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio04/financys/src/main/java/trilha/back/financys/controller)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 5
O objetivo durante o desafio 5 é conhecer mais uma das camadas de uma aplicação,  sendo  capaz  de  entender  qual  o
papel  de  cada  uma  das  camadas  apresentadas  até  o  momento,  e  por  consequência  saber  replicar  seus  
conceitos  para diferentes tipos de projetos.

**a)  Defina  com  suas  palavras  qual  é  a  responsabilidade  das  camadas  vistas  até  agora, entity, controller,
repository e service.**
```
- Entity: Classe principal onde possui a lógica da aplicação responsável por determinar as características e comportamentos
dos objetos, responsável também pelo mapeamento de entidades para o banco de dados.
- Controller: Camada intermediária entre a entity e a view (parte do sistema que interage com o usuário), responsável por
intermediar a comunicação do usuário com a aplicação através de requisições e respostas.
- Repository: Interface responsável pelo relacionamento entre a aplicação e o banco de dados com funções para criar, deletar,
atualizar, obter e filtrar objetos do banco de dados.
- Service: Classe responsável pela operação dos serviços de acordo com as regras de negócio definidas em cada um dos métodos
nela declarados.
```

**b) Com base na informação anterior (Entry): \
I. Crie uma classe de serviço para lançamentos; \
II. Crie um método dentro na nova classe de serviço para validar categoriapelo ID; Ex: public boolean
validateCategoryById(long idCategory) { } \
III. Refatore a controller de lançamentos para utilizaro método validateCategoryById(  );**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/services/EntryService.java)

**c) Com base na informação anterior (Category): \
I. Crie uma classe de serviço para category; \
II.  Crie  um  método  dentro na  nova  classe  de  serviço  para  trazer  o  id  da  categoria  passando   o   nome
da   categoria;   Ex:   public   String   idCategoryByName(name   nameCategory) { }; \
III. Refatore a controller de lançamentos para utilizar o método idCategoryByName( )**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/services/CategoryService.java)

**d) Com base na informação anterior (Entry): \
I. Adicione a anotação “@RestController” na classe da controller; \
II.    Refatore    todas    os    retornos    da    controller    adicionando    o    retorno    como    ResponseEntity; \
III. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/controller/EntryController.java)

**e) Com base na informação anterior(Category): \
I. Adicione a anotação “@RestController” na classe da controller; \
II. Refatore    todas    os    retornos    da    controller    adicionando    o    retorno    como    ResponseEntity; \
III. No end-point com o método Post adicione a anotação “@RequestBody” na classe de entrada.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio05/financys/src/main/java/trilha/back/financys/controller/CategoryController.java)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 6
O objetivo durante o desafio 6 é conhecer o funcionamento das classes de DTO e a importância dessa prática que tem
como viés de trazer maior segurança para a nossa aplicação.

**a) O que significa DTO, e qual sua importância?**
```
Data Transfer Object (DTO)  é um padrão de projeto usado em java para o transporte de dados entre diferentes componentes
de um sistema, atualmente na arquitetura MVC o DTO tem a responsabilidade de separar as camadas model e view, deixando
explicito quais campos da model irão para a camada de view, assim os responses terão apenas informações necessárias para 
atender certa requisição. 
```

**b) Com base no artigo passado, crie classes de DTO’s para as entidades de lançamento e de categoria**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio06/financys/src/main/java/trilha/back/financys/dtos)

**c) Com base na informação anterior: \
I. Crie uma classe (objeto) DTO chart; \
II.  Crie  um  método  dentro  da  classe  de  serviço  de  lançamentos  e  utilize  um  laço  for para realizar o
agrupamento por categoria e retornar uma lista de objetos do tipo DTO; \
III. Crie um método dentro da controller de lançamentos para retornar a lista criada no item anterior**
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

**d)  Implemente uma nova serialização dos dados utilizando Mapper**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/desafio06/financys/src/main/java/trilha/back/financys/mappers)

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 7
O objetivo durante o desafio 7 é aprender os conceitos de validação, tratamento e manipulação de dados de forma otimizada.

**a) Crie uma validação para a entidade de categoria seguindo os seguintes requisitos: \
I. name: não pode ser nulo ou vazio, min = 3 e max = 15 \
II. description: não pode ser nulo ou vazio, min = 15 e max = 50**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/java/trilha/back/financys/dtos/request/CategoryRequest.java)

**b) Crie uma validação para a entidade de lançamento seguindo os seguintes requisitos: \
I. name: não pode ser nulo ou vazio, min = 3 e max = 45 \
II. description: não pode ser nulo ou vazio, min = 15 e max = 150 \
III. type: não pode ser nulo ou vazio, min = 3 e max = 10 (nota extra pra quem usar enum) \
IV. amount: não pode ser nulo ou vazio, < 0; \
V. date: não pode ser nulo ou vazio; \
VI. paid: não pode ser nulo ou vazio;**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/java/trilha/back/financys/dtos/request/EntryRequest.java)


**c) Configure mensagens específicas para cada uma das validações**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/blob/desafio07/financys/src/main/resources/validationMessages.properties)


**e) No desafio anterior, mais especificamente na letra c é utilizando o comando for para criar o agrupamento das informações
necessárias para criar o gráfico. Existem maneiras mais otimizadas para realizar essas manipulações, experimente refatorar
o item c, agora utilizando o stream( ) no lugar do for e if’s.**

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
que podem ser lançadas naquele método, deixando de modo explícito o erro que pode acontecer no método. Desse modo as
poderão ser tratadas nos demais momentos em que o método comn a assinatura for chamado.
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

**g) I. Dentro   da   controller   de   lançamentos   crie   um   endopint   com   as   seguintes   características: \
calculaMediaPath: /calcula \
Method: GET \
Pathvariable: variáveis x e y \
Response: retorna divisão x/y**
```java
    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
        return ResponseEntity.ok(entryService.calculaMedia(x,y));
    }
```

**g) II. Realize uma chamada passando o valor x=10 e y=5 e verifique o retorno. Agora faça outra chamada passando x=10 e
y=0; \
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

## 🎯 Desafio 9
Seu objetivo durante o desafio 9 é conhecer os principais modelos de design patterns, arquiteturas de software e alguns
princípios de qualidade de software, com o intuito de  conhecer  fórmulas  já  validadas  de  construção  de  projetos  
que  visam  solucionar  vários     tipos     de     problemas     de     gestão/organização     do     código/arquivos,
reaproveitamento de código, limitações no desenvolvimento futuro, difícil manutenção, entre outros problemas já
identificados pela comunidade e pelos criadores desses padrões e arquiteturas.

**a) O que é um padrão de projeto e por que nós os utilizamos?**

>Padrões de projeto (design patterns) são soluções típicas para problemas comuns em projeto de software. Cada padrão é
>como uma planta de construção onde podemos customizar para resolver problemas de projetos. Usamos o padrão de projeto
>pois ele nos ajuda a adotar, no sistema, uma solução de projeto já testada e validada.

**b) Cite e explique com suas palavras:**
<br/>
I. Um dos padrões de criação:
> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização
> de código já existente.
>
> SINGLETON (Carta única) -- O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha
> apenas uma instância, enquanto provê um ponto de acesso global para essa instância. O padrão Singleton resolve dois
> problemas:
>
> 1 - Garantir que uma classe tenha apenas uma única instância para controlar o acesso a algum recurso compartilhado—por
> exemplo, uma base de dados ou um arquivo.
>
> 2 - Fornece um ponto de acesso global para aquela instância permitindo o acesse de qualquer lugar no programa. Contudo,
> ele também protege aquela instância de ser sobrescrita por outro código.
>
> Como solução todas as implementações do Singleton tem esses dois passos em comum:
>
> 1 - Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.
>
> 2 - Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo
> dos panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o
> objeto em cache.
>

> Neste exemplo, a classe de conexão com a base de dados age como um Singleton. Essa classe não tem um construtor público,
> então a única maneira de obter seu objeto é chamando o método getInstance. Esse método coloca o primeiro objeto criado
> em cache e o retorna em todas as chamadas subsequentes.

```java
// A classe Database define o método `getInstance` que permite
// clientes acessar a mesma instância de uma conexão a base de
// dados através do programa.
class Database is
    // O campo para armazenar a instância singleton deve ser
    // declarado como estático.
    private static field instance: Database

    // O construtor do singleton devem sempre ser privado para
    // prevenir chamadas diretas de construção com o operador
    // `new`.
    private constructor Database() is
        // Algum código de inicialização, tal como uma conexão
        // com um servidor de base de dados.
        // ...

    // O método estático que controla acesso à instância do
    // singleton
    public static method getInstance() is
        if (Database.instance == null) then
            acquireThreadLock() and then
                // Certifique que a instância ainda não foi
                // inicializada por outra thread enquanto está
                // estiver esperando pela liberação do `lock`.
                if (Database.instance == null) then
                    Database.instance = new Database()
        return Database.instance

    // Finalmente, qualquer singleton deve definir alguma lógica
    // de negócio que deve ser executada em sua instância.
    public method query(sql) is
        // Por exemplo, todas as solicitações à base de dados de
        // uma aplicação passam por esse método. Portanto, você
        // pode colocar a lógica de throttling ou cache aqui.
        // ...

class Application is
    method main() is
        Database foo = Database.getInstance()
        foo.query("SELECT ...")
        // ...
        Database bar = Database.getInstance()
        bar.query("SELECT ...")
        // A variável `bar` vai conter o mesmo objeto que a
        // variável `foo`.

```
II. Um dos padrões estruturais:
>Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas
>flexíveis e eficientes.
>
> PROXY é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro
> objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar
> ao objeto original. Por exemplo, quando temos um objeto muito grande que consome muitos recursos do sistema. e precisamos
> dele de tempos em tempos, mas não sempre. Desse modo, O padrão Proxy sugere a criação de uma nova classe proxy com a
> mesma interface do objeto do serviço original, assim se for preciso executar alguma coisa tanto antes como depois da
> lógica primária da classe original, o proxy permite que isso seja feito sem mudar aquela classe
>

```java
// A interface de um serviço remoto.
interface ThirdPartyYouTubeLib is
method listVideos()
method getVideoInfo(id)
method downloadVideo(id)

// A implementação concreta de um serviço conector. Métodos
// dessa classe podem pedir informações do YouTube. A velocidade
// do pedido depende da conexão do usuário com a internet, bem
// como do YouTube. A aplicação irá ficar lenta se muitos
// pedidos forem feitos ao mesmo tempo, mesmo que todos peçam a
// mesma informação.
class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib is
method listVideos() is
// Envia um pedido API para o YouTube.

    method getVideoInfo(id) is
        // Obtém metadados sobre algum vídeo.

    method downloadVideo(id) is
        // Baixa um arquivo de vídeo do YouTube.

// Para salvar largura de banda, nós podemos colocar os
// resultados do pedido em cache e mantê-los por determinado
// tempo. Mas pode ser impossível colocar tal código diretamente
// na classe de serviço. Por exemplo, ele pode ter sido
// fornecido como parte de uma biblioteca de terceiros e/ou
// definida como `final`. É por isso que nós colocamos o código
// do cache em uma nova classe proxy que implementa a mesma
// interface que a classe de serviço. Ela delega ao objeto do
// serviço somente quando os pedidos reais foram enviados.
class CachedYouTubeClass implements ThirdPartyYouTubeLib is
private field service: ThirdPartyYouTubeLib
private field listCache, videoCache
field needReset

    constructor CachedYouTubeClass(service: ThirdPartyYouTubeLib) is
        this.service = service

    method listVideos() is
        if (listCache == null || needReset)
            listCache = service.listVideos()
        return listCache

    method getVideoInfo(id) is
        if (videoCache == null || needReset)
            videoCache = service.getVideoInfo(id)
        return videoCache

    method downloadVideo(id) is
        if (!downloadExists(id) || needReset)
            service.downloadVideo(id)

// A classe GUI, que é usada para trabalhar diretamente com um
// objeto de serviço, permanece imutável desde que trabalhe com
// o objeto de serviço através de uma interface. Nós podemos
// passar um objeto proxy com segurança ao invés de um objeto
// real de serviço uma vez que ambos implementam a mesma
// interface.
class YouTubeManager is
protected field service: ThirdPartyYouTubeLib

    constructor YouTubeManager(service: ThirdPartyYouTubeLib) is
        this.service = service

    method renderVideoPage(id) is
        info = service.getVideoInfo(id)
        // Renderiza a página do vídeo.

    method renderListPanel() is
        list = service.listVideos()
        // Renderiza a lista de miniaturas do vídeo.

    method reactOnUserInput() is
        renderVideoPage()
        renderListPanel()

// A aplicação pode configurar proxies de forma fácil e rápida.
class Application is
method init() is
aYouTubeService = new ThirdPartyYouTubeClass()
aYouTubeProxy = new CachedYouTubeClass(aYouTubeService)
manager = new YouTubeManager(aYouTubeProxy)
manager.reactOnUserInput()
```

III. Um dos padrões comportamentais:
>Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.
>
>OBSERVER O Observer é um padrão de projeto comportamental que permite a definição de um mecanismo de assinatura para
> notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.
> Imagine que temos dois tipos de objetos: um Cliente e uma Loja. O cliente está muito interessado em uma marca particular
> de um produto (digamos que seja um novo modelo de iPhone) que logo deverá estar disponível na loja. O cliente pode
> visitar a loja todos os dias e checar a disponibilidade do produto. Mas enquanto o produto ainda está a caminho, a
> maioria dessas visitas serão em vão. Em uma outra solução a loja poderia encaminhar um e-mail sempre que novos produtos
> chegarem a loja. Usando essa analogia o observer iria permitir que os clientes (objetos) pudessem assinar ou não uma
> corrente de eventos que viesse da loja (classe). Na implementação isso aconteceria através de um mecanismos de assinatura
> aplicado a classe.

```java
// A classe publicadora base inclui o código de gerenciamento de
// inscrições e os métodos de notificação.
class EventManager is
private field listeners: hash map of event types and listeners

    method subscribe(eventType, listener) is
        listeners.add(eventType, listener)

    method unsubscribe(eventType, listener) is
        listeners.remove(eventType, listener)

    method notify(eventType, data) is
        foreach (listener in listeners.of(eventType)) do
            listener.update(data)

// O publicador concreto contém a verdadeira lógica de negócio
// que é de interesse para alguns assinantes. Nós podemos
// derivar essa classe a partir do publicador base, mas isso nem
// sempre é possível na vida real devido a possibilidade do
// publicador concreto já ser uma subclasse. Neste caso, você
// pode remendar a lógica de inscrição com a composição, como
// fizemos aqui.
class Editor is
public field events: EventManager
private field file: File

    constructor Editor() is
        events = new EventManager()

    // Métodos da lógica de negócio podem notificar assinantes
    // acerca de mudanças.
    method openFile(path) is
        this.file = new File(path)
        events.notify("open", file.name)

    method saveFile() is
        file.write()
        events.notify("save", file.name)

    // ...


// Aqui é a interface do assinante. Se sua linguagem de
// programação suporta tipos funcionais, você pode substituir
// toda a hierarquia do assinante por um conjunto de funções.
interface EventListener is
method update(filename)

// Assinantes concretos reagem a atualizações emitidas pelo
// publicador a qual elas estão conectadas.
class LoggingListener implements EventListener is
private field log: File
private field message: string

    constructor LoggingListener(log_filename, message) is
        this.log = new File(log_filename)
        this.message = message

    method update(filename) is
        log.write(replace('%s',filename,message))

class EmailAlertsListener implements EventListener is
private field email: string
private field message: string

    constructor EmailAlertsListener(email, message) is
        this.email = email
        this.message = message

    method update(filename) is
        system.email(email, replace('%s',filename,message))


// Uma aplicação pode configurar publicadores e assinantes
// durante o tempo de execução.
class Application is
method config() is
editor = new Editor()

        logger = new LoggingListener(
            "/path/to/log.txt",
            "Someone has opened the file: %s")
        editor.events.subscribe("open", logger)

        emailAlerts = new EmailAlertsListener(
            "admin@example.com",
            "Someone has changed the file: %s")
        editor.events.subscribe("save", emailAlerts)
```

**c) Explique o conceito de arquitetura de software e seu proposito:**
>A arquitetura de software  consiste na definição de um conjunto de princípios, técnicas e normas usadas para a construção
> de software. O termo também se refere à documentação da arquitetura de software do sistema. Essa documentação facilita:
> a comunicação entre os stakeholders, registra as decisões iniciais acerca do projeto de alto-nível, e permite o reuso
> do projeto dos componentes e padrões entre projetos.

**d) I. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta.**
>Estávamos seguindo a Arquitetura em Camadas, pois a nossa aplicação foi divida em camadas formadas por um conjunto
>de classes com um determinado propósito. Nesse projeto a camada do Controller gerencia as requisições e respostas do
>fluxo, a Service é responsável pela regra de negócio, Repository responsável pelas operações com o banco de dados e a
>Domains representando os domínios e entidades de relacionamento com o banco de dados.

**e) Crie uma nova branch a partir da atual: trilha-back-seunome-DDD. Em seguida refatore o projeto da nova branch para
o padrão de arquitetura DDD.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/trilha-back-ernane-DDD/financys/src/main/java/trilha/back/financys)

**f) Crie uma nova branch a partir da atual: trilha-back-seunome-clean. Em seguida refatore o projeto da nova branch para
o padrão de arquitetura hexagonal.**

[Codificação disponível neste link](https://github.com/ErnaneGS/trilhaBackEnd/tree/trilha-back-ernane-clean/financys/src/main/java/trilha/back/financys)

**g) O que significa a sigla SOLID?**
> SOLID são cinco princípios da programação orientada a objetos que facilitam no desenvolvimento de softwares, tornando-os
> fáceis de manter e estender. Esses princípios podem ser aplicados a qualquer linguagem de POO.
>
> **S - Single Responsiblity Principle:** Classes entidades ou funções devem ter uma única responsabilidade, facilitando o
> reaproveitamento de códigos, a refatoração, a aplicação de testes automatizados e possibilita a geração de menos bugs na
> aplicação.
>
> **O - Open-Closed Principle:** Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação,
> ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o
> código fonte original.
>
> **L - Liskov Substitution Principle:** Se tivermos uma classe e dela criarmos uma subclasse através da herança, o objeto
> da classe herdeira deve conseguir substituir o objeto da classe original, sem que seja necessário alterar propriedades
> do programa.
>
> **I - Interface Segregation Principle:** Clientes não devem ser forçados a dependerem de métodos que eles não utilizam.
> ou seja, uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
>
> **D -  Dependency Inversion Principle:** Princípio da Inversão de Dependência, um módulo não deve depender diretamente
> de detalhes de implementação de outros módulos, mais sim de abstrações.
>
**h) Quais princípios foram utilizados no projeto até o momento? Explique.**
>Neste projeto ate o momento foram utilizados os princípios do Single Responsiblity Principle, uma vez que a maioria
> das classes e métodos do projeto possuem responsabilidades únicas. Interface Segregation Principle pois as classes não
> foram obrigadas a implementar interfaces e métodos que não irão utilizar e a Dependency Inversion Principle sendo que
> as classes foram construídas de forma independente sem depender totalmente da implementação de outros métodos.

**Referências** \
https://refactoring.guru/pt-br \
https://www.youtube.com/channel/UCFuIUoyHB12qpYa8Jpxoxow \
https://www.youtube.com/c/FilipeDeschamps \

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 10
O objetivo durante o desafio 10 é aprofundar no universo Spring, conhecendo um pouco mais de perto seu repertório e
funcionalidades. O foco está em saber montar um ambiente  Spring,  sabendo  criar  uma  nova  aplicação,  realizar  as  
configurações necessárias,  aproveitar  as  facilidades  que  a  ferramenta  te  trás.  Com  o  intuito  de acelerar o
desenvolvimento e otimizar a performance da aplicação

**a) O que você entende por Spring Framework?**
> Entendo que o Spring Framework é uma estrutura de aplicação que usamos para desenvolver em java de forma mais fácil
> e rápida. O Spring explora conceitos de Inversão de Controle e Injeção de Dependências, dessa forma, ao adotá-lo, temos
> à nossa disposição uma tecnologia que nos fornece não apenas recursos necessários à grande parte das aplicações, como
> módulos para persistência de dados, integração, segurança, testes, desenvolvimento web,  legibilidade de código maior,
> implementações com menos código, facilidade na manutenção do código e entrega mais rápida.

**b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades**
> **Spring Data:** projeto com o objetivo de tornar mais fácil a integração de aplicações Spring a novos modelos de bancos
> de dados. 
> **Spring Security:** é uma estrutura que se concentra em fornecer autenticação e autorização para aplicações Java. Como
> todos os projetos da Spring, o verdadeiro poder da Segurança da Spring é encontrado na facilidade com que ele pode ser
> estendido para atender aos requisitos personalizados. 
> **Spring Cloud:** estrutura que fornece ferramentas para que os desenvolvedores construam rapidamente alguns dos padrões
> comuns em sistemas distribuídos (por exemplo, gerenciamento de configuração, detecção de serviços, disjuntores, roteamento
> inteligente, microproxy, barramento de controle, tokens únicos, fechaduras globais, eleição de liderança, sessões 
> distribuídas, estado de cluster).

**c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?**
> Spring-boot-starter-web \
> Springdoc-openapi-ui \
> Spring-boot-starter-data-jpa \
> Spring-boot-starter-validation

**d) Cite 5 vantagens em utilizar Spring**
> **I. Uso de POJO** O Spring Framework ajuda os desenvolvedores a desenvolver aplicativos corporativos. Ele usa POJO's, 
> que é uma abreviação para Plain Old Java Object. Usar o POJO para desenvolver um aplicativo é que você não precisa de
> um contêiner corporativo como um servidor de aplicativos. Além disso, ele ajuda você a se livrar do Convencional 
> Enterprise Java Beans (EJB) permitindo que você possa usar um recipiente robusto de servlet como o Tomcat. Isso faz d
> o Spring Framework uma estrutura leve. 
> 
> **II. Uso da Modularidade** O Spring Framework fornece modularidade aos desenvolvedores. Ele os ajuda a escolher quais
> pacotes ou classes podem ser usados ou ignorados. Com toneladas de classes e pacotes, ele vem como um benefício para os
> desenvolvedores identificar e escolher os pacotes ou classes sem qualquer problema. 
> 
> **III. Não precisa reinventar** Um dos principais benefícios do Spring Framework para o desenvolvimento de aplicativos
> corporativos é que você pode aproveitar a partir do Spring, pois ele usa tecnologias como temporizadores JDK, frameworks
> ORM, Java EE etc. Para que os desenvolvedores não precisem aprender todas essas tecnologias ou frameworks para desenvolver
> aplicativos. 
> 
> **IV. Facilidade de testabilidade** Uma característica da injeção de Dependência de Mola ajuda na engrenagem da testabilidade.
> Simplifica a injeção de dados de teste com o uso de JavaBean POJO. 
> 
> **V. Otimização e produtividade** Com o Spring temos o benefício de otimizar nosso tempo e aumentar a produtividade, ou
> seja, não temos que gastar tempo desenvolvendo uma aplicação do zero, recebemos do Spring a maioria dos recursos necessário.

**e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server**
> 1 - Geração da base para o projeto através do: [Spring Initializr](Spring Initializr), neste momento iremos escolher e
> a linguagem do nosso projeto, além de adicionarmos as dependências que iremos querer adicionar no projeto base. \
> 
> 2 - Nesse caso, como iremos utilizar uma conexão com o SQL server, ainda na página [Spring Initializr](Spring Initializr),
> deveremos adicionar a dependência: Spring Web, Spring Boot DevTools, Spring Data JPA, Spring MS SQL Server Driver. 
> 
> 3 - Após iremos gerar o projeto base e iniciar ele usando uma IDE. 
> 
> 4 - Agora iremos especificar as propriedades do banco de dados no arquivo application.properties. 
> 
> 5 - Seguindo a arquitetura do seu projeto será necessário implementação do seu domínio e realizar o mapeamento de suas
> entidades com as anotações do banco de dados além de definir os respositórios necessários, para que posteriormente seja
> possível realizar a comunicação com as demais camadas necessárias da aplicação.

**f) Qual a funcionalidade do pom.xml?**
> POM é um acrônimo para Project Object Model. O arquivo pom.xml contém informações de projeto e configuração para o maven
> construir o projeto, como dependências, diretório de construção, diretório de origem, diretório de origem de teste,
> plugin, metas etc. Maven lê o arquivo .xml pom, e executa o objetivo.

**g) Qual a funcionalidades do applications.properties?**
> É um arquivo chave valor usado para definir propriedades de configuração, como por exemplo as propriedades de configuração 
> de banco de dados, testes, web, segurança, etc.

**h) Qual o propósito das Annotations?**
> As Anotações são uma forma de metadados que fornece dados sobre um programa. Em outras palavras, as anotações são usadas
> para fornecer informações suplementares sobre um programa. Não faz parte da aplicação que desenvolvemos. Não tem um 
> efeito direto sobre o funcionamento do código que eles anotam. Isso não muda a ação do programa compilado.

**i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização**
> 01 - @Component Anotação genérica para qualquer componente gerenciado pelo Spring. Esta anotação faz com que o bean
> registrado no Spring possa ser utilizado em qualquer bean, seja ele um serviço, um DAO, um controller, etc. No exemplo,
> ele será responsável por um Bean que representa uma entidade.
```java
import org.springframework.stereotype.Component;

@Component
public class Category {

    private Long id;
    private String name;
    private String description;
```

> 02 - @Repository Anotação que serve para definir uma classe como pertencente à camada de persistência.
```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
CategoryEntity findByName(String name);
}
```

> 03 - @Service Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
```java
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;
```

> 04 - @Autowired A anotação @Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode
> ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
```java
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;
```

> 05 - @RequestBody é usado na lista de parâmetros do método de solicitação de processamento. Ele pode vincular os parâmetros
> no corpo da solicitação a um objeto. Os parâmetros do corpo da solicitação são passados ​​por HttpMessageConverter
> e os nomes dos parâmetros no corpo da solicitação são combinados com os nomes das propriedades do objeto e vincular o valor.
```java
@PostMapping
public ResponseEntity<CategoryResponse> create(@RequestBody @Valid CategoryRequest categoryRequest) {
Category category = categoryMapper.categoryRequestToCategory(categoryRequest);
category = categoryService.create(category);
CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
return ResponseEntity.created(URI.create("/category" + categoryResponse.getId())).body(categoryResponse);
}
```

> 06 - @GetMapping A anotação @GetMapping é usada para processar solicitações HTTP GET e mapear solicitações para métodos de
> processamento específicos.
```java
 @GetMapping
    public ResponseEntity<List<CategoryResponse>> read() {
        List<Category> categories = categoryService.read();
        List<CategoryResponse> categoriesResponse = categories
                .stream()
                .map(categoryMapper::categoryToCategoryResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(categoriesResponse);
    }
```
> 07 - @ControllerAdvice é uma extensão da anotação @Component, e o Spring irá varrer e detectar automaticamente as classes
> marcadas com @ControllerAdvice. @ControllerAdvice precisa ser usado com as anotações @ExceptionHandler, @InitBinder
> e @ModelAttribute, principalmente para lidar com informações de exceção lançadas pelo controlador.
```java
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(CalculaMediaExceptions.class)
    public ResponseEntity<DefaultException> handle(CalculaMediaExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Impossível realizar a divisão por zero");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }
```

> 08 - @ExceptionHandler A anotação @ExceptionHander é usada para anotar métodos que tratam exceções lançadas por um tipo 
> específico de classe de exceção. Quando um método em um controlador lança uma exceção, o Spring automaticamente captura
> a exceção e passa as informações da exceção capturada para o método anotado com @ExceptionHandler.
```java
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(CalculaMediaExceptions.class)
    public ResponseEntity<DefaultException> handle(CalculaMediaExceptions e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem("Impossível realizar a divisão por zero");
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<DefaultException> handle(NoSuchElementException e ) {
        DefaultException defaultException = new DefaultException();
        defaultException.setMensagem(e.getLocalizedMessage());
        defaultException.setStatus(HttpStatus.NOT_FOUND.value());
        defaultException.setDataHoraAtual(LocalDateTime.now());
        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }
```

> 09 - @RestController foi introduzido no Spring 4.0 e é uma anotação de controlador específica. Esta anotação é equivalente
> a um atalho para @Controller e @ResponseBody. Ao usar esta anotação, não há necessidade de usar a anotação @ResponseBody
> no método.
```java
@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;
```

> 10 - @SpringBootApplication A anotação @SpringBootApplication é uma anotação de configuração rápida. Na classe marcada por
> ela, você pode definir um ou mais beans, e acionar automaticamente a configuração automática de beans e varredura 
> automática de componentes. Essa anotação é equivalente à combinação de @Configuration, @EnableAutoConfiguration e 
> @ComponentScan. Na classe principal do aplicativo Spring Boot, essa anotação é usada.
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);

	}
}
```

**j) O que é um advice em Spring? Quais os tipos de advice para o Spring?**
> Ação executada pelo aspecto em um join point particular. O principal objetivo dos aspectos é apoiar preocupações 
> transversais, como registro, perfil, cache e gerenciamento de transações.
>Tipos de advice: \
> Before: executa antes do join point, mas não tem o poder de evitar que o join point execute; \
> After returning: executa após o join point apenas se este terminar de forma bem sucedida; \
> After throwing: executa após o join point quando ele finaliza enviando uma exceção; \
> After (finally): executa após o join point independentemente de sua forma de retorno; \
> Around: envolve a execução de um join point. Este é o tipo mais poderoso de advice, pois pode realizar ações antes e
> após a execução do join point. Também é de sua responsabilidade decidir se o join point deve ou não ser chamado.

**k) O que é Spring IoC Container?**
> O Spring IoC é responsável por instanciar, configurar e montar os objetos. O contêiner IoC obtém informações do 
> arquivo XML e funciona de acordo. As principais tarefas executadas pelo contêiner IoC são: \
> Para instanciar a classe de aplicação; \
> Para configurar o objeto; \
> Para montar as dependências entre os objetos.

**l) Como adicionamos segurança à nossa aplicação Spring?**
> Utilizamos o Spring Security que é uma estrutura de autenticação e controle de acesso poderosa e altamente personalizável.
> É o padrão de fato para garantir aplicações baseadas no Spring. O Spring Security é uma estrutura que se concentra em
> fornecer autenticação e autorização para aplicações Java. Como todos os projetos do Spring, o verdadeiro poder da Segurança
> do Spring é encontrado na facilidade com que ele pode ser estendido para atender aos requisitos personalizados. Como a
> maioria dos projetos de código aberto, a Spring Security implanta suas dependências como artefatos Maven. \
> Características: \
> Suporte abrangente e extensível para autenticação e autorização. \
> Proteção contra ataques como fixação de sessão, clickjacking, falsificação de solicitações de site cruzado, etc. \
> Integração de API servlet. \
> Integração opcional com O MVC da Web de Spring. 

**m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?**
> Spring Data que torna mais fácil a integração de aplicações Spring a novos modelos de bancos de dados.

**n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade**
> Podemos  criar um agendamento de execução de métodos Spring usando a anotação de @Scheduled.
> As regras simples que precisamos seguir para anotar um método com @Scheduled são: o método deve normalmente ter um tipo
> de retorno vazio (se não, o valor devolvido será ignorado) e o método não deve esperar quaisquer parâmetros. \
> Podemos exemplificar configurando uma tarefa para executar após um atraso fixo: Neste caso, a duração entre o final da
> última execução e o início da próxima execução é fixada. A tarefa sempre espera até que a anterior esteja concluída. 
> Esta opção deve ser usada quando for obrigatório que a execução anterior seja concluída antes de ser novamente executado.
```java
@Configuration
@EnableScheduling
public class SpringConfig {
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }
}
```
**Referências** \
https://spring.io/ \
https://www.baeldung.com/ \
https://br.bitdegree.org/tutoriais/spring-mvc/
https://www.javatpoint.com/ioc-container

◀️[Voltar para menu de desafios](#-Desafios)

## 🎯 Desafio 11
O objetivo durante o desafio 11 é entender para o que servem as libs,  e  como  funciona o gerenciamento de dependências
de um projeto.

**a) O que são libs quando se trata de código?**
> É uma coleção de subprogramas com recursos utilizados para o desenvolvimento de software, estes recursos podem conter
> dados de configurações, documentações, códigos pré escritos, rotinas, classes, valores e especificações de tipo. As
> libs tem como função facilitar o desenvolvimento garantindo mais agilidade e menos erros.

**b) Cite 2 libs populares no Java e seu objetivo**
> **1 - Apache Commons:** compreende 43 bibliotecas modulares que abrangem domínios como Coleções, Matemática, Classes, Banco
> de Dados, Cache, Utilitários de E / S.
> **2 - Jackson:** é um conjunto de bibliotecas de processamento de dados para Java. Jackson JSON é a biblioteca de gerador
> / analisador JSON de streaming de fato. Ele também suporta formatos de dados adicionais como Avro, BSON, CBOR, CSV, Smile,
> Protobuf, XML ou YAML e tipos de dados como Guava, Joda, PCollections e muitos mais.

**c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml?**
> O Maven é uma ferramenta utilizada para gerenciar projetos em Java e simplificar a vida do programador, auxiliando no 
> ciclo de desenvolvimento incluindo compilação, controle de bibliotecas, distribuição e relatórios estatísticos. tendo como
> priniipais objetivos: \
> 1 - Simplificar a criação e distribuição de projetos: Criação automática da estrutura do projeto através do archetype, e
> empacotamento da aplicação através do comando - mvn package; \
> 2 - Promover melhores práticas como a definição de um layout padrão para diretórios. \
> Todos os detalhes de configuração usados pelo Maven estão contidos no arquivo pom.xml, podemos citar como exemplo as 
> configurações de: diretório de compilação, diretório de origem, dependências, diretório de origem de teste, plugin, 
> metas etc.

**d) Qual é a diferença do Maven para o Grandle?**
> A principal diferença entre Maven e Gradle é que o O Maven é uma ferramenta de gerenciamento e compreensão de projetos
> de software que gerencia projetos, relatórios e documentos, enquanto o Gradle é uma ferramenta de automação de desenvolvimento
> de código aberto com foco em flexibilidade e desempenho.

**e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers
de comunicação com os bancos de dados.** \
I - Qual a relação entre os termos lib, driver e JDBC?
> JDBC é um conjunto de classes e interfaces (API) escritas em Java que fazem o envio de instruções SQL para qualquer 
> banco de dados relacional através de um DRIUER específico daquele bd. As LIBS são as configurações do banco de dados
> que serão carregadas projeto.

II - Como é adicionado uma lib no projeto?
> Em um projeto MAVEN a lib pode ser adicionada da seguinte forma: \
>  1 - Através do repositório https://mvnrepository.com/ iremos buscar a biblioteca que desejamos adicionar no projeto; \
>  2 - Iremos copiar a dependência dessa biblioteca e adicionar no arquivo pom.xml; \
>  3 - No último passo devemos carregar o nosso projeto maven com as alterações através da opção: Load Maven Changes.

II - Escolha  um  banco  de  dados  (menos  o  H2)  e  explique  como  utilizar  o  driver  de  comunicação.
> Banco de dados escolhido: MySQL \
> Passo a passo para utilizar o driver de comunicação: \
> 1 - Adicionar a dependência do Spring Data JPA no pom.xml
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
> 2 - Adicionar mysql no pom.xml
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>
```
> 3 - Configurar as propriedades do MySQL no projeto através do arquivo application.properties, passando o usuário e senha
> de conexão e a url com o driver.
```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_trilha_back_end?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=95182764
```
> 4 - Em seu projeto declare os seus repositórios e realize o mapeamento de suas  entidades com as anotações do banco de
> dados, para que posteriormente seja possível realizar a comunicação com as demais camadas necessárias da aplicação.

**Referências** \
https://ichi.pro/pt/as-10-principais-bibliotecas-que-todo-desenvolvedor-java-deve-conhecer-61422653275988 \
https://www.devmedia.com.br/gerenciando-projetos-com-maven/10823 \
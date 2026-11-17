# Cálculo de Área e Perímetro de um Triângulo — Programação Orientada a Objetos

## 1. Sobre o projeto

Este projeto apresenta uma implementação em Java para calcular a área e o perímetro de um triângulo, utilizando conceitos do **paradigma de programação orientada a objetos (POO)**.

O programa solicita ao usuário os três lados de um triângulo, armazena essas informações em um objeto da classe `Triangulo`, verifica se os valores atendem às condições de existência de um triângulo e, caso sejam válidos, calcula sua área e seu perímetro.

Diferentemente de uma implementação estruturada, na qual as operações são organizadas principalmente por meio de métodos independentes, nesta abordagem os dados e os comportamentos relacionados ao triângulo são agrupados em uma classe.

O objetivo é demonstrar como a programação orientada a objetos permite representar entidades por meio de classes e objetos, aplicando conceitos como encapsulamento, atributos, métodos e construtores.

## 2. Paradigma de programação orientada a objetos

A programação orientada a objetos é um paradigma que organiza o desenvolvimento de sistemas a partir de objetos que representam entidades do mundo real ou conceitos de um domínio.

Um objeto reúne dados, representados por atributos, e comportamentos, representados por métodos.

Entre seus principais conceitos estão:

- **Classe:** estrutura que define os atributos e os métodos que os objetos poderão possuir.
- **Objeto:** instância de uma classe, que possui seus próprios valores para os atributos.
- **Atributos:** variáveis que armazenam as características ou os dados de um objeto.
- **Métodos:** operações que definem os comportamentos de um objeto.
- **Construtor:** método especial utilizado para inicializar um objeto durante sua criação.
- **Encapsulamento:** princípio que controla o acesso aos atributos e métodos de um objeto.
- **Getters e Setters:** métodos utilizados para consultar e modificar os valores dos atributos.

A programação orientada a objetos também apresenta quatro pilares fundamentais:

1. **Abstração:** representação das características e dos comportamentos essenciais de uma entidade.
2. **Encapsulamento:** proteção dos dados e controle de acesso aos atributos de um objeto.
3. **Herança:** possibilidade de uma classe aproveitar características e comportamentos de outra classe.
4. **Polimorfismo:** capacidade de diferentes objetos responderem de maneiras distintas a uma mesma operação.

Neste projeto, são explorados principalmente os conceitos de classe, objeto, atributos, métodos, construtor e encapsulamento.

## 3. Funcionalidades

O programa realiza as seguintes operações:

1. Cria um objeto da classe `Triangulo`.
2. Solicita ao usuário os valores dos três lados do triângulo.
3. Utiliza os métodos setters para armazenar os valores nos atributos do objeto.
4. Verifica se os lados atendem às condições de existência de um triângulo.
5. Calcula o perímetro utilizando um método da classe `Triangulo`.
6. Calcula a área utilizando a fórmula de Heron.
7. Apresenta os resultados na saída do programa.

## 4. Regras matemáticas utilizadas

### 4.1. Condição de existência de um triângulo

Para que três segmentos formem um triângulo, é necessário que:

- `a > 0`, `b > 0` e `c > 0`;
- `a < b + c`;
- `b < a + c`;
- `c < a + b`.

Se todas essas condições forem satisfeitas, o triângulo é considerado válido.

### 4.2. Cálculo do perímetro

O perímetro corresponde à soma dos três lados:

`P = a + b + c`

### 4.3. Cálculo da área — Fórmula de Heron

Primeiramente, calcula-se o semiperímetro:

`s = (a + b + c) / 2`

Em seguida, aplica-se a fórmula de Heron:

`A = √[s × (s - a) × (s - b) × (s - c)]`

## 5. Tecnologias utilizadas

- **Linguagem:** Java.
- **Gerenciamento e construção:** Apache Maven.
- **Entrada de dados:** classe `Scanner`, da biblioteca `java.util`.
- **Orientação a objetos:** classes, objetos, atributos e métodos.
- **Encapsulamento:** utilização de atributos privados.
- **Acesso aos atributos:** métodos getters e setters.
- **Cálculos matemáticos:** classe `Math`, utilizada para calcular a raiz quadrada.

## 6. Estrutura do projeto

O projeto segue a estrutura convencional de aplicações Java com Maven:

```
projeto-triangulo-poo/
│
├── src/
│   └── main/
│       └── java/
│           ├── Principal.java
│           └── Triangulo.java
│
├── pom.xml
├── .gitignore
├── README.md
└── LICENSE
```

**Descrição dos arquivos:**

- `Principal.java`: contém o método principal (`main`), responsável pela entrada de dados, criação do objeto e apresentação dos resultados.
- `Triangulo.java`: define a classe `Triangulo`, seus atributos, construtor, getters, setters e métodos de validação e cálculo.
- `pom.xml`: arquivo de configuração do Maven, responsável pelo gerenciamento e pela construção do projeto.
- `.gitignore`: define os arquivos e diretórios que não devem ser versionados pelo Git.
- `README.md`: apresenta a documentação do projeto.
- `LICENSE`: informa os termos de licenciamento do projeto.

## 7. Organização do código

A implementação está dividida em duas classes: `Triangulo` e `Principal`.

### 7.1. Classe Triangulo

A classe `Triangulo` representa a entidade que será utilizada pelo programa.

Ela reúne os atributos que armazenam os três lados e os métodos responsáveis pela validação e pelos cálculos matemáticos.

#### Atributos privados

```
private double a;
private double b;
private double c;
```

Representam os três lados do triângulo.

A palavra-chave `private` impede que esses atributos sejam acessados diretamente por outras classes, aplicando o conceito de encapsulamento.

#### Construtor

```
public Triangulo() {
    setA(0);
    setB(0);
    setC(0);
}
```

O construtor é executado quando um objeto da classe `Triangulo` é criado.

Neste projeto, o construtor inicializa os três lados com o valor zero, utilizando os métodos setters.

#### Getters

```
public double getA() {
    return a;
}

public double getB() {
    return b;
}

public double getC() {
    return c;
}
```

Os getters permitem consultar os valores armazenados nos atributos privados do objeto.

#### Setters

```
public void setA(double a) {
    this.a = a;
}

public void setB(double b) {
    this.b = b;
}

public void setC(double c) {
    this.c = c;
}
```

Os setters permitem modificar os valores dos atributos privados.

A palavra-chave `this` identifica o atributo pertencente ao próprio objeto, diferenciando-o do parâmetro recebido pelo método.

#### Método ehValido()

```
public boolean ehValido() {
    return a > 0 && b > 0 && c > 0
            && a < b + c
            && b < a + c
            && c < a + b;
}
```

Verifica se os lados armazenados no objeto atendem às condições matemáticas de existência de um triângulo.

Retorna `true` quando o triângulo é válido e `false` caso contrário.

#### Método calcularPerimetro()

```
public double calcularPerimetro() {
    return a + b + c;
}
```

Calcula e retorna o perímetro do triângulo utilizando os valores armazenados nos atributos do objeto.

#### Método calcularArea()

```
public double calcularArea() {
    double s = calcularPerimetro() / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
```

Calcula a área utilizando a fórmula de Heron.

Primeiramente, obtém o semiperímetro por meio do método `calcularPerimetro()` e, em seguida, utiliza os três lados para calcular a área.

### 7.2. Classe Principal

A classe `Principal` contém o método `main()`, responsável por iniciar a execução do programa.

#### Criação do objeto

```
Triangulo triangulo = new Triangulo();
```

Cria um objeto chamado `triangulo`, que é uma instância da classe `Triangulo`.

Ao criar esse objeto, o construtor da classe é executado e os atributos são inicializados com zero.

#### Entrada dos dados utilizando setters

```
System.out.print("Lado A: ");
triangulo.setA(entrada.nextDouble());

System.out.print("Lado B: ");
triangulo.setB(entrada.nextDouble());

System.out.print("Lado C: ");
triangulo.setC(entrada.nextDouble());
```

Os valores informados pelo usuário são armazenados nos atributos do objeto por meio dos métodos setters.

Dessa maneira, a classe `Principal` não precisa acessar diretamente os atributos privados da classe `Triangulo`.

#### Verificação da validade do triângulo

```
if (triangulo.ehValido()) {
    System.out.println("Triangulo valido!");
} else {
    System.out.println("Triangulo invalido!");
}
```

Invoca o método `ehValido()` do objeto para verificar se os lados formam um triângulo.

#### Cálculo e apresentação dos resultados

```
System.out.println("Perimetro: " + triangulo.calcularPerimetro());
System.out.println("Area: " + triangulo.calcularArea());
```

Os métodos de cálculo são chamados diretamente pelo objeto `triangulo`.

Os resultados são calculados utilizando os valores armazenados internamente na própria instância.

## 8. Como executar o projeto

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- Java JDK.
- Apache Maven.
- Git (opcional, para clonar o repositório).

### Clonar o repositório

```
git clone URL_DO_REPOSITORIO
```

Acesse o diretório do projeto:

```
cd NOME_DO_PROJETO
```

### Compilar o projeto

Execute o comando:

```
mvn clean compile
```

O Maven realizará a limpeza dos arquivos de compilação anteriores e compilará os arquivos-fonte do projeto.

### Executar o programa

Considerando que a classe `Principal` não possui declaração de pacote, o programa poderá ser executado com:

```
mvn exec:java -Dexec.mainClass="Principal"
```

Esse comando utiliza o plugin Exec do Maven.

Caso o plugin ainda não esteja configurado no projeto, será necessário adicioná-lo ao `pom.xml`.

## 9. Exemplo de execução

### Exemplo 1 — Triângulo válido

**Entrada:**

```
Lado A: 3
Lado B: 4
Lado C: 5
```

**Saída:**

```
Triangulo valido!
Perimetro: 12.0
Area: 6.0
```

### Exemplo 2 — Triângulo inválido

**Entrada:**

```
Lado A: 2
Lado B: 3
Lado C: 8
```

**Saída:**

```
Triangulo invalido!
```

## 10. Conceitos de programação demonstrados

Este projeto permite estudar e identificar os seguintes conceitos:

- Paradigma de programação orientada a objetos.
- Classes e objetos.
- Instanciação de objetos.
- Atributos e métodos.
- Modificadores de acesso (`private` e `public`).
- Construtores.
- Encapsulamento.
- Métodos getters e setters.
- Palavra-chave `this`.
- Métodos de instância.
- Retorno de valores com `return`.
- Entrada e saída de dados com `Scanner`.
- Estruturas condicionais.
- Operações matemáticas.

## 11. Considerações finais

A implementação demonstra a aplicação do paradigma de programação orientada a objetos na resolução de um problema matemático.

Ao utilizar a classe `Triangulo`, os dados e os comportamentos relacionados à entidade são organizados em uma única estrutura. Os atributos privados protegem os dados, enquanto os métodos permitem consultar, modificar e executar operações sobre o objeto.

A separação entre as classes `Principal` e `Triangulo` também demonstra a divisão de responsabilidades: enquanto a primeira coordena a execução e a interação com o usuário, a segunda representa o triângulo e concentra suas operações.

Este projeto também servirá como referência para comparar diferentes paradigmas de programação, permitindo observar como o mesmo problema pode ser resolvido por abordagens distintas, como programação estruturada, funcional, concorrente e orientada a eventos.
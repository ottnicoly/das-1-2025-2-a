# DAS-1-2025-2-A

Anotações de aula relacionadas a princípios de design e arquitetura de software e boas práticas de codificação.

Material de apoio:

https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0

https://engsoftmoderna.info/cap6.html

https://refactoring.guru/design-patterns

---

## 📅 04/08

### ✅ Tópicos abordados:
- Princípios de projeto de código
- Padronização de código
- Ocultamento de informação
- Coesão
- Acoplamento

-----

### 🔹 Abstração
Transformar um problema real do cliente em um sistema que supra suas necessidades. É o processo de modelar apenas os aspectos relevantes do problema, omitindo os detalhes desnecessários.

---

### 🔹 Ocultamento de Informações
Consiste em esconder os detalhes internos da implementação, permitindo o uso de um recurso sem a necessidade de conhecer seu funcionamento interno.  
Esse conceito está diretamente relacionado ao **encapsulamento**.

---

### 🔹 Débito Técnico
Partes do código que foram implementadas de forma apressada ou inadequada e que, no futuro, podem gerar problemas como bugs, dificuldades de manutenção ou baixo desempenho.

---

### 🔹 Coesão
A coesão mede o quão bem os elementos de um módulo ou classe estão relacionados.  
**Código coeso**:
- Faz apenas uma coisa e faz bem
- É fácil de entender, manter e testar
- Reduz a complexidade

---

### 🔹 Acoplamento
Refere-se ao grau de dependência entre classes/módulos.  
**Alto acoplamento**: Classe A depende fortemente da Classe B → mudanças em uma impactam a outra.  
**Baixo acoplamento** (preferido): As classes têm menos dependências diretas.

---

### 🔹 UML - Tipos de Relações

| Relação        | Símbolo       | Exemplo                             |
|----------------|----------------|-------------------------------------|
| **Herança**    | 🔼 (seta vazada) | `Cachorro` herda de `Animal`        |
| **Associação** | ➡️ (seta cheia) | `Professor` ensina `Aluno`          |
| **Implementação** | 🔁 (seta pontilhada) | `Carro` implementa `Veículo`     |

---

## 📅 05/08

### ✅ Tópicos abordados:
- SOLID (S,I)

---

### 🔹 S — **Single Responsibility Principle**  
> Uma classe, método ou função deve ter apenas **uma única responsabilidade** ou razão para mudar.

---

### 🔹 I — **Interface Segregation Principle**  
> Nenhuma classe deve ser forçada a implementar métodos que **não utiliza**.  
> Melhor ter **interfaces pequenas e específicas** do que uma genérica com muitos métodos.

---

## 📅 11/08

### ✅ Tópicos abordados:
- SOLID (O,D)

---

### 🔹 O — **Open/Closed Principle**  
> Entidades (classes, métodos, módulos) devem estar **abertas para extensão** e **fechadas para modificação**.
> Geralmente feita por classes abstratas e interfaces

---

### 🔹 D — **Dependency Inversion Principle**  
> Módulos de alto nível **não devem depender** de módulos de baixo nível. Ambos devem depender de **abstrações**.
> Uma classe deve depender de uma abstração e não de uma implementação concreta. 
> Exemplo: Em vez de `ClasseA` depender diretamente de `ClasseB`, ambas dependem de uma **interface comum**.

---

### 🔹 — **Prefira Composição a Herança**
> Ao usar herança (Funcionário -> Pessoa, Funcionario -> Cliente), estamos criando uma relação fixa onde um Funcionário não pode ser um Cliente. Isso limita a flexibilidade do sistema e, em alguns casos, pode gerar problemas práticos — como ter que cadastrar a mesma pessoa duas vezes no banco de dados (uma vez como cliente e outra como funcionário). Com composição, é possível criar estruturas mais flexíveis. Por exemplo, você poderia ter uma classe Pessoa e associar a ela diferentes papéis (Cliente, Funcionário, Fornecedor), permitindo que a mesma instância de pessoa possua múltiplos papéis ao mesmo tempo, sem duplicar informações.

---

### 🔹 — **Principio de Demeter (Lei do Menor Conhecimento)**
> Um método deve chamar apenas métodos:
  - da própria classe,
  - de objetos passados como parâmetro,
  - de objetos criados dentro do método,
  - ou de atributos diretos da classe.
> Evitar chamadas encadeadas como obj.getA().getB().fazerAlgo(), elas expõem detalhes internos e aumentam o acoplamento.
> Fale apenas com seus amigos, não com os amigos dos seus amigos, mantendo o código mais encapsulado e fácil de manter.

---

## 📅 12/08

### ✅ Tópicos abordados:
- SOLID (L)
- 

---

### 🔹 L — **Liskov Substitution Principle**  
> Subtipos devem poder substituir seus tipos base **sem alterar o comportamento esperado** do programa.  
> Exemplo: Se `Retângulo` herda de `Forma`, ele deve poder ser usado onde `Forma` é esperado, sem causar efeitos colaterais.

---

## 📅 01/09
### ✅ Tópicos abordados:
- Caracteristicas da arquitetura
- Expectativas de um Arquiteto

---

- Caracteristicas da arquitetura = requisitos não funcionais.
(Disponibilidade, COnfiabilidade, Testabilidade, Escalabilidade, Segurança, Agilidade, Tolerancia a falhas, Elasticidade, Reciperabilidade, Desempenho, Implementabilidade, Capacidade de aprendizagem)
- Impossivel que um sistema atenda todos os itens, sempre terá que abrir mão de alguma coisa.
- Decisão arquitetural: escolha da arquitetura que vamos usar.
- Principios do design: de acordo com a decisão do tipo de arquitetura existe principios de design para seguir. Sempre que possivel utilizar mensageria entre os serviços para manter a arquitetura da forma planejada.
- 

Expectativas de um arquiteto:
- cara que toma decisões dificeis
- analisar a arquietura de forma continua
- se mantem atualizado com as tendencias
- exposição e experiencia diversificada
- manter o padrão
- ter conhecimento sobre o dominio do negocio
- habilidades interpessoais
- lidar com questões politicas

tomar decisões:
pessoa q vai orientar a equipe, fazer escolhar da tecnologias e argumentar sobre as decisões.

Analisar continuamente a arquitetura
vai acompanhar e analisar continuamente o sistema e tomar decisões quando preciso mudar algo para manter a vitalidade da arquitetura 

manter-se atualizado com as ultimas tendencias

assegurar a conformidade com as decisões
é o papel dele garantir que os padrões estão sendo seguidos


## ✨ Observações
> Esse repositório é atualizado conforme o andamento da disciplina e novos conteúdos são introduzidos.

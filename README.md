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

### 🔹 L — **Liskov Substitution Principle**  
> Subtipos devem poder substituir seus tipos base **sem alterar o comportamento esperado** do programa.  
> Exemplo: Se `Retângulo` herda de `Forma`, ele deve poder ser usado onde `Forma` é esperado, sem causar efeitos colaterais.

---

## 📅 26/08
### ✅ Tópicos abordados:
- Caracteristicas da arquitetura

- Caracteristicas da arquitetura = requisitos não funcionais.
(Disponibilidade, COnfiabilidade, Testabilidade, Escalabilidade, Segurança, Agilidade, Tolerancia a falhas, Elasticidade, Reciperabilidade, Desempenho, Implementabilidade, Capacidade de aprendizagem)
- Impossivel que um sistema atenda todos os itens, sempre terá que abrir mão de alguma coisa.
- Decisão arquitetural: escolha da arquitetura que vamos usar.
- Principios do design: de acordo com a decisão do tipo de arquitetura existe principios de design para seguir. Sempre que possivel utilizar mensageria entre os serviços para manter a arquitetura da forma planejada.

---

## 📅 01/09
### ✅ Tópicos abordados:
- Expectativas de um Arquiteto

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

### DevOps

- o que é ? É uma medodologia que de alguma maneira entrega valor (Funcionalidades) para o meu cliente da forma mais rápida.
- DevOps como cultura: todos precisam trabalhar juntos para manter um sistema funcionando
- Equipe DevOps: quando nem todos os devs tem o conhecimento em infra

---

## 📅 02/09
### ✅ Tópicos abordados:
- Pensamento arquitetônico

## Diferença entre Arquitetura e Design

Arquiteto de Software: responsável por analisar os requisitos de negócio, extrair e definir as características da arquitetura, selecionar padrões e estilos arquiteturais adequados ao domínio do problema e estruturar os principais componentes do sistema.

Desenvolvedor/Designer: responsável por detalhar a implementação, criar diagramas de classes para cada componente, projetar interfaces de usuário, além de desenvolver e testar o código-fonte.

Formação do conhecimento de um arquiteto modelo T
O arquiteto modelo T possui uma formação em duas dimensões:

Amplitude (barra horizontal do T): conhecimento generalista, cobrindo diversas áreas de tecnologia, metodologias, processos e negócios.

Profundidade (barra vertical do T): especialização em uma área específica, com domínio técnico aprofundado.

--

## 📅 08/09
### ✅ Tópicos abordados:
- Trade-offs

## Trade-offs

toda vez que definimos uma arquitetura n é possivel atribuir todos os requesitos requeridos -> é o famoso "depende" não existe uma função ideal para tudo (não existe resposta certa ou errada)
Não existe certo ou errado: a mesma característica pode ser boa em um cenário e ruim em outro, dependendo do contexto e dos requisitos do sistema.

## Arquitetura baseada em tópicos

Possui um único padrão (1 para muitos), semelhante a um Publish/Subscribe (Pub/Sub).
O broker de mensageria recebe a mensagem e a distribui para todos os assinantes do tópico, como se fosse um grupo de WhatsApp.
(basta ele fazer uma cópia da mensagem e todos vão receber (Broker de menssageria), como se fosse um grupo de whatsapp).

## Características

- Se um tópico “morrer” ou cair, a mensagem não é salva.
- Diferença em relação ao modelo de stream: no stream é possível voltar e resgatar informações como se fosse um backup, utilizando partitions ou sharding.
- O tempo de retenção da mensagem geralmente varia de 24h até 7 dias.

## Protocolos comuns

AMQP, MQTT, WebSocket, Redis, RabbitMQ

## Funcionamento

Cada vez que um evento é lançado (ex.: via arquivo JSON), o tópico envia a mesma mensagem para todos os consumidores ao mesmo tempo.

Fila (Queue)

Segue o modelo FIFO (First In, First Out): o primeiro a entrar é o primeiro a sair.

Operações principais:
Enqueue → inserir uma mensagem na fila.
Dequeue → remover uma mensagem da fila.

## Funcionamento

Existe um sender (quem envia) e um receiver (quem consome).

As mensagens são organizadas em ordem e entregues na mesma sequência em que foram recebidas.

A fila funciona como um buffer obrigatório: salva a mensagem antes de entregá-la.

O consumidor geralmente utiliza polling (busca ativa) para ler as mensagens da fila.

## Implementações comuns

RabbitMQ, AWS SQS, Azure Service Bus

## Desacoplamento

A fila promove desacoplamento entre quem envia e quem recebe a mensagem.

Porém, ao adicionar uma nova funcionalidade (ex.: outro consumidor), pode ser necessário alterar significativamente o sistema.

## Comparação com Tópicos (Pub/Sub)

Fila: quando adicionamos uma nova funcionalidade, pode ser necessário modificar a aplicação para lidar com a mudança.

## fan-out

envia a mensagem e ela é replicada automaticamente para múltiplos consumidores

# 2° Bimestre

## 📅 29/09

## circuit braker

proteger a comunicação entre sistemas
estados: closed, open, half-open

quando ta td bem fica no fechada, quando da erro vai pro aberto, mas de tempos em tempos tenta ir para o meio aberto para ver se ele pode fechar ou se tem que voltar para o aberto.

## ✨ Observações
> Esse repositório é atualizado conforme o andamento da disciplina e novos conteúdos são introduzidos.

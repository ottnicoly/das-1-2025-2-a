# DAS-1-2025-2-A

Anotações de aula relacionadas a princípios de design e arquitetura de software e boas práticas de codificação.

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
- SOLID

---

### 🔹 S — **Single Responsibility Principle**  
> Uma classe, método ou função deve ter apenas **uma única responsabilidade** ou razão para mudar.

---

### 🔹 O — **Open/Closed Principle**  
> Entidades (classes, métodos, módulos) devem estar **abertas para extensão** e **fechadas para modificação**.

---

### 🔹 L — **Liskov Substitution Principle**  
> Subtipos devem poder substituir seus tipos base **sem alterar o comportamento esperado** do programa.  
> Exemplo: Se `Retângulo` herda de `Forma`, ele deve poder ser usado onde `Forma` é esperado, sem causar efeitos colaterais.

---

### 🔹 I — **Interface Segregation Principle**  
> Nenhuma classe deve ser forçada a implementar métodos que **não utiliza**.  
> Melhor ter **interfaces pequenas e específicas** do que uma genérica com muitos métodos.

---

### 🔹 D — **Dependency Inversion Principle**  
> Módulos de alto nível **não devem depender** de módulos de baixo nível. Ambos devem depender de **abstrações**.  
> Exemplo: Em vez de `ClasseA` depender diretamente de `ClasseB`, ambas dependem de uma **interface comum**.

---

## ✨ Observações
> Esse repositório é atualizado conforme o andamento da disciplina e novos conteúdos são introduzidos.

# 📚 BE Estudando - ResumeDTO

> Um projeto educacional focado em padrões de transferência de dados e design patterns em Java

## 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de **estudar e praticar** conceitos fundamentais de desenvolvimento backend em Java, com ênfase especial em:

- 📦 **Data Transfer Objects (DTO)** - Padrão essencial para comunicação entre camadas
- 🏗️ **Arquitetura em Camadas** - Separação clara de responsabilidades
- 🔄 **Mapeamento de Dados** - Conversão eficiente entre entidades e DTOs
- ✨ **Boas Práticas** - Clean Code e Design Patterns

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-100%25-orange?style=for-the-badge&logo=java)

- **Linguagem:** Java ☕
- **Padrão:** MVC/Clean Architecture
- **Conceitos:** DTO, Mapper, Validação

## 📖 O que é um DTO?

Um **DTO (Data Transfer Object)** é um padrão de projeto que encapsula dados para transferência entre processos, reduzindo o número de chamadas remotas e simplificando a comunicação entre camadas da aplicação.

### Benefícios 🌟

✅ Reduz acoplamento entre camadas  
✅ Melhora performance em transferências  
✅ Aumenta segurança ocultando detalhes internos  
✅ Facilita validação de dados  
✅ Simplifica testes unitários  

## 🏛️ Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── exemplo/
│               ├── dto/           # 📦 Data Transfer Objects
│               ├── entity/        # 🗄️ Entidades do Banco
│               ├── mapper/        # 🔄 Conversores DTO ↔ Entity
│               ├── service/       # 🔧 Lógica de Negócio
│               └── controller/    # 🌐 Endpoints REST
└── test/
    └── java/                      # ✅ Testes Unitários
```

## 💡 Exemplo Prático

### Entity (Modelo de Banco de Dados)
```java
@Entity
public class Produto {
    @Id
    private Long id;
    private String nome;
    private Double preco;
    private String descricao;
    // getters, setters...
}
```

### DTO (Objeto de Transferência)
```java
@Data
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
    // Sem campos sensíveis ou pesados
}
```

### Mapper (Conversão)
```java
public class ProdutoMapper {
    public static ProdutoDTO toDTO(Produto produto) {
        return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getPreco());
    }
}
```

## 🔍 Principais Aprendizados

| Tópico | Descrição |
|--------|-----------|
| 📦 **DTO** | Separação entre modelos internos e externos |
| 🔄 **Mapeamento** | Conversão eficiente de dados |
| ✔️ **Validação** | Uso de anotações como @Valid, @NotNull |
| 🧪 **Testes** | Cobertura de casos de uso comuns |
| 📊 **Escalabilidade** | Design preparado para crescimento |

## 🎓 Como Usar

1. **Clone o repositório**
   ```bash
   git clone https://github.com/leandroFilipy/BE-estudando-resumeDTO.git
   cd BE-estudando-resumeDTO
   ```

2. **Compile o projeto**
   ```bash
   mvn clean install
   ```

3. **Execute os testes**
   ```bash
   mvn test
   ```

4. **Explore o código** e aprenda os padrões aplicados! 🚀

## 📚 Recursos Adicionais

- [Design Patterns in Java](https://refactoring.guru/design-patterns/java)
- [DTO Pattern - Martin Fowler](https://martinfowler.com/bliki/DataTransferObject.html)
- [Java Best Practices](https://www.oracle.com/java/technologies/)

## 👨‍💻 Desenvolvedor

**Leandro Filipy** 👋

- 📧 Conecte-se no GitHub: [@leandroFilipy](https://github.com/leandroFilipy)
- 💬 Este é um projeto de aprendizado e evolução constante!

## 📝 Licença

Este projeto é fornecido como material educacional. Sinta-se livre para usar, estudar e compartilhar! 📖✨

---

<div align="center">

**⭐ Se este projeto foi útil, deixe uma star!** ⭐

*Desenvolvido com ❤️ para aprender Java*

</div>
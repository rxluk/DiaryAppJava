# Diary

## Visão Geral do Projeto
- **Descrição**: Um aplicativo de diário pessoal desenvolvido em Java, permitindo aos usuários registrar suas anotações diárias, visualizar registros anteriores e realizar buscas no conteúdo do diário.
- **Objetivo**: Fornecer uma plataforma segura e fácil de usar para a manutenção de um diário pessoal digital.

## Funcionalidades Principais
- Cadastro de Usuário
- Login/Autenticação
- Adicionar Anotação
- Visualizar Anotações
- Pesquisar Anotações
- Edição e Exclusão de Anotações

## Requisitos Funcionais
- RF01: Cadastro de novos usuários
- RF02: Autenticação de usuários registrados
- RF03: Adição de novas anotações no diário
- RF04: Visualização de anotações anteriores
- RF05: Busca por palavras-chave nas anotações do diário
- RF06: Edição e exclusão de anotações

## Requisitos Não Funcionais
- RNF01: Segurança dos dados do usuário
- RNF02: Responsividade em diferentes dispositivos
- RNF03: Facilidade de uso e interface intuitiva
- RNF04: Escalabilidade para suportar múltiplos usuários

## Arquitetura do Sistema
- **Camada de Apresentação**: Interface de usuário (JavaFX ou Spring Boot com Thymeleaf)
- **Camada de Lógica de Negócios**: Serviços que gerenciam as regras de negócio
- **Camada de Persistência**: Interação com o banco de dados PostgreSQL
- **Camada de Segurança**: Gestão de autenticação e autorização

## Diagrama de Casos de Uso

```plantuml
@startuml

actor Usuario as User
rectangle Sistema {
  User --> (Cadastro de Usuário)
  User --> (Login)
  User --> (Adicionar Anotação)
  User --> (Editar Anotação)
  User --> (Excluir Anotação)
  User --> (Visualizar Anotações)
  User --> (Pesquisar Anotações)
  User --> (Logout)

}

@enduml

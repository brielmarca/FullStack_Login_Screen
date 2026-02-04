# Fullstack Login (Java + Spring Boot + MySQL + Frontend)

Este repositório contém o **esqueleto** do projeto de login seguindo a ordem correta:

1. **Database (MySQL)**
2. **Backend (Java + Spring Boot)**
3. **API REST**
4. **Frontend**

A ideia aqui é manter a arquitetura limpa, com cada camada fazendo apenas sua responsabilidade.

---

## ✅ Arquitetura Geral

```
[ Frontend ]
     ↓ HTTP (JSON)
[ API REST ]
     ↓
[ Backend ]
     ↓
[ Database ]
```

---

## 🗄️ 1️⃣ Database (Modelagem)

**Nome do banco (sugestão):** `fullstack_login`

**Tabela:** `users`

**Campos:**
- `id` (PK)
- `email` (unique)
- `password` (hash)
- `created_at`

**Modelo SQL (exemplo):**

```sql
CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## ☕ 2️⃣ Backend (Java + Spring Boot)

A estrutura de pastas foi criada conforme padrão profissional:

```
backend/
└── src/main/java/com/teuapp
    ├── controller
    ├── service
    ├── repository
    ├── domain
    ├── dto
    ├── exception
    ├── security
    └── config
```

**Responsabilidades:**
- `controller` → recebe requisições HTTP
- `service` → regras de negócio
- `repository` → acesso ao banco
- `domain` → entidades (User)
- `dto` → dados que entram/saem da API
- `exception` → erros personalizados
- `security` → login, senha, auth
- `config` → configurações gerais

---

## 🌐 3️⃣ API REST

Endpoints planejados:
- `POST /auth/login`
- `POST /auth/register` (opcional depois)

Fluxo:
1. Recebe JSON do frontend
2. Chama o service
3. Retorna **sucesso** ou **erro**

---

## 🖥️ 4️⃣ Frontend

Estrutura criada:

```
frontend/
├── index.html
├── css/
│   └── style.css
├── js/
│   ├── api.js
│   └── login.js
└── assets/
```

O frontend será simples e direto: HTML + CSS + JS.

---

## 🚦 Próximos passos

1. Criar banco e tabela `users`
2. Criar backend Spring Boot
3. Implementar endpoint de login
4. Testar com Postman
5. Criar tela de login
6. Integrar tudo

---

Se quiser, posso começar pelo **passo 1** (criar o banco) e seguir a ordem correta.

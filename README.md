<h1 align="center">Full-Stack Login Screen</h1>
<h3 align="center">Educational authentication flow built with Node.js, JavaScript and bcrypt</h3>

<p align="center">
  <a href="https://github.com/brielmarca"><img src="https://img.shields.io/badge/Developer-Gabriel%20Marca-181717?style=for-the-badge&logo=github&logoColor=white" alt="Gabriel Marca on GitHub" /></a>
</p>

> A learning project that demonstrates the responsibilities of a complete login flow, including the interface, server validation, password hashing and controlled authentication responses.

---

## Project Overview

This repository was created to study how frontend and backend layers cooperate during authentication. The project focuses on understanding credential submission, request validation, password-hash comparison and safe success or failure responses.

## Main Features

- [x] Login interface built with HTML, CSS and JavaScript
- [x] Server-side credential validation flow
- [x] Password hashing and comparison with bcrypt
- [x] Separation between interface and authentication logic
- [x] Environment-based configuration guidance
- [x] Security considerations documented for future development

## Technology Stack

### Frontend

<p>
  <img src="https://img.shields.io/badge/HTML5-Markup-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" />
  <img src="https://img.shields.io/badge/CSS3-Styling-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" />
  <img src="https://img.shields.io/badge/JavaScript-Language-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" />
</p>

### Backend and Security

<p>
  <img src="https://img.shields.io/badge/Node.js-Runtime-339933?style=for-the-badge&logo=nodedotjs&logoColor=white" alt="Node.js" />
  <img src="https://img.shields.io/badge/bcrypt-Password%20Hashing-003A70?style=for-the-badge" alt="bcrypt" />
  <img src="https://img.shields.io/badge/Auth-Learning%20Project-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white" alt="Authentication project" />
</p>

## Authentication Flow

```text
Browser Login Form
        |
        v
Server Validation
        |
        v
Password Hash Comparison
        |
        v
Controlled Success or Failure Response
```

## How to Run the Project

### Requirements

- Node.js 18 or later
- npm

### Installation

```bash
git clone https://github.com/brielmarca/FullStack_Login_Screen.git
cd FullStack_Login_Screen
npm install
```

Configure the required local environment variables before running the project. Never commit credentials or secret values to the repository.

## Security Notes

This project is an educational prototype and is not a production authentication service. A production implementation should also include input validation, secure sessions or tokens, rate limiting, HTTPS, password-reset controls, logging and protection against common web attacks.

## Project Status

Educational project under development.

## License

This project is under the MIT License. See the `LICENSE` file for more details.

## Contact

Developed by **Gabriel Marca**.

[Portfolio](https://brielmarca-portfolio.pages.dev) | [LinkedIn](https://www.linkedin.com/in/gabrielmarca/) | [GitHub](https://github.com/brielmarca) | [Email](mailto:brielmarcacontact@gmail.com)
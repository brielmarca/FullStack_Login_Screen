# Full-Stack Login Screen

Authentication study project that documents the basic pieces of a full-stack login flow: user records, password hashing, a server endpoint and a browser interface.

## Purpose

This repository is a learning prototype, not a production authentication service. It is intended to make the responsibilities of each layer easy to understand before introducing a larger framework.

## Planned flow

1. The user submits credentials from the interface.
2. The server validates the request.
3. The stored password hash is compared with bcrypt.
4. The application returns a controlled success or failure response.

## Technology

- HTML, CSS and JavaScript
- Node.js
- bcrypt
- Relational database concepts

## Setup

Requirements: Node.js 18+ and npm.

    npm install

Create local environment variables for database and authentication settings. Do not place credentials directly in source files.

## Security notes

A real authentication system also needs input validation, secure sessions or tokens, rate limiting, CSRF protection where applicable, password-reset controls, logging and HTTPS. Those requirements are outside the current prototype and should be added before any production use.

## Status

Educational skeleton under development. The repository currently focuses on project structure and authentication concepts rather than a complete deployable application.

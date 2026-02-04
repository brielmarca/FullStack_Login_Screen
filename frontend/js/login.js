const form = document.getElementById("login-form");
const feedback = document.getElementById("feedback");
const formTitle = document.getElementById("form-title");
const submitButton = document.getElementById("submit-button");
const tabs = document.querySelectorAll(".tab");

function setMode(mode) {
  form.dataset.mode = mode;
  const isRegister = mode === "register";
  formTitle.textContent = isRegister ? "Registrar" : "Login";
  submitButton.textContent = isRegister ? "Registrar" : "Entrar";
  tabs.forEach((tab) => {
    const active = tab.dataset.mode === mode;
    tab.classList.toggle("active", active);
    tab.setAttribute("aria-selected", active ? "true" : "false");
  });
  feedback.textContent = "";
}

tabs.forEach((tab) => {
  tab.addEventListener("click", () => setMode(tab.dataset.mode));
});

form.addEventListener("submit", async (event) => {
  event.preventDefault();
  feedback.textContent = "";

  const email = form.email.value.trim();
  const password = form.password.value.trim();
  const action = form.dataset.mode || "login";

  if (!email || !password) {
    feedback.textContent = "Preencha email e senha.";
    return;
  }

  try {
    const path = action === "register" ? "/auth/register" : "/auth/login";
    const result = await postJson(path, { email, password });

    if (result.ok) {
      feedback.style.color = "#16a34a";
      feedback.textContent =
        action === "register"
          ? "Cadastro realizado com sucesso!"
          : "Login realizado com sucesso!";
    } else {
      feedback.style.color = "#dc2626";
      const fallback =
        action === "register"
          ? "Erro ao fazer cadastro."
          : "Erro ao fazer login.";
      feedback.textContent = result.data.message || fallback;
    }
  } catch (error) {
    feedback.style.color = "#dc2626";
    feedback.textContent = "Nao foi possivel conectar a API.";
  }
});

setMode("login");

# Mantins
Este projeto é uma suíte de testes automatizados para um sistema de gerenciamento de tarefas. Utilizei o Selenium WebDriver, seguindo o padrão de projeto Page Object Model . Tecnologias Utilizadas Java: Linguagem de programação principal para o desenvolvimento dos testes. Selenium WebDriver, JUnit, ,ChromeDriver/EdgeDriver, Padrão Page Object.

Estrutura do Projeto
src/main/java

pages
LoginPage.java: Representa a página de login e contém métodos para interagir com os elementos dessa página.
HomePage.java: Representa a página principal após o login e contém métodos para validação de URL.
mantins/metodos
Metodos.java: Classe utilitária que contém métodos genéricos para escrever, clicar, selecionar opções em dropdowns e validar textos.
src/test/java

steps
Steps.java: Classe de testes que configura o WebDriver, executa os testes e valida os resultados.
Casos de Teste Implementados
Caso de Teste 1: Login com Sucesso
Objetivo: Verificar se o login é realizado com sucesso com credenciais válidas.

Passos:

Navegar para a página de login.
Inserir o nome de usuário válido.
Inserir a senha válida.
Clicar no botão de login.
Verificar se a URL da página redirecionada após o login é a esperada.
Resultado Esperado: O usuário é redirecionado para a página principal do sistema.

Caso de Teste 2: Login com Senha Errada
Objetivo: Verificar se uma mensagem de erro apropriada é exibida quando o usuário tenta fazer login com uma senha incorreta.

Passos:

Navegar para a página de login.
Inserir o nome de usuário válido.
Inserir uma senha inválida.
Clicar no botão de login.
Verificar se a mensagem de erro "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos." é exibida.
Resultado Esperado: A mensagem de erro apropriada é exibida.

Caso de Teste 3: Criar uma Tarefa com Sucesso
Objetivo: Verificar se o usuário pode criar uma tarefa com todos os campos obrigatórios preenchidos corretamente.

Passos:

Fazer login com sucesso.
Navegar para a página de criação de tarefas.
Preencher todos os campos obrigatórios da tarefa.
Clicar no botão de confirmar tarefa.
Verificar se a tarefa foi criada com sucesso.
Resultado Esperado: A tarefa é criada com sucesso.

Caso de Teste 4: Criar uma Tarefa sem Preencher o Category ID
Objetivo: Verificar se o sistema exibe uma mensagem de erro apropriada quando o usuário tenta criar uma tarefa sem preencher o campo Category ID.

Passos:

Fazer login com sucesso.
Navegar para a página de criação de tarefas.
Não preencher o campo Category ID.
Preencher os outros campos obrigatórios da tarefa.
Clicar no botão de confirmar tarefa.
Verificar se a mensagem de erro "APPLICATION ERROR" é exibida.
Resultado Esperado: A mensagem de erro apropriada é exibida.

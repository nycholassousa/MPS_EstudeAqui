# Métodos de Projeto de Software: EstudeAqui

## O que é

O software busca reunir questionários utilizados em vestibulares de universidades de renome no Brasil, utilizando a linguagem de programação Java, junto com um banco de dados em MySQL.

## Requisitos Funcionais

### [RF001] - Usuário para Administração
O sistema terá um usuário que será identificado como administrador. Para identificar tal administrador, será feito uma comparação no banco de dados, caso o usuário tenha o valor 1 na coluna `page_admin`, este usuário terá privilégio de administrador.

### [RF002] - Relatório de Administração
O administrador terá acesso a relatórios do sistema, que podem ser: dados sobre usuários, dados sobre as questões e logs feitos no sistema.

### [RF003] - Cadastro de Usuário
O sistema deve cadastrar usuários e salvá-los no banco de dados MySQL.

### [RF004] - Exibição de Questionários
Será exibido os questionários aos usuários para que respondam e caso queiram, refaçam.

### [RF005] - Relatório de Usuário
O sistema deve gerar relatórios para o usuário, assim, o mesmo pode ter conhecimento de como está sendo suas sessões de estudos e o aproveitamento de suas seções.

### [RF006] - Login de Usuário
O usuário deverá fazer o login utilizando seu email para entrar no sistema, caso já possua cadastro.

### [RF007] - Notificação de Novas Questões
O usuário receberá notificação ao entrar no programa, caso novas questões sejam adicionadas no sistema, possibilitando novas sessões de estudo.

### [RF008] - Importar Questões
O administrador poderá importar novas questões para o banco de dados, utilizando dois tipos de arquivo: JSON ou CSV.

### [RF009] - Responder Questionário
O usuário após estar logado no sistema, poderá responder o questionário, caso queira.
<br><br><br>
## Requisitos Não-Funcionais

### [RNF001] - Persistência
O sistema deve ser capaz de armazenar informações das questões e dos usuários, utilizando banco de dados em MySQL, versão 5 ou superior.

### [RNF002] - Tecnologia para Implementação
A aplicação deve utilizar Java versão 1.8.0_131 ou superior. Além do mais, para o funcionamento, é necessário que tenha o Java Runtime Environment na versão 1.8.0_131-b11 ou superior, assim como o Java Hotspot Client VM, versão 25.131-b11 ou superior.

### [RNF003] - Tecnologia para Relatórios
O sistema de relatórios fará uso da biblioteca PDFOne, versão 5.4.863.533 versão trial.

### [RNF004] - Finalizar Sessão
Após ter o aplicativo fechado pelo usuário, o sistema deve finalizar a sessão inicializada anteriormente pelo usuário.

### [RNF005] - Plataforma
O aplicativo deve ser executável sem problemas em sistemas operacionais Windows Vista ou mais recente, e em qualquer versão do Linux, contanto que o mesmo disponha de interface gráfica.

### [RNF006] - Fácil Navegação
O usuário deve encontrar facilidade na utilização dos menus do aplicativo, com botões descrevendo clara e brevemente suas funções.

### [RNF007] - Tempo de Resposta
O aplicativo deve retornar ao usuário de forma rápida qualquer estado requisitado (nova questão para responder, relatório, fazer login, etc). O usuário não deve aguardar mais que 3 segundos.

## Diagrama de Classes
No link abaixo você pode conferir a imagem do diagrama de classes com uma boa resolução:

────────────────────────────────────────────────────────────────────────────────────
## Equipa :

* **Juliana Prado** — 54348 (LETI)
* **Luís Prado** — 98898 (LETI)
* **Daniel Maio** — 99201 (LETI)
* **Simão Sousa** — 130768 (DSA)`       

────────────────────────────────────────────────────────────────────────────────────

Video de Demonstração dos testSuits : https://www.youtube.com/watch?v=pK2tVYI6F2w


# Product Backlog - Battleship (papergames.io)

### Juliana (54348)

* **US1 - Aceder à página inicial do Battleship**
  * *Como* jogador, *quero* abrir a página do jogo Battleship *para* visualizar as opções de jogo disponíveis.
  * *Critérios de Aceitação:* O utilizador acede a `https://papergames.io/en/battleship` e verifica o título da página e os botões "Play Online" e "Play with a Bot".

* **US2 - Iniciar jogo contra o Bot**
  * *Como* jogador a solo, *quero* iniciar uma partida contra o Bot *para* treinar sem necessitar de outro jogador humano.
  * *Critérios de Aceitação:* Clicar em "Play with a Bot", escolher a dificuldade ou iniciar partida direta, e o ecrã de preparação do jogo é exibido.

* **US3 - Definir ou alterar Nickname temporário**
  * *Como* jogador convidado, *quero* definir o meu nickname no lobby *para* ser identificado durante a partida.
  * *Critérios de Aceitação:* Inserir um nome no campo de texto de nickname e confirmar que o nome atualiza no cabeçalho ou sala.

* **US4 - Criar uma sala privada para jogar com um amigo**
  * *Como* utilizador, *quero* criar uma sala privada de Battleship *para* partilhar o link diretamente com um amigo.
  * *Critérios de Aceitação:* Clicar na opção de convidar/jogar com amigo, gerar o link de partilha único e permitir copiar o link.

---

### Luís (98898)

* **US5 - Ativar ou desativar a música nas definições**
  * *Como* jogador, *quero* poder ativar ou desativar a música nas definições do jogo *para* personalizar a minha experiência de jogo.
  * *Critérios de Aceitação:* Aceder às definições, localizar a opção de música ("Music"), desativá-la e verificar que a música deixa de ser reproduzida. Voltar a ativá-la e verificar que a música fica novamente disponível.

* **US6 - Consultar os meus torneios**
  * *Como* jogador, *quero* consultar os meus torneios (`/en/t/my-tournaments`) *para* acompanhar as competições em que participo ou que organizei.
  * *Critérios de Aceitação:* Aceder à página `/en/t/my-tournaments` e verificar que é apresentada a secção dos meus torneios e a respetiva informação disponível.

* **US7 - Consultar a classificação global dos jogadores**
  * *Como* jogador, *quero* consultar a classificação global ("Global Leaderboards") *para* comparar o meu desempenho com o dos restantes jogadores.
  * *Critérios de Aceitação:* Aceder à secção "Global Leaderboards" e verificar que é apresentada a tabela de classificação global com os jogadores e as respetivas pontuações.

* **US8 - Definir tempo ilimitado numa partida contra o Bot**
  * *Como* jogador, *quero* selecionar a opção de tempo ilimitado numa partida contra o Bot *para* jogar sem limite de tempo para realizar as minhas jogadas.
  * *Critérios de Aceitação:* Iniciar a configuração de uma partida contra o Bot, selecionar a opção de tempo ilimitado ("Unlimited") e verificar que a partida decorre sem uma contagem decrescente ou limite de tempo por jogada.
---

### Daniel (99201)

* **US9 - Consultar o registo de alterações e novidades (Changelog)**
  * *Como* utilizador da plataforma, *quero* aceder à página de Changelog (`/en/changelog`) *para* consultar as notas de lançamento e versões mais recentes dos jogos.
  * *Critérios de Aceitação:* Na página do Battleship, clicar no link do Changelog, verificar que a página de novidades é carregada com o respetivo URL (`/en/changelog`) e a secção de histórico de versões fica visível.

* **US10 - Navegar da página do Battleship para outro jogo (Tic-Tac-Toe)**
  * *Como* jogador na plataforma, *quero* navegar da página do Battleship para o jogo Tic-Tac-Toe através do menu de navegação *para* alternar entre jogos sem voltar à página inicial.
  * *Critérios de Aceitação:* Na página `/en/battleship`, clicar no link do jogo Tic-Tac-Toe (`/en/tic-tac-toe`) e verificar que a página do novo jogo é aberta com o URL e título correspondentes.

* **US11 - Consultar os Termos e Condições da plataforma**
  * *Como* utilizador da plataforma, *quero* aceder à página de Termos e Condições (`/en/blog/terms-conditions`) a partir do rodapé da página *para* ler as regras de utilização do serviço.
  * *Critérios de Aceitação:* Na página do Battleship, clicar no link de termos no rodapé e verificar que a página de Termos e Condições é carregada com o respetivo conteúdo visível.

* **US12 - Consultar os planos de subscrição Plus da plataforma**
  * *Como* jogador, *quero* aceder à página de planos de subscrição (`/en/pricing/plus`) *para* consultar os benefícios e vantagens de ser membro Plus.
  * *Critérios de Aceitação:* Clicar no link de pricing/subscrição, verificar que a página abre exibindo a tabela com os planos de adesão (mensal/anual) e as suas vantagens.

---


### Simão (130768)

* **US13 - Criar torneio de Battleship**
  * *Como* organizador, *quero* criar um torneio de Battleship (`/en/t/create-tournament?game=Battleships`) *para* organizar uma competição com outros jogadores.
  * *Critérios de Aceitação:* Aceder ao formulário de criação de torneio, preencher o nome do torneio, selecionar o modo ("Leaderboard" ou "Bracket") e clicar em "Create and Share" para criar e partilhar o torneio.

* **US14 - Consultar a lista de amigos**
  * *Como* jogador social, *quero* aceder à lista de amigos (`/en/friends`) *para* consultar os meus amigos e verificar se tenho convites pendentes.
  * *Critérios de Aceitação:* Introduzir primeiro o nickname para aceder à página de amigos. Após a entrada, verificar a apresentação da mensagem "No pending invitations" e a lista de amigos ("Friends"), sem abas ou barra de pesquisa.

* **US15 - Explorar a loja de Avatares e Emojis**
  * *Como* jogador, *quero* visualizar os itens cosméticos na loja (`/en/shop/avatars`) *para* personalizar o meu perfil.
  * *Critérios de Aceitação:* Navegar para a secção da loja de avatares/moedas e verificar a grelha de itens disponíveis com os respetivos preços.

* **US16 - Consultar as regras do jogo Battleship**
  * *Como* novo jogador, *quero* ler as regras do Battleship na página do jogo (`/en/battleship`) *para* compreender como jogar e conhecer as regras antes de iniciar uma partida.
  * *Critérios de Aceitação:* Aceder à secção "Rules of Battleship Game Online" na página do Battleship e consultar as instruções e regras do jogo.

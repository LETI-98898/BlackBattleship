────────────────────────────────────────────────────────────────────────────────────
## Equipa :

* **Juliana Prado** — 54348 (LETI)
* **Luís Prado** — 98898 (LETI)
* **Daniel Maio** — 99201 (LETI)
* **Simão Sousa** — 130768 (DSA)`       

────────────────────────────────────────────────────────────────────────────────────

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

* **US9 - Efetuar um disparo na grelha do adversário**
  * *Como* jogador na minha vez, *quero* clicar numa coordenada da grelha inimiga *para* tentar atingir um navio adversário.
  * *Critérios de Aceitação:* Clicar numa célula vazia; a célula é marcada com um símbolo de "Água" (Miss) ou "Tiro certeiro" (Hit) e a vez passa para o adversário (ou repete, consoante as regras).

* **US10 - Consultar o Histórico de Partidas de Battleship**
  * *Como* jogador, *quero* aceder ao meu histórico de partidas de Battleship (`/en/match-history?gameType=Battleships`) *para* analisar as minhas vitórias e derrotas anteriores.
  * *Critérios de Aceitação:* Navegar até ao Match History filtrado por Battleships e verificar a listagem de jogos anteriores com resultados e adversários.

* **US11 - Enviar uma mensagem rápida ou emoji durante a partida**
  * *Como* jogador em jogo, *quero* enviar uma mensagem predefinida ou reação no chat *para* comunicar com o adversário.
  * *Critérios de Aceitação:* Abrir o painel de chat/emojis durante a partida, selecionar um emoji/mensagem e verificar a exibição na caixa de diálogo do jogo.

* **US12 - Desistir de uma partida em curso**
  * *Como* jogador numa situação desfavorável, *quero* ter a opção de render-me/desistir *para* terminar a partida imediatamente.
  * *Critérios de Aceitação:* Clicar no botão de menu/bandeira branca de desistência, confirmar o aviso de desistência e verificar a transição para o ecrã de derrota com a opção de regressar ao lobby.

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

# Fondamenti di Java

[![shipthatcode — Java Fundamentals](https://api.shipthatcode.com/cert/8fd3bccdd3ed01f443b701df2cbb8d60.svg)](https://shipthatcode.com/courses/java-fundamentals)

Il mio repository di lavoro per [Fondamenti di Java](https://shipthatcode.com/courses/java-fundamentals) su [shipthatcode.com](https://shipthatcode.com) — costruito lezione dopo lezione nel mio editor.

## Cosa serve

- **git** e un terminale (macOS/Linux: quello integrato; Windows: vedi sotto)
- JDK 21+ (`javac -version` dovrebbe funzionare) — il sistema di valutazione usa la versione 25, quindi record, tipi sealed e `switch` con pattern matching funzionano tutti
- qualsiasi editor tu preferisca — VS Code, Vim, JetBrains o altro

### Su Windows

Se puoi, usa **WSL**: esegui una volta `wsl --install` in PowerShell come amministratore, poi fai tutto (git, modifica dei file, `./run_tests.sh`) all'interno del terminale Ubuntu — si comporta esattamente come il sistema di valutazione.

[Git Bash](https://git-scm.com/downloads) (si installa con git) esegue anch'esso `./run_tests.sh`. Una precisazione: i compilatori e i runtime nativi di Windows usano terminatori di riga Windows (`\r\n`), quindi nei test byte-exact potresti vedere degli ERRORE locali anche quando il diff sembra identico — la logica è corretta, ma i terminatori di riga invisibili sono diversi. In tal caso, fai affidamento su **Controlla la mia soluzione** nella pagina della lezione (la valutazione avviene su Linux) oppure passa a WSL.

## Per iniziare (configurazione iniziale)

1. Decomprimi questo download e apri la cartella nel tuo editor.
2. Crea un nuovo repository **vuoto e pubblico** su [github.com/new](https://github.com/new) — lascia deselezionate le opzioni "Add a README" e ".gitignore" (questa cartella le contiene già entrambe).
3. Nel terminale, all'interno della cartella decompressa, esegui il push su GitHub:

   ```sh
   git init
   git add .
   git commit -m "start Java Fundamentals"
   git branch -M main
   git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPO.git
   git push -u origin main
   ```

4. Incolla il link del repository nella [pagina del corso](https://shipthatcode.com/courses/java-fundamentals) ("Work in your own editor" → **Link repo**). Fatto — non dovrai ripetere questa operazione.

## Il ciclo della lezione

1. Leggi la lezione su shipthatcode e scrivi qui il tuo codice in `Main.java`.
2. Esegui i test localmente per **la lezione che stai seguendo**: `./run_tests.sh 01`, `./run_tests.sh 02` e così via. Su Windows, eseguili all'interno di Git Bash. (Un semplice `./run_tests.sh` esegue i test di tutte le lezioni, cosa utile solo nei corsi in cui un unico programma risponde a tutte — vedi sotto.)
3. Quando tutto passa: `git add -A && git commit -m "lesson 01" && git push`
4. Premi **Controlla la mia soluzione** nella pagina della lezione — shipthatcode scarica questo repository e lo valuta con l'intera suite, inclusi i test nascosti.

## Struttura del repository

- `Main.java` — il programma che stai valutando in questo momento.
- `tests/` — i casi di test pubblici per ogni lezione (`tests/01-…/1.in` → `1.out` atteso).
- `run_tests.sh` — il runner locale. `.shipthatcode.json` comunica al sistema di valutazione cos'è questo repository; non eliminare nessuno dei due.

### Una lezione alla volta

Ogni lezione specifica il proprio formato di input e output e **la maggior parte delle lezioni è un esercizio separato, non una versione più grande di quello precedente**. Due lezioni possono ricevere la stessa riga di input e richiedere correttamente output diversi — un tokenizer stampa `[ls] [-la]`, mentre la lezione successiva, che riceve un input già tokenizzato, stampa `ls -la`. Nessun singolo programma può soddisfare entrambe, e non deve farlo.

Considera quindi `Main.java` come il file della lezione che stai valutando: quando passi alla successiva, modifica ciò che fa. Non perdi nulla — ogni lezione precedente è nella cronologia git (`git log`, `git show`) e shipthatcode ricorda ogni lezione superata, quindi una lezione rimane completata anche dopo aver sostituito il codice che l'ha superata. Se preferisci conservare il codice visibile, copialo prima altrove (`cp Main.java solutions/01-<lesson>.java`) — i file aggiuntivi vengono ignorati dal sistema di valutazione.

Quando una lezione si basa realmente su quella precedente, il testo della lezione lo specifica e i relativi test passeranno mantenendo il comportamento precedente.

## Se il corso viene aggiornato

I corsi migliorano nel tempo — vengono aggiunti esercizi e corretti test. Se la [pagina del corso](https://shipthatcode.com/courses/java-fundamentals) indica che il tuo starter non è aggiornato: scarica un nuovo file zip, **elimina completamente la cartella `tests/` di questo repository**, copia la nuova `tests/` e il nuovo `.shipthatcode.json`, e mantieni il tuo codice esattamente com'è. (Non unire le cartelle dei test — la numerazione delle lezioni può cambiare tra le versioni.) Le lezioni già completate rimangono completate in ogni caso.

<sub>Argomento suggerito per il repository: `shipthatcode` · Starter generato da [shipthatcode.com](https://shipthatcode.com)</sub>

# <p align="center">Desafio Final Individual - Accenture QA</p>

<p align="center">
  <a href="#descrição">Descrição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#como-utilizar">Como utilizar</a>&nbsp;&nbsp;&nbsp;
</p>

<br>

Realizado por:

- [Aline Camilo Sena](https://www.linkedin.com/in/sena)

<br>

<br>

## Descrição
### Criar um projeto em selenium webdrive (java) e cucumber para realizar as seguintes tarefas:
<br>

<ul>Entrar no site http://sampleapp.tricentis.com/101/app.php</ul>

<ul>Preencher o formulário, aba “Enter Vehicle Data” e pressione next</ul>

<ul>Preencher o formulário, aba “Enter Insurant Data” e pressione next</ul>

<ul>Preencher o formulário, aba “Enter Product Data” e pressione next</ul>

<ul>Preencher o formulário, aba “Select Price Option” e pressione next</ul>

<ul>Preencher o formulário, aba “Send Quote” e pressione Send</ul>

<ul>Verificar a mensagem “Sending e-mail success!” na tela</ul>

<br>

<br>

## Tecnologias


:heavy_check_mark: <b> [Java](https://www.java.com/pt-BR/) </b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Maven](https://maven.apache.org/) </b><br>
Gerenciador de dependências para desenvolvimento da aplicação <br>

:heavy_check_mark: <b> [Cucumber](https://cucumber.io/) </b><br>
Framework responsável por traduzir uma linguagem humana em código Java <br>

:heavy_check_mark: <b> [Selenium](https://www.selenium.dev/) </b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber), abrindo o browser e fazendo o teste de comportamento <br>

<br>

<br>

## Como utilizar

### Pré requisitos
- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar o [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador

- Clone do projeto
```bash
git clone https://github.com/bahamonde/projeto-gama-qa
```

- Entrando na pasta do projeto
```bash
cd projeto-gama-qa
```

- Configurando Selenium
Fazer o download do [Chrome WebDriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo desconpactado dentro da pasta drive na raiz do projeto

- Baixe o Chrome Webdriver de acordo com seu sistema operacional em [Download](https://chromedriver.chromium.org/downloads)

- Crie uma pasta com o nome driver na raiz do projeto e coloque o arquivo do Chrome Webdriver nela

- Limpando e validando Maven com Unix
```bash
./mvnw clean
```

- Limpando e validando Maven com Windows
```bash
mvnw.cmd clean
```

- Executando teste com Unix
```bash
./test.sh
```

- Executando teste com Windows
```bash
./test.bat
```
## Estrutura de arquivos
```
  driver 

      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina

  mvnw

  mvnw.cmd

  pom.xml

  src

    |-- test

    |  |-- java

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- projetoFinal

    |  |  |  |  |  |-- servicos -- Pasta para colocar Classes em Java para usar nos arquivos Steps
    
    |  |  |  |  |  |  |-- Configuracao -- Conjunto de classes em java para facilitar o processo das Steps

    |  |  |  |  |  |-- steps -- Pasta para colocar Classes em Java que terão os Steps
 
    |  |  |  |  |  |  |-- CompartilhadoSteps.java -- Passos escritos em java com selenium em comum entre os cenários
    
    |  |  |  |  |  |  |-- EnterInsurantDataSteps.java -- Passos escritos em java com selenium que interage com a aba "Enter Vehicle Data" do site http://sampleapp.tricentis.com/101/app.php 
    
    |  |  |  |  |  |  |-- EnterProductDataSteps.java -- Passos escritos em java com selenium que interage com a aba "Enter Product Data" do site http://sampleapp.tricentis.com/101/app.php 
    
    |  |  |  |  |  |  |-- EnterVehicleDataSteps.java -- Passos escritos em java com selenium que interage com a aba "Enter Vehicle Data" do site http://sampleapp.tricentis.com/101/app.php 

    |  |  |  |  |  |  |-- SelectPriceOptionSteps.java -- Passos escritos em java com selenium que interage com a aba "Select Price Option" do site http://sampleapp.tricentis.com/101/app.php 

    |  |  |  |  |  |  |-- SendQuoteSteps.java -- Passos escritos em java com selenium que interage com a aba "Send Quote" do site http://sampleapp.tricentis.com/101/app.php 

    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test

    |  |-- resources

    |  |  |-- io

    |  |  |  |-- cucumber

    |  |  |  |  |-- projetoFinal

    |  |  |  |  |  |-- tricentisCase.feature -- Gherkin com os cenários de teste

  test.bat -- Arquivo para rodar teste no Windows
  
  test.sh -- Arquivo para rodar teste no Unix
```
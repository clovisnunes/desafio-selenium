# DESAFIO SELENIUM :heavy_check_mark:
Para o desafio a seguir, será utilizada a página http://the-internet.herokuapp.com/.
Deverá ser utilizado Java, Maven e Selenium, além de uma biblioteca para testes (recomenda-se
TestNg).
O código deverá ser lançado em um repositório Git para devida validação.
Serão avaliados os seguintes quesitos:
1. Estruturação do projeto (pageObjects, pageTasks); :heavy_check_mark:
2. Orientação a objetos; :heavy_check_mark:
3. Identação e clareza do código; :heavy_check_mark:
4. Correto uso dos padrões de escrita Java (camel case). :heavy_check_mark:

## Desafio 1: :heavy_check_mark:
1. Acessar a página: http://the-internet.herokuapp.com/;
2. Acessar o link "Add/Remove Elements";
3. Clicar no botão "Add Element";
4. Validar se o label do botão criado é "Delete".
* Extra: Colocar mensagem no assert informando que o texto está incorreto. :heavy_check_mark:

## Desafio 2: :heavy_check_mark:
Este desafio visa verificar se o candidato sabe utilizar a classe "Select".
1. Acessar a página: http://the-internet.herokuapp.com/;
2. Acessar o link "Dropdown";
3. Selecionar a opção 2.

## Desafio 3: :heavy_check_mark:
1. Acessar a página: http://the-internet.herokuapp.com/;
2. Acessar o link "Key Presses";
3. Informar um texto;
4. Validar que o sistema retorna a última tecla digitada no label que fica logo abaixo.
* Extra: Colocar uma validação dinâmica, utilizando manipulação de Strings, para que o teste
funcione com qualquer texto passado (exemplo: escrevo "teste" e o sistema retorna "You
entered: E"; escrevo selenium e o sistema retorna "You entered: M". :heavy_check_mark:

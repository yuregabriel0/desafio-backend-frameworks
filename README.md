# desafio-backend-frameworks

Repositório criado para a atividade prática da disciplina:Back-end Frameworks, onde o objetivo
foi realizar dois projetos back-end com frameworks diferentes e organizar
as camadas seguindo o padrão MVC.

## Comparação entre os frameworks

O Express é bem mais simples de configurar, com poucos arquivos e sem
burocracia. Já o Spring Boot exige mais configuração inicial, mas em
compensação oferece mais estrutura e recursos prontos para projetos maiores.

Na questão do código, o Express é bem enxuto dá pra criar uma rota
funcional em poucas linhas. O Spring Boot já é mais verboso por conta
das anotações do Java, mas isso também torna o código mais organizado
em projetos complexos.

Na gestão de dependências, o Node usa o npm com o package.json, que é
simples e direto. O Spring Boot usa o Maven com o pom.xml, que é mais
robusto mas também mais difícil de entender no início.


## Como as camadas se comunicam

A requisição chega pela camada de **Routes**, que direciona para o
**Controller**. O Controller processa a lógica e consulta o **Model**,
que representa os dados. A resposta segue o caminho até chegar ao cliente.

Esse esquema é o mesmo nos dois projetos, só muda a sintaxe de cada linguagem.

## Como rodar

**Node.js**
```bash
cd node-express
npm install
node index.js
```

**Java**
```bash
cd java-springboot
./mvnw spring-boot:run
```

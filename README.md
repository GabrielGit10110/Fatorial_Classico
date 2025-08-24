# 🧑‍🚀 Fatorial Classico
Algoritmo clássico para encontrar fatoriais utilizando recursão.

## 📝 Enunciado:
Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior

### ⚙️ Como compilar:
1. Transforme todos os arquivos.java em arquivos.class:
```bash
javac -s src -d dist src/controller/FatorialController.java src/view/Fatorial.java
```

2. Execute:
```bash
java -cp dist view.Fatorial
``` 

*@ Opcional - Compilação para jar:*
1. Crie um MANIFEST.txt e adicione o caminho correto para a classe Main:
```bash
touch MANIFEST.txt
echo 'Main-Class: view.Fatorial' > MANIFEST.txt
```

2. Faca a compilação para jar:
```bash
jar -cvfm Fatorial.jar MANIFEST.txt -C dist .
```

3. Execute o jar:
```bash
java -jar Fatorial.jar
```

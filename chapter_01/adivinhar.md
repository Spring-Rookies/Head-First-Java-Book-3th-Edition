
# O objetivo do exercício é tentar descobrir o que vai ocorrer nas seguintes linhas de código

## 🤔 ❓

### Criando variáveis size(int) e name(String)

```java
int size = 27; 
String name = "Fido";
```

### É criado uma nova instância do tipo Dog com as variáveis size(int) e name(String)

```java
Dog myDog = new Dog(name, size);
```

### Variáve x recebe size(27) - 5 == 22

```java
x = size - 5;
```

### Como x é igual a 22 e é maior que 15, portanto o dog não vai latir

```java
if (x < 15) myDog.bark(8);
```

### Como x é igual a 22 e é maior que 3, o dog vai jogar em loop infinito

```java
while (x > 3) {
  myDog.play();
}
```

### Array de inteiros com 4 elementos

```java
int[] numList = {2, 4, 6, 8};
```

### Vai ser printado no console a palavra Hello e Dog + a variável name(Fido)

```java
System.out.print("Hello");
System.out.print("Dog: " + name);
```

### Variável num do tipo String recebe um 8 e depois a variável z vai converter para int

```java
String num = "8";
int z = Integer.parseInt(num);
```

### A função readTheFile vai tentar ler o arquivo "myFile.txt", caso não exista vai lançar uma exceção

```java
try {
  readTheFile("myFile.txt");
} 
catch (FileNotFoundException ex) {
  System.out.print("File not found.");
}
```

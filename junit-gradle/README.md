# Testes unitários com JUnit

#### Respositório com roteiros e exemplos de como utilizar JUnit no seu dia a dia como dev.
#### _Fonte de estudo oferecido pela DIO:_ [JUnit](https://github.com/willyancaetano/junit5-exemplos?tab=readme-ov-file)

#


## Configurando JUnit

### Maven

Adicionar no `pom.xml` do projeto a dependência abaixo:

```xml
<dependency>  
 <groupId>org.junit.jupiter</groupId>  
 <artifactId>junit-jupiter-engine</artifactId>  
 <version>${junit.jupiter.version}</version>  
 <scope>test</scope>  
</dependency>
```
### Gradle

Adicionar ao arquivo `build.gradle`  `testImplementation` no closure `dependencies` e `useJUnitPlatform()` no closure `test`, ficando mais ou menos assim.

```groovy
dependencies {  
	//demais dependências do projeto
  testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.2'  
}  
  
test {  
  useJUnitPlatform()  
}
```

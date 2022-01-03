# DIO-Cognizant-OO-Bank-Java

### ABSTRAÇÃO
No caso como o domínio deixa claro que são transações no mesmo banco eu não criei a Classe Banco, apenas as classes Cliente e a classe abstrata Conta e suas respectivas 
subclasses ContaCorrente e ContaPoupanca;

### ENCAPSULAMENTO
No caso todos os atributos das classes estão com o modificador de acesso PRIVATE e não foram gerados métodos Set indiscriminadamente, a classe Conta é abstrata não podendo
assim ser instanciada e ela implementa a Interface OperacaoBancaria que serve como um contrato a ser seguido pela classe e suas subclasses;

### HERANÇA
Foi utilizada na classe Conta que optei por declará-la como abstrata evitando assim que ela seja instância e as classes ContaCorrente e ContaPoupanca estendem dessa classe;

### POLIMORFISMO
No caso utilizo essa técnica quando vou instanciar uma conta, pois ela é uma Conta porém no momento do instanciamento eu uso outra classe, no caso as classes ContaCorrente e
ContaPoupanca;

# Arquitetura Hexagonal/Ports and Adapters NA PRÁTICA

## Serviços

### [WireMock](https://wiremock.org/)
* [/address](https://address.mocklab.io/addressess/{zipCode})

### Mongo
* Acessar container via bash
```shell
> docker exec -it mongodb bash
```

* Acessar o mongo no bash
```shell
> mongosh "mongodb://root:example@localhost:27017/"
```
* Mostrar os databases
```shell
> show databases
```

* Acessar o database hexagonal
```shell
> use hexagonal
```

* Mostrar dados colletions
```shell
> db.customers.find()
```

### Postar Topics 
* name : tp-cpf-validated

* Utilizar o plugin Intellij: kafkalytic, publicar mensagem simples com o json

```json
{
    "id": "63835a3e7b391a3f1a6ff5f7",
    "name": "Silvana",
    "zipCode": "38400000",
    "cpf": "11111111111",
    "isValidCpf": true
}
```

### Colletion Postman

* arquitetura hexagonal-kafka
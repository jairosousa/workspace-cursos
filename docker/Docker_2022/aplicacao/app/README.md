# Comando Docker executados aplicação

## Escolhendo a imagem

* Escolher a imagem a ser executada a aplicação 'node:12-alpine'
* Criar o arquivo 'Dockerfile'

### Criando imagem

```
> docker build -t app .
```

### Verificar se foi criado a imagem
```
> docker images
REPOSITORY                   TAG         IMAGE ID       CREATED         SIZE
app                          latest      f3c43579a64e   4 months ago    91MB
```

### Criar Container com a imagem

### No modo interativo e com shell

```
> docker run -it app sh
/ #
```

```
/ # ls
bin    dev    etc    home   lib    media  mnt    opt    proc   root   run    sbin   srv    sys    tmp    usr    var
/ #
```
### Verificar se tem node instalado

```
/ # node --version
v12.22.12
/ #
```
### Sair

```
/ # exit
PS F:\workspace-cursos\docker\Docker_2022\aplicacao\app>
```

## Copiando arquivos na Imagem

* Editar o arquivo Docker file

```
FROM node:12-alpine

WORKDIR /app

COPY . .
``` 

### Montar novamente a imagem

```
> docker build -t app .
/ #
```

### Criar novamente o container no modo interativo e com shell

```
> docker run -it app sh
/app #
```

```
/app # ls
Dockerfile    README.md     package.json  spec          src           yarn.lock
/app #
```

## Utilizando o RUN

* Serve para instalar as dependências da aplicação

### Verificar se Python esta instalado

```
/app # python --version
sh: python: not found
/app #
```
* Não esta instalado

### Editar o arquivo Docker file

```
FROM node:12-alpine

WORKDIR /app

COPY . .

RUN apk add --no-cache python2 g++ make
``` 

### Montar novamente a imagem

```
> docker build -t app .
/ #
```

### Criar novamente o container no modo interativo e com shell

```
> docker run -it app sh
/app #
```

### Verificar novamente se Python esta instalado

```
/app # python --version
Python 2.7.18
/app #
```

* OK instalado

## Configurando Variáveis

## Comando ENV

* É utilizado quando a sua api tem dependencia com aoutras api como banco dados, URL etc...

Exemplo:

```
ENV API_URL=http://api.outraapi.com
```
Nesse caso api que estamos utilizando não precisa desse recurso.


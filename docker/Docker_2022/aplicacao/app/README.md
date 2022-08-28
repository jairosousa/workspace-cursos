# Comando Docker executados aplicação

## Escolhendo a imagem

* Escolher a imagem a ser executada a aplicação 'node:12-alpine'
* Criar o arquivo 'Dockerfile'

## Criando imagem

```
> docker build -t app .
```

### Verificar se foi criado a imagem
```
> docker images
REPOSITORY                   TAG         IMAGE ID       CREATED         SIZE
app                          latest      f3c43579a64e   4 months ago    91MB
```

## Criar Container com a imagem

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
### Verificar se tem node

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




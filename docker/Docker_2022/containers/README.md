# Containers

> comando remove todas as imagem não utilizadas
> 
> docker system prune -a ou --all

## Iniciar container

### Background
```
> docker run -d jnsousa/app:V1
```

### Nomeando Container
```
> docker run -d --name aplicacao1 jnsousa/app:V1
```

## Verificando o log de eventos

```
> docker logs --help
```

### Porta esposta

```
> docker logs -f c0b61
Using sqlite database at /etc/todos/todo.db
Listening on port 3000
```

### Ultimos linha de logs

```
> docker logs -n 10 c0b61
Using sqlite database at /etc/todos/todo.db
Listening on port 3000
```

### Logs completos

```
> docker logs c0b61
Using sqlite database at /etc/todos/todo.db
Listening on port 3000
```

### Timestamp

```
> docker logs -t c0b61
2022-09-02T18:34:43.347974500Z Using sqlite database at /etc/todos/todo.db
2022-09-02T18:34:43.373542600Z Listening on port 3000
```

## Publicando portas de acesso

### Mapeamento da porta

```
> docker run -d -p host:docker
> docker run -d -p 80:3000 --name aplicacao2 jnsousa/app:V1
```

## Executando comandos em containers

### Verificar o que tem diretorio home

```
> docker exec aplicacao2 ls
Dockerfile
README.md
img
node_modules
package.json
spec
src
yarn.lock
```

## Iniciando e parando containers

### Parando
```
> docker stop aplicacao2
aplicacao2
```

### Iniciando
```
> docker start aplicacao2
aplicacao2
```

## Removendo containers

### Com container parado

```
> docker stop 2efb3e
2efb3e
> docker rm 2efb3e
2efb3e
````

### Com container funcionando
```
> docker rm -f c0b6183
c0b6183
```

## Volumes persistentes

### Criar volume local

```
> docker volume create app-dados
app-dados
```

### Verificar o conteudo do volume 
```
> docker volume inspect app-dados
[
    {
        "CreatedAt": "2022-09-02T19:22:37Z",
        "Driver": "local",
        "Labels": {},
        "Mountpoint": "/var/lib/docker/volumes/app-dados/_data",
        "Name": "app-dados",
        "Options": {},
        "Scope": "local"
    }
]
```

### Associar o volume ao container

```
> docker run -d -p 3000:3000 --name applicacao3 -v app-dados:/app/dados jnsousa/app:V1
c6b4cec44cb993db6f8ee75b549753946fc1117fa9e56aaf26acaa3582821058
```

### Verificar se sub-diretorio 'dados' esta dentro container

```
> docker exec -it applicacao3 sh
/app # ls
Dockerfile    README.md     dados         img           node_modules  package.json  spec          src           yarn.lock
/app # cd dados/
/app/dados # ls
/app/dados #
```

### Criar arquivo dentro sub-diretorio dados

```
> echo hi docker > docker.txt
/app/dados # ls
docker.txt
/app/dados # cat docker.txt
hi docker
/app/dados #
```

### Remover o container

```
> docker rm -f applicacao3
applicacao3
```

### Criar novamente 

```
> docker run -d -p 3000:3000 --name aplicacaoNova -v app-dados:/app/dados jnsousa/app:V1
65028ece20233f2ee74b88f2a8706f7e9d8f4ca1526b5974dff47c6fcb01a0f6
```

```
> docker exec -it aplicacaoNova sh
/app # ls
Dockerfile    README.md     dados         img           node_modules  package.json  spec          src           yarn.lock
/app # cd dados/
/app/dados # ls
docker.txt
/app/dados # cat docker.txt
hi docker
/app/dados #
```

## Copiando arquivos do host para o container

### Container para root

* docker cp origem destino

```
> docker cp aplicacaoNova:/app/teste.txt .
```

```
> dir

    Diretório: F:\workspace-cursos\docker\Docker_2022

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----        22/08/2022     17:07                aplicacao
d-----        21/08/2022     12:05                arquivos
d-----        02/09/2022     15:16                containers
d-----        21/08/2022     10:15                imagem
d-----        21/08/2022     10:44                linux
-a----        21/08/2022     09:32             90 README.md
-a----        02/09/2022     16:48             10 teste.txt
```

### Root para Container

```
> docker cp jairo.txt aplicacaoNova:/app
```

```
> /app # ls
Dockerfile    img           package.json  teste.txt
README.md     jairo.txt     spec          yarn.lock
dados         node_modules  src
/app #  cat jairo.txt
hi docker
```

# Containrs

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

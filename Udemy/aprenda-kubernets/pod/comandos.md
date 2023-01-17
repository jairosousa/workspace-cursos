```
> kubectl.exe get nodes
```

Criar pod atraves do arquivo
```
> kubectl.exe apply -f .\pod.yaml
> pod/app-html created
```
 Visualizar os Pods

 ```
> kubectl.exe get pod
 ```

 excluir pod 
```
> kubectl.exe delete pod app-html
```

Cracteristicas do Nodes
```
> kubectl.exe describe node minikube
```

Deploy
```
> kubectl.exe apply -f .\pod-deployment.yml

```
```
kubectl.exe get deployment
```` 

```
kubectl.exe describe deployment app-html-deployment
```

Aumentar numero pods
```
kubectl.exe scale deployment app-html-deployment --replicas=5
```

Expondo um Deployment

```
kubectl.exe expose deployment app-html-deployment --type=LoadBalancer --name=app-html --port 80
```
Verificar os serviços criados
```
kubectl.exe get service
```
```
minikube service --url app-html
```
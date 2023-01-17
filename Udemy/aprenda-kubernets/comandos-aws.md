# AWS CLI

## Comandos EKS

### Verifica o status

```AWS
> aws eks --region us-east-1 describe-cluster --name kubernetes-lab --query cluster.status
``` 
### Trazer as configurações cluster aws para configurações local

```AWS
> aws eks --region us-east-1 update-kubeconfig --name kubernetes-lab
```
Caso de erro excluir o arquivo congig em C:\Users\jnsou\.kube\config

```
> kubectl get svc
```

### Verificar os Nodes

```
> kubectl get nodes --watch
```

# Aprender alguns comandos Linux

## Vamos criar um container com imagem do Ubuntu em modo interativo

```
docker run -it ubuntu
```

# Comandos básicos

## Verificar usuario
```
:/# whoami
root
````

## Enviar algo para tela
```
:/# echo hi
hi
```
## Verificar caminho
```
:/# echo $0
bash
```

## Verificar historico
```
:/# history
      1  ls
      2  clear
      3  whoami
      4  echo $0
      5  history
```

# Gerenciamento Aplicativos com apt (Package)

* Package - Software instalados no linux

## Listar os packges
```
:/# apt list
```

## Update
```
:/# apt update
```

## Arquivo de texto
```
:/# apt install nano
```
Editar/criar arquito
```
:/# nano texte.txt
```
* ^ - Siginifica a tecla CTRL
* ^o - Salvar
* ^x - Sair

## Remover pachage
```
:/# apt remove nano
```

# O Sistema de arquivos do linux
* /            –       Diretório raiz.
* /bin       –      Diretório onde estão os arquivos  executáveis e comandos essenciais do sistema.
* /boot     –      Diretório onde estão os arquivos necessários para iniciar o sistema. Aqui é onde fica localizada a imagem do Kernel do Linux.
* /dev       –      Diretório onde estão os arquivos de dispositivos do sistema, como discos, cd-roms, terminais etc.
* /etc         –      Diretório onde estão localizados os arquivos de configuração do sistema.
* /home     –     Diretório que geralmente é usado  pelos usuários.
* /lib          –      Diretório onde estão localizadas as bibliotecas essenciais ao sistema, utilizadas pelos programas em /bin e módulos do Kernel.
* /mnt         –     Diretório vazio. Este diretório geralmente é utilizado para pontos de montagem de dispositivos.
* /proc        –     Diretório que possui informações do Kernel e de processos.
* /opt          –     Diretório onde estão localizados os aplicativos instalados que não venham com o Linux.
* /root         –     Diretório do superusuários(root). Em algumas distribuições ele pode ou não estar presente.
* /sbin        –      Diretório onde estão os arquivos essenciais do sistema, como aplicativos, utilitários para administração do sistema. Normalmente só o superusuário(root) tem acesso aos arquivos.
* /tmp          –      Diretório de arquivos temporários.
* /usr           –      Diretório de arquivos pertencentes aos usuários e a segunda maior hierarquia de diretórios no Linux.
* /var           –       Diretório onde são guardadas informações variáveis ao sistema, como arquivos de logs etc…

# Navegando no Linux

* ls        -> lista tudo no diretorio
* ls -1     -> um a baixo do outro
* ls - l    -> informações de diretorio e arquivos
* pwd       -> caminho do diretorio
* cd /etc   -> Acessa diretório

# Criando arquivos e diretórios

## Ir para diretorio home dentro do root
```
:/# cd ~
:~# pwd
/root
```

## Criar diretório
```
:~/# mkdir jairo
ls
jairo
```

## Renomear diretório
```
:~/# mv jairo jairosousa
ls
jairosousa
```

## Criar arquivos
```
:~/jairosousa# touch jairo.txt
```

```
:~/jairosousa# touch hi1.txt hi2.txt hi3.txt
ls
hi1.txt  hi2.txt  hi3.txt  jairo.txt
```

33 Remover arquivos
```
:~/jairosousa# rm jairo.txt
```

```
:~/jairosousa# rm hi*
js

```
## Remover o diretorio com rm
```
:~/ rm -r jairosousa
```

# Editando Arquivos

## Nano

```
:~/# nano jairo.txt
```
ctrl + o -> Savar arquivo
ctrl + x -> Sair arquivo

## Cat
* Visualizar o conteúdo do arquivo
```
:~# cat jairo.txt
Ola
Estamos aqui
```

```
:~# cat /etc/debconf.conf
```
## More
* Mostra 25% do conteudo dos arquivos por vez
```
:~# more /etc/debconf.conf
# Not world readable (the default), and accepts only passwords.
Name: passwords
Driver: File
--More--(26%)
```
precione a barra de espaço para mostrar o restante


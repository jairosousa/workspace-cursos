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

# Redirecionando no Linux

## Duplicar arquivos
### cat
```
:~# cat jairo.txt > teste.txt
```

```
~# ls
jairo.txt  teste.txt
```

```
:~# cat jairo.txt teste.txt > file.txt
```
```
:~# ls
file.txt  jairo.txt  teste.txt
```

```
:~# cat file.txt
Ola
Estamos aqui
Ola
Estamos aqui
```

### echo

```
:~# echo hi docker > docker.txt
:~# ls
docker.txt  file.txt  jairo.txt  teste.txt
:~# cat docker.txt
hi docker
```

# Utilizando GREP

* Serve para localizar conteúdos dentro de arquivos.

```
:~# grep Ola jairo.txt
Ola
```
```
grep Ola jairo.txt docker.txt
jairo.txt:Ola
```
```
:~# grep aqui teste.txt jairo.txt
teste.txt:Estamos aqui
jairo.txt:Estamos aqui
```

```
:~# grep -i -r ola .
./teste.txt:Ola
./file.txt:Ola
./file.txt:Ola
./jairo.txt:Ola
```

# Utilizando o FIND

* Serve para localizar arquivos dentro de diretórios

```
:~# find
.
./.profile
./.bashrc
./teste.txt
./file.txt
./jairo.txt
./.local
./.local/share
./.local/share/nano
./docker.txt
```

```
c:~# find /etc/kernel
/etc/kernel
/etc/kernel/postinst.d
```
## Mostrar somente arquivos
```
 :~# find -type f
./.profile
./.bashrc
./teste.txt
./file.txt
./jairo.txt
./docker.txt
```

## Mostrar somente diretorios
```
 :~# find -type d
.
./.local
./.local/share
./.local/share/nano
```

## Nome especifico
```
:~# find -type f -name "docker.txt"
./docker.txt
```
```
:~# find -type f -name "ja*"
./jairo.txt
```

# Executando multiplos comandos
```
:~# mkdir teste; cd teste; echo ok
ok
```

# Gerenciando processos

## Verificar os processos

```
:~# ps
  PID TTY          TIME CMD
    1 pts/0    00:00:00 bash
   45 pts/0    00:00:00 ps
```

## Matar processo comando kill
```
kill <ID processo>
```
```
:~# sleep 500 &
[1] 46
root@5caba9c332bc:~# ps
  PID TTY          TIME CMD
    1 pts/0    00:00:00 bash
   46 pts/0    00:00:00 sleep
   47 pts/0    00:00:00 ps
root@5caba9c332bc:~# kill 46
root@5caba9c332bc:~# ps
  PID TTY          TIME CMD
    1 pts/0    00:00:00 bash
   48 pts/0    00:00:00 ps
[1]+  Terminated              sleep 500
```

# Gerenciando usuários

## Verificar usuario atual
```
root@5caba9c332bc:~# whoami
root
```

## Adicionar novo usuario
```
useradd
Usage: useradd [options] LOGIN
       useradd -D
       useradd -D [options]

Options:
      --badnames                do not check for bad names
  -b, --base-dir BASE_DIR       base directory for the home directory of the
                                new account
      --btrfs-subvolume-home    use BTRFS subvolume for home directory
  -c, --comment COMMENT         GECOS field of the new account
  -d, --home-dir HOME_DIR       home directory of the new account
  ...
```

```
root@5caba9c332bc:~# useradd -m jairo
```
## Verificar se foi criado ususario

```
root@5caba9c332bc:~# cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
jairo:x:1000:1000::/home/jairo:/bin/sh <------Aqui está------>
```

## Logar com novo usuario

* Abra novo terminal

```
C:\Users\jnsou> docker exec -it -u jairo 5caba9c332bc bash
jairo@5caba9c332bc:/$
```
* Tente acessar pasta se pode acessar usuario root
```
jairo@5caba9c332bc:/$ cat /etc/shadow
cat: /etc/shadow: Permission denied
```
```
root@5caba9c332bc:~# cat /etc/shadow
root:*:19205:0:99999:7:::
daemon:*:19205:0:99999:7:::
bin:*:19205:0:99999:7:::
sys:*:19205:0:99999:7:::
sync:*:19205:0:99999:7:::
games:*:19205:0:99999:7:::
man:*:19205:0:99999:7:::
lp:*:19205:0:99999:7:::
mail:*:19205:0:99999:7:::
news:*:19205:0:99999:7:::
uucp:*:19205:0:99999:7:::
proxy:*:19205:0:99999:7:::
www-data:*:19205:0:99999:7:::
backup:*:19205:0:99999:7:::
list:*:19205:0:99999:7:::
irc:*:19205:0:99999:7:::
gnats:*:19205:0:99999:7:::
nobody:*:19205:0:99999:7:::
_apt:*:19205:0:99999:7:::
jairo:!:19226:0:99999:7:::
```

# Gerenciando grupos

## Lista de grupos

```
root@5caba9c332bc:~# cat /etc/group
root:x:0:
daemon:x:1:
bin:x:2:
sys:x:3:
...
```

## Verificar os grupos do usuario

```
root@5caba9c332bc:~# groups jairo
jairo : jairo
```
* Nesse caso só tem u grupo primario 'jairo' para usuario jairo

## Criar grupo

```
root@5caba9c332bc:~# groupadd docker
root@5caba9c332bc:~# cat /etc/group
...
jairo:x:1000:
docker:x:1001:
```
## Adicionar usuario ao um grupo

```
root@5caba9c332bc:~# usermod -G docker jairo
root@5caba9c332bc:~# groups jairo
jairo : jairo docker
```

# Permissões de Arquivos

## Verificar as permissões
```
root@5caba9c332bc:~# ls -l
total 20
-rw-r--r-- 1 root root   10 Aug 22 17:58 docker.txt
-rw-r--r-- 1 root root   34 Aug 22 17:54 file.txt
-rw-r--r-- 1 root root   17 Aug 21 14:57 jairo.txt
drwxr-xr-x 2 root root 4096 Aug 22 18:18 teste
-rw-r--r-- 1 root root   17 Aug 22 17:53 teste.txt
```

-/d indica:
- File
d diretorio

1° rw- são as permissões do usuario
r read
w escrita
x executar (for programa)

2° r- são as permissões do grupo
r read

3° r- são as permissões Everyuone(qualquer um)
r read

## Trocar permissão

```
chmod u+x docker.txt
root@5caba9c332bc:~# ls -l
total 20
-rwxr--r-- 1 root root   10 Aug 22 17:58 docker.txt
-rw-r--r-- 1 root root   34 Aug 22 17:54 file.txt
-rw-r--r-- 1 root root   17 Aug 21 14:57 jairo.txt
drwxr-xr-x 2 root root 4096 Aug 22 18:18 teste
-rw-r--r-- 1 root root   17 Aug 22 17:53 teste.txt
```
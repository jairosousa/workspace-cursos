nota1 = 7
nota2 = 6.5
nota3 = 8

media = (nota1 + nota2 + nota3) / 3

if (media >= 7):
    print("Aprovado")
elif (media >= 5) and (media < 7):
    print("Recuperação")
else:
    print("Reprovado")

print("Sua média é: " + str(media))

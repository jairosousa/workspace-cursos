from calculo import Calculo


def main():
    print(
        """
        Esta aplicação tem como finalidade demonstrar os valores que serão gastos
        com combustível durante uma viagem, com base no consumo do seu veículo, e
        com a distância determinada por você!
        """
    )

    print("Os combustíveis disponíveis para este cálculo são:")
    print("    ° Álcool")
    print("    ° Díesel")
    print("    ° Gasolina")

    print(" ")

    try:
        distancia = float(input("Distância em Quilômetros a ser percorrida\n"))
        consumo = float(input("Consumo de combustível do veículo (Km/l)\n"))
        calculo = Calculo()
        print(
            calculo.calcular_gasto(distancia, consumo)
        )
    except ValueError as erro:
        print("o valor recebido não é válido")

if __name__ == "__main__":
    main()

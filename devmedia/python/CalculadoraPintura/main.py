from calculadora import Calculadora
from comodo import Comodo

calc = Calculadora()

# calc.area_parede: float = (2 * (largura + profundidade) * altura)

comodo = Comodo(input('Qual a largura do cômodo: '), input('Qual a profundidade do cômodo: '))

print(
    "Área da parede é:",
    calc.calcular_area_paredes(comodo)
)

print(
    'Area do teto é:',
    calc.calcular_area_teto(comodo)
)

print(
    'A litragem de tinta necessária é:',
    calc.calcular_litragem_tinta_necessaria(),
    'l'
)

#language: pt

Funcionalidade: Preencher cadastro do site Tricentis completo
  
  Esquema do Cenario: Preecher aba Enter Vehicle Data
    Dado que eu estou no site Tricentis
    E seleciono a <marca> do campo Make
    E seleciono o <modelo> do campo Model
    E digito os <cilindros> entre 1 e 2000 no campo Cylinder Capacity [ccm]
    E digito <performance> entre 1 e 2000 no campo Engine Performance [kW]
    E digito a <data> no campo Date of Manufacture
    E seleciono o <carro> no campo Number of Seats do carro de 1 a 9
    E seleciono a opcao Yes no campo Right Hand Drive
    E seleciono a <moto> no campo Number of Seats da moto de 1 a 3
    E seleciono o <combustivel> no campo Fuel Type
    E digito a <carga> 1 e 1000 no campo Payload [kg]
    E digito a <peso> 100 e 50000 no campo Total Weight [kg]
    E digito o <preco> entre 500 e 100000 no campo List Price [$]
    E digito a <placa> no campo License Plate Number
    E digito a <milhagem> entre 100 e 100000 no campo Annual Mileage [mi]
    E clico no botao next para avancar de aba
    Entao devo ver o primeiro campo "First Name" 
    Exemplos:
      |marca|modelo |cilindros|performance|data      |carro|moto|combustivel|carga|peso|preco|placa|milhagem|
      |BMW  |Moped  |500      |1000       |03/08/2020|6    |2   |Diesel     |700  |200 |550  |cpm22|600     |

      



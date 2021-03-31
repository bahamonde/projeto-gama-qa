#language: pt

Funcionalidade: Preencher cadastro do site Tricentis completo

  Cenario: Preecher aba Enter Vehicle Data
    Dado que eu estou no site Tricentis
    E seleciono a <marca> do campo Make
    E digito <performance> entre 1 e 2000 no campo Engine Performance [kW]
    E digito <data> no campo Date of Manufacture
    E seleciono o <assentos> no campo Number of Seats
    E seleciono o <combustivel> no campo Fuel Type
    E digito o <preco> entre 500 e 100000 no campo List Price [$]
    E digito a <placa> no campo License Plate Number
    E digito a <milhagem> entre 100 e 100000 no campo Annual Mileage [mi]
    E clico no botão next para avancar de aba
    Entao devo ver o primeiro campo "First Name" 
    Exemplos:
      |marca|
      |BMW  |

      



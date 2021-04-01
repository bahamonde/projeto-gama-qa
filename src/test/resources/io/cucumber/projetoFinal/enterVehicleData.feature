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
    E seleciono a opcao No no campo Right Hand Drive
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

 
  Esquema do Cenario: Preecher aba Enter Insurant Data
    E digito <nome> no campo First Name
    E digito <sobrenome> no campo Last Name
    E digito <data> no campo Date of Birth
    E seleciono a opcao Female no campo Gender
    E digito <endereco> no campo Street Address
    E seleciono <pais> no campo Country
    E digito <cep> no campo Street Zip Code
    E digito <cidade> no campo City
    E seleciono <ocupacao> no campo Occupation
    E marco Bungee Jumping e Skydiving no campo Hobbies
    E digito <site> no campo Website
    E clico no botao next para para a proxima aba
    Entao devo ver o campo "Start Date"
    Exemplos:
      |nome  |sobrenome|data      |endereco  |pais  |cep     |cidade   |ocupacao|site                |                                  
      |Aline |Sena     |11/03/1990|Rua Flores|Brazil|05578201|São Paulo|Employee|linkedin.com/in/sena|


  Esquema do Cenario: Preecher aba Enter Product Data
    E digito <data> no campo Start Date
    E seleciono <valor> no campo Insurance Sum [$]
    E seleciono <bonus> no campo Merit Rating
    E seleciono <seguro> no campo Damage Insurance
    E marco Bungee Euro Protection no campo Optional Products
    E seleciono <cortesia> no campo Courtesy Car
    E clico no botao next
    Entao devo ver o campo a seguir "Price per Year ($)"
    Exemplos:
      |data      |valor        |bonus  |seguro       |cortesia  |                            
      |11/03/2022|25.000.000,00|Bonus 8|Full Coverage|Yes       |
      

  Cenario: Preecher aba Select Price Option
    E marco a opcao Platinum no campo Select Option
    E clico em next
    Entao devo ver o proximo campo "E-Mail"

  
  Esquema do Cenario: Preecher aba Enter Product Data
    E digito <email> no campo E-Mail
    E digito <fone> no campo Phone
    E digito <user> no campo Username
    E digito <senha> no campo Password
    E digito <confirma> no campo Confirm Password
    E digito <comentario> no campo Comments
    E clico no botao Send
    Entao devo ver a mensagem "Sending e-mail success!"





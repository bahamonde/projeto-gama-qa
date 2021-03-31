
#language: pt
@ignore
Funcionalidade: teste

    Esquema do Cenario: Preecher aba Enter Insurant Data
        E digito <nome> no campo First Name
        E digito <sobrenome> no campo Last Name
        E digito <data> no campo Date of Birth
        E seleciono a opcao Male no campo Gender'
        E digito <endereco> no campo Street Address
        E seleciono a <pais> no campo Country
        E digito <cep> no campo Street Zip Code
        E digito <cidade> no campo City
        E seleciono <ocupacao> no campo Occupation
        E marco <hobbies> no campo Hobbies
        E digito <site> no campo Website
        E envio uma foto no campo Picture
        E clico no botao next para avancar de aba
        Entao devo ver o primeiro campo "xx"
        Exemplos:
        |nome  |sobrenome|data      |endereco  |pais  |cep     |ocupacao|hobbies  |site                |
        |Aline |Sena     |11/03/1990|Rua Flores|Brazil|05578201|Employee|Speeding |linkedin.com/in/sena|
                                                                    

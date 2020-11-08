# bancoApi

Simples aplicação de banco:

1 - Cadastrar uma pessoa faz criar automaticamente uma conta bancária.
2 - Possivel cadastrar PF ou PJ

Métodos:

http://localhost:8080/pessoa/cadastrar
JSON - 
{
    "nome_pessoa": "Mathias",
    "tipo_pessoa": "PF",
    "documento": "1234567891002",
    "agencia": "123456"
}

http://localhost:8080/pessoa/listar
JSON Resposta:
[
   {
        "id": 1,
        "nome": "Mathias",
        "tipoPessoa": "Pessoa Jurídica",
        "documento": "1234567891002",
        "score": 2
    }
]

http://localhost:8080/conta/listar
JSON Resposta:
[
   {
        "idConta": 7,
        "numConta": 874020,
        "agencia": "123456",
        "tipo": "Conta Empresarial",
        "cartao": "Limite de R$ 200,00",
        "cheque": "Limite de R$ 1000,00"
    }
]



## Ignição Spring REST
Uma API Rest desenvolvida com Spring e banco de dados MySQL

## Tecnologias Utilizadas
- Spring Framework
- Flayway

## Entidades do Sistema
- Veículo
- Autuação
- Proprietario

## Diagrama de classes
![transito-api UML](https://github.com/GuilhermeBrag/transito-api/assets/117501938/102260d3-6cc5-433a-b71c-ee00c19b315c)

## API transito
Versao: v0.1.0

## Métodos GET
1. Listar Autuações
2. Listar Proprietarios
3. Listar Veículos
4. Buscar Proprietarios
5. Buscar Veículos

## Métodos POST
1. Adicionar Autuações
2. Adicionar Proprietarios
3. Adicionar Veículos

## Método PUT
1. Atualizar Proprietarios
2. Apreender Veículos

## Método DELETE
1. Deletar Proprietarios
2. Remover Apreensão Veículo

## Listar Autuações
Método: GET <a href="https://www.exemplo.com" style="color: blue;">localhost:8080/veiculos/{veiculoId}/autuacoes</a>

## Parâmetros

<body>
    <table>
        <tr>
            <td>Parâmetro </td>
            <td>tipo </td>
        </tr>
        <tr>
            <td>veiculoId</td>
            <td>numeral</td>
        </tr>
    </table>
</body>
</html>

### Responses
#### Status 200 - Um array de Autuações
Exemplo de resposta do Servidor

![image](https://github.com/GuilhermeBrag/transito-api/assets/117501938/0e0f6b9e-a0bd-4e85-b9b4-32db1131f5c0)

## Buscar Proprietarios
Método: GET <a href="https://www.exemplo.com" style="color: blue;">localhost:8080/proprietarios/{proprietarioId}</a>

## Parâmetros

<body>
    <table>
        <tr>
            <td>Parâmetro </td>
            <td>tipo </td>
        </tr>
        <tr>
            <td>clienteId</td>
            <td>numeral</td>
        </tr>
    </table>
</body>
</html>

### Responses
#### Status 200 - Um Objeto Proprietario
Exemplo de resposta do Servidor

![image](https://github.com/GuilhermeBrag/transito-api/assets/117501938/c6ba8ecb-d1b5-4d73-be71-f22fd36f4b57)








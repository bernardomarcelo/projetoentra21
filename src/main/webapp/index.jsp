<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8" />
    <title>Enviar Depoimento</title>
</head>
<body>
    <h1>Enviar Depoimento</h1>
    <form method="post" action="/depoimento">
        <label for="avaliacaoId">ID da Avaliação:</label><br />
        <input type="text" id="avaliacaoId" name="avaliacaoId" value="1" required /><br /><br />
        
        <label for="conteudo">Conteúdo do Depoimento:</label><br />
        <textarea id="conteudo" name="conteudo" rows="5" cols="40" required></textarea><br /><br />
        
        <button type="submit">Enviar Depoimento</button>
    </form>
</body>
</html>

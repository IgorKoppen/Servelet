<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Usuario</title>
</head>
<body>
     Novo Usuario:
     <br>
     <br>
     <form action="/SimuladorCRUD/novoUsuario" method="post">
     <label for="nome">Nome</label> <br> <input type="text" name="nome"> <br>
        <label for="senha">Senha</label> <br> <input type="text" name="senha"> <br>
           <label for="email">Email</label> <br> <input type="text" name="email"> <br>
              <label for="telefone">Telefone</label> <br> <input type="text" name="telefone">
               <br><br>
               <input type="submit" name="Enviar" value="Enviar">
                <input type="reset" name="limpar" value="limpar">
     </form>
</body>
</html>
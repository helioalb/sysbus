<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carro</title>
    </head>
    <body>
        <form name="cadastroCarro" action="CarroServlet" method="post">
            Código: <input type="text" name="codigoCarro" value="${CarroEdicao.codigoCarro}"/><br/>
            Número de passageiros: <input type="text" name="numeroDePassageiros" value="${CarroEdicao.numeroDePassageiros}"/><br/>
            
            Linha: <select name="linhaCarro">
                <c:forEach var="linhas" items="${Linhas}">
                    <option value ="<c:out value="${linhas.codigoLinha}"/>"><c:out value="${linhas.nomeLinha}"/></option>
                </c:forEach>
            </select>
            <input type="submit" value="Salvar"/>
        </form>

                <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Numero de Passageiros</th>
                    <th>Linha do Carro</th>
                    <th>Editar</th>
                    <th>Excluir</th>
                </tr>
            </thead>
            <tbody>                
                <c:forEach var="carros" items="${Carros}">
                <tr>
                    <td><c:out value="${carros.codigoCarro}"/></td>
                    <td><c:out value="${carros.numeroDePassageiros}"/></td>
                    <td><c:out value="${carros.nomeLinha}"/></td>
                    <td><a href="CarroServlet?op=editar&id=<c:out value="${carros.codigoCarro}"/>">Editar</a></td>
                    <td><a href="CarroServlet?op=excluir&id=<c:out value="${carros.codigoCarro}"/>">Excluir</a></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        <!-- Tentar fazer essa chamada no servlet de forma mais inteligente-->
        <a href="/SysBus/index.jsp">Página Inicial</a>
    </body>
</html>
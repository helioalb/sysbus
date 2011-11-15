<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel=StyleSheet href="estilo.css" type="text/css" media=screen/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SysBus: Gerenciamento de demandas</title>
    </head>
    <body>
        <div id="titulo">
            <p>SysBus: Gerenciamento de demandas</p>
        </div>
        <jsp:include page="menu.html" flush="true"/>
        <div id="form">
            <p>Inserção/Atualização</p>
            <form name="cadastroDemanda" action="DemandaServlet" method="post">
                <label>Nome:</label><br/><input type="text" name="nomeDemanda"/><br/><br/>
                <div>
                    <table border="1">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Início do Período</th>
                                <th>Fim do Período</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="periodos" items="${Periodos}">
                                <tr>
                                    <td><input type="checkbox" name="periodo" value="${periodos.codigoPeriodo}"/></td>
                                    <td>${periodos.inicioPeriodo}</td>
                                    <td>${periodos.fimPeriodo}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
                <input type="submit" value="Salvar"/>
            </form>
        </div>
        <div id="tabela">
            <p>Demandas existentes</p>
            <table>
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Editar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>
                <tbody>                
                    <c:forEach var="demandas" items="${Demandas}">
                        <tr>
                            <td><c:out value="${demandas.codigoDemanda}"/></td>
                            <td><c:out value="${demandas.nomeDemanda}"/></td>
                            <td>TODO</td>
                            <td>TODO</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

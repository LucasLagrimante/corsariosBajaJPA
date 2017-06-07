<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cadastrar Competi��o</title>
        <link rel="shortcut icon" href="images/favicon.ico">
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <!--Import jQuery before materialize.js-->
        <script src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <!-- Dropdown Structure -->
        <ul id="menuCadastro" class="dropdown-content">
            <li><a class="brown-text text-darken-4" href="ManterAutomovelController?acao=prepararOperacao&operacao=incluir">Autom�vel</a></li>
            <li><a class="brown-text text-darken-4" href="ManterArquiteturaController?acao=prepararOperacao&operacao=incluir">Arquitetura</a></li>
            <li><a class="brown-text text-darken-4" href="ManterAvaliacaoController?acao=prepararOperacao&operacao=incluir">Avalia��o</a></li>
            <li><a class="brown-text text-darken-4" href="ManterCompeticaoController?acao=prepararOperacao&operacao=incluir">Competi��o</a></li>
            <li><a class="brown-text text-darken-4" href="ManterDesempenhoController?acao=prepararOperacao&operacao=incluir">Desempenho de Competic�o</a></li>
            <li><a class="brown-text text-darken-4" href="ManterDesempenhotesteController?acao=prepararOperacao&operacao=incluir">Desempenho de Teste</a></li>
            <li><a class="brown-text text-darken-4" href="ManterDesignController?acao=prepararOperacao&operacao=incluir">Design</a></li>
            <li><a class="brown-text text-darken-4" href="ManterFrequenciaController?acao=prepararOperacao&operacao=incluir">Frequ�ncia</a></li>
            <li><a class="brown-text text-darken-4" href="ManterIntegranteController?acao=prepararOperacao&operacao=incluir">Integrante</a></li>
            <li><a class="brown-text text-darken-4" href="ManterPecaController?acao=prepararOperacao&operacao=incluir">Pe�a</a></li>
            <li><a class="brown-text text-darken-4" href="ManterPessoaController?acao=prepararOperacao&operacao=incluir">Pessoa</a></li>
            <li><a class="brown-text text-darken-4" href="ManterTipopecaController?acao=prepararOperacao&operacao=incluir">Tipo de Pe�a</a></li>
            <li><a class="brown-text text-darken-4" href="ManterTipopistaController?acao=prepararOperacao&operacao=incluir">Tipo de Pista</a></li>
        </ul>
        <ul id="menuPesquisa" class="dropdown-content">
            <li><a class="brown-text text-darken-4" href="PesquisarAutomovelController">Autom�vel</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarArquiteturaController">Arquitetura</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarAvaliacaoController">Avalia��o</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarCompeticaoController">Competi��o</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarDesempenhoController">Desempenho de Competic�o</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarDesempenhotesteController">Desempenho de Teste</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarDesignController">Design</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarFrequenciaController">Frequ�ncia</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarIntegranteController">Integrante</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarPecaController">Pe�a</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarPessoaController">Pessoa</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarTipopecaController">Tipo de Pe�a</a></li>
            <li><a class="brown-text text-darken-4" href="PesquisarTipopistaController">Tipo de Pista</a></li>
        </ul>
        <nav>
            <div class="nav-wrapper brown darken-4">
                <a href="#!" class="brand-logo"><i class="material-icons">high_quality</i>Corrida Baja - Equipe Cors�rios</a>
                <ul class="right hide-on-med-and-down">
                    <!-- Dropdown Trigger -->
                    <li><a href="index.jsp">In�cio</a></li>
                    <li><a href="relatorios.jsp">Relat�rios</a></li>
                    <li><a class="dropdown-button" href="#!" data-activates="menuCadastro">Cadastro<i class="material-icons right">arrow_drop_down</i></a></li>
                    <li><a class="dropdown-button" href="#!" data-activates="menuPesquisa">Pesquisa<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <h3 align="center">${operacao} Competi��o</h3>
            <form  action="ManterCompeticaoController?acao=confirmarOperacao&operacao=${operacao}" method="POST" name="frmManterCompeticao">
                <div class="row">
                    <div class="input-field col s6 offset-m3">
                        <input name="txtIdCompeticao" type="text" required="required" pattern="[0-9]+$" class="validate" value="${competicao.idCompeticao}" <c:if test="${operacao != 'incluir'}"> readonly</c:if>>
                            <label data-error="errado" data-success="certo" for="id">ID</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s6 offset-m3">
                            <input id="nome" name="txtNome" type="text" value="${competicao.nome}" required="required" <c:if test="${operacao == 'excluir'}"> readonly</c:if>>      
                            <label for="nome">Nome</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s6 offset-m3">
                            <input id="data" name="txtData" type="text" class="datepicker" value="${competicao.data}" required="required" <c:if test="${operacao == 'excluir'}"> disabled</c:if>>
                            <label for="data">Data</label>
                        </div>
                    </div>


                    <div class="row">
                        <div class="input-field col s6 offset-m3">
                            <input id="hora" name="txtHora" value="${competicao.hora}" class="validate" required="required" type="text" required="required" maxlength="8" pattern="^(?:(?:([01]?\d|2[0-3]):)?([0-5]?\d):)?([0-5]?\d)$" <c:if test="${operacao == 'excluir'}"> readonly</c:if>>
                            <label data-error="errado" data-success="certo" for="hora">Hora</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s6 offset-m3">
                            <input id="local" name="txtLocal" required="required" type="text" value="${competicao.local}" <c:if test="${operacao == 'excluir'}"> readonly</c:if>>      
                            <label for="local">Local</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s6 offset-m3">
                        <c:if test="${operacao == 'excluir'}"><input type="hidden" name="selectTipopista" value="${competicao.FKtipopista.idTipopista}"></c:if>
                        <select id="tipopista" name="selectTipopista" required="required"<c:if test="${operacao == 'excluir'}"> disabled</c:if>>   
                            <c:forEach items="${tipospista}" var="tipopista">
                                <option value="${tipopista.idTipopista}" <c:if test="${competicao.FKtipopista.idTipopista == tipopista.idTipopista}"> selected</c:if>> ${tipopista.nome} </option>
                            </c:forEach>
                        </select>
                        <label for="tipopista">Tipo Pista</label>
                    </div>
                </div>

                <div class="row">
                    <div class="col s12 center-align">
                        <a class="waves-effect waves-light btn brown darken-4" id="cadastrarTipopista">Cadastrar Tipos de Pista</a>
                        <button class="btn waves-effect waves-light brown darken-4" type="submit" value="Confirmar">
                            Confirmar <i class="material-icons right">send</i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        $('select').material_select();

        $('body').css('background-image', "url('images/fundo.png')");

        $('.dropdown-button').dropdown({
            constrainWidth: false, // Does not change width of dropdown to that of the activator
            hover: true // Activate on hover
        });

        $('.datepicker').pickadate({
            closeOnClear: true,
            closeOnSelect: true,
            today: 'Hoje',
            clear: 'Limpar',
            close: 'Fechar',
            labelMonthNext: 'Pr�ximo m�s',
            labelMonthPrev: 'M�s Anterior',
            labelMonthSelect: 'Selecionar um m�s',
            labelYearSelect: 'Selecionar um ano',
            monthsFull: ['Janeiro', 'Fevereiro', 'Mar�o', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
            monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
            weekdaysFull: ['Domingo', 'Segunda', 'Ter�a', 'Quarta', 'Quinta', 'Sexta', 'S�bado'],
            weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
            weekdaysLetter: ['D', 'S', 'T', 'Q', 'Q', 'S', 'S'],
            selectMonths: true, // Creates a dropdown to control month
            selectYears: 15 // Creates a dropdown of 15 years to control year
        });

        $("#cadastrarTipopista").click(function () {
            window.location.href = 'http://localhost:8080/corsariosBajaJPA/ManterTipopistaController?acao=prepararOperacao&operacao=incluir';
        });
    });
</script>
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Como rol administrador quiero ingresar al login de argenprop",
  "description": "",
  "id": "como-rol-administrador-quiero-ingresar-al-login-de-argenprop",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7024364981,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Ingresar a login",
  "description": "",
  "id": "como-rol-administrador-quiero-ingresar-al-login-de-argenprop;ingresar-a-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Ingreso al sitio web de argenprop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Ingreso mis credentiales",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Carga sastifactoriamente la pantalla login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.ingreso_al_sitio_web_de_argenprop()"
});
formatter.result({
  "duration": 7813094567,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.ingreso_mis_credentiales()"
});
formatter.result({
  "duration": 1904821701,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.carga_sastifactoriamente_la_pantalla_login()"
});
formatter.result({
  "duration": 848028486,
  "status": "passed"
});
formatter.after({
  "duration": 1799080209,
  "status": "passed"
});
});
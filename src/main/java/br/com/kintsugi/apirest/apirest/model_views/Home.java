package br.com.kintsugi.apirest.apirest.model_views;

public class Home {
  public String getMensagem(){
    return "Bem vindo a minha primeira API";
  }

  public String getDocumentacaoUI(){
    return "/swagger-ui/index.html";
  }

  public String getDocumentacaoJson(){
    return "/api-docs";
  }

  public String getGerarAdmInicial(){
    return "/gerar-adm";
  }
}

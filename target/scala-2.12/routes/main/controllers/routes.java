// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jcosta/eclipse-workspace/play-tarefas/conf/routes
// @DATE:Mon Jul 09 11:16:40 GMT-03:00 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseServico Servico = new controllers.ReverseServico(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseServico Servico = new controllers.javascript.ReverseServico(RoutesPrefix.byNamePrefix());
  }

}

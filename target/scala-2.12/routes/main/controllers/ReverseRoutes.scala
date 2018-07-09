// @GENERATOR:play-routes-compiler
// @SOURCE:C:/wkp_play/tarefas/conf/routes
// @DATE:Mon Jul 09 08:44:25 GMT-03:00 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tarefas")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseServico(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def atualizar(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tarefas/atualizar")
    }
  
    // @LINE:10
    def adicionar(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tarefas/adicionar")
    }
  
    // @LINE:11
    def pesquisar(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tarefas/pesquisar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def listar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tarefas/listar")
    }
  
    // @LINE:7
    def excluir(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "tarefas/excluir/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}

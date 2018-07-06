// @GENERATOR:play-routes-compiler
// @SOURCE:C:/wkp_play/tarefas/conf/routes
// @DATE:Fri Jul 06 09:24:16 GMT-03:00 2018

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

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
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

  
    // @LINE:7
    def excluir(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "tarefas/excluir/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def listar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tarefas/listar")
    }
  
    // @LINE:8
    def completar(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tarefas/completar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def adicionar(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "tarefas/adicionar")
    }
  
  }


}

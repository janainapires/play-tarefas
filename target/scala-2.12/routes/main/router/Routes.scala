// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jcosta/eclipse-workspace/play-tarefas/conf/routes
// @DATE:Mon Jul 09 11:16:40 GMT-03:00 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  Servico_2: controllers.Servico,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    Servico_2: controllers.Servico,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Servico_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Servico_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas""", """controllers.HomeController.index()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas/excluir/""" + "$" + """id<[^/]+>""", """controllers.Servico.excluir(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas/atualizar""", """controllers.Servico.atualizar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas/listar""", """controllers.Servico.listar()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas/adicionar""", """controllers.Servico.adicionar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tarefas/pesquisar/""" + "$" + """id<[^/]+>""", """controllers.Servico.pesquisar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas")))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """tarefas""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Servico_excluir1_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas/excluir/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Servico_excluir1_invoker = createInvoker(
    Servico_2.excluir(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Servico",
      "excluir",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tarefas/excluir/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Servico_atualizar2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas/atualizar")))
  )
  private[this] lazy val controllers_Servico_atualizar2_invoker = createInvoker(
    Servico_2.atualizar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Servico",
      "atualizar",
      Nil,
      "POST",
      this.prefix + """tarefas/atualizar""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Servico_listar3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas/listar")))
  )
  private[this] lazy val controllers_Servico_listar3_invoker = createInvoker(
    Servico_2.listar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Servico",
      "listar",
      Nil,
      "GET",
      this.prefix + """tarefas/listar""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Servico_adicionar4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas/adicionar")))
  )
  private[this] lazy val controllers_Servico_adicionar4_invoker = createInvoker(
    Servico_2.adicionar(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Servico",
      "adicionar",
      Nil,
      "POST",
      this.prefix + """tarefas/adicionar""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Servico_pesquisar5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tarefas/pesquisar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Servico_pesquisar5_invoker = createInvoker(
    Servico_2.pesquisar(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Servico",
      "pesquisar",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tarefas/pesquisar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:7
    case controllers_Servico_excluir1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Servico_excluir1_invoker.call(Servico_2.excluir(id))
      }
  
    // @LINE:8
    case controllers_Servico_atualizar2_route(params@_) =>
      call { 
        controllers_Servico_atualizar2_invoker.call(Servico_2.atualizar())
      }
  
    // @LINE:9
    case controllers_Servico_listar3_route(params@_) =>
      call { 
        controllers_Servico_listar3_invoker.call(Servico_2.listar())
      }
  
    // @LINE:10
    case controllers_Servico_adicionar4_route(params@_) =>
      call { 
        controllers_Servico_adicionar4_invoker.call(Servico_2.adicionar())
      }
  
    // @LINE:11
    case controllers_Servico_pesquisar5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Servico_pesquisar5_invoker.call(Servico_2.pesquisar(id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}

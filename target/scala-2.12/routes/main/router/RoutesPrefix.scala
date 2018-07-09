// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jcosta/eclipse-workspace/play-tarefas/conf/routes
// @DATE:Mon Jul 09 11:16:40 GMT-03:00 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

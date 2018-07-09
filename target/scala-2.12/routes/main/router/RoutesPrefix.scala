// @GENERATOR:play-routes-compiler
// @SOURCE:C:/wkp_play/tarefas/conf/routes
// @DATE:Mon Jul 09 08:44:25 GMT-03:00 2018


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

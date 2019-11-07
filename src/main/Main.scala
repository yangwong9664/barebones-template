package main

import com.google.inject.{Guice, Injector}
import main.module.GuiceModule
//import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {

  lazy val injector: Injector = Guice.createInjector(new GuiceModule)



}

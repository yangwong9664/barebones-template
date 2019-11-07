package main.app

import com.google.inject.Singleton
import com.typesafe.config.{Config, ConfigFactory}

@Singleton
class AppConfig {
  lazy val config: Config = ConfigFactory.load()

}

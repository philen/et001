package et001

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

object Main extends App {
  val config = new LwjglApplicationConfiguration
  config.title = "Engine Test 1"
  config.width = 800
  config.height = 600
  config.forceExit = true
  new LwjglApplication(new EngineTest1, config)
}
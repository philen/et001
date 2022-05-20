package et001

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

object Main extends App {
  val config = new LwjglApplicationConfiguration {
    title = "Engine Test 1"
    width = 800
    height = 600
    forceExit = true
  }
  new LwjglApplication(new EngineTest1, config)
}
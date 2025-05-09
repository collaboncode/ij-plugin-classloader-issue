package com.example.actions

import com.intellij.openapi.actionSystem._
import com.intellij.openapi.ui.Messages
import org.jetbrains.plugins.scala.extensions.withProgressSynchronously

import scala.util.Try

class HelloWithProgressIndicationAction extends AnAction("hello with progress indicator") {
  override def actionPerformed(e: AnActionEvent): Unit = {


    def fetchGreeting: Try[String] = Try {
      Thread.sleep(5000)
      "hello"
    }

    val tried = for {
      greeting <- withProgressSynchronously("fetch greeting")(fetchGreeting)
    } yield greeting

    val msg = tried.getOrElse("hey")

    Messages.showInfoMessage(msg, msg)
  }
}

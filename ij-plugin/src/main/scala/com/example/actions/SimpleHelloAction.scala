package com.example.actions

import com.intellij.openapi.actionSystem._
import com.intellij.openapi.ui.Messages
import org.jetbrains.plugins.scala.extensions.withProgressSynchronously

import scala.util.Try

class SimpleHelloAction extends AnAction("simple hello") {
  override def actionPerformed(e: AnActionEvent): Unit = {



    Messages.showInfoMessage("hello", "msg")
  }
}

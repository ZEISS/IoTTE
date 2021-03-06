package python.runner

import monix.eval.Task
import monix.execution.Scheduler
import python.pythonshell.PythonShell
import runners.MarshallingRunner



class PythonRunner[C]( implicit scheduler:Scheduler) extends MarshallingRunner[String,C ,String]{


  override def runInternal(inR: String, ctx: Option[C], definition: String): Task[String] = PythonShell.run(definition)
}

import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;
//###############################
class Alumno extends Persona{
  public String numBoleta;
  public float promedio;
  public TipoEstudiante estatus;
  public void comunicar(String medio){
    System.out.println("Comunicar desde alumno");
  }
  public float hacerExamen(String asignatura){
    return 0;
  }
  public void entegrarTarea(String materia){
    System.out.println("Entegrar tarea");
  }
}

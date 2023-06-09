//###############################
import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;
class PersonalApoyo extends Empleado{
  public String aDepartamento;
  public PersonalApoyo(String departamento, String nombre, int edad, char genero, float altura){
    super(nombre, edad, genero, altura, genero);
    this.aDepartamento = departamento;
    System.out.println("Ejecutando constructor PersonalApoyo()... de 6 parametros.");
  }
  public void efectuarEncomienda(String tarea){
    System.out.println("Ejecutando... efectuarEncomienda("+tarea+")... de PersonalApoyo.");
  }
  public void comunicar(String medio){
    System.out.println("Ejecutando... comunicar("+medio+")... al estilo de PersonalApoyo.");
  }
  public void reportarJefe(String informe){
    System.out.println("Ejecutando... reportarJefe("+informe+")... al estilo PersonalApoyo.");
  }
} 


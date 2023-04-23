import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;

//##############################
class AlumnoConsejero extends JefeGrupo implements Coordinador,Consejero{
  public String carrera;
  public int numAlumnos;
  public String negociarAcuerdos(){
    return "Negociando acuerdos";
  }
  public void organizar(String tipo, int dia, int mes){
    System.out.println(tipo);
    System.out.println(dia);
    System.out.println(mes);
  }
  public void convocarReunion(String texto){
    System.out.println(texto);
  }
  public void informar(String grupo){
    System.out.println("Informar");
  }
  public float cobrarEstimulo(float promedio){
    return 0;
  }
  public String representar(String mensaje){
    return "Something";
  }
}


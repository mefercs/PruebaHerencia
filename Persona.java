import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;
abstract class Persona{
  protected String nombre;
  private int edad; 
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  protected char genero;
  public float altura;
  public float comer(String platillo){ 
    float temp = 0.0f;
    System.out.println("Ejecutando... comer(" +platillo+"), de una persona.");
    return temp;
  }
  public float caminar(String destino){ 
    float temp = 0.0f;
    System.out.println("Ejecutando... caminar(" +destino+"), de una persona.");
    return temp;
  }
  abstract public void comunicar(String medio);
}



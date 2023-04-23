import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;
//###############################
abstract class Empleado extends Persona{
  protected double sueldo;
  public Date altaContrato; 
  public static int id;
  public Empleado(String nombre, int edad, char genero, float altura, int sueldo) {
    super.nombre = nombre;
    super.genero = genero;
    super.altura = altura;
    super.setEdad(edad);
    id++;
    this.sueldo = sueldo;
    System.out.println("Ejecutando el constructor de Empleado de un parametro");
    Scanner leer = new Scanner(System.in);
    System.out.println("Capturando la fecah de alta del empleado..\nTecla dia:");
    int dia = leer.nextInt();
    System.out.println("Teclea mes: ");
    int mes = leer.nextInt();
    System.out.println("Teclea anio: ");
    int anio = leer.nextInt();
    GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
  }
  public double dameSueldo(){
    System.out.println("Ejecutando dameSueldo()... de Empleado");
    return this.sueldo;
  }
  public float subeSueldo(float porcentaje ){
    System.out.println("Ejecutando subeSueldo()... de Empleado");
    float aumento = (float)sueldo*porcentaje/100; 
    return (float)(sueldo+=aumento);
  }
  abstract public void reportarJefe(String informe);
}



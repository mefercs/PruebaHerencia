import java.beans.PropertyChangeEvent;
import java.lang.invoke.ConstantBootstraps;
import java.net.NoRouteToHostException;
import java.rmi.StubNotFoundException;
import java.sql.Date;
import java.time.temporal.Temporal;
import java.util.GregorianCalendar;
import java.util.Scanner;

//###############################
class prueba_herencia_cabstractae_interfaces{
  public static void main(String[] args) {
 
    System.out.println("\n\n########################################################################");
    System.out.println("PROBANDO CLASE Personalapoyo");
    System.out.println("########################################################################");
    PersonalApoyo srGodinez = new PersonalApoyo("Informatica", "Manuel Godines", 29, 'M',1.68f);
    System.out.println("\nProbando atributos y metodos heredados de persona para el srGodinez");
    System.out.println("Atributos: nombre="+srGodinez.nombre);
    System.out.println("Atributo: genero="+srGodinez.genero);
    System.out.println("Atributo: altura="+ srGodinez.altura);
    float tempoReal = srGodinez.comer("Mole poblano");
    System.out.println("El metodo comer(), regreso: "+ tempoReal);
    tempoReal = srGodinez.subeSueldo(10);
    System.out.println("El metodo subeSueldo(), regreso: " + tempoReal);
    System.out.println("\nProbando atributos y metodos definidos dentro de PersonalApoyo para el srGodinez.");
    System.out.println("Atributo: departamento="+ srGodinez.aDepartamento);
    srGodinez.efectuarEncomienda("Redactar oficio para asistir a conferencia de TATA.");

    System.out.println("\n\n########################################################################");
    System.out.println("PROBANDO CLASE Docente");
    System.out.println("########################################################################");
    Docente profPuga = new Docente("Matematicas",8,"Miguel Puga",38,'M',168,6000);
    System.out.println("\nProbando atributos y metodos heredados de Persona para el profPuga.");
    System.out.println("Atributos: nombre="+profPuga.nombre);
    System.out.println("Atributos: genero="+profPuga.genero);
    System.out.println("Atributos: altura="+profPuga.altura);
    float temporal = profPuga.comer("Cucaracha veracruzana");
    System.out.println("El metodo comer(), regreso: " + temporal);
    profPuga.comunicar("Servicio de hotmail.");
    System.out.println("\nProbando atributos y metodos heredados de empleado para el profPuga");
    System.out.println("Atributo sueldo=" +profPuga.sueldo);
    System.out.println("Atributo altaContrato="+ profPuga.altaContrato);
    System.out.println("Atributo id="+ Docente.id);
    profPuga.reportarJefe("Informe sobre el numero de quejas");
    double tempoDoble = profPuga.dameSueldo();
    System.out.println("El metodo dameSueldo(), regreso " + tempoDoble);
    temporal = profPuga.subeSueldo(5);
    System.out.println("El metedo subeSueldo(), regreso:"+temporal);
    System.out.println("\nProbando atributos y metodos definidos dentro de PersonalApoyo para el profPuga");
    System.out.println("Atributo: aAcademia="+profPuga.aAcademia);
    System.out.println("Atributo: nGrupos="+ profPuga.nGrupos);
    tempoReal = profPuga.evaluarGrupo("Matematicas discretas");
    System.out.println("El metodo evaluarGrupo(), regreso: "+ tempoReal);

    System.out.println("\n\n########################################################################");
    System.out.println("PROBANDO CLASE JefaturaDepartamento");
    System.out.println("########################################################################");
    JefaturaDepartamento jefe = new JefaturaDepartamento(1000,"Matematicas",5,"Miguel prueba",38,'M',178,100000);
    System.out.println("\nProbando atributos y metodos heredados de persona para jefe");
    System.out.println("Atributos: nombre="+jefe.nombre);
    System.out.println("Atributos: genero="+jefe.genero);
    System.out.println("Atributos: altura="+ jefe.altura);
    tempoReal = jefe.comer("Pizza");
    System.out.println("El metodo comer(), regreso: "+tempoReal);
    tempoReal = jefe.caminar("caminando hacia upiitaaaaaaaaaa.");
    jefe.comunicar("La junta será en zacatenco");
    System.out.println("\nProbando atribustos y metodos heredados de Empleado para Jefe");
    System.out.println("Atributos: sueldo=" + jefe.sueldo);
    System.out.println("Atributos: altaContrato=" + jefe.altaContrato);
    jefe.reportarJefe("Informe de gobierno");
    double tempoDoble1 = jefe.dameSueldo();
    System.out.println("El metodo dameSueldo(), regreso: " + tempoDoble1);
    double tempoReal2= jefe.dameSueldo();
    System.out.println("El metodo dameSueldo(), regreso: "+ tempoReal2);
    System.out.println("\nProbando atributos y metodo definido dentro de Docente para el jefe");
    System.out.println("Atributos: aAcademia:" + jefe.aAcademia);
    System.out.println("Atributo: nGrupos: "+ jefe.nGrupos);
    tempoReal = jefe.evaluarGrupo("Matematicas discretas");
    System.out.println("El metodo evaluarGrupo(), regreso: " + tempoReal);
    System.out.println("\nProbando atributos ymetodo definidos dentro de JefaturaDepartamento para jefe");
    System.out.println("Atributo: aAcademia: "+ jefe.aAcademia);
    jefe.revisarReporte();
    tempoDoble = jefe.establecerIncentivo(400);
    System.out.println("El metodo establecerIncentivo(), regreso:"+ tempoDoble);
    System.out.println("\nProbando atributos y metodo definidos dentro de la interface Consejero para el jefe");
    System.out.println("Atributos: UN_COMITE:" +JefaturaDepartamento.UN_COMITE);
    String texto = jefe.representar("Texto generico, porque  no se logra apreciar en las imagenes.");
    System.out.println("El metodo representar(), regerso: "+ texto);
    jefe.informar("Nada esta funcionando, debemos replantear el sistema educativo.");
    tempoReal = jefe.cobrarEstimulo(8);
    System.out.println("El metodo cobrarEstimulo(), regreso: "+ tempoReal);
    System.out.println("\nPaobando atributos y metodos definidos dentro de la interface Coordinador para el jefe");
    System.out.println("Atributos: AREA: "+ Coordinador.AREA);
    jefe.organizar("Entrega de examen", 24, 5);
    jefe.convocarReunion("Reunion de consejo estudiantil.");
    System.out.println("\nProbando atributos y metodos definidos de JefaturaDepartamento para el jefe");
    System.out.println("Atributo: incentivo"+ jefe.incentivo);
    jefe.revisarReporte();
    tempoDoble = jefe.establecerIncentivo(50);
    System.out.println("El metodo establecerIncentivo(), regreso" + tempoDoble);
  }
}




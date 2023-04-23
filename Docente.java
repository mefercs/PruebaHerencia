//###############################
class Docente extends Empleado{
  public String aAcademia;
  public int nGrupos;
  public Docente(String aAcademia, int nGrupos, String nombre,int edad,char genero,float altura, int sueldo){
//String,int,String,int,char,float,int
    super(nombre,edad, genero,altura,sueldo);
    this.aAcademia = aAcademia;
    this.nGrupos = nGrupos;
    System.out.println("Ejecutando constructor Docente()... de 7 parametros.");
  }
  public float evaluarGrupo(String asignatura){
    System.out.println("Ejecutando... evaluarGrupo("+ asignatura+" de Docente ¡¡¡Mas interesante!!!)");
    return 10.5f;
  }
  public void comunicar(String medio){ 
    System.out.println("Ejecutando... comunicar("+medio+")... al estilo de Docente ¡¡¡Mas interesante!!!");
    System.out.println("Mantiene la firma de comunicar(), pero ahora lo puedo implementar de manera diferente.");
  }
  public void reportarJefe(String informe){
    System.out.println("Ejecutando... reportarJefe("+informe+"), pero ahora lo puede implementar de manera diferente.");
  }
}


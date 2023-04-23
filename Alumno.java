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

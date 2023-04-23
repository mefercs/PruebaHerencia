//###############################
class JefaturaDepartamento extends Docente implements Consejero{
  public double incentivo;
  public JefaturaDepartamento(int incentivo, String aAcademia, int nGrupos, String nombre, int edad, char genero, float altura, int sueldo){
    super(aAcademia, nGrupos, nombre, edad, genero, altura, sueldo);
    System.out.println("Ejecutando el constructor de la clase JefaturaDepartamento");
    this.incentivo = incentivo;
  }
  public void revisarReporte(){
    System.out.println("Ejecutando... revisarReporte(), desde la clase JefaturaDepartamento.");
  }
  public void comunicar(String medio){
    System.out.println("Comunicar desde Jefatura departamento.");
  }
  public double establecerIncentivo(double motivo){ 
    double tempD = 5.0;
    System.out.println("Ejecutando... establecerIncentivo("+motivo+")... desde la clase JefaturaDepartamento");
    return tempD;
  };
  public void reportarJefe(String informe){
    System.out.println("Reporte desde Jefatura De partamento");
  }
  public String representar(String mensaje){
    String textoTemp = ""; 
    System.out.println("Ejecutando... representar("+mensaje+")... desde la JefaturaDepartamento");
    return textoTemp;
  }
  public void informar(String grupo){
    System.out.println("Ejecutando... informar("+grupo+")... desde JefaturaDepartamento");
  }
  public float cobrarEstimulo(float promedio){
    float tempReal = 0f;
    System.out.println("Ejecutando... cobrarEstimulo("+promedio+")... desde JefaturaDepartamento");
    return tempReal;
  }
  public void organizar(String tipo, int dia, int mes){ 
  System.out.println("Ejecutando... organizar("+tipo+ " "+dia+" "+mes +")... desde la JefaturaDepartamento");
  }
  public void convocarReunion(String texto){
    System.out.println("Ejecutando... convocarReunion("+texto+")... desde JefaturaDepartamento");
  }
}



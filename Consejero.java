//###############################
interface Consejero{
  public Comite UN_COMITE = Comite.REGLAMENTOS;
  public String representar(String mensaje);
  public void informar(String grupo);
  public float cobrarEstimulo(float promedio);
}

package tema5.metodosStatic;

import java.util.Objects;

public class CuentaBancaria {

    //Propiedad Static
    private static Integer totalCuentas = 0;
    private static Double tasaInteres = 0.03; //Aplicar a todas las cuentas
    private static final String nombreBanco = "Banco Cuevas Antas - BCA";

    //Propiedades no static
    private String idCuenta;
    private Double saldo;
    private String titular;

    //Constructores

    public CuentaBancaria(Double saldo, String titular) {
        CuentaBancaria.totalCuentas++; //Al crear un objeto se incrementa
        this.idCuenta = CuentaBancaria.generarNumeroCuenta();
        this.saldo = saldo;
        this.titular = titular;
    }

    public CuentaBancaria(String titular) {
        CuentaBancaria.totalCuentas++;
        this.idCuenta = CuentaBancaria.generarNumeroCuenta();
        this.titular = titular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(CuentaBancaria otra){
        CuentaBancaria.totalCuentas++;
        idCuenta = otra.idCuenta;
        saldo = otra.saldo;
        titular = otra.titular;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaBancaria{");
        sb.append("idCuenta=").append(idCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", titular='").append(titular).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(idCuenta, that.idCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCuenta);
    }

    //Metodos Static

    /**
     * Metodo privado para generar el nuemero de cuenta en los constructores
     * @return
     */
    private static String generarNumeroCuenta(){
        return CuentaBancaria.nombreBanco + "-" + String.format("%06d",CuentaBancaria.totalCuentas);
    }

    //Metodos no static

    /**
     * Incrementa el saldo de la cuenta, si la cantidad es positiva
     * @param canidad
     * @return true si la cantidad es positiva, false en caso contrario
     */
    public boolean depositar (Double canidad){
        if (canidad>0) {
            this.saldo += canidad;
            return true;
        }
        return false;
    }

    public static Integer getTotalCuentas(){
        return CuentaBancaria.totalCuentas;
    }

    /**
     * Decrementa el saldo
     * @param cantidad
     * @return true si se puede retirar, false en caso contrario
     */
    public boolean retirar(Double cantidad) {
        if (cantidad <= this.saldo && cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }


}

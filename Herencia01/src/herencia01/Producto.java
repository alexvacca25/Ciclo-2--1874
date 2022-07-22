/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia01;

/**
 *
 * @author ALEX
 */
public class Producto {
    private int codigo;
    private String descripcion;
    protected double precioCompra;
    private double precioVenta;
    private int cantBodega;
    private int cantMinReq;
    private int cantMaxPer;
    private String Tipo;
    private double porcentaje;

           

    public Producto(int codigo, String descripcion, double precioCompra, double precioVenta, int cantBodega, int cantMinReq, int cantMaxPer, double porcentaje) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantBodega = cantBodega;
        this.cantMinReq = cantMinReq;
        this.cantMaxPer = cantMaxPer;
        this.porcentaje = porcentaje;
    }
    
    //Metodo para solicitar al provedor
    public boolean solicitar(){
        return cantBodega<=cantMinReq;
    }
    
    public double totalApagar(int unidCompra){
        return precioCompra*unidCompra;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public int getCantMinReq() {
        return cantMinReq;
    }

    public void setCantMinReq(int cantMinReq) {
        this.cantMinReq = cantMinReq;
    }

    public int getCantMaxPer() {
        return cantMaxPer;
    }

    public void setCantMaxPer(int cantMaxPer) {
        this.cantMaxPer = cantMaxPer;
    }
    
    
    
}




/*
Atributos:

● Código.

● Descripción.

● Precio de compra.

● Precio de venta.

● Cantidad en bodega.

● Cantidad mínima requerida en bodega.

● Cantidad máxima de inventario permitida.

● Porcentaje de Descuento.

Métodos:

● Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.

● Calcular total a pagar: devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades de compra.
*/
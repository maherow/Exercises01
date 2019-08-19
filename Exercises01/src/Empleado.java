package clase_empleado;
import java.util.ArrayList;
import java.util.Date;

public class Empleado {

    //Declaro Variables de clase:

    private String nombre, apellido;
    static short edad;
    private Date fecha_alta;
    private Date fecha_baja;
    long sueldo_base;
    boolean alta=false;


    //Constructor

    Empleado(String nombre, String apellido, short edad, Date fecha_alta, Date fecha_baja, long sueldo_base){
       this.nombre=nombre;
       this.apellido=apellido;
       this.edad=edad;
       this.fecha_alta=fecha_alta;
       this.fecha_baja=fecha_baja;
       this.sueldo_base=sueldo_base;
       this.alta=true;

    }

    //Setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setEdad(short edad){
        this.edad= edad;
    }

    public void setFecha_alta(Date fecha_alta){
        this.fecha_alta = fecha_alta;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public void setSueldo_base(long sueldo_base){
        this.sueldo_base = sueldo_base;
    }

    //Getters:

    public String getNombre(){
       return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public Date getFecha_alta(){
        return fecha_alta;
    }

    public Date getFecha_baja(){
        return fecha_baja;
    }

    public long getSueldo_base(){
        return sueldo_base;
    }

    //Procedimientos:

    public String darBaja(){
        if(alta==false){return "Empleado ya dado de baja";}
        else{return "Empleado dado de baja";}

            }
    public String dimeDiasTrabajados(){

    }

}


package Modelo;
import Vista.Ventana;
import java.util.ArrayList;

public class CuerposDeAgua extends ObjetoGeografico{
    private String nombre;
    private int id;
    private String municipio;
    private float irca;
    private Vista.Ventana v;
    
    public CuerposDeAgua(int id, String nombre, String municipio, String tipoCuerpo, String tipoAgua, float irca) {
        super(tipoCuerpo,tipoAgua);
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.irca = irca;    
    } 

    public CuerposDeAgua() {
        super();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }
 
    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }   
    public String NivelR(float val)
    {
        String nivelRiesgo;
         if (val >= 0 && val <= 5)
            nivelRiesgo = "SIN RIESGO";
        else if (val >5 && val <= 14)
            nivelRiesgo = "BAJO";
        else if (val >14 && val <= 35)
            nivelRiesgo = "MEDIO";
        else if (val > 35 && val <= 80)
            nivelRiesgo = "ALTO";
        else 
            nivelRiesgo = "INVIABLE SANITARIAMENTE";  
        return nivelRiesgo;
    }
    public int ContadorNivel(ArrayList <CuerposDeAgua> C)
    {
        int contNivel = 0;
        for(int i = 0; i<C.size();i++)
        {
            if (C.get(i).getIrca()<= 35)
                contNivel +=1;   
        }
        return contNivel;
       
    }
    
    
    
}

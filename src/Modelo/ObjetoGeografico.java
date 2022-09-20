package Modelo;

public class ObjetoGeografico {
    
    public String tipoCuerpo;
    public String tipoAgua;
    
    public ObjetoGeografico(String tipoCuerpo,String tipoAgua){
        this.tipoCuerpo = tipoCuerpo;
        this.tipoAgua = tipoAgua;
    }

    public ObjetoGeografico() {
    }
    
    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}

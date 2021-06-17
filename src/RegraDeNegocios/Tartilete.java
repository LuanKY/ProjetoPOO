package RegraDeNegocios;
public class Tartilete extends Doce{
    private String sabor;
    private char tamanho;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void VenderDoce() {
        
    }
}

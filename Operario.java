public class Operario extends Empregado{
    
    private double valorProducao;
    private double comissao;


    
    public double getValorProducao() {
        return valorProducao;
    }



    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }



    public double getComissao() {
        return comissao;
    }



    public void setComissao(double comissao) {
        this.comissao = comissao;
    }



    public double calcularSalario(double comissao){

        double salarioLiquido=calcularSalario()+valorProducao*comissao;
         return salarioLiquido;
    }

}

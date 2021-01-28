import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orcamento {
    public LocalDateTime data;
    public BigDecimal valor;
    public String descricao;
    public TipoTransacao tipo;

    public Orcamento(LocalDateTime dt, BigDecimal valor, String desc, TipoTransacao tipo2) {
        this.data = dt;
        this.valor = valor;
        this.descricao = desc;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "data=" + data + ", valor=" + valor + ", descricao=" + descricao + ", tipo=" + tipo;
    }


}
public enum TipoDiseniador {
    GRAFICO ("Gráfico"), WEB ("Web");
    private String valor;

    TipoDiseniador(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
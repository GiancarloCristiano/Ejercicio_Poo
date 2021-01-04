public enum LenguajeProgramacion extends Programador {
    PHP ("PHP"), NET ("NET"), PYTHON ("Python");
    private String valor;

    LenguajeProgramacion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
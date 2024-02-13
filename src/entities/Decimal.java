package entities;

public class Decimal extends Numero {
    public Decimal(Integer valor) {
        super(valor);
    }

    @Override
    public Integer converterParaOutroFormato() {

        //Cria uma string vazia que servira para construir a representação binario do valor
        StringBuilder binario = new StringBuilder();

        while(valor > 0) {

            //Armazena o resto da divisao do valor por 2 na variavel resto
            int resto = valor % 2;

            //Insere o resto no indice zero da string binario
            binario.insert(0, resto);

            //Divide o valor por 2 e armazena nela mesma o resultado
            valor /= 2;
        }

        //Transforma a string binario construida para inteiro
        return Integer.parseInt(binario.toString());
    }
}

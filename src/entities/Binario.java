package entities;

public class Binario extends Numero {
    public Binario(Integer valor) {
        super(valor);
    }

    @Override
    public Integer converterParaOutroFormato() {

        //Transforma o valor em String
        String numeroString = String.valueOf(valor);
        int numeroDecimal = 0;
        for(int i = 0; i < numeroString.length(); i++) {

            //Transforma cada caractere de numeroString em inteiro
            int digito = numeroString.charAt(i) - '0';

            //Adiciona ao número decimal o valor do dígito binário na posição 'i'
            // multiplicado pela potência de 2 correspondente.
            numeroDecimal += (int) (digito * Math.pow(2, numeroString.length() - 1 - i));
        }
        return numeroDecimal;
    }
}

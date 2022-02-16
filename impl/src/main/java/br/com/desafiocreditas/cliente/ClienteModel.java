package br.com.desafiocreditas.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModel {
    private String cpf;
    private String nome;
    private int idade;
    private String localizacao;
    private BigDecimal salario;

    public boolean ehDeSaoPaulo() {
        return this.localizacao.toLowerCase().equals("sp");
    }

    public boolean salarioMenorIgual(int valor) {
        return this.salario.compareTo(new BigDecimal(valor)) <= 0;
    }
    public boolean salarioMenorQue(int valor) {
        return this.salario.compareTo(new BigDecimal(valor)) < 0;
    }
    public boolean idadeMenorDoQue(int limite) {
        return this.idade < limite;
    }

    public boolean salarioMaiorQue(int limite) {
        return this.salario.compareTo(new BigDecimal(limite)) > 0;
    }

    public boolean salarioMaiorOuIqualA(int limite) {
        return this.salario.compareTo(new BigDecimal(limite)) >= 0;
    }
    public boolean idadeMaiorQue(int limite) {
        return this.idade > limite;
    }

}

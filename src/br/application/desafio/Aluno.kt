package br.application.desafio

class Aluno(var nome: String, var sobrenome: String, var codigoAluno: Int) {

    override fun equals(other: Any?): Boolean { return other is Aluno && codigoAluno == other.codigoAluno }

    override fun toString(): String { return "Nome: $nome || Sobrenome: $sobrenome || Código: $codigoAluno"   }

    override fun hashCode(): Int { return codigoAluno }

}

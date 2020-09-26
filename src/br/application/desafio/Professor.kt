package br.application.desafio

class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean { return other is Professor && codigoProfessor == other.codigoProfessor }

    override fun toString(): String { return "Nome: $nome || Sobrenome: $sobrenome || Tempo de casa: $tempoDeCasa || Código: $codigoProfessor"   }

    override fun hashCode(): Int { return codigoProfessor }

}

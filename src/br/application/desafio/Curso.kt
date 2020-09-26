package br.application.desafio

class Curso(var nome: String, var codigoCurso: Int) {

    override fun equals(other: Any?): Boolean { return other is Curso && codigoCurso == other.codigoCurso }

    override fun toString(): String { return "Nome: $nome || Código: $codigoCurso"  }

}

package br.application.desafio

abstract class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean { return other is Professor && codigoProfessor == other.codigoProfessor }

    override fun hashCode(): Int { return codigoProfessor }

    abstract override fun toString(): String

}

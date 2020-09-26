package br.application.desafio

class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var especialidade: String): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    override fun toString(): String { return "Nome: $nome || Sobrenome: $sobrenome || Tempo de casa: $tempoDeCasa || Especialidade: $especialidade || Código: $codigoProfessor"   }
}

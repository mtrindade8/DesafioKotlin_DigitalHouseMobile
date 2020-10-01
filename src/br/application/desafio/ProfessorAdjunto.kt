package br.application.desafio

class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var qdtHorasMonitoria: Int): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    override fun toString(): String { return "Nome: $nome || Sobrenome: $sobrenome || Tempo de casa: $tempoDeCasa || Horas de monitoria: $qdtHorasMonitoria || Código: $codigoProfessor"   }
}

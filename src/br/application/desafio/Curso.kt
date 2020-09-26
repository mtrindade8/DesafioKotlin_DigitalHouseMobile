package br.application.desafio

class Curso(var nome: String, var codigoCurso: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, var qdtMaxAlunos: Int, var alunos: MutableList<Aluno>) {

    override fun equals(other: Any?): Boolean { return other is Curso && codigoCurso == other.codigoCurso }

    override fun toString(): String {

        var string = "Nome: $nome || Código: $codigoCurso || Professor Titular: $professorTitular || Professor Adjunto: $professorAdjunto \n Alunos da Turma: \n"
        alunos.forEach(){string += it.toString() + "\n"}
        return string
    }

    override fun hashCode(): Int { return codigoCurso }

}

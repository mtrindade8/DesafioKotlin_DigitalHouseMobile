package br.application.desafio

class Curso(var nome: String, var codigoCurso: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, var qdtMaxAlunos: Int) {

    lateinit var alunos: MutableMap<Int, Aluno>

    override fun equals(other: Any?): Boolean { return other is Curso && codigoCurso == other.codigoCurso }

    override fun toString(): String {

        var string = "Curso: $nome || Código: $codigoCurso || Professor Titular: ${professorTitular.nome+" "+professorTitular.sobrenome}  || Professor Adjunto: ${professorAdjunto.nome+" "+professorAdjunto.sobrenome} \nAlunos da Turma: \n"
        alunos.forEach(){string += "\t" + it.value.toString() + "\n"}
        return string
    }

    override fun hashCode(): Int { return codigoCurso }

    fun adicionarUmAluno(umAluno: Aluno):Boolean{

        when {
            alunos.count() < qdtMaxAlunos -> {
                alunos.put(umAluno.hashCode(), umAluno)
                return true
            }
            else -> return false
        }
    }

    fun excluirAluno(umAluno: Aluno):Boolean{

        when {
            alunos.containsKey(umAluno.hashCode()) -> {
                alunos.remove(umAluno.hashCode())
                return true
            }
            else -> return false
        }
    }

}

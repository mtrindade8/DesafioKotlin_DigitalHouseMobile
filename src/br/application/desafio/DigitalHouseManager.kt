package br.application.desafio

class DigitalHouseManager{

     val listaAlunos: MutableMap<Int, Aluno> = mutableMapOf()
     val listaProfessores: MutableMap<Int, Professor> = mutableMapOf()
     val listaCursos: MutableMap<Int, Curso> = mutableMapOf()
     val listaMatriculas: MutableSet<Matricula> = mutableSetOf()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaxAlunos: Int){
        listaCursos.put(codigoCurso, Curso(nome, codigoCurso, quantidadeMaxAlunos) )
    }

    fun excluirCurso(codigoCurso: Int): Boolean{
        when {
            listaCursos.containsKey(codigoCurso) -> {
                listaCursos.remove(codigoCurso)
                return true
            }
            else -> return false
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        listaProfessores.put(codigoProfessor, ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        listaProfessores.put(codigoProfessor, ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int): Boolean {
        when {
            listaProfessores.containsKey(codigoProfessor) -> {
                listaProfessores.remove(codigoProfessor)
                return true
            }
            else -> return false
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        listaAlunos.put(codigoAluno, Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        try {

            when {
                listaAlunos.containsKey(codigoAluno) && listaCursos.containsKey(codigoCurso) -> {

                    val aluno = (listaAlunos[codigoAluno] as Aluno)
                    val curso = (listaCursos[codigoCurso] as Curso)

                    when {
                        curso.adicionarUmAluno(aluno) -> {
                            listaMatriculas.add(Matricula(aluno, curso))
                            println("Matrícula realizada!")
                        }
                        else -> println("Não foi possível realizar a matrícula porque não há vagas")
                    }
                }
                else -> println("Erro: Curso ou Aluno inexistente(s)")
            }
        }  catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){

        try {

            when {listaCursos.containsKey(codigoCurso) && listaProfessores.containsKey(codigoProfessorTitular) && listaProfessores.containsKey(codigoProfessorAdjunto) -> {

                val curso = listaCursos[codigoCurso]!!
                val professorTitular   = (listaProfessores[codigoProfessorTitular] as ProfessorTitular)
                val professorAdjunto  = (listaProfessores[codigoProfessorAdjunto] as ProfessorAdjunto)

                curso.professorAdjunto = professorAdjunto
                curso.professorTitular = professorTitular

                println("Professores adicionados ao curso")

                }
                else -> println("Erro: Curso ou Professor(es) inexistente(s)")
            }
        }  catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

package br.application.desafio

fun main(){

    val dhManager = DigitalHouseManager()

    dhManager.registrarProfessorTitular("Walter", "Matheus", 1010, "Arquitetura Computacional")
    dhManager.registrarProfessorTitular("Evandro", "Luquini", 1119, "Programação Assíncrona")
    dhManager.registrarProfessorAdjunto("Andrea", "Machion", 1234, 4)
    dhManager.registrarProfessorAdjunto("Danilo", "Ribeiro", 1319, 2)

    dhManager.registrarCurso("Full Stack", 20001, 3)
    dhManager.registrarCurso("Android", 20002, 2)

    dhManager.alocarProfessores(20001, 1010, 1234)
    dhManager.alocarProfessores(20002, 1119, 1319)

    dhManager.matricularAluno("George", "Orwell", 1)
    dhManager.matricularAluno("Ludwig", "Beethoven", 2)
    dhManager.matricularAluno("Antonio", "Vivaldi", 3)
    dhManager.matricularAluno("Leonardo", "DaVinci", 4)
    dhManager.matricularAluno("Galileu", "Galilei", 5)

    dhManager.matricularAluno(1, 20001)
    dhManager.matricularAluno(2, 20001)

    dhManager.matricularAluno(3, 20002)
    dhManager.matricularAluno(4, 20002)
    dhManager.matricularAluno(5, 20002)

}

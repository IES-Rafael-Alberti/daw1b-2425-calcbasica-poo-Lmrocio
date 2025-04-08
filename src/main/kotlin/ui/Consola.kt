package ui

import java.util.*

class Consola : IEntradaSalida{

    companion object{
        val scanner = Scanner(System.`in`)

    }


    override fun mostrarMsj(msj: String) {
        TODO("Not yet implemented")
    }

    override fun mostrarError(msj: String) {
        TODO("Not yet implemented")
    }

    override fun pedirDouble(msj: String): Double {
        TODO("Not yet implemented")
    }

    override fun pedirOperador(msj: String): String {
        TODO("Not yet implemented")
    }

    override fun preguntar(msj: String): Boolean {
        TODO("Not yet implemented")
    }


}
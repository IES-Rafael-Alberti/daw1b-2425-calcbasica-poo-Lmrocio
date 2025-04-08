package ui

interface IEntradaSalida {

    fun mostrarMsj(msj: String)

    fun mostrarError(msj: String)

    fun pedirDouble(msj: String) : Double

    fun pedirOperador(msj: String) : String

    fun preguntar(msj: String) : Boolean

}
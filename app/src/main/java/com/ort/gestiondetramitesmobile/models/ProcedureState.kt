package com.ort.gestiondetramitesmobile.models

sealed class ProcedureState(val title: String) {

    class PENDIENTE_DE_ANALISIS() : ProcedureState("Pendiente de analisis")
    class EN_PROCESO_DE_ANALISIS() : ProcedureState("En proceso de analisis")
    class ASIGNADO_A_RESPONSABLE() : ProcedureState("Asignado a responsable")
    class PENDIENTE_DE_RETIRO() : ProcedureState("Pendiente de retiro")
    class ESTADO_FINALIZADO() : ProcedureState("Finalizado")


}

fun getProcedureStates(): MutableList<ProcedureState> {

    return mutableListOf(ProcedureState.PENDIENTE_DE_ANALISIS(),
            ProcedureState.EN_PROCESO_DE_ANALISIS(),
            ProcedureState.ASIGNADO_A_RESPONSABLE(),
            ProcedureState.PENDIENTE_DE_RETIRO(),
            ProcedureState.ESTADO_FINALIZADO())
}

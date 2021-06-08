package id.ac.unhas.infocovid19.model

data class DataProvinsi(
    val data: List<Provinsi?>?
){
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach{
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class Provinsi(
    val provinsi: String?,
    val kasus: Int?,
    val dirawat: Int?,
    val sembuh: Int?,
    val meninggal: Int?,
    val positif: Int?
){
    override fun toString(): String {
        return "Provinsi ${this.provinsi}[kode: ${this.provinsi}, #positif: ${this.kasus}, #meninggal: ${this.meninggal}, #sembuh:${this.sembuh}]"
    }
}
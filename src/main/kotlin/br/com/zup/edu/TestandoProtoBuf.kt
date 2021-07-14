package br.com.zup.edu

fun main(){
    val request = FuncionarioRequest.newBuilder()
        .setNome("Jhony Rodrigues")
        .setCpf("11111111111")
        .setSalario(2500.0)
        .setAtivo(true)
        .setCargo(Cargo.GERENTE)
        .addEnderecos(
            FuncionarioRequest.Endereco.newBuilder()
                .setLogradouro("Rua Rui Barbosa")
                .setCep("11111-111")
                .setComplemento("Térreo")
                .build().toString()
        )
        .build()

    println(request)
}